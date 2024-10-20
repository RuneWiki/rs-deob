package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ag")
public class class33 {

    @ObfuscatedName("ag.w")
    public static int[] field703 = new int[5];

    @ObfuscatedName("ag.c")
    public static int[][] field704 = new int[5][5000];

    @ObfuscatedName("ag.x")
    public static int[] field716 = new int[1000];

    @ObfuscatedName("ag.f")
    public static String[] field706 = new String[1000];

    @ObfuscatedName("ag.t")
    public static int field707 = 0;

    @ObfuscatedName("ag.n")
    public static class13[] field708 = new class13[50];

    @ObfuscatedName("ag.o")
    public static Calendar field710 = Calendar.getInstance();

    @ObfuscatedName("ag.b")
    public static final String[] field712 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.l(Ll;I)V")
    public static void method2560(class1 arg0) {
        method2613(arg0, 200000);
    }

    @ObfuscatedName("en.y(Ll;II)V")
    public static void method2613(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method1997(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field517;
        int[] var9 = var4.field518;
        byte var10 = -1;
        field707 = 0;
        try {
            Statics.field701 = new int[var4.field520];
            int var11 = 0;
            Statics.field714 = new String[var4.field523];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2524;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field16;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2525;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2524;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2525;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field6;
                    }
                    Statics.field701[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field714[var12++] = var15;
                }
            }
            int var16 = 0;
            label3137: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var533 = var8[var7];
                if (var533 < 100) {
                    if (var533 == 0) {
                        field716[var5++] = var9[var7];
                        continue;
                    }
                    if (var533 == 1) {
                        int var17 = var9[var7];
                        field716[var5++] = class157.field2655[var17];
                        continue;
                    }
                    if (var533 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class157.field2655[var18] = field716[var5];
                        client.method2718(var18);
                        continue;
                    }
                    if (var533 == 3) {
                        field706[var6++] = var4.field519[var7];
                        continue;
                    }
                    if (var533 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var533 == 7) {
                        var5 -= 2;
                        if (field716[var5 + 1] != field716[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var533 == 8) {
                        var5 -= 2;
                        if (field716[var5 + 1] == field716[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var533 == 9) {
                        var5 -= 2;
                        if (field716[var5] < field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var533 == 10) {
                        var5 -= 2;
                        if (field716[var5] > field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var533 == 21) {
                        if (field707 == 0) {
                            return;
                        }
                        class13 var19 = field708[--field707];
                        var4 = var19.field178;
                        var8 = var4.field517;
                        var9 = var4.field518;
                        var7 = var19.field174;
                        Statics.field701 = var19.field175;
                        Statics.field714 = var19.field173;
                        continue;
                    }
                    if (var533 == 25) {
                        int var20 = var9[var7];
                        field716[var5++] = class157.method3208(var20);
                        continue;
                    }
                    if (var533 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field716[var5];
                        class43 var23 = (class43) class43.field976.method3225((long) var21);
                        class43 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field977.method2752(14, var21);
                            class43 var26 = new class43();
                            if (var25 != null) {
                                var26.method827(new class108(var25));
                            }
                            class43.field976.method3211(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field974;
                        int var29 = var24.field979;
                        int var30 = var24.field978;
                        int var31 = class157.field2656[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class157.field2655[var28] = class157.field2655[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var533 == 31) {
                        var5 -= 2;
                        if (field716[var5] <= field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var533 == 32) {
                        var5 -= 2;
                        if (field716[var5] >= field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var533 == 33) {
                        field716[var5++] = Statics.field701[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var533 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field701[var10001] = field716[var5];
                        continue;
                    }
                    if (var533 == 35) {
                        field706[var6++] = Statics.field714[var9[var7]];
                        continue;
                    }
                    if (var533 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field714[var10001] = field706[var6];
                        continue;
                    }
                    if (var533 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class211.method1892(field706, var6, var33);
                        field706[var6++] = var34;
                        continue;
                    }
                    if (var533 == 38) {
                        var5--;
                        continue;
                    }
                    if (var533 == 39) {
                        var6--;
                        continue;
                    }
                    if (var533 == 40) {
                        int var35 = var9[var7];
                        class19 var36 = class19.method1997(var35);
                        int[] var37 = new int[var36.field520];
                        String[] var38 = new String[var36.field523];
                        for (int var39 = 0; var39 < var36.field522; var39++) {
                            var37[var39] = field716[var5 - var36.field522 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field527; var40++) {
                            var38[var40] = field706[var6 - var36.field527 + var40];
                        }
                        var5 -= var36.field522;
                        var6 -= var36.field527;
                        class13 var41 = new class13();
                        var41.field178 = var4;
                        var41.field174 = var7;
                        var41.field175 = Statics.field701;
                        var41.field173 = Statics.field714;
                        field708[++field707 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field517;
                        var9 = var36.field518;
                        var7 = -1;
                        Statics.field701 = var37;
                        Statics.field714 = var38;
                        continue;
                    }
                    if (var533 == 42) {
                        field716[var5++] = client.field434[var9[var7]];
                        continue;
                    }
                    if (var533 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field434[var10001] = field716[var5];
                        continue;
                    }
                    if (var533 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field716[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field703[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label3137;
                                }
                                field704[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var533 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field716[var5];
                        if (var48 >= 0 && var48 < field703[var47]) {
                            field716[var5++] = field704[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var533 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field716[var5];
                        if (var50 >= 0 && var50 < field703[var49]) {
                            field704[var49][var50] = field716[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var533 == 47) {
                        String var51 = client.field244[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field706[var6++] = var51;
                        continue;
                    }
                    if (var533 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field244[var10001] = field706[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var533 < 1000) {
                    if (var533 == 100) {
                        var5 -= 3;
                        int var53 = field716[var5];
                        int var54 = field716[var5 + 1];
                        int var55 = field716[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class155 var56 = class155.method1889(var53);
                        if (var56.field2517 == null) {
                            var56.field2517 = new class155[var55 + 1];
                        }
                        if (var56.field2517.length <= var55) {
                            class155[] var57 = new class155[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2517.length; var58++) {
                                var57[var58] = var56.field2517[var58];
                            }
                            var56.field2517 = var57;
                        }
                        if (var55 > 0 && var56.field2517[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class155 var59 = new class155();
                        var59.field2604 = var54;
                        var59.field2608 = var59.field2524 = var56.field2524;
                        var59.field2525 = var55;
                        var59.field2523 = true;
                        var56.field2517[var55] = var59;
                        if (var52) {
                            Statics.field2136 = var59;
                        } else {
                            Statics.field705 = var59;
                        }
                        client.method744(var56);
                        continue;
                    }
                    if (var533 == 101) {
                        class155 var60 = var52 ? Statics.field2136 : Statics.field705;
                        class155 var61 = class155.method1889(var60.field2524);
                        var61.field2517[var60.field2525] = null;
                        client.method744(var61);
                        continue;
                    }
                    if (var533 == 102) {
                        var5--;
                        class155 var62 = class155.method1889(field716[var5]);
                        var62.field2517 = null;
                        client.method744(var62);
                        continue;
                    }
                    if (var533 == 200) {
                        var5 -= 2;
                        int var63 = field716[var5];
                        int var64 = field716[var5 + 1];
                        class155 var65 = class155.method2715(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field716[var5++] = 1;
                            if (var52) {
                                Statics.field2136 = var65;
                            } else {
                                Statics.field705 = var65;
                            }
                            continue;
                        }
                        field716[var5++] = 0;
                        continue;
                    }
                } else if (!(var533 < 1000 || var533 >= 1100) || !(var533 < 2000 || var533 >= 2100)) {
                    class155 var66;
                    if (var533 >= 2000) {
                        var533 -= 1000;
                        var5--;
                        var66 = class155.method1889(field716[var5]);
                    } else {
                        var66 = var52 ? Statics.field2136 : Statics.field705;
                    }
                    if (var533 == 1000) {
                        var5 -= 2;
                        var66.field2568 = field716[var5];
                        var66.field2530 = field716[var5 + 1];
                        client.method744(var66);
                        continue;
                    }
                    if (var533 == 1001) {
                        var5 -= 2;
                        var66.field2533 = field716[var5];
                        var66.field2534 = field716[var5 + 1];
                        client.method744(var66);
                        continue;
                    }
                    if (var533 == 1003) {
                        var5--;
                        boolean var67 = field716[var5] == 1;
                        if (var66.field2536 != var67) {
                            var66.field2536 = var67;
                            client.method744(var66);
                        }
                        continue;
                    }
                } else if (var533 >= 1100 && var533 < 1200 || var533 >= 2100 && var533 < 2200) {
                    class155 var68;
                    if (var533 >= 2000) {
                        var533 -= 1000;
                        var5--;
                        var68 = class155.method1889(field716[var5]);
                    } else {
                        var68 = var52 ? Statics.field2136 : Statics.field705;
                    }
                    if (var533 == 1100) {
                        var5 -= 2;
                        var68.field2615 = field716[var5];
                        if (var68.field2615 > var68.field2539 - var68.field2533) {
                            var68.field2615 = var68.field2539 - var68.field2533;
                        }
                        if (var68.field2615 < 0) {
                            var68.field2615 = 0;
                        }
                        var68.field2538 = field716[var5 + 1];
                        if (var68.field2538 > var68.field2540 - var68.field2534) {
                            var68.field2538 = var68.field2540 - var68.field2534;
                        }
                        if (var68.field2538 < 0) {
                            var68.field2538 = 0;
                        }
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1101) {
                        var5--;
                        var68.field2541 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1102) {
                        var5--;
                        var68.field2573 = field716[var5] == 1;
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1103) {
                        var5--;
                        var68.field2546 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1104) {
                        var5--;
                        var68.field2547 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1105) {
                        var5--;
                        var68.field2548 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1106) {
                        var5--;
                        var68.field2550 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1107) {
                        var5--;
                        var68.field2551 = field716[var5] == 1;
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1108) {
                        var68.field2623 = 1;
                        var5--;
                        var68.field2557 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1109) {
                        var5 -= 6;
                        var68.field2562 = field716[var5];
                        var68.field2563 = field716[var5 + 1];
                        var68.field2564 = field716[var5 + 2];
                        var68.field2521 = field716[var5 + 3];
                        var68.field2580 = field716[var5 + 4];
                        var68.field2567 = field716[var5 + 5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1110) {
                        var5--;
                        int var69 = field716[var5];
                        if (var68.field2560 != var69) {
                            var68.field2560 = var69;
                            var68.field2633 = 0;
                            var68.field2634 = 0;
                            client.method744(var68);
                        }
                        continue;
                    }
                    if (var533 == 1111) {
                        var5--;
                        var68.field2569 = field716[var5] == 1;
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1112) {
                        var6--;
                        String var70 = field706[var6];
                        if (!var70.equals(var68.field2572)) {
                            var68.field2572 = var70;
                            client.method744(var68);
                        }
                        continue;
                    }
                    if (var533 == 1113) {
                        var5--;
                        var68.field2529 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1114) {
                        var5 -= 3;
                        var68.field2575 = field716[var5];
                        var68.field2519 = field716[var5 + 1];
                        var68.field2628 = field716[var5 + 2];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1115) {
                        var5--;
                        var68.field2577 = field716[var5] == 1;
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1116) {
                        var5--;
                        var68.field2561 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1117) {
                        var5--;
                        var68.field2553 = field716[var5];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1118) {
                        var5--;
                        var68.field2635 = field716[var5] == 1;
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1119) {
                        var5--;
                        var68.field2555 = field716[var5] == 1;
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1120) {
                        var5 -= 2;
                        var68.field2539 = field716[var5];
                        var68.field2540 = field716[var5 + 1];
                        client.method744(var68);
                        continue;
                    }
                    if (var533 == 1121) {
                        int var71 = var68.field2524;
                        int var72 = var68.field2525;
                        client.field261.method2391(169);
                        client.field261.method2201(var71);
                        client.field261.method2190(var72);
                        client.field429 = var68;
                        client.method744(var68);
                        continue;
                    }
                } else if (var533 >= 1200 && var533 < 1300 || var533 >= 2200 && var533 < 2300) {
                    class155 var73;
                    if (var533 >= 2000) {
                        var533 -= 1000;
                        var5--;
                        var73 = class155.method1889(field716[var5]);
                    } else {
                        var73 = var52 ? Statics.field2136 : Statics.field705;
                    }
                    client.method744(var73);
                    if (var533 == 1200 || var533 == 1205 || var533 == 1212) {
                        var5 -= 2;
                        int var74 = field716[var5];
                        int var75 = field716[var5 + 1];
                        var73.field2631 = var74;
                        var73.field2632 = var75;
                        class46 var76 = class46.method137(var74);
                        var73.field2564 = var76.field1017;
                        var73.field2521 = var76.field1018;
                        var73.field2580 = var76.field1019;
                        var73.field2562 = var76.field1020;
                        var73.field2563 = var76.field1021;
                        var73.field2567 = var76.field1012;
                        if (var533 == 1205) {
                            var73.field2570 = 0;
                        } else if (var533 == 1212 | var76.field1022 == 1) {
                            var73.field2570 = 1;
                        } else {
                            var73.field2570 = 2;
                        }
                        if (var73.field2533 > 0) {
                            var73.field2567 = var73.field2567 * 32 / var73.field2533;
                        }
                        continue;
                    }
                    if (var533 == 1201) {
                        var73.field2623 = 2;
                        var5--;
                        var73.field2557 = field716[var5];
                        continue;
                    }
                    if (var533 == 1202) {
                        var73.field2623 = 3;
                        var73.field2557 = Statics.field216.field40.method2979();
                        continue;
                    }
                } else if (var533 >= 1300 && var533 < 1400 || var533 >= 2300 && var533 < 2400) {
                    class155 var77;
                    if (var533 >= 2000) {
                        var533 -= 1000;
                        var5--;
                        var77 = class155.method1889(field716[var5]);
                    } else {
                        var77 = var52 ? Statics.field2136 : Statics.field705;
                    }
                    if (var533 == 1300) {
                        var5--;
                        int var78 = field716[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method2907(var78, field706[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var533 == 1301) {
                        var5 -= 2;
                        int var79 = field716[var5];
                        int var80 = field716[var5 + 1];
                        var77.field2556 = class155.method2715(var79, var80);
                        continue;
                    }
                    if (var533 == 1302) {
                        var5--;
                        var77.field2606 = field716[var5] == 1;
                        continue;
                    }
                    if (var533 == 1303) {
                        var5--;
                        var77.field2640 = field716[var5];
                        continue;
                    }
                    if (var533 == 1304) {
                        var5--;
                        var77.field2589 = field716[var5];
                        continue;
                    }
                    if (var533 == 1305) {
                        var6--;
                        var77.field2585 = field706[var6];
                        continue;
                    }
                    if (var533 == 1306) {
                        var6--;
                        var77.field2545 = field706[var6];
                        continue;
                    }
                    if (var533 == 1307) {
                        var77.field2522 = null;
                        continue;
                    }
                } else {
                    if (var533 >= 1400 && var533 < 1500 || var533 >= 2400 && var533 < 2500) {
                        class155 var81;
                        if (var533 >= 2000) {
                            var533 -= 1000;
                            var5--;
                            var81 = class155.method1889(field716[var5]);
                        } else {
                            var81 = var52 ? Statics.field2136 : Statics.field705;
                        }
                        var6--;
                        String var82 = field706[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field716[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field716[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field706[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field716[var5]);
                            }
                        }
                        var5--;
                        int var87 = field716[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var533 == 1400) {
                            var81.field2594 = var85;
                        }
                        if (var533 == 1401) {
                            var81.field2597 = var85;
                        }
                        if (var533 == 1402) {
                            var81.field2596 = var85;
                        }
                        if (var533 == 1403) {
                            var81.field2598 = var85;
                        }
                        if (var533 == 1404) {
                            var81.field2600 = var85;
                        }
                        if (var533 == 1405) {
                            var81.field2601 = var85;
                        }
                        if (var533 == 1406) {
                            var81.field2542 = var85;
                        }
                        if (var533 == 1407) {
                            var81.field2605 = var85;
                            var81.field2535 = var83;
                        }
                        if (var533 == 1408) {
                            var81.field2611 = var85;
                        }
                        if (var533 == 1409) {
                            var81.field2586 = var85;
                        }
                        if (var533 == 1410) {
                            var81.field2602 = var85;
                        }
                        if (var533 == 1411) {
                            var81.field2595 = var85;
                        }
                        if (var533 == 1412) {
                            var81.field2599 = var85;
                        }
                        if (var533 == 1414) {
                            var81.field2607 = var85;
                            var81.field2590 = var83;
                        }
                        if (var533 == 1415) {
                            var81.field2591 = var85;
                            var81.field2610 = var83;
                        }
                        if (var533 == 1416) {
                            var81.field2603 = var85;
                        }
                        if (var533 == 1417) {
                            var81.field2613 = var85;
                        }
                        if (var533 == 1418) {
                            var81.field2543 = var85;
                        }
                        if (var533 == 1419) {
                            var81.field2582 = var85;
                        }
                        if (var533 == 1420) {
                            var81.field2616 = var85;
                        }
                        if (var533 == 1421) {
                            var81.field2617 = var85;
                        }
                        if (var533 == 1422) {
                            var81.field2618 = var85;
                        }
                        if (var533 == 1423) {
                            var81.field2554 = var85;
                        }
                        if (var533 == 1424) {
                            var81.field2643 = var85;
                        }
                        if (var533 == 1425) {
                            var81.field2621 = var85;
                        }
                        if (var533 == 1426) {
                            var81.field2622 = var85;
                        }
                        var81.field2592 = true;
                        continue;
                    }
                    if (var533 < 1600) {
                        class155 var88 = var52 ? Statics.field2136 : Statics.field705;
                        if (var533 == 1500) {
                            field716[var5++] = var88.field2568;
                            continue;
                        }
                        if (var533 == 1501) {
                            field716[var5++] = var88.field2530;
                            continue;
                        }
                        if (var533 == 1502) {
                            field716[var5++] = var88.field2533;
                            continue;
                        }
                        if (var533 == 1503) {
                            field716[var5++] = var88.field2534;
                            continue;
                        }
                        if (var533 == 1504) {
                            field716[var5++] = var88.field2536 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 1505) {
                            field716[var5++] = var88.field2608;
                            continue;
                        }
                    } else if (var533 < 1700) {
                        class155 var89 = var52 ? Statics.field2136 : Statics.field705;
                        if (var533 == 1600) {
                            field716[var5++] = var89.field2615;
                            continue;
                        }
                        if (var533 == 1601) {
                            field716[var5++] = var89.field2538;
                            continue;
                        }
                        if (var533 == 1602) {
                            field706[var6++] = var89.field2572;
                            continue;
                        }
                        if (var533 == 1603) {
                            field716[var5++] = var89.field2539;
                            continue;
                        }
                        if (var533 == 1604) {
                            field716[var5++] = var89.field2540;
                            continue;
                        }
                        if (var533 == 1605) {
                            field716[var5++] = var89.field2567;
                            continue;
                        }
                        if (var533 == 1606) {
                            field716[var5++] = var89.field2564;
                            continue;
                        }
                        if (var533 == 1607) {
                            field716[var5++] = var89.field2580;
                            continue;
                        }
                        if (var533 == 1608) {
                            field716[var5++] = var89.field2521;
                            continue;
                        }
                    } else if (var533 < 1800) {
                        class155 var90 = var52 ? Statics.field2136 : Statics.field705;
                        if (var533 == 1700) {
                            field716[var5++] = var90.field2631;
                            continue;
                        }
                        if (var533 == 1701) {
                            if (var90.field2631 == -1) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var90.field2632;
                            }
                            continue;
                        }
                        if (var533 == 1702) {
                            field716[var5++] = var90.field2525;
                            continue;
                        }
                    } else if (var533 < 1900) {
                        class155 var91 = var52 ? Statics.field2136 : Statics.field705;
                        if (var533 == 1800) {
                            field716[var5++] = class159.method2864(client.method534(var91));
                            continue;
                        }
                        if (var533 == 1801) {
                            var5--;
                            int var92 = field716[var5];
                            int var534 = var92 - 1;
                            if (var91.field2522 != null && var534 < var91.field2522.length && var91.field2522[var534] != null) {
                                field706[var6++] = var91.field2522[var534];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 1802) {
                            if (var91.field2585 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = var91.field2585;
                            }
                            continue;
                        }
                    } else if (var533 < 2600) {
                        var5--;
                        class155 var93 = class155.method1889(field716[var5]);
                        if (var533 == 2500) {
                            field716[var5++] = var93.field2568;
                            continue;
                        }
                        if (var533 == 2501) {
                            field716[var5++] = var93.field2530;
                            continue;
                        }
                        if (var533 == 2502) {
                            field716[var5++] = var93.field2533;
                            continue;
                        }
                        if (var533 == 2503) {
                            field716[var5++] = var93.field2534;
                            continue;
                        }
                        if (var533 == 2504) {
                            field716[var5++] = var93.field2536 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 2505) {
                            field716[var5++] = var93.field2608;
                            continue;
                        }
                    } else if (var533 < 2700) {
                        var5--;
                        class155 var94 = class155.method1889(field716[var5]);
                        if (var533 == 2600) {
                            field716[var5++] = var94.field2615;
                            continue;
                        }
                        if (var533 == 2601) {
                            field716[var5++] = var94.field2538;
                            continue;
                        }
                        if (var533 == 2602) {
                            field706[var6++] = var94.field2572;
                            continue;
                        }
                        if (var533 == 2603) {
                            field716[var5++] = var94.field2539;
                            continue;
                        }
                        if (var533 == 2604) {
                            field716[var5++] = var94.field2540;
                            continue;
                        }
                        if (var533 == 2605) {
                            field716[var5++] = var94.field2567;
                            continue;
                        }
                        if (var533 == 2606) {
                            field716[var5++] = var94.field2564;
                            continue;
                        }
                        if (var533 == 2607) {
                            field716[var5++] = var94.field2580;
                            continue;
                        }
                        if (var533 == 2608) {
                            field716[var5++] = var94.field2521;
                            continue;
                        }
                    } else if (var533 < 2800) {
                        if (var533 == 2700) {
                            var5--;
                            class155 var95 = class155.method1889(field716[var5]);
                            field716[var5++] = var95.field2631;
                            continue;
                        }
                        if (var533 == 2701) {
                            var5--;
                            class155 var96 = class155.method1889(field716[var5]);
                            if (var96.field2631 == -1) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var96.field2632;
                            }
                            continue;
                        }
                        if (var533 == 2702) {
                            var5--;
                            int var97 = field716[var5];
                            class4 var98 = (class4) client.field398.method3254((long) var97);
                            if (var98 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var533 < 2900) {
                        var5--;
                        class155 var99 = class155.method1889(field716[var5]);
                        if (var533 == 2800) {
                            field716[var5++] = class159.method2864(client.method534(var99));
                            continue;
                        }
                        if (var533 == 2801) {
                            var5--;
                            int var100 = field716[var5];
                            int var535 = var100 - 1;
                            if (var99.field2522 != null && var535 < var99.field2522.length && var99.field2522[var535] != null) {
                                field706[var6++] = var99.field2522[var535];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 2802) {
                            if (var99.field2585 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = var99.field2585;
                            }
                            continue;
                        }
                    } else if (var533 < 3200) {
                        if (var533 == 3100) {
                            var6--;
                            String var101 = field706[var6];
                            class10.method1881(0, "", var101);
                            continue;
                        }
                        if (var533 == 3101) {
                            var5 -= 2;
                            client.method148(Statics.field216, field716[var5], field716[var5 + 1]);
                            continue;
                        }
                        if (var533 == 3103) {
                            client.method813();
                            continue;
                        }
                        if (var533 == 3104) {
                            var6--;
                            String var102 = field706[var6];
                            int var103 = 0;
                            if (class211.method3387(var102)) {
                                int var104 = class211.method1865(var102, 10, true);
                                var103 = var104;
                            }
                            client.field261.method2391(80);
                            client.field261.method2150(var103);
                            continue;
                        }
                        if (var533 == 3105) {
                            var6--;
                            String var105 = field706[var6];
                            client.field261.method2391(81);
                            client.field261.method2226(var105.length() + 1);
                            client.field261.method2152(var105);
                            continue;
                        }
                        if (var533 == 3106) {
                            var6--;
                            String var106 = field706[var6];
                            client.field261.method2391(56);
                            client.field261.method2226(var106.length() + 1);
                            client.field261.method2152(var106);
                            continue;
                        }
                        if (var533 == 3107) {
                            var5--;
                            int var107 = field716[var5];
                            var6--;
                            String var108 = field706[var6];
                            boolean var109 = false;
                            for (int var110 = 0; var110 < client.field356; var110++) {
                                class3 var111 = client.field355[client.field280[var110]];
                                if (var111 != null && var111.field49 != null && var111.field49.equalsIgnoreCase(var108)) {
                                    if (var107 == 1) {
                                        client.field261.method2391(95);
                                        client.field261.method2185(0);
                                        client.field261.method2189(client.field280[var110]);
                                    } else if (var107 == 4) {
                                        client.field261.method2391(184);
                                        client.field261.method2191(client.field280[var110]);
                                        client.field261.method2180(0);
                                    } else if (var107 == 6) {
                                        client.field261.method2391(205);
                                        client.field261.method2226(0);
                                        client.field261.method2189(client.field280[var110]);
                                    } else if (var107 == 7) {
                                        client.field261.method2391(232);
                                        client.field261.method2190(client.field280[var110]);
                                        client.field261.method2180(0);
                                    }
                                    var109 = true;
                                    break;
                                }
                            }
                            if (!var109) {
                                class10.method1881(4, "", class145.field2359 + var108);
                            }
                            continue;
                        }
                        if (var533 == 3108) {
                            var5 -= 3;
                            int var112 = field716[var5];
                            int var113 = field716[var5 + 1];
                            int var114 = field716[var5 + 2];
                            class155 var115 = class155.method1889(var114);
                            client.method2957(var115, var112, var113);
                            continue;
                        }
                        if (var533 == 3109) {
                            var5 -= 2;
                            int var116 = field716[var5];
                            int var117 = field716[var5 + 1];
                            class155 var118 = var52 ? Statics.field2136 : Statics.field705;
                            client.method2957(var118, var116, var117);
                            continue;
                        }
                        if (var533 == 3110) {
                            var5--;
                            Statics.field1985 = field716[var5] == 1;
                            continue;
                        }
                        if (var533 == 3111) {
                            field716[var5++] = Statics.field1773.field136 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3112) {
                            var5--;
                            Statics.field1773.field136 = field716[var5] == 1;
                            class9.method690();
                            continue;
                        }
                        if (var533 == 3113) {
                            var6--;
                            String var119 = field706[var6];
                            var5--;
                            boolean var120 = field716[var5] == 1;
                            class127.method2444(var119, var120, false);
                            continue;
                        }
                        if (var533 == 3115) {
                            var5--;
                            int var121 = field716[var5];
                            client.field261.method2391(128);
                            client.field261.method2148(var121);
                            continue;
                        }
                    } else if (var533 < 3300) {
                        if (var533 == 3200) {
                            var5 -= 3;
                            int var122 = field716[var5];
                            int var123 = field716[var5 + 1];
                            int var124 = field716[var5 + 2];
                            if (client.field475 != 0 && var123 != 0 && client.field477 < 50) {
                                client.field478[client.field477] = var122;
                                client.field479[client.field477] = var123;
                                client.field472[client.field477] = var124;
                                client.field482[client.field477] = null;
                                client.field481[client.field477] = 0;
                                client.field477++;
                            }
                            continue;
                        }
                        if (var533 == 3201) {
                            var5--;
                            int var125 = field716[var5];
                            if (var125 == -1 && !client.field314) {
                                class164.method1385();
                            } else if (var125 != -1 && client.field276 != var125 && client.field292 != 0 && !client.field314) {
                                class164.method3017(2, Statics.field565, var125, 0, client.field292, false);
                            }
                            client.field276 = var125;
                            continue;
                        }
                        if (var533 == 3202) {
                            var5 -= 2;
                            int var126 = field716[var5];
                            int var10000 = field716[var5 + 1];
                            if (client.field292 != 0 && var126 != -1) {
                                class164.method2101(Statics.field1881, var126, 0, client.field292, false);
                                client.field314 = true;
                            }
                            continue;
                        }
                    } else if (var533 < 3400) {
                        if (var533 == 3300) {
                            field716[var5++] = client.field246;
                            continue;
                        }
                        if (var533 == 3301) {
                            var5 -= 2;
                            int var128 = field716[var5];
                            int var129 = field716[var5 + 1];
                            int[] var130 = field716;
                            int var131 = var5++;
                            class14 var132 = (class14) class14.field180.method3254((long) var128);
                            int var133;
                            if (var132 == null) {
                                var133 = -1;
                            } else if (var129 >= 0 && var129 < var132.field186.length) {
                                var133 = var132.field186[var129];
                            } else {
                                var133 = -1;
                            }
                            var130[var131] = var133;
                            continue;
                        }
                        if (var533 == 3302) {
                            var5 -= 2;
                            int var134 = field716[var5];
                            int var135 = field716[var5 + 1];
                            int[] var136 = field716;
                            int var137 = var5++;
                            class14 var138 = (class14) class14.field180.method3254((long) var134);
                            int var139;
                            if (var138 == null) {
                                var139 = 0;
                            } else if (var135 >= 0 && var135 < var138.field181.length) {
                                var139 = var138.field181[var135];
                            } else {
                                var139 = 0;
                            }
                            var136[var137] = var139;
                            continue;
                        }
                        if (var533 == 3303) {
                            var5 -= 2;
                            int var140 = field716[var5];
                            int var141 = field716[var5 + 1];
                            int[] var142 = field716;
                            int var143 = var5++;
                            class14 var144 = (class14) class14.field180.method3254((long) var140);
                            int var145;
                            if (var144 == null) {
                                var145 = 0;
                            } else if (var141 == -1) {
                                var145 = 0;
                            } else {
                                int var146 = 0;
                                for (int var147 = 0; var147 < var144.field181.length; var147++) {
                                    if (var144.field186[var147] == var141) {
                                        var146 += var144.field181[var147];
                                    }
                                }
                                var145 = var146;
                            }
                            var142[var143] = var145;
                            continue;
                        }
                        if (var533 == 3304) {
                            var5--;
                            int var148 = field716[var5];
                            int[] var149 = field716;
                            int var150 = var5++;
                            class45 var151 = (class45) class45.field997.method3225((long) var148);
                            class45 var152;
                            if (var151 == null) {
                                byte[] var153 = Statics.field1000.method2752(5, var148);
                                class45 var154 = new class45();
                                if (var153 != null) {
                                    var154.method843(new class108(var153));
                                }
                                class45.field997.method3211(var154, (long) var148);
                                var152 = var154;
                            } else {
                                var152 = var151;
                            }
                            var149[var150] = var152.field998;
                            continue;
                        }
                        if (var533 == 3305) {
                            var5--;
                            int var155 = field716[var5];
                            field716[var5++] = client.field239[var155];
                            continue;
                        }
                        if (var533 == 3306) {
                            var5--;
                            int var156 = field716[var5];
                            field716[var5++] = client.field375[var156];
                            continue;
                        }
                        if (var533 == 3307) {
                            var5--;
                            int var157 = field716[var5];
                            field716[var5++] = client.field376[var157];
                            continue;
                        }
                        if (var533 == 3308) {
                            int var158 = Statics.field2678;
                            int var159 = (Statics.field216.field732 >> 7) + Statics.field183;
                            int var160 = (Statics.field216.field777 >> 7) + Statics.field780;
                            field716[var5++] = (var158 << 28) + (var159 << 14) + var160;
                            continue;
                        }
                        if (var533 == 3309) {
                            var5--;
                            int var161 = field716[var5];
                            field716[var5++] = var161 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var533 == 3310) {
                            var5--;
                            int var162 = field716[var5];
                            field716[var5++] = var162 >> 28;
                            continue;
                        }
                        if (var533 == 3311) {
                            var5--;
                            int var163 = field716[var5];
                            field716[var5++] = var163 & 0x3FFF;
                            continue;
                        }
                        if (var533 == 3312) {
                            field716[var5++] = client.field437 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3313) {
                            var5 -= 2;
                            int var164 = field716[var5] + 32768;
                            int var165 = field716[var5 + 1];
                            int[] var166 = field716;
                            int var167 = var5++;
                            class14 var168 = (class14) class14.field180.method3254((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = -1;
                            } else if (var165 >= 0 && var165 < var168.field186.length) {
                                var169 = var168.field186[var165];
                            } else {
                                var169 = -1;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var533 == 3314) {
                            var5 -= 2;
                            int var170 = field716[var5] + 32768;
                            int var171 = field716[var5 + 1];
                            int[] var172 = field716;
                            int var173 = var5++;
                            class14 var174 = (class14) class14.field180.method3254((long) var170);
                            int var175;
                            if (var174 == null) {
                                var175 = 0;
                            } else if (var171 >= 0 && var171 < var174.field181.length) {
                                var175 = var174.field181[var171];
                            } else {
                                var175 = 0;
                            }
                            var172[var173] = var175;
                            continue;
                        }
                        if (var533 == 3315) {
                            var5 -= 2;
                            int var176 = field716[var5] + 32768;
                            int var177 = field716[var5 + 1];
                            int[] var178 = field716;
                            int var179 = var5++;
                            class14 var180 = (class14) class14.field180.method3254((long) var176);
                            int var181;
                            if (var180 == null) {
                                var181 = 0;
                            } else if (var177 == -1) {
                                var181 = 0;
                            } else {
                                int var182 = 0;
                                for (int var183 = 0; var183 < var180.field181.length; var183++) {
                                    if (var180.field186[var183] == var177) {
                                        var182 += var180.field181[var183];
                                    }
                                }
                                var181 = var182;
                            }
                            var178[var179] = var181;
                            continue;
                        }
                        if (var533 == 3316) {
                            if (client.field404 >= 2) {
                                field716[var5++] = client.field404;
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                        if (var533 == 3317) {
                            field716[var5++] = client.field253;
                            continue;
                        }
                        if (var533 == 3318) {
                            field716[var5++] = client.field480;
                            continue;
                        }
                        if (var533 == 3321) {
                            field716[var5++] = client.field488;
                            continue;
                        }
                        if (var533 == 3322) {
                            field716[var5++] = client.field408;
                            continue;
                        }
                        if (var533 == 3323) {
                            if (client.field406) {
                                field716[var5++] = 1;
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                        if (var533 == 3324) {
                            field716[var5++] = client.field461;
                            continue;
                        }
                    } else if (var533 < 3500) {
                        if (var533 == 3400) {
                            var5 -= 2;
                            int var184 = field716[var5];
                            int var185 = field716[var5 + 1];
                            class44 var186 = (class44) class44.field987.method3225((long) var184);
                            class44 var187;
                            if (var186 == null) {
                                byte[] var188 = Statics.field992.method2752(8, var184);
                                class44 var189 = new class44();
                                if (var188 != null) {
                                    var189.method832(new class108(var188));
                                }
                                class44.field987.method3211(var189, (long) var184);
                                var187 = var189;
                            } else {
                                var187 = var186;
                            }
                            class44 var190 = var187;
                            if (var187.field985 != 's') {
                            }
                            for (int var191 = 0; var191 < var190.field984; var191++) {
                                if (var190.field989[var191] == var185) {
                                    field706[var6++] = var190.field991[var191];
                                    var190 = null;
                                    break;
                                }
                            }
                            if (var190 != null) {
                                field706[var6++] = var190.field986;
                            }
                            continue;
                        }
                        if (var533 == 3408) {
                            var5 -= 4;
                            int var192 = field716[var5];
                            int var193 = field716[var5 + 1];
                            int var194 = field716[var5 + 2];
                            int var195 = field716[var5 + 3];
                            class44 var196 = (class44) class44.field987.method3225((long) var194);
                            class44 var197;
                            if (var196 == null) {
                                byte[] var198 = Statics.field992.method2752(8, var194);
                                class44 var199 = new class44();
                                if (var198 != null) {
                                    var199.method832(new class108(var198));
                                }
                                class44.field987.method3211(var199, (long) var194);
                                var197 = var199;
                            } else {
                                var197 = var196;
                            }
                            class44 var200 = var197;
                            if (var197.field988 == var192 && var197.field985 == var193) {
                                for (int var201 = 0; var201 < var200.field984; var201++) {
                                    if (var200.field989[var201] == var195) {
                                        if (var193 == 115) {
                                            field706[var6++] = var200.field991[var201];
                                        } else {
                                            field716[var5++] = var200.field990[var201];
                                        }
                                        var200 = null;
                                        break;
                                    }
                                }
                                if (var200 != null) {
                                    if (var193 == 115) {
                                        field706[var6++] = var200.field986;
                                    } else {
                                        field716[var5++] = var200.field982;
                                    }
                                }
                                continue;
                            }
                            if (var193 == 115) {
                                field706[var6++] = "null";
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var533 < 3700) {
                        if (var533 == 3600) {
                            if (client.field419 == 0) {
                                field716[var5++] = -2;
                            } else if (client.field419 == 1) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = client.field489;
                            }
                            continue;
                        }
                        if (var533 == 3601) {
                            var5--;
                            int var202 = field716[var5];
                            if (client.field419 == 2 && var202 < client.field489) {
                                field706[var6++] = client.field344[var202].field224;
                                field706[var6++] = client.field344[var202].field213;
                                continue;
                            }
                            field706[var6++] = "";
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 3602) {
                            var5--;
                            int var203 = field716[var5];
                            if (client.field419 == 2 && var203 < client.field489) {
                                field716[var5++] = client.field344[var203].field212;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var533 == 3603) {
                            var5--;
                            int var204 = field716[var5];
                            if (client.field419 == 2 && var204 < client.field489) {
                                field716[var5++] = client.field344[var204].field222;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var533 == 3604) {
                            var6--;
                            String var205 = field706[var6];
                            var5--;
                            int var206 = field716[var5];
                            client.method3202(var205, var206);
                            continue;
                        }
                        if (var533 == 3605) {
                            var6--;
                            String var207 = field706[var6];
                            if (var207 == null) {
                                continue;
                            }
                            if ((client.field489 < 200 || client.field362 == 1) && client.field489 < 400) {
                                String var208 = class212.method3386(var207, Statics.field237);
                                if (var208 == null) {
                                    continue;
                                }
                                for (int var209 = 0; var209 < client.field489; var209++) {
                                    class16 var210 = client.field344[var209];
                                    String var211 = class212.method3386(var210.field224, Statics.field237);
                                    if (var211 != null && var211.equals(var208)) {
                                        class10.method1881(30, "", var207 + class145.field2194);
                                        continue label3137;
                                    }
                                    if (var210.field213 != null) {
                                        String var212 = class212.method3386(var210.field213, Statics.field237);
                                        if (var212 != null && var212.equals(var208)) {
                                            class10.method1881(30, "", var207 + class145.field2194);
                                            continue label3137;
                                        }
                                    }
                                }
                                for (int var213 = 0; var213 < client.field358; var213++) {
                                    class8 var214 = client.field333[var213];
                                    String var215 = class212.method3386(var214.field125, Statics.field237);
                                    if (var215 != null && var215.equals(var208)) {
                                        class10.method1881(30, "", class145.field2229 + var207 + class145.field2222);
                                        continue label3137;
                                    }
                                    if (var214.field120 != null) {
                                        String var216 = class212.method3386(var214.field120, Statics.field237);
                                        if (var216 != null && var216.equals(var208)) {
                                            class10.method1881(30, "", class145.field2229 + var207 + class145.field2222);
                                            continue label3137;
                                        }
                                    }
                                }
                                if (class212.method3386(Statics.field216.field49, Statics.field237).equals(var208)) {
                                    class10.method1881(30, "", class145.field2307);
                                } else {
                                    client.field261.method2391(208);
                                    class111 var217 = client.field261;
                                    int var218 = var207.length() + 1;
                                    var217.method2226(var218);
                                    client.field261.method2152(var207);
                                }
                                continue;
                            }
                            class10.method1881(30, "", class145.field2139);
                            continue;
                        }
                        if (var533 == 3606) {
                            var6--;
                            String var219 = field706[var6];
                            client.method1986(var219);
                            continue;
                        }
                        if (var533 == 3607) {
                            var6--;
                            String var220 = field706[var6];
                            if (var220 == null) {
                                continue;
                            }
                            if ((client.field358 < 100 || client.field362 == 1) && client.field358 < 400) {
                                String var221 = class212.method3386(var220, Statics.field237);
                                if (var221 == null) {
                                    continue;
                                }
                                for (int var222 = 0; var222 < client.field358; var222++) {
                                    class8 var223 = client.field333[var222];
                                    String var224 = class212.method3386(var223.field125, Statics.field237);
                                    if (var224 != null && var224.equals(var221)) {
                                        class10.method1881(31, "", var220 + class145.field2306);
                                        continue label3137;
                                    }
                                    if (var223.field120 != null) {
                                        String var225 = class212.method3386(var223.field120, Statics.field237);
                                        if (var225 != null && var225.equals(var221)) {
                                            class10.method1881(31, "", var220 + class145.field2306);
                                            continue label3137;
                                        }
                                    }
                                }
                                for (int var226 = 0; var226 < client.field489; var226++) {
                                    class16 var227 = client.field344[var226];
                                    String var228 = class212.method3386(var227.field224, Statics.field237);
                                    if (var228 != null && var228.equals(var221)) {
                                        class10.method1881(31, "", class145.field2290 + var220 + class145.field2312);
                                        continue label3137;
                                    }
                                    if (var227.field213 != null) {
                                        String var229 = class212.method3386(var227.field213, Statics.field237);
                                        if (var229 != null && var229.equals(var221)) {
                                            class10.method1881(31, "", class145.field2290 + var220 + class145.field2312);
                                            continue label3137;
                                        }
                                    }
                                }
                                if (class212.method3386(Statics.field216.field49, Statics.field237).equals(var221)) {
                                    class10.method1881(31, "", class145.field2257);
                                } else {
                                    client.field261.method2391(58);
                                    class111 var230 = client.field261;
                                    int var231 = var220.length() + 1;
                                    var230.method2226(var231);
                                    client.field261.method2152(var220);
                                }
                                continue;
                            }
                            class10.method1881(31, "", class145.field2305);
                            continue;
                        }
                        if (var533 == 3608) {
                            var6--;
                            String var232 = field706[var6];
                            Statics.method133(var232);
                            continue;
                        }
                        if (var533 == 3609) {
                            var6--;
                            String var233 = field706[var6];
                            class140[] var234 = class140.method810();
                            for (int var235 = 0; var235 < var234.length; var235++) {
                                class140 var236 = var234[var235];
                                if (var236.field2096 != -1 && var233.startsWith(class2.method2863(var236.field2096))) {
                                    var233 = var233.substring(6 + Integer.toString(var236.field2096).length());
                                    break;
                                }
                            }
                            field716[var5++] = client.method2723(var233, false) ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3611) {
                            if (client.field427 == null) {
                                field706[var6++] = "";
                                continue;
                            }
                            String[] var237 = field706;
                            int var238 = var6++;
                            String var239 = client.field427;
                            long var240 = 0L;
                            int var242 = var239.length();
                            for (int var243 = 0; var243 < var242; var243++) {
                                var240 *= 37L;
                                char var244 = var239.charAt(var243);
                                if (var244 >= 'A' && var244 <= 'Z') {
                                    var240 += (long) (var244 + 1 - 65);
                                } else if (var244 >= 'a' && var244 <= 'z') {
                                    var240 += (long) (var244 + 1 - 97);
                                } else if (var244 >= '0' && var244 <= '9') {
                                    var240 += (long) (var244 + 27 - 48);
                                }
                                if (var240 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var240 % 37L == 0L && var240 != 0L) {
                                var240 /= 37L;
                            }
                            String var247 = class210.method2459(var240);
                            if (var247 == null) {
                                var247 = "";
                            }
                            var237[var238] = var247;
                            continue;
                        }
                        if (var533 == 3612) {
                            if (client.field427 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = Statics.field1050;
                            }
                            continue;
                        }
                        if (var533 == 3613) {
                            var5--;
                            int var249 = field716[var5];
                            if (client.field427 != null && var249 < Statics.field1050) {
                                field706[var6++] = Statics.field2065[var249].field559;
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 3614) {
                            var5--;
                            int var250 = field716[var5];
                            if (client.field427 != null && var250 < Statics.field1050) {
                                field716[var5++] = Statics.field2065[var250].field563;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var533 == 3615) {
                            var5--;
                            int var251 = field716[var5];
                            if (client.field427 != null && var251 < Statics.field1050) {
                                field716[var5++] = Statics.field2065[var251].field560;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var533 == 3616) {
                            field716[var5++] = Statics.field1471;
                            continue;
                        }
                        if (var533 == 3617) {
                            var6--;
                            String var252 = field706[var6];
                            client.method2559(var252);
                            continue;
                        }
                        if (var533 == 3618) {
                            field716[var5++] = Statics.field596;
                            continue;
                        }
                        if (var533 == 3619) {
                            var6--;
                            String var253 = field706[var6];
                            if (!var253.equals("")) {
                                client.field261.method2391(144);
                                class111 var254 = client.field261;
                                int var255 = var253.length() + 1;
                                var254.method2226(var255);
                                client.field261.method2152(var253);
                            }
                            continue;
                        }
                        if (var533 == 3620) {
                            client.method458();
                            continue;
                        }
                        if (var533 == 3621) {
                            if (client.field419 == 0) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = client.field358;
                            }
                            continue;
                        }
                        if (var533 == 3622) {
                            var5--;
                            int var256 = field716[var5];
                            if (client.field419 != 0 && var256 < client.field358) {
                                field706[var6++] = client.field333[var256].field125;
                                field706[var6++] = client.field333[var256].field120;
                                continue;
                            }
                            field706[var6++] = "";
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 3623) {
                            var6--;
                            String var257 = field706[var6];
                            if (var257.startsWith(class2.method2863(0)) || var257.startsWith(class2.method2863(1))) {
                                var257 = var257.substring(7);
                            }
                            field716[var5++] = client.method3084(var257) ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3624) {
                            var5--;
                            int var258 = field716[var5];
                            if (Statics.field2065 != null && var258 < Statics.field1050 && Statics.field2065[var258].field559.equalsIgnoreCase(Statics.field216.field49)) {
                                field716[var5++] = 1;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var533 == 3625) {
                            if (client.field463 == null) {
                                field706[var6++] = "";
                                continue;
                            }
                            String[] var259 = field706;
                            int var260 = var6++;
                            String var261 = client.field463;
                            long var262 = 0L;
                            int var264 = var261.length();
                            for (int var265 = 0; var265 < var264; var265++) {
                                var262 *= 37L;
                                char var266 = var261.charAt(var265);
                                if (var266 >= 'A' && var266 <= 'Z') {
                                    var262 += (long) (var266 + 1 - 65);
                                } else if (var266 >= 'a' && var266 <= 'z') {
                                    var262 += (long) (var266 + 1 - 97);
                                } else if (var266 >= '0' && var266 <= '9') {
                                    var262 += (long) (var266 + 27 - 48);
                                }
                                if (var262 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var262 % 37L == 0L && var262 != 0L) {
                                var262 /= 37L;
                            }
                            String var269 = class210.method2459(var262);
                            if (var269 == null) {
                                var269 = "";
                            }
                            var259[var260] = var269;
                            continue;
                        }
                    } else if (var533 < 4000) {
                        if (var533 == 3903) {
                            var5--;
                            int var271 = field716[var5];
                            field716[var5++] = client.field498[var271].method3467();
                            continue;
                        }
                        if (var533 == 3904) {
                            var5--;
                            int var272 = field716[var5];
                            field716[var5++] = client.field498[var272].field2937;
                            continue;
                        }
                        if (var533 == 3905) {
                            var5--;
                            int var273 = field716[var5];
                            field716[var5++] = client.field498[var273].field2939;
                            continue;
                        }
                        if (var533 == 3906) {
                            var5--;
                            int var274 = field716[var5];
                            field716[var5++] = client.field498[var274].field2938;
                            continue;
                        }
                        if (var533 == 3907) {
                            var5--;
                            int var275 = field716[var5];
                            field716[var5++] = client.field498[var275].field2940;
                            continue;
                        }
                        if (var533 == 3908) {
                            var5--;
                            int var276 = field716[var5];
                            field716[var5++] = client.field498[var276].field2941;
                            continue;
                        }
                        if (var533 == 3910) {
                            var5--;
                            int var277 = field716[var5];
                            int var278 = client.field498[var277].method3475();
                            field716[var5++] = var278 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3911) {
                            var5--;
                            int var279 = field716[var5];
                            int var280 = client.field498[var279].method3475();
                            field716[var5++] = var280 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3912) {
                            var5--;
                            int var281 = field716[var5];
                            int var282 = client.field498[var281].method3475();
                            field716[var5++] = var282 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3913) {
                            var5--;
                            int var283 = field716[var5];
                            int var284 = client.field498[var283].method3475();
                            field716[var5++] = var284 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 3914) {
                            var5--;
                            boolean var285 = field716[var5] == 1;
                            if (Statics.field2513 != null) {
                                Statics.field2513.method3484(class202.field2946, var285);
                            }
                            continue;
                        }
                        if (var533 == 3915) {
                            var5--;
                            boolean var286 = field716[var5] == 1;
                            if (Statics.field2513 != null) {
                                Statics.field2513.method3484(class202.field2944, var286);
                            }
                            continue;
                        }
                        if (var533 == 3916) {
                            var5 -= 2;
                            boolean var287 = field716[var5] == 1;
                            boolean var288 = field716[var5 + 1] == 1;
                            if (Statics.field2513 != null) {
                                Statics.field2513.method3484(new class20(var288), var287);
                            }
                            continue;
                        }
                        if (var533 == 3917) {
                            var5--;
                            boolean var289 = field716[var5] == 1;
                            if (Statics.field2513 != null) {
                                Statics.field2513.method3484(class202.field2943, var289);
                            }
                            continue;
                        }
                        if (var533 == 3918) {
                            var5--;
                            boolean var290 = field716[var5] == 1;
                            if (Statics.field2513 != null) {
                                Statics.field2513.method3484(class202.field2947, var290);
                            }
                            continue;
                        }
                        if (var533 == 3919) {
                            field716[var5++] = Statics.field2513 == null ? 0 : Statics.field2513.field2949.size();
                            continue;
                        }
                        if (var533 == 3920) {
                            var5--;
                            int var291 = field716[var5];
                            class195 var292 = (class195) Statics.field2513.field2949.get(var291);
                            field716[var5++] = var292.field2918;
                            continue;
                        }
                        if (var533 == 3921) {
                            var5--;
                            int var293 = field716[var5];
                            class195 var294 = (class195) Statics.field2513.field2949.get(var293);
                            field706[var6++] = var294.method3412();
                            continue;
                        }
                        if (var533 == 3922) {
                            var5--;
                            int var295 = field716[var5];
                            class195 var296 = (class195) Statics.field2513.field2949.get(var295);
                            field706[var6++] = var296.method3411();
                            continue;
                        }
                        if (var533 == 3923) {
                            var5--;
                            int var297 = field716[var5];
                            class195 var298 = (class195) Statics.field2513.field2949.get(var297);
                            long var299 = class104.method2616() - Statics.field2801 - var298.field2921;
                            int var301 = (int) (var299 / 3600000L);
                            int var302 = (int) ((var299 - (long) (var301 * 3600000)) / 60000L);
                            int var303 = (int) ((var299 - (long) (var301 * 3600000) - (long) (var302 * 60000)) / 1000L);
                            String var304 = var301 + ":" + var302 / 10 + var302 % 10 + ":" + var303 / 10 + var303 % 10;
                            field706[var6++] = var304;
                            continue;
                        }
                        if (var533 == 3924) {
                            var5--;
                            int var305 = field716[var5];
                            class195 var306 = (class195) Statics.field2513.field2949.get(var305);
                            field716[var5++] = var306.field2919.field2938;
                            continue;
                        }
                        if (var533 == 3925) {
                            var5--;
                            int var307 = field716[var5];
                            class195 var308 = (class195) Statics.field2513.field2949.get(var307);
                            field716[var5++] = var308.field2919.field2939;
                            continue;
                        }
                        if (var533 == 3926) {
                            var5--;
                            int var309 = field716[var5];
                            class195 var310 = (class195) Statics.field2513.field2949.get(var309);
                            field716[var5++] = var310.field2919.field2937;
                            continue;
                        }
                    } else if (var533 < 4100) {
                        if (var533 == 4000) {
                            var5 -= 2;
                            int var311 = field716[var5];
                            int var312 = field716[var5 + 1];
                            field716[var5++] = var311 + var312;
                            continue;
                        }
                        if (var533 == 4001) {
                            var5 -= 2;
                            int var313 = field716[var5];
                            int var314 = field716[var5 + 1];
                            field716[var5++] = var313 - var314;
                            continue;
                        }
                        if (var533 == 4002) {
                            var5 -= 2;
                            int var315 = field716[var5];
                            int var316 = field716[var5 + 1];
                            field716[var5++] = var315 * var316;
                            continue;
                        }
                        if (var533 == 4003) {
                            var5 -= 2;
                            int var317 = field716[var5];
                            int var318 = field716[var5 + 1];
                            field716[var5++] = var317 / var318;
                            continue;
                        }
                        if (var533 == 4004) {
                            var5--;
                            int var319 = field716[var5];
                            field716[var5++] = (int) (Math.random() * (double) var319);
                            continue;
                        }
                        if (var533 == 4005) {
                            var5--;
                            int var320 = field716[var5];
                            field716[var5++] = (int) (Math.random() * (double) (var320 + 1));
                            continue;
                        }
                        if (var533 == 4006) {
                            var5 -= 5;
                            int var321 = field716[var5];
                            int var322 = field716[var5 + 1];
                            int var323 = field716[var5 + 2];
                            int var324 = field716[var5 + 3];
                            int var325 = field716[var5 + 4];
                            field716[var5++] = (var322 - var321) * (var325 - var323) / (var324 - var323) + var321;
                            continue;
                        }
                        if (var533 == 4007) {
                            var5 -= 2;
                            int var326 = field716[var5];
                            int var327 = field716[var5 + 1];
                            field716[var5++] = var326 * var327 / 100 + var326;
                            continue;
                        }
                        if (var533 == 4008) {
                            var5 -= 2;
                            int var328 = field716[var5];
                            int var329 = field716[var5 + 1];
                            field716[var5++] = var328 | 0x1 << var329;
                            continue;
                        }
                        if (var533 == 4009) {
                            var5 -= 2;
                            int var330 = field716[var5];
                            int var331 = field716[var5 + 1];
                            field716[var5++] = var330 & -1 - (0x1 << var331);
                            continue;
                        }
                        if (var533 == 4010) {
                            var5 -= 2;
                            int var332 = field716[var5];
                            int var333 = field716[var5 + 1];
                            field716[var5++] = (var332 & 0x1 << var333) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var533 == 4011) {
                            var5 -= 2;
                            int var334 = field716[var5];
                            int var335 = field716[var5 + 1];
                            field716[var5++] = var334 % var335;
                            continue;
                        }
                        if (var533 == 4012) {
                            var5 -= 2;
                            int var336 = field716[var5];
                            int var337 = field716[var5 + 1];
                            if (var336 == 0) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = (int) Math.pow((double) var336, (double) var337);
                            }
                            continue;
                        }
                        if (var533 == 4013) {
                            var5 -= 2;
                            int var338 = field716[var5];
                            int var339 = field716[var5 + 1];
                            if (var338 == 0) {
                                field716[var5++] = 0;
                            } else if (var339 == 0) {
                                field716[var5++] = Integer.MAX_VALUE;
                            } else {
                                field716[var5++] = (int) Math.pow((double) var338, 1.0D / (double) var339);
                            }
                            continue;
                        }
                        if (var533 == 4014) {
                            var5 -= 2;
                            int var340 = field716[var5];
                            int var341 = field716[var5 + 1];
                            field716[var5++] = var340 & var341;
                            continue;
                        }
                        if (var533 == 4015) {
                            var5 -= 2;
                            int var342 = field716[var5];
                            int var343 = field716[var5 + 1];
                            field716[var5++] = var342 | var343;
                            continue;
                        }
                    } else if (var533 < 4200) {
                        if (var533 == 4100) {
                            var6--;
                            String var344 = field706[var6];
                            var5--;
                            int var345 = field716[var5];
                            field706[var6++] = var344 + var345;
                            continue;
                        }
                        if (var533 == 4101) {
                            var6 -= 2;
                            String var346 = field706[var6];
                            String var347 = field706[var6 + 1];
                            field706[var6++] = var346 + var347;
                            continue;
                        }
                        if (var533 == 4102) {
                            var6--;
                            String var348 = field706[var6];
                            var5--;
                            int var349 = field716[var5];
                            String[] var350 = field706;
                            int var351 = var6++;
                            String var353;
                            if (var349 < 0) {
                                var353 = Integer.toString(var349);
                            } else {
                                int var354 = var349;
                                String var355;
                                if (var349 < 0) {
                                    var355 = Integer.toString(var349, 10);
                                } else {
                                    int var356 = 2;
                                    int var357 = var349 / 10;
                                    while (var357 != 0) {
                                        var357 /= 10;
                                        var356++;
                                    }
                                    char[] var358 = new char[var356];
                                    var358[0] = '+';
                                    for (int var359 = var356 - 1; var359 > 0; var359--) {
                                        int var360 = var354;
                                        var354 /= 10;
                                        int var361 = var360 - var354 * 10;
                                        if (var361 >= 10) {
                                            var358[var359] = (char) (var361 + 87);
                                        } else {
                                            var358[var359] = (char) (var361 + 48);
                                        }
                                    }
                                    var355 = new String(var358);
                                }
                                var353 = var355;
                            }
                            var350[var351] = var348 + var353;
                            continue;
                        }
                        if (var533 == 4103) {
                            var6--;
                            String var362 = field706[var6];
                            field706[var6++] = var362.toLowerCase();
                            continue;
                        }
                        if (var533 == 4104) {
                            var5--;
                            int var363 = field716[var5];
                            long var364 = ((long) var363 + 11745L) * 86400000L;
                            field710.setTime(new Date(var364));
                            int var366 = field710.get(5);
                            int var367 = field710.get(2);
                            int var368 = field710.get(1);
                            field706[var6++] = var366 + "-" + field712[var367] + "-" + var368;
                            continue;
                        }
                        if (var533 == 4105) {
                            var6 -= 2;
                            String var369 = field706[var6];
                            String var370 = field706[var6 + 1];
                            if (Statics.field216.field40 != null && Statics.field216.field40.field2666) {
                                field706[var6++] = var370;
                                continue;
                            }
                            field706[var6++] = var369;
                            continue;
                        }
                        if (var533 == 4106) {
                            var5--;
                            int var371 = field716[var5];
                            field706[var6++] = Integer.toString(var371);
                            continue;
                        }
                        if (var533 == 4107) {
                            var6 -= 2;
                            int[] var372 = field716;
                            int var373 = var5++;
                            String var374 = field706[var6];
                            String var375 = field706[var6 + 1];
                            int var376 = client.field497;
                            int var377 = var374.length();
                            int var378 = var375.length();
                            int var379 = 0;
                            int var380 = 0;
                            byte var381 = 0;
                            char var382 = 0;
                            int var383;
                            label2894: while (true) {
                                if (var379 - var381 >= var377 && var380 - var382 >= var378) {
                                    int var393 = Math.min(var377, var378);
                                    for (int var394 = 0; var394 < var393; var394++) {
                                        char var397 = var374.charAt(var394);
                                        char var398 = var375.charAt(var394);
                                        if (var397 != var398 && Character.toUpperCase(var397) != Character.toUpperCase(var398)) {
                                            char var399 = Character.toLowerCase(var397);
                                            char var400 = Character.toLowerCase(var398);
                                            if (var399 != var400) {
                                                var383 = class214.method576(var399, var376) - class214.method576(var400, var376);
                                                break label2894;
                                            }
                                        }
                                    }
                                    int var401 = var377 - var378;
                                    if (var401 == 0) {
                                        for (int var402 = 0; var402 < var393; var402++) {
                                            char var403 = var374.charAt(var402);
                                            char var404 = var375.charAt(var402);
                                            if (var403 != var404) {
                                                var383 = class214.method576(var403, var376) - class214.method576(var404, var376);
                                                break label2894;
                                            }
                                        }
                                        var383 = 0;
                                    } else {
                                        var383 = var401;
                                    }
                                    break;
                                }
                                if (var379 - var381 >= var377) {
                                    var383 = -1;
                                    break;
                                }
                                if (var380 - var382 >= var378) {
                                    var383 = 1;
                                    break;
                                }
                                char var384;
                                if (var381 == 0) {
                                    var384 = var374.charAt(var379++);
                                } else {
                                    var384 = (char) var381;
                                    boolean var385 = false;
                                }
                                char var386;
                                if (var382 == 0) {
                                    var386 = var375.charAt(var380++);
                                } else {
                                    var386 = var382;
                                    boolean var387 = false;
                                }
                                byte var388;
                                if (var384 == 198) {
                                    var388 = 69;
                                } else if (var384 == 230) {
                                    var388 = 101;
                                } else if (var384 == 223) {
                                    var388 = 115;
                                } else if (var384 == 338) {
                                    var388 = 69;
                                } else if (var384 == 339) {
                                    var388 = 101;
                                } else {
                                    var388 = 0;
                                }
                                var381 = var388;
                                var382 = class214.method1886(var386);
                                char var389 = class214.method3192(var384, var376);
                                char var390 = class214.method3192(var386, var376);
                                if (var389 != var390 && Character.toUpperCase(var389) != Character.toUpperCase(var390)) {
                                    char var391 = Character.toLowerCase(var389);
                                    char var392 = Character.toLowerCase(var390);
                                    if (var391 != var392) {
                                        var383 = class214.method576(var391, var376) - class214.method576(var392, var376);
                                        break;
                                    }
                                }
                            }
                            var372[var373] = class211.method3485(var383);
                            continue;
                        }
                        if (var533 == 4108) {
                            var6--;
                            String var405 = field706[var6];
                            var5 -= 2;
                            int var406 = field716[var5];
                            int var407 = field716[var5 + 1];
                            byte[] var408 = Statics.field61.method2752(var407, 0);
                            class205 var409 = new class205(var408);
                            field716[var5++] = var409.method3503(var405, var406);
                            continue;
                        }
                        if (var533 == 4109) {
                            var6--;
                            String var410 = field706[var6];
                            var5 -= 2;
                            int var411 = field716[var5];
                            int var412 = field716[var5 + 1];
                            byte[] var413 = Statics.field61.method2752(var412, 0);
                            class205 var414 = new class205(var413);
                            field716[var5++] = var414.method3524(var410, var411);
                            continue;
                        }
                        if (var533 == 4110) {
                            var6 -= 2;
                            String var415 = field706[var6];
                            String var416 = field706[var6 + 1];
                            var5--;
                            if (field716[var5] == 1) {
                                field706[var6++] = var415;
                            } else {
                                field706[var6++] = var416;
                            }
                            continue;
                        }
                        if (var533 == 4111) {
                            var6--;
                            String var417 = field706[var6];
                            field706[var6++] = class204.method3578(var417);
                            continue;
                        }
                        if (var533 == 4112) {
                            var6--;
                            String var418 = field706[var6];
                            var5--;
                            int var419 = field716[var5];
                            field706[var6++] = var418 + (char) var419;
                            continue;
                        }
                        if (var533 == 4113) {
                            var5--;
                            int var420 = field716[var5];
                            int[] var421 = field716;
                            int var422 = var5++;
                            char var423 = (char) var420;
                            boolean var424;
                            if (var423 >= ' ' && var423 <= '~') {
                                var424 = true;
                            } else if (var423 >= 160 && var423 <= 255) {
                                var424 = true;
                            } else if (var423 == 8364 || var423 == 338 || var423 == 8212 || var423 == 339 || var423 == 376) {
                                var424 = true;
                            } else {
                                var424 = false;
                            }
                            var421[var422] = var424 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 4114) {
                            var5--;
                            int var425 = field716[var5];
                            field716[var5++] = class211.method1888((char) var425) ? 1 : 0;
                            continue;
                        }
                        if (var533 == 4115) {
                            var5--;
                            int var426 = field716[var5];
                            field716[var5++] = class211.method3067((char) var426) ? 1 : 0;
                            continue;
                        }
                        if (var533 == 4116) {
                            var5--;
                            int var427 = field716[var5];
                            int[] var428 = field716;
                            int var429 = var5++;
                            char var430 = (char) var427;
                            boolean var431 = var430 >= '0' && var430 <= '9';
                            var428[var429] = var431 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 4117) {
                            var6--;
                            String var432 = field706[var6];
                            if (var432 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var432.length();
                            }
                            continue;
                        }
                        if (var533 == 4118) {
                            var6--;
                            String var433 = field706[var6];
                            var5 -= 2;
                            int var434 = field716[var5];
                            int var435 = field716[var5 + 1];
                            field706[var6++] = var433.substring(var434, var435);
                            continue;
                        }
                        if (var533 == 4119) {
                            var6--;
                            String var436 = field706[var6];
                            StringBuilder var437 = new StringBuilder(var436.length());
                            boolean var438 = false;
                            for (int var439 = 0; var439 < var436.length(); var439++) {
                                char var440 = var436.charAt(var439);
                                if (var440 == '<') {
                                    var438 = true;
                                } else if (var440 == '>') {
                                    var438 = false;
                                } else if (!var438) {
                                    var437.append(var440);
                                }
                            }
                            field706[var6++] = var437.toString();
                            continue;
                        }
                        if (var533 == 4120) {
                            var6--;
                            String var441 = field706[var6];
                            var5--;
                            int var442 = field716[var5];
                            field716[var5++] = var441.indexOf(var442);
                            continue;
                        }
                        if (var533 == 4121) {
                            var6 -= 2;
                            String var443 = field706[var6];
                            String var444 = field706[var6 + 1];
                            var5--;
                            int var445 = field716[var5];
                            field716[var5++] = var443.indexOf(var444, var445);
                            continue;
                        }
                    } else if (var533 < 4300) {
                        if (var533 == 4200) {
                            var5--;
                            int var446 = field716[var5];
                            field706[var6++] = class46.method137(var446).field1014;
                            continue;
                        }
                        if (var533 == 4201) {
                            var5 -= 2;
                            int var447 = field716[var5];
                            int var448 = field716[var5 + 1];
                            class46 var449 = class46.method137(var447);
                            if (var448 >= 1 && var448 <= 5 && var449.field1025[var448 - 1] != null) {
                                field706[var6++] = var449.field1025[var448 - 1];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 4202) {
                            var5 -= 2;
                            int var450 = field716[var5];
                            int var451 = field716[var5 + 1];
                            class46 var452 = class46.method137(var450);
                            if (var451 >= 1 && var451 <= 5 && var452.field1003[var451 - 1] != null) {
                                field706[var6++] = var452.field1003[var451 - 1];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var533 == 4203) {
                            var5--;
                            int var453 = field716[var5];
                            field716[var5++] = class46.method137(var453).field1023;
                            continue;
                        }
                        if (var533 == 4204) {
                            var5--;
                            int var454 = field716[var5];
                            field716[var5++] = class46.method137(var454).field1022 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 4205) {
                            var5--;
                            int var455 = field716[var5];
                            class46 var456 = class46.method137(var455);
                            if (var456.field1016 == -1 && var456.field1033 >= 0) {
                                field716[var5++] = var456.field1033;
                                continue;
                            }
                            field716[var5++] = var455;
                            continue;
                        }
                        if (var533 == 4206) {
                            var5--;
                            int var457 = field716[var5];
                            class46 var458 = class46.method137(var457);
                            if (var458.field1016 >= 0 && var458.field1033 >= 0) {
                                field716[var5++] = var458.field1033;
                                continue;
                            }
                            field716[var5++] = var457;
                            continue;
                        }
                        if (var533 == 4207) {
                            var5--;
                            int var459 = field716[var5];
                            field716[var5++] = class46.method137(var459).field1024 ? 1 : 0;
                            continue;
                        }
                        if (var533 == 4210) {
                            var6--;
                            String var460 = field706[var6];
                            var5--;
                            int var461 = field716[var5];
                            boolean var463 = var461 == 1;
                            Statics.field2783.field2455 = false;
                            String var464 = var460.toLowerCase();
                            short[] var465 = new short[16];
                            int var466 = 0;
                            int var467 = 0;
                            while (true) {
                                if (var467 >= Statics.field1005) {
                                    Statics.field1279 = var465;
                                    Statics.field205 = 0;
                                    Statics.field2113 = var466;
                                    String[] var471 = new String[Statics.field2113];
                                    for (int var472 = 0; var472 < Statics.field2113; var472++) {
                                        var471[var472] = class46.method137(var465[var472]).field1014;
                                    }
                                    short[] var473 = Statics.field1279;
                                    class113.method2084(var471, var473, 0, var471.length - 1);
                                    Statics.field2783.method2762();
                                    Statics.field2783.field2455 = true;
                                    break;
                                }
                                class46 var468 = class46.method137(var467);
                                if ((!var463 || var468.field1045) && var468.field1016 == -1 && var468.field1014.toLowerCase().indexOf(var464) != -1) {
                                    if (var466 >= 250) {
                                        Statics.field2113 = -1;
                                        Statics.field1279 = null;
                                        break;
                                    }
                                    if (var466 >= var465.length) {
                                        short[] var469 = new short[var465.length * 2];
                                        for (int var470 = 0; var470 < var466; var470++) {
                                            var469[var470] = var465[var470];
                                        }
                                        var465 = var469;
                                    }
                                    var465[var466++] = (short) var467;
                                }
                                var467++;
                            }
                            field716[var5++] = Statics.field2113;
                            continue;
                        }
                        if (var533 == 4211) {
                            if (Statics.field1279 != null && Statics.field205 < Statics.field2113) {
                                field716[var5++] = Statics.field1279[++Statics.field205 - 1] & 0xFFFF;
                                continue;
                            }
                            field716[var5++] = -1;
                            continue;
                        }
                        if (var533 == 4212) {
                            Statics.field205 = 0;
                            continue;
                        }
                    } else if (var533 < 5100) {
                        if (var533 == 5000) {
                            field716[var5++] = client.field453;
                            continue;
                        }
                        if (var533 == 5001) {
                            var5 -= 3;
                            client.field453 = field716[var5];
                            Statics.field826 = class119.method1785(field716[var5 + 1]);
                            if (Statics.field826 == null) {
                                Statics.field826 = class119.field1898;
                            }
                            client.field454 = field716[var5 + 2];
                            client.field261.method2391(30);
                            client.field261.method2226(client.field453);
                            client.field261.method2226(Statics.field826.field1895);
                            client.field261.method2226(client.field454);
                            continue;
                        }
                        if (var533 == 5002) {
                            var6--;
                            String var474 = field706[var6];
                            var5 -= 2;
                            int var475 = field716[var5];
                            int var476 = field716[var5 + 1];
                            client.field261.method2391(196);
                            class111 var477 = client.field261;
                            int var478 = var474.length() + 1;
                            var477.method2226(var478 + 2);
                            client.field261.method2152(var474);
                            client.field261.method2226(var475 - 1);
                            client.field261.method2226(var476);
                            continue;
                        }
                        if (var533 == 5003) {
                            var5 -= 2;
                            int var479 = field716[var5];
                            int var480 = field716[var5 + 1];
                            class32 var481 = class10.method572(var479, var480);
                            if (var481 == null) {
                                field716[var5++] = -1;
                                field716[var5++] = 0;
                                field706[var6++] = "";
                                field706[var6++] = "";
                                field706[var6++] = "";
                            } else {
                                field716[var5++] = var481.field695;
                                field716[var5++] = var481.field692;
                                field706[var6++] = var481.field691 == null ? "" : var481.field691;
                                field706[var6++] = var481.field694 == null ? "" : var481.field694;
                                field706[var6++] = var481.field696 == null ? "" : var481.field696;
                            }
                            continue;
                        }
                        if (var533 == 5004) {
                            var5--;
                            int var482 = field716[var5];
                            class32 var483 = class10.method159(var482);
                            if (var483 == null) {
                                field716[var5++] = -1;
                                field716[var5++] = 0;
                                field706[var6++] = "";
                                field706[var6++] = "";
                                field706[var6++] = "";
                            } else {
                                field716[var5++] = var483.field693;
                                field716[var5++] = var483.field692;
                                field706[var6++] = var483.field691 == null ? "" : var483.field691;
                                field706[var6++] = var483.field694 == null ? "" : var483.field694;
                                field706[var6++] = var483.field696 == null ? "" : var483.field696;
                            }
                            continue;
                        }
                        if (var533 == 5005) {
                            if (Statics.field826 == null) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = Statics.field826.field1895;
                            }
                            continue;
                        }
                        if (var533 == 5008) {
                            var6--;
                            String var484 = field706[var6];
                            var5--;
                            int var485 = field716[var5];
                            String var486 = var484.toLowerCase();
                            byte var487 = 0;
                            if (var486.startsWith(class145.field2241)) {
                                var487 = 0;
                                var484 = var484.substring(class145.field2241.length());
                            } else if (var486.startsWith(class145.field2315)) {
                                var487 = 1;
                                var484 = var484.substring(class145.field2315.length());
                            } else if (var486.startsWith(class145.field2317)) {
                                var487 = 2;
                                var484 = var484.substring(class145.field2317.length());
                            } else if (var486.startsWith(class145.field2319)) {
                                var487 = 3;
                                var484 = var484.substring(class145.field2319.length());
                            } else if (var486.startsWith(class145.field2331)) {
                                var487 = 4;
                                var484 = var484.substring(class145.field2331.length());
                            } else if (var486.startsWith(class145.field2214)) {
                                var487 = 5;
                                var484 = var484.substring(class145.field2214.length());
                            } else if (var486.startsWith(class145.field2325)) {
                                var487 = 6;
                                var484 = var484.substring(class145.field2325.length());
                            } else if (var486.startsWith(class145.field2327)) {
                                var487 = 7;
                                var484 = var484.substring(class145.field2327.length());
                            } else if (var486.startsWith(class145.field2318)) {
                                var487 = 8;
                                var484 = var484.substring(class145.field2318.length());
                            } else if (var486.startsWith(class145.field2286)) {
                                var487 = 9;
                                var484 = var484.substring(class145.field2286.length());
                            } else if (var486.startsWith(class145.field2333)) {
                                var487 = 10;
                                var484 = var484.substring(class145.field2333.length());
                            } else if (var486.startsWith(class145.field2335)) {
                                var487 = 11;
                                var484 = var484.substring(class145.field2335.length());
                            } else if (client.field497 != 0) {
                                if (var486.startsWith(class145.field2314)) {
                                    var487 = 0;
                                    var484 = var484.substring(class145.field2314.length());
                                } else if (var486.startsWith(class145.field2171)) {
                                    var487 = 1;
                                    var484 = var484.substring(class145.field2171.length());
                                } else if (var486.startsWith(class145.field2384)) {
                                    var487 = 2;
                                    var484 = var484.substring(class145.field2384.length());
                                } else if (var486.startsWith(class145.field2320)) {
                                    var487 = 3;
                                    var484 = var484.substring(class145.field2320.length());
                                } else if (var486.startsWith(class145.field2322)) {
                                    var487 = 4;
                                    var484 = var484.substring(class145.field2322.length());
                                } else if (var486.startsWith(class145.field2375)) {
                                    var487 = 5;
                                    var484 = var484.substring(class145.field2375.length());
                                } else if (var486.startsWith(class145.field2326)) {
                                    var487 = 6;
                                    var484 = var484.substring(class145.field2326.length());
                                } else if (var486.startsWith(class145.field2328)) {
                                    var487 = 7;
                                    var484 = var484.substring(class145.field2328.length());
                                } else if (var486.startsWith(class145.field2302)) {
                                    var487 = 8;
                                    var484 = var484.substring(class145.field2302.length());
                                } else if (var486.startsWith(class145.field2332)) {
                                    var487 = 9;
                                    var484 = var484.substring(class145.field2332.length());
                                } else if (var486.startsWith(class145.field2334)) {
                                    var487 = 10;
                                    var484 = var484.substring(class145.field2334.length());
                                } else if (var486.startsWith(class145.field2336)) {
                                    var487 = 11;
                                    var484 = var484.substring(class145.field2336.length());
                                }
                            }
                            String var488 = var484.toLowerCase();
                            byte var489 = 0;
                            if (var488.startsWith(class145.field2337)) {
                                var489 = 1;
                                var484 = var484.substring(class145.field2337.length());
                            } else if (var488.startsWith(class145.field2242)) {
                                var489 = 2;
                                var484 = var484.substring(class145.field2242.length());
                            } else if (var488.startsWith(class145.field2341)) {
                                var489 = 3;
                                var484 = var484.substring(class145.field2341.length());
                            } else if (var488.startsWith(class145.field2343)) {
                                var489 = 4;
                                var484 = var484.substring(class145.field2343.length());
                            } else if (var488.startsWith(class145.field2345)) {
                                var489 = 5;
                                var484 = var484.substring(class145.field2345.length());
                            } else if (client.field497 != 0) {
                                if (var488.startsWith(class145.field2227)) {
                                    var489 = 1;
                                    var484 = var484.substring(class145.field2227.length());
                                } else if (var488.startsWith(class145.field2340)) {
                                    var489 = 2;
                                    var484 = var484.substring(class145.field2340.length());
                                } else if (var488.startsWith(class145.field2342)) {
                                    var489 = 3;
                                    var484 = var484.substring(class145.field2342.length());
                                } else if (var488.startsWith(class145.field2272)) {
                                    var489 = 4;
                                    var484 = var484.substring(class145.field2272.length());
                                } else if (var488.startsWith(class145.field2330)) {
                                    var489 = 5;
                                    var484 = var484.substring(class145.field2330.length());
                                }
                            }
                            client.field261.method2391(67);
                            client.field261.method2226(0);
                            int var490 = client.field261.field1823;
                            client.field261.method2226(var485);
                            client.field261.method2226(var487);
                            client.field261.method2226(var489);
                            class111 var491 = client.field261;
                            int var492 = var491.field1823;
                            int var493 = var484.length();
                            byte[] var494 = new byte[var493];
                            for (int var495 = 0; var495 < var493; var495++) {
                                char var496 = var484.charAt(var495);
                                if (var496 > 0 && var496 < 128 || var496 >= 160 && var496 <= 255) {
                                    var494[var495] = (byte) var496;
                                } else if (var496 == 8364) {
                                    var494[var495] = -128;
                                } else if (var496 == 8218) {
                                    var494[var495] = -126;
                                } else if (var496 == 402) {
                                    var494[var495] = -125;
                                } else if (var496 == 8222) {
                                    var494[var495] = -124;
                                } else if (var496 == 8230) {
                                    var494[var495] = -123;
                                } else if (var496 == 8224) {
                                    var494[var495] = -122;
                                } else if (var496 == 8225) {
                                    var494[var495] = -121;
                                } else if (var496 == 710) {
                                    var494[var495] = -120;
                                } else if (var496 == 8240) {
                                    var494[var495] = -119;
                                } else if (var496 == 352) {
                                    var494[var495] = -118;
                                } else if (var496 == 8249) {
                                    var494[var495] = -117;
                                } else if (var496 == 338) {
                                    var494[var495] = -116;
                                } else if (var496 == 381) {
                                    var494[var495] = -114;
                                } else if (var496 == 8216) {
                                    var494[var495] = -111;
                                } else if (var496 == 8217) {
                                    var494[var495] = -110;
                                } else if (var496 == 8220) {
                                    var494[var495] = -109;
                                } else if (var496 == 8221) {
                                    var494[var495] = -108;
                                } else if (var496 == 8226) {
                                    var494[var495] = -107;
                                } else if (var496 == 8211) {
                                    var494[var495] = -106;
                                } else if (var496 == 8212) {
                                    var494[var495] = -105;
                                } else if (var496 == 732) {
                                    var494[var495] = -104;
                                } else if (var496 == 8482) {
                                    var494[var495] = -103;
                                } else if (var496 == 353) {
                                    var494[var495] = -102;
                                } else if (var496 == 8250) {
                                    var494[var495] = -101;
                                } else if (var496 == 339) {
                                    var494[var495] = -100;
                                } else if (var496 == 382) {
                                    var494[var495] = -98;
                                } else if (var496 == 376) {
                                    var494[var495] = -97;
                                } else {
                                    var494[var495] = 63;
                                }
                            }
                            var491.method2159(var494.length);
                            var491.field1823 += Statics.field2951.method2088(var494, 0, var494.length, var491.field1828, var491.field1823);
                            client.field261.method2158(client.field261.field1823 - var490);
                            continue;
                        }
                        if (var533 == 5009) {
                            var6 -= 2;
                            String var499 = field706[var6];
                            String var500 = field706[var6 + 1];
                            client.field261.method2391(249);
                            client.field261.method2148(0);
                            int var501 = client.field261.field1823;
                            client.field261.method2152(var499);
                            class111 var502 = client.field261;
                            int var503 = var502.field1823;
                            int var504 = var500.length();
                            byte[] var505 = new byte[var504];
                            for (int var506 = 0; var506 < var504; var506++) {
                                char var507 = var500.charAt(var506);
                                if (var507 > 0 && var507 < 128 || var507 >= 160 && var507 <= 255) {
                                    var505[var506] = (byte) var507;
                                } else if (var507 == 8364) {
                                    var505[var506] = -128;
                                } else if (var507 == 8218) {
                                    var505[var506] = -126;
                                } else if (var507 == 402) {
                                    var505[var506] = -125;
                                } else if (var507 == 8222) {
                                    var505[var506] = -124;
                                } else if (var507 == 8230) {
                                    var505[var506] = -123;
                                } else if (var507 == 8224) {
                                    var505[var506] = -122;
                                } else if (var507 == 8225) {
                                    var505[var506] = -121;
                                } else if (var507 == 710) {
                                    var505[var506] = -120;
                                } else if (var507 == 8240) {
                                    var505[var506] = -119;
                                } else if (var507 == 352) {
                                    var505[var506] = -118;
                                } else if (var507 == 8249) {
                                    var505[var506] = -117;
                                } else if (var507 == 338) {
                                    var505[var506] = -116;
                                } else if (var507 == 381) {
                                    var505[var506] = -114;
                                } else if (var507 == 8216) {
                                    var505[var506] = -111;
                                } else if (var507 == 8217) {
                                    var505[var506] = -110;
                                } else if (var507 == 8220) {
                                    var505[var506] = -109;
                                } else if (var507 == 8221) {
                                    var505[var506] = -108;
                                } else if (var507 == 8226) {
                                    var505[var506] = -107;
                                } else if (var507 == 8211) {
                                    var505[var506] = -106;
                                } else if (var507 == 8212) {
                                    var505[var506] = -105;
                                } else if (var507 == 732) {
                                    var505[var506] = -104;
                                } else if (var507 == 8482) {
                                    var505[var506] = -103;
                                } else if (var507 == 353) {
                                    var505[var506] = -102;
                                } else if (var507 == 8250) {
                                    var505[var506] = -101;
                                } else if (var507 == 339) {
                                    var505[var506] = -100;
                                } else if (var507 == 382) {
                                    var505[var506] = -98;
                                } else if (var507 == 376) {
                                    var505[var506] = -97;
                                } else {
                                    var505[var506] = 63;
                                }
                            }
                            var502.method2159(var505.length);
                            var502.field1823 += Statics.field2951.method2088(var505, 0, var505.length, var502.field1828, var502.field1823);
                            client.field261.method2157(client.field261.field1823 - var501);
                            continue;
                        }
                        if (var533 == 5015) {
                            String var510;
                            if (Statics.field216 == null || Statics.field216.field49 == null) {
                                var510 = "";
                            } else {
                                var510 = Statics.field216.field49;
                            }
                            field706[var6++] = var510;
                            continue;
                        }
                        if (var533 == 5016) {
                            field716[var5++] = client.field454;
                            continue;
                        }
                        if (var533 == 5017) {
                            var5--;
                            int var511 = field716[var5];
                            int[] var512 = field716;
                            int var513 = var5++;
                            class25 var514 = (class25) class10.field146.get(var511);
                            int var515;
                            if (var514 == null) {
                                var515 = 0;
                            } else {
                                var515 = var514.method515();
                            }
                            var512[var513] = var515;
                            continue;
                        }
                        if (var533 == 5018) {
                            var5--;
                            int var516 = field716[var5];
                            int[] var517 = field716;
                            int var518 = var5++;
                            class32 var519 = (class32) class10.field144.method3267((long) var516);
                            int var520;
                            if (var519 == null) {
                                var520 = -1;
                            } else if (class10.field145.field2871 == var519.field2876) {
                                var520 = -1;
                            } else {
                                var520 = ((class32) var519.field2876).field695;
                            }
                            var517[var518] = var520;
                            continue;
                        }
                        if (var533 == 5019) {
                            var5--;
                            int var521 = field716[var5];
                            int[] var522 = field716;
                            int var523 = var5++;
                            class32 var524 = (class32) class10.field144.method3267((long) var521);
                            int var525;
                            if (var524 == null) {
                                var525 = -1;
                            } else if (class10.field145.field2871 == var524.field2875) {
                                var525 = -1;
                            } else {
                                var525 = ((class32) var524.field2875).field695;
                            }
                            var522[var523] = var525;
                            continue;
                        }
                        if (var533 == 5020) {
                            var6--;
                            String var526 = field706[var6];
                            client.method2434(var526);
                            continue;
                        }
                        if (var533 == 5021) {
                            var6--;
                            client.field455 = field706[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var533 == 5022) {
                            field706[var6++] = client.field455;
                            continue;
                        }
                    }
                }
                if (var533 >= 5600 || var533 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var527 = field716[var5];
                int var528 = field716[var5 + 1];
                if (!client.field439) {
                    client.field319 = var527;
                    client.field320 = var528;
                }
            }
        } catch (Exception var532) {
            StringBuilder var530 = new StringBuilder(30);
            var530.append("").append(var4.field2886).append(" ");
            for (int var531 = field707 - 1; var531 >= 0; var531--) {
                var530.append("").append(field708[var531].field178.field2886).append(" ");
            }
            var530.append("").append(var10);
            class137.method2490(var530.toString(), var532);
        }
    }

    @ObfuscatedName("k.g(II)V")
    public static void method494(int arg0) {
        if (arg0 == -1 || !class155.method731(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2552[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3.field2593 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field12 = var3.field2593;
                method2613(var4, 2000000);
            }
        }
    }
}
