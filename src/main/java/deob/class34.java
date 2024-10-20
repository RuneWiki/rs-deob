package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ae")
public class class34 {

    @ObfuscatedName("ae.u")
    public static int[] field708 = new int[5];

    @ObfuscatedName("ae.w")
    public static int[][] field709 = new int[5][5000];

    @ObfuscatedName("ae.i")
    public static int[] field706 = new int[1000];

    @ObfuscatedName("ae.r")
    public static String[] field711 = new String[1000];

    @ObfuscatedName("ae.f")
    public static int field710 = 0;

    @ObfuscatedName("ae.g")
    public static class14[] field713 = new class14[50];

    @ObfuscatedName("ae.s")
    public static Calendar field712 = Calendar.getInstance();

    @ObfuscatedName("ae.j")
    public static final String[] field716 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.a(Le;II)V")
    public static void method1474(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method871(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field526;
        int[] var9 = var4.field520;
        byte var10 = -1;
        field710 = 0;
        try {
            Statics.field707 = new int[var4.field522];
            int var11 = 0;
            Statics.field611 = new String[var4.field518];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field16;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2618;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2619;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2618;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2619;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field10;
                    }
                    Statics.field707[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field4;
                    }
                    Statics.field611[var12++] = var15;
                }
            }
            int var16 = 0;
            label2653: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var459 = var8[var7];
                if (var459 < 100) {
                    if (var459 == 0) {
                        field706[var5++] = var9[var7];
                        continue;
                    }
                    if (var459 == 1) {
                        int var17 = var9[var7];
                        field706[var5++] = class166.field2753[var17];
                        continue;
                    }
                    if (var459 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class166.field2753[var18] = field706[var5];
                        client.method2505(var18);
                        continue;
                    }
                    if (var459 == 3) {
                        field711[var6++] = var4.field521[var7];
                        continue;
                    }
                    if (var459 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var459 == 7) {
                        var5 -= 2;
                        if (field706[var5 + 1] != field706[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var459 == 8) {
                        var5 -= 2;
                        if (field706[var5 + 1] == field706[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var459 == 9) {
                        var5 -= 2;
                        if (field706[var5] < field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var459 == 10) {
                        var5 -= 2;
                        if (field706[var5] > field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var459 == 21) {
                        if (field710 == 0) {
                            return;
                        }
                        class14 var19 = field713[--field710];
                        var4 = var19.field181;
                        var8 = var4.field526;
                        var9 = var4.field520;
                        var7 = var19.field189;
                        Statics.field707 = var19.field188;
                        Statics.field611 = var19.field182;
                        continue;
                    }
                    if (var459 == 25) {
                        int var20 = var9[var7];
                        field706[var5++] = class166.method40(var20);
                        continue;
                    }
                    if (var459 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field706[var5];
                        class44 var23 = class44.method838(var21);
                        int var24 = var23.field964;
                        int var25 = var23.field967;
                        int var26 = var23.field968;
                        int var27 = class166.field2751[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class166.field2753[var24] = class166.field2753[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var459 == 31) {
                        var5 -= 2;
                        if (field706[var5] <= field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var459 == 32) {
                        var5 -= 2;
                        if (field706[var5] >= field706[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var459 == 33) {
                        field706[var5++] = Statics.field707[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var459 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field707[var10001] = field706[var5];
                        continue;
                    }
                    if (var459 == 35) {
                        field711[var6++] = Statics.field611[var9[var7]];
                        continue;
                    }
                    if (var459 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field611[var10001] = field711[var6];
                        continue;
                    }
                    if (var459 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class154.method2305(field711, var6, var29);
                        field711[var6++] = var30;
                        continue;
                    }
                    if (var459 == 38) {
                        var5--;
                        continue;
                    }
                    if (var459 == 39) {
                        var6--;
                        continue;
                    }
                    if (var459 == 40) {
                        int var31 = var9[var7];
                        class20 var32 = class20.method871(var31);
                        int[] var33 = new int[var32.field522];
                        String[] var34 = new String[var32.field518];
                        for (int var35 = 0; var35 < var32.field523; var35++) {
                            var33[var35] = field706[var5 - var32.field523 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field525; var36++) {
                            var34[var36] = field711[var6 - var32.field525 + var36];
                        }
                        var5 -= var32.field523;
                        var6 -= var32.field525;
                        class14 var37 = new class14();
                        var37.field181 = var4;
                        var37.field189 = var7;
                        var37.field188 = Statics.field707;
                        var37.field182 = Statics.field611;
                        field713[++field710 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field526;
                        var9 = var32.field520;
                        var7 = -1;
                        Statics.field707 = var33;
                        Statics.field611 = var34;
                        continue;
                    }
                    if (var459 == 42) {
                        field706[var5++] = client.field442[var9[var7]];
                        continue;
                    }
                    if (var459 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field442[var10001] = field706[var5];
                        continue;
                    }
                    if (var459 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field706[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field708[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2653;
                                }
                                field709[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var459 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field706[var5];
                        if (var44 >= 0 && var44 < field708[var43]) {
                            field706[var5++] = field709[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var459 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field706[var5];
                        if (var46 >= 0 && var46 < field708[var45]) {
                            field709[var45][var46] = field706[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var459 == 47) {
                        String var47 = client.field443[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field711[var6++] = var47;
                        continue;
                    }
                    if (var459 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field443[var10001] = field711[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var459 < 1000) {
                    if (var459 == 100) {
                        var5 -= 3;
                        int var49 = field706[var5];
                        int var50 = field706[var5 + 1];
                        int var51 = field706[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var52 = class164.method128(var49);
                        if (var52.field2729 == null) {
                            var52.field2729 = new class164[var51 + 1];
                        }
                        if (var52.field2729.length <= var51) {
                            class164[] var53 = new class164[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2729.length; var54++) {
                                var53[var54] = var52.field2729[var54];
                            }
                            var52.field2729 = var53;
                        }
                        if (var51 > 0 && var52.field2729[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class164 var55 = new class164();
                        var55.field2620 = var50;
                        var55.field2629 = var55.field2618 = var52.field2618;
                        var55.field2619 = var51;
                        var55.field2709 = true;
                        var52.field2729[var51] = var55;
                        if (var48) {
                            Statics.field701 = var55;
                        } else {
                            Statics.field714 = var55;
                        }
                        client.method2384(var52);
                        continue;
                    }
                    if (var459 == 101) {
                        class164 var56 = var48 ? Statics.field701 : Statics.field714;
                        class164 var57 = class164.method128(var56.field2618);
                        var57.field2729[var56.field2619] = null;
                        client.method2384(var57);
                        continue;
                    }
                    if (var459 == 102) {
                        var5--;
                        class164 var58 = class164.method128(field706[var5]);
                        var58.field2729 = null;
                        client.method2384(var58);
                        continue;
                    }
                    if (var459 == 200) {
                        var5 -= 2;
                        int var59 = field706[var5];
                        int var60 = field706[var5 + 1];
                        class164 var61 = class164.method2779(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field706[var5++] = 1;
                            if (var48) {
                                Statics.field701 = var61;
                            } else {
                                Statics.field714 = var61;
                            }
                            continue;
                        }
                        field706[var5++] = 0;
                        continue;
                    }
                } else if (var459 >= 1000 && var459 < 1100 || var459 >= 2000 && var459 < 2100) {
                    class164 var62;
                    if (var459 >= 2000) {
                        var459 -= 1000;
                        var5--;
                        var62 = class164.method128(field706[var5]);
                    } else {
                        var62 = var48 ? Statics.field701 : Statics.field714;
                    }
                    if (var459 == 1000) {
                        var5 -= 2;
                        var62.field2623 = field706[var5];
                        var62.field2624 = field706[var5 + 1];
                        client.method2384(var62);
                        continue;
                    }
                    if (var459 == 1001) {
                        var5 -= 2;
                        var62.field2627 = field706[var5];
                        var62.field2628 = field706[var5 + 1];
                        client.method2384(var62);
                        continue;
                    }
                    if (var459 == 1003) {
                        var5--;
                        boolean var63 = field706[var5] == 1;
                        if (var62.field2681 != var63) {
                            var62.field2681 = var63;
                            client.method2384(var62);
                        }
                        continue;
                    }
                } else if (var459 >= 1100 && var459 < 1200 || var459 >= 2100 && var459 < 2200) {
                    class164 var64;
                    if (var459 >= 2000) {
                        var459 -= 1000;
                        var5--;
                        var64 = class164.method128(field706[var5]);
                    } else {
                        var64 = var48 ? Statics.field701 : Statics.field714;
                    }
                    if (var459 == 1100) {
                        var5 -= 2;
                        var64.field2631 = field706[var5];
                        if (var64.field2631 > var64.field2706 - var64.field2627) {
                            var64.field2631 = var64.field2706 - var64.field2627;
                        }
                        if (var64.field2631 < 0) {
                            var64.field2631 = 0;
                        }
                        var64.field2632 = field706[var5 + 1];
                        if (var64.field2632 > var64.field2727 - var64.field2628) {
                            var64.field2632 = var64.field2727 - var64.field2628;
                        }
                        if (var64.field2632 < 0) {
                            var64.field2632 = 0;
                        }
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1101) {
                        var5--;
                        var64.field2635 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1102) {
                        var5--;
                        var64.field2639 = field706[var5] == 1;
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1103) {
                        var5--;
                        var64.field2734 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1104) {
                        var5--;
                        var64.field2705 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1105) {
                        var5--;
                        var64.field2642 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1106) {
                        var5--;
                        var64.field2644 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1107) {
                        var5--;
                        var64.field2654 = field706[var5] == 1;
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1108) {
                        var64.field2650 = 1;
                        var5--;
                        var64.field2651 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1109) {
                        var5 -= 6;
                        var64.field2656 = field706[var5];
                        var64.field2736 = field706[var5 + 1];
                        var64.field2658 = field706[var5 + 2];
                        var64.field2659 = field706[var5 + 3];
                        var64.field2643 = field706[var5 + 4];
                        var64.field2664 = field706[var5 + 5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1110) {
                        var5--;
                        int var65 = field706[var5];
                        if (var64.field2610 != var65) {
                            var64.field2610 = var65;
                            var64.field2688 = 0;
                            var64.field2728 = 0;
                            client.method2384(var64);
                        }
                        continue;
                    }
                    if (var459 == 1111) {
                        var5--;
                        var64.field2663 = field706[var5] == 1;
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1112) {
                        var6--;
                        String var66 = field711[var6];
                        if (!var66.equals(var64.field2617)) {
                            var64.field2617 = var66;
                            client.method2384(var64);
                        }
                        continue;
                    }
                    if (var459 == 1113) {
                        var5--;
                        var64.field2665 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1114) {
                        var5 -= 3;
                        var64.field2669 = field706[var5];
                        var64.field2670 = field706[var5 + 1];
                        var64.field2732 = field706[var5 + 2];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1115) {
                        var5--;
                        var64.field2671 = field706[var5] == 1;
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1116) {
                        var5--;
                        var64.field2733 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1117) {
                        var5--;
                        var64.field2647 = field706[var5];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1118) {
                        var5--;
                        var64.field2648 = field706[var5] == 1;
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1119) {
                        var5--;
                        var64.field2649 = field706[var5] == 1;
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1120) {
                        var5 -= 2;
                        var64.field2706 = field706[var5];
                        var64.field2727 = field706[var5 + 1];
                        client.method2384(var64);
                        continue;
                    }
                    if (var459 == 1121) {
                        client.method111(var64.field2618, var64.field2619);
                        client.field409 = var64;
                        client.method2384(var64);
                        continue;
                    }
                } else if (var459 >= 1200 && var459 < 1300 || var459 >= 2200 && var459 < 2300) {
                    class164 var67;
                    if (var459 >= 2000) {
                        var459 -= 1000;
                        var5--;
                        var67 = class164.method128(field706[var5]);
                    } else {
                        var67 = var48 ? Statics.field701 : Statics.field714;
                    }
                    client.method2384(var67);
                    if (var459 == 1200 || var459 == 1205 || var459 == 1212) {
                        var5 -= 2;
                        int var68 = field706[var5];
                        int var69 = field706[var5 + 1];
                        var67.field2613 = var68;
                        var67.field2726 = var69;
                        class47 var70 = class47.method2467(var68);
                        var67.field2658 = var70.field1006;
                        var67.field2659 = var70.field1007;
                        var67.field2643 = var70.field1008;
                        var67.field2656 = var70.field1009;
                        var67.field2736 = var70.field1028;
                        var67.field2664 = var70.field1005;
                        if (var459 == 1205) {
                            var67.field2702 = 0;
                        } else if (var459 == 1212 | var70.field1032 == 1) {
                            var67.field2702 = 1;
                        } else {
                            var67.field2702 = 2;
                        }
                        if (var67.field2627 > 0) {
                            var67.field2664 = var67.field2664 * 32 / var67.field2627;
                        }
                        continue;
                    }
                    if (var459 == 1201) {
                        var67.field2650 = 2;
                        var5--;
                        var67.field2651 = field706[var5];
                        continue;
                    }
                    if (var459 == 1202) {
                        var67.field2650 = 3;
                        var67.field2651 = Statics.field3024.field34.method3050();
                        continue;
                    }
                } else if (var459 >= 1300 && var459 < 1400 || var459 >= 2300 && var459 < 2400) {
                    class164 var71;
                    if (var459 >= 2000) {
                        var459 -= 1000;
                        var5--;
                        var71 = class164.method128(field706[var5]);
                    } else {
                        var71 = var48 ? Statics.field701 : Statics.field714;
                    }
                    if (var459 == 1300) {
                        var5--;
                        int var72 = field706[var5] - 1;
                        if (var72 >= 0 && var72 <= 9) {
                            var6--;
                            var71.method2978(var72, field711[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var459 == 1301) {
                        var5 -= 2;
                        int var73 = field706[var5];
                        int var74 = field706[var5 + 1];
                        var71.field2657 = class164.method2779(var73, var74);
                        continue;
                    }
                    if (var459 == 1302) {
                        var5--;
                        var71.field2684 = field706[var5] == 1;
                        continue;
                    }
                    if (var459 == 1303) {
                        var5--;
                        var71.field2712 = field706[var5];
                        continue;
                    }
                    if (var459 == 1304) {
                        var5--;
                        var71.field2630 = field706[var5];
                        continue;
                    }
                    if (var459 == 1305) {
                        var6--;
                        var71.field2675 = field711[var6];
                        continue;
                    }
                    if (var459 == 1306) {
                        var6--;
                        var71.field2685 = field711[var6];
                        continue;
                    }
                    if (var459 == 1307) {
                        var71.field2680 = null;
                        continue;
                    }
                } else {
                    if (var459 >= 1400 && var459 < 1500 || var459 >= 2400 && var459 < 2500) {
                        class164 var75;
                        if (var459 >= 2000) {
                            var459 -= 1000;
                            var5--;
                            var75 = class164.method128(field706[var5]);
                        } else {
                            var75 = var48 ? Statics.field701 : Statics.field714;
                        }
                        var6--;
                        String var76 = field711[var6];
                        int[] var77 = null;
                        if (var76.length() > 0 && var76.charAt(var76.length() - 1) == 'Y') {
                            var5--;
                            int var78 = field706[var5];
                            if (var78 > 0) {
                                var77 = new int[var78];
                                while (var78-- > 0) {
                                    var5--;
                                    var77[var78] = field706[var5];
                                }
                            }
                            var76 = var76.substring(0, var76.length() - 1);
                        }
                        Object[] var79 = new Object[var76.length() + 1];
                        for (int var80 = var79.length - 1; var80 >= 1; var80--) {
                            if (var76.charAt(var80 - 1) == 's') {
                                var6--;
                                var79[var80] = field711[var6];
                            } else {
                                var5--;
                                var79[var80] = Integer.valueOf(field706[var5]);
                            }
                        }
                        var5--;
                        int var81 = field706[var5];
                        if (var81 == -1) {
                            var79 = null;
                        } else {
                            var79[0] = Integer.valueOf(var81);
                        }
                        if (var459 == 1400) {
                            var75.field2668 = var79;
                        }
                        if (var459 == 1401) {
                            var75.field2719 = var79;
                        }
                        if (var459 == 1402) {
                            var75.field2690 = var79;
                        }
                        if (var459 == 1403) {
                            var75.field2692 = var79;
                        }
                        if (var459 == 1404) {
                            var75.field2694 = var79;
                        }
                        if (var459 == 1405) {
                            var75.field2695 = var79;
                        }
                        if (var459 == 1406) {
                            var75.field2698 = var79;
                        }
                        if (var459 == 1407) {
                            var75.field2699 = var79;
                            var75.field2700 = var77;
                        }
                        if (var459 == 1408) {
                            var75.field2622 = var79;
                        }
                        if (var459 == 1409) {
                            var75.field2691 = var79;
                        }
                        if (var459 == 1410) {
                            var75.field2696 = var79;
                        }
                        if (var459 == 1411) {
                            var75.field2689 = var79;
                        }
                        if (var459 == 1412) {
                            var75.field2682 = var79;
                        }
                        if (var459 == 1414) {
                            var75.field2701 = var79;
                            var75.field2738 = var77;
                        }
                        if (var459 == 1415) {
                            var75.field2703 = var79;
                            var75.field2704 = var77;
                        }
                        if (var459 == 1416) {
                            var75.field2707 = var79;
                        }
                        if (var459 == 1417) {
                            var75.field2608 = var79;
                        }
                        if (var459 == 1418) {
                            var75.field2708 = var79;
                        }
                        if (var459 == 1419) {
                            var75.field2634 = var79;
                        }
                        if (var459 == 1420) {
                            var75.field2710 = var79;
                        }
                        if (var459 == 1421) {
                            var75.field2616 = var79;
                        }
                        if (var459 == 1422) {
                            var75.field2687 = var79;
                        }
                        if (var459 == 1423) {
                            var75.field2713 = var79;
                        }
                        if (var459 == 1424) {
                            var75.field2714 = var79;
                        }
                        if (var459 == 1425) {
                            var75.field2715 = var79;
                        }
                        if (var459 == 1426) {
                            var75.field2716 = var79;
                        }
                        var75.field2641 = true;
                        continue;
                    }
                    if (var459 < 1600) {
                        class164 var82 = var48 ? Statics.field701 : Statics.field714;
                        if (var459 == 1500) {
                            field706[var5++] = var82.field2623;
                            continue;
                        }
                        if (var459 == 1501) {
                            field706[var5++] = var82.field2624;
                            continue;
                        }
                        if (var459 == 1502) {
                            field706[var5++] = var82.field2627;
                            continue;
                        }
                        if (var459 == 1503) {
                            field706[var5++] = var82.field2628;
                            continue;
                        }
                        if (var459 == 1504) {
                            field706[var5++] = var82.field2681 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 1505) {
                            field706[var5++] = var82.field2629;
                            continue;
                        }
                    } else if (var459 < 1700) {
                        class164 var83 = var48 ? Statics.field701 : Statics.field714;
                        if (var459 == 1600) {
                            field706[var5++] = var83.field2631;
                            continue;
                        }
                        if (var459 == 1601) {
                            field706[var5++] = var83.field2632;
                            continue;
                        }
                        if (var459 == 1602) {
                            field711[var6++] = var83.field2617;
                            continue;
                        }
                        if (var459 == 1603) {
                            field706[var5++] = var83.field2706;
                            continue;
                        }
                        if (var459 == 1604) {
                            field706[var5++] = var83.field2727;
                            continue;
                        }
                        if (var459 == 1605) {
                            field706[var5++] = var83.field2664;
                            continue;
                        }
                        if (var459 == 1606) {
                            field706[var5++] = var83.field2658;
                            continue;
                        }
                        if (var459 == 1607) {
                            field706[var5++] = var83.field2643;
                            continue;
                        }
                        if (var459 == 1608) {
                            field706[var5++] = var83.field2659;
                            continue;
                        }
                        if (var459 == 1609) {
                            field706[var5++] = var83.field2734;
                            continue;
                        }
                    } else if (var459 < 1800) {
                        class164 var84 = var48 ? Statics.field701 : Statics.field714;
                        if (var459 == 1700) {
                            field706[var5++] = var84.field2613;
                            continue;
                        }
                        if (var459 == 1701) {
                            if (var84.field2613 == -1) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = var84.field2726;
                            }
                            continue;
                        }
                        if (var459 == 1702) {
                            field706[var5++] = var84.field2619;
                            continue;
                        }
                    } else if (var459 < 1900) {
                        class164 var85 = var48 ? Statics.field701 : Statics.field714;
                        if (var459 == 1800) {
                            int[] var86 = field706;
                            int var87 = var5++;
                            int var88 = client.method191(var85);
                            int var89 = var88 >> 11 & 0x3F;
                            var86[var87] = var89;
                            continue;
                        }
                        if (var459 == 1801) {
                            var5--;
                            int var90 = field706[var5];
                            int var460 = var90 - 1;
                            if (var85.field2680 != null && var460 < var85.field2680.length && var85.field2680[var460] != null) {
                                field711[var6++] = var85.field2680[var460];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 1802) {
                            if (var85.field2675 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = var85.field2675;
                            }
                            continue;
                        }
                    } else if (var459 < 2600) {
                        var5--;
                        class164 var91 = class164.method128(field706[var5]);
                        if (var459 == 2500) {
                            field706[var5++] = var91.field2623;
                            continue;
                        }
                        if (var459 == 2501) {
                            field706[var5++] = var91.field2624;
                            continue;
                        }
                        if (var459 == 2502) {
                            field706[var5++] = var91.field2627;
                            continue;
                        }
                        if (var459 == 2503) {
                            field706[var5++] = var91.field2628;
                            continue;
                        }
                        if (var459 == 2504) {
                            field706[var5++] = var91.field2681 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 2505) {
                            field706[var5++] = var91.field2629;
                            continue;
                        }
                    } else if (var459 < 2700) {
                        var5--;
                        class164 var92 = class164.method128(field706[var5]);
                        if (var459 == 2600) {
                            field706[var5++] = var92.field2631;
                            continue;
                        }
                        if (var459 == 2601) {
                            field706[var5++] = var92.field2632;
                            continue;
                        }
                        if (var459 == 2602) {
                            field711[var6++] = var92.field2617;
                            continue;
                        }
                        if (var459 == 2603) {
                            field706[var5++] = var92.field2706;
                            continue;
                        }
                        if (var459 == 2604) {
                            field706[var5++] = var92.field2727;
                            continue;
                        }
                        if (var459 == 2605) {
                            field706[var5++] = var92.field2664;
                            continue;
                        }
                        if (var459 == 2606) {
                            field706[var5++] = var92.field2658;
                            continue;
                        }
                        if (var459 == 2607) {
                            field706[var5++] = var92.field2643;
                            continue;
                        }
                        if (var459 == 2608) {
                            field706[var5++] = var92.field2659;
                            continue;
                        }
                        if (var459 == 2609) {
                            field706[var5++] = var92.field2734;
                            continue;
                        }
                    } else if (var459 < 2800) {
                        if (var459 == 2700) {
                            var5--;
                            class164 var93 = class164.method128(field706[var5]);
                            field706[var5++] = var93.field2613;
                            continue;
                        }
                        if (var459 == 2701) {
                            var5--;
                            class164 var94 = class164.method128(field706[var5]);
                            if (var94.field2613 == -1) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = var94.field2726;
                            }
                            continue;
                        }
                        if (var459 == 2702) {
                            var5--;
                            int var95 = field706[var5];
                            class4 var96 = (class4) client.field406.method3339((long) var95);
                            if (var96 == null) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var459 < 2900) {
                        var5--;
                        class164 var97 = class164.method128(field706[var5]);
                        if (var459 == 2800) {
                            int[] var98 = field706;
                            int var99 = var5++;
                            int var100 = client.method191(var97);
                            int var101 = var100 >> 11 & 0x3F;
                            var98[var99] = var101;
                            continue;
                        }
                        if (var459 == 2801) {
                            var5--;
                            int var102 = field706[var5];
                            int var461 = var102 - 1;
                            if (var97.field2680 != null && var461 < var97.field2680.length && var97.field2680[var461] != null) {
                                field711[var6++] = var97.field2680[var461];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 2802) {
                            if (var97.field2675 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = var97.field2675;
                            }
                            continue;
                        }
                    } else if (var459 < 3200) {
                        if (var459 == 3100) {
                            var6--;
                            String var103 = field711[var6];
                            class11.method35(0, "", var103);
                            continue;
                        }
                        if (var459 == 3101) {
                            var5 -= 2;
                            client.method175(Statics.field3024, field706[var5], field706[var5 + 1]);
                            continue;
                        }
                        if (var459 == 3103) {
                            client.method7();
                            continue;
                        }
                        if (var459 == 3104) {
                            var6--;
                            String var104 = field711[var6];
                            int var105 = 0;
                            if (class154.method574(var104)) {
                                int var106 = Statics.method1113(var104, 10, true);
                                var105 = var106;
                            }
                            client.field475.method2438(223);
                            client.field475.method2229(var105);
                            continue;
                        }
                        if (var459 == 3105) {
                            var6--;
                            String var107 = field711[var6];
                            client.field475.method2438(205);
                            client.field475.method2366(var107.length() + 1);
                            client.field475.method2177(var107);
                            continue;
                        }
                        if (var459 == 3106) {
                            var6--;
                            String var108 = field711[var6];
                            client.field475.method2438(246);
                            client.field475.method2366(var108.length() + 1);
                            client.field475.method2177(var108);
                            continue;
                        }
                        if (var459 == 3107) {
                            var5--;
                            int var109 = field706[var5];
                            var6--;
                            String var110 = field711[var6];
                            client.method794(var109, var110);
                            continue;
                        }
                        if (var459 == 3108) {
                            var5 -= 3;
                            int var111 = field706[var5];
                            int var112 = field706[var5 + 1];
                            int var113 = field706[var5 + 2];
                            class164 var114 = class164.method128(var113);
                            client.method3292(var114, var111, var112);
                            continue;
                        }
                        if (var459 == 3109) {
                            var5 -= 2;
                            int var115 = field706[var5];
                            int var116 = field706[var5 + 1];
                            class164 var117 = var48 ? Statics.field701 : Statics.field714;
                            client.method3292(var117, var115, var116);
                            continue;
                        }
                        if (var459 == 3110) {
                            var5--;
                            Statics.field517 = field706[var5] == 1;
                            continue;
                        }
                        if (var459 == 3111) {
                            field706[var5++] = Statics.field1806.field128 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3112) {
                            var5--;
                            Statics.field1806.field128 = field706[var5] == 1;
                            class9.method1068();
                            continue;
                        }
                        if (var459 == 3113) {
                            var6--;
                            String var118 = field711[var6];
                            var5--;
                            boolean var119 = field706[var5] == 1;
                            class130.method2942(var118, var119, false);
                            continue;
                        }
                        if (var459 == 3115) {
                            var5--;
                            int var120 = field706[var5];
                            client.field475.method2438(234);
                            client.field475.method2190(var120);
                            continue;
                        }
                    } else if (var459 < 3300) {
                        if (var459 == 3200) {
                            var5 -= 3;
                            client.method197(field706[var5], field706[var5 + 1], field706[var5 + 2]);
                            continue;
                        }
                        if (var459 == 3201) {
                            var5--;
                            client.method773(field706[var5]);
                            continue;
                        }
                        if (var459 == 3202) {
                            var5 -= 2;
                            int var121 = field706[var5];
                            int var10000 = field706[var5 + 1];
                            if (client.field479 != 0 && var121 != -1) {
                                class173.method631(Statics.field195, var121, 0, client.field479, false);
                                client.field481 = true;
                            }
                            continue;
                        }
                    } else if (var459 < 3400) {
                        if (var459 == 3300) {
                            field706[var5++] = client.field256;
                            continue;
                        }
                        if (var459 == 3301) {
                            var5 -= 2;
                            int var123 = field706[var5];
                            int var124 = field706[var5 + 1];
                            field706[var5++] = class15.method1929(var123, var124);
                            continue;
                        }
                        if (var459 == 3302) {
                            var5 -= 2;
                            int var125 = field706[var5];
                            int var126 = field706[var5 + 1];
                            field706[var5++] = class15.method618(var125, var126);
                            continue;
                        }
                        if (var459 == 3303) {
                            var5 -= 2;
                            int var127 = field706[var5];
                            int var128 = field706[var5 + 1];
                            int[] var129 = field706;
                            int var130 = var5++;
                            class15 var131 = (class15) class15.field194.method3339((long) var127);
                            int var132;
                            if (var131 == null) {
                                var132 = 0;
                            } else if (var128 == -1) {
                                var132 = 0;
                            } else {
                                int var133 = 0;
                                for (int var134 = 0; var134 < var131.field193.length; var134++) {
                                    if (var131.field201[var134] == var128) {
                                        var133 += var131.field193[var134];
                                    }
                                }
                                var132 = var133;
                            }
                            var129[var130] = var132;
                            continue;
                        }
                        if (var459 == 3304) {
                            var5--;
                            int var135 = field706[var5];
                            int[] var136 = field706;
                            int var137 = var5++;
                            class46 var138 = (class46) class46.field988.method3302((long) var135);
                            class46 var139;
                            if (var138 == null) {
                                byte[] var140 = Statics.field987.method2843(5, var135);
                                class46 var141 = new class46();
                                if (var140 != null) {
                                    var141.method872(new class111(var140));
                                }
                                class46.field988.method3304(var141, (long) var135);
                                var139 = var141;
                            } else {
                                var139 = var138;
                            }
                            var136[var137] = var139.field989;
                            continue;
                        }
                        if (var459 == 3305) {
                            var5--;
                            int var142 = field706[var5];
                            field706[var5++] = client.field382[var142];
                            continue;
                        }
                        if (var459 == 3306) {
                            var5--;
                            int var143 = field706[var5];
                            field706[var5++] = client.field383[var143];
                            continue;
                        }
                        if (var459 == 3307) {
                            var5--;
                            int var144 = field706[var5];
                            field706[var5++] = client.field282[var144];
                            continue;
                        }
                        if (var459 == 3308) {
                            int var145 = Statics.field2842;
                            int var146 = (Statics.field3024.field767 >> 7) + Statics.field545;
                            int var147 = (Statics.field3024.field722 >> 7) + Statics.field1653;
                            field706[var5++] = (var145 << 28) + (var146 << 14) + var147;
                            continue;
                        }
                        if (var459 == 3309) {
                            var5--;
                            int var148 = field706[var5];
                            field706[var5++] = var148 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var459 == 3310) {
                            var5--;
                            int var149 = field706[var5];
                            field706[var5++] = var149 >> 28;
                            continue;
                        }
                        if (var459 == 3311) {
                            var5--;
                            int var150 = field706[var5];
                            field706[var5++] = var150 & 0x3FFF;
                            continue;
                        }
                        if (var459 == 3312) {
                            field706[var5++] = client.field249 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3313) {
                            var5 -= 2;
                            int var151 = field706[var5] + 32768;
                            int var152 = field706[var5 + 1];
                            field706[var5++] = class15.method1929(var151, var152);
                            continue;
                        }
                        if (var459 == 3314) {
                            var5 -= 2;
                            int var153 = field706[var5] + 32768;
                            int var154 = field706[var5 + 1];
                            field706[var5++] = class15.method618(var153, var154);
                            continue;
                        }
                        if (var459 == 3315) {
                            var5 -= 2;
                            int var155 = field706[var5] + 32768;
                            int var156 = field706[var5 + 1];
                            int[] var157 = field706;
                            int var158 = var5++;
                            class15 var159 = (class15) class15.field194.method3339((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = 0;
                            } else if (var156 == -1) {
                                var160 = 0;
                            } else {
                                int var161 = 0;
                                for (int var162 = 0; var162 < var159.field193.length; var162++) {
                                    if (var159.field201[var162] == var156) {
                                        var161 += var159.field193[var162];
                                    }
                                }
                                var160 = var161;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var459 == 3316) {
                            if (client.field412 >= 2) {
                                field706[var5++] = client.field412;
                            } else {
                                field706[var5++] = 0;
                            }
                            continue;
                        }
                        if (var459 == 3317) {
                            field706[var5++] = client.field263;
                            continue;
                        }
                        if (var459 == 3318) {
                            field706[var5++] = client.field244;
                            continue;
                        }
                        if (var459 == 3321) {
                            field706[var5++] = client.field410;
                            continue;
                        }
                        if (var459 == 3322) {
                            field706[var5++] = client.field291;
                            continue;
                        }
                        if (var459 == 3323) {
                            if (client.field414) {
                                field706[var5++] = 1;
                            } else {
                                field706[var5++] = 0;
                            }
                            continue;
                        }
                        if (var459 == 3324) {
                            field706[var5++] = client.field245;
                            continue;
                        }
                    } else if (var459 < 3500) {
                        if (var459 == 3400) {
                            var5 -= 2;
                            int var163 = field706[var5];
                            int var164 = field706[var5 + 1];
                            class45 var165 = class45.method117(var163);
                            if (var165.field984 != 's') {
                            }
                            for (int var166 = 0; var166 < var165.field979; var166++) {
                                if (var165.field980[var166] == var164) {
                                    field711[var6++] = var165.field982[var166];
                                    var165 = null;
                                    break;
                                }
                            }
                            if (var165 != null) {
                                field711[var6++] = var165.field977;
                            }
                            continue;
                        }
                        if (var459 == 3408) {
                            var5 -= 4;
                            int var167 = field706[var5];
                            int var168 = field706[var5 + 1];
                            int var169 = field706[var5 + 2];
                            int var170 = field706[var5 + 3];
                            class45 var171 = class45.method117(var169);
                            if (var171.field973 == var167 && var171.field984 == var168) {
                                for (int var172 = 0; var172 < var171.field979; var172++) {
                                    if (var171.field980[var172] == var170) {
                                        if (var168 == 115) {
                                            field711[var6++] = var171.field982[var172];
                                        } else {
                                            field706[var5++] = var171.field981[var172];
                                        }
                                        var171 = null;
                                        break;
                                    }
                                }
                                if (var171 != null) {
                                    if (var168 == 115) {
                                        field711[var6++] = var171.field977;
                                    } else {
                                        field706[var5++] = var171.field985;
                                    }
                                }
                                continue;
                            }
                            if (var168 == 115) {
                                field711[var6++] = "null";
                            } else {
                                field706[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var459 < 3700) {
                        if (var459 == 3600) {
                            if (client.field497 == 0) {
                                field706[var5++] = -2;
                            } else if (client.field497 == 1) {
                                field706[var5++] = -1;
                            } else {
                                field706[var5++] = client.field385;
                            }
                            continue;
                        }
                        if (var459 == 3601) {
                            var5--;
                            int var173 = field706[var5];
                            if (client.field497 == 2 && var173 < client.field385) {
                                field711[var6++] = client.field498[var173].field223;
                                field711[var6++] = client.field498[var173].field224;
                                continue;
                            }
                            field711[var6++] = "";
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 3602) {
                            var5--;
                            int var174 = field706[var5];
                            if (client.field497 == 2 && var174 < client.field385) {
                                field706[var5++] = client.field498[var174].field225;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var459 == 3603) {
                            var5--;
                            int var175 = field706[var5];
                            if (client.field497 == 2 && var175 < client.field385) {
                                field706[var5++] = client.field498[var175].field229;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var459 == 3604) {
                            var6--;
                            String var176 = field711[var6];
                            var5--;
                            int var177 = field706[var5];
                            client.field475.method2438(53);
                            class114 var178 = client.field475;
                            int var179 = var176.length() + 1;
                            var178.method2366(var179 + 1);
                            client.field475.method2177(var176);
                            client.field475.method2354(var177);
                            continue;
                        }
                        if (var459 == 3605) {
                            var6--;
                            String var180 = field711[var6];
                            if (var180 == null) {
                                continue;
                            }
                            if ((client.field385 < 200 || client.field370 == 1) && client.field385 < 400) {
                                String var181 = class155.method2125(var180, Statics.field1854);
                                if (var181 == null) {
                                    continue;
                                }
                                for (int var182 = 0; var182 < client.field385; var182++) {
                                    class17 var183 = client.field498[var182];
                                    String var184 = class155.method2125(var183.field223, Statics.field1854);
                                    if (var184 != null && var184.equals(var181)) {
                                        class11.method35(30, "", var180 + class148.field2327);
                                        continue label2653;
                                    }
                                    if (var183.field224 != null) {
                                        String var185 = class155.method2125(var183.field224, Statics.field1854);
                                        if (var185 != null && var185.equals(var181)) {
                                            class11.method35(30, "", var180 + class148.field2327);
                                            continue label2653;
                                        }
                                    }
                                }
                                for (int var186 = 0; var186 < client.field500; var186++) {
                                    class8 var187 = client.field501[var186];
                                    String var188 = class155.method2125(var187.field124, Statics.field1854);
                                    if (var188 != null && var188.equals(var181)) {
                                        class11.method35(30, "", class148.field2332 + var180 + class148.field2333);
                                        continue label2653;
                                    }
                                    if (var187.field121 != null) {
                                        String var189 = class155.method2125(var187.field121, Statics.field1854);
                                        if (var189 != null && var189.equals(var181)) {
                                            class11.method35(30, "", class148.field2332 + var180 + class148.field2333);
                                            continue label2653;
                                        }
                                    }
                                }
                                if (class155.method2125(Statics.field3024.field43, Statics.field1854).equals(var181)) {
                                    class11.method35(30, "", class148.field2330);
                                } else {
                                    client.field475.method2438(178);
                                    class114 var190 = client.field475;
                                    int var191 = var180.length() + 1;
                                    var190.method2366(var191);
                                    client.field475.method2177(var180);
                                }
                                continue;
                            }
                            class11.method35(30, "", class148.field2326);
                            continue;
                        }
                        if (var459 == 3606) {
                            var6--;
                            String var192 = field711[var6];
                            client.method1428(var192);
                            continue;
                        }
                        if (var459 == 3607) {
                            var6--;
                            String var193 = field711[var6];
                            client.method209(var193, false);
                            continue;
                        }
                        if (var459 == 3608) {
                            var6--;
                            String var194 = field711[var6];
                            if (var194 == null) {
                                continue;
                            }
                            String var195 = class155.method2125(var194, Statics.field1854);
                            if (var195 == null) {
                                continue;
                            }
                            int var196 = 0;
                            while (true) {
                                if (var196 >= client.field500) {
                                    continue label2653;
                                }
                                class8 var197 = client.field501[var196];
                                String var198 = var197.field124;
                                String var199 = class155.method2125(var198, Statics.field1854);
                                if (class121.method546(var194, var195, var198, var199)) {
                                    client.field500--;
                                    for (int var200 = var196; var200 < client.field500; var200++) {
                                        client.field501[var200] = client.field501[var200 + 1];
                                    }
                                    client.field447 = client.field429;
                                    client.field475.method2438(30);
                                    class114 var201 = client.field475;
                                    int var202 = var194.length() + 1;
                                    var201.method2366(var202);
                                    client.field475.method2177(var194);
                                    continue label2653;
                                }
                                var196++;
                            }
                        }
                        if (var459 == 3609) {
                            var6--;
                            String var203 = field711[var6];
                            class143[] var204 = new class143[] { class143.field2111, class143.field2112, class143.field2119, class143.field2113, class143.field2114 };
                            class143[] var205 = var204;
                            for (int var206 = 0; var206 < var205.length; var206++) {
                                class143 var207 = var205[var206];
                                if (var207.field2116 != -1) {
                                    int var209 = var207.field2116;
                                    String var210 = "<img=" + var209 + ">";
                                    if (var203.startsWith(var210)) {
                                        var203 = var203.substring(6 + Integer.toString(var207.field2116).length());
                                        break;
                                    }
                                }
                            }
                            field706[var5++] = client.method98(var203, false) ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3611) {
                            if (client.field469 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = class153.method2118(client.field469);
                            }
                            continue;
                        }
                        if (var459 == 3612) {
                            if (client.field469 == null) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = Statics.field1439;
                            }
                            continue;
                        }
                        if (var459 == 3613) {
                            var5--;
                            int var211 = field706[var5];
                            if (client.field469 != null && var211 < Statics.field1439) {
                                field711[var6++] = Statics.field126[var211].field569;
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 3614) {
                            var5--;
                            int var212 = field706[var5];
                            if (client.field469 != null && var212 < Statics.field1439) {
                                field706[var5++] = Statics.field126[var212].field564;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var459 == 3615) {
                            var5--;
                            int var213 = field706[var5];
                            if (client.field469 != null && var213 < Statics.field1439) {
                                field706[var5++] = Statics.field126[var213].field570;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var459 == 3616) {
                            field706[var5++] = Statics.field2524;
                            continue;
                        }
                        if (var459 == 3617) {
                            var6--;
                            String var214 = field711[var6];
                            if (Statics.field126 != null) {
                                client.field475.method2438(122);
                                class114 var215 = client.field475;
                                int var216 = var214.length() + 1;
                                var215.method2366(var216);
                                client.field475.method2177(var214);
                            }
                            continue;
                        }
                        if (var459 == 3618) {
                            field706[var5++] = Statics.field516;
                            continue;
                        }
                        if (var459 == 3619) {
                            var6--;
                            String var217 = field711[var6];
                            client.method3279(var217);
                            continue;
                        }
                        if (var459 == 3620) {
                            client.field475.method2438(168);
                            client.field475.method2366(0);
                            continue;
                        }
                        if (var459 == 3621) {
                            if (client.field497 == 0) {
                                field706[var5++] = -1;
                            } else {
                                field706[var5++] = client.field500;
                            }
                            continue;
                        }
                        if (var459 == 3622) {
                            var5--;
                            int var218 = field706[var5];
                            if (client.field497 != 0 && var218 < client.field500) {
                                field711[var6++] = client.field501[var218].field124;
                                field711[var6++] = client.field501[var218].field121;
                                continue;
                            }
                            field711[var6++] = "";
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 3623) {
                            String var219;
                            label2369: {
                                var6--;
                                var219 = field711[var6];
                                String var221 = "<img=0>";
                                if (!var219.startsWith(var221)) {
                                    String var223 = "<img=1>";
                                    if (!var219.startsWith(var223)) {
                                        break label2369;
                                    }
                                }
                                var219 = var219.substring(7);
                            }
                            field706[var5++] = client.method138(var219) ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3624) {
                            var5--;
                            int var224 = field706[var5];
                            if (Statics.field126 != null && var224 < Statics.field1439 && Statics.field126[var224].field569.equalsIgnoreCase(Statics.field3024.field43)) {
                                field706[var5++] = 1;
                                continue;
                            }
                            field706[var5++] = 0;
                            continue;
                        }
                        if (var459 == 3625) {
                            if (client.field381 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = class153.method2118(client.field381);
                            }
                            continue;
                        }
                    } else if (var459 < 4000) {
                        if (var459 == 3903) {
                            var5--;
                            int var225 = field706[var5];
                            field706[var5++] = client.field372[var225].method3542();
                            continue;
                        }
                        if (var459 == 3904) {
                            var5--;
                            int var226 = field706[var5];
                            field706[var5++] = client.field372[var226].field3032;
                            continue;
                        }
                        if (var459 == 3905) {
                            var5--;
                            int var227 = field706[var5];
                            field706[var5++] = client.field372[var227].field3026;
                            continue;
                        }
                        if (var459 == 3906) {
                            var5--;
                            int var228 = field706[var5];
                            field706[var5++] = client.field372[var228].field3029;
                            continue;
                        }
                        if (var459 == 3907) {
                            var5--;
                            int var229 = field706[var5];
                            field706[var5++] = client.field372[var229].field3030;
                            continue;
                        }
                        if (var459 == 3908) {
                            var5--;
                            int var230 = field706[var5];
                            field706[var5++] = client.field372[var230].field3031;
                            continue;
                        }
                        if (var459 == 3910) {
                            var5--;
                            int var231 = field706[var5];
                            int var232 = client.field372[var231].method3539();
                            field706[var5++] = var232 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3911) {
                            var5--;
                            int var233 = field706[var5];
                            int var234 = client.field372[var233].method3539();
                            field706[var5++] = var234 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3912) {
                            var5--;
                            int var235 = field706[var5];
                            int var236 = client.field372[var235].method3539();
                            field706[var5++] = var236 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3913) {
                            var5--;
                            int var237 = field706[var5];
                            int var238 = client.field372[var237].method3539();
                            field706[var5++] = var238 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 3914) {
                            var5--;
                            boolean var239 = field706[var5] == 1;
                            if (Statics.field2035 != null) {
                                Statics.field2035.method3554(class211.field3037, var239);
                            }
                            continue;
                        }
                        if (var459 == 3915) {
                            var5--;
                            boolean var240 = field706[var5] == 1;
                            if (Statics.field2035 != null) {
                                Statics.field2035.method3554(class211.field3035, var240);
                            }
                            continue;
                        }
                        if (var459 == 3916) {
                            var5 -= 2;
                            boolean var241 = field706[var5] == 1;
                            boolean var242 = field706[var5 + 1] == 1;
                            if (Statics.field2035 != null) {
                                Statics.field2035.method3554(new class21(var242), var241);
                            }
                            continue;
                        }
                        if (var459 == 3917) {
                            var5--;
                            boolean var243 = field706[var5] == 1;
                            if (Statics.field2035 != null) {
                                Statics.field2035.method3554(class211.field3036, var243);
                            }
                            continue;
                        }
                        if (var459 == 3918) {
                            var5--;
                            boolean var244 = field706[var5] == 1;
                            if (Statics.field2035 != null) {
                                Statics.field2035.method3554(class211.field3033, var244);
                            }
                            continue;
                        }
                        if (var459 == 3919) {
                            field706[var5++] = Statics.field2035 == null ? 0 : Statics.field2035.field3034.size();
                            continue;
                        }
                        if (var459 == 3920) {
                            var5--;
                            int var245 = field706[var5];
                            class204 var246 = (class204) Statics.field2035.field3034.get(var245);
                            field706[var5++] = var246.field2998;
                            continue;
                        }
                        if (var459 == 3921) {
                            var5--;
                            int var247 = field706[var5];
                            class204 var248 = (class204) Statics.field2035.field3034.get(var247);
                            field711[var6++] = var248.method3499();
                            continue;
                        }
                        if (var459 == 3922) {
                            var5--;
                            int var249 = field706[var5];
                            class204 var250 = (class204) Statics.field2035.field3034.get(var249);
                            field711[var6++] = var250.method3500();
                            continue;
                        }
                        if (var459 == 3923) {
                            var5--;
                            int var251 = field706[var5];
                            class204 var252 = (class204) Statics.field2035.field3034.get(var251);
                            long var253 = class107.method635() - Statics.field554 - var252.field3002;
                            int var255 = (int) (var253 / 3600000L);
                            int var256 = (int) ((var253 - (long) (var255 * 3600000)) / 60000L);
                            int var257 = (int) ((var253 - (long) (var255 * 3600000) - (long) (var256 * 60000)) / 1000L);
                            String var258 = var255 + ":" + var256 / 10 + var256 % 10 + ":" + var257 / 10 + var257 % 10;
                            field711[var6++] = var258;
                            continue;
                        }
                        if (var459 == 3924) {
                            var5--;
                            int var259 = field706[var5];
                            class204 var260 = (class204) Statics.field2035.field3034.get(var259);
                            field706[var5++] = var260.field3000.field3029;
                            continue;
                        }
                        if (var459 == 3925) {
                            var5--;
                            int var261 = field706[var5];
                            class204 var262 = (class204) Statics.field2035.field3034.get(var261);
                            field706[var5++] = var262.field3000.field3026;
                            continue;
                        }
                        if (var459 == 3926) {
                            var5--;
                            int var263 = field706[var5];
                            class204 var264 = (class204) Statics.field2035.field3034.get(var263);
                            field706[var5++] = var264.field3000.field3032;
                            continue;
                        }
                    } else if (var459 < 4100) {
                        if (var459 == 4000) {
                            var5 -= 2;
                            int var265 = field706[var5];
                            int var266 = field706[var5 + 1];
                            field706[var5++] = var265 + var266;
                            continue;
                        }
                        if (var459 == 4001) {
                            var5 -= 2;
                            int var267 = field706[var5];
                            int var268 = field706[var5 + 1];
                            field706[var5++] = var267 - var268;
                            continue;
                        }
                        if (var459 == 4002) {
                            var5 -= 2;
                            int var269 = field706[var5];
                            int var270 = field706[var5 + 1];
                            field706[var5++] = var269 * var270;
                            continue;
                        }
                        if (var459 == 4003) {
                            var5 -= 2;
                            int var271 = field706[var5];
                            int var272 = field706[var5 + 1];
                            field706[var5++] = var271 / var272;
                            continue;
                        }
                        if (var459 == 4004) {
                            var5--;
                            int var273 = field706[var5];
                            field706[var5++] = (int) (Math.random() * (double) var273);
                            continue;
                        }
                        if (var459 == 4005) {
                            var5--;
                            int var274 = field706[var5];
                            field706[var5++] = (int) (Math.random() * (double) (var274 + 1));
                            continue;
                        }
                        if (var459 == 4006) {
                            var5 -= 5;
                            int var275 = field706[var5];
                            int var276 = field706[var5 + 1];
                            int var277 = field706[var5 + 2];
                            int var278 = field706[var5 + 3];
                            int var279 = field706[var5 + 4];
                            field706[var5++] = (var276 - var275) * (var279 - var277) / (var278 - var277) + var275;
                            continue;
                        }
                        if (var459 == 4007) {
                            var5 -= 2;
                            int var280 = field706[var5];
                            int var281 = field706[var5 + 1];
                            field706[var5++] = var280 * var281 / 100 + var280;
                            continue;
                        }
                        if (var459 == 4008) {
                            var5 -= 2;
                            int var282 = field706[var5];
                            int var283 = field706[var5 + 1];
                            field706[var5++] = var282 | 0x1 << var283;
                            continue;
                        }
                        if (var459 == 4009) {
                            var5 -= 2;
                            int var284 = field706[var5];
                            int var285 = field706[var5 + 1];
                            field706[var5++] = var284 & -1 - (0x1 << var285);
                            continue;
                        }
                        if (var459 == 4010) {
                            var5 -= 2;
                            int var286 = field706[var5];
                            int var287 = field706[var5 + 1];
                            field706[var5++] = (var286 & 0x1 << var287) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var459 == 4011) {
                            var5 -= 2;
                            int var288 = field706[var5];
                            int var289 = field706[var5 + 1];
                            field706[var5++] = var288 % var289;
                            continue;
                        }
                        if (var459 == 4012) {
                            var5 -= 2;
                            int var290 = field706[var5];
                            int var291 = field706[var5 + 1];
                            if (var290 == 0) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = (int) Math.pow((double) var290, (double) var291);
                            }
                            continue;
                        }
                        if (var459 == 4013) {
                            var5 -= 2;
                            int var292 = field706[var5];
                            int var293 = field706[var5 + 1];
                            if (var292 == 0) {
                                field706[var5++] = 0;
                            } else if (var293 == 0) {
                                field706[var5++] = Integer.MAX_VALUE;
                            } else {
                                field706[var5++] = (int) Math.pow((double) var292, 1.0D / (double) var293);
                            }
                            continue;
                        }
                        if (var459 == 4014) {
                            var5 -= 2;
                            int var294 = field706[var5];
                            int var295 = field706[var5 + 1];
                            field706[var5++] = var294 & var295;
                            continue;
                        }
                        if (var459 == 4015) {
                            var5 -= 2;
                            int var296 = field706[var5];
                            int var297 = field706[var5 + 1];
                            field706[var5++] = var296 | var297;
                            continue;
                        }
                    } else if (var459 < 4200) {
                        if (var459 == 4100) {
                            var6--;
                            String var298 = field711[var6];
                            var5--;
                            int var299 = field706[var5];
                            field711[var6++] = var298 + var299;
                            continue;
                        }
                        if (var459 == 4101) {
                            var6 -= 2;
                            String var300 = field711[var6];
                            String var301 = field711[var6 + 1];
                            field711[var6++] = var300 + var301;
                            continue;
                        }
                        if (var459 == 4102) {
                            var6--;
                            String var302 = field711[var6];
                            var5--;
                            int var303 = field706[var5];
                            String[] var304 = field711;
                            int var305 = var6++;
                            String var307;
                            if (var303 < 0) {
                                var307 = Integer.toString(var303);
                            } else {
                                var307 = class154.method1903(var303, 10, true);
                            }
                            var304[var305] = var302 + var307;
                            continue;
                        }
                        if (var459 == 4103) {
                            var6--;
                            String var308 = field711[var6];
                            field711[var6++] = var308.toLowerCase();
                            continue;
                        }
                        if (var459 == 4104) {
                            var5--;
                            int var309 = field706[var5];
                            long var310 = ((long) var309 + 11745L) * 86400000L;
                            field712.setTime(new Date(var310));
                            int var312 = field712.get(5);
                            int var313 = field712.get(2);
                            int var314 = field712.get(1);
                            field711[var6++] = var312 + "-" + field716[var313] + "-" + var314;
                            continue;
                        }
                        if (var459 == 4105) {
                            var6 -= 2;
                            String var315 = field711[var6];
                            String var316 = field711[var6 + 1];
                            if (Statics.field3024.field34 != null && Statics.field3024.field34.field2764) {
                                field711[var6++] = var316;
                                continue;
                            }
                            field711[var6++] = var315;
                            continue;
                        }
                        if (var459 == 4106) {
                            var5--;
                            int var317 = field706[var5];
                            field711[var6++] = Integer.toString(var317);
                            continue;
                        }
                        if (var459 == 4107) {
                            var6 -= 2;
                            int[] var318 = field706;
                            int var319 = var5++;
                            String var320 = field711[var6];
                            String var321 = field711[var6 + 1];
                            int var322 = client.field251;
                            int var323 = var320.length();
                            int var324 = var321.length();
                            int var325 = 0;
                            int var326 = 0;
                            byte var327 = 0;
                            byte var328 = 0;
                            int var329;
                            label2433: while (true) {
                                if (var325 - var327 >= var323 && var326 - var328 >= var324) {
                                    int var340 = Math.min(var323, var324);
                                    for (int var341 = 0; var341 < var340; var341++) {
                                        char var344 = var320.charAt(var341);
                                        char var345 = var321.charAt(var341);
                                        if (var344 != var345 && Character.toUpperCase(var344) != Character.toUpperCase(var345)) {
                                            char var346 = Character.toLowerCase(var344);
                                            char var347 = Character.toLowerCase(var345);
                                            if (var346 != var347) {
                                                var329 = class157.method2545(var346, var322) - class157.method2545(var347, var322);
                                                break label2433;
                                            }
                                        }
                                    }
                                    int var348 = var323 - var324;
                                    if (var348 == 0) {
                                        for (int var349 = 0; var349 < var340; var349++) {
                                            char var350 = var320.charAt(var349);
                                            char var351 = var321.charAt(var349);
                                            if (var350 != var351) {
                                                var329 = class157.method2545(var350, var322) - class157.method2545(var351, var322);
                                                break label2433;
                                            }
                                        }
                                        var329 = 0;
                                    } else {
                                        var329 = var348;
                                    }
                                    break;
                                }
                                if (var325 - var327 >= var323) {
                                    var329 = -1;
                                    break;
                                }
                                if (var326 - var328 >= var324) {
                                    var329 = 1;
                                    break;
                                }
                                char var330;
                                if (var327 == 0) {
                                    var330 = var320.charAt(var325++);
                                } else {
                                    var330 = (char) var327;
                                    boolean var331 = false;
                                }
                                char var332;
                                if (var328 == 0) {
                                    var332 = var321.charAt(var326++);
                                } else {
                                    var332 = (char) var328;
                                    boolean var333 = false;
                                }
                                byte var334;
                                if (var330 == 198) {
                                    var334 = 69;
                                } else if (var330 == 230) {
                                    var334 = 101;
                                } else if (var330 == 223) {
                                    var334 = 115;
                                } else if (var330 == 338) {
                                    var334 = 69;
                                } else if (var330 == 339) {
                                    var334 = 101;
                                } else {
                                    var334 = 0;
                                }
                                var327 = var334;
                                byte var335;
                                if (var332 == 198) {
                                    var335 = 69;
                                } else if (var332 == 230) {
                                    var335 = 101;
                                } else if (var332 == 223) {
                                    var335 = 115;
                                } else if (var332 == 338) {
                                    var335 = 69;
                                } else if (var332 == 339) {
                                    var335 = 101;
                                } else {
                                    var335 = 0;
                                }
                                var328 = var335;
                                char var336 = class157.method1069(var330, var322);
                                char var337 = class157.method1069(var332, var322);
                                if (var336 != var337 && Character.toUpperCase(var336) != Character.toUpperCase(var337)) {
                                    char var338 = Character.toLowerCase(var336);
                                    char var339 = Character.toLowerCase(var337);
                                    if (var338 != var339) {
                                        var329 = class157.method2545(var338, var322) - class157.method2545(var339, var322);
                                        break;
                                    }
                                }
                            }
                            var318[var319] = class154.method2669(var329);
                            continue;
                        }
                        if (var459 == 4108) {
                            var6--;
                            String var352 = field711[var6];
                            var5 -= 2;
                            int var353 = field706[var5];
                            int var354 = field706[var5 + 1];
                            byte[] var355 = Statics.field1255.method2843(var354, 0);
                            class214 var356 = new class214(var355);
                            field706[var5++] = var356.method3578(var352, var353);
                            continue;
                        }
                        if (var459 == 4109) {
                            var6--;
                            String var357 = field711[var6];
                            var5 -= 2;
                            int var358 = field706[var5];
                            int var359 = field706[var5 + 1];
                            byte[] var360 = Statics.field1255.method2843(var359, 0);
                            class214 var361 = new class214(var360);
                            field706[var5++] = var361.method3563(var357, var358);
                            continue;
                        }
                        if (var459 == 4110) {
                            var6 -= 2;
                            String var362 = field711[var6];
                            String var363 = field711[var6 + 1];
                            var5--;
                            if (field706[var5] == 1) {
                                field711[var6++] = var362;
                            } else {
                                field711[var6++] = var363;
                            }
                            continue;
                        }
                        if (var459 == 4111) {
                            var6--;
                            String var364 = field711[var6];
                            field711[var6++] = class213.method3565(var364);
                            continue;
                        }
                        if (var459 == 4112) {
                            var6--;
                            String var365 = field711[var6];
                            var5--;
                            int var366 = field706[var5];
                            field711[var6++] = var365 + (char) var366;
                            continue;
                        }
                        if (var459 == 4113) {
                            var5--;
                            int var367 = field706[var5];
                            field706[var5++] = Statics.method720((char) var367) ? 1 : 0;
                            continue;
                        }
                        if (var459 == 4114) {
                            var5--;
                            int var368 = field706[var5];
                            int[] var369 = field706;
                            int var370 = var5++;
                            char var371 = (char) var368;
                            boolean var372 = var371 >= '0' && var371 <= '9' || var371 >= 'A' && var371 <= 'Z' || var371 >= 'a' && var371 <= 'z';
                            var369[var370] = var372 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 4115) {
                            var5--;
                            int var373 = field706[var5];
                            int[] var374 = field706;
                            int var375 = var5++;
                            char var376 = (char) var373;
                            boolean var377 = var376 >= 'A' && var376 <= 'Z' || var376 >= 'a' && var376 <= 'z';
                            var374[var375] = var377 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 4116) {
                            var5--;
                            int var378 = field706[var5];
                            int[] var379 = field706;
                            int var380 = var5++;
                            char var381 = (char) var378;
                            boolean var382 = var381 >= '0' && var381 <= '9';
                            var379[var380] = var382 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 4117) {
                            var6--;
                            String var383 = field711[var6];
                            if (var383 == null) {
                                field706[var5++] = 0;
                            } else {
                                field706[var5++] = var383.length();
                            }
                            continue;
                        }
                        if (var459 == 4118) {
                            var6--;
                            String var384 = field711[var6];
                            var5 -= 2;
                            int var385 = field706[var5];
                            int var386 = field706[var5 + 1];
                            field711[var6++] = var384.substring(var385, var386);
                            continue;
                        }
                        if (var459 == 4119) {
                            var6--;
                            String var387 = field711[var6];
                            StringBuilder var388 = new StringBuilder(var387.length());
                            boolean var389 = false;
                            for (int var390 = 0; var390 < var387.length(); var390++) {
                                char var391 = var387.charAt(var390);
                                if (var391 == '<') {
                                    var389 = true;
                                } else if (var391 == '>') {
                                    var389 = false;
                                } else if (!var389) {
                                    var388.append(var391);
                                }
                            }
                            field711[var6++] = var388.toString();
                            continue;
                        }
                        if (var459 == 4120) {
                            var6--;
                            String var392 = field711[var6];
                            var5--;
                            int var393 = field706[var5];
                            field706[var5++] = var392.indexOf(var393);
                            continue;
                        }
                        if (var459 == 4121) {
                            var6 -= 2;
                            String var394 = field711[var6];
                            String var395 = field711[var6 + 1];
                            var5--;
                            int var396 = field706[var5];
                            field706[var5++] = var394.indexOf(var395, var396);
                            continue;
                        }
                    } else if (var459 < 4300) {
                        if (var459 == 4200) {
                            var5--;
                            int var397 = field706[var5];
                            field711[var6++] = class47.method2467(var397).field1000;
                            continue;
                        }
                        if (var459 == 4201) {
                            var5 -= 2;
                            int var398 = field706[var5];
                            int var399 = field706[var5 + 1];
                            class47 var400 = class47.method2467(var398);
                            if (var399 >= 1 && var399 <= 5 && var400.field1018[var399 - 1] != null) {
                                field711[var6++] = var400.field1018[var399 - 1];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 4202) {
                            var5 -= 2;
                            int var401 = field706[var5];
                            int var402 = field706[var5 + 1];
                            class47 var403 = class47.method2467(var401);
                            if (var402 >= 1 && var402 <= 5 && var403.field1015[var402 - 1] != null) {
                                field711[var6++] = var403.field1015[var402 - 1];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var459 == 4203) {
                            var5--;
                            int var404 = field706[var5];
                            field706[var5++] = class47.method2467(var404).field1012;
                            continue;
                        }
                        if (var459 == 4204) {
                            var5--;
                            int var405 = field706[var5];
                            field706[var5++] = class47.method2467(var405).field1032 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 4205) {
                            var5--;
                            int var406 = field706[var5];
                            class47 var407 = class47.method2467(var406);
                            if (var407.field1031 == -1 && var407.field1030 >= 0) {
                                field706[var5++] = var407.field1030;
                                continue;
                            }
                            field706[var5++] = var406;
                            continue;
                        }
                        if (var459 == 4206) {
                            var5--;
                            int var408 = field706[var5];
                            class47 var409 = class47.method2467(var408);
                            if (var409.field1031 >= 0 && var409.field1030 >= 0) {
                                field706[var5++] = var409.field1030;
                                continue;
                            }
                            field706[var5++] = var408;
                            continue;
                        }
                        if (var459 == 4207) {
                            var5--;
                            int var410 = field706[var5];
                            field706[var5++] = class47.method2467(var410).field1004 ? 1 : 0;
                            continue;
                        }
                        if (var459 == 4210) {
                            var6--;
                            String var411 = field711[var6];
                            var5--;
                            int var412 = field706[var5];
                            boolean var414 = var412 == 1;
                            String var415 = var411.toLowerCase();
                            short[] var416 = new short[16];
                            int var417 = 0;
                            int var418 = 0;
                            while (true) {
                                if (var418 >= Statics.field993) {
                                    Statics.field528 = var416;
                                    Statics.field1398 = 0;
                                    Statics.field1800 = var417;
                                    String[] var422 = new String[Statics.field1800];
                                    for (int var423 = 0; var423 < Statics.field1800; var423++) {
                                        var422[var423] = class47.method2467(var416[var423]).field1000;
                                    }
                                    class116.method1468(var422, Statics.field528);
                                    break;
                                }
                                class47 var419 = class47.method2467(var418);
                                if ((!var414 || var419.field1038) && var419.field1031 == -1 && var419.field1000.toLowerCase().indexOf(var415) != -1) {
                                    if (var417 >= 250) {
                                        Statics.field1800 = -1;
                                        Statics.field528 = null;
                                        break;
                                    }
                                    if (var417 >= var416.length) {
                                        short[] var420 = new short[var416.length * 2];
                                        for (int var421 = 0; var421 < var417; var421++) {
                                            var420[var421] = var416[var421];
                                        }
                                        var416 = var420;
                                    }
                                    var416[var417++] = (short) var418;
                                }
                                var418++;
                            }
                            field706[var5++] = Statics.field1800;
                            continue;
                        }
                        if (var459 == 4211) {
                            if (Statics.field528 != null && Statics.field1398 < Statics.field1800) {
                                field706[var5++] = Statics.field528[++Statics.field1398 - 1] & 0xFFFF;
                                continue;
                            }
                            field706[var5++] = -1;
                            continue;
                        }
                        if (var459 == 4212) {
                            Statics.field1398 = 0;
                            continue;
                        }
                    } else if (var459 < 5100) {
                        if (var459 == 5000) {
                            field706[var5++] = client.field272;
                            continue;
                        }
                        if (var459 == 5001) {
                            var5 -= 3;
                            client.field272 = field706[var5];
                            Statics.field93 = class122.method1100(field706[var5 + 1]);
                            if (Statics.field93 == null) {
                                Statics.field93 = class122.field1903;
                            }
                            client.field466 = field706[var5 + 2];
                            client.field475.method2438(5);
                            client.field475.method2366(client.field272);
                            client.field475.method2366(Statics.field93.field1900);
                            client.field475.method2366(client.field466);
                            continue;
                        }
                        if (var459 == 5002) {
                            var6--;
                            String var424 = field711[var6];
                            var5 -= 2;
                            int var425 = field706[var5];
                            int var426 = field706[var5 + 1];
                            client.field475.method2438(207);
                            class114 var427 = client.field475;
                            int var428 = var424.length() + 1;
                            var427.method2366(var428 + 2);
                            client.field475.method2177(var424);
                            client.field475.method2366(var425 - 1);
                            client.field475.method2366(var426);
                            continue;
                        }
                        if (var459 == 5003) {
                            var5 -= 2;
                            int var429 = field706[var5];
                            int var430 = field706[var5 + 1];
                            class33 var431 = class11.method1912(var429, var430);
                            if (var431 == null) {
                                field706[var5++] = -1;
                                field706[var5++] = 0;
                                field711[var6++] = "";
                                field711[var6++] = "";
                                field711[var6++] = "";
                            } else {
                                field706[var5++] = var431.field699;
                                field706[var5++] = var431.field693;
                                field711[var6++] = var431.field695 == null ? "" : var431.field695;
                                field711[var6++] = var431.field696 == null ? "" : var431.field696;
                                field711[var6++] = var431.field698 == null ? "" : var431.field698;
                            }
                            continue;
                        }
                        if (var459 == 5004) {
                            var5--;
                            int var432 = field706[var5];
                            class33 var433 = class11.method160(var432);
                            if (var433 == null) {
                                field706[var5++] = -1;
                                field706[var5++] = 0;
                                field711[var6++] = "";
                                field711[var6++] = "";
                                field711[var6++] = "";
                            } else {
                                field706[var5++] = var433.field702;
                                field706[var5++] = var433.field693;
                                field711[var6++] = var433.field695 == null ? "" : var433.field695;
                                field711[var6++] = var433.field696 == null ? "" : var433.field696;
                                field711[var6++] = var433.field698 == null ? "" : var433.field698;
                            }
                            continue;
                        }
                        if (var459 == 5005) {
                            if (Statics.field93 == null) {
                                field706[var5++] = -1;
                            } else {
                                field706[var5++] = Statics.field93.field1900;
                            }
                            continue;
                        }
                        if (var459 == 5008) {
                            var6--;
                            String var434 = field711[var6];
                            var5--;
                            int var435 = field706[var5];
                            String var436 = var434.toLowerCase();
                            byte var437 = 0;
                            if (var436.startsWith(class148.field2336)) {
                                var437 = 0;
                                var434 = var434.substring(class148.field2336.length());
                            } else if (var436.startsWith(class148.field2338)) {
                                var437 = 1;
                                var434 = var434.substring(class148.field2338.length());
                            } else if (var436.startsWith(class148.field2185)) {
                                var437 = 2;
                                var434 = var434.substring(class148.field2185.length());
                            } else if (var436.startsWith(class148.field2342)) {
                                var437 = 3;
                                var434 = var434.substring(class148.field2342.length());
                            } else if (var436.startsWith(class148.field2344)) {
                                var437 = 4;
                                var434 = var434.substring(class148.field2344.length());
                            } else if (var436.startsWith(class148.field2165)) {
                                var437 = 5;
                                var434 = var434.substring(class148.field2165.length());
                            } else if (var436.startsWith(class148.field2239)) {
                                var437 = 6;
                                var434 = var434.substring(class148.field2239.length());
                            } else if (var436.startsWith(class148.field2350)) {
                                var437 = 7;
                                var434 = var434.substring(class148.field2350.length());
                            } else if (var436.startsWith(class148.field2352)) {
                                var437 = 8;
                                var434 = var434.substring(class148.field2352.length());
                            } else if (var436.startsWith(class148.field2354)) {
                                var437 = 9;
                                var434 = var434.substring(class148.field2354.length());
                            } else if (var436.startsWith(class148.field2356)) {
                                var437 = 10;
                                var434 = var434.substring(class148.field2356.length());
                            } else if (var436.startsWith(class148.field2358)) {
                                var437 = 11;
                                var434 = var434.substring(class148.field2358.length());
                            } else if (client.field251 != 0) {
                                if (var436.startsWith(class148.field2193)) {
                                    var437 = 0;
                                    var434 = var434.substring(class148.field2193.length());
                                } else if (var436.startsWith(class148.field2339)) {
                                    var437 = 1;
                                    var434 = var434.substring(class148.field2339.length());
                                } else if (var436.startsWith(class148.field2426)) {
                                    var437 = 2;
                                    var434 = var434.substring(class148.field2426.length());
                                } else if (var436.startsWith(class148.field2343)) {
                                    var437 = 3;
                                    var434 = var434.substring(class148.field2343.length());
                                } else if (var436.startsWith(class148.field2345)) {
                                    var437 = 4;
                                    var434 = var434.substring(class148.field2345.length());
                                } else if (var436.startsWith(class148.field2347)) {
                                    var437 = 5;
                                    var434 = var434.substring(class148.field2347.length());
                                } else if (var436.startsWith(class148.field2349)) {
                                    var437 = 6;
                                    var434 = var434.substring(class148.field2349.length());
                                } else if (var436.startsWith(class148.field2351)) {
                                    var437 = 7;
                                    var434 = var434.substring(class148.field2351.length());
                                } else if (var436.startsWith(class148.field2427)) {
                                    var437 = 8;
                                    var434 = var434.substring(class148.field2427.length());
                                } else if (var436.startsWith(class148.field2355)) {
                                    var437 = 9;
                                    var434 = var434.substring(class148.field2355.length());
                                } else if (var436.startsWith(class148.field2357)) {
                                    var437 = 10;
                                    var434 = var434.substring(class148.field2357.length());
                                } else if (var436.startsWith(class148.field2359)) {
                                    var437 = 11;
                                    var434 = var434.substring(class148.field2359.length());
                                }
                            }
                            String var438 = var434.toLowerCase();
                            byte var439 = 0;
                            if (var438.startsWith(class148.field2360)) {
                                var439 = 1;
                                var434 = var434.substring(class148.field2360.length());
                            } else if (var438.startsWith(class148.field2430)) {
                                var439 = 2;
                                var434 = var434.substring(class148.field2430.length());
                            } else if (var438.startsWith(class148.field2401)) {
                                var439 = 3;
                                var434 = var434.substring(class148.field2401.length());
                            } else if (var438.startsWith(class148.field2254)) {
                                var439 = 4;
                                var434 = var434.substring(class148.field2254.length());
                            } else if (var438.startsWith(class148.field2368)) {
                                var439 = 5;
                                var434 = var434.substring(class148.field2368.length());
                            } else if (client.field251 != 0) {
                                if (var438.startsWith(class148.field2361)) {
                                    var439 = 1;
                                    var434 = var434.substring(class148.field2361.length());
                                } else if (var438.startsWith(class148.field2431)) {
                                    var439 = 2;
                                    var434 = var434.substring(class148.field2431.length());
                                } else if (var438.startsWith(class148.field2289)) {
                                    var439 = 3;
                                    var434 = var434.substring(class148.field2289.length());
                                } else if (var438.startsWith(class148.field2367)) {
                                    var439 = 4;
                                    var434 = var434.substring(class148.field2367.length());
                                } else if (var438.startsWith(class148.field2369)) {
                                    var439 = 5;
                                    var434 = var434.substring(class148.field2369.length());
                                }
                            }
                            client.field475.method2438(77);
                            client.field475.method2366(0);
                            int var440 = client.field475.field1834;
                            client.field475.method2366(var435);
                            client.field475.method2366(var437);
                            client.field475.method2366(var439);
                            class212.method2480(client.field475, var434);
                            client.field475.method2211(client.field475.field1834 - var440);
                            continue;
                        }
                        if (var459 == 5009) {
                            var6 -= 2;
                            String var441 = field711[var6];
                            String var442 = field711[var6 + 1];
                            client.field475.method2438(51);
                            client.field475.method2190(0);
                            int var443 = client.field475.field1834;
                            client.field475.method2177(var441);
                            class212.method2480(client.field475, var442);
                            client.field475.method2172(client.field475.field1834 - var443);
                            continue;
                        }
                        if (var459 == 5015) {
                            String var444;
                            if (Statics.field3024 == null || Statics.field3024.field43 == null) {
                                var444 = "";
                            } else {
                                var444 = Statics.field3024.field43;
                            }
                            field711[var6++] = var444;
                            continue;
                        }
                        if (var459 == 5016) {
                            field706[var5++] = client.field466;
                            continue;
                        }
                        if (var459 == 5017) {
                            var5--;
                            int var445 = field706[var5];
                            field706[var5++] = class11.method2388(var445);
                            continue;
                        }
                        if (var459 == 5018) {
                            var5--;
                            int var446 = field706[var5];
                            field706[var5++] = class11.method790(var446);
                            continue;
                        }
                        if (var459 == 5019) {
                            var5--;
                            int var447 = field706[var5];
                            int[] var448 = field706;
                            int var449 = var5++;
                            class33 var450 = (class33) class11.field148.method3361((long) var447);
                            int var451;
                            if (var450 == null) {
                                var451 = -1;
                            } else if (class11.field150.field2948 == var450.field2953) {
                                var451 = -1;
                            } else {
                                var451 = ((class33) var450.field2953).field699;
                            }
                            var448[var449] = var451;
                            continue;
                        }
                        if (var459 == 5020) {
                            var6--;
                            String var452 = field711[var6];
                            client.method2092(var452);
                            continue;
                        }
                        if (var459 == 5021) {
                            var6--;
                            client.field462 = field711[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var459 == 5022) {
                            field711[var6++] = client.field462;
                            continue;
                        }
                    }
                }
                if (var459 >= 5600 || var459 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var453 = field706[var5];
                int var454 = field706[var5 + 1];
                if (!client.field490) {
                    client.field327 = var453;
                    client.field328 = var454;
                }
            }
        } catch (Exception var458) {
            StringBuilder var456 = new StringBuilder(30);
            var456.append("").append(var4.field2963).append(" ");
            for (int var457 = field710 - 1; var457 >= 0; var457--) {
                var456.append("").append(field713[var457].field181.field2963).append(" ");
            }
            var456.append("").append(var10);
            class140.method2555(var456.toString(), var458);
        }
    }

    @ObfuscatedName("ax.l(II)V")
    public static void method567(int arg0) {
        if (arg0 == -1 || !class164.method2116(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2711[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2683 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2683;
                method1474(var4, 2000000);
            }
        }
    }
}
