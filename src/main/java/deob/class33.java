package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class33 {

    @ObfuscatedName("at.k")
    public static int[] field721 = new int[5];

    @ObfuscatedName("at.c")
    public static int[][] field722 = new int[5][5000];

    @ObfuscatedName("at.w")
    public static int[] field723 = new int[1000];

    @ObfuscatedName("at.l")
    public static String[] field724 = new String[1000];

    @ObfuscatedName("at.n")
    public static int field729 = 0;

    @ObfuscatedName("at.d")
    public static class13[] field726 = new class13[50];

    @ObfuscatedName("at.p")
    public static Calendar field725 = Calendar.getInstance();

    @ObfuscatedName("at.i")
    public static final String[] field728 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.g(Lg;II)V")
    public static void method124(class1 arg0, int arg1) {
        Object[] var2 = arg0.field15;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method160(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field534;
        int[] var9 = var4.field525;
        byte var10 = -1;
        field729 = 0;
        try {
            Statics.field720 = new int[var4.field531];
            int var11 = 0;
            Statics.field2982 = new String[var4.field530];
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
                        var14 = arg0.field18 == null ? -1 : arg0.field18.field2538;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field18 == null ? -1 : arg0.field18.field2539;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2538;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2539;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field720[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2982[var12++] = var15;
                }
            }
            int var16 = 0;
            label2561: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var435 = var8[var7];
                if (var435 < 100) {
                    if (var435 == 0) {
                        field723[var5++] = var9[var7];
                        continue;
                    }
                    if (var435 == 1) {
                        int var17 = var9[var7];
                        field723[var5++] = class157.field2672[var17];
                        continue;
                    }
                    if (var435 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class157.field2672[var18] = field723[var5];
                        client.method134(var18);
                        continue;
                    }
                    if (var435 == 3) {
                        field724[var6++] = var4.field528[var7];
                        continue;
                    }
                    if (var435 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var435 == 7) {
                        var5 -= 2;
                        if (field723[var5 + 1] != field723[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 8) {
                        var5 -= 2;
                        if (field723[var5 + 1] == field723[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 9) {
                        var5 -= 2;
                        if (field723[var5] < field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 10) {
                        var5 -= 2;
                        if (field723[var5] > field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 21) {
                        if (field729 == 0) {
                            return;
                        }
                        class13 var19 = field726[--field729];
                        var4 = var19.field170;
                        var8 = var4.field534;
                        var9 = var4.field525;
                        var7 = var19.field172;
                        Statics.field720 = var19.field176;
                        Statics.field2982 = var19.field173;
                        continue;
                    }
                    if (var435 == 25) {
                        int var20 = var9[var7];
                        field723[var5++] = class157.method671(var20);
                        continue;
                    }
                    if (var435 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field723[var5];
                        class43 var23 = (class43) class43.field981.method3097((long) var21);
                        class43 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field984.method2660(14, var21);
                            class43 var26 = new class43();
                            if (var25 != null) {
                                var26.method777(new class108(var25));
                            }
                            class43.field981.method3099(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field982;
                        int var29 = var24.field983;
                        int var30 = var24.field989;
                        int var31 = class157.field2671[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class157.field2672[var28] = class157.field2672[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var435 == 31) {
                        var5 -= 2;
                        if (field723[var5] <= field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 32) {
                        var5 -= 2;
                        if (field723[var5] >= field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 33) {
                        field723[var5++] = Statics.field720[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var435 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field720[var10001] = field723[var5];
                        continue;
                    }
                    if (var435 == 35) {
                        field724[var6++] = Statics.field2982[var9[var7]];
                        continue;
                    }
                    if (var435 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2982[var10001] = field724[var6];
                        continue;
                    }
                    if (var435 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class211.method3078(field724, var6, var33);
                        field724[var6++] = var34;
                        continue;
                    }
                    if (var435 == 38) {
                        var5--;
                        continue;
                    }
                    if (var435 == 39) {
                        var6--;
                        continue;
                    }
                    if (var435 == 40) {
                        int var35 = var9[var7];
                        class19 var36 = class19.method160(var35);
                        int[] var37 = new int[var36.field531];
                        String[] var38 = new String[var36.field530];
                        for (int var39 = 0; var39 < var36.field536; var39++) {
                            var37[var39] = field723[var5 - var36.field536 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field532; var40++) {
                            var38[var40] = field724[var6 - var36.field532 + var40];
                        }
                        var5 -= var36.field536;
                        var6 -= var36.field532;
                        class13 var41 = new class13();
                        var41.field170 = var4;
                        var41.field172 = var7;
                        var41.field176 = Statics.field720;
                        var41.field173 = Statics.field2982;
                        field726[++field729 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field534;
                        var9 = var36.field525;
                        var7 = -1;
                        Statics.field720 = var37;
                        Statics.field2982 = var38;
                        continue;
                    }
                    if (var435 == 42) {
                        field723[var5++] = client.field440[var9[var7]];
                        continue;
                    }
                    if (var435 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field440[var10001] = field723[var5];
                        continue;
                    }
                    if (var435 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field723[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field721[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2561;
                                }
                                field722[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var435 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field723[var5];
                        if (var48 >= 0 && var48 < field721[var47]) {
                            field723[var5++] = field722[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var435 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field723[var5];
                        if (var50 >= 0 && var50 < field721[var49]) {
                            field722[var49][var50] = field723[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var435 == 47) {
                        String var51 = client.field386[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field724[var6++] = var51;
                        continue;
                    }
                    if (var435 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field386[var10001] = field724[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var435 < 1000) {
                    if (var435 == 100) {
                        var5 -= 3;
                        int var53 = field723[var5];
                        int var54 = field723[var5 + 1];
                        int var55 = field723[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class155 var56 = class155.method2787(var53);
                        if (var56.field2649 == null) {
                            var56.field2649 = new class155[var55 + 1];
                        }
                        if (var56.field2649.length <= var55) {
                            class155[] var57 = new class155[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2649.length; var58++) {
                                var57[var58] = var56.field2649[var58];
                            }
                            var56.field2649 = var57;
                        }
                        if (var55 > 0 && var56.field2649[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class155 var59 = new class155();
                        var59.field2540 = var54;
                        var59.field2531 = var59.field2538 = var56.field2538;
                        var59.field2539 = var55;
                        var59.field2537 = true;
                        var56.field2649[var55] = var59;
                        if (var52) {
                            Statics.field2771 = var59;
                        } else {
                            Statics.field2117 = var59;
                        }
                        client.method2761(var56);
                        continue;
                    }
                    if (var435 == 101) {
                        class155 var60 = var52 ? Statics.field2771 : Statics.field2117;
                        class155 var61 = class155.method2787(var60.field2538);
                        var61.field2649[var60.field2539] = null;
                        client.method2761(var61);
                        continue;
                    }
                    if (var435 == 102) {
                        var5--;
                        class155 var62 = class155.method2787(field723[var5]);
                        var62.field2649 = null;
                        client.method2761(var62);
                        continue;
                    }
                    if (var435 == 200) {
                        var5 -= 2;
                        int var63 = field723[var5];
                        int var64 = field723[var5 + 1];
                        class155 var65 = class155.method2637(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field723[var5++] = 1;
                            if (var52) {
                                Statics.field2771 = var65;
                            } else {
                                Statics.field2117 = var65;
                            }
                            continue;
                        }
                        field723[var5++] = 0;
                        continue;
                    }
                } else if (!(var435 < 1000 || var435 >= 1100) || !(var435 < 2000 || var435 >= 2100)) {
                    class155 var66;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var66 = class155.method2787(field723[var5]);
                    } else {
                        var66 = var52 ? Statics.field2771 : Statics.field2117;
                    }
                    if (var435 == 1000) {
                        var5 -= 2;
                        var66.field2543 = field723[var5];
                        var66.field2544 = field723[var5 + 1];
                        client.method2761(var66);
                        continue;
                    }
                    if (var435 == 1001) {
                        var5 -= 2;
                        var66.field2547 = field723[var5];
                        var66.field2554 = field723[var5 + 1];
                        client.method2761(var66);
                        continue;
                    }
                    if (var435 == 1003) {
                        var5--;
                        boolean var67 = field723[var5] == 1;
                        if (var66.field2550 != var67) {
                            var66.field2550 = var67;
                            client.method2761(var66);
                        }
                        continue;
                    }
                } else if (!(var435 < 1100 || var435 >= 1200) || !(var435 < 2100 || var435 >= 2200)) {
                    class155 var68;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var68 = class155.method2787(field723[var5]);
                    } else {
                        var68 = var52 ? Statics.field2771 : Statics.field2117;
                    }
                    if (var435 == 1100) {
                        var5 -= 2;
                        var68.field2620 = field723[var5];
                        if (var68.field2620 > var68.field2553 - var68.field2547) {
                            var68.field2620 = var68.field2553 - var68.field2547;
                        }
                        if (var68.field2620 < 0) {
                            var68.field2620 = 0;
                        }
                        var68.field2552 = field723[var5 + 1];
                        if (var68.field2552 > var68.field2630 - var68.field2554) {
                            var68.field2552 = var68.field2630 - var68.field2554;
                        }
                        if (var68.field2552 < 0) {
                            var68.field2552 = 0;
                        }
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1101) {
                        var5--;
                        var68.field2555 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1102) {
                        var5--;
                        var68.field2559 = field723[var5] == 1;
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1103) {
                        var5--;
                        var68.field2560 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1104) {
                        var5--;
                        var68.field2658 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1105) {
                        var5--;
                        var68.field2562 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1106) {
                        var5--;
                        var68.field2601 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1107) {
                        var5--;
                        var68.field2648 = field723[var5] == 1;
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1108) {
                        var68.field2558 = 1;
                        var5--;
                        var68.field2528 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1109) {
                        var5 -= 6;
                        var68.field2576 = field723[var5];
                        var68.field2577 = field723[var5 + 1];
                        var68.field2578 = field723[var5 + 2];
                        var68.field2579 = field723[var5 + 3];
                        var68.field2580 = field723[var5 + 4];
                        var68.field2581 = field723[var5 + 5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1110) {
                        var5--;
                        int var69 = field723[var5];
                        if (var68.field2574 != var69) {
                            var68.field2574 = var69;
                            var68.field2647 = 0;
                            var68.field2645 = 0;
                            client.method2761(var68);
                        }
                        continue;
                    }
                    if (var435 == 1111) {
                        var5--;
                        var68.field2652 = field723[var5] == 1;
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1112) {
                        var6--;
                        String var70 = field724[var6];
                        if (!var70.equals(var68.field2586)) {
                            var68.field2586 = var70;
                            client.method2761(var68);
                        }
                        continue;
                    }
                    if (var435 == 1113) {
                        var5--;
                        var68.field2585 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1114) {
                        var5 -= 3;
                        var68.field2534 = field723[var5];
                        var68.field2606 = field723[var5 + 1];
                        var68.field2564 = field723[var5 + 2];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1115) {
                        var5--;
                        var68.field2591 = field723[var5] == 1;
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1116) {
                        var5--;
                        var68.field2566 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1117) {
                        var5--;
                        var68.field2567 = field723[var5];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1118) {
                        var5--;
                        var68.field2568 = field723[var5] == 1;
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1119) {
                        var5--;
                        var68.field2592 = field723[var5] == 1;
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1120) {
                        var5 -= 2;
                        var68.field2553 = field723[var5];
                        var68.field2630 = field723[var5 + 1];
                        client.method2761(var68);
                        continue;
                    }
                    if (var435 == 1121) {
                        int var71 = var68.field2538;
                        int var72 = var68.field2539;
                        client.field285.method2312(50);
                        client.field285.method2245(var71);
                        client.field285.method2115(var72);
                        client.field413 = var68;
                        client.method2761(var68);
                        continue;
                    }
                } else if (!(var435 < 1200 || var435 >= 1300) || !(var435 < 2200 || var435 >= 2300)) {
                    class155 var73;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var73 = class155.method2787(field723[var5]);
                    } else {
                        var73 = var52 ? Statics.field2771 : Statics.field2117;
                    }
                    client.method2761(var73);
                    if (var435 == 1200 || var435 == 1205 || var435 == 1212) {
                        var5 -= 2;
                        int var74 = field723[var5];
                        int var75 = field723[var5 + 1];
                        var73.field2569 = var74;
                        var73.field2646 = var75;
                        class46 var76 = class46.method86(var74);
                        var73.field2578 = var76.field1028;
                        var73.field2579 = var76.field1031;
                        var73.field2580 = var76.field1030;
                        var73.field2576 = var76.field1062;
                        var73.field2577 = var76.field1032;
                        var73.field2581 = var76.field1027;
                        if (var435 == 1205) {
                            var73.field2584 = 0;
                        } else if (var435 == 1212 | var76.field1026 == 1) {
                            var73.field2584 = 1;
                        } else {
                            var73.field2584 = 2;
                        }
                        if (var73.field2547 > 0) {
                            var73.field2581 = var73.field2581 * 32 / var73.field2547;
                        }
                        continue;
                    }
                    if (var435 == 1201) {
                        var73.field2558 = 2;
                        var5--;
                        var73.field2528 = field723[var5];
                        continue;
                    }
                    if (var435 == 1202) {
                        var73.field2558 = 3;
                        var73.field2528 = Statics.field2031.field33.method2877();
                        continue;
                    }
                } else if (var435 >= 1300 && var435 < 1400 || var435 >= 2300 && var435 < 2400) {
                    class155 var77;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var77 = class155.method2787(field723[var5]);
                    } else {
                        var77 = var52 ? Statics.field2771 : Statics.field2117;
                    }
                    if (var435 == 1300) {
                        var5--;
                        int var78 = field723[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method2798(var78, field724[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var435 == 1301) {
                        var5 -= 2;
                        int var79 = field723[var5];
                        int var80 = field723[var5 + 1];
                        var77.field2545 = class155.method2637(var79, var80);
                        continue;
                    }
                    if (var435 == 1302) {
                        var5--;
                        var77.field2631 = field723[var5] == 1;
                        continue;
                    }
                    if (var435 == 1303) {
                        var5--;
                        var77.field2602 = field723[var5];
                        continue;
                    }
                    if (var435 == 1304) {
                        var5--;
                        var77.field2603 = field723[var5];
                        continue;
                    }
                    if (var435 == 1305) {
                        var6--;
                        var77.field2599 = field724[var6];
                        continue;
                    }
                    if (var435 == 1306) {
                        var6--;
                        var77.field2605 = field724[var6];
                        continue;
                    }
                    if (var435 == 1307) {
                        var77.field2589 = null;
                        continue;
                    }
                } else {
                    if (var435 >= 1400 && var435 < 1500 || var435 >= 2400 && var435 < 2500) {
                        class155 var81;
                        if (var435 >= 2000) {
                            var435 -= 1000;
                            var5--;
                            var81 = class155.method2787(field723[var5]);
                        } else {
                            var81 = var52 ? Statics.field2771 : Statics.field2117;
                        }
                        var6--;
                        String var82 = field724[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field723[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field723[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field724[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field723[var5]);
                            }
                        }
                        var5--;
                        int var87 = field723[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var435 == 1400) {
                            var81.field2608 = var85;
                        }
                        if (var435 == 1401) {
                            var81.field2532 = var85;
                        }
                        if (var435 == 1402) {
                            var81.field2610 = var85;
                        }
                        if (var435 == 1403) {
                            var81.field2612 = var85;
                        }
                        if (var435 == 1404) {
                            var81.field2614 = var85;
                        }
                        if (var435 == 1405) {
                            var81.field2590 = var85;
                        }
                        if (var435 == 1406) {
                            var81.field2618 = var85;
                        }
                        if (var435 == 1407) {
                            var81.field2619 = var85;
                            var81.field2635 = var83;
                        }
                        if (var435 == 1408) {
                            var81.field2571 = var85;
                        }
                        if (var435 == 1409) {
                            var81.field2626 = var85;
                        }
                        if (var435 == 1410) {
                            var81.field2616 = var85;
                        }
                        if (var435 == 1411) {
                            var81.field2615 = var85;
                        }
                        if (var435 == 1412) {
                            var81.field2613 = var85;
                        }
                        if (var435 == 1414) {
                            var81.field2598 = var85;
                            var81.field2570 = var83;
                        }
                        if (var435 == 1415) {
                            var81.field2623 = var85;
                            var81.field2624 = var83;
                        }
                        if (var435 == 1416) {
                            var81.field2617 = var85;
                        }
                        if (var435 == 1417) {
                            var81.field2627 = var85;
                        }
                        if (var435 == 1418) {
                            var81.field2628 = var85;
                        }
                        if (var435 == 1419) {
                            var81.field2633 = var85;
                        }
                        if (var435 == 1420) {
                            var81.field2588 = var85;
                        }
                        if (var435 == 1421) {
                            var81.field2609 = var85;
                        }
                        if (var435 == 1422) {
                            var81.field2632 = var85;
                        }
                        if (var435 == 1423) {
                            var81.field2548 = var85;
                        }
                        if (var435 == 1424) {
                            var81.field2634 = var85;
                        }
                        if (var435 == 1425) {
                            var81.field2629 = var85;
                        }
                        if (var435 == 1426) {
                            var81.field2583 = var85;
                        }
                        var81.field2611 = true;
                        continue;
                    }
                    if (var435 < 1600) {
                        class155 var88 = var52 ? Statics.field2771 : Statics.field2117;
                        if (var435 == 1500) {
                            field723[var5++] = var88.field2543;
                            continue;
                        }
                        if (var435 == 1501) {
                            field723[var5++] = var88.field2544;
                            continue;
                        }
                        if (var435 == 1502) {
                            field723[var5++] = var88.field2547;
                            continue;
                        }
                        if (var435 == 1503) {
                            field723[var5++] = var88.field2554;
                            continue;
                        }
                        if (var435 == 1504) {
                            field723[var5++] = var88.field2550 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 1505) {
                            field723[var5++] = var88.field2531;
                            continue;
                        }
                    } else if (var435 < 1700) {
                        class155 var89 = var52 ? Statics.field2771 : Statics.field2117;
                        if (var435 == 1600) {
                            field723[var5++] = var89.field2620;
                            continue;
                        }
                        if (var435 == 1601) {
                            field723[var5++] = var89.field2552;
                            continue;
                        }
                        if (var435 == 1602) {
                            field724[var6++] = var89.field2586;
                            continue;
                        }
                        if (var435 == 1603) {
                            field723[var5++] = var89.field2553;
                            continue;
                        }
                        if (var435 == 1604) {
                            field723[var5++] = var89.field2630;
                            continue;
                        }
                        if (var435 == 1605) {
                            field723[var5++] = var89.field2581;
                            continue;
                        }
                        if (var435 == 1606) {
                            field723[var5++] = var89.field2578;
                            continue;
                        }
                        if (var435 == 1607) {
                            field723[var5++] = var89.field2580;
                            continue;
                        }
                        if (var435 == 1608) {
                            field723[var5++] = var89.field2579;
                            continue;
                        }
                    } else if (var435 < 1800) {
                        class155 var90 = var52 ? Statics.field2771 : Statics.field2117;
                        if (var435 == 1700) {
                            field723[var5++] = var90.field2569;
                            continue;
                        }
                        if (var435 == 1701) {
                            if (var90.field2569 == -1) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var90.field2646;
                            }
                            continue;
                        }
                        if (var435 == 1702) {
                            field723[var5++] = var90.field2539;
                            continue;
                        }
                    } else if (var435 < 1900) {
                        class155 var91 = var52 ? Statics.field2771 : Statics.field2117;
                        if (var435 == 1800) {
                            field723[var5++] = class159.method1845(client.method1736(var91));
                            continue;
                        }
                        if (var435 == 1801) {
                            var5--;
                            int var92 = field723[var5];
                            int var436 = var92 - 1;
                            if (var91.field2589 != null && var436 < var91.field2589.length && var91.field2589[var436] != null) {
                                field724[var6++] = var91.field2589[var436];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 1802) {
                            if (var91.field2599 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = var91.field2599;
                            }
                            continue;
                        }
                    } else if (var435 < 2600) {
                        var5--;
                        class155 var93 = class155.method2787(field723[var5]);
                        if (var435 == 2500) {
                            field723[var5++] = var93.field2543;
                            continue;
                        }
                        if (var435 == 2501) {
                            field723[var5++] = var93.field2544;
                            continue;
                        }
                        if (var435 == 2502) {
                            field723[var5++] = var93.field2547;
                            continue;
                        }
                        if (var435 == 2503) {
                            field723[var5++] = var93.field2554;
                            continue;
                        }
                        if (var435 == 2504) {
                            field723[var5++] = var93.field2550 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 2505) {
                            field723[var5++] = var93.field2531;
                            continue;
                        }
                    } else if (var435 < 2700) {
                        var5--;
                        class155 var94 = class155.method2787(field723[var5]);
                        if (var435 == 2600) {
                            field723[var5++] = var94.field2620;
                            continue;
                        }
                        if (var435 == 2601) {
                            field723[var5++] = var94.field2552;
                            continue;
                        }
                        if (var435 == 2602) {
                            field724[var6++] = var94.field2586;
                            continue;
                        }
                        if (var435 == 2603) {
                            field723[var5++] = var94.field2553;
                            continue;
                        }
                        if (var435 == 2604) {
                            field723[var5++] = var94.field2630;
                            continue;
                        }
                        if (var435 == 2605) {
                            field723[var5++] = var94.field2581;
                            continue;
                        }
                        if (var435 == 2606) {
                            field723[var5++] = var94.field2578;
                            continue;
                        }
                        if (var435 == 2607) {
                            field723[var5++] = var94.field2580;
                            continue;
                        }
                        if (var435 == 2608) {
                            field723[var5++] = var94.field2579;
                            continue;
                        }
                    } else if (var435 < 2800) {
                        if (var435 == 2700) {
                            var5--;
                            class155 var95 = class155.method2787(field723[var5]);
                            field723[var5++] = var95.field2569;
                            continue;
                        }
                        if (var435 == 2701) {
                            var5--;
                            class155 var96 = class155.method2787(field723[var5]);
                            if (var96.field2569 == -1) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var96.field2646;
                            }
                            continue;
                        }
                        if (var435 == 2702) {
                            var5--;
                            int var97 = field723[var5];
                            class4 var98 = (class4) client.field245.method3140((long) var97);
                            if (var98 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var435 < 2900) {
                        var5--;
                        class155 var99 = class155.method2787(field723[var5]);
                        if (var435 == 2800) {
                            field723[var5++] = class159.method1845(client.method1736(var99));
                            continue;
                        }
                        if (var435 == 2801) {
                            var5--;
                            int var100 = field723[var5];
                            int var437 = var100 - 1;
                            if (var99.field2589 != null && var437 < var99.field2589.length && var99.field2589[var437] != null) {
                                field724[var6++] = var99.field2589[var437];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 2802) {
                            if (var99.field2599 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = var99.field2599;
                            }
                            continue;
                        }
                    } else if (var435 < 3200) {
                        if (var435 == 3100) {
                            var6--;
                            String var101 = field724[var6];
                            class10.method995(0, "", var101);
                            continue;
                        }
                        if (var435 == 3101) {
                            var5 -= 2;
                            client.method2429(Statics.field2031, field723[var5], field723[var5 + 1]);
                            continue;
                        }
                        if (var435 == 3103) {
                            client.field285.method2312(206);
                            for (class4 var102 = (class4) client.field245.method3139(); var102 != null; var102 = (class4) client.field245.method3146()) {
                                if (var102.field55 == 0 || var102.field55 == 3) {
                                    client.method147(var102, true);
                                }
                            }
                            if (client.field413 != null) {
                                client.method2761(client.field413);
                                client.field413 = null;
                            }
                            continue;
                        }
                        if (var435 == 3104) {
                            var6--;
                            String var103 = field724[var6];
                            int var104 = 0;
                            if (class211.method515(var103)) {
                                var104 = class211.method1738(var103);
                            }
                            client.field285.method2312(193);
                            client.field285.method2245(var104);
                            continue;
                        }
                        if (var435 == 3105) {
                            var6--;
                            String var105 = field724[var6];
                            client.field285.method2312(200);
                            client.field285.method2069(var105.length() + 1);
                            client.field285.method2074(var105);
                            continue;
                        }
                        if (var435 == 3106) {
                            var6--;
                            String var106 = field724[var6];
                            client.field285.method2312(60);
                            client.field285.method2069(var106.length() + 1);
                            client.field285.method2074(var106);
                            continue;
                        }
                        if (var435 == 3107) {
                            var5--;
                            int var107 = field723[var5];
                            var6--;
                            String var108 = field724[var6];
                            boolean var109 = false;
                            for (int var110 = 0; var110 < client.field255; var110++) {
                                class3 var111 = client.field365[client.field367[var110]];
                                if (var111 != null && var111.field39 != null && var111.field39.equalsIgnoreCase(var108)) {
                                    if (var107 == 1) {
                                        client.field285.method2312(240);
                                        client.field285.method2195(client.field367[var110]);
                                        client.field285.method2196(0);
                                    } else if (var107 == 4) {
                                        client.field285.method2312(69);
                                        client.field285.method2196(0);
                                        client.field285.method2113(client.field367[var110]);
                                    } else if (var107 == 6) {
                                        client.field285.method2312(189);
                                        client.field285.method2195(client.field367[var110]);
                                        client.field285.method2196(0);
                                    } else if (var107 == 7) {
                                        client.field285.method2312(52);
                                        client.field285.method2196(0);
                                        client.field285.method2113(client.field367[var110]);
                                    }
                                    var109 = true;
                                    break;
                                }
                            }
                            if (!var109) {
                                class10.method995(4, "", class145.field2297 + var108);
                            }
                            continue;
                        }
                        if (var435 == 3108) {
                            var5 -= 3;
                            int var112 = field723[var5];
                            int var113 = field723[var5 + 1];
                            int var114 = field723[var5 + 2];
                            class155 var115 = class155.method2787(var114);
                            client.method471(var115, var112, var113);
                            continue;
                        }
                        if (var435 == 3109) {
                            var5 -= 2;
                            int var116 = field723[var5];
                            int var117 = field723[var5 + 1];
                            class155 var118 = var52 ? Statics.field2771 : Statics.field2117;
                            client.method471(var118, var116, var117);
                            continue;
                        }
                        if (var435 == 3110) {
                            var5--;
                            Statics.field2927 = field723[var5] == 1;
                            continue;
                        }
                        if (var435 == 3111) {
                            field723[var5++] = Statics.field217.field128 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3112) {
                            var5--;
                            Statics.field217.field128 = field723[var5] == 1;
                            class9.method2526();
                            continue;
                        }
                        if (var435 == 3113) {
                            var6--;
                            String var119 = field724[var6];
                            var5--;
                            boolean var120 = field723[var5] == 1;
                            class127.method507(var119, var120, "openjs", false);
                            continue;
                        }
                        if (var435 == 3115) {
                            var5--;
                            int var121 = field723[var5];
                            client.field285.method2312(58);
                            client.field285.method2195(var121);
                            continue;
                        }
                    } else if (var435 < 3300) {
                        if (var435 == 3200) {
                            var5 -= 3;
                            client.method793(field723[var5], field723[var5 + 1], field723[var5 + 2]);
                            continue;
                        }
                        if (var435 == 3201) {
                            var5--;
                            client.method1288(field723[var5]);
                            continue;
                        }
                        if (var435 == 3202) {
                            var5 -= 2;
                            int var122 = field723[var5];
                            int var10000 = field723[var5 + 1];
                            if (client.field483 != 0 && var122 != -1) {
                                Statics.method31(Statics.field2834, var122, 0, client.field483, false);
                                client.field352 = true;
                            }
                            continue;
                        }
                    } else if (var435 < 3400) {
                        if (var435 == 3300) {
                            field723[var5++] = client.field410;
                            continue;
                        }
                        if (var435 == 3301) {
                            var5 -= 2;
                            int var124 = field723[var5];
                            int var125 = field723[var5 + 1];
                            int[] var126 = field723;
                            int var127 = var5++;
                            class14 var128 = (class14) class14.field188.method3140((long) var124);
                            int var129;
                            if (var128 == null) {
                                var129 = -1;
                            } else if (var125 >= 0 && var125 < var128.field185.length) {
                                var129 = var128.field185[var125];
                            } else {
                                var129 = -1;
                            }
                            var126[var127] = var129;
                            continue;
                        }
                        if (var435 == 3302) {
                            var5 -= 2;
                            int var130 = field723[var5];
                            int var131 = field723[var5 + 1];
                            field723[var5++] = class14.method1328(var130, var131);
                            continue;
                        }
                        if (var435 == 3303) {
                            var5 -= 2;
                            int var132 = field723[var5];
                            int var133 = field723[var5 + 1];
                            field723[var5++] = class14.method3(var132, var133);
                            continue;
                        }
                        if (var435 == 3304) {
                            var5--;
                            int var134 = field723[var5];
                            int[] var135 = field723;
                            int var136 = var5++;
                            class45 var137 = (class45) class45.field1007.method3097((long) var134);
                            class45 var138;
                            if (var137 == null) {
                                byte[] var139 = Statics.field1009.method2660(5, var134);
                                class45 var140 = new class45();
                                if (var139 != null) {
                                    var140.method795(new class108(var139));
                                }
                                class45.field1007.method3099(var140, (long) var134);
                                var138 = var140;
                            } else {
                                var138 = var137;
                            }
                            var135[var136] = var138.field1008;
                            continue;
                        }
                        if (var435 == 3305) {
                            var5--;
                            int var141 = field723[var5];
                            field723[var5++] = client.field384[var141];
                            continue;
                        }
                        if (var435 == 3306) {
                            var5--;
                            int var142 = field723[var5];
                            field723[var5++] = client.field385[var142];
                            continue;
                        }
                        if (var435 == 3307) {
                            var5--;
                            int var143 = field723[var5];
                            field723[var5++] = client.field282[var143];
                            continue;
                        }
                        if (var435 == 3308) {
                            int var144 = Statics.field1121;
                            int var145 = (Statics.field2031.field753 >> 7) + Statics.field86;
                            int var146 = (Statics.field2031.field736 >> 7) + Statics.field223;
                            field723[var5++] = (var144 << 28) + (var145 << 14) + var146;
                            continue;
                        }
                        if (var435 == 3309) {
                            var5--;
                            int var147 = field723[var5];
                            field723[var5++] = var147 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var435 == 3310) {
                            var5--;
                            int var148 = field723[var5];
                            field723[var5++] = var148 >> 28;
                            continue;
                        }
                        if (var435 == 3311) {
                            var5--;
                            int var149 = field723[var5];
                            field723[var5++] = var149 & 0x3FFF;
                            continue;
                        }
                        if (var435 == 3312) {
                            field723[var5++] = client.field325 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3313) {
                            var5 -= 2;
                            int var150 = field723[var5] + 32768;
                            int var151 = field723[var5 + 1];
                            int[] var152 = field723;
                            int var153 = var5++;
                            class14 var154 = (class14) class14.field188.method3140((long) var150);
                            int var155;
                            if (var154 == null) {
                                var155 = -1;
                            } else if (var151 >= 0 && var151 < var154.field185.length) {
                                var155 = var154.field185[var151];
                            } else {
                                var155 = -1;
                            }
                            var152[var153] = var155;
                            continue;
                        }
                        if (var435 == 3314) {
                            var5 -= 2;
                            int var156 = field723[var5] + 32768;
                            int var157 = field723[var5 + 1];
                            field723[var5++] = class14.method1328(var156, var157);
                            continue;
                        }
                        if (var435 == 3315) {
                            var5 -= 2;
                            int var158 = field723[var5] + 32768;
                            int var159 = field723[var5 + 1];
                            field723[var5++] = class14.method3(var158, var159);
                            continue;
                        }
                        if (var435 == 3316) {
                            if (client.field416 >= 2) {
                                field723[var5++] = client.field416;
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                        if (var435 == 3317) {
                            field723[var5++] = client.field260;
                            continue;
                        }
                        if (var435 == 3318) {
                            field723[var5++] = client.field243;
                            continue;
                        }
                        if (var435 == 3321) {
                            field723[var5++] = client.field414;
                            continue;
                        }
                        if (var435 == 3322) {
                            field723[var5++] = client.field415;
                            continue;
                        }
                        if (var435 == 3323) {
                            if (client.field418) {
                                field723[var5++] = 1;
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                        if (var435 == 3324) {
                            field723[var5++] = client.field244;
                            continue;
                        }
                    } else if (var435 < 3500) {
                        if (var435 == 3400) {
                            var5 -= 2;
                            int var160 = field723[var5];
                            int var161 = field723[var5 + 1];
                            class44 var162 = (class44) class44.field1001.method3097((long) var160);
                            class44 var163;
                            if (var162 == null) {
                                byte[] var164 = Statics.field998.method2660(8, var160);
                                class44 var165 = new class44();
                                if (var164 != null) {
                                    var165.method781(new class108(var164));
                                }
                                class44.field1001.method3099(var165, (long) var160);
                                var163 = var165;
                            } else {
                                var163 = var162;
                            }
                            class44 var166 = var163;
                            if (var163.field995 != 's') {
                            }
                            for (int var167 = 0; var167 < var166.field994; var167++) {
                                if (var166.field996[var167] == var161) {
                                    field724[var6++] = var166.field999[var167];
                                    var166 = null;
                                    break;
                                }
                            }
                            if (var166 != null) {
                                field724[var6++] = var166.field992;
                            }
                            continue;
                        }
                        if (var435 == 3408) {
                            var5 -= 4;
                            int var168 = field723[var5];
                            int var169 = field723[var5 + 1];
                            int var170 = field723[var5 + 2];
                            int var171 = field723[var5 + 3];
                            class44 var172 = (class44) class44.field1001.method3097((long) var170);
                            class44 var173;
                            if (var172 == null) {
                                byte[] var174 = Statics.field998.method2660(8, var170);
                                class44 var175 = new class44();
                                if (var174 != null) {
                                    var175.method781(new class108(var174));
                                }
                                class44.field1001.method3099(var175, (long) var170);
                                var173 = var175;
                            } else {
                                var173 = var172;
                            }
                            class44 var176 = var173;
                            if (var173.field993 == var168 && var173.field995 == var169) {
                                for (int var177 = 0; var177 < var176.field994; var177++) {
                                    if (var176.field996[var177] == var171) {
                                        if (var169 == 115) {
                                            field724[var6++] = var176.field999[var177];
                                        } else {
                                            field723[var5++] = var176.field1000[var177];
                                        }
                                        var176 = null;
                                        break;
                                    }
                                }
                                if (var176 != null) {
                                    if (var169 == 115) {
                                        field724[var6++] = var176.field992;
                                    } else {
                                        field723[var5++] = var176.field997;
                                    }
                                }
                                continue;
                            }
                            if (var169 == 115) {
                                field724[var6++] = "null";
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var435 < 3700) {
                        if (var435 == 3600) {
                            if (client.field501 == 0) {
                                field723[var5++] = -2;
                            } else if (client.field501 == 1) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = client.field500;
                            }
                            continue;
                        }
                        if (var435 == 3601) {
                            var5--;
                            int var178 = field723[var5];
                            if (client.field501 == 2 && var178 < client.field500) {
                                field724[var6++] = client.field347[var178].field218;
                                field724[var6++] = client.field347[var178].field211;
                                continue;
                            }
                            field724[var6++] = "";
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 3602) {
                            var5--;
                            int var179 = field723[var5];
                            if (client.field501 == 2 && var179 < client.field500) {
                                field723[var5++] = client.field347[var179].field210;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3603) {
                            var5--;
                            int var180 = field723[var5];
                            if (client.field501 == 2 && var180 < client.field500) {
                                field723[var5++] = client.field347[var180].field213;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3604) {
                            var6--;
                            String var181 = field724[var6];
                            var5--;
                            int var182 = field723[var5];
                            client.field285.method2312(110);
                            client.field285.method2069(class108.method546(var181) + 1);
                            client.field285.method2069(var182);
                            client.field285.method2074(var181);
                            continue;
                        }
                        if (var435 == 3605) {
                            var6--;
                            String var183 = field724[var6];
                            client.method2525(var183);
                            continue;
                        }
                        if (var435 == 3606) {
                            var6--;
                            String var184 = field724[var6];
                            client.method859(var184);
                            continue;
                        }
                        if (var435 == 3607) {
                            var6--;
                            String var185 = field724[var6];
                            if (var185 == null) {
                                continue;
                            }
                            if ((client.field381 < 100 || client.field281 == 1) && client.field381 < 400) {
                                String var186 = class212.method2544(var185, Statics.field2061);
                                if (var186 == null) {
                                    continue;
                                }
                                for (int var187 = 0; var187 < client.field381; var187++) {
                                    class8 var188 = client.field505[var187];
                                    String var189 = class212.method2544(var188.field123, Statics.field2061);
                                    if (var189 != null && var189.equals(var186)) {
                                        class10.method995(31, "", var185 + class145.field2317);
                                        continue label2561;
                                    }
                                    if (var188.field120 != null) {
                                        String var190 = class212.method2544(var188.field120, Statics.field2061);
                                        if (var190 != null && var190.equals(var186)) {
                                            class10.method995(31, "", var185 + class145.field2317);
                                            continue label2561;
                                        }
                                    }
                                }
                                for (int var191 = 0; var191 < client.field500; var191++) {
                                    class16 var192 = client.field347[var191];
                                    String var193 = class212.method2544(var192.field218, Statics.field2061);
                                    if (var193 != null && var193.equals(var186)) {
                                        class10.method995(31, "", class145.field2148 + var185 + class145.field2323);
                                        continue label2561;
                                    }
                                    if (var192.field211 != null) {
                                        String var194 = class212.method2544(var192.field211, Statics.field2061);
                                        if (var194 != null && var194.equals(var186)) {
                                            class10.method995(31, "", class145.field2148 + var185 + class145.field2323);
                                            continue label2561;
                                        }
                                    }
                                }
                                if (class212.method2544(Statics.field2031.field39, Statics.field2061).equals(var186)) {
                                    class10.method995(31, "", class145.field2319);
                                } else {
                                    client.field285.method2312(132);
                                    client.field285.method2069(class108.method546(var185));
                                    client.field285.method2074(var185);
                                }
                                continue;
                            }
                            class10.method995(31, "", class145.field2316);
                            continue;
                        }
                        if (var435 == 3608) {
                            var6--;
                            String var195 = field724[var6];
                            client.method2465(var195);
                            continue;
                        }
                        if (var435 == 3609) {
                            var6--;
                            String var196 = field724[var6];
                            class140[] var197 = new class140[] { class140.field2109, class140.field2098, class140.field2099, class140.field2101, class140.field2100 };
                            class140[] var198 = var197;
                            for (int var199 = 0; var199 < var198.length; var199++) {
                                class140 var200 = var198[var199];
                                if (var200.field2107 != -1 && var196.startsWith(class2.method2524(var200.field2107))) {
                                    var196 = var196.substring(6 + Integer.toString(var200.field2107).length());
                                    break;
                                }
                            }
                            field723[var5++] = client.method33(var196, false) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3611) {
                            if (client.field291 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = class210.method3288(client.field291);
                            }
                            continue;
                        }
                        if (var435 == 3612) {
                            if (client.field291 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = Statics.field825;
                            }
                            continue;
                        }
                        if (var435 == 3613) {
                            var5--;
                            int var201 = field723[var5];
                            if (client.field291 != null && var201 < Statics.field825) {
                                field724[var6++] = Statics.field1296[var201].field566;
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 3614) {
                            var5--;
                            int var202 = field723[var5];
                            if (client.field291 != null && var202 < Statics.field825) {
                                field723[var5++] = Statics.field1296[var202].field565;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3615) {
                            var5--;
                            int var203 = field723[var5];
                            if (client.field291 != null && var203 < Statics.field825) {
                                field723[var5++] = Statics.field1296[var203].field570;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3616) {
                            field723[var5++] = Statics.field843;
                            continue;
                        }
                        if (var435 == 3617) {
                            var6--;
                            String var204 = field724[var6];
                            if (Statics.field1296 != null) {
                                client.field285.method2312(209);
                                client.field285.method2069(class108.method546(var204));
                                client.field285.method2074(var204);
                            }
                            continue;
                        }
                        if (var435 == 3618) {
                            field723[var5++] = Statics.field151;
                            continue;
                        }
                        if (var435 == 3619) {
                            var6--;
                            String var205 = field724[var6];
                            if (!var205.equals("")) {
                                client.field285.method2312(121);
                                client.field285.method2069(class108.method546(var205));
                                client.field285.method2074(var205);
                            }
                            continue;
                        }
                        if (var435 == 3620) {
                            client.field285.method2312(121);
                            client.field285.method2069(0);
                            continue;
                        }
                        if (var435 == 3621) {
                            if (client.field501 == 0) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = client.field381;
                            }
                            continue;
                        }
                        if (var435 == 3622) {
                            var5--;
                            int var206 = field723[var5];
                            if (client.field501 != 0 && var206 < client.field381) {
                                field724[var6++] = client.field505[var206].field123;
                                field724[var6++] = client.field505[var206].field120;
                                continue;
                            }
                            field724[var6++] = "";
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 3623) {
                            var6--;
                            String var207 = field724[var6];
                            if (var207.startsWith(class2.method2524(0)) || var207.startsWith(class2.method2524(1))) {
                                var207 = var207.substring(7);
                            }
                            field723[var5++] = client.method2391(var207) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3624) {
                            var5--;
                            int var208 = field723[var5];
                            if (Statics.field1296 != null && var208 < Statics.field825 && Statics.field1296[var208].field566.equalsIgnoreCase(Statics.field2031.field39)) {
                                field723[var5++] = 1;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3625) {
                            if (client.field474 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = class210.method3288(client.field474);
                            }
                            continue;
                        }
                    } else if (var435 < 4000) {
                        if (var435 == 3903) {
                            var5--;
                            int var209 = field723[var5];
                            field723[var5++] = client.field368[var209].method3330();
                            continue;
                        }
                        if (var435 == 3904) {
                            var5--;
                            int var210 = field723[var5];
                            field723[var5++] = client.field368[var210].field2944;
                            continue;
                        }
                        if (var435 == 3905) {
                            var5--;
                            int var211 = field723[var5];
                            field723[var5++] = client.field368[var211].field2940;
                            continue;
                        }
                        if (var435 == 3906) {
                            var5--;
                            int var212 = field723[var5];
                            field723[var5++] = client.field368[var212].field2941;
                            continue;
                        }
                        if (var435 == 3907) {
                            var5--;
                            int var213 = field723[var5];
                            field723[var5++] = client.field368[var213].field2942;
                            continue;
                        }
                        if (var435 == 3908) {
                            var5--;
                            int var214 = field723[var5];
                            field723[var5++] = client.field368[var214].field2943;
                            continue;
                        }
                        if (var435 == 3910) {
                            var5--;
                            int var215 = field723[var5];
                            int var216 = client.field368[var215].method3329();
                            field723[var5++] = var216 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3911) {
                            var5--;
                            int var217 = field723[var5];
                            int var218 = client.field368[var217].method3329();
                            field723[var5++] = var218 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3912) {
                            var5--;
                            int var219 = field723[var5];
                            int var220 = client.field368[var219].method3329();
                            field723[var5++] = var220 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3913) {
                            var5--;
                            int var221 = field723[var5];
                            int var222 = client.field368[var221].method3329();
                            field723[var5++] = var222 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3914) {
                            var5--;
                            boolean var223 = field723[var5] == 1;
                            if (Statics.field569 != null) {
                                Statics.field569.method3348(class202.field2948, var223);
                            }
                            continue;
                        }
                        if (var435 == 3915) {
                            var5--;
                            boolean var224 = field723[var5] == 1;
                            if (Statics.field569 != null) {
                                Statics.field569.method3348(class202.field2949, var224);
                            }
                            continue;
                        }
                        if (var435 == 3916) {
                            var5 -= 2;
                            boolean var225 = field723[var5] == 1;
                            boolean var226 = field723[var5 + 1] == 1;
                            if (Statics.field569 != null) {
                                Statics.field569.method3348(new class20(var226), var225);
                            }
                            continue;
                        }
                        if (var435 == 3917) {
                            var5--;
                            boolean var227 = field723[var5] == 1;
                            if (Statics.field569 != null) {
                                Statics.field569.method3348(class202.field2947, var227);
                            }
                            continue;
                        }
                        if (var435 == 3918) {
                            var5--;
                            boolean var228 = field723[var5] == 1;
                            if (Statics.field569 != null) {
                                Statics.field569.method3348(class202.field2951, var228);
                            }
                            continue;
                        }
                        if (var435 == 3919) {
                            field723[var5++] = Statics.field569 == null ? 0 : Statics.field569.field2950.size();
                            continue;
                        }
                        if (var435 == 3920) {
                            var5--;
                            int var229 = field723[var5];
                            class195 var230 = (class195) Statics.field569.field2950.get(var229);
                            field723[var5++] = var230.field2914;
                            continue;
                        }
                        if (var435 == 3921) {
                            var5--;
                            int var231 = field723[var5];
                            class195 var232 = (class195) Statics.field569.field2950.get(var231);
                            field724[var6++] = var232.method3285();
                            continue;
                        }
                        if (var435 == 3922) {
                            var5--;
                            int var233 = field723[var5];
                            class195 var234 = (class195) Statics.field569.field2950.get(var233);
                            field724[var6++] = var234.method3283();
                            continue;
                        }
                        if (var435 == 3923) {
                            var5--;
                            int var235 = field723[var5];
                            class195 var236 = (class195) Statics.field569.field2950.get(var235);
                            long var237 = class104.method528() - Statics.field2845 - var236.field2915;
                            int var239 = (int) (var237 / 3600000L);
                            int var240 = (int) ((var237 - (long) (var239 * 3600000)) / 60000L);
                            int var241 = (int) ((var237 - (long) (var239 * 3600000) - (long) (var240 * 60000)) / 1000L);
                            String var242 = var239 + ":" + var240 / 10 + var240 % 10 + ":" + var241 / 10 + var241 % 10;
                            field724[var6++] = var242;
                            continue;
                        }
                        if (var435 == 3924) {
                            var5--;
                            int var243 = field723[var5];
                            class195 var244 = (class195) Statics.field569.field2950.get(var243);
                            field723[var5++] = var244.field2919.field2941;
                            continue;
                        }
                        if (var435 == 3925) {
                            var5--;
                            int var245 = field723[var5];
                            class195 var246 = (class195) Statics.field569.field2950.get(var245);
                            field723[var5++] = var246.field2919.field2940;
                            continue;
                        }
                        if (var435 == 3926) {
                            var5--;
                            int var247 = field723[var5];
                            class195 var248 = (class195) Statics.field569.field2950.get(var247);
                            field723[var5++] = var248.field2919.field2944;
                            continue;
                        }
                    } else if (var435 < 4100) {
                        if (var435 == 4000) {
                            var5 -= 2;
                            int var249 = field723[var5];
                            int var250 = field723[var5 + 1];
                            field723[var5++] = var249 + var250;
                            continue;
                        }
                        if (var435 == 4001) {
                            var5 -= 2;
                            int var251 = field723[var5];
                            int var252 = field723[var5 + 1];
                            field723[var5++] = var251 - var252;
                            continue;
                        }
                        if (var435 == 4002) {
                            var5 -= 2;
                            int var253 = field723[var5];
                            int var254 = field723[var5 + 1];
                            field723[var5++] = var253 * var254;
                            continue;
                        }
                        if (var435 == 4003) {
                            var5 -= 2;
                            int var255 = field723[var5];
                            int var256 = field723[var5 + 1];
                            field723[var5++] = var255 / var256;
                            continue;
                        }
                        if (var435 == 4004) {
                            var5--;
                            int var257 = field723[var5];
                            field723[var5++] = (int) (Math.random() * (double) var257);
                            continue;
                        }
                        if (var435 == 4005) {
                            var5--;
                            int var258 = field723[var5];
                            field723[var5++] = (int) (Math.random() * (double) (var258 + 1));
                            continue;
                        }
                        if (var435 == 4006) {
                            var5 -= 5;
                            int var259 = field723[var5];
                            int var260 = field723[var5 + 1];
                            int var261 = field723[var5 + 2];
                            int var262 = field723[var5 + 3];
                            int var263 = field723[var5 + 4];
                            field723[var5++] = (var260 - var259) * (var263 - var261) / (var262 - var261) + var259;
                            continue;
                        }
                        if (var435 == 4007) {
                            var5 -= 2;
                            int var264 = field723[var5];
                            int var265 = field723[var5 + 1];
                            field723[var5++] = var264 * var265 / 100 + var264;
                            continue;
                        }
                        if (var435 == 4008) {
                            var5 -= 2;
                            int var266 = field723[var5];
                            int var267 = field723[var5 + 1];
                            field723[var5++] = var266 | 0x1 << var267;
                            continue;
                        }
                        if (var435 == 4009) {
                            var5 -= 2;
                            int var268 = field723[var5];
                            int var269 = field723[var5 + 1];
                            field723[var5++] = var268 & -1 - (0x1 << var269);
                            continue;
                        }
                        if (var435 == 4010) {
                            var5 -= 2;
                            int var270 = field723[var5];
                            int var271 = field723[var5 + 1];
                            field723[var5++] = (var270 & 0x1 << var271) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var435 == 4011) {
                            var5 -= 2;
                            int var272 = field723[var5];
                            int var273 = field723[var5 + 1];
                            field723[var5++] = var272 % var273;
                            continue;
                        }
                        if (var435 == 4012) {
                            var5 -= 2;
                            int var274 = field723[var5];
                            int var275 = field723[var5 + 1];
                            if (var274 == 0) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = (int) Math.pow((double) var274, (double) var275);
                            }
                            continue;
                        }
                        if (var435 == 4013) {
                            var5 -= 2;
                            int var276 = field723[var5];
                            int var277 = field723[var5 + 1];
                            if (var276 == 0) {
                                field723[var5++] = 0;
                            } else if (var277 == 0) {
                                field723[var5++] = Integer.MAX_VALUE;
                            } else {
                                field723[var5++] = (int) Math.pow((double) var276, 1.0D / (double) var277);
                            }
                            continue;
                        }
                        if (var435 == 4014) {
                            var5 -= 2;
                            int var278 = field723[var5];
                            int var279 = field723[var5 + 1];
                            field723[var5++] = var278 & var279;
                            continue;
                        }
                        if (var435 == 4015) {
                            var5 -= 2;
                            int var280 = field723[var5];
                            int var281 = field723[var5 + 1];
                            field723[var5++] = var280 | var281;
                            continue;
                        }
                    } else if (var435 < 4200) {
                        if (var435 == 4100) {
                            var6--;
                            String var282 = field724[var6];
                            var5--;
                            int var283 = field723[var5];
                            field724[var6++] = var282 + var283;
                            continue;
                        }
                        if (var435 == 4101) {
                            var6 -= 2;
                            String var284 = field724[var6];
                            String var285 = field724[var6 + 1];
                            field724[var6++] = var284 + var285;
                            continue;
                        }
                        if (var435 == 4102) {
                            var6--;
                            String var286 = field724[var6];
                            var5--;
                            int var287 = field723[var5];
                            String[] var288 = field724;
                            int var289 = var6++;
                            String var291;
                            if (var287 < 0) {
                                var291 = Integer.toString(var287);
                            } else {
                                var291 = class211.method2852(var287, 10, true);
                            }
                            var288[var289] = var286 + var291;
                            continue;
                        }
                        if (var435 == 4103) {
                            var6--;
                            String var292 = field724[var6];
                            field724[var6++] = var292.toLowerCase();
                            continue;
                        }
                        if (var435 == 4104) {
                            var5--;
                            int var293 = field723[var5];
                            long var294 = ((long) var293 + 11745L) * 86400000L;
                            field725.setTime(new Date(var294));
                            int var296 = field725.get(5);
                            int var297 = field725.get(2);
                            int var298 = field725.get(1);
                            field724[var6++] = var296 + "-" + field728[var297] + "-" + var298;
                            continue;
                        }
                        if (var435 == 4105) {
                            var6 -= 2;
                            String var299 = field724[var6];
                            String var300 = field724[var6 + 1];
                            if (Statics.field2031.field33 != null && Statics.field2031.field33.field2686) {
                                field724[var6++] = var300;
                                continue;
                            }
                            field724[var6++] = var299;
                            continue;
                        }
                        if (var435 == 4106) {
                            var5--;
                            int var301 = field723[var5];
                            field724[var6++] = Integer.toString(var301);
                            continue;
                        }
                        if (var435 == 4107) {
                            var6 -= 2;
                            int[] var302 = field723;
                            int var303 = var5++;
                            String var304 = field724[var6];
                            String var305 = field724[var6 + 1];
                            int var306 = client.field324;
                            int var307 = var304.length();
                            int var308 = var305.length();
                            int var309 = 0;
                            int var310 = 0;
                            char var311 = 0;
                            char var312 = 0;
                            int var313;
                            label2421: while (true) {
                                if (var309 - var311 >= var307 && var310 - var312 >= var308) {
                                    int var322 = Math.min(var307, var308);
                                    for (int var323 = 0; var323 < var322; var323++) {
                                        char var326 = var304.charAt(var323);
                                        char var327 = var305.charAt(var323);
                                        if (var326 != var327 && Character.toUpperCase(var326) != Character.toUpperCase(var327)) {
                                            char var328 = Character.toLowerCase(var326);
                                            char var329 = Character.toLowerCase(var327);
                                            if (var328 != var329) {
                                                var313 = class214.method3090(var328, var306) - class214.method3090(var329, var306);
                                                break label2421;
                                            }
                                        }
                                    }
                                    int var330 = var307 - var308;
                                    if (var330 == 0) {
                                        for (int var331 = 0; var331 < var322; var331++) {
                                            char var332 = var304.charAt(var331);
                                            char var333 = var305.charAt(var331);
                                            if (var332 != var333) {
                                                var313 = class214.method3090(var332, var306) - class214.method3090(var333, var306);
                                                break label2421;
                                            }
                                        }
                                        var313 = 0;
                                    } else {
                                        var313 = var330;
                                    }
                                    break;
                                }
                                if (var309 - var311 >= var307) {
                                    var313 = -1;
                                    break;
                                }
                                if (var310 - var312 >= var308) {
                                    var313 = 1;
                                    break;
                                }
                                char var314;
                                if (var311 == 0) {
                                    var314 = var304.charAt(var309++);
                                } else {
                                    var314 = var311;
                                    boolean var315 = false;
                                }
                                char var316;
                                if (var312 == 0) {
                                    var316 = var305.charAt(var310++);
                                } else {
                                    var316 = var312;
                                    boolean var317 = false;
                                }
                                var311 = class214.method121(var314);
                                var312 = class214.method121(var316);
                                char var318 = class214.method3433(var314, var306);
                                char var319 = class214.method3433(var316, var306);
                                if (var318 != var319 && Character.toUpperCase(var318) != Character.toUpperCase(var319)) {
                                    char var320 = Character.toLowerCase(var318);
                                    char var321 = Character.toLowerCase(var319);
                                    if (var320 != var321) {
                                        var313 = class214.method3090(var320, var306) - class214.method3090(var321, var306);
                                        break;
                                    }
                                }
                            }
                            byte var335;
                            if (var313 > 0) {
                                var335 = 1;
                            } else if (var313 < 0) {
                                var335 = -1;
                            } else {
                                var335 = 0;
                            }
                            var302[var303] = var335;
                            continue;
                        }
                        if (var435 == 4108) {
                            var6--;
                            String var336 = field724[var6];
                            var5 -= 2;
                            int var337 = field723[var5];
                            int var338 = field723[var5 + 1];
                            byte[] var339 = Statics.field641.method2660(var338, 0);
                            class205 var340 = new class205(var339);
                            field723[var5++] = var340.method3359(var336, var337);
                            continue;
                        }
                        if (var435 == 4109) {
                            var6--;
                            String var341 = field724[var6];
                            var5 -= 2;
                            int var342 = field723[var5];
                            int var343 = field723[var5 + 1];
                            byte[] var344 = Statics.field641.method2660(var343, 0);
                            class205 var345 = new class205(var344);
                            field723[var5++] = var345.method3358(var341, var342);
                            continue;
                        }
                        if (var435 == 4110) {
                            var6 -= 2;
                            String var346 = field724[var6];
                            String var347 = field724[var6 + 1];
                            var5--;
                            if (field723[var5] == 1) {
                                field724[var6++] = var346;
                            } else {
                                field724[var6++] = var347;
                            }
                            continue;
                        }
                        if (var435 == 4111) {
                            var6--;
                            String var348 = field724[var6];
                            field724[var6++] = class204.method3360(var348);
                            continue;
                        }
                        if (var435 == 4112) {
                            var6--;
                            String var349 = field724[var6];
                            var5--;
                            int var350 = field723[var5];
                            field724[var6++] = var349 + (char) var350;
                            continue;
                        }
                        if (var435 == 4113) {
                            var5--;
                            int var351 = field723[var5];
                            field723[var5++] = class211.method1291((char) var351) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4114) {
                            var5--;
                            int var352 = field723[var5];
                            field723[var5++] = class211.method492((char) var352) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4115) {
                            var5--;
                            int var353 = field723[var5];
                            field723[var5++] = Statics.method100((char) var353) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4116) {
                            var5--;
                            int var354 = field723[var5];
                            field723[var5++] = class211.method2634((char) var354) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4117) {
                            var6--;
                            String var355 = field724[var6];
                            if (var355 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var355.length();
                            }
                            continue;
                        }
                        if (var435 == 4118) {
                            var6--;
                            String var356 = field724[var6];
                            var5 -= 2;
                            int var357 = field723[var5];
                            int var358 = field723[var5 + 1];
                            field724[var6++] = var356.substring(var357, var358);
                            continue;
                        }
                        if (var435 == 4119) {
                            var6--;
                            String var359 = field724[var6];
                            StringBuilder var360 = new StringBuilder(var359.length());
                            boolean var361 = false;
                            for (int var362 = 0; var362 < var359.length(); var362++) {
                                char var363 = var359.charAt(var362);
                                if (var363 == '<') {
                                    var361 = true;
                                } else if (var363 == '>') {
                                    var361 = false;
                                } else if (!var361) {
                                    var360.append(var363);
                                }
                            }
                            field724[var6++] = var360.toString();
                            continue;
                        }
                        if (var435 == 4120) {
                            var6--;
                            String var364 = field724[var6];
                            var5--;
                            int var365 = field723[var5];
                            field723[var5++] = var364.indexOf(var365);
                            continue;
                        }
                        if (var435 == 4121) {
                            var6 -= 2;
                            String var366 = field724[var6];
                            String var367 = field724[var6 + 1];
                            var5--;
                            int var368 = field723[var5];
                            field723[var5++] = var366.indexOf(var367, var368);
                            continue;
                        }
                    } else if (var435 < 4300) {
                        if (var435 == 4200) {
                            var5--;
                            int var369 = field723[var5];
                            field724[var6++] = class46.method86(var369).field1022;
                            continue;
                        }
                        if (var435 == 4201) {
                            var5 -= 2;
                            int var370 = field723[var5];
                            int var371 = field723[var5 + 1];
                            class46 var372 = class46.method86(var370);
                            if (var371 >= 1 && var371 <= 5 && var372.field1036[var371 - 1] != null) {
                                field724[var6++] = var372.field1036[var371 - 1];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 4202) {
                            var5 -= 2;
                            int var373 = field723[var5];
                            int var374 = field723[var5 + 1];
                            class46 var375 = class46.method86(var373);
                            if (var374 >= 1 && var374 <= 5 && var375.field1029[var374 - 1] != null) {
                                field724[var6++] = var375.field1029[var374 - 1];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var435 == 4203) {
                            var5--;
                            int var376 = field723[var5];
                            field723[var5++] = class46.method86(var376).field1061;
                            continue;
                        }
                        if (var435 == 4204) {
                            var5--;
                            int var377 = field723[var5];
                            field723[var5++] = class46.method86(var377).field1026 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4205) {
                            var5--;
                            int var378 = field723[var5];
                            class46 var379 = class46.method86(var378);
                            if (var379.field1053 == -1 && var379.field1044 >= 0) {
                                field723[var5++] = var379.field1044;
                                continue;
                            }
                            field723[var5++] = var378;
                            continue;
                        }
                        if (var435 == 4206) {
                            var5--;
                            int var380 = field723[var5];
                            class46 var381 = class46.method86(var380);
                            if (var381.field1053 >= 0 && var381.field1044 >= 0) {
                                field723[var5++] = var381.field1044;
                                continue;
                            }
                            field723[var5++] = var380;
                            continue;
                        }
                        if (var435 == 4207) {
                            var5--;
                            int var382 = field723[var5];
                            field723[var5++] = class46.method86(var382).field1035 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4210) {
                            var6--;
                            String var383 = field724[var6];
                            var5--;
                            int var384 = field723[var5];
                            client.method130(var383, var384 == 1);
                            field723[var5++] = Statics.field1350;
                            continue;
                        }
                        if (var435 == 4211) {
                            if (Statics.field2945 != null && Statics.field126 < Statics.field1350) {
                                field723[var5++] = Statics.field2945[++Statics.field126 - 1] & 0xFFFF;
                                continue;
                            }
                            field723[var5++] = -1;
                            continue;
                        }
                        if (var435 == 4212) {
                            Statics.field126 = 0;
                            continue;
                        }
                    } else if (var435 < 5100) {
                        if (var435 == 5000) {
                            field723[var5++] = client.field464;
                            continue;
                        }
                        if (var435 == 5001) {
                            var5 -= 3;
                            client.field464 = field723[var5];
                            Statics.field1878 = class119.method2352(field723[var5 + 1]);
                            if (Statics.field1878 == null) {
                                Statics.field1878 = class119.field1897;
                            }
                            client.field465 = field723[var5 + 2];
                            client.field285.method2312(105);
                            client.field285.method2069(client.field464);
                            client.field285.method2069(Statics.field1878.field1895);
                            client.field285.method2069(client.field465);
                            continue;
                        }
                        if (var435 == 5002) {
                            var6--;
                            String var385 = field724[var6];
                            var5 -= 2;
                            int var386 = field723[var5];
                            int var387 = field723[var5 + 1];
                            client.field285.method2312(174);
                            client.field285.method2069(class108.method546(var385) + 2);
                            client.field285.method2074(var385);
                            client.field285.method2069(var386 - 1);
                            client.field285.method2069(var387);
                            continue;
                        }
                        if (var435 == 5003) {
                            var5 -= 2;
                            int var388 = field723[var5];
                            int var389 = field723[var5 + 1];
                            class25 var390 = (class25) class10.field141.get(var388);
                            class32 var391 = var390.method499(var389);
                            if (var391 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field724[var6++] = "";
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var391.field711;
                                field723[var5++] = var391.field713;
                                field724[var6++] = var391.field710 == null ? "" : var391.field710;
                                field724[var6++] = var391.field717 == null ? "" : var391.field717;
                                field724[var6++] = var391.field715 == null ? "" : var391.field715;
                            }
                            continue;
                        }
                        if (var435 == 5004) {
                            var5--;
                            int var393 = field723[var5];
                            class32 var394 = (class32) class10.field140.method3156((long) var393);
                            if (var394 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field724[var6++] = "";
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var394.field712;
                                field723[var5++] = var394.field713;
                                field724[var6++] = var394.field710 == null ? "" : var394.field710;
                                field724[var6++] = var394.field717 == null ? "" : var394.field717;
                                field724[var6++] = var394.field715 == null ? "" : var394.field715;
                            }
                            continue;
                        }
                        if (var435 == 5005) {
                            if (Statics.field1878 == null) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = Statics.field1878.field1895;
                            }
                            continue;
                        }
                        if (var435 == 5008) {
                            var6--;
                            String var396 = field724[var6];
                            var5--;
                            int var397 = field723[var5];
                            String var398 = var396.toLowerCase();
                            byte var399 = 0;
                            if (var398.startsWith(class145.field2324)) {
                                var399 = 0;
                                var396 = var396.substring(class145.field2324.length());
                            } else if (var398.startsWith(class145.field2326)) {
                                var399 = 1;
                                var396 = var396.substring(class145.field2326.length());
                            } else if (var398.startsWith(class145.field2322)) {
                                var399 = 2;
                                var396 = var396.substring(class145.field2322.length());
                            } else if (var398.startsWith(class145.field2330)) {
                                var399 = 3;
                                var396 = var396.substring(class145.field2330.length());
                            } else if (var398.startsWith(class145.field2332)) {
                                var399 = 4;
                                var396 = var396.substring(class145.field2332.length());
                            } else if (var398.startsWith(class145.field2334)) {
                                var399 = 5;
                                var396 = var396.substring(class145.field2334.length());
                            } else if (var398.startsWith(class145.field2305)) {
                                var399 = 6;
                                var396 = var396.substring(class145.field2305.length());
                            } else if (var398.startsWith(class145.field2362)) {
                                var399 = 7;
                                var396 = var396.substring(class145.field2362.length());
                            } else if (var398.startsWith(class145.field2247)) {
                                var399 = 8;
                                var396 = var396.substring(class145.field2247.length());
                            } else if (var398.startsWith(class145.field2162)) {
                                var399 = 9;
                                var396 = var396.substring(class145.field2162.length());
                            } else if (var398.startsWith(class145.field2344)) {
                                var399 = 10;
                                var396 = var396.substring(class145.field2344.length());
                            } else if (var398.startsWith(class145.field2346)) {
                                var399 = 11;
                                var396 = var396.substring(class145.field2346.length());
                            } else if (client.field324 != 0) {
                                if (var398.startsWith(class145.field2325)) {
                                    var399 = 0;
                                    var396 = var396.substring(class145.field2325.length());
                                } else if (var398.startsWith(class145.field2327)) {
                                    var399 = 1;
                                    var396 = var396.substring(class145.field2327.length());
                                } else if (var398.startsWith(class145.field2303)) {
                                    var399 = 2;
                                    var396 = var396.substring(class145.field2303.length());
                                } else if (var398.startsWith(class145.field2331)) {
                                    var399 = 3;
                                    var396 = var396.substring(class145.field2331.length());
                                } else if (var398.startsWith(class145.field2333)) {
                                    var399 = 4;
                                    var396 = var396.substring(class145.field2333.length());
                                } else if (var398.startsWith(class145.field2335)) {
                                    var399 = 5;
                                    var396 = var396.substring(class145.field2335.length());
                                } else if (var398.startsWith(class145.field2310)) {
                                    var399 = 6;
                                    var396 = var396.substring(class145.field2310.length());
                                } else if (var398.startsWith(class145.field2265)) {
                                    var399 = 7;
                                    var396 = var396.substring(class145.field2265.length());
                                } else if (var398.startsWith(class145.field2341)) {
                                    var399 = 8;
                                    var396 = var396.substring(class145.field2341.length());
                                } else if (var398.startsWith(class145.field2343)) {
                                    var399 = 9;
                                    var396 = var396.substring(class145.field2343.length());
                                } else if (var398.startsWith(class145.field2287)) {
                                    var399 = 10;
                                    var396 = var396.substring(class145.field2287.length());
                                } else if (var398.startsWith(class145.field2347)) {
                                    var399 = 11;
                                    var396 = var396.substring(class145.field2347.length());
                                }
                            }
                            String var400 = var396.toLowerCase();
                            byte var401 = 0;
                            if (var400.startsWith(class145.field2160)) {
                                var401 = 1;
                                var396 = var396.substring(class145.field2160.length());
                            } else if (var400.startsWith(class145.field2350)) {
                                var401 = 2;
                                var396 = var396.substring(class145.field2350.length());
                            } else if (var400.startsWith(class145.field2352)) {
                                var401 = 3;
                                var396 = var396.substring(class145.field2352.length());
                            } else if (var400.startsWith(class145.field2363)) {
                                var401 = 4;
                                var396 = var396.substring(class145.field2363.length());
                            } else if (var400.startsWith(class145.field2356)) {
                                var401 = 5;
                                var396 = var396.substring(class145.field2356.length());
                            } else if (client.field324 != 0) {
                                if (var400.startsWith(class145.field2349)) {
                                    var401 = 1;
                                    var396 = var396.substring(class145.field2349.length());
                                } else if (var400.startsWith(class145.field2209)) {
                                    var401 = 2;
                                    var396 = var396.substring(class145.field2209.length());
                                } else if (var400.startsWith(class145.field2353)) {
                                    var401 = 3;
                                    var396 = var396.substring(class145.field2353.length());
                                } else if (var400.startsWith(class145.field2358)) {
                                    var401 = 4;
                                    var396 = var396.substring(class145.field2358.length());
                                } else if (var400.startsWith(class145.field2357)) {
                                    var401 = 5;
                                    var396 = var396.substring(class145.field2357.length());
                                }
                            }
                            client.field285.method2312(114);
                            client.field285.method2069(0);
                            int var402 = client.field285.field1824;
                            client.field285.method2069(var397);
                            client.field285.method2069(var399);
                            client.field285.method2069(var401);
                            class111 var403 = client.field285;
                            int var404 = var403.field1824;
                            byte[] var405 = Statics.method2397(var396);
                            var403.method2081(var405.length);
                            var403.field1824 += Statics.field2953.method2016(var405, 0, var405.length, var403.field1828, var403.field1824);
                            client.field285.method2189(client.field285.field1824 - var402);
                            continue;
                        }
                        if (var435 == 5009) {
                            var6 -= 2;
                            String var406 = field724[var6];
                            String var407 = field724[var6 + 1];
                            client.field285.method2312(177);
                            client.field285.method2195(0);
                            int var408 = client.field285.field1824;
                            client.field285.method2074(var406);
                            class111 var409 = client.field285;
                            int var410 = var409.field1824;
                            byte[] var411 = Statics.method2397(var407);
                            var409.method2081(var411.length);
                            var409.field1824 += Statics.field2953.method2016(var411, 0, var411.length, var409.field1828, var409.field1824);
                            client.field285.method2079(client.field285.field1824 - var408);
                            continue;
                        }
                        if (var435 == 5015) {
                            String var412;
                            if (Statics.field2031 == null || Statics.field2031.field39 == null) {
                                var412 = "";
                            } else {
                                var412 = Statics.field2031.field39;
                            }
                            field724[var6++] = var412;
                            continue;
                        }
                        if (var435 == 5016) {
                            field723[var5++] = client.field465;
                            continue;
                        }
                        if (var435 == 5017) {
                            var5--;
                            int var413 = field723[var5];
                            int[] var414 = field723;
                            int var415 = var5++;
                            class25 var416 = (class25) class10.field141.get(var413);
                            int var417;
                            if (var416 == null) {
                                var417 = 0;
                            } else {
                                var417 = var416.method500();
                            }
                            var414[var415] = var417;
                            continue;
                        }
                        if (var435 == 5018) {
                            var5--;
                            int var418 = field723[var5];
                            int[] var419 = field723;
                            int var420 = var5++;
                            class32 var421 = (class32) class10.field140.method3156((long) var418);
                            int var422;
                            if (var421 == null) {
                                var422 = -1;
                            } else if (class10.field143.field2871 == var421.field2876) {
                                var422 = -1;
                            } else {
                                var422 = ((class32) var421.field2876).field711;
                            }
                            var419[var420] = var422;
                            continue;
                        }
                        if (var435 == 5019) {
                            var5--;
                            int var423 = field723[var5];
                            int[] var424 = field723;
                            int var425 = var5++;
                            class32 var426 = (class32) class10.field140.method3156((long) var423);
                            int var427;
                            if (var426 == null) {
                                var427 = -1;
                            } else if (class10.field143.field2871 == var426.field2875) {
                                var427 = -1;
                            } else {
                                var427 = ((class32) var426.field2875).field711;
                            }
                            var424[var425] = var427;
                            continue;
                        }
                        if (var435 == 5020) {
                            var6--;
                            String var428 = field724[var6];
                            client.method87(var428);
                            continue;
                        }
                        if (var435 == 5021) {
                            var6--;
                            client.field466 = field724[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var435 == 5022) {
                            field724[var6++] = client.field466;
                            continue;
                        }
                    }
                }
                if (var435 >= 5600 || var435 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var429 = field723[var5];
                int var430 = field723[var5 + 1];
                if (!client.field494) {
                    client.field329 = var429;
                    client.field330 = var430;
                }
            }
        } catch (Exception var434) {
            StringBuilder var432 = new StringBuilder(30);
            var432.append("").append(var4.field2887).append(" ");
            for (int var433 = field729 - 1; var433 >= 0; var433--) {
                var432.append("").append(field726[var433].field170.field2887).append(" ");
            }
            var432.append("").append(var10);
            class137.method2362(var432.toString(), var434);
        }
    }

    @ObfuscatedName("dx.j(IB)V")
    public static void method2431(int arg0) {
        if (arg0 == -1 || !class155.method1264(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2565[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3.field2607 != null) {
                class1 var4 = new class1();
                var4.field18 = var3;
                var4.field15 = var3.field2607;
                method124(var4, 2000000);
            }
        }
    }
}
