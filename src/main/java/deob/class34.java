package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class34 {

    @ObfuscatedName("at.i")
    public static int[] field723 = new int[5];

    @ObfuscatedName("at.o")
    public static int[][] field733 = new int[5][5000];

    @ObfuscatedName("at.f")
    public static int[] field725 = new int[1000];

    @ObfuscatedName("at.d")
    public static String[] field726 = new String[1000];

    @ObfuscatedName("at.j")
    public static int field727 = 0;

    @ObfuscatedName("at.x")
    public static class14[] field732 = new class14[50];

    @ObfuscatedName("at.l")
    public static Calendar field729 = Calendar.getInstance();

    @ObfuscatedName("at.h")
    public static final String[] field730 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("at.c")
    public static int field731 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.t(Lt;II)V")
    public static void method554(class1 arg0, int arg1) {
        Object[] var2 = arg0.field2;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method2615(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field543;
        int[] var9 = var4.field541;
        byte var10 = -1;
        field727 = 0;
        try {
            Statics.field119 = new int[var4.field539];
            int var11 = 0;
            Statics.field2798 = new String[var4.field544];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2633;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2642;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2633;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2642;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field11;
                    }
                    Statics.field119[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2798[var12++] = var15;
                }
            }
            int var16 = 0;
            field731 = arg0.field6;
            label2994: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var440 = var8[var7];
                if (var440 < 100) {
                    if (var440 == 0) {
                        field725[var5++] = var9[var7];
                        continue;
                    }
                    if (var440 == 1) {
                        int var17 = var9[var7];
                        field725[var5++] = class167.field2787[var17];
                        continue;
                    }
                    if (var440 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2787[var18] = field725[var5];
                        client.method3002(var18);
                        continue;
                    }
                    if (var440 == 3) {
                        field726[var6++] = var4.field542[var7];
                        continue;
                    }
                    if (var440 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var440 == 7) {
                        var5 -= 2;
                        if (field725[var5 + 1] != field725[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 8) {
                        var5 -= 2;
                        if (field725[var5 + 1] == field725[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 9) {
                        var5 -= 2;
                        if (field725[var5] < field725[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 10) {
                        var5 -= 2;
                        if (field725[var5] > field725[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 21) {
                        if (field727 == 0) {
                            return;
                        }
                        class14 var19 = field732[--field727];
                        var4 = var19.field191;
                        var8 = var4.field543;
                        var9 = var4.field541;
                        var7 = var19.field194;
                        Statics.field119 = var19.field192;
                        Statics.field2798 = var19.field193;
                        continue;
                    }
                    if (var440 == 25) {
                        int var20 = var9[var7];
                        field725[var5++] = class167.method2416(var20);
                        continue;
                    }
                    if (var440 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class167.method620(var21, field725[var5]);
                        continue;
                    }
                    if (var440 == 31) {
                        var5 -= 2;
                        if (field725[var5] <= field725[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 32) {
                        var5 -= 2;
                        if (field725[var5] >= field725[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 33) {
                        field725[var5++] = Statics.field119[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var440 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field119[var10001] = field725[var5];
                        continue;
                    }
                    if (var440 == 35) {
                        field726[var6++] = Statics.field2798[var9[var7]];
                        continue;
                    }
                    if (var440 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2798[var10001] = field726[var6];
                        continue;
                    }
                    if (var440 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class154.method2110(field726, var6, var22);
                        field726[var6++] = var23;
                        continue;
                    }
                    if (var440 == 38) {
                        var5--;
                        continue;
                    }
                    if (var440 == 39) {
                        var6--;
                        continue;
                    }
                    if (var440 == 40) {
                        int var24 = var9[var7];
                        class20 var25 = class20.method2615(var24);
                        int[] var26 = new int[var25.field539];
                        String[] var27 = new String[var25.field544];
                        for (int var28 = 0; var28 < var25.field549; var28++) {
                            var26[var28] = field725[var5 - var25.field549 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field546; var29++) {
                            var27[var29] = field726[var6 - var25.field546 + var29];
                        }
                        var5 -= var25.field549;
                        var6 -= var25.field546;
                        class14 var30 = new class14();
                        var30.field191 = var4;
                        var30.field194 = var7;
                        var30.field192 = Statics.field119;
                        var30.field193 = Statics.field2798;
                        field732[++field727 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field543;
                        var9 = var25.field541;
                        var7 = -1;
                        Statics.field119 = var26;
                        Statics.field2798 = var27;
                        continue;
                    }
                    if (var440 == 42) {
                        field725[var5++] = client.field448[var9[var7]];
                        continue;
                    }
                    if (var440 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field448[var10001] = field725[var5];
                        continue;
                    }
                    if (var440 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field725[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field723[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2994;
                                }
                                field733[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field725[var5];
                        if (var37 >= 0 && var37 < field723[var36]) {
                            field725[var5++] = field733[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field725[var5];
                        if (var39 >= 0 && var39 < field723[var38]) {
                            field733[var38][var39] = field725[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 47) {
                        String var40 = client.field449[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field726[var6++] = var40;
                        continue;
                    }
                    if (var440 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field449[var10001] = field726[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var440 < 1000) {
                    if (var440 == 100) {
                        var5 -= 3;
                        int var42 = field725[var5];
                        int var43 = field725[var5 + 1];
                        int var44 = field725[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var45 = class164.method733(var42);
                        if (var45.field2755 == null) {
                            var45.field2755 = new class164[var44 + 1];
                        }
                        if (var45.field2755.length <= var44) {
                            class164[] var46 = new class164[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2755.length; var47++) {
                                var46[var47] = var45.field2755[var47];
                            }
                            var45.field2755 = var46;
                        }
                        if (var44 > 0 && var45.field2755[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class164 var48 = new class164();
                        var48.field2635 = var43;
                        var48.field2624 = var48.field2633 = var45.field2633;
                        var48.field2642 = var44;
                        var48.field2710 = true;
                        var45.field2755[var44] = var48;
                        if (var41) {
                            Statics.field536 = var48;
                        } else {
                            Statics.field1468 = var48;
                        }
                        client.method1416(var45);
                        continue;
                    }
                    if (var440 == 101) {
                        class164 var49 = var41 ? Statics.field536 : Statics.field1468;
                        class164 var50 = class164.method733(var49.field2633);
                        var50.field2755[var49.field2642] = null;
                        client.method1416(var50);
                        continue;
                    }
                    if (var440 == 102) {
                        var5--;
                        class164 var51 = class164.method733(field725[var5]);
                        var51.field2755 = null;
                        client.method1416(var51);
                        continue;
                    }
                    if (var440 == 200) {
                        var5 -= 2;
                        int var52 = field725[var5];
                        int var53 = field725[var5 + 1];
                        class164 var54 = class164.method556(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field725[var5++] = 1;
                            if (var41) {
                                Statics.field536 = var54;
                            } else {
                                Statics.field1468 = var54;
                            }
                            continue;
                        }
                        field725[var5++] = 0;
                        continue;
                    }
                    if (var440 == 201) {
                        var5--;
                        class164 var55 = class164.method733(field725[var5]);
                        if (var55 == null) {
                            field725[var5++] = 0;
                        } else {
                            field725[var5++] = 1;
                            if (var41) {
                                Statics.field536 = var55;
                            } else {
                                Statics.field1468 = var55;
                            }
                        }
                        continue;
                    }
                } else if (var440 >= 1000 && var440 < 1100 || var440 >= 2000 && var440 < 2100) {
                    int var56 = -1;
                    class164 var57;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var56 = field725[var5];
                        var57 = class164.method733(var56);
                    } else {
                        var57 = var41 ? Statics.field536 : Statics.field1468;
                    }
                    if (var440 == 1000) {
                        var5 -= 4;
                        var57.field2721 = field725[var5];
                        var57.field2643 = field725[var5 + 1];
                        var57.field2696 = field725[var5 + 2];
                        var57.field2639 = field725[var5 + 3];
                        client.method1416(var57);
                        client.method151(var57);
                        if (var56 != -1 && var57.field2635 == 0) {
                            client.method2622(Statics.field2709[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var440 == 1001) {
                        var5 -= 4;
                        var57.field2644 = field725[var5];
                        var57.field2645 = field725[var5 + 1];
                        var57.field2640 = field725[var5 + 2];
                        var57.field2641 = field725[var5 + 3];
                        client.method1416(var57);
                        client.method151(var57);
                        if (var56 != -1 && var57.field2635 == 0) {
                            client.method2622(Statics.field2709[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var440 == 1003) {
                        var5--;
                        boolean var58 = field725[var5] == 1;
                        if (var57.field2653 != var58) {
                            var57.field2653 = var58;
                            client.method1416(var57);
                        }
                        continue;
                    }
                    if (var440 == 1005) {
                        var5--;
                        var57.field2718 = field725[var5] == 1;
                        continue;
                    }
                } else if (!(var440 < 1100 || var440 >= 1200) || !(var440 < 2100 || var440 >= 2200)) {
                    int var59 = -1;
                    class164 var60;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var59 = field725[var5];
                        var60 = class164.method733(var59);
                    } else {
                        var60 = var41 ? Statics.field536 : Statics.field1468;
                    }
                    if (var440 == 1100) {
                        var5 -= 2;
                        var60.field2628 = field725[var5];
                        if (var60.field2628 > var60.field2656 - var60.field2648) {
                            var60.field2628 = var60.field2656 - var60.field2648;
                        }
                        if (var60.field2628 < 0) {
                            var60.field2628 = 0;
                        }
                        var60.field2655 = field725[var5 + 1];
                        if (var60.field2655 > var60.field2657 - var60.field2754) {
                            var60.field2655 = var60.field2657 - var60.field2754;
                        }
                        if (var60.field2655 < 0) {
                            var60.field2655 = 0;
                        }
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1101) {
                        var5--;
                        var60.field2658 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1102) {
                        var5--;
                        var60.field2662 = field725[var5] == 1;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1103) {
                        var5--;
                        var60.field2686 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1104) {
                        var5--;
                        var60.field2731 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1105) {
                        var5--;
                        var60.field2666 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1106) {
                        var5--;
                        var60.field2764 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1107) {
                        var5--;
                        var60.field2669 = field725[var5] == 1;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1108) {
                        var60.field2638 = 1;
                        var5--;
                        var60.field2675 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1109) {
                        var5 -= 6;
                        var60.field2680 = field725[var5];
                        var60.field2681 = field725[var5 + 1];
                        var60.field2748 = field725[var5 + 2];
                        var60.field2683 = field725[var5 + 3];
                        var60.field2750 = field725[var5 + 4];
                        var60.field2685 = field725[var5 + 5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1110) {
                        var5--;
                        int var61 = field725[var5];
                        if (var60.field2622 != var61) {
                            var60.field2622 = var61;
                            var60.field2753 = 0;
                            var60.field2712 = 0;
                            client.method1416(var60);
                        }
                        continue;
                    }
                    if (var440 == 1111) {
                        var5--;
                        var60.field2688 = field725[var5] == 1;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1112) {
                        var6--;
                        String var62 = field726[var6];
                        if (!var62.equals(var60.field2691)) {
                            var60.field2691 = var62;
                            client.method1416(var60);
                        }
                        continue;
                    }
                    if (var440 == 1113) {
                        var5--;
                        var60.field2690 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1114) {
                        var5 -= 3;
                        var60.field2694 = field725[var5];
                        var60.field2695 = field725[var5 + 1];
                        var60.field2693 = field725[var5 + 2];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1115) {
                        var5--;
                        var60.field2735 = field725[var5] == 1;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1116) {
                        var5--;
                        var60.field2670 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1117) {
                        var5--;
                        var60.field2663 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1118) {
                        var5--;
                        var60.field2649 = field725[var5] == 1;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1119) {
                        var5--;
                        var60.field2673 = field725[var5] == 1;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1120) {
                        var5 -= 2;
                        var60.field2656 = field725[var5];
                        var60.field2657 = field725[var5 + 1];
                        client.method1416(var60);
                        if (var59 != -1 && var60.field2635 == 0) {
                            client.method2622(Statics.field2709[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var440 == 1121) {
                        client.method2879(var60.field2633, var60.field2642);
                        client.field414 = var60;
                        client.method1416(var60);
                        continue;
                    }
                    if (var440 == 1122) {
                        var5--;
                        var60.field2667 = field725[var5];
                        client.method1416(var60);
                        continue;
                    }
                } else if (!(var440 < 1200 || var440 >= 1300) || !(var440 < 2200 || var440 >= 2300)) {
                    class164 var63;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var63 = class164.method733(field725[var5]);
                    } else {
                        var63 = var41 ? Statics.field536 : Statics.field1468;
                    }
                    client.method1416(var63);
                    if (var440 == 1200 || var440 == 1205 || var440 == 1212) {
                        var5 -= 2;
                        int var64 = field725[var5];
                        int var65 = field725[var5 + 1];
                        var63.field2751 = var64;
                        var63.field2752 = var65;
                        class47 var66 = class47.method2(var64);
                        var63.field2748 = var66.field1020;
                        var63.field2683 = var66.field1050;
                        var63.field2750 = var66.field1039;
                        var63.field2680 = var66.field1040;
                        var63.field2681 = var66.field1024;
                        var63.field2685 = var66.field1038;
                        if (var440 == 1205) {
                            var63.field2702 = 0;
                        } else if (var440 == 1212 | var66.field1042 == 1) {
                            var63.field2702 = 1;
                        } else {
                            var63.field2702 = 2;
                        }
                        if (var63.field2725 > 0) {
                            var63.field2685 = var63.field2685 * 32 / var63.field2725;
                        } else if (var63.field2644 > 0) {
                            var63.field2685 = var63.field2685 * 32 / var63.field2644;
                        }
                        continue;
                    }
                    if (var440 == 1201) {
                        var63.field2638 = 2;
                        var5--;
                        var63.field2675 = field725[var5];
                        continue;
                    }
                    if (var440 == 1202) {
                        var63.field2638 = 3;
                        var63.field2675 = Statics.field1548.field28.method3094();
                        continue;
                    }
                } else if (var440 >= 1300 && var440 < 1400 || var440 >= 2300 && var440 < 2400) {
                    class164 var67;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var67 = class164.method733(field725[var5]);
                    } else {
                        var67 = var41 ? Statics.field536 : Statics.field1468;
                    }
                    if (var440 == 1300) {
                        var5--;
                        int var68 = field725[var5] - 1;
                        if (var68 >= 0 && var68 <= 9) {
                            var6--;
                            var67.method3004(var68, field726[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var440 == 1301) {
                        var5 -= 2;
                        int var69 = field725[var5];
                        int var70 = field725[var5 + 1];
                        var67.field2706 = class164.method556(var69, var70);
                        continue;
                    }
                    if (var440 == 1302) {
                        var5--;
                        var67.field2665 = field725[var5] == 1;
                        continue;
                    }
                    if (var440 == 1303) {
                        var5--;
                        var67.field2684 = field725[var5];
                        continue;
                    }
                    if (var440 == 1304) {
                        var5--;
                        var67.field2746 = field725[var5];
                        continue;
                    }
                    if (var440 == 1305) {
                        var6--;
                        var67.field2704 = field726[var6];
                        continue;
                    }
                    if (var440 == 1306) {
                        var6--;
                        var67.field2671 = field726[var6];
                        continue;
                    }
                    if (var440 == 1307) {
                        var67.field2705 = null;
                        continue;
                    }
                } else {
                    if (var440 >= 1400 && var440 < 1500 || var440 >= 2400 && var440 < 2500) {
                        class164 var71;
                        if (var440 >= 2000) {
                            var440 -= 1000;
                            var5--;
                            var71 = class164.method733(field725[var5]);
                        } else {
                            var71 = var41 ? Statics.field536 : Statics.field1468;
                        }
                        var6--;
                        String var72 = field726[var6];
                        int[] var73 = null;
                        if (var72.length() > 0 && var72.charAt(var72.length() - 1) == 'Y') {
                            var5--;
                            int var74 = field725[var5];
                            if (var74 > 0) {
                                var73 = new int[var74];
                                while (var74-- > 0) {
                                    var5--;
                                    var73[var74] = field725[var5];
                                }
                            }
                            var72 = var72.substring(0, var72.length() - 1);
                        }
                        Object[] var75 = new Object[var72.length() + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var72.charAt(var76 - 1) == 's') {
                                var6--;
                                var75[var76] = field726[var6];
                            } else {
                                var5--;
                                var75[var76] = Integer.valueOf(field725[var5]);
                            }
                        }
                        var5--;
                        int var77 = field725[var5];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        if (var440 == 1400) {
                            var71.field2739 = var75;
                        }
                        if (var440 == 1401) {
                            var71.field2760 = var75;
                        }
                        if (var440 == 1402) {
                            var71.field2715 = var75;
                        }
                        if (var440 == 1403) {
                            var71.field2674 = var75;
                        }
                        if (var440 == 1404) {
                            var71.field2719 = var75;
                        }
                        if (var440 == 1405) {
                            var71.field2720 = var75;
                        }
                        if (var440 == 1406) {
                            var71.field2723 = var75;
                        }
                        if (var440 == 1407) {
                            var71.field2724 = var75;
                            var71.field2634 = var73;
                        }
                        if (var440 == 1408) {
                            var71.field2730 = var75;
                        }
                        if (var440 == 1409) {
                            var71.field2707 = var75;
                        }
                        if (var440 == 1410) {
                            var71.field2727 = var75;
                        }
                        if (var440 == 1411) {
                            var71.field2714 = var75;
                        }
                        if (var440 == 1412) {
                            var71.field2749 = var75;
                        }
                        if (var440 == 1414) {
                            var71.field2726 = var75;
                            var71.field2743 = var73;
                        }
                        if (var440 == 1415) {
                            var71.field2728 = var75;
                            var71.field2729 = var73;
                        }
                        if (var440 == 1416) {
                            var71.field2677 = var75;
                        }
                        if (var440 == 1417) {
                            var71.field2732 = var75;
                        }
                        if (var440 == 1418) {
                            var71.field2652 = var75;
                        }
                        if (var440 == 1419) {
                            var71.field2734 = var75;
                        }
                        if (var440 == 1420) {
                            var71.field2678 = var75;
                        }
                        if (var440 == 1421) {
                            var71.field2736 = var75;
                        }
                        if (var440 == 1422) {
                            var71.field2654 = var75;
                        }
                        if (var440 == 1423) {
                            var71.field2738 = var75;
                        }
                        if (var440 == 1424) {
                            var71.field2716 = var75;
                        }
                        if (var440 == 1425) {
                            var71.field2741 = var75;
                        }
                        if (var440 == 1426) {
                            var71.field2742 = var75;
                        }
                        if (var440 == 1427) {
                            var71.field2740 = var75;
                        }
                        var71.field2711 = true;
                        continue;
                    }
                    if (var440 < 1600) {
                        class164 var78 = var41 ? Statics.field536 : Statics.field1468;
                        if (var440 == 1500) {
                            field725[var5++] = var78.field2646;
                            continue;
                        }
                        if (var440 == 1501) {
                            field725[var5++] = var78.field2647;
                            continue;
                        }
                        if (var440 == 1502) {
                            field725[var5++] = var78.field2648;
                            continue;
                        }
                        if (var440 == 1503) {
                            field725[var5++] = var78.field2754;
                            continue;
                        }
                        if (var440 == 1504) {
                            field725[var5++] = var78.field2653 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 1505) {
                            field725[var5++] = var78.field2624;
                            continue;
                        }
                    } else if (var440 < 1700) {
                        class164 var79 = var41 ? Statics.field536 : Statics.field1468;
                        if (var440 == 1600) {
                            field725[var5++] = var79.field2628;
                            continue;
                        }
                        if (var440 == 1601) {
                            field725[var5++] = var79.field2655;
                            continue;
                        }
                        if (var440 == 1602) {
                            field726[var6++] = var79.field2691;
                            continue;
                        }
                        if (var440 == 1603) {
                            field725[var5++] = var79.field2656;
                            continue;
                        }
                        if (var440 == 1604) {
                            field725[var5++] = var79.field2657;
                            continue;
                        }
                        if (var440 == 1605) {
                            field725[var5++] = var79.field2685;
                            continue;
                        }
                        if (var440 == 1606) {
                            field725[var5++] = var79.field2748;
                            continue;
                        }
                        if (var440 == 1607) {
                            field725[var5++] = var79.field2750;
                            continue;
                        }
                        if (var440 == 1608) {
                            field725[var5++] = var79.field2683;
                            continue;
                        }
                        if (var440 == 1609) {
                            field725[var5++] = var79.field2686;
                            continue;
                        }
                    } else if (var440 < 1800) {
                        class164 var80 = var41 ? Statics.field536 : Statics.field1468;
                        if (var440 == 1700) {
                            field725[var5++] = var80.field2751;
                            continue;
                        }
                        if (var440 == 1701) {
                            if (var80.field2751 == -1) {
                                field725[var5++] = 0;
                            } else {
                                field725[var5++] = var80.field2752;
                            }
                            continue;
                        }
                        if (var440 == 1702) {
                            field725[var5++] = var80.field2642;
                            continue;
                        }
                    } else if (var440 < 1900) {
                        class164 var81 = var41 ? Statics.field536 : Statics.field1468;
                        if (var440 == 1800) {
                            field725[var5++] = class169.method122(client.method761(var81));
                            continue;
                        }
                        if (var440 == 1801) {
                            var5--;
                            int var82 = field725[var5];
                            int var441 = var82 - 1;
                            if (var81.field2705 != null && var441 < var81.field2705.length && var81.field2705[var441] != null) {
                                field726[var6++] = var81.field2705[var441];
                                continue;
                            }
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 1802) {
                            if (var81.field2704 == null) {
                                field726[var6++] = "";
                            } else {
                                field726[var6++] = var81.field2704;
                            }
                            continue;
                        }
                    } else if (!(var440 < 1900 || var440 >= 2000) || !(var440 < 2900 || var440 >= 3000)) {
                        class164 var83;
                        if (var440 >= 2000) {
                            var440 -= 1000;
                            var5--;
                            var83 = class164.method733(field725[var5]);
                        } else {
                            var83 = var41 ? Statics.field536 : Statics.field1468;
                        }
                        if (var440 == 1927) {
                            if (field731 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var83.field2740 == null) {
                                return;
                            }
                            class1 var84 = new class1();
                            var84.field3 = var83;
                            var84.field2 = var83.field2740;
                            var84.field6 = field731 + 1;
                            client.field451.method3442(arg0);
                            continue;
                        }
                    } else if (var440 < 2600) {
                        var5--;
                        class164 var85 = class164.method733(field725[var5]);
                        if (var440 == 2500) {
                            field725[var5++] = var85.field2646;
                            continue;
                        }
                        if (var440 == 2501) {
                            field725[var5++] = var85.field2647;
                            continue;
                        }
                        if (var440 == 2502) {
                            field725[var5++] = var85.field2648;
                            continue;
                        }
                        if (var440 == 2503) {
                            field725[var5++] = var85.field2754;
                            continue;
                        }
                        if (var440 == 2504) {
                            field725[var5++] = var85.field2653 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 2505) {
                            field725[var5++] = var85.field2624;
                            continue;
                        }
                    } else if (var440 < 2700) {
                        var5--;
                        class164 var86 = class164.method733(field725[var5]);
                        if (var440 == 2600) {
                            field725[var5++] = var86.field2628;
                            continue;
                        }
                        if (var440 == 2601) {
                            field725[var5++] = var86.field2655;
                            continue;
                        }
                        if (var440 == 2602) {
                            field726[var6++] = var86.field2691;
                            continue;
                        }
                        if (var440 == 2603) {
                            field725[var5++] = var86.field2656;
                            continue;
                        }
                        if (var440 == 2604) {
                            field725[var5++] = var86.field2657;
                            continue;
                        }
                        if (var440 == 2605) {
                            field725[var5++] = var86.field2685;
                            continue;
                        }
                        if (var440 == 2606) {
                            field725[var5++] = var86.field2748;
                            continue;
                        }
                        if (var440 == 2607) {
                            field725[var5++] = var86.field2750;
                            continue;
                        }
                        if (var440 == 2608) {
                            field725[var5++] = var86.field2683;
                            continue;
                        }
                        if (var440 == 2609) {
                            field725[var5++] = var86.field2686;
                            continue;
                        }
                    } else if (var440 < 2800) {
                        if (var440 == 2700) {
                            var5--;
                            class164 var87 = class164.method733(field725[var5]);
                            field725[var5++] = var87.field2751;
                            continue;
                        }
                        if (var440 == 2701) {
                            var5--;
                            class164 var88 = class164.method733(field725[var5]);
                            if (var88.field2751 == -1) {
                                field725[var5++] = 0;
                            } else {
                                field725[var5++] = var88.field2752;
                            }
                            continue;
                        }
                        if (var440 == 2702) {
                            var5--;
                            int var89 = field725[var5];
                            class4 var90 = (class4) client.field411.method3382((long) var89);
                            if (var90 == null) {
                                field725[var5++] = 0;
                            } else {
                                field725[var5++] = 1;
                            }
                            continue;
                        }
                        if (var440 == 2706) {
                            field725[var5++] = client.field410;
                            continue;
                        }
                    } else if (var440 < 2900) {
                        var5--;
                        class164 var91 = class164.method733(field725[var5]);
                        if (var440 == 2800) {
                            field725[var5++] = class169.method122(client.method761(var91));
                            continue;
                        }
                        if (var440 == 2801) {
                            var5--;
                            int var92 = field725[var5];
                            int var442 = var92 - 1;
                            if (var91.field2705 != null && var442 < var91.field2705.length && var91.field2705[var442] != null) {
                                field726[var6++] = var91.field2705[var442];
                                continue;
                            }
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 2802) {
                            if (var91.field2704 == null) {
                                field726[var6++] = "";
                            } else {
                                field726[var6++] = var91.field2704;
                            }
                            continue;
                        }
                    } else if (var440 < 3200) {
                        if (var440 == 3100) {
                            var6--;
                            String var93 = field726[var6];
                            class11.method1835(0, "", var93);
                            continue;
                        }
                        if (var440 == 3101) {
                            var5 -= 2;
                            client.method3571(Statics.field1548, field725[var5], field725[var5 + 1]);
                            continue;
                        }
                        if (var440 == 3103) {
                            client.field288.method2444(110);
                            for (class4 var94 = (class4) client.field411.method3384(); var94 != null; var94 = (class4) client.field411.method3377()) {
                                if (var94.field51 == 0 || var94.field51 == 3) {
                                    client.method2596(var94, true);
                                }
                            }
                            if (client.field414 != null) {
                                client.method1416(client.field414);
                                client.field414 = null;
                            }
                            continue;
                        }
                        if (var440 == 3104) {
                            var6--;
                            String var95 = field726[var6];
                            int var96 = 0;
                            boolean var97 = class154.method551(var95, 10, true);
                            if (var97) {
                                var96 = class154.method975(var95);
                            }
                            client.field288.method2444(194);
                            client.field288.method2174(var96);
                            continue;
                        }
                        if (var440 == 3105) {
                            var6--;
                            String var98 = field726[var6];
                            client.field288.method2444(233);
                            client.field288.method2158(var98.length() + 1);
                            client.field288.method2163(var98);
                            continue;
                        }
                        if (var440 == 3106) {
                            var6--;
                            String var99 = field726[var6];
                            client.field288.method2444(200);
                            client.field288.method2158(var99.length() + 1);
                            client.field288.method2163(var99);
                            continue;
                        }
                        if (var440 == 3107) {
                            var5--;
                            int var100 = field725[var5];
                            var6--;
                            String var101 = field726[var6];
                            boolean var102 = false;
                            for (int var103 = 0; var103 < client.field519; var103++) {
                                class3 var104 = client.field258[client.field370[var103]];
                                if (var104 != null && var104.field42 != null && var104.field42.equalsIgnoreCase(var101)) {
                                    if (var100 == 1) {
                                        client.field288.method2444(220);
                                        client.field288.method2158(0);
                                        client.field288.method2238(client.field370[var103]);
                                    } else if (var100 == 4) {
                                        client.field288.method2444(139);
                                        client.field288.method2205(client.field370[var103]);
                                        client.field288.method2158(0);
                                    } else if (var100 == 6) {
                                        client.field288.method2444(28);
                                        client.field288.method2159(client.field370[var103]);
                                        client.field288.method2319(0);
                                    } else if (var100 == 7) {
                                        client.field288.method2444(188);
                                        client.field288.method2205(client.field370[var103]);
                                        client.field288.method2158(0);
                                    }
                                    var102 = true;
                                    break;
                                }
                            }
                            if (!var102) {
                                class11.method1835(4, "", class148.field2206 + var101);
                            }
                            continue;
                        }
                        if (var440 == 3108) {
                            var5 -= 3;
                            int var105 = field725[var5];
                            int var106 = field725[var5 + 1];
                            int var107 = field725[var5 + 2];
                            class164 var108 = class164.method733(var107);
                            client.method100(var108, var105, var106);
                            continue;
                        }
                        if (var440 == 3109) {
                            var5 -= 2;
                            int var109 = field725[var5];
                            int var110 = field725[var5 + 1];
                            class164 var111 = var41 ? Statics.field536 : Statics.field1468;
                            client.method100(var111, var109, var110);
                            continue;
                        }
                        if (var440 == 3110) {
                            var5--;
                            Statics.field87 = field725[var5] == 1;
                            continue;
                        }
                        if (var440 == 3111) {
                            field725[var5++] = Statics.field2092.field124 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3112) {
                            var5--;
                            Statics.field2092.field124 = field725[var5] == 1;
                            class9.method2116();
                            continue;
                        }
                        if (var440 == 3113) {
                            var6--;
                            String var112 = field726[var6];
                            var5--;
                            boolean var113 = field725[var5] == 1;
                            class130.method3544(var112, var113, false);
                            continue;
                        }
                        if (var440 == 3115) {
                            var5--;
                            int var114 = field725[var5];
                            client.field288.method2444(39);
                            client.field288.method2159(var114);
                            continue;
                        }
                        if (var440 == 3116) {
                            var5--;
                            int var115 = field725[var5];
                            var6 -= 2;
                            String var116 = field726[var6];
                            String var117 = field726[var6 + 1];
                            if (var116.length() <= 500 && var117.length() <= 500) {
                                client.field288.method2444(131);
                                client.field288.method2159(1 + class111.method1926(var116) + class111.method1926(var117));
                                client.field288.method2163(var117);
                                client.field288.method2163(var116);
                                client.field288.method2333(var115);
                            }
                            continue;
                        }
                    } else if (var440 < 3300) {
                        if (var440 == 3200) {
                            var5 -= 3;
                            client.method2796(field725[var5], field725[var5 + 1], field725[var5 + 2]);
                            continue;
                        }
                        if (var440 == 3201) {
                            var5--;
                            client.method98(field725[var5]);
                            continue;
                        }
                        if (var440 == 3202) {
                            var5 -= 2;
                            int var118 = field725[var5];
                            int var10000 = field725[var5 + 1];
                            if (client.field489 != 0 && var118 != -1) {
                                class174.method2991(Statics.field303, var118, 0, client.field489, false);
                                client.field345 = true;
                            }
                            continue;
                        }
                    } else if (var440 < 3400) {
                        if (var440 == 3300) {
                            field725[var5++] = client.field256;
                            continue;
                        }
                        if (var440 == 3301) {
                            var5 -= 2;
                            int var120 = field725[var5];
                            int var121 = field725[var5 + 1];
                            field725[var5++] = class15.method2493(var120, var121);
                            continue;
                        }
                        if (var440 == 3302) {
                            var5 -= 2;
                            int var122 = field725[var5];
                            int var123 = field725[var5 + 1];
                            int[] var124 = field725;
                            int var125 = var5++;
                            class15 var126 = (class15) class15.field197.method3382((long) var122);
                            int var127;
                            if (var126 == null) {
                                var127 = 0;
                            } else if (var123 >= 0 && var123 < var126.field203.length) {
                                var127 = var126.field203[var123];
                            } else {
                                var127 = 0;
                            }
                            var124[var125] = var127;
                            continue;
                        }
                        if (var440 == 3303) {
                            var5 -= 2;
                            int var128 = field725[var5];
                            int var129 = field725[var5 + 1];
                            int[] var130 = field725;
                            int var131 = var5++;
                            class15 var132 = (class15) class15.field197.method3382((long) var128);
                            int var133;
                            if (var132 == null) {
                                var133 = 0;
                            } else if (var129 == -1) {
                                var133 = 0;
                            } else {
                                int var134 = 0;
                                for (int var135 = 0; var135 < var132.field203.length; var135++) {
                                    if (var132.field202[var135] == var129) {
                                        var134 += var132.field203[var135];
                                    }
                                }
                                var133 = var134;
                            }
                            var130[var131] = var133;
                            continue;
                        }
                        if (var440 == 3304) {
                            var5--;
                            int var136 = field725[var5];
                            field725[var5++] = class46.method2005(var136).field1012;
                            continue;
                        }
                        if (var440 == 3305) {
                            var5--;
                            int var137 = field725[var5];
                            field725[var5++] = client.field387[var137];
                            continue;
                        }
                        if (var440 == 3306) {
                            var5--;
                            int var138 = field725[var5];
                            field725[var5++] = client.field307[var138];
                            continue;
                        }
                        if (var440 == 3307) {
                            var5--;
                            int var139 = field725[var5];
                            field725[var5++] = client.field389[var139];
                            continue;
                        }
                        if (var440 == 3308) {
                            int var140 = Statics.field1019;
                            int var141 = (Statics.field1548.field765 >> 7) + Statics.field550;
                            int var142 = (Statics.field1548.field741 >> 7) + Statics.field925;
                            field725[var5++] = (var140 << 28) + (var141 << 14) + var142;
                            continue;
                        }
                        if (var440 == 3309) {
                            var5--;
                            int var143 = field725[var5];
                            field725[var5++] = var143 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var440 == 3310) {
                            var5--;
                            int var144 = field725[var5];
                            field725[var5++] = var144 >> 28;
                            continue;
                        }
                        if (var440 == 3311) {
                            var5--;
                            int var145 = field725[var5];
                            field725[var5++] = var145 & 0x3FFF;
                            continue;
                        }
                        if (var440 == 3312) {
                            field725[var5++] = client.field250 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3313) {
                            var5 -= 2;
                            int var146 = field725[var5] + 32768;
                            int var147 = field725[var5 + 1];
                            field725[var5++] = class15.method2493(var146, var147);
                            continue;
                        }
                        if (var440 == 3314) {
                            var5 -= 2;
                            int var148 = field725[var5] + 32768;
                            int var149 = field725[var5 + 1];
                            int[] var150 = field725;
                            int var151 = var5++;
                            class15 var152 = (class15) class15.field197.method3382((long) var148);
                            int var153;
                            if (var152 == null) {
                                var153 = 0;
                            } else if (var149 >= 0 && var149 < var152.field203.length) {
                                var153 = var152.field203[var149];
                            } else {
                                var153 = 0;
                            }
                            var150[var151] = var153;
                            continue;
                        }
                        if (var440 == 3315) {
                            var5 -= 2;
                            int var154 = field725[var5] + 32768;
                            int var155 = field725[var5 + 1];
                            int[] var156 = field725;
                            int var157 = var5++;
                            class15 var158 = (class15) class15.field197.method3382((long) var154);
                            int var159;
                            if (var158 == null) {
                                var159 = 0;
                            } else if (var155 == -1) {
                                var159 = 0;
                            } else {
                                int var160 = 0;
                                for (int var161 = 0; var161 < var158.field203.length; var161++) {
                                    if (var158.field202[var161] == var155) {
                                        var160 += var158.field203[var161];
                                    }
                                }
                                var159 = var160;
                            }
                            var156[var157] = var159;
                            continue;
                        }
                        if (var440 == 3316) {
                            if (client.field417 >= 2) {
                                field725[var5++] = client.field417;
                            } else {
                                field725[var5++] = 0;
                            }
                            continue;
                        }
                        if (var440 == 3317) {
                            field725[var5++] = client.field263;
                            continue;
                        }
                        if (var440 == 3318) {
                            field725[var5++] = client.field247;
                            continue;
                        }
                        if (var440 == 3321) {
                            field725[var5++] = client.field415;
                            continue;
                        }
                        if (var440 == 3322) {
                            field725[var5++] = client.field343;
                            continue;
                        }
                        if (var440 == 3323) {
                            if (client.field347) {
                                field725[var5++] = 1;
                            } else {
                                field725[var5++] = 0;
                            }
                            continue;
                        }
                        if (var440 == 3324) {
                            field725[var5++] = client.field364;
                            continue;
                        }
                    } else if (var440 < 3500) {
                        if (var440 == 3400) {
                            var5 -= 2;
                            int var162 = field725[var5];
                            int var163 = field725[var5 + 1];
                            class45 var164 = class45.method664(var162);
                            if (var164.field1005 != 's') {
                            }
                            for (int var165 = 0; var165 < var164.field1002; var165++) {
                                if (var164.field1003[var165] == var163) {
                                    field726[var6++] = var164.field1009[var165];
                                    var164 = null;
                                    break;
                                }
                            }
                            if (var164 != null) {
                                field726[var6++] = var164.field997;
                            }
                            continue;
                        }
                        if (var440 == 3408) {
                            var5 -= 4;
                            int var166 = field725[var5];
                            int var167 = field725[var5 + 1];
                            int var168 = field725[var5 + 2];
                            int var169 = field725[var5 + 3];
                            class45 var170 = class45.method664(var168);
                            if (var170.field1001 == var166 && var170.field1005 == var167) {
                                for (int var171 = 0; var171 < var170.field1002; var171++) {
                                    if (var170.field1003[var171] == var169) {
                                        if (var167 == 115) {
                                            field726[var6++] = var170.field1009[var171];
                                        } else {
                                            field725[var5++] = var170.field1004[var171];
                                        }
                                        var170 = null;
                                        break;
                                    }
                                }
                                if (var170 != null) {
                                    if (var167 == 115) {
                                        field726[var6++] = var170.field997;
                                    } else {
                                        field725[var5++] = var170.field996;
                                    }
                                }
                                continue;
                            }
                            if (var167 == 115) {
                                field726[var6++] = "null";
                            } else {
                                field725[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var440 < 3700) {
                        if (var440 == 3600) {
                            if (client.field424 == 0) {
                                field725[var5++] = -2;
                            } else if (client.field424 == 1) {
                                field725[var5++] = -1;
                            } else {
                                field725[var5++] = client.field255;
                            }
                            continue;
                        }
                        if (var440 == 3601) {
                            var5--;
                            int var172 = field725[var5];
                            if (client.field424 == 2 && var172 < client.field255) {
                                field726[var6++] = client.field355[var172].field227;
                                field726[var6++] = client.field355[var172].field220;
                                continue;
                            }
                            field726[var6++] = "";
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 3602) {
                            var5--;
                            int var173 = field725[var5];
                            if (client.field424 == 2 && var173 < client.field255) {
                                field725[var5++] = client.field355[var173].field219;
                                continue;
                            }
                            field725[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3603) {
                            var5--;
                            int var174 = field725[var5];
                            if (client.field424 == 2 && var174 < client.field255) {
                                field725[var5++] = client.field355[var174].field221;
                                continue;
                            }
                            field725[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3604) {
                            var6--;
                            String var175 = field726[var6];
                            var5--;
                            int var176 = field725[var5];
                            client.method3093(var175, var176);
                            continue;
                        }
                        if (var440 == 3605) {
                            var6--;
                            String var177 = field726[var6];
                            client.method3209(var177);
                            continue;
                        }
                        if (var440 == 3606) {
                            var6--;
                            String var178 = field726[var6];
                            client.method2877(var178);
                            continue;
                        }
                        if (var440 == 3607) {
                            var6--;
                            String var179 = field726[var6];
                            client.method17(var179, false);
                            continue;
                        }
                        if (var440 == 3608) {
                            var6--;
                            String var180 = field726[var6];
                            if (var180 == null) {
                                continue;
                            }
                            String var181 = class155.method2793(var180, Statics.field1831);
                            if (var181 == null) {
                                continue;
                            }
                            int var182 = 0;
                            while (true) {
                                if (var182 >= client.field524) {
                                    continue label2994;
                                }
                                class8 var183 = client.field525[var182];
                                String var184 = var183.field122;
                                String var185 = class155.method2793(var184, Statics.field1831);
                                if (class121.method35(var180, var181, var184, var185)) {
                                    client.field524--;
                                    for (int var186 = var182; var186 < client.field524; var186++) {
                                        client.field525[var186] = client.field525[var186 + 1];
                                    }
                                    client.field443 = client.field435;
                                    client.field288.method2444(77);
                                    client.field288.method2158(class111.method1926(var180));
                                    client.field288.method2163(var180);
                                    continue label2994;
                                }
                                var182++;
                            }
                        }
                        if (var440 == 3609) {
                            var6--;
                            String var187 = field726[var6];
                            class143[] var188 = new class143[] { class143.field2138, class143.field2140, class143.field2144, class143.field2139, class143.field2137 };
                            class143[] var189 = var188;
                            for (int var190 = 0; var190 < var189.length; var190++) {
                                class143 var191 = var189[var190];
                                if (var191.field2141 != -1) {
                                    int var193 = var191.field2141;
                                    String var194 = "<img=" + var193 + ">";
                                    if (var187.startsWith(var194)) {
                                        var187 = var187.substring(6 + Integer.toString(var191.field2141).length());
                                        break;
                                    }
                                }
                            }
                            field725[var5++] = client.method1922(var187, false) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3611) {
                            if (client.field479 == null) {
                                field726[var6++] = "";
                            } else {
                                field726[var6++] = class153.method642(client.field479);
                            }
                            continue;
                        }
                        if (var440 == 3612) {
                            if (client.field479 == null) {
                                field725[var5++] = 0;
                            } else {
                                field725[var5++] = Statics.field3045;
                            }
                            continue;
                        }
                        if (var440 == 3613) {
                            var5--;
                            int var195 = field725[var5];
                            if (client.field479 != null && var195 < Statics.field3045) {
                                field726[var6++] = Statics.field1542[var195].field576;
                                continue;
                            }
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 3614) {
                            var5--;
                            int var196 = field725[var5];
                            if (client.field479 != null && var196 < Statics.field3045) {
                                field725[var5++] = Statics.field1542[var196].field577;
                                continue;
                            }
                            field725[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3615) {
                            var5--;
                            int var197 = field725[var5];
                            if (client.field479 != null && var197 < Statics.field3045) {
                                field725[var5++] = Statics.field1542[var197].field578;
                                continue;
                            }
                            field725[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3616) {
                            field725[var5++] = Statics.field2542;
                            continue;
                        }
                        if (var440 == 3617) {
                            var6--;
                            String var198 = field726[var6];
                            client.method3707(var198);
                            continue;
                        }
                        if (var440 == 3618) {
                            field725[var5++] = Statics.field903;
                            continue;
                        }
                        if (var440 == 3619) {
                            var6--;
                            String var199 = field726[var6];
                            if (!var199.equals("")) {
                                client.field288.method2444(94);
                                client.field288.method2158(class111.method1926(var199));
                                client.field288.method2163(var199);
                            }
                            continue;
                        }
                        if (var440 == 3620) {
                            client.field288.method2444(94);
                            client.field288.method2158(0);
                            continue;
                        }
                        if (var440 == 3621) {
                            if (client.field424 == 0) {
                                field725[var5++] = -1;
                            } else {
                                field725[var5++] = client.field524;
                            }
                            continue;
                        }
                        if (var440 == 3622) {
                            var5--;
                            int var200 = field725[var5];
                            if (client.field424 != 0 && var200 < client.field524) {
                                field726[var6++] = client.field525[var200].field122;
                                field726[var6++] = client.field525[var200].field116;
                                continue;
                            }
                            field726[var6++] = "";
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 3623) {
                            String var201;
                            label2718: {
                                var6--;
                                var201 = field726[var6];
                                String var203 = "<img=0>";
                                if (!var201.startsWith(var203)) {
                                    String var205 = "<img=1>";
                                    if (!var201.startsWith(var205)) {
                                        break label2718;
                                    }
                                }
                                var201 = var201.substring(7);
                            }
                            field725[var5++] = client.method156(var201) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3624) {
                            var5--;
                            int var206 = field725[var5];
                            if (Statics.field1542 != null && var206 < Statics.field3045 && Statics.field1542[var206].field576.equalsIgnoreCase(Statics.field1548.field42)) {
                                field725[var5++] = 1;
                                continue;
                            }
                            field725[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3625) {
                            if (client.field337 == null) {
                                field726[var6++] = "";
                            } else {
                                field726[var6++] = class153.method642(client.field337);
                            }
                            continue;
                        }
                    } else if (var440 < 4000) {
                        if (var440 == 3903) {
                            var5--;
                            int var207 = field725[var5];
                            field725[var5++] = client.field380[var207].method3591();
                            continue;
                        }
                        if (var440 == 3904) {
                            var5--;
                            int var208 = field725[var5];
                            field725[var5++] = client.field380[var208].field3067;
                            continue;
                        }
                        if (var440 == 3905) {
                            var5--;
                            int var209 = field725[var5];
                            field725[var5++] = client.field380[var209].field3068;
                            continue;
                        }
                        if (var440 == 3906) {
                            var5--;
                            int var210 = field725[var5];
                            field725[var5++] = client.field380[var210].field3071;
                            continue;
                        }
                        if (var440 == 3907) {
                            var5--;
                            int var211 = field725[var5];
                            field725[var5++] = client.field380[var211].field3069;
                            continue;
                        }
                        if (var440 == 3908) {
                            var5--;
                            int var212 = field725[var5];
                            field725[var5++] = client.field380[var212].field3066;
                            continue;
                        }
                        if (var440 == 3910) {
                            var5--;
                            int var213 = field725[var5];
                            int var214 = client.field380[var213].method3582();
                            field725[var5++] = var214 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3911) {
                            var5--;
                            int var215 = field725[var5];
                            int var216 = client.field380[var215].method3582();
                            field725[var5++] = var216 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3912) {
                            var5--;
                            int var217 = field725[var5];
                            int var218 = client.field380[var217].method3582();
                            field725[var5++] = var218 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3913) {
                            var5--;
                            int var219 = field725[var5];
                            int var220 = client.field380[var219].method3582();
                            field725[var5++] = var220 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3914) {
                            var5--;
                            boolean var221 = field725[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3593(class212.field3076, var221);
                            }
                            continue;
                        }
                        if (var440 == 3915) {
                            var5--;
                            boolean var222 = field725[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3593(class212.field3073, var222);
                            }
                            continue;
                        }
                        if (var440 == 3916) {
                            var5 -= 2;
                            boolean var223 = field725[var5] == 1;
                            boolean var224 = field725[var5 + 1] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3593(new class21(var224), var223);
                            }
                            continue;
                        }
                        if (var440 == 3917) {
                            var5--;
                            boolean var225 = field725[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3593(class212.field3075, var225);
                            }
                            continue;
                        }
                        if (var440 == 3918) {
                            var5--;
                            boolean var226 = field725[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3593(class212.field3077, var226);
                            }
                            continue;
                        }
                        if (var440 == 3919) {
                            field725[var5++] = Statics.field229 == null ? 0 : Statics.field229.field3074.size();
                            continue;
                        }
                        if (var440 == 3920) {
                            var5--;
                            int var227 = field725[var5];
                            class205 var228 = (class205) Statics.field229.field3074.get(var227);
                            field725[var5++] = var228.field3052;
                            continue;
                        }
                        if (var440 == 3921) {
                            var5--;
                            int var229 = field725[var5];
                            class205 var230 = (class205) Statics.field229.field3074.get(var229);
                            field726[var6++] = var230.method3546();
                            continue;
                        }
                        if (var440 == 3922) {
                            var5--;
                            int var231 = field725[var5];
                            class205 var232 = (class205) Statics.field229.field3074.get(var231);
                            field726[var6++] = var232.method3547();
                            continue;
                        }
                        if (var440 == 3923) {
                            var5--;
                            int var233 = field725[var5];
                            class205 var234 = (class205) Statics.field229.field3074.get(var233);
                            long var235 = class107.method591() - Statics.field3031 - var234.field3049;
                            int var237 = (int) (var235 / 3600000L);
                            int var238 = (int) ((var235 - (long) (var237 * 3600000)) / 60000L);
                            int var239 = (int) ((var235 - (long) (var237 * 3600000) - (long) (var238 * 60000)) / 1000L);
                            String var240 = var237 + ":" + var238 / 10 + var238 % 10 + ":" + var239 / 10 + var239 % 10;
                            field726[var6++] = var240;
                            continue;
                        }
                        if (var440 == 3924) {
                            var5--;
                            int var241 = field725[var5];
                            class205 var242 = (class205) Statics.field229.field3074.get(var241);
                            field725[var5++] = var242.field3051.field3071;
                            continue;
                        }
                        if (var440 == 3925) {
                            var5--;
                            int var243 = field725[var5];
                            class205 var244 = (class205) Statics.field229.field3074.get(var243);
                            field725[var5++] = var244.field3051.field3068;
                            continue;
                        }
                        if (var440 == 3926) {
                            var5--;
                            int var245 = field725[var5];
                            class205 var246 = (class205) Statics.field229.field3074.get(var245);
                            field725[var5++] = var246.field3051.field3067;
                            continue;
                        }
                    } else if (var440 < 4100) {
                        if (var440 == 4000) {
                            var5 -= 2;
                            int var247 = field725[var5];
                            int var248 = field725[var5 + 1];
                            field725[var5++] = var247 + var248;
                            continue;
                        }
                        if (var440 == 4001) {
                            var5 -= 2;
                            int var249 = field725[var5];
                            int var250 = field725[var5 + 1];
                            field725[var5++] = var249 - var250;
                            continue;
                        }
                        if (var440 == 4002) {
                            var5 -= 2;
                            int var251 = field725[var5];
                            int var252 = field725[var5 + 1];
                            field725[var5++] = var251 * var252;
                            continue;
                        }
                        if (var440 == 4003) {
                            var5 -= 2;
                            int var253 = field725[var5];
                            int var254 = field725[var5 + 1];
                            field725[var5++] = var253 / var254;
                            continue;
                        }
                        if (var440 == 4004) {
                            var5--;
                            int var255 = field725[var5];
                            field725[var5++] = (int) (Math.random() * (double) var255);
                            continue;
                        }
                        if (var440 == 4005) {
                            var5--;
                            int var256 = field725[var5];
                            field725[var5++] = (int) (Math.random() * (double) (var256 + 1));
                            continue;
                        }
                        if (var440 == 4006) {
                            var5 -= 5;
                            int var257 = field725[var5];
                            int var258 = field725[var5 + 1];
                            int var259 = field725[var5 + 2];
                            int var260 = field725[var5 + 3];
                            int var261 = field725[var5 + 4];
                            field725[var5++] = (var258 - var257) * (var261 - var259) / (var260 - var259) + var257;
                            continue;
                        }
                        if (var440 == 4007) {
                            var5 -= 2;
                            int var262 = field725[var5];
                            int var263 = field725[var5 + 1];
                            field725[var5++] = var262 * var263 / 100 + var262;
                            continue;
                        }
                        if (var440 == 4008) {
                            var5 -= 2;
                            int var264 = field725[var5];
                            int var265 = field725[var5 + 1];
                            field725[var5++] = var264 | 0x1 << var265;
                            continue;
                        }
                        if (var440 == 4009) {
                            var5 -= 2;
                            int var266 = field725[var5];
                            int var267 = field725[var5 + 1];
                            field725[var5++] = var266 & -1 - (0x1 << var267);
                            continue;
                        }
                        if (var440 == 4010) {
                            var5 -= 2;
                            int var268 = field725[var5];
                            int var269 = field725[var5 + 1];
                            field725[var5++] = (var268 & 0x1 << var269) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var440 == 4011) {
                            var5 -= 2;
                            int var270 = field725[var5];
                            int var271 = field725[var5 + 1];
                            field725[var5++] = var270 % var271;
                            continue;
                        }
                        if (var440 == 4012) {
                            var5 -= 2;
                            int var272 = field725[var5];
                            int var273 = field725[var5 + 1];
                            if (var272 == 0) {
                                field725[var5++] = 0;
                            } else {
                                field725[var5++] = (int) Math.pow((double) var272, (double) var273);
                            }
                            continue;
                        }
                        if (var440 == 4013) {
                            var5 -= 2;
                            int var274 = field725[var5];
                            int var275 = field725[var5 + 1];
                            if (var274 == 0) {
                                field725[var5++] = 0;
                            } else if (var275 == 0) {
                                field725[var5++] = Integer.MAX_VALUE;
                            } else {
                                field725[var5++] = (int) Math.pow((double) var274, 1.0D / (double) var275);
                            }
                            continue;
                        }
                        if (var440 == 4014) {
                            var5 -= 2;
                            int var276 = field725[var5];
                            int var277 = field725[var5 + 1];
                            field725[var5++] = var276 & var277;
                            continue;
                        }
                        if (var440 == 4015) {
                            var5 -= 2;
                            int var278 = field725[var5];
                            int var279 = field725[var5 + 1];
                            field725[var5++] = var278 | var279;
                            continue;
                        }
                    } else if (var440 < 4200) {
                        if (var440 == 4100) {
                            var6--;
                            String var280 = field726[var6];
                            var5--;
                            int var281 = field725[var5];
                            field726[var6++] = var280 + var281;
                            continue;
                        }
                        if (var440 == 4101) {
                            var6 -= 2;
                            String var282 = field726[var6];
                            String var283 = field726[var6 + 1];
                            field726[var6++] = var282 + var283;
                            continue;
                        }
                        if (var440 == 4102) {
                            var6--;
                            String var284 = field726[var6];
                            var5--;
                            int var285 = field725[var5];
                            String[] var286 = field726;
                            int var287 = var6++;
                            String var289;
                            if (var285 < 0) {
                                var289 = Integer.toString(var285);
                            } else {
                                int var290 = var285;
                                String var291;
                                if (var285 < 0) {
                                    var291 = Integer.toString(var285, 10);
                                } else {
                                    int var292 = 2;
                                    int var293 = var285 / 10;
                                    while (var293 != 0) {
                                        var293 /= 10;
                                        var292++;
                                    }
                                    char[] var294 = new char[var292];
                                    var294[0] = '+';
                                    for (int var295 = var292 - 1; var295 > 0; var295--) {
                                        int var296 = var290;
                                        var290 /= 10;
                                        int var297 = var296 - var290 * 10;
                                        if (var297 >= 10) {
                                            var294[var295] = (char) (var297 + 87);
                                        } else {
                                            var294[var295] = (char) (var297 + 48);
                                        }
                                    }
                                    var291 = new String(var294);
                                }
                                var289 = var291;
                            }
                            var286[var287] = var284 + var289;
                            continue;
                        }
                        if (var440 == 4103) {
                            var6--;
                            String var298 = field726[var6];
                            field726[var6++] = var298.toLowerCase();
                            continue;
                        }
                        if (var440 == 4104) {
                            var5--;
                            int var299 = field725[var5];
                            long var300 = ((long) var299 + 11745L) * 86400000L;
                            field729.setTime(new Date(var300));
                            int var302 = field729.get(5);
                            int var303 = field729.get(2);
                            int var304 = field729.get(1);
                            field726[var6++] = var302 + "-" + field730[var303] + "-" + var304;
                            continue;
                        }
                        if (var440 == 4105) {
                            var6 -= 2;
                            String var305 = field726[var6];
                            String var306 = field726[var6 + 1];
                            if (Statics.field1548.field28 != null && Statics.field1548.field28.field2814) {
                                field726[var6++] = var306;
                                continue;
                            }
                            field726[var6++] = var305;
                            continue;
                        }
                        if (var440 == 4106) {
                            var5--;
                            int var307 = field725[var5];
                            field726[var6++] = Integer.toString(var307);
                            continue;
                        }
                        if (var440 == 4107) {
                            var6 -= 2;
                            int[] var308 = field725;
                            int var309 = var5++;
                            int var310 = class157.method2466(field726[var6], field726[var6 + 1], client.field252);
                            byte var311;
                            if (var310 > 0) {
                                var311 = 1;
                            } else if (var310 < 0) {
                                var311 = -1;
                            } else {
                                var311 = 0;
                            }
                            var308[var309] = var311;
                            continue;
                        }
                        if (var440 == 4108) {
                            var6--;
                            String var312 = field726[var6];
                            var5 -= 2;
                            int var313 = field725[var5];
                            int var314 = field725[var5 + 1];
                            byte[] var315 = Statics.field1872.method2881(var314, 0);
                            class215 var316 = new class215(var315);
                            field725[var5++] = var316.method3613(var312, var313);
                            continue;
                        }
                        if (var440 == 4109) {
                            var6--;
                            String var317 = field726[var6];
                            var5 -= 2;
                            int var318 = field725[var5];
                            int var319 = field725[var5 + 1];
                            byte[] var320 = Statics.field1872.method2881(var319, 0);
                            class215 var321 = new class215(var320);
                            field725[var5++] = var321.method3609(var317, var318);
                            continue;
                        }
                        if (var440 == 4110) {
                            var6 -= 2;
                            String var322 = field726[var6];
                            String var323 = field726[var6 + 1];
                            var5--;
                            if (field725[var5] == 1) {
                                field726[var6++] = var322;
                            } else {
                                field726[var6++] = var323;
                            }
                            continue;
                        }
                        if (var440 == 4111) {
                            var6--;
                            String var324 = field726[var6];
                            field726[var6++] = class214.method3611(var324);
                            continue;
                        }
                        if (var440 == 4112) {
                            var6--;
                            String var325 = field726[var6];
                            var5--;
                            int var326 = field725[var5];
                            field726[var6++] = var325 + (char) var326;
                            continue;
                        }
                        if (var440 == 4113) {
                            var5--;
                            int var327 = field725[var5];
                            field725[var5++] = class154.method2656((char) var327) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4114) {
                            var5--;
                            int var328 = field725[var5];
                            int[] var329 = field725;
                            int var330 = var5++;
                            char var331 = (char) var328;
                            boolean var332 = var331 >= '0' && var331 <= '9' || var331 >= 'A' && var331 <= 'Z' || var331 >= 'a' && var331 <= 'z';
                            var329[var330] = var332 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4115) {
                            var5--;
                            int var333 = field725[var5];
                            int[] var334 = field725;
                            int var335 = var5++;
                            char var336 = (char) var333;
                            boolean var337 = var336 >= 'A' && var336 <= 'Z' || var336 >= 'a' && var336 <= 'z';
                            var334[var335] = var337 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4116) {
                            var5--;
                            int var338 = field725[var5];
                            field725[var5++] = class154.method32((char) var338) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4117) {
                            var6--;
                            String var339 = field726[var6];
                            if (var339 == null) {
                                field725[var5++] = 0;
                            } else {
                                field725[var5++] = var339.length();
                            }
                            continue;
                        }
                        if (var440 == 4118) {
                            var6--;
                            String var340 = field726[var6];
                            var5 -= 2;
                            int var341 = field725[var5];
                            int var342 = field725[var5 + 1];
                            field726[var6++] = var340.substring(var341, var342);
                            continue;
                        }
                        if (var440 == 4119) {
                            var6--;
                            String var343 = field726[var6];
                            StringBuilder var344 = new StringBuilder(var343.length());
                            boolean var345 = false;
                            for (int var346 = 0; var346 < var343.length(); var346++) {
                                char var347 = var343.charAt(var346);
                                if (var347 == '<') {
                                    var345 = true;
                                } else if (var347 == '>') {
                                    var345 = false;
                                } else if (!var345) {
                                    var344.append(var347);
                                }
                            }
                            field726[var6++] = var344.toString();
                            continue;
                        }
                        if (var440 == 4120) {
                            var6--;
                            String var348 = field726[var6];
                            var5--;
                            int var349 = field725[var5];
                            field725[var5++] = var348.indexOf(var349);
                            continue;
                        }
                        if (var440 == 4121) {
                            var6 -= 2;
                            String var350 = field726[var6];
                            String var351 = field726[var6 + 1];
                            var5--;
                            int var352 = field725[var5];
                            field725[var5++] = var350.indexOf(var351, var352);
                            continue;
                        }
                    } else if (var440 < 4300) {
                        if (var440 == 4200) {
                            var5--;
                            int var353 = field725[var5];
                            field726[var6++] = class47.method2(var353).field1034;
                            continue;
                        }
                        if (var440 == 4201) {
                            var5 -= 2;
                            int var354 = field725[var5];
                            int var355 = field725[var5 + 1];
                            class47 var356 = class47.method2(var354);
                            if (var355 >= 1 && var355 <= 5 && var356.field1045[var355 - 1] != null) {
                                field726[var6++] = var356.field1045[var355 - 1];
                                continue;
                            }
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 4202) {
                            var5 -= 2;
                            int var357 = field725[var5];
                            int var358 = field725[var5 + 1];
                            class47 var359 = class47.method2(var357);
                            if (var358 >= 1 && var358 <= 5 && var359.field1060[var358 - 1] != null) {
                                field726[var6++] = var359.field1060[var358 - 1];
                                continue;
                            }
                            field726[var6++] = "";
                            continue;
                        }
                        if (var440 == 4203) {
                            var5--;
                            int var360 = field725[var5];
                            field725[var5++] = class47.method2(var360).field1043;
                            continue;
                        }
                        if (var440 == 4204) {
                            var5--;
                            int var361 = field725[var5];
                            field725[var5++] = class47.method2(var361).field1042 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4205) {
                            var5--;
                            int var362 = field725[var5];
                            class47 var363 = class47.method2(var362);
                            if (var363.field1062 == -1 && var363.field1035 >= 0) {
                                field725[var5++] = var363.field1035;
                                continue;
                            }
                            field725[var5++] = var362;
                            continue;
                        }
                        if (var440 == 4206) {
                            var5--;
                            int var364 = field725[var5];
                            class47 var365 = class47.method2(var364);
                            if (var365.field1062 >= 0 && var365.field1035 >= 0) {
                                field725[var5++] = var365.field1035;
                                continue;
                            }
                            field725[var5++] = var364;
                            continue;
                        }
                        if (var440 == 4207) {
                            var5--;
                            int var366 = field725[var5];
                            field725[var5++] = class47.method2(var366).field1044 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4210) {
                            var6--;
                            String var367 = field726[var6];
                            var5--;
                            int var368 = field725[var5];
                            client.method906(var367, var368 == 1);
                            field725[var5++] = Statics.field1108;
                            continue;
                        }
                        if (var440 == 4211) {
                            if (Statics.field1288 != null && Statics.field2124 < Statics.field1108) {
                                field725[var5++] = Statics.field1288[++Statics.field2124 - 1] & 0xFFFF;
                                continue;
                            }
                            field725[var5++] = -1;
                            continue;
                        }
                        if (var440 == 4212) {
                            Statics.field2124 = 0;
                            continue;
                        }
                    } else if (var440 < 5100) {
                        if (var440 == 5000) {
                            field725[var5++] = client.field470;
                            continue;
                        }
                        if (var440 == 5001) {
                            var5 -= 3;
                            client.field470 = field725[var5];
                            Statics.field167 = class122.method3328(field725[var5 + 1]);
                            if (Statics.field167 == null) {
                                Statics.field167 = class122.field1936;
                            }
                            client.field471 = field725[var5 + 2];
                            client.field288.method2444(109);
                            client.field288.method2158(client.field470);
                            client.field288.method2158(Statics.field167.field1933);
                            client.field288.method2158(client.field471);
                            continue;
                        }
                        if (var440 == 5002) {
                            var6--;
                            String var369 = field726[var6];
                            var5 -= 2;
                            int var370 = field725[var5];
                            int var371 = field725[var5 + 1];
                            client.field288.method2444(191);
                            client.field288.method2158(class111.method1926(var369) + 2);
                            client.field288.method2163(var369);
                            client.field288.method2158(var370 - 1);
                            client.field288.method2158(var371);
                            continue;
                        }
                        if (var440 == 5003) {
                            var5 -= 2;
                            int var372 = field725[var5];
                            int var373 = field725[var5 + 1];
                            class33 var374 = class11.method606(var372, var373);
                            if (var374 == null) {
                                field725[var5++] = -1;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                                field726[var6++] = "";
                                field726[var6++] = "";
                            } else {
                                field725[var5++] = var374.field712;
                                field725[var5++] = var374.field713;
                                field726[var6++] = var374.field715 == null ? "" : var374.field715;
                                field726[var6++] = var374.field719 == null ? "" : var374.field719;
                                field726[var6++] = var374.field717 == null ? "" : var374.field717;
                            }
                            continue;
                        }
                        if (var440 == 5004) {
                            var5--;
                            int var375 = field725[var5];
                            class33 var376 = (class33) class11.field156.method3397((long) var375);
                            if (var376 == null) {
                                field725[var5++] = -1;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                                field726[var6++] = "";
                                field726[var6++] = "";
                            } else {
                                field725[var5++] = var376.field720;
                                field725[var5++] = var376.field713;
                                field726[var6++] = var376.field715 == null ? "" : var376.field715;
                                field726[var6++] = var376.field719 == null ? "" : var376.field719;
                                field726[var6++] = var376.field717 == null ? "" : var376.field717;
                            }
                            continue;
                        }
                        if (var440 == 5005) {
                            if (Statics.field167 == null) {
                                field725[var5++] = -1;
                            } else {
                                field725[var5++] = Statics.field167.field1933;
                            }
                            continue;
                        }
                        if (var440 == 5008) {
                            var6--;
                            String var378 = field726[var6];
                            var5--;
                            int var379 = field725[var5];
                            String var380 = var378.toLowerCase();
                            byte var381 = 0;
                            if (var380.startsWith(class148.field2363)) {
                                var381 = 0;
                                var378 = var378.substring(class148.field2363.length());
                            } else if (var380.startsWith(class148.field2395)) {
                                var381 = 1;
                                var378 = var378.substring(class148.field2395.length());
                            } else if (var380.startsWith(class148.field2367)) {
                                var381 = 2;
                                var378 = var378.substring(class148.field2367.length());
                            } else if (var380.startsWith(class148.field2369)) {
                                var381 = 3;
                                var378 = var378.substring(class148.field2369.length());
                            } else if (var380.startsWith(class148.field2371)) {
                                var381 = 4;
                                var378 = var378.substring(class148.field2371.length());
                            } else if (var380.startsWith(class148.field2373)) {
                                var381 = 5;
                                var378 = var378.substring(class148.field2373.length());
                            } else if (var380.startsWith(class148.field2430)) {
                                var381 = 6;
                                var378 = var378.substring(class148.field2430.length());
                            } else if (var380.startsWith(class148.field2403)) {
                                var381 = 7;
                                var378 = var378.substring(class148.field2403.length());
                            } else if (var380.startsWith(class148.field2362)) {
                                var381 = 8;
                                var378 = var378.substring(class148.field2362.length());
                            } else if (var380.startsWith(class148.field2381)) {
                                var381 = 9;
                                var378 = var378.substring(class148.field2381.length());
                            } else if (var380.startsWith(class148.field2383)) {
                                var381 = 10;
                                var378 = var378.substring(class148.field2383.length());
                            } else if (var380.startsWith(class148.field2190)) {
                                var381 = 11;
                                var378 = var378.substring(class148.field2190.length());
                            } else if (client.field252 != 0) {
                                if (var380.startsWith(class148.field2364)) {
                                    var381 = 0;
                                    var378 = var378.substring(class148.field2364.length());
                                } else if (var380.startsWith(class148.field2366)) {
                                    var381 = 1;
                                    var378 = var378.substring(class148.field2366.length());
                                } else if (var380.startsWith(class148.field2368)) {
                                    var381 = 2;
                                    var378 = var378.substring(class148.field2368.length());
                                } else if (var380.startsWith(class148.field2325)) {
                                    var381 = 3;
                                    var378 = var378.substring(class148.field2325.length());
                                } else if (var380.startsWith(class148.field2226)) {
                                    var381 = 4;
                                    var378 = var378.substring(class148.field2226.length());
                                } else if (var380.startsWith(class148.field2374)) {
                                    var381 = 5;
                                    var378 = var378.substring(class148.field2374.length());
                                } else if (var380.startsWith(class148.field2273)) {
                                    var381 = 6;
                                    var378 = var378.substring(class148.field2273.length());
                                } else if (var380.startsWith(class148.field2378)) {
                                    var381 = 7;
                                    var378 = var378.substring(class148.field2378.length());
                                } else if (var380.startsWith(class148.field2380)) {
                                    var381 = 8;
                                    var378 = var378.substring(class148.field2380.length());
                                } else if (var380.startsWith(class148.field2382)) {
                                    var381 = 9;
                                    var378 = var378.substring(class148.field2382.length());
                                } else if (var380.startsWith(class148.field2384)) {
                                    var381 = 10;
                                    var378 = var378.substring(class148.field2384.length());
                                } else if (var380.startsWith(class148.field2386)) {
                                    var381 = 11;
                                    var378 = var378.substring(class148.field2386.length());
                                }
                            }
                            String var382 = var378.toLowerCase();
                            byte var383 = 0;
                            if (var382.startsWith(class148.field2387)) {
                                var383 = 1;
                                var378 = var378.substring(class148.field2387.length());
                            } else if (var382.startsWith(class148.field2389)) {
                                var383 = 2;
                                var378 = var378.substring(class148.field2389.length());
                            } else if (var382.startsWith(class148.field2391)) {
                                var383 = 3;
                                var378 = var378.substring(class148.field2391.length());
                            } else if (var382.startsWith(class148.field2393)) {
                                var383 = 4;
                                var378 = var378.substring(class148.field2393.length());
                            } else if (var382.startsWith(class148.field2449)) {
                                var383 = 5;
                                var378 = var378.substring(class148.field2449.length());
                            } else if (client.field252 != 0) {
                                if (var382.startsWith(class148.field2388)) {
                                    var383 = 1;
                                    var378 = var378.substring(class148.field2388.length());
                                } else if (var382.startsWith(class148.field2354)) {
                                    var383 = 2;
                                    var378 = var378.substring(class148.field2354.length());
                                } else if (var382.startsWith(class148.field2392)) {
                                    var383 = 3;
                                    var378 = var378.substring(class148.field2392.length());
                                } else if (var382.startsWith(class148.field2394)) {
                                    var383 = 4;
                                    var378 = var378.substring(class148.field2394.length());
                                } else if (var382.startsWith(class148.field2314)) {
                                    var383 = 5;
                                    var378 = var378.substring(class148.field2314.length());
                                }
                            }
                            client.field288.method2444(53);
                            client.field288.method2158(0);
                            int var384 = client.field288.field1867;
                            client.field288.method2158(var379);
                            client.field288.method2158(var381);
                            client.field288.method2158(var383);
                            class114 var385 = client.field288;
                            int var386 = var385.field1867;
                            int var387 = var378.length();
                            byte[] var388 = new byte[var387];
                            for (int var389 = 0; var389 < var387; var389++) {
                                char var390 = var378.charAt(var389);
                                if (!(var390 <= 0 || var390 >= 128) || !(var390 < 160 || var390 > 255)) {
                                    var388[var389] = (byte) var390;
                                } else if (var390 == 8364) {
                                    var388[var389] = -128;
                                } else if (var390 == 8218) {
                                    var388[var389] = -126;
                                } else if (var390 == 402) {
                                    var388[var389] = -125;
                                } else if (var390 == 8222) {
                                    var388[var389] = -124;
                                } else if (var390 == 8230) {
                                    var388[var389] = -123;
                                } else if (var390 == 8224) {
                                    var388[var389] = -122;
                                } else if (var390 == 8225) {
                                    var388[var389] = -121;
                                } else if (var390 == 710) {
                                    var388[var389] = -120;
                                } else if (var390 == 8240) {
                                    var388[var389] = -119;
                                } else if (var390 == 352) {
                                    var388[var389] = -118;
                                } else if (var390 == 8249) {
                                    var388[var389] = -117;
                                } else if (var390 == 338) {
                                    var388[var389] = -116;
                                } else if (var390 == 381) {
                                    var388[var389] = -114;
                                } else if (var390 == 8216) {
                                    var388[var389] = -111;
                                } else if (var390 == 8217) {
                                    var388[var389] = -110;
                                } else if (var390 == 8220) {
                                    var388[var389] = -109;
                                } else if (var390 == 8221) {
                                    var388[var389] = -108;
                                } else if (var390 == 8226) {
                                    var388[var389] = -107;
                                } else if (var390 == 8211) {
                                    var388[var389] = -106;
                                } else if (var390 == 8212) {
                                    var388[var389] = -105;
                                } else if (var390 == 732) {
                                    var388[var389] = -104;
                                } else if (var390 == 8482) {
                                    var388[var389] = -103;
                                } else if (var390 == 353) {
                                    var388[var389] = -102;
                                } else if (var390 == 8250) {
                                    var388[var389] = -101;
                                } else if (var390 == 339) {
                                    var388[var389] = -100;
                                } else if (var390 == 382) {
                                    var388[var389] = -98;
                                } else if (var390 == 376) {
                                    var388[var389] = -97;
                                } else {
                                    var388[var389] = 63;
                                }
                            }
                            var385.method2208(var388.length);
                            var385.field1867 += Statics.field619.method2103(var388, 0, var388.length, var385.field1869, var385.field1867);
                            client.field288.method2169(client.field288.field1867 - var384);
                            continue;
                        }
                        if (var440 == 5009) {
                            var6 -= 2;
                            String var393 = field726[var6];
                            String var394 = field726[var6 + 1];
                            client.field288.method2444(184);
                            client.field288.method2159(0);
                            int var395 = client.field288.field1867;
                            client.field288.method2163(var393);
                            class114 var396 = client.field288;
                            int var397 = var396.field1867;
                            int var398 = var394.length();
                            byte[] var399 = new byte[var398];
                            for (int var400 = 0; var400 < var398; var400++) {
                                char var401 = var394.charAt(var400);
                                if (var401 > 0 && var401 < 128 || var401 >= 160 && var401 <= 255) {
                                    var399[var400] = (byte) var401;
                                } else if (var401 == 8364) {
                                    var399[var400] = -128;
                                } else if (var401 == 8218) {
                                    var399[var400] = -126;
                                } else if (var401 == 402) {
                                    var399[var400] = -125;
                                } else if (var401 == 8222) {
                                    var399[var400] = -124;
                                } else if (var401 == 8230) {
                                    var399[var400] = -123;
                                } else if (var401 == 8224) {
                                    var399[var400] = -122;
                                } else if (var401 == 8225) {
                                    var399[var400] = -121;
                                } else if (var401 == 710) {
                                    var399[var400] = -120;
                                } else if (var401 == 8240) {
                                    var399[var400] = -119;
                                } else if (var401 == 352) {
                                    var399[var400] = -118;
                                } else if (var401 == 8249) {
                                    var399[var400] = -117;
                                } else if (var401 == 338) {
                                    var399[var400] = -116;
                                } else if (var401 == 381) {
                                    var399[var400] = -114;
                                } else if (var401 == 8216) {
                                    var399[var400] = -111;
                                } else if (var401 == 8217) {
                                    var399[var400] = -110;
                                } else if (var401 == 8220) {
                                    var399[var400] = -109;
                                } else if (var401 == 8221) {
                                    var399[var400] = -108;
                                } else if (var401 == 8226) {
                                    var399[var400] = -107;
                                } else if (var401 == 8211) {
                                    var399[var400] = -106;
                                } else if (var401 == 8212) {
                                    var399[var400] = -105;
                                } else if (var401 == 732) {
                                    var399[var400] = -104;
                                } else if (var401 == 8482) {
                                    var399[var400] = -103;
                                } else if (var401 == 353) {
                                    var399[var400] = -102;
                                } else if (var401 == 8250) {
                                    var399[var400] = -101;
                                } else if (var401 == 339) {
                                    var399[var400] = -100;
                                } else if (var401 == 382) {
                                    var399[var400] = -98;
                                } else if (var401 == 376) {
                                    var399[var400] = -97;
                                } else {
                                    var399[var400] = 63;
                                }
                            }
                            var396.method2208(var399.length);
                            var396.field1867 += Statics.field619.method2103(var399, 0, var399.length, var396.field1869, var396.field1867);
                            client.field288.method2240(client.field288.field1867 - var395);
                            continue;
                        }
                        if (var440 == 5015) {
                            String var404;
                            if (Statics.field1548 == null || Statics.field1548.field42 == null) {
                                var404 = "";
                            } else {
                                var404 = Statics.field1548.field42;
                            }
                            field726[var6++] = var404;
                            continue;
                        }
                        if (var440 == 5016) {
                            field725[var5++] = client.field471;
                            continue;
                        }
                        if (var440 == 5017) {
                            var5--;
                            int var405 = field725[var5];
                            field725[var5++] = class11.method979(var405);
                            continue;
                        }
                        if (var440 == 5018) {
                            var5--;
                            int var406 = field725[var5];
                            int[] var407 = field725;
                            int var408 = var5++;
                            class33 var409 = (class33) class11.field156.method3397((long) var406);
                            int var410;
                            if (var409 == null) {
                                var410 = -1;
                            } else if (class11.field162.field3000 == var409.field3005) {
                                var410 = -1;
                            } else {
                                var410 = ((class33) var409.field3005).field712;
                            }
                            var407[var408] = var410;
                            continue;
                        }
                        if (var440 == 5019) {
                            var5--;
                            int var411 = field725[var5];
                            int[] var412 = field725;
                            int var413 = var5++;
                            class33 var414 = (class33) class11.field156.method3397((long) var411);
                            int var415;
                            if (var414 == null) {
                                var415 = -1;
                            } else if (class11.field162.field3000 == var414.field3004) {
                                var415 = -1;
                            } else {
                                var415 = ((class33) var414.field3004).field712;
                            }
                            var412[var413] = var415;
                            continue;
                        }
                        if (var440 == 5020) {
                            var6--;
                            String var416 = field726[var6];
                            client.method3066(var416);
                            continue;
                        }
                        if (var440 == 5021) {
                            var6--;
                            client.field429 = field726[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var440 == 5022) {
                            field726[var6++] = client.field429;
                            continue;
                        }
                    }
                }
                if (var440 < 5400) {
                    if (var440 == 5306) {
                        int[] var417 = field725;
                        int var418 = var5++;
                        int var419 = client.field466 ? 2 : 1;
                        var417[var418] = var419;
                        continue;
                    }
                    if (var440 == 5307) {
                        var5--;
                        int var420 = field725[var5];
                        if (var420 == 1 || var420 == 2) {
                            client.method797(var420);
                        }
                        continue;
                    }
                    if (var440 == 5308) {
                        field725[var5++] = Statics.field2092.field134;
                        continue;
                    }
                    if (var440 == 5309) {
                        var5--;
                        int var421 = field725[var5];
                        if (var421 == 1 || var421 == 2) {
                            Statics.field2092.field134 = var421;
                            class9.method2116();
                        }
                        continue;
                    }
                }
                if (var440 < 5600 && var440 == 5504) {
                    var5 -= 2;
                    int var422 = field725[var5];
                    int var423 = field725[var5 + 1];
                    if (!client.field500) {
                        client.field331 = var422;
                        client.field332 = var423;
                    }
                } else if (var440 < 5700 && var440 == 5630) {
                    client.field298 = 250;
                } else {
                    if (var440 < 6300) {
                        if (var440 == 6200) {
                            var5 -= 2;
                            client.field507 = (short) field725[var5];
                            if (client.field507 <= 0) {
                                client.field507 = 256;
                            }
                            client.field274 = (short) field725[var5 + 1];
                            if (client.field274 <= 0) {
                                client.field274 = 205;
                            }
                            continue;
                        }
                        if (var440 == 6201) {
                            var5 -= 2;
                            client.field509 = (short) field725[var5];
                            if (client.field509 <= 0) {
                                client.field509 = 256;
                            }
                            client.field510 = (short) field725[var5 + 1];
                            if (client.field510 <= 0) {
                                client.field510 = 320;
                            }
                            continue;
                        }
                        if (var440 == 6202) {
                            var5 -= 4;
                            client.field302 = (short) field725[var5];
                            if (client.field302 <= 0) {
                                client.field302 = 1;
                            }
                            client.field512 = (short) field725[var5 + 1];
                            if (client.field512 <= 0) {
                                client.field512 = 32767;
                            } else if (client.field512 < client.field302) {
                                client.field512 = client.field302;
                            }
                            client.field513 = (short) field725[var5 + 2];
                            if (client.field513 <= 0) {
                                client.field513 = 1;
                            }
                            client.field420 = (short) field725[var5 + 3];
                            if (client.field420 <= 0) {
                                client.field420 = 32767;
                            } else if (client.field420 < client.field513) {
                                client.field420 = client.field513;
                            }
                            continue;
                        }
                        if (var440 == 6203) {
                            if (client.field422 == null) {
                                field725[var5++] = -1;
                                field725[var5++] = -1;
                            } else {
                                client.method611(0, 0, client.field422.field2648, client.field422.field2754, false);
                                field725[var5++] = client.field418;
                                field725[var5++] = client.field453;
                            }
                            continue;
                        }
                        if (var440 == 6204) {
                            field725[var5++] = client.field509;
                            field725[var5++] = client.field510;
                            continue;
                        }
                        if (var440 == 6205) {
                            field725[var5++] = client.field507;
                            field725[var5++] = client.field274;
                            continue;
                        }
                    }
                    if (var440 < 6600) {
                        if (var440 == 6500) {
                            field725[var5++] = class24.method162() ? 1 : 0;
                            continue;
                        }
                        if (var440 == 6501) {
                            class24.field593 = 0;
                            class24 var424 = class24.method118();
                            if (var424 == null) {
                                field725[var5++] = -1;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                                field725[var5++] = 0;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                            } else {
                                field725[var5++] = var424.field604;
                                field725[var5++] = var424.field597;
                                field726[var6++] = var424.field600;
                                field725[var5++] = var424.field590;
                                field725[var5++] = var424.field598;
                                field726[var6++] = var424.field599;
                            }
                            continue;
                        }
                        if (var440 == 6502) {
                            class24 var426 = class24.method118();
                            if (var426 == null) {
                                field725[var5++] = -1;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                                field725[var5++] = 0;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                            } else {
                                field725[var5++] = var426.field604;
                                field725[var5++] = var426.field597;
                                field726[var6++] = var426.field600;
                                field725[var5++] = var426.field590;
                                field725[var5++] = var426.field598;
                                field726[var6++] = var426.field599;
                            }
                            continue;
                        }
                        if (var440 == 6506) {
                            var5--;
                            int var427 = field725[var5];
                            class24 var428 = null;
                            for (int var429 = 0; var429 < class24.field592; var429++) {
                                if (Statics.field587[var429].field604 == var427) {
                                    var428 = Statics.field587[var429];
                                    break;
                                }
                            }
                            if (var428 == null) {
                                field725[var5++] = -1;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                                field725[var5++] = 0;
                                field725[var5++] = 0;
                                field726[var6++] = "";
                            } else {
                                field725[var5++] = var428.field604;
                                field725[var5++] = var428.field597;
                                field726[var6++] = var428.field600;
                                field725[var5++] = var428.field590;
                                field725[var5++] = var428.field598;
                                field726[var6++] = var428.field599;
                            }
                            continue;
                        }
                        if (var440 == 6507) {
                            var5 -= 4;
                            int var430 = field725[var5];
                            boolean var431 = field725[var5 + 1] == 1;
                            int var432 = field725[var5 + 2];
                            boolean var433 = field725[var5 + 3] == 1;
                            class24.method2617(var430, var431, var432, var433);
                            continue;
                        }
                        if (var440 == 6511) {
                            var5--;
                            int var434 = field725[var5];
                            if (var434 >= 0 && var434 < class24.field592) {
                                class24 var435 = Statics.field587[var434];
                                field725[var5++] = var435.field604;
                                field725[var5++] = var435.field597;
                                field726[var6++] = var435.field600;
                                field725[var5++] = var435.field590;
                                field725[var5++] = var435.field598;
                                field726[var6++] = var435.field599;
                                continue;
                            }
                            field725[var5++] = -1;
                            field725[var5++] = 0;
                            field726[var6++] = "";
                            field725[var5++] = 0;
                            field725[var5++] = 0;
                            field726[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var439) {
            StringBuilder var437 = new StringBuilder(30);
            var437.append("").append(var4.field3015).append(" ");
            for (int var438 = field727 - 1; var438 >= 0; var438--) {
                var437.append("").append(field732[var438].field191.field3015).append(" ");
            }
            var437.append("").append(var10);
            class140.method2756(var437.toString(), var439);
        }
    }

    @ObfuscatedName("p.b(IB)V")
    public static void method19(int arg0) {
        if (arg0 == -1 || !class164.method1834(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2709[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2722 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field2 = var3.field2722;
                method554(var4, 2000000);
            }
        }
    }
}
