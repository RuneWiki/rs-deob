package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ai")
public class class32 {

    @ObfuscatedName("ai.h")
    public static int[] field705 = new int[5];

    @ObfuscatedName("ai.l")
    public static int[][] field701 = new int[5][5000];

    @ObfuscatedName("ai.e")
    public static int[] field706 = new int[1000];

    @ObfuscatedName("ai.u")
    public static String[] field707 = new String[1000];

    @ObfuscatedName("ai.j")
    public static int field708 = 0;

    @ObfuscatedName("ai.c")
    public static class13[] field704 = new class13[50];

    @ObfuscatedName("ai.n")
    public static Calendar field710 = Calendar.getInstance();

    @ObfuscatedName("ai.z")
    public static final String[] field711 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.k(Lk;I)V")
    public static void method1424(class1 arg0) {
        method136(arg0, 200000);
    }

    @ObfuscatedName("z.y(Lk;II)V")
    public static void method136(class1 arg0, int arg1) {
        Object[] var2 = arg0.field7;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2070(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field520;
        int[] var9 = var4.field530;
        byte var10 = -1;
        field708 = 0;
        try {
            Statics.field2976 = new int[var4.field523];
            int var11 = 0;
            Statics.field703 = new String[var4.field519];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2543;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2656;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field15 == null ? -1 : arg0.field15.field2543;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field15 == null ? -1 : arg0.field15.field2656;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1;
                    }
                    Statics.field2976[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field703[var12++] = var15;
                }
            }
            int var16 = 0;
            label2772: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var442 = var8[var7];
                if (var442 < 100) {
                    if (var442 == 0) {
                        field706[var5++] = var9[var7];
                        continue;
                    }
                    if (var442 == 1) {
                        int var17 = var9[var7];
                        field706[var5++] = class155.field2670[var17];
                        continue;
                    }
                    if (var442 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class155.field2670[var18] = field706[var5];
                        client.method2431(var18);
                        continue;
                    }
                    if (var442 == 3) {
                        field707[var6++] = var4.field524[var7];
                        continue;
                    }
                    if (var442 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var442 == 7) {
                        var5 -= 2;
                        if (field706[var5 + 1] != field706[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var442 == 8) {
                        var5 -= 2;
                        if (field706[var5 + 1] == field706[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var442 == 9) {
                        var5 -= 2;
                        if (field706[var5] < field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var442 == 10) {
                        var5 -= 2;
                        if (field706[var5] > field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var442 == 21) {
                        if (field708 == 0) {
                            return;
                        }
                        class13 var19 = field704[--field708];
                        var4 = var19.field172;
                        var8 = var4.field520;
                        var9 = var4.field530;
                        var7 = var19.field179;
                        Statics.field2976 = var19.field178;
                        Statics.field703 = var19.field173;
                        continue;
                    }
                    if (var442 == 25) {
                        int var20 = var9[var7];
                        field706[var5++] = class155.method549(var20);
                        continue;
                    }
                    if (var442 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field706[var5];
                        class42 var23 = (class42) class42.field956.method3202((long) var21);
                        class42 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field965.method2729(14, var21);
                            class42 var26 = new class42();
                            if (var25 != null) {
                                var26.method799(new class107(var25));
                            }
                            class42.field956.method3204(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field957;
                        int var29 = var24.field955;
                        int var30 = var24.field958;
                        int var31 = class155.field2672[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class155.field2670[var28] = class155.field2670[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var442 == 31) {
                        var5 -= 2;
                        if (field706[var5] <= field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var442 == 32) {
                        var5 -= 2;
                        if (field706[var5] >= field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var442 == 33) {
                        field706[var5++] = Statics.field2976[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var442 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2976[var10001] = field706[var5];
                        continue;
                    }
                    if (var442 == 35) {
                        field707[var6++] = Statics.field703[var9[var7]];
                        continue;
                    }
                    if (var442 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field703[var10001] = field707[var6];
                        continue;
                    }
                    if (var442 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class200.method4(field707, var6, var33);
                        field707[var6++] = var34;
                        continue;
                    }
                    if (var442 == 38) {
                        var5--;
                        continue;
                    }
                    if (var442 == 39) {
                        var6--;
                        continue;
                    }
                    if (var442 == 40) {
                        int var35 = var9[var7];
                        class19 var36 = class19.method2070(var35);
                        int[] var37 = new int[var36.field523];
                        String[] var38 = new String[var36.field519];
                        for (int var39 = 0; var39 < var36.field525; var39++) {
                            var37[var39] = field706[var5 - var36.field525 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field526; var40++) {
                            var38[var40] = field707[var6 - var36.field526 + var40];
                        }
                        var5 -= var36.field525;
                        var6 -= var36.field526;
                        class13 var41 = new class13();
                        var41.field172 = var4;
                        var41.field179 = var7;
                        var41.field178 = Statics.field2976;
                        var41.field173 = Statics.field703;
                        field704[++field708 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field520;
                        var9 = var36.field530;
                        var7 = -1;
                        Statics.field2976 = var37;
                        Statics.field703 = var38;
                        continue;
                    }
                    if (var442 == 42) {
                        field706[var5++] = client.field428[var9[var7]];
                        continue;
                    }
                    if (var442 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field428[var10001] = field706[var5];
                        continue;
                    }
                    if (var442 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field706[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field705[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2772;
                                }
                                field701[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var442 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field706[var5];
                        if (var48 >= 0 && var48 < field705[var47]) {
                            field706[var5++] = field701[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var442 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field706[var5];
                        if (var50 >= 0 && var50 < field705[var49]) {
                            field701[var49][var50] = field706[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var442 == 47) {
                        String var51 = client.field439[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field707[var6++] = var51;
                        continue;
                    }
                    if (var442 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field439[var10001] = field707[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var442 < 1000) {
                    if (var442 == 100) {
                        var5 -= 3;
                        int var53 = field706[var5];
                        int var54 = field706[var5 + 1];
                        int var55 = field706[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class153 var56 = class153.method2702(var53);
                        if (var56.field2560 == null) {
                            var56.field2560 = new class153[var55 + 1];
                        }
                        if (var56.field2560.length <= var55) {
                            class153[] var57 = new class153[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2560.length; var58++) {
                                var57[var58] = var56.field2560[var58];
                            }
                            var56.field2560 = var57;
                        }
                        if (var55 > 0 && var56.field2560[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class153 var59 = new class153();
                        var59.field2545 = var54;
                        var59.field2554 = var59.field2543 = var56.field2543;
                        var59.field2656 = var55;
                        var59.field2596 = true;
                        var56.field2560[var55] = var59;
                        if (var52) {
                            Statics.field61 = var59;
                        } else {
                            Statics.field2041 = var59;
                        }
                        client.method2520(var56);
                        continue;
                    }
                    if (var442 == 101) {
                        class153 var60 = var52 ? Statics.field61 : Statics.field2041;
                        class153 var61 = class153.method2702(var60.field2543);
                        var61.field2560[var60.field2656] = null;
                        client.method2520(var61);
                        continue;
                    }
                    if (var442 == 102) {
                        var5--;
                        class153 var62 = class153.method2702(field706[var5]);
                        var62.field2560 = null;
                        client.method2520(var62);
                        continue;
                    }
                    if (var442 == 200) {
                        var5 -= 2;
                        int var63 = field706[var5];
                        int var64 = field706[var5 + 1];
                        class153 var65 = class153.method1(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field706[var5++] = 1;
                            if (var52) {
                                Statics.field61 = var65;
                            } else {
                                Statics.field2041 = var65;
                            }
                            continue;
                        }
                        field706[var5++] = 0;
                        continue;
                    }
                } else if (var442 >= 1000 && var442 < 1100 || var442 >= 2000 && var442 < 2100) {
                    class153 var66;
                    if (var442 >= 2000) {
                        var442 -= 1000;
                        var5--;
                        var66 = class153.method2702(field706[var5]);
                    } else {
                        var66 = var52 ? Statics.field61 : Statics.field2041;
                    }
                    if (var442 == 1000) {
                        var5 -= 2;
                        var66.field2588 = field706[var5];
                        var66.field2549 = field706[var5 + 1];
                        client.method2520(var66);
                        continue;
                    }
                    if (var442 == 1001) {
                        var5 -= 2;
                        var66.field2552 = field706[var5];
                        var66.field2649 = field706[var5 + 1];
                        client.method2520(var66);
                        continue;
                    }
                    if (var442 == 1003) {
                        var5--;
                        boolean var67 = field706[var5] == 1;
                        if (var66.field2555 != var67) {
                            var66.field2555 = var67;
                            client.method2520(var66);
                        }
                        continue;
                    }
                } else if (var442 >= 1100 && var442 < 1200 || var442 >= 2100 && var442 < 2200) {
                    class153 var68;
                    if (var442 >= 2000) {
                        var442 -= 1000;
                        var5--;
                        var68 = class153.method2702(field706[var5]);
                    } else {
                        var68 = var52 ? Statics.field61 : Statics.field2041;
                    }
                    if (var442 == 1100) {
                        var5 -= 2;
                        var68.field2556 = field706[var5];
                        if (var68.field2556 > var68.field2625 - var68.field2552) {
                            var68.field2556 = var68.field2625 - var68.field2552;
                        }
                        if (var68.field2556 < 0) {
                            var68.field2556 = 0;
                        }
                        var68.field2557 = field706[var5 + 1];
                        if (var68.field2557 > var68.field2559 - var68.field2649) {
                            var68.field2557 = var68.field2559 - var68.field2649;
                        }
                        if (var68.field2557 < 0) {
                            var68.field2557 = 0;
                        }
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1101) {
                        var5--;
                        var68.field2564 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1102) {
                        var5--;
                        var68.field2547 = field706[var5] == 1;
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1103) {
                        var5--;
                        var68.field2653 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1104) {
                        var5--;
                        var68.field2566 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1105) {
                        var5--;
                        var68.field2642 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1106) {
                        var5--;
                        var68.field2621 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1107) {
                        var5--;
                        var68.field2643 = field706[var5] == 1;
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1108) {
                        var68.field2610 = 1;
                        var5--;
                        var68.field2576 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1109) {
                        var5 -= 6;
                        var68.field2581 = field706[var5];
                        var68.field2582 = field706[var5 + 1];
                        var68.field2583 = field706[var5 + 2];
                        var68.field2584 = field706[var5 + 3];
                        var68.field2585 = field706[var5 + 4];
                        var68.field2604 = field706[var5 + 5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1110) {
                        var5--;
                        int var69 = field706[var5];
                        if (var68.field2622 != var69) {
                            var68.field2622 = var69;
                            var68.field2617 = 0;
                            var68.field2650 = 0;
                            client.method2520(var68);
                        }
                        continue;
                    }
                    if (var442 == 1111) {
                        var5--;
                        var68.field2614 = field706[var5] == 1;
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1112) {
                        var6--;
                        String var70 = field707[var6];
                        if (!var70.equals(var68.field2590)) {
                            var68.field2590 = var70;
                            client.method2520(var68);
                        }
                        continue;
                    }
                    if (var442 == 1113) {
                        var5--;
                        var68.field2589 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1114) {
                        var5 -= 3;
                        var68.field2637 = field706[var5];
                        var68.field2594 = field706[var5 + 1];
                        var68.field2558 = field706[var5 + 2];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1115) {
                        var5--;
                        var68.field2595 = field706[var5] == 1;
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1116) {
                        var5--;
                        var68.field2571 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1117) {
                        var5--;
                        var68.field2572 = field706[var5];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1118) {
                        var5--;
                        var68.field2573 = field706[var5] == 1;
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1119) {
                        var5--;
                        var68.field2574 = field706[var5] == 1;
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1120) {
                        var5 -= 2;
                        var68.field2625 = field706[var5];
                        var68.field2559 = field706[var5 + 1];
                        client.method2520(var68);
                        continue;
                    }
                    if (var442 == 1121) {
                        int var71 = var68.field2543;
                        int var72 = var68.field2656;
                        client.field282.method2366(189);
                        client.field282.method2169(var72);
                        client.field282.method2180(var71);
                        client.field451 = var68;
                        client.method2520(var68);
                        continue;
                    }
                } else if (!(var442 < 1200 || var442 >= 1300) || !(var442 < 2200 || var442 >= 2300)) {
                    class153 var73;
                    if (var442 >= 2000) {
                        var442 -= 1000;
                        var5--;
                        var73 = class153.method2702(field706[var5]);
                    } else {
                        var73 = var52 ? Statics.field61 : Statics.field2041;
                    }
                    client.method2520(var73);
                    if (var442 == 1200) {
                        var5 -= 2;
                        int var74 = field706[var5];
                        int var75 = field706[var5 + 1];
                        var73.field2586 = var74;
                        var73.field2579 = var75;
                        class45 var76 = class45.method114(var74);
                        var73.field2583 = var76.field1004;
                        var73.field2584 = var76.field1010;
                        var73.field2585 = var76.field1029;
                        var73.field2581 = var76.field1030;
                        var73.field2582 = var76.field1008;
                        var73.field2604 = var76.field1019;
                        if (var73.field2552 > 0) {
                            var73.field2604 = var73.field2604 * 32 / var73.field2552;
                        }
                        continue;
                    }
                    if (var442 == 1201) {
                        var73.field2610 = 2;
                        var5--;
                        var73.field2576 = field706[var5];
                        continue;
                    }
                    if (var442 == 1202) {
                        var73.field2610 = 3;
                        var73.field2576 = Statics.field590.field29.method2957();
                        continue;
                    }
                } else if (var442 >= 1300 && var442 < 1400 || var442 >= 2300 && var442 < 2400) {
                    class153 var77;
                    if (var442 >= 2000) {
                        var442 -= 1000;
                        var5--;
                        var77 = class153.method2702(field706[var5]);
                    } else {
                        var77 = var52 ? Statics.field61 : Statics.field2041;
                    }
                    if (var442 == 1300) {
                        var5--;
                        int var78 = field706[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method2888(var78, field707[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var442 == 1301) {
                        var5 -= 2;
                        int var79 = field706[var5];
                        int var80 = field706[var5 + 1];
                        var77.field2605 = class153.method1(var79, var80);
                        continue;
                    }
                    if (var442 == 1302) {
                        var5--;
                        var77.field2608 = field706[var5] == 1;
                        continue;
                    }
                    if (var442 == 1303) {
                        var5--;
                        var77.field2606 = field706[var5];
                        continue;
                    }
                    if (var442 == 1304) {
                        var5--;
                        var77.field2629 = field706[var5];
                        continue;
                    }
                    if (var442 == 1305) {
                        var6--;
                        var77.field2603 = field707[var6];
                        continue;
                    }
                    if (var442 == 1306) {
                        var6--;
                        var77.field2627 = field707[var6];
                        continue;
                    }
                    if (var442 == 1307) {
                        var77.field2570 = null;
                        continue;
                    }
                } else {
                    if (var442 >= 1400 && var442 < 1500 || var442 >= 2400 && var442 < 2500) {
                        class153 var81;
                        if (var442 >= 2000) {
                            var442 -= 1000;
                            var5--;
                            var81 = class153.method2702(field706[var5]);
                        } else {
                            var81 = var52 ? Statics.field61 : Statics.field2041;
                        }
                        var6--;
                        String var82 = field707[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field706[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field706[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field707[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field706[var5]);
                            }
                        }
                        var5--;
                        int var87 = field706[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var442 == 1400) {
                            var81.field2612 = var85;
                        }
                        if (var442 == 1401) {
                            var81.field2615 = var85;
                        }
                        if (var442 == 1402) {
                            var81.field2592 = var85;
                        }
                        if (var442 == 1403) {
                            var81.field2575 = var85;
                        }
                        if (var442 == 1404) {
                            var81.field2618 = var85;
                        }
                        if (var442 == 1405) {
                            var81.field2619 = var85;
                        }
                        if (var442 == 1406) {
                            var81.field2567 = var85;
                        }
                        if (var442 == 1407) {
                            var81.field2597 = var85;
                            var81.field2624 = var83;
                        }
                        if (var442 == 1408) {
                            var81.field2633 = var85;
                        }
                        if (var442 == 1409) {
                            var81.field2540 = var85;
                        }
                        if (var442 == 1410) {
                            var81.field2620 = var85;
                        }
                        if (var442 == 1411) {
                            var81.field2613 = var85;
                        }
                        if (var442 == 1412) {
                            var81.field2569 = var85;
                        }
                        if (var442 == 1414) {
                            var81.field2600 = var85;
                            var81.field2546 = var83;
                        }
                        if (var442 == 1415) {
                            var81.field2647 = var85;
                            var81.field2607 = var83;
                        }
                        if (var442 == 1416) {
                            var81.field2539 = var85;
                        }
                        if (var442 == 1417) {
                            var81.field2631 = var85;
                        }
                        if (var442 == 1418) {
                            var81.field2632 = var85;
                        }
                        if (var442 == 1419) {
                            var81.field2537 = var85;
                        }
                        if (var442 == 1420) {
                            var81.field2634 = var85;
                        }
                        if (var442 == 1421) {
                            var81.field2635 = var85;
                        }
                        if (var442 == 1422) {
                            var81.field2636 = var85;
                        }
                        if (var442 == 1423) {
                            var81.field2544 = var85;
                        }
                        if (var442 == 1424) {
                            var81.field2638 = var85;
                        }
                        var81.field2630 = true;
                        continue;
                    }
                    if (var442 < 1600) {
                        class153 var88 = var52 ? Statics.field61 : Statics.field2041;
                        if (var442 == 1500) {
                            field706[var5++] = var88.field2588;
                            continue;
                        }
                        if (var442 == 1501) {
                            field706[var5++] = var88.field2549;
                            continue;
                        }
                        if (var442 == 1502) {
                            field706[var5++] = var88.field2552;
                            continue;
                        }
                        if (var442 == 1503) {
                            field706[var5++] = var88.field2649;
                            continue;
                        }
                        if (var442 == 1504) {
                            field706[var5++] = var88.field2555 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 1505) {
                            field706[var5++] = var88.field2554;
                            continue;
                        }
                    } else if (var442 < 1700) {
                        class153 var89 = var52 ? Statics.field61 : Statics.field2041;
                        if (var442 == 1600) {
                            field706[var5++] = var89.field2556;
                            continue;
                        }
                        if (var442 == 1601) {
                            field706[var5++] = var89.field2557;
                            continue;
                        }
                        if (var442 == 1602) {
                            field707[var6++] = var89.field2590;
                            continue;
                        }
                        if (var442 == 1603) {
                            field706[var5++] = var89.field2625;
                            continue;
                        }
                        if (var442 == 1604) {
                            field706[var5++] = var89.field2559;
                            continue;
                        }
                        if (var442 == 1605) {
                            field706[var5++] = var89.field2604;
                            continue;
                        }
                        if (var442 == 1606) {
                            field706[var5++] = var89.field2583;
                            continue;
                        }
                        if (var442 == 1607) {
                            field706[var5++] = var89.field2585;
                            continue;
                        }
                        if (var442 == 1608) {
                            field706[var5++] = var89.field2584;
                            continue;
                        }
                    } else if (var442 < 1800) {
                        class153 var90 = var52 ? Statics.field61 : Statics.field2041;
                        if (var442 == 1700) {
                            field706[var5++] = var90.field2586;
                            continue;
                        }
                        if (var442 == 1701) {
                            if (var90.field2586 == -1) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = var90.field2579;
                            }
                            continue;
                        }
                        if (var442 == 1702) {
                            field706[var5++] = var90.field2656;
                            continue;
                        }
                    } else if (var442 < 1900) {
                        class153 var91 = var52 ? Statics.field61 : Statics.field2041;
                        if (var442 == 1800) {
                            field706[var5++] = class157.method2921(client.method2591(var91));
                            continue;
                        }
                        if (var442 == 1801) {
                            var5--;
                            int var92 = field706[var5];
                            int var443 = var92 - 1;
                            if (var91.field2570 != null && var443 < var91.field2570.length && var91.field2570[var443] != null) {
                                field707[var6++] = var91.field2570[var443];
                                continue;
                            }
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 1802) {
                            if (var91.field2603 == null) {
                                field707[var6++] = "";
                            } else {
                                field707[var6++] = var91.field2603;
                            }
                            continue;
                        }
                    } else if (var442 < 2600) {
                        var5--;
                        class153 var93 = class153.method2702(field706[var5]);
                        if (var442 == 2500) {
                            field706[var5++] = var93.field2588;
                            continue;
                        }
                        if (var442 == 2501) {
                            field706[var5++] = var93.field2549;
                            continue;
                        }
                        if (var442 == 2502) {
                            field706[var5++] = var93.field2552;
                            continue;
                        }
                        if (var442 == 2503) {
                            field706[var5++] = var93.field2649;
                            continue;
                        }
                        if (var442 == 2504) {
                            field706[var5++] = var93.field2555 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 2505) {
                            field706[var5++] = var93.field2554;
                            continue;
                        }
                    } else if (var442 < 2700) {
                        var5--;
                        class153 var94 = class153.method2702(field706[var5]);
                        if (var442 == 2600) {
                            field706[var5++] = var94.field2556;
                            continue;
                        }
                        if (var442 == 2601) {
                            field706[var5++] = var94.field2557;
                            continue;
                        }
                        if (var442 == 2602) {
                            field707[var6++] = var94.field2590;
                            continue;
                        }
                        if (var442 == 2603) {
                            field706[var5++] = var94.field2625;
                            continue;
                        }
                        if (var442 == 2604) {
                            field706[var5++] = var94.field2559;
                            continue;
                        }
                        if (var442 == 2605) {
                            field706[var5++] = var94.field2604;
                            continue;
                        }
                        if (var442 == 2606) {
                            field706[var5++] = var94.field2583;
                            continue;
                        }
                        if (var442 == 2607) {
                            field706[var5++] = var94.field2585;
                            continue;
                        }
                        if (var442 == 2608) {
                            field706[var5++] = var94.field2584;
                            continue;
                        }
                    } else if (var442 < 2800) {
                        if (var442 == 2700) {
                            var5--;
                            class153 var95 = class153.method2702(field706[var5]);
                            field706[var5++] = var95.field2586;
                            continue;
                        }
                        if (var442 == 2701) {
                            var5--;
                            class153 var96 = class153.method2702(field706[var5]);
                            if (var96.field2586 == -1) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = var96.field2579;
                            }
                            continue;
                        }
                        if (var442 == 2702) {
                            var5--;
                            int var97 = field706[var5];
                            class4 var98 = (class4) client.field403.method3244((long) var97);
                            if (var98 == null) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var442 < 2900) {
                        var5--;
                        class153 var99 = class153.method2702(field706[var5]);
                        if (var442 == 2800) {
                            int[] var100 = field706;
                            int var101 = var5++;
                            int var102 = client.method2591(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var442 == 2801) {
                            var5--;
                            int var104 = field706[var5];
                            int var444 = var104 - 1;
                            if (var99.field2570 != null && var444 < var99.field2570.length && var99.field2570[var444] != null) {
                                field707[var6++] = var99.field2570[var444];
                                continue;
                            }
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 2802) {
                            if (var99.field2603 == null) {
                                field707[var6++] = "";
                            } else {
                                field707[var6++] = var99.field2603;
                            }
                            continue;
                        }
                    } else if (var442 < 3200) {
                        if (var442 == 3100) {
                            var6--;
                            String var105 = field707[var6];
                            class10.method132(0, "", var105);
                            continue;
                        }
                        if (var442 == 3101) {
                            var5 -= 2;
                            client.method3188(Statics.field590, field706[var5], field706[var5 + 1]);
                            continue;
                        }
                        if (var442 == 3103) {
                            client.method482();
                            continue;
                        }
                        if (var442 == 3104) {
                            var6--;
                            String var106 = field707[var6];
                            int var107 = 0;
                            boolean var108 = class200.method2060(var106, 10, true);
                            if (var108) {
                                int var109 = class200.method3177(var106, 10, true);
                                var107 = var109;
                            }
                            client.field282.method2366(245);
                            client.field282.method2127(var107);
                            continue;
                        }
                        if (var442 == 3105) {
                            var6--;
                            String var110 = field707[var6];
                            client.field282.method2366(66);
                            client.field282.method2124(var110.length() + 1);
                            client.field282.method2129(var110);
                            continue;
                        }
                        if (var442 == 3106) {
                            var6--;
                            String var111 = field707[var6];
                            client.field282.method2366(172);
                            client.field282.method2124(var111.length() + 1);
                            client.field282.method2129(var111);
                            continue;
                        }
                        if (var442 == 3107) {
                            var5--;
                            int var112 = field706[var5];
                            var6--;
                            String var113 = field707[var6];
                            boolean var114 = false;
                            for (int var115 = 0; var115 < client.field294; var115++) {
                                class3 var116 = client.field358[client.field362[var115]];
                                if (var116 != null && var116.field46 != null && var116.field46.equalsIgnoreCase(var113)) {
                                    if (var112 == 1) {
                                        client.field282.method2366(249);
                                        client.field282.method2169(client.field362[var115]);
                                        client.field282.method2270(0);
                                    } else if (var112 == 4) {
                                        client.field282.method2366(250);
                                        client.field282.method2169(client.field362[var115]);
                                        client.field282.method2270(0);
                                    } else if (var112 == 6) {
                                        client.field282.method2366(72);
                                        client.field282.method2170(client.field362[var115]);
                                        client.field282.method2270(0);
                                    } else if (var112 == 7) {
                                        client.field282.method2366(231);
                                        client.field282.method2169(client.field362[var115]);
                                        client.field282.method2256(0);
                                    }
                                    var114 = true;
                                    break;
                                }
                            }
                            if (!var114) {
                                class10.method132(4, "", class143.field2314 + var113);
                            }
                            continue;
                        }
                        if (var442 == 3108) {
                            var5 -= 3;
                            int var117 = field706[var5];
                            int var118 = field706[var5 + 1];
                            int var119 = field706[var5 + 2];
                            class153 var120 = class153.method2702(var119);
                            client.method2072(var120, var117, var118);
                            continue;
                        }
                        if (var442 == 3109) {
                            var5 -= 2;
                            int var121 = field706[var5];
                            int var122 = field706[var5 + 1];
                            class153 var123 = var52 ? Statics.field61 : Statics.field2041;
                            client.method2072(var123, var121, var122);
                            continue;
                        }
                        if (var442 == 3110) {
                            var5--;
                            Statics.field697 = field706[var5] == 1;
                            continue;
                        }
                        if (var442 == 3111) {
                            field706[var5++] = Statics.field2674.field129 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 3112) {
                            var5--;
                            Statics.field2674.field129 = field706[var5] == 1;
                            class9.method466();
                            continue;
                        }
                        if (var442 == 3113) {
                            var6--;
                            String var124 = field707[var6];
                            var5--;
                            boolean var125 = field706[var5] == 1;
                            if (!var125) {
                                class125.method118(var124, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var124));
                                    continue;
                                } catch (Exception var440) {
                                }
                            }
                            if (class125.field1983.startsWith("win")) {
                                class125.method118(var124, 0, "openjs");
                            } else if (class125.field1983.startsWith("mac")) {
                                class125.method118(var124, 1, "openjs");
                            } else {
                                class125.method118(var124, 2, "openjs");
                            }
                            continue;
                        }
                    } else if (var442 < 3300) {
                        if (var442 == 3200) {
                            var5 -= 3;
                            Statics.method2904(field706[var5], field706[var5 + 1], field706[var5 + 2]);
                            continue;
                        }
                        if (var442 == 3201) {
                            var5--;
                            client.method77(field706[var5]);
                            continue;
                        }
                        if (var442 == 3202) {
                            var5 -= 2;
                            int var127 = field706[var5];
                            int var10000 = field706[var5 + 1];
                            if (client.field290 != 0 && var127 != -1) {
                                class162.method2875(Statics.field123, var127, 0, client.field290, false);
                                client.field276 = true;
                            }
                            continue;
                        }
                    } else if (var442 < 3400) {
                        if (var442 == 3300) {
                            field706[var5++] = client.field245;
                            continue;
                        }
                        if (var442 == 3301) {
                            var5 -= 2;
                            int var129 = field706[var5];
                            int var130 = field706[var5 + 1];
                            int[] var131 = field706;
                            int var132 = var5++;
                            class14 var133 = (class14) class14.field190.method3244((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field183.length) {
                                var134 = var133.field183[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var442 == 3302) {
                            var5 -= 2;
                            int var135 = field706[var5];
                            int var136 = field706[var5 + 1];
                            int[] var137 = field706;
                            int var138 = var5++;
                            class14 var139 = (class14) class14.field190.method3244((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = 0;
                            } else if (var136 >= 0 && var136 < var139.field184.length) {
                                var140 = var139.field184[var136];
                            } else {
                                var140 = 0;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var442 == 3303) {
                            var5 -= 2;
                            int var141 = field706[var5];
                            int var142 = field706[var5 + 1];
                            int[] var143 = field706;
                            int var144 = var5++;
                            class14 var145 = (class14) class14.field190.method3244((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = 0;
                            } else if (var142 == -1) {
                                var146 = 0;
                            } else {
                                int var147 = 0;
                                for (int var148 = 0; var148 < var145.field184.length; var148++) {
                                    if (var145.field183[var148] == var142) {
                                        var147 += var145.field184[var148];
                                    }
                                }
                                var146 = var147;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var442 == 3304) {
                            var5--;
                            int var149 = field706[var5];
                            field706[var5++] = class44.method115(var149).field985;
                            continue;
                        }
                        if (var442 == 3305) {
                            var5--;
                            int var150 = field706[var5];
                            field706[var5++] = client.field478[var150];
                            continue;
                        }
                        if (var442 == 3306) {
                            var5--;
                            int var151 = field706[var5];
                            field706[var5++] = client.field380[var151];
                            continue;
                        }
                        if (var442 == 3307) {
                            var5--;
                            int var152 = field706[var5];
                            field706[var5++] = client.field381[var152];
                            continue;
                        }
                        if (var442 == 3308) {
                            int var153 = Statics.field224;
                            int var154 = (Statics.field590.field760 >> 7) + Statics.field1557;
                            int var155 = (Statics.field590.field716 >> 7) + Statics.field551;
                            field706[var5++] = (var153 << 28) + (var154 << 14) + var155;
                            continue;
                        }
                        if (var442 == 3309) {
                            var5--;
                            int var156 = field706[var5];
                            field706[var5++] = var156 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var442 == 3310) {
                            var5--;
                            int var157 = field706[var5];
                            field706[var5++] = var157 >> 28;
                            continue;
                        }
                        if (var442 == 3311) {
                            var5--;
                            int var158 = field706[var5];
                            field706[var5++] = var158 & 0x3FFF;
                            continue;
                        }
                        if (var442 == 3312) {
                            field706[var5++] = client.field361 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 3313) {
                            var5 -= 2;
                            int var159 = field706[var5] + 32768;
                            int var160 = field706[var5 + 1];
                            int[] var161 = field706;
                            int var162 = var5++;
                            class14 var163 = (class14) class14.field190.method3244((long) var159);
                            int var164;
                            if (var163 == null) {
                                var164 = -1;
                            } else if (var160 >= 0 && var160 < var163.field183.length) {
                                var164 = var163.field183[var160];
                            } else {
                                var164 = -1;
                            }
                            var161[var162] = var164;
                            continue;
                        }
                        if (var442 == 3314) {
                            var5 -= 2;
                            int var165 = field706[var5] + 32768;
                            int var166 = field706[var5 + 1];
                            int[] var167 = field706;
                            int var168 = var5++;
                            class14 var169 = (class14) class14.field190.method3244((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = 0;
                            } else if (var166 >= 0 && var166 < var169.field184.length) {
                                var170 = var169.field184[var166];
                            } else {
                                var170 = 0;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var442 == 3315) {
                            var5 -= 2;
                            int var171 = field706[var5] + 32768;
                            int var172 = field706[var5 + 1];
                            int[] var173 = field706;
                            int var174 = var5++;
                            class14 var175 = (class14) class14.field190.method3244((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 == -1) {
                                var176 = 0;
                            } else {
                                int var177 = 0;
                                for (int var178 = 0; var178 < var175.field184.length; var178++) {
                                    if (var175.field183[var178] == var172) {
                                        var177 += var175.field184[var178];
                                    }
                                }
                                var176 = var177;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var442 == 3316) {
                            if (client.field409 >= 2) {
                                field706[var5++] = client.field409;
                            } else {
                                field706[var5++] = 0;
                            }
                            continue;
                        }
                        if (var442 == 3317) {
                            field706[var5++] = client.field401;
                            continue;
                        }
                        if (var442 == 3318) {
                            field706[var5++] = client.field241;
                            continue;
                        }
                        if (var442 == 3321) {
                            field706[var5++] = client.field309;
                            continue;
                        }
                        if (var442 == 3322) {
                            field706[var5++] = client.field334;
                            continue;
                        }
                        if (var442 == 3323) {
                            if (client.field316) {
                                field706[var5++] = 1;
                            } else {
                                field706[var5++] = 0;
                            }
                            continue;
                        }
                        if (var442 == 3324) {
                            field706[var5++] = client.field423;
                            continue;
                        }
                    } else if (var442 < 3500) {
                        if (var442 == 3400) {
                            var5 -= 2;
                            int var179 = field706[var5];
                            int var180 = field706[var5 + 1];
                            class43 var181 = (class43) class43.field981.method3202((long) var179);
                            class43 var182;
                            if (var181 == null) {
                                byte[] var183 = Statics.field973.method2729(8, var179);
                                class43 var184 = new class43();
                                if (var183 != null) {
                                    var184.method801(new class107(var183));
                                }
                                class43.field981.method3204(var184, (long) var179);
                                var182 = var184;
                            } else {
                                var182 = var181;
                            }
                            class43 var185 = var182;
                            if (var182.field969 != 's') {
                            }
                            for (int var186 = 0; var186 < var185.field972; var186++) {
                                if (var185.field966[var186] == var180) {
                                    field707[var6++] = var185.field975[var186];
                                    var185 = null;
                                    break;
                                }
                            }
                            if (var185 != null) {
                                field707[var6++] = var185.field970;
                            }
                            continue;
                        }
                        if (var442 == 3408) {
                            var5 -= 4;
                            int var187 = field706[var5];
                            int var188 = field706[var5 + 1];
                            int var189 = field706[var5 + 2];
                            int var190 = field706[var5 + 3];
                            class43 var191 = (class43) class43.field981.method3202((long) var189);
                            class43 var192;
                            if (var191 == null) {
                                byte[] var193 = Statics.field973.method2729(8, var189);
                                class43 var194 = new class43();
                                if (var193 != null) {
                                    var194.method801(new class107(var193));
                                }
                                class43.field981.method3204(var194, (long) var189);
                                var192 = var194;
                            } else {
                                var192 = var191;
                            }
                            class43 var195 = var192;
                            if (var192.field968 == var187 && var192.field969 == var188) {
                                for (int var196 = 0; var196 < var195.field972; var196++) {
                                    if (var195.field966[var196] == var190) {
                                        if (var188 == 115) {
                                            field707[var6++] = var195.field975[var196];
                                        } else {
                                            field706[var5++] = var195.field974[var196];
                                        }
                                        var195 = null;
                                        break;
                                    }
                                }
                                if (var195 != null) {
                                    if (var188 == 115) {
                                        field707[var6++] = var195.field970;
                                    } else {
                                        field706[var5++] = var195.field971;
                                    }
                                }
                                continue;
                            }
                            if (var188 == 115) {
                                field707[var6++] = "null";
                            } else {
                                field706[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var442 < 3700) {
                        if (var442 == 3600) {
                            if (client.field239 == 0) {
                                field706[var5++] = -2;
                            } else if (client.field239 == 1) {
                                field706[var5++] = -1;
                            } else {
                                field706[var5++] = client.field442;
                            }
                            continue;
                        }
                        if (var442 == 3601) {
                            var5--;
                            int var197 = field706[var5];
                            if (client.field239 == 2 && var197 < client.field442) {
                                field707[var6++] = client.field493[var197].field220;
                                field707[var6++] = client.field493[var197].field211;
                                continue;
                            }
                            field707[var6++] = "";
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 3602) {
                            var5--;
                            int var198 = field706[var5];
                            if (client.field239 == 2 && var198 < client.field442) {
                                field706[var5++] = client.field493[var198].field212;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var442 == 3603) {
                            var5--;
                            int var199 = field706[var5];
                            if (client.field239 == 2 && var199 < client.field442) {
                                field706[var5++] = client.field493[var199].field215;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var442 == 3604) {
                            var6--;
                            String var200 = field707[var6];
                            var5--;
                            int var201 = field706[var5];
                            client.field282.method2366(52);
                            client.field282.method2124(class107.method1605(var200) + 1);
                            client.field282.method2256(var201);
                            client.field282.method2129(var200);
                            continue;
                        }
                        if (var442 == 3605) {
                            var6--;
                            String var202 = field707[var6];
                            client.method13(var202);
                            continue;
                        }
                        if (var442 == 3606) {
                            var6--;
                            String var203 = field707[var6];
                            if (var203 == null) {
                                continue;
                            }
                            String var204 = class201.method2843(var203, Statics.field777);
                            if (var204 == null) {
                                continue;
                            }
                            int var205 = 0;
                            while (true) {
                                if (var205 >= client.field442) {
                                    continue label2772;
                                }
                                class16 var206 = client.field493[var205];
                                String var207 = var206.field220;
                                String var208 = class201.method2843(var207, Statics.field777);
                                boolean var209;
                                if (var203 == null || var207 == null) {
                                    var209 = false;
                                } else if (var203.startsWith("#") || var207.startsWith("#")) {
                                    var209 = var203.equals(var207);
                                } else {
                                    var209 = var204.equals(var208);
                                }
                                if (var209) {
                                    client.field442--;
                                    for (int var210 = var205; var210 < client.field442; var210++) {
                                        client.field493[var210] = client.field493[var210 + 1];
                                    }
                                    client.field435 = client.field303;
                                    client.field282.method2366(176);
                                    client.field282.method2124(class107.method1605(var203));
                                    client.field282.method2129(var203);
                                    continue label2772;
                                }
                                var205++;
                            }
                        }
                        if (var442 == 3607) {
                            var6--;
                            String var211 = field707[var6];
                            if (var211 == null) {
                                continue;
                            }
                            if ((client.field347 < 100 || client.field367 == 1) && client.field347 < 400) {
                                String var212 = class201.method2843(var211, Statics.field777);
                                if (var212 == null) {
                                    continue;
                                }
                                for (int var213 = 0; var213 < client.field347; var213++) {
                                    class8 var214 = client.field273[var213];
                                    String var215 = class201.method2843(var214.field124, Statics.field777);
                                    if (var215 != null && var215.equals(var212)) {
                                        class10.method132(31, "", var211 + class143.field2334);
                                        continue label2772;
                                    }
                                    if (var214.field119 != null) {
                                        String var216 = class201.method2843(var214.field119, Statics.field777);
                                        if (var216 != null && var216.equals(var212)) {
                                            class10.method132(31, "", var211 + class143.field2334);
                                            continue label2772;
                                        }
                                    }
                                }
                                for (int var217 = 0; var217 < client.field442; var217++) {
                                    class16 var218 = client.field493[var217];
                                    String var219 = class201.method2843(var218.field220, Statics.field777);
                                    if (var219 != null && var219.equals(var212)) {
                                        class10.method132(31, "", class143.field2404 + var211 + class143.field2340);
                                        continue label2772;
                                    }
                                    if (var218.field211 != null) {
                                        String var220 = class201.method2843(var218.field211, Statics.field777);
                                        if (var220 != null && var220.equals(var212)) {
                                            class10.method132(31, "", class143.field2404 + var211 + class143.field2340);
                                            continue label2772;
                                        }
                                    }
                                }
                                if (class201.method2843(Statics.field590.field46, Statics.field777).equals(var212)) {
                                    class10.method132(31, "", class143.field2336);
                                } else {
                                    client.field282.method2366(120);
                                    client.field282.method2124(class107.method1605(var211));
                                    client.field282.method2129(var211);
                                }
                                continue;
                            }
                            class10.method132(31, "", class143.field2316);
                            continue;
                        }
                        if (var442 == 3608) {
                            var6--;
                            String var221 = field707[var6];
                            if (var221 == null) {
                                continue;
                            }
                            String var222 = class201.method2843(var221, Statics.field777);
                            if (var222 == null) {
                                continue;
                            }
                            int var223 = 0;
                            while (true) {
                                if (var223 >= client.field347) {
                                    continue label2772;
                                }
                                class8 var224 = client.field273[var223];
                                String var225 = var224.field124;
                                String var226 = class201.method2843(var225, Statics.field777);
                                boolean var227;
                                if (var221 == null || var225 == null) {
                                    var227 = false;
                                } else if (var221.startsWith("#") || var225.startsWith("#")) {
                                    var227 = var221.equals(var225);
                                } else {
                                    var227 = var222.equals(var226);
                                }
                                if (var227) {
                                    client.field347--;
                                    for (int var228 = var223; var228 < client.field347; var228++) {
                                        client.field273[var228] = client.field273[var228 + 1];
                                    }
                                    client.field435 = client.field303;
                                    client.field282.method2366(121);
                                    client.field282.method2124(class107.method1605(var221));
                                    client.field282.method2129(var221);
                                    continue label2772;
                                }
                                var223++;
                            }
                        }
                        if (var442 == 3609) {
                            var6--;
                            String var229 = field707[var6];
                            class138[] var230 = new class138[] { class138.field2125, class138.field2121, class138.field2118, class138.field2127, class138.field2120 };
                            class138[] var231 = var230;
                            for (int var232 = 0; var232 < var231.length; var232++) {
                                class138 var233 = var231[var232];
                                if (var233.field2123 != -1 && var229.startsWith(class2.method1336(var233.field2123))) {
                                    var229 = var229.substring(6 + Integer.toString(var233.field2123).length());
                                    break;
                                }
                            }
                            field706[var5++] = client.method483(var229, false) ? 1 : 0;
                            continue;
                        }
                        if (var442 == 3611) {
                            if (client.field427 == null) {
                                field707[var6++] = "";
                            } else {
                                field707[var6++] = class199.method2328(client.field427);
                            }
                            continue;
                        }
                        if (var442 == 3612) {
                            if (client.field427 == null) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = Statics.field1856;
                            }
                            continue;
                        }
                        if (var442 == 3613) {
                            var5--;
                            int var234 = field706[var5];
                            if (client.field427 != null && var234 < Statics.field1856) {
                                field707[var6++] = Statics.field174[var234].field550;
                                continue;
                            }
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 3614) {
                            var5--;
                            int var235 = field706[var5];
                            if (client.field427 != null && var235 < Statics.field1856) {
                                field706[var5++] = Statics.field174[var235].field552;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var442 == 3615) {
                            var5--;
                            int var236 = field706[var5];
                            if (client.field427 != null && var236 < Statics.field1856) {
                                field706[var5++] = Statics.field174[var236].field553;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var442 == 3616) {
                            field706[var5++] = Statics.field155;
                            continue;
                        }
                        if (var442 == 3617) {
                            var6--;
                            String var237 = field707[var6];
                            if (Statics.field174 != null) {
                                client.field282.method2366(119);
                                client.field282.method2124(class107.method1605(var237));
                                client.field282.method2129(var237);
                            }
                            continue;
                        }
                        if (var442 == 3618) {
                            field706[var5++] = Statics.field2673;
                            continue;
                        }
                        if (var442 == 3619) {
                            var6--;
                            String var238 = field707[var6];
                            if (!var238.equals("")) {
                                client.field282.method2366(205);
                                client.field282.method2124(class107.method1605(var238));
                                client.field282.method2129(var238);
                            }
                            continue;
                        }
                        if (var442 == 3620) {
                            client.method567();
                            continue;
                        }
                        if (var442 == 3621) {
                            if (client.field239 == 0) {
                                field706[var5++] = -1;
                            } else {
                                field706[var5++] = client.field347;
                            }
                            continue;
                        }
                        if (var442 == 3622) {
                            var5--;
                            int var239 = field706[var5];
                            if (client.field239 != 0 && var239 < client.field347) {
                                field707[var6++] = client.field273[var239].field124;
                                field707[var6++] = client.field273[var239].field119;
                                continue;
                            }
                            field707[var6++] = "";
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 3623) {
                            var6--;
                            String var240 = field707[var6];
                            if (var240.startsWith(class2.method1336(0)) || var240.startsWith(class2.method1336(1))) {
                                var240 = var240.substring(7);
                            }
                            field706[var5++] = client.method437(var240) ? 1 : 0;
                            continue;
                        }
                        if (var442 == 3624) {
                            var5--;
                            int var241 = field706[var5];
                            if (Statics.field174 != null && var241 < Statics.field1856 && Statics.field174[var241].field550.equalsIgnoreCase(Statics.field590.field46)) {
                                field706[var5++] = 1;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var442 == 3625) {
                            if (client.field465 == null) {
                                field707[var6++] = "";
                            } else {
                                field707[var6++] = class199.method2328(client.field465);
                            }
                            continue;
                        }
                    } else if (var442 < 4100) {
                        if (var442 == 4000) {
                            var5 -= 2;
                            int var242 = field706[var5];
                            int var243 = field706[var5 + 1];
                            field706[var5++] = var242 + var243;
                            continue;
                        }
                        if (var442 == 4001) {
                            var5 -= 2;
                            int var244 = field706[var5];
                            int var245 = field706[var5 + 1];
                            field706[var5++] = var244 - var245;
                            continue;
                        }
                        if (var442 == 4002) {
                            var5 -= 2;
                            int var246 = field706[var5];
                            int var247 = field706[var5 + 1];
                            field706[var5++] = var246 * var247;
                            continue;
                        }
                        if (var442 == 4003) {
                            var5 -= 2;
                            int var248 = field706[var5];
                            int var249 = field706[var5 + 1];
                            field706[var5++] = var248 / var249;
                            continue;
                        }
                        if (var442 == 4004) {
                            var5--;
                            int var250 = field706[var5];
                            field706[var5++] = (int) (Math.random() * (double) var250);
                            continue;
                        }
                        if (var442 == 4005) {
                            var5--;
                            int var251 = field706[var5];
                            field706[var5++] = (int) (Math.random() * (double) (var251 + 1));
                            continue;
                        }
                        if (var442 == 4006) {
                            var5 -= 5;
                            int var252 = field706[var5];
                            int var253 = field706[var5 + 1];
                            int var254 = field706[var5 + 2];
                            int var255 = field706[var5 + 3];
                            int var256 = field706[var5 + 4];
                            field706[var5++] = (var253 - var252) * (var256 - var254) / (var255 - var254) + var252;
                            continue;
                        }
                        if (var442 == 4007) {
                            var5 -= 2;
                            int var257 = field706[var5];
                            int var258 = field706[var5 + 1];
                            field706[var5++] = var257 * var258 / 100 + var257;
                            continue;
                        }
                        if (var442 == 4008) {
                            var5 -= 2;
                            int var259 = field706[var5];
                            int var260 = field706[var5 + 1];
                            field706[var5++] = var259 | 0x1 << var260;
                            continue;
                        }
                        if (var442 == 4009) {
                            var5 -= 2;
                            int var261 = field706[var5];
                            int var262 = field706[var5 + 1];
                            field706[var5++] = var261 & -1 - (0x1 << var262);
                            continue;
                        }
                        if (var442 == 4010) {
                            var5 -= 2;
                            int var263 = field706[var5];
                            int var264 = field706[var5 + 1];
                            field706[var5++] = (var263 & 0x1 << var264) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var442 == 4011) {
                            var5 -= 2;
                            int var265 = field706[var5];
                            int var266 = field706[var5 + 1];
                            field706[var5++] = var265 % var266;
                            continue;
                        }
                        if (var442 == 4012) {
                            var5 -= 2;
                            int var267 = field706[var5];
                            int var268 = field706[var5 + 1];
                            if (var267 == 0) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = (int) Math.pow((double) var267, (double) var268);
                            }
                            continue;
                        }
                        if (var442 == 4013) {
                            var5 -= 2;
                            int var269 = field706[var5];
                            int var270 = field706[var5 + 1];
                            if (var269 == 0) {
                                field706[var5++] = 0;
                            } else if (var270 == 0) {
                                field706[var5++] = Integer.MAX_VALUE;
                            } else {
                                field706[var5++] = (int) Math.pow((double) var269, 1.0D / (double) var270);
                            }
                            continue;
                        }
                        if (var442 == 4014) {
                            var5 -= 2;
                            int var271 = field706[var5];
                            int var272 = field706[var5 + 1];
                            field706[var5++] = var271 & var272;
                            continue;
                        }
                        if (var442 == 4015) {
                            var5 -= 2;
                            int var273 = field706[var5];
                            int var274 = field706[var5 + 1];
                            field706[var5++] = var273 | var274;
                            continue;
                        }
                    } else if (var442 < 4200) {
                        if (var442 == 4100) {
                            var6--;
                            String var275 = field707[var6];
                            var5--;
                            int var276 = field706[var5];
                            field707[var6++] = var275 + var276;
                            continue;
                        }
                        if (var442 == 4101) {
                            var6 -= 2;
                            String var277 = field707[var6];
                            String var278 = field707[var6 + 1];
                            field707[var6++] = var277 + var278;
                            continue;
                        }
                        if (var442 == 4102) {
                            var6--;
                            String var279 = field707[var6];
                            var5--;
                            int var280 = field706[var5];
                            field707[var6++] = var279 + class200.method2710(var280, true);
                            continue;
                        }
                        if (var442 == 4103) {
                            var6--;
                            String var281 = field707[var6];
                            field707[var6++] = var281.toLowerCase();
                            continue;
                        }
                        if (var442 == 4104) {
                            var5--;
                            int var282 = field706[var5];
                            long var283 = ((long) var282 + 11745L) * 86400000L;
                            field710.setTime(new Date(var283));
                            int var285 = field710.get(5);
                            int var286 = field710.get(2);
                            int var287 = field710.get(1);
                            field707[var6++] = var285 + "-" + field711[var286] + "-" + var287;
                            continue;
                        }
                        if (var442 == 4105) {
                            var6 -= 2;
                            String var288 = field707[var6];
                            String var289 = field707[var6 + 1];
                            if (Statics.field590.field29 != null && Statics.field590.field29.field2688) {
                                field707[var6++] = var289;
                                continue;
                            }
                            field707[var6++] = var288;
                            continue;
                        }
                        if (var442 == 4106) {
                            var5--;
                            int var290 = field706[var5];
                            field707[var6++] = Integer.toString(var290);
                            continue;
                        }
                        if (var442 == 4107) {
                            var6 -= 2;
                            int[] var291 = field706;
                            int var292 = var5++;
                            String var293 = field707[var6];
                            String var294 = field707[var6 + 1];
                            int var295 = client.field247;
                            int var296 = var293.length();
                            int var297 = var294.length();
                            int var298 = 0;
                            int var299 = 0;
                            char var300 = 0;
                            char var301 = 0;
                            int var302;
                            label2573: while (true) {
                                if (var298 - var300 >= var296 && var299 - var301 >= var297) {
                                    int var311 = Math.min(var296, var297);
                                    for (int var312 = 0; var312 < var311; var312++) {
                                        char var315 = var293.charAt(var312);
                                        char var316 = var294.charAt(var312);
                                        if (var315 != var316 && Character.toUpperCase(var315) != Character.toUpperCase(var316)) {
                                            char var317 = Character.toLowerCase(var315);
                                            char var318 = Character.toLowerCase(var316);
                                            if (var317 != var318) {
                                                var302 = class203.method2845(var317, var295) - class203.method2845(var318, var295);
                                                break label2573;
                                            }
                                        }
                                    }
                                    int var319 = var296 - var297;
                                    if (var319 == 0) {
                                        for (int var320 = 0; var320 < var311; var320++) {
                                            char var321 = var293.charAt(var320);
                                            char var322 = var294.charAt(var320);
                                            if (var321 != var322) {
                                                var302 = class203.method2845(var321, var295) - class203.method2845(var322, var295);
                                                break label2573;
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
                                var300 = class203.method1798(var303);
                                var301 = class203.method1798(var305);
                                char var307 = class203.method2073(var303, var295);
                                char var308 = class203.method2073(var305, var295);
                                if (var307 != var308 && Character.toUpperCase(var307) != Character.toUpperCase(var308)) {
                                    char var309 = Character.toLowerCase(var307);
                                    char var310 = Character.toLowerCase(var308);
                                    if (var309 != var310) {
                                        var302 = class203.method2845(var309, var295) - class203.method2845(var310, var295);
                                        break;
                                    }
                                }
                            }
                            var291[var292] = class200.method1876(var302);
                            continue;
                        }
                        if (var442 == 4108) {
                            var6--;
                            String var323 = field707[var6];
                            var5 -= 2;
                            int var324 = field706[var5];
                            int var325 = field706[var5 + 1];
                            byte[] var326 = Statics.field2005.method2729(var325, 0);
                            class194 var327 = new class194(var326);
                            field706[var5++] = var327.method3437(var323, var324);
                            continue;
                        }
                        if (var442 == 4109) {
                            var6--;
                            String var328 = field707[var6];
                            var5 -= 2;
                            int var329 = field706[var5];
                            int var330 = field706[var5 + 1];
                            byte[] var331 = Statics.field2005.method2729(var330, 0);
                            class194 var332 = new class194(var331);
                            field706[var5++] = var332.method3402(var328, var329);
                            continue;
                        }
                        if (var442 == 4110) {
                            var6 -= 2;
                            String var333 = field707[var6];
                            String var334 = field707[var6 + 1];
                            var5--;
                            if (field706[var5] == 1) {
                                field707[var6++] = var333;
                            } else {
                                field707[var6++] = var334;
                            }
                            continue;
                        }
                        if (var442 == 4111) {
                            var6--;
                            String var335 = field707[var6];
                            field707[var6++] = class193.method3404(var335);
                            continue;
                        }
                        if (var442 == 4112) {
                            var6--;
                            String var336 = field707[var6];
                            var5--;
                            int var337 = field706[var5];
                            field707[var6++] = var336 + (char) var337;
                            continue;
                        }
                        if (var442 == 4113) {
                            var5--;
                            int var338 = field706[var5];
                            field706[var5++] = class200.method30((char) var338) ? 1 : 0;
                            continue;
                        }
                        if (var442 == 4114) {
                            var5--;
                            int var339 = field706[var5];
                            int[] var340 = field706;
                            int var341 = var5++;
                            char var342 = (char) var339;
                            boolean var343 = var342 >= '0' && var342 <= '9' || var342 >= 'A' && var342 <= 'Z' || var342 >= 'a' && var342 <= 'z';
                            var340[var341] = var343 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 4115) {
                            var5--;
                            int var344 = field706[var5];
                            field706[var5++] = class200.method1380((char) var344) ? 1 : 0;
                            continue;
                        }
                        if (var442 == 4116) {
                            var5--;
                            int var345 = field706[var5];
                            int[] var346 = field706;
                            int var347 = var5++;
                            char var348 = (char) var345;
                            boolean var349 = var348 >= '0' && var348 <= '9';
                            var346[var347] = var349 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 4117) {
                            var6--;
                            String var350 = field707[var6];
                            if (var350 == null) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = var350.length();
                            }
                            continue;
                        }
                        if (var442 == 4118) {
                            var6--;
                            String var351 = field707[var6];
                            var5 -= 2;
                            int var352 = field706[var5];
                            int var353 = field706[var5 + 1];
                            field707[var6++] = var351.substring(var352, var353);
                            continue;
                        }
                        if (var442 == 4119) {
                            var6--;
                            String var354 = field707[var6];
                            StringBuilder var355 = new StringBuilder(var354.length());
                            boolean var356 = false;
                            for (int var357 = 0; var357 < var354.length(); var357++) {
                                char var358 = var354.charAt(var357);
                                if (var358 == '<') {
                                    var356 = true;
                                } else if (var358 == '>') {
                                    var356 = false;
                                } else if (!var356) {
                                    var355.append(var358);
                                }
                            }
                            field707[var6++] = var355.toString();
                            continue;
                        }
                        if (var442 == 4120) {
                            var6--;
                            String var359 = field707[var6];
                            var5--;
                            int var360 = field706[var5];
                            field706[var5++] = var359.indexOf(var360);
                            continue;
                        }
                        if (var442 == 4121) {
                            var6 -= 2;
                            String var361 = field707[var6];
                            String var362 = field707[var6 + 1];
                            var5--;
                            int var363 = field706[var5];
                            field706[var5++] = var361.indexOf(var362, var363);
                            continue;
                        }
                    } else if (var442 < 4300) {
                        if (var442 == 4200) {
                            var5--;
                            int var364 = field706[var5];
                            field707[var6++] = class45.method114(var364).field998;
                            continue;
                        }
                        if (var442 == 4201) {
                            var5 -= 2;
                            int var365 = field706[var5];
                            int var366 = field706[var5 + 1];
                            class45 var367 = class45.method114(var365);
                            if (var366 >= 1 && var366 <= 5 && var367.field1012[var366 - 1] != null) {
                                field707[var6++] = var367.field1012[var366 - 1];
                                continue;
                            }
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 4202) {
                            var5 -= 2;
                            int var368 = field706[var5];
                            int var369 = field706[var5 + 1];
                            class45 var370 = class45.method114(var368);
                            if (var369 >= 1 && var369 <= 5 && var370.field1000[var369 - 1] != null) {
                                field707[var6++] = var370.field1000[var369 - 1];
                                continue;
                            }
                            field707[var6++] = "";
                            continue;
                        }
                        if (var442 == 4203) {
                            var5--;
                            int var371 = field706[var5];
                            field706[var5++] = class45.method114(var371).field989;
                            continue;
                        }
                        if (var442 == 4204) {
                            var5--;
                            int var372 = field706[var5];
                            field706[var5++] = class45.method114(var372).field991 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var442 == 4205) {
                            var5--;
                            int var373 = field706[var5];
                            class45 var374 = class45.method114(var373);
                            if (var374.field1005 == -1 && var374.field1007 >= 0) {
                                field706[var5++] = var374.field1007;
                                continue;
                            }
                            field706[var5++] = var373;
                            continue;
                        }
                        if (var442 == 4206) {
                            var5--;
                            int var375 = field706[var5];
                            class45 var376 = class45.method114(var375);
                            if (var376.field1005 >= 0 && var376.field1007 >= 0) {
                                field706[var5++] = var376.field1007;
                                continue;
                            }
                            field706[var5++] = var375;
                            continue;
                        }
                        if (var442 == 4207) {
                            var5--;
                            int var377 = field706[var5];
                            field706[var5++] = class45.method114(var377).field1011 ? 1 : 0;
                            continue;
                        }
                    } else if (var442 < 5100) {
                        if (var442 == 5000) {
                            field706[var5++] = client.field495;
                            continue;
                        }
                        if (var442 == 5001) {
                            var5 -= 3;
                            client.field495 = field706[var5];
                            int var378 = field706[var5 + 1];
                            class117[] var379 = new class117[] { class117.field1898, class117.field1897, class117.field1896 };
                            class117[] var380 = var379;
                            int var381 = 0;
                            class117 var383;
                            while (true) {
                                if (var381 >= var380.length) {
                                    var383 = null;
                                    break;
                                }
                                class117 var382 = var380[var381];
                                if (var382.field1899 == var378) {
                                    var383 = var382;
                                    break;
                                }
                                var381++;
                            }
                            Statics.field1884 = var383;
                            if (Statics.field1884 == null) {
                                Statics.field1884 = class117.field1896;
                            }
                            client.field457 = field706[var5 + 2];
                            client.field282.method2366(196);
                            client.field282.method2124(client.field495);
                            client.field282.method2124(Statics.field1884.field1899);
                            client.field282.method2124(client.field457);
                            continue;
                        }
                        if (var442 == 5002) {
                            var6--;
                            String var384 = field707[var6];
                            var5 -= 2;
                            int var385 = field706[var5];
                            int var386 = field706[var5 + 1];
                            client.field282.method2366(229);
                            client.field282.method2124(class107.method1605(var384) + 2);
                            client.field282.method2129(var384);
                            client.field282.method2124(var385 - 1);
                            client.field282.method2124(var386);
                            continue;
                        }
                        if (var442 == 5003) {
                            var5 -= 2;
                            int var387 = field706[var5];
                            int var388 = field706[var5 + 1];
                            class31 var389 = class10.method1984(var387, var388);
                            if (var389 == null) {
                                field706[var5++] = -1;
                                field706[var5++] = 0;
                                field707[var6++] = "";
                                field707[var6++] = "";
                                field707[var6++] = "";
                            } else {
                                field706[var5++] = var389.field693;
                                field706[var5++] = var389.field699;
                                field707[var6++] = var389.field690 == null ? "" : var389.field690;
                                field707[var6++] = var389.field694 == null ? "" : var389.field694;
                                field707[var6++] = var389.field695 == null ? "" : var389.field695;
                            }
                            continue;
                        }
                        if (var442 == 5004) {
                            var5--;
                            int var390 = field706[var5];
                            class31 var391 = class10.method2423(var390);
                            if (var391 == null) {
                                field706[var5++] = -1;
                                field706[var5++] = 0;
                                field707[var6++] = "";
                                field707[var6++] = "";
                                field707[var6++] = "";
                            } else {
                                field706[var5++] = var391.field692;
                                field706[var5++] = var391.field699;
                                field707[var6++] = var391.field690 == null ? "" : var391.field690;
                                field707[var6++] = var391.field694 == null ? "" : var391.field694;
                                field707[var6++] = var391.field695 == null ? "" : var391.field695;
                            }
                            continue;
                        }
                        if (var442 == 5005) {
                            if (Statics.field1884 == null) {
                                field706[var5++] = -1;
                            } else {
                                field706[var5++] = Statics.field1884.field1899;
                            }
                            continue;
                        }
                        if (var442 == 5008) {
                            var6--;
                            String var392 = field707[var6];
                            var5--;
                            int var393 = field706[var5];
                            String var394 = var392.toLowerCase();
                            byte var395 = 0;
                            if (var394.startsWith(class143.field2341)) {
                                var395 = 0;
                                var392 = var392.substring(class143.field2341.length());
                            } else if (var394.startsWith(class143.field2343)) {
                                var395 = 1;
                                var392 = var392.substring(class143.field2343.length());
                            } else if (var394.startsWith(class143.field2345)) {
                                var395 = 2;
                                var392 = var392.substring(class143.field2345.length());
                            } else if (var394.startsWith(class143.field2347)) {
                                var395 = 3;
                                var392 = var392.substring(class143.field2347.length());
                            } else if (var394.startsWith(class143.field2349)) {
                                var395 = 4;
                                var392 = var392.substring(class143.field2349.length());
                            } else if (var394.startsWith(class143.field2351)) {
                                var395 = 5;
                                var392 = var392.substring(class143.field2351.length());
                            } else if (var394.startsWith(class143.field2212)) {
                                var395 = 6;
                                var392 = var392.substring(class143.field2212.length());
                            } else if (var394.startsWith(class143.field2323)) {
                                var395 = 7;
                                var392 = var392.substring(class143.field2323.length());
                            } else if (var394.startsWith(class143.field2197)) {
                                var395 = 8;
                                var392 = var392.substring(class143.field2197.length());
                            } else if (var394.startsWith(class143.field2359)) {
                                var395 = 9;
                                var392 = var392.substring(class143.field2359.length());
                            } else if (var394.startsWith(class143.field2361)) {
                                var395 = 10;
                                var392 = var392.substring(class143.field2361.length());
                            } else if (var394.startsWith(class143.field2363)) {
                                var395 = 11;
                                var392 = var392.substring(class143.field2363.length());
                            } else if (client.field247 != 0) {
                                if (var394.startsWith(class143.field2342)) {
                                    var395 = 0;
                                    var392 = var392.substring(class143.field2342.length());
                                } else if (var394.startsWith(class143.field2344)) {
                                    var395 = 1;
                                    var392 = var392.substring(class143.field2344.length());
                                } else if (var394.startsWith(class143.field2208)) {
                                    var395 = 2;
                                    var392 = var392.substring(class143.field2208.length());
                                } else if (var394.startsWith(class143.field2354)) {
                                    var395 = 3;
                                    var392 = var392.substring(class143.field2354.length());
                                } else if (var394.startsWith(class143.field2350)) {
                                    var395 = 4;
                                    var392 = var392.substring(class143.field2350.length());
                                } else if (var394.startsWith(class143.field2352)) {
                                    var395 = 5;
                                    var392 = var392.substring(class143.field2352.length());
                                } else if (var394.startsWith(class143.field2213)) {
                                    var395 = 6;
                                    var392 = var392.substring(class143.field2213.length());
                                } else if (var394.startsWith(class143.field2356)) {
                                    var395 = 7;
                                    var392 = var392.substring(class143.field2356.length());
                                } else if (var394.startsWith(class143.field2408)) {
                                    var395 = 8;
                                    var392 = var392.substring(class143.field2408.length());
                                } else if (var394.startsWith(class143.field2330)) {
                                    var395 = 9;
                                    var392 = var392.substring(class143.field2330.length());
                                } else if (var394.startsWith(class143.field2203)) {
                                    var395 = 10;
                                    var392 = var392.substring(class143.field2203.length());
                                } else if (var394.startsWith(class143.field2364)) {
                                    var395 = 11;
                                    var392 = var392.substring(class143.field2364.length());
                                }
                            }
                            String var396 = var392.toLowerCase();
                            byte var397 = 0;
                            if (var396.startsWith(class143.field2218)) {
                                var397 = 1;
                                var392 = var392.substring(class143.field2218.length());
                            } else if (var396.startsWith(class143.field2240)) {
                                var397 = 2;
                                var392 = var392.substring(class143.field2240.length());
                            } else if (var396.startsWith(class143.field2289)) {
                                var397 = 3;
                                var392 = var392.substring(class143.field2289.length());
                            } else if (var396.startsWith(class143.field2367)) {
                                var397 = 4;
                                var392 = var392.substring(class143.field2367.length());
                            } else if (var396.startsWith(class143.field2357)) {
                                var397 = 5;
                                var392 = var392.substring(class143.field2357.length());
                            } else if (client.field247 != 0) {
                                if (var396.startsWith(class143.field2366)) {
                                    var397 = 1;
                                    var392 = var392.substring(class143.field2366.length());
                                } else if (var396.startsWith(class143.field2368)) {
                                    var397 = 2;
                                    var392 = var392.substring(class143.field2368.length());
                                } else if (var396.startsWith(class143.field2370)) {
                                    var397 = 3;
                                    var392 = var392.substring(class143.field2370.length());
                                } else if (var396.startsWith(class143.field2372)) {
                                    var397 = 4;
                                    var392 = var392.substring(class143.field2372.length());
                                } else if (var396.startsWith(class143.field2374)) {
                                    var397 = 5;
                                    var392 = var392.substring(class143.field2374.length());
                                }
                            }
                            client.field282.method2366(55);
                            client.field282.method2124(0);
                            int var398 = client.field282.field1838;
                            client.field282.method2124(var393);
                            client.field282.method2124(var395);
                            client.field282.method2124(var397);
                            class110 var399 = client.field282;
                            int var400 = var399.field1838;
                            int var401 = var392.length();
                            byte[] var402 = new byte[var401];
                            for (int var403 = 0; var403 < var401; var403++) {
                                char var404 = var392.charAt(var403);
                                if (var404 > 0 && var404 < 128 || var404 >= 160 && var404 <= 255) {
                                    var402[var403] = (byte) var404;
                                } else if (var404 == 8364) {
                                    var402[var403] = -128;
                                } else if (var404 == 8218) {
                                    var402[var403] = -126;
                                } else if (var404 == 402) {
                                    var402[var403] = -125;
                                } else if (var404 == 8222) {
                                    var402[var403] = -124;
                                } else if (var404 == 8230) {
                                    var402[var403] = -123;
                                } else if (var404 == 8224) {
                                    var402[var403] = -122;
                                } else if (var404 == 8225) {
                                    var402[var403] = -121;
                                } else if (var404 == 710) {
                                    var402[var403] = -120;
                                } else if (var404 == 8240) {
                                    var402[var403] = -119;
                                } else if (var404 == 352) {
                                    var402[var403] = -118;
                                } else if (var404 == 8249) {
                                    var402[var403] = -117;
                                } else if (var404 == 338) {
                                    var402[var403] = -116;
                                } else if (var404 == 381) {
                                    var402[var403] = -114;
                                } else if (var404 == 8216) {
                                    var402[var403] = -111;
                                } else if (var404 == 8217) {
                                    var402[var403] = -110;
                                } else if (var404 == 8220) {
                                    var402[var403] = -109;
                                } else if (var404 == 8221) {
                                    var402[var403] = -108;
                                } else if (var404 == 8226) {
                                    var402[var403] = -107;
                                } else if (var404 == 8211) {
                                    var402[var403] = -106;
                                } else if (var404 == 8212) {
                                    var402[var403] = -105;
                                } else if (var404 == 732) {
                                    var402[var403] = -104;
                                } else if (var404 == 8482) {
                                    var402[var403] = -103;
                                } else if (var404 == 353) {
                                    var402[var403] = -102;
                                } else if (var404 == 8250) {
                                    var402[var403] = -101;
                                } else if (var404 == 339) {
                                    var402[var403] = -100;
                                } else if (var404 == 382) {
                                    var402[var403] = -98;
                                } else if (var404 == 376) {
                                    var402[var403] = -97;
                                } else {
                                    var402[var403] = 63;
                                }
                            }
                            var399.method2136(var402.length);
                            var399.field1838 += Statics.field2907.method2063(var402, 0, var402.length, var399.field1844, var399.field1838);
                            client.field282.method2135(client.field282.field1838 - var398);
                            continue;
                        }
                        if (var442 == 5009) {
                            var6 -= 2;
                            String var407 = field707[var6];
                            String var408 = field707[var6 + 1];
                            client.field282.method2366(50);
                            client.field282.method2132(0);
                            int var409 = client.field282.field1838;
                            client.field282.method2129(var407);
                            class110 var410 = client.field282;
                            int var411 = var410.field1838;
                            int var412 = var408.length();
                            byte[] var413 = new byte[var412];
                            for (int var414 = 0; var414 < var412; var414++) {
                                char var415 = var408.charAt(var414);
                                if (var415 > 0 && var415 < 128 || var415 >= 160 && var415 <= 255) {
                                    var413[var414] = (byte) var415;
                                } else if (var415 == 8364) {
                                    var413[var414] = -128;
                                } else if (var415 == 8218) {
                                    var413[var414] = -126;
                                } else if (var415 == 402) {
                                    var413[var414] = -125;
                                } else if (var415 == 8222) {
                                    var413[var414] = -124;
                                } else if (var415 == 8230) {
                                    var413[var414] = -123;
                                } else if (var415 == 8224) {
                                    var413[var414] = -122;
                                } else if (var415 == 8225) {
                                    var413[var414] = -121;
                                } else if (var415 == 710) {
                                    var413[var414] = -120;
                                } else if (var415 == 8240) {
                                    var413[var414] = -119;
                                } else if (var415 == 352) {
                                    var413[var414] = -118;
                                } else if (var415 == 8249) {
                                    var413[var414] = -117;
                                } else if (var415 == 338) {
                                    var413[var414] = -116;
                                } else if (var415 == 381) {
                                    var413[var414] = -114;
                                } else if (var415 == 8216) {
                                    var413[var414] = -111;
                                } else if (var415 == 8217) {
                                    var413[var414] = -110;
                                } else if (var415 == 8220) {
                                    var413[var414] = -109;
                                } else if (var415 == 8221) {
                                    var413[var414] = -108;
                                } else if (var415 == 8226) {
                                    var413[var414] = -107;
                                } else if (var415 == 8211) {
                                    var413[var414] = -106;
                                } else if (var415 == 8212) {
                                    var413[var414] = -105;
                                } else if (var415 == 732) {
                                    var413[var414] = -104;
                                } else if (var415 == 8482) {
                                    var413[var414] = -103;
                                } else if (var415 == 353) {
                                    var413[var414] = -102;
                                } else if (var415 == 8250) {
                                    var413[var414] = -101;
                                } else if (var415 == 339) {
                                    var413[var414] = -100;
                                } else if (var415 == 382) {
                                    var413[var414] = -98;
                                } else if (var415 == 376) {
                                    var413[var414] = -97;
                                } else {
                                    var413[var414] = 63;
                                }
                            }
                            var410.method2136(var413.length);
                            var410.field1838 += Statics.field2907.method2063(var413, 0, var413.length, var410.field1844, var410.field1838);
                            client.field282.method2134(client.field282.field1838 - var409);
                            continue;
                        }
                        if (var442 == 5015) {
                            String var418;
                            if (Statics.field590 == null || Statics.field590.field46 == null) {
                                var418 = "";
                            } else {
                                var418 = Statics.field590.field46;
                            }
                            field707[var6++] = var418;
                            continue;
                        }
                        if (var442 == 5016) {
                            field706[var5++] = client.field457;
                            continue;
                        }
                        if (var442 == 5017) {
                            var5--;
                            int var419 = field706[var5];
                            int[] var420 = field706;
                            int var421 = var5++;
                            class24 var422 = (class24) class10.field143.get(var419);
                            int var423;
                            if (var422 == null) {
                                var423 = 0;
                            } else {
                                var423 = var422.method478();
                            }
                            var420[var421] = var423;
                            continue;
                        }
                        if (var442 == 5018) {
                            var5--;
                            int var424 = field706[var5];
                            int[] var425 = field706;
                            int var426 = var5++;
                            class31 var427 = (class31) class10.field136.method3268((long) var424);
                            int var428;
                            if (var427 == null) {
                                var428 = -1;
                            } else if (class10.field137.field2863 == var427.field2868) {
                                var428 = -1;
                            } else {
                                var428 = ((class31) var427.field2868).field693;
                            }
                            var425[var426] = var428;
                            continue;
                        }
                        if (var442 == 5019) {
                            var5--;
                            int var429 = field706[var5];
                            int[] var430 = field706;
                            int var431 = var5++;
                            class31 var432 = (class31) class10.field136.method3268((long) var429);
                            int var433;
                            if (var432 == null) {
                                var433 = -1;
                            } else if (class10.field137.field2863 == var432.field2867) {
                                var433 = -1;
                            } else {
                                var433 = ((class31) var432.field2867).field693;
                            }
                            var430[var431] = var433;
                            continue;
                        }
                        if (var442 == 5020) {
                            var6--;
                            String var434 = field707[var6];
                            if (var434.equalsIgnoreCase("toggleroof")) {
                                Statics.field2674.field129 = !Statics.field2674.field129;
                                class9.method466();
                                if (Statics.field2674.field129) {
                                    class10.method132(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method132(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field409 >= 2) {
                                if (var434.equalsIgnoreCase("fpson")) {
                                    client.field257 = true;
                                }
                                if (var434.equalsIgnoreCase("fpsoff")) {
                                    client.field257 = false;
                                }
                                if (var434.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var434.equalsIgnoreCase("clientdrop")) {
                                    client.method85();
                                }
                                if (var434.equalsIgnoreCase("errortest") && client.field384 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field282.method2366(177);
                            client.field282.method2124(var434.length() + 1);
                            client.field282.method2129(var434);
                            continue;
                        }
                    }
                }
                if (var442 >= 5600 || var442 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var435 = field706[var5];
                int var436 = field706[var5 + 1];
                if (!client.field485) {
                    client.field464 = var435;
                    client.field325 = var436;
                }
            }
        } catch (Exception var441) {
            StringBuilder var438 = new StringBuilder(30);
            var438.append("").append(var4.field2879).append(" ");
            for (int var439 = field708 - 1; var439 >= 0; var439--) {
                var438.append("").append(field704[var439].field172.field2879).append(" ");
            }
            var438.append("").append(var10);
            class135.method2083(var438.toString(), var441);
        }
    }

    @ObfuscatedName("cn.s(II)V")
    public static void method1795(int arg0) {
        if (arg0 == -1 || !class153.method2811(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2535[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2611 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field7 = var3.field2611;
                method136(var4, 2000000);
            }
        }
    }
}
