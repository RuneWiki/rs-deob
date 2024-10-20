package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("al")
public class class34 {

    @ObfuscatedName("al.p")
    public static int[] field732 = new int[5];

    @ObfuscatedName("al.l")
    public static int[][] field723 = new int[5][5000];

    @ObfuscatedName("al.u")
    public static int[] field719 = new int[1000];

    @ObfuscatedName("al.o")
    public static String[] field722 = new String[1000];

    @ObfuscatedName("al.m")
    public static int field726 = 0;

    @ObfuscatedName("al.q")
    public static class14[] field727 = new class14[50];

    @ObfuscatedName("al.z")
    public static Calendar field733 = Calendar.getInstance();

    @ObfuscatedName("al.r")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("al.i")
    public static int field730 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.b(Lb;IB)V")
    public static void method152(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method2440(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field544;
        int[] var9 = var4.field549;
        byte var10 = -1;
        field726 = 0;
        try {
            Statics.field728 = new int[var4.field547];
            int var11 = 0;
            Statics.field721 = new String[var4.field548];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2684;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2640;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2684;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2640;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field728[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field11;
                    }
                    Statics.field721[var12++] = var15;
                }
            }
            int var16 = 0;
            field730 = arg0.field8;
            label2597: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var384 = var8[var7];
                if (var384 < 100) {
                    if (var384 == 0) {
                        field719[var5++] = var9[var7];
                        continue;
                    }
                    if (var384 == 1) {
                        int var17 = var9[var7];
                        field719[var5++] = class167.field2786[var17];
                        continue;
                    }
                    if (var384 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2786[var18] = field719[var5];
                        client.method147(var18);
                        continue;
                    }
                    if (var384 == 3) {
                        field722[var6++] = var4.field543[var7];
                        continue;
                    }
                    if (var384 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var384 == 7) {
                        var5 -= 2;
                        if (field719[var5 + 1] != field719[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 8) {
                        var5 -= 2;
                        if (field719[var5 + 1] == field719[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 9) {
                        var5 -= 2;
                        if (field719[var5] < field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 10) {
                        var5 -= 2;
                        if (field719[var5] > field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 21) {
                        if (field726 == 0) {
                            return;
                        }
                        class14 var19 = field727[--field726];
                        var4 = var19.field190;
                        var8 = var4.field544;
                        var9 = var4.field549;
                        var7 = var19.field181;
                        Statics.field728 = var19.field182;
                        Statics.field721 = var19.field183;
                        continue;
                    }
                    if (var384 == 25) {
                        int var20 = var9[var7];
                        field719[var5++] = class167.method931(var20);
                        continue;
                    }
                    if (var384 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field719[var5];
                        class44 var23 = class44.method110(var21);
                        int var24 = var23.field989;
                        int var25 = var23.field991;
                        int var26 = var23.field998;
                        int var27 = class167.field2790[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class167.field2786[var24] = class167.field2786[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var384 == 31) {
                        var5 -= 2;
                        if (field719[var5] <= field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 32) {
                        var5 -= 2;
                        if (field719[var5] >= field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 33) {
                        field719[var5++] = Statics.field728[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var384 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field728[var10001] = field719[var5];
                        continue;
                    }
                    if (var384 == 35) {
                        field722[var6++] = Statics.field721[var9[var7]];
                        continue;
                    }
                    if (var384 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field721[var10001] = field722[var6];
                        continue;
                    }
                    if (var384 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class154.method138(field722, var6, var29);
                        field722[var6++] = var30;
                        continue;
                    }
                    if (var384 == 38) {
                        var5--;
                        continue;
                    }
                    if (var384 == 39) {
                        var6--;
                        continue;
                    }
                    if (var384 == 40) {
                        int var31 = var9[var7];
                        class20 var32 = class20.method2440(var31);
                        int[] var33 = new int[var32.field547];
                        String[] var34 = new String[var32.field548];
                        for (int var35 = 0; var35 < var32.field546; var35++) {
                            var33[var35] = field719[var5 - var32.field546 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field552; var36++) {
                            var34[var36] = field722[var6 - var32.field552 + var36];
                        }
                        var5 -= var32.field546;
                        var6 -= var32.field552;
                        class14 var37 = new class14();
                        var37.field190 = var4;
                        var37.field181 = var7;
                        var37.field182 = Statics.field728;
                        var37.field183 = Statics.field721;
                        field727[++field726 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field544;
                        var9 = var32.field549;
                        var7 = -1;
                        Statics.field728 = var33;
                        Statics.field721 = var34;
                        continue;
                    }
                    if (var384 == 42) {
                        field719[var5++] = client.field450[var9[var7]];
                        continue;
                    }
                    if (var384 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field450[var10001] = field719[var5];
                        continue;
                    }
                    if (var384 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field719[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field732[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2597;
                                }
                                field723[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var384 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field719[var5];
                        if (var44 >= 0 && var44 < field732[var43]) {
                            field719[var5++] = field723[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var384 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field719[var5];
                        if (var46 >= 0 && var46 < field732[var45]) {
                            field723[var45][var46] = field719[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var384 == 47) {
                        String var47 = client.field487[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field722[var6++] = var47;
                        continue;
                    }
                    if (var384 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field487[var10001] = field722[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var384 < 1000) {
                    if (var384 == 100) {
                        var5 -= 3;
                        int var49 = field719[var5];
                        int var50 = field719[var5 + 1];
                        int var51 = field719[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var52 = class164.method145(var49);
                        if (var52.field2731 == null) {
                            var52.field2731 = new class164[var51 + 1];
                        }
                        if (var52.field2731.length <= var51) {
                            class164[] var53 = new class164[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2731.length; var54++) {
                                var53[var54] = var52.field2731[var54];
                            }
                            var52.field2731 = var53;
                        }
                        if (var51 > 0 && var52.field2731[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class164 var55 = new class164();
                        var55.field2765 = var50;
                        var55.field2657 = var55.field2684 = var52.field2684;
                        var55.field2640 = var51;
                        var55.field2648 = true;
                        var52.field2731[var51] = var55;
                        if (var48) {
                            Statics.field3013 = var55;
                        } else {
                            Statics.field551 = var55;
                        }
                        client.method3247(var52);
                        continue;
                    }
                    if (var384 == 101) {
                        class164 var56 = var48 ? Statics.field3013 : Statics.field551;
                        class164 var57 = class164.method145(var56.field2684);
                        var57.field2731[var56.field2640] = null;
                        client.method3247(var57);
                        continue;
                    }
                    if (var384 == 102) {
                        var5--;
                        class164 var58 = class164.method145(field719[var5]);
                        var58.field2731 = null;
                        client.method3247(var58);
                        continue;
                    }
                    if (var384 == 200) {
                        var5 -= 2;
                        int var59 = field719[var5];
                        int var60 = field719[var5 + 1];
                        class164 var61 = class164.method2498(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field719[var5++] = 1;
                            if (var48) {
                                Statics.field3013 = var61;
                            } else {
                                Statics.field551 = var61;
                            }
                            continue;
                        }
                        field719[var5++] = 0;
                        continue;
                    }
                } else if (var384 >= 1000 && var384 < 1100 || var384 >= 2000 && var384 < 2100) {
                    int var62 = -1;
                    class164 var63;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var62 = field719[var5];
                        var63 = class164.method145(var62);
                    } else {
                        var63 = var48 ? Statics.field3013 : Statics.field551;
                    }
                    if (var384 == 1000) {
                        var5 -= 4;
                        var63.field2647 = field719[var5];
                        var63.field2720 = field719[var5 + 1];
                        var63.field2643 = field719[var5 + 2];
                        var63.field2644 = field719[var5 + 3];
                        client.method3247(var63);
                        client.method1857(var63);
                        if (var62 != -1 && var63.field2765 == 0) {
                            client.method169(Statics.field2726[var62 >> 16], var63, false);
                        }
                        continue;
                    }
                    if (var384 == 1001) {
                        var5 -= 4;
                        var63.field2649 = field719[var5];
                        var63.field2650 = field719[var5 + 1];
                        var63.field2659 = field719[var5 + 2];
                        var63.field2646 = field719[var5 + 3];
                        client.method3247(var63);
                        client.method1857(var63);
                        if (var62 != -1 && var63.field2765 == 0) {
                            client.method169(Statics.field2726[var62 >> 16], var63, false);
                        }
                        continue;
                    }
                    if (var384 == 1003) {
                        var5--;
                        boolean var64 = field719[var5] == 1;
                        if (var63.field2658 != var64) {
                            var63.field2658 = var64;
                            client.method3247(var63);
                        }
                        continue;
                    }
                    if (var384 == 1005) {
                        var5--;
                        var63.field2769 = field719[var5] == 1;
                        continue;
                    }
                } else if (var384 >= 1100 && var384 < 1200 || var384 >= 2100 && var384 < 2200) {
                    int var65 = -1;
                    class164 var66;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var65 = field719[var5];
                        var66 = class164.method145(var65);
                    } else {
                        var66 = var48 ? Statics.field3013 : Statics.field551;
                    }
                    if (var384 == 1100) {
                        var5 -= 2;
                        var66.field2627 = field719[var5];
                        if (var66.field2627 > var66.field2661 - var66.field2653) {
                            var66.field2627 = var66.field2661 - var66.field2653;
                        }
                        if (var66.field2627 < 0) {
                            var66.field2627 = 0;
                        }
                        var66.field2630 = field719[var5 + 1];
                        if (var66.field2630 > var66.field2750 - var66.field2654) {
                            var66.field2630 = var66.field2750 - var66.field2654;
                        }
                        if (var66.field2630 < 0) {
                            var66.field2630 = 0;
                        }
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1101) {
                        var5--;
                        var66.field2663 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1102) {
                        var5--;
                        var66.field2667 = field719[var5] == 1;
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1103) {
                        var5--;
                        var66.field2668 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1104) {
                        var5--;
                        var66.field2645 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1105) {
                        var5--;
                        var66.field2671 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1106) {
                        var5--;
                        var66.field2673 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1107) {
                        var5--;
                        var66.field2674 = field719[var5] == 1;
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1108) {
                        var66.field2679 = 1;
                        var5--;
                        var66.field2680 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1109) {
                        var5 -= 6;
                        var66.field2685 = field719[var5];
                        var66.field2686 = field719[var5 + 1];
                        var66.field2687 = field719[var5 + 2];
                        var66.field2662 = field719[var5 + 3];
                        var66.field2758 = field719[var5 + 4];
                        var66.field2690 = field719[var5 + 5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1110) {
                        var5--;
                        int var67 = field719[var5];
                        if (var66.field2683 != var67) {
                            var66.field2683 = var67;
                            var66.field2705 = 0;
                            var66.field2688 = 0;
                            client.method3247(var66);
                        }
                        continue;
                    }
                    if (var384 == 1111) {
                        var5--;
                        var66.field2693 = field719[var5] == 1;
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1112) {
                        var6--;
                        String var68 = field722[var6];
                        if (!var68.equals(var66.field2696)) {
                            var66.field2696 = var68;
                            client.method3247(var66);
                        }
                        continue;
                    }
                    if (var384 == 1113) {
                        var5--;
                        var66.field2695 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1114) {
                        var5 -= 3;
                        var66.field2699 = field719[var5];
                        var66.field2730 = field719[var5 + 1];
                        var66.field2698 = field719[var5 + 2];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1115) {
                        var5--;
                        var66.field2701 = field719[var5] == 1;
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1116) {
                        var5--;
                        var66.field2759 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1117) {
                        var5--;
                        var66.field2676 = field719[var5];
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1118) {
                        var5--;
                        var66.field2691 = field719[var5] == 1;
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1119) {
                        var5--;
                        var66.field2660 = field719[var5] == 1;
                        client.method3247(var66);
                        continue;
                    }
                    if (var384 == 1120) {
                        var5 -= 2;
                        var66.field2661 = field719[var5];
                        var66.field2750 = field719[var5 + 1];
                        client.method3247(var66);
                        if (var65 != -1 && var66.field2765 == 0) {
                            client.method169(Statics.field2726[var65 >> 16], var66, false);
                        }
                        continue;
                    }
                    if (var384 == 1121) {
                        client.method3423(var66.field2684, var66.field2640);
                        client.field416 = var66;
                        client.method3247(var66);
                        continue;
                    }
                } else if (!(var384 < 1200 || var384 >= 1300) || !(var384 < 2200 || var384 >= 2300)) {
                    class164 var69;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var69 = class164.method145(field719[var5]);
                    } else {
                        var69 = var48 ? Statics.field3013 : Statics.field551;
                    }
                    client.method3247(var69);
                    if (var384 == 1200 || var384 == 1205 || var384 == 1212) {
                        var5 -= 2;
                        int var70 = field719[var5];
                        int var71 = field719[var5 + 1];
                        var69.field2639 = var70;
                        var69.field2677 = var71;
                        class47 var72 = class47.method1037(var70);
                        var69.field2687 = var72.field1043;
                        var69.field2662 = var72.field1047;
                        var69.field2758 = var72.field1048;
                        var69.field2685 = var72.field1056;
                        var69.field2686 = var72.field1050;
                        var69.field2690 = var72.field1065;
                        if (var384 == 1205) {
                            var69.field2694 = 0;
                        } else if (var384 == 1212 | var72.field1051 == 1) {
                            var69.field2694 = 1;
                        } else {
                            var69.field2694 = 2;
                        }
                        if (var69.field2760 > 0) {
                            var69.field2690 = var69.field2690 * 32 / var69.field2760;
                        } else if (var69.field2649 > 0) {
                            var69.field2690 = var69.field2690 * 32 / var69.field2649;
                        }
                        continue;
                    }
                    if (var384 == 1201) {
                        var69.field2679 = 2;
                        var5--;
                        var69.field2680 = field719[var5];
                        continue;
                    }
                    if (var384 == 1202) {
                        var69.field2679 = 3;
                        var69.field2680 = Statics.field579.field29.method3030();
                        continue;
                    }
                } else if (var384 >= 1300 && var384 < 1400 || var384 >= 2300 && var384 < 2400) {
                    class164 var73;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var73 = class164.method145(field719[var5]);
                    } else {
                        var73 = var48 ? Statics.field3013 : Statics.field551;
                    }
                    if (var384 == 1300) {
                        var5--;
                        int var74 = field719[var5] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var6--;
                            var73.method2952(var74, field722[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var384 == 1301) {
                        var5 -= 2;
                        int var75 = field719[var5];
                        int var76 = field719[var5 + 1];
                        var73.field2692 = class164.method2498(var75, var76);
                        continue;
                    }
                    if (var384 == 1302) {
                        var5--;
                        var73.field2713 = field719[var5] == 1;
                        continue;
                    }
                    if (var384 == 1303) {
                        var5--;
                        var73.field2757 = field719[var5];
                        continue;
                    }
                    if (var384 == 1304) {
                        var5--;
                        var73.field2743 = field719[var5];
                        continue;
                    }
                    if (var384 == 1305) {
                        var6--;
                        var73.field2709 = field722[var6];
                        continue;
                    }
                    if (var384 == 1306) {
                        var6--;
                        var73.field2715 = field722[var6];
                        continue;
                    }
                    if (var384 == 1307) {
                        var73.field2710 = null;
                        continue;
                    }
                } else {
                    if (var384 >= 1400 && var384 < 1500 || var384 >= 2400 && var384 < 2500) {
                        class164 var77;
                        if (var384 >= 2000) {
                            var384 -= 1000;
                            var5--;
                            var77 = class164.method145(field719[var5]);
                        } else {
                            var77 = var48 ? Statics.field3013 : Statics.field551;
                        }
                        var6--;
                        String var78 = field722[var6];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var5--;
                            int var80 = field719[var5];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var5--;
                                    var79[var80] = field719[var5];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var6--;
                                var81[var82] = field722[var6];
                            } else {
                                var5--;
                                var81[var82] = Integer.valueOf(field719[var5]);
                            }
                        }
                        var5--;
                        int var83 = field719[var5];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var384 == 1400) {
                            var77.field2766 = var81;
                        }
                        if (var384 == 1401) {
                            var77.field2721 = var81;
                        }
                        if (var384 == 1402) {
                            var77.field2729 = var81;
                        }
                        if (var384 == 1403) {
                            var77.field2722 = var81;
                        }
                        if (var384 == 1404) {
                            var77.field2724 = var81;
                        }
                        if (var384 == 1405) {
                            var77.field2725 = var81;
                        }
                        if (var384 == 1406) {
                            var77.field2728 = var81;
                        }
                        if (var384 == 1407) {
                            var77.field2754 = var81;
                            var77.field2738 = var79;
                        }
                        if (var384 == 1408) {
                            var77.field2718 = var81;
                        }
                        if (var384 == 1409) {
                            var77.field2700 = var81;
                        }
                        if (var384 == 1410) {
                            var77.field2706 = var81;
                        }
                        if (var384 == 1411) {
                            var77.field2719 = var81;
                        }
                        if (var384 == 1412) {
                            var77.field2723 = var81;
                        }
                        if (var384 == 1414) {
                            var77.field2751 = var81;
                            var77.field2678 = var79;
                        }
                        if (var384 == 1415) {
                            var77.field2733 = var81;
                            var77.field2734 = var79;
                        }
                        if (var384 == 1416) {
                            var77.field2727 = var81;
                        }
                        if (var384 == 1417) {
                            var77.field2737 = var81;
                        }
                        if (var384 == 1418) {
                            var77.field2675 = var81;
                        }
                        if (var384 == 1419) {
                            var77.field2739 = var81;
                        }
                        if (var384 == 1420) {
                            var77.field2740 = var81;
                        }
                        if (var384 == 1421) {
                            var77.field2741 = var81;
                        }
                        if (var384 == 1422) {
                            var77.field2742 = var81;
                        }
                        if (var384 == 1423) {
                            var77.field2756 = var81;
                        }
                        if (var384 == 1424) {
                            var77.field2744 = var81;
                        }
                        if (var384 == 1425) {
                            var77.field2712 = var81;
                        }
                        if (var384 == 1426) {
                            var77.field2747 = var81;
                        }
                        if (var384 == 1427) {
                            var77.field2745 = var81;
                        }
                        var77.field2736 = true;
                        continue;
                    }
                    if (var384 < 1600) {
                        class164 var84 = var48 ? Statics.field3013 : Statics.field551;
                        if (var384 == 1500) {
                            field719[var5++] = var84.field2651;
                            continue;
                        }
                        if (var384 == 1501) {
                            field719[var5++] = var84.field2652;
                            continue;
                        }
                        if (var384 == 1502) {
                            field719[var5++] = var84.field2653;
                            continue;
                        }
                        if (var384 == 1503) {
                            field719[var5++] = var84.field2654;
                            continue;
                        }
                        if (var384 == 1504) {
                            field719[var5++] = var84.field2658 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 1505) {
                            field719[var5++] = var84.field2657;
                            continue;
                        }
                    } else if (var384 < 1700) {
                        class164 var85 = var48 ? Statics.field3013 : Statics.field551;
                        if (var384 == 1600) {
                            field719[var5++] = var85.field2627;
                            continue;
                        }
                        if (var384 == 1601) {
                            field719[var5++] = var85.field2630;
                            continue;
                        }
                        if (var384 == 1602) {
                            field722[var6++] = var85.field2696;
                            continue;
                        }
                        if (var384 == 1603) {
                            field719[var5++] = var85.field2661;
                            continue;
                        }
                        if (var384 == 1604) {
                            field719[var5++] = var85.field2750;
                            continue;
                        }
                        if (var384 == 1605) {
                            field719[var5++] = var85.field2690;
                            continue;
                        }
                        if (var384 == 1606) {
                            field719[var5++] = var85.field2687;
                            continue;
                        }
                        if (var384 == 1607) {
                            field719[var5++] = var85.field2758;
                            continue;
                        }
                        if (var384 == 1608) {
                            field719[var5++] = var85.field2662;
                            continue;
                        }
                        if (var384 == 1609) {
                            field719[var5++] = var85.field2668;
                            continue;
                        }
                    } else if (var384 < 1800) {
                        class164 var86 = var48 ? Statics.field3013 : Statics.field551;
                        if (var384 == 1700) {
                            field719[var5++] = var86.field2639;
                            continue;
                        }
                        if (var384 == 1701) {
                            if (var86.field2639 == -1) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = var86.field2677;
                            }
                            continue;
                        }
                        if (var384 == 1702) {
                            field719[var5++] = var86.field2640;
                            continue;
                        }
                    } else if (var384 < 1900) {
                        class164 var87 = var48 ? Statics.field3013 : Statics.field551;
                        if (var384 == 1800) {
                            field719[var5++] = class169.method2421(client.method1969(var87));
                            continue;
                        }
                        if (var384 == 1801) {
                            var5--;
                            int var88 = field719[var5];
                            int var385 = var88 - 1;
                            if (var87.field2710 != null && var385 < var87.field2710.length && var87.field2710[var385] != null) {
                                field722[var6++] = var87.field2710[var385];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 1802) {
                            if (var87.field2709 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var87.field2709;
                            }
                            continue;
                        }
                    } else if (!(var384 < 1900 || var384 >= 2000) || !(var384 < 2900 || var384 >= 3000)) {
                        class164 var89;
                        if (var384 >= 2000) {
                            var384 -= 1000;
                            var5--;
                            var89 = class164.method145(field719[var5]);
                        } else {
                            var89 = var48 ? Statics.field3013 : Statics.field551;
                        }
                        if (var384 == 1927) {
                            if (field730 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var89.field2745 == null) {
                                return;
                            }
                            class1 var90 = new class1();
                            var90.field3 = var89;
                            var90.field5 = var89.field2745;
                            var90.field8 = field730 + 1;
                            client.field244.method3319(arg0);
                            continue;
                        }
                    } else if (var384 < 2600) {
                        var5--;
                        class164 var91 = class164.method145(field719[var5]);
                        if (var384 == 2500) {
                            field719[var5++] = var91.field2651;
                            continue;
                        }
                        if (var384 == 2501) {
                            field719[var5++] = var91.field2652;
                            continue;
                        }
                        if (var384 == 2502) {
                            field719[var5++] = var91.field2653;
                            continue;
                        }
                        if (var384 == 2503) {
                            field719[var5++] = var91.field2654;
                            continue;
                        }
                        if (var384 == 2504) {
                            field719[var5++] = var91.field2658 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 2505) {
                            field719[var5++] = var91.field2657;
                            continue;
                        }
                    } else if (var384 < 2700) {
                        var5--;
                        class164 var92 = class164.method145(field719[var5]);
                        if (var384 == 2600) {
                            field719[var5++] = var92.field2627;
                            continue;
                        }
                        if (var384 == 2601) {
                            field719[var5++] = var92.field2630;
                            continue;
                        }
                        if (var384 == 2602) {
                            field722[var6++] = var92.field2696;
                            continue;
                        }
                        if (var384 == 2603) {
                            field719[var5++] = var92.field2661;
                            continue;
                        }
                        if (var384 == 2604) {
                            field719[var5++] = var92.field2750;
                            continue;
                        }
                        if (var384 == 2605) {
                            field719[var5++] = var92.field2690;
                            continue;
                        }
                        if (var384 == 2606) {
                            field719[var5++] = var92.field2687;
                            continue;
                        }
                        if (var384 == 2607) {
                            field719[var5++] = var92.field2758;
                            continue;
                        }
                        if (var384 == 2608) {
                            field719[var5++] = var92.field2662;
                            continue;
                        }
                        if (var384 == 2609) {
                            field719[var5++] = var92.field2668;
                            continue;
                        }
                    } else if (var384 < 2800) {
                        if (var384 == 2700) {
                            var5--;
                            class164 var93 = class164.method145(field719[var5]);
                            field719[var5++] = var93.field2639;
                            continue;
                        }
                        if (var384 == 2701) {
                            var5--;
                            class164 var94 = class164.method145(field719[var5]);
                            if (var94.field2639 == -1) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = var94.field2677;
                            }
                            continue;
                        }
                        if (var384 == 2702) {
                            var5--;
                            int var95 = field719[var5];
                            class4 var96 = (class4) client.field413.method3297((long) var95);
                            if (var96 == null) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = 1;
                            }
                            continue;
                        }
                        if (var384 == 2706) {
                            field719[var5++] = client.field306;
                            continue;
                        }
                    } else if (var384 < 2900) {
                        var5--;
                        class164 var97 = class164.method145(field719[var5]);
                        if (var384 == 2800) {
                            field719[var5++] = class169.method2421(client.method1969(var97));
                            continue;
                        }
                        if (var384 == 2801) {
                            var5--;
                            int var98 = field719[var5];
                            int var386 = var98 - 1;
                            if (var97.field2710 != null && var386 < var97.field2710.length && var97.field2710[var386] != null) {
                                field722[var6++] = var97.field2710[var386];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 2802) {
                            if (var97.field2709 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var97.field2709;
                            }
                            continue;
                        }
                    } else if (var384 < 3200) {
                        if (var384 == 3100) {
                            var6--;
                            String var99 = field722[var6];
                            class11.method2070(0, "", var99);
                            continue;
                        }
                        if (var384 == 3101) {
                            var5 -= 2;
                            client.method1961(Statics.field579, field719[var5], field719[var5 + 1]);
                            continue;
                        }
                        if (var384 == 3103) {
                            client.field397.method2386(243);
                            for (class4 var100 = (class4) client.field413.method3286(); var100 != null; var100 = (class4) client.field413.method3291()) {
                                if (var100.field53 == 0 || var100.field53 == 3) {
                                    client.method1084(var100, true);
                                }
                            }
                            if (client.field416 != null) {
                                client.method3247(client.field416);
                                client.field416 = null;
                            }
                            continue;
                        }
                        if (var384 == 3104) {
                            var6--;
                            String var101 = field722[var6];
                            int var102 = 0;
                            if (class154.method2754(var101)) {
                                int var103 = class154.method2535(var101, 10, true);
                                var102 = var103;
                            }
                            client.field397.method2386(72);
                            client.field397.method2115(var102);
                            continue;
                        }
                        if (var384 == 3105) {
                            var6--;
                            String var104 = field722[var6];
                            client.field397.method2386(242);
                            client.field397.method2112(var104.length() + 1);
                            client.field397.method2247(var104);
                            continue;
                        }
                        if (var384 == 3106) {
                            var6--;
                            String var105 = field722[var6];
                            client.field397.method2386(232);
                            client.field397.method2112(var105.length() + 1);
                            client.field397.method2247(var105);
                            continue;
                        }
                        if (var384 == 3107) {
                            var5--;
                            int var106 = field719[var5];
                            var6--;
                            String var107 = field722[var6];
                            client.method120(var106, var107);
                            continue;
                        }
                        if (var384 == 3108) {
                            var5 -= 3;
                            int var108 = field719[var5];
                            int var109 = field719[var5 + 1];
                            int var110 = field719[var5 + 2];
                            class164 var111 = class164.method145(var110);
                            client.method3(var111, var108, var109);
                            continue;
                        }
                        if (var384 == 3109) {
                            var5 -= 2;
                            int var112 = field719[var5];
                            int var113 = field719[var5 + 1];
                            class164 var114 = var48 ? Statics.field3013 : Statics.field551;
                            client.method3(var114, var112, var113);
                            continue;
                        }
                        if (var384 == 3110) {
                            var5--;
                            Statics.field134 = field719[var5] == 1;
                            continue;
                        }
                        if (var384 == 3111) {
                            field719[var5++] = Statics.field1015.field126 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3112) {
                            var5--;
                            Statics.field1015.field126 = field719[var5] == 1;
                            Statics.method537();
                            continue;
                        }
                        if (var384 == 3113) {
                            var6--;
                            String var115 = field722[var6];
                            var5--;
                            boolean var116 = field719[var5] == 1;
                            class130.method1860(var115, var116, "openjs", false);
                            continue;
                        }
                        if (var384 == 3115) {
                            var5--;
                            int var117 = field719[var5];
                            client.field397.method2386(119);
                            client.field397.method2201(var117);
                            continue;
                        }
                    } else if (var384 < 3300) {
                        if (var384 == 3200) {
                            var5 -= 3;
                            client.method1580(field719[var5], field719[var5 + 1], field719[var5 + 2]);
                            continue;
                        }
                        if (var384 == 3201) {
                            var5--;
                            client.method926(field719[var5]);
                            continue;
                        }
                        if (var384 == 3202) {
                            var5 -= 2;
                            client.method784(field719[var5], field719[var5 + 1]);
                            continue;
                        }
                    } else if (var384 < 3400) {
                        if (var384 == 3300) {
                            field719[var5++] = client.field259;
                            continue;
                        }
                        if (var384 == 3301) {
                            var5 -= 2;
                            int var118 = field719[var5];
                            int var119 = field719[var5 + 1];
                            field719[var5++] = class15.method2370(var118, var119);
                            continue;
                        }
                        if (var384 == 3302) {
                            var5 -= 2;
                            int var120 = field719[var5];
                            int var121 = field719[var5 + 1];
                            field719[var5++] = class15.method142(var120, var121);
                            continue;
                        }
                        if (var384 == 3303) {
                            var5 -= 2;
                            int var122 = field719[var5];
                            int var123 = field719[var5 + 1];
                            field719[var5++] = class15.method2737(var122, var123);
                            continue;
                        }
                        if (var384 == 3304) {
                            var5--;
                            int var124 = field719[var5];
                            field719[var5++] = class46.method182(var124).field1027;
                            continue;
                        }
                        if (var384 == 3305) {
                            var5--;
                            int var125 = field719[var5];
                            field719[var5++] = client.field389[var125];
                            continue;
                        }
                        if (var384 == 3306) {
                            var5--;
                            int var126 = field719[var5];
                            field719[var5++] = client.field336[var126];
                            continue;
                        }
                        if (var384 == 3307) {
                            var5--;
                            int var127 = field719[var5];
                            field719[var5++] = client.field409[var127];
                            continue;
                        }
                        if (var384 == 3308) {
                            int var128 = Statics.field50;
                            int var129 = (Statics.field579.field749 >> 7) + Statics.field1912;
                            int var130 = (Statics.field579.field752 >> 7) + Statics.field1084;
                            field719[var5++] = (var128 << 28) + (var129 << 14) + var130;
                            continue;
                        }
                        if (var384 == 3309) {
                            var5--;
                            int var131 = field719[var5];
                            field719[var5++] = var131 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var384 == 3310) {
                            var5--;
                            int var132 = field719[var5];
                            field719[var5++] = var132 >> 28;
                            continue;
                        }
                        if (var384 == 3311) {
                            var5--;
                            int var133 = field719[var5];
                            field719[var5++] = var133 & 0x3FFF;
                            continue;
                        }
                        if (var384 == 3312) {
                            field719[var5++] = client.field253 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3313) {
                            var5 -= 2;
                            int var134 = field719[var5] + 32768;
                            int var135 = field719[var5 + 1];
                            field719[var5++] = class15.method2370(var134, var135);
                            continue;
                        }
                        if (var384 == 3314) {
                            var5 -= 2;
                            int var136 = field719[var5] + 32768;
                            int var137 = field719[var5 + 1];
                            field719[var5++] = class15.method142(var136, var137);
                            continue;
                        }
                        if (var384 == 3315) {
                            var5 -= 2;
                            int var138 = field719[var5] + 32768;
                            int var139 = field719[var5 + 1];
                            field719[var5++] = class15.method2737(var138, var139);
                            continue;
                        }
                        if (var384 == 3316) {
                            if (client.field311 >= 2) {
                                field719[var5++] = client.field311;
                            } else {
                                field719[var5++] = 0;
                            }
                            continue;
                        }
                        if (var384 == 3317) {
                            field719[var5++] = client.field523;
                            continue;
                        }
                        if (var384 == 3318) {
                            field719[var5++] = client.field478;
                            continue;
                        }
                        if (var384 == 3321) {
                            field719[var5++] = client.field417;
                            continue;
                        }
                        if (var384 == 3322) {
                            field719[var5++] = client.field251;
                            continue;
                        }
                        if (var384 == 3323) {
                            if (client.field439) {
                                field719[var5++] = 1;
                            } else {
                                field719[var5++] = 0;
                            }
                            continue;
                        }
                        if (var384 == 3324) {
                            field719[var5++] = client.field248;
                            continue;
                        }
                    } else if (var384 < 3500) {
                        if (var384 == 3400) {
                            var5 -= 2;
                            int var140 = field719[var5];
                            int var141 = field719[var5 + 1];
                            class45 var142 = class45.method2057(var140);
                            if (var142.field1004 != 's') {
                            }
                            for (int var143 = 0; var143 < var142.field1007; var143++) {
                                if (var142.field1002[var143] == var141) {
                                    field722[var6++] = var142.field1001[var143];
                                    var142 = null;
                                    break;
                                }
                            }
                            if (var142 != null) {
                                field722[var6++] = var142.field1005;
                            }
                            continue;
                        }
                        if (var384 == 3408) {
                            var5 -= 4;
                            int var144 = field719[var5];
                            int var145 = field719[var5 + 1];
                            int var146 = field719[var5 + 2];
                            int var147 = field719[var5 + 3];
                            class45 var148 = class45.method2057(var146);
                            if (var148.field1010 == var144 && var148.field1004 == var145) {
                                for (int var149 = 0; var149 < var148.field1007; var149++) {
                                    if (var148.field1002[var149] == var147) {
                                        if (var145 == 115) {
                                            field722[var6++] = var148.field1001[var149];
                                        } else {
                                            field719[var5++] = var148.field1009[var149];
                                        }
                                        var148 = null;
                                        break;
                                    }
                                }
                                if (var148 != null) {
                                    if (var145 == 115) {
                                        field722[var6++] = var148.field1005;
                                    } else {
                                        field719[var5++] = var148.field1008;
                                    }
                                }
                                continue;
                            }
                            if (var145 == 115) {
                                field722[var6++] = "null";
                            } else {
                                field719[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var384 < 3700) {
                        if (var384 == 3600) {
                            if (client.field524 == 0) {
                                field719[var5++] = -2;
                            } else if (client.field524 == 1) {
                                field719[var5++] = -1;
                            } else {
                                field719[var5++] = client.field502;
                            }
                            continue;
                        }
                        if (var384 == 3601) {
                            var5--;
                            int var150 = field719[var5];
                            if (client.field524 == 2 && var150 < client.field502) {
                                field722[var6++] = client.field272[var150].field225;
                                field722[var6++] = client.field272[var150].field219;
                                continue;
                            }
                            field722[var6++] = "";
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 3602) {
                            var5--;
                            int var151 = field719[var5];
                            if (client.field524 == 2 && var151 < client.field502) {
                                field719[var5++] = client.field272[var151].field220;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3603) {
                            var5--;
                            int var152 = field719[var5];
                            if (client.field524 == 2 && var152 < client.field502) {
                                field719[var5++] = client.field272[var152].field218;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3604) {
                            var6--;
                            String var153 = field722[var6];
                            var5--;
                            int var154 = field719[var5];
                            client.field397.method2386(40);
                            client.field397.method2112(class111.method1876(var153) + 1);
                            client.field397.method2151(var154);
                            client.field397.method2247(var153);
                            continue;
                        }
                        if (var384 == 3605) {
                            var6--;
                            String var155 = field722[var6];
                            client.method184(var155);
                            continue;
                        }
                        if (var384 == 3606) {
                            var6--;
                            String var156 = field722[var6];
                            client.method2447(var156);
                            continue;
                        }
                        if (var384 == 3607) {
                            var6--;
                            String var157 = field722[var6];
                            client.method2583(var157, false);
                            continue;
                        }
                        if (var384 == 3608) {
                            var6--;
                            String var158 = field722[var6];
                            client.method536(var158);
                            continue;
                        }
                        if (var384 == 3609) {
                            var6--;
                            String var159 = field722[var6];
                            class143[] var160 = class143.method563();
                            for (int var161 = 0; var161 < var160.length; var161++) {
                                class143 var162 = var160[var161];
                                if (var162.field2160 != -1 && var159.startsWith(class2.method2738(var162.field2160))) {
                                    var159 = var159.substring(6 + Integer.toString(var162.field2160).length());
                                    break;
                                }
                            }
                            field719[var5++] = client.method4(var159, false) ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3611) {
                            if (client.field488 == null) {
                                field722[var6++] = "";
                            } else {
                                String[] var163 = field722;
                                int var164 = var6++;
                                String var165 = client.field488;
                                String var166 = class153.method2453(class153.method636(var165));
                                if (var166 == null) {
                                    var166 = "";
                                }
                                var163[var164] = var166;
                            }
                            continue;
                        }
                        if (var384 == 3612) {
                            if (client.field488 == null) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = Statics.field802;
                            }
                            continue;
                        }
                        if (var384 == 3613) {
                            var5--;
                            int var168 = field719[var5];
                            if (client.field488 != null && var168 < Statics.field802) {
                                field722[var6++] = Statics.field2101[var168].field588;
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 3614) {
                            var5--;
                            int var169 = field719[var5];
                            if (client.field488 != null && var169 < Statics.field802) {
                                field719[var5++] = Statics.field2101[var169].field582;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3615) {
                            var5--;
                            int var170 = field719[var5];
                            if (client.field488 != null && var170 < Statics.field802) {
                                field719[var5++] = Statics.field2101[var170].field585;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3616) {
                            field719[var5++] = Statics.field484;
                            continue;
                        }
                        if (var384 == 3617) {
                            var6--;
                            String var171 = field722[var6];
                            if (Statics.field2101 != null) {
                                client.field397.method2386(85);
                                client.field397.method2112(class111.method1876(var171));
                                client.field397.method2247(var171);
                            }
                            continue;
                        }
                        if (var384 == 3618) {
                            field719[var5++] = Statics.field2064;
                            continue;
                        }
                        if (var384 == 3619) {
                            var6--;
                            String var172 = field722[var6];
                            client.method1765(var172);
                            continue;
                        }
                        if (var384 == 3620) {
                            client.method2078();
                            continue;
                        }
                        if (var384 == 3621) {
                            if (client.field524 == 0) {
                                field719[var5++] = -1;
                            } else {
                                field719[var5++] = client.field318;
                            }
                            continue;
                        }
                        if (var384 == 3622) {
                            var5--;
                            int var173 = field719[var5];
                            if (client.field524 != 0 && var173 < client.field318) {
                                field722[var6++] = client.field528[var173].field119;
                                field722[var6++] = client.field528[var173].field124;
                                continue;
                            }
                            field722[var6++] = "";
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 3623) {
                            var6--;
                            String var174 = field722[var6];
                            if (var174.startsWith(class2.method2738(0)) || var174.startsWith(class2.method2738(1))) {
                                var174 = var174.substring(7);
                            }
                            field719[var5++] = client.method99(var174) ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3624) {
                            var5--;
                            int var175 = field719[var5];
                            if (Statics.field2101 != null && var175 < Statics.field802 && Statics.field2101[var175].field588.equalsIgnoreCase(Statics.field579.field33)) {
                                field719[var5++] = 1;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3625) {
                            if (client.field483 == null) {
                                field722[var6++] = "";
                            } else {
                                String[] var176 = field722;
                                int var177 = var6++;
                                String var178 = client.field483;
                                String var179 = class153.method2453(class153.method636(var178));
                                if (var179 == null) {
                                    var179 = "";
                                }
                                var176[var177] = var179;
                            }
                            continue;
                        }
                    } else if (var384 < 4000) {
                        if (var384 == 3903) {
                            var5--;
                            int var181 = field719[var5];
                            field719[var5++] = client.field392[var181].method3499();
                            continue;
                        }
                        if (var384 == 3904) {
                            var5--;
                            int var182 = field719[var5];
                            field719[var5++] = client.field392[var182].field3065;
                            continue;
                        }
                        if (var384 == 3905) {
                            var5--;
                            int var183 = field719[var5];
                            field719[var5++] = client.field392[var183].field3067;
                            continue;
                        }
                        if (var384 == 3906) {
                            var5--;
                            int var184 = field719[var5];
                            field719[var5++] = client.field392[var184].field3069;
                            continue;
                        }
                        if (var384 == 3907) {
                            var5--;
                            int var185 = field719[var5];
                            field719[var5++] = client.field392[var185].field3066;
                            continue;
                        }
                        if (var384 == 3908) {
                            var5--;
                            int var186 = field719[var5];
                            field719[var5++] = client.field392[var186].field3064;
                            continue;
                        }
                        if (var384 == 3910) {
                            var5--;
                            int var187 = field719[var5];
                            int var188 = client.field392[var187].method3515();
                            field719[var5++] = var188 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3911) {
                            var5--;
                            int var189 = field719[var5];
                            int var190 = client.field392[var189].method3515();
                            field719[var5++] = var190 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3912) {
                            var5--;
                            int var191 = field719[var5];
                            int var192 = client.field392[var191].method3515();
                            field719[var5++] = var192 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3913) {
                            var5--;
                            int var193 = field719[var5];
                            int var194 = client.field392[var193].method3515();
                            field719[var5++] = var194 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3914) {
                            var5--;
                            boolean var195 = field719[var5] == 1;
                            if (Statics.field32 != null) {
                                Statics.field32.method3521(class212.field3075, var195);
                            }
                            continue;
                        }
                        if (var384 == 3915) {
                            var5--;
                            boolean var196 = field719[var5] == 1;
                            if (Statics.field32 != null) {
                                Statics.field32.method3521(class212.field3073, var196);
                            }
                            continue;
                        }
                        if (var384 == 3916) {
                            var5 -= 2;
                            boolean var197 = field719[var5] == 1;
                            boolean var198 = field719[var5 + 1] == 1;
                            if (Statics.field32 != null) {
                                Statics.field32.method3521(new class21(var198), var197);
                            }
                            continue;
                        }
                        if (var384 == 3917) {
                            var5--;
                            boolean var199 = field719[var5] == 1;
                            if (Statics.field32 != null) {
                                Statics.field32.method3521(class212.field3072, var199);
                            }
                            continue;
                        }
                        if (var384 == 3918) {
                            var5--;
                            boolean var200 = field719[var5] == 1;
                            if (Statics.field32 != null) {
                                Statics.field32.method3521(class212.field3071, var200);
                            }
                            continue;
                        }
                        if (var384 == 3919) {
                            field719[var5++] = Statics.field32 == null ? 0 : Statics.field32.field3074.size();
                            continue;
                        }
                        if (var384 == 3920) {
                            var5--;
                            int var201 = field719[var5];
                            class205 var202 = (class205) Statics.field32.field3074.get(var201);
                            field719[var5++] = var202.field3042;
                            continue;
                        }
                        if (var384 == 3921) {
                            var5--;
                            int var203 = field719[var5];
                            class205 var204 = (class205) Statics.field32.field3074.get(var203);
                            field722[var6++] = var204.method3451();
                            continue;
                        }
                        if (var384 == 3922) {
                            var5--;
                            int var205 = field719[var5];
                            class205 var206 = (class205) Statics.field32.field3074.get(var205);
                            field722[var6++] = var206.method3452();
                            continue;
                        }
                        if (var384 == 3923) {
                            var5--;
                            int var207 = field719[var5];
                            class205 var208 = (class205) Statics.field32.field3074.get(var207);
                            long var209 = class107.method3468() - Statics.field1920 - var208.field3043;
                            int var211 = (int) (var209 / 3600000L);
                            int var212 = (int) ((var209 - (long) (var211 * 3600000)) / 60000L);
                            int var213 = (int) ((var209 - (long) (var211 * 3600000) - (long) (var212 * 60000)) / 1000L);
                            String var214 = var211 + ":" + var212 / 10 + var212 % 10 + ":" + var213 / 10 + var213 % 10;
                            field722[var6++] = var214;
                            continue;
                        }
                        if (var384 == 3924) {
                            var5--;
                            int var215 = field719[var5];
                            class205 var216 = (class205) Statics.field32.field3074.get(var215);
                            field719[var5++] = var216.field3041.field3069;
                            continue;
                        }
                        if (var384 == 3925) {
                            var5--;
                            int var217 = field719[var5];
                            class205 var218 = (class205) Statics.field32.field3074.get(var217);
                            field719[var5++] = var218.field3041.field3067;
                            continue;
                        }
                        if (var384 == 3926) {
                            var5--;
                            int var219 = field719[var5];
                            class205 var220 = (class205) Statics.field32.field3074.get(var219);
                            field719[var5++] = var220.field3041.field3065;
                            continue;
                        }
                    } else if (var384 < 4100) {
                        if (var384 == 4000) {
                            var5 -= 2;
                            int var221 = field719[var5];
                            int var222 = field719[var5 + 1];
                            field719[var5++] = var221 + var222;
                            continue;
                        }
                        if (var384 == 4001) {
                            var5 -= 2;
                            int var223 = field719[var5];
                            int var224 = field719[var5 + 1];
                            field719[var5++] = var223 - var224;
                            continue;
                        }
                        if (var384 == 4002) {
                            var5 -= 2;
                            int var225 = field719[var5];
                            int var226 = field719[var5 + 1];
                            field719[var5++] = var225 * var226;
                            continue;
                        }
                        if (var384 == 4003) {
                            var5 -= 2;
                            int var227 = field719[var5];
                            int var228 = field719[var5 + 1];
                            field719[var5++] = var227 / var228;
                            continue;
                        }
                        if (var384 == 4004) {
                            var5--;
                            int var229 = field719[var5];
                            field719[var5++] = (int) (Math.random() * (double) var229);
                            continue;
                        }
                        if (var384 == 4005) {
                            var5--;
                            int var230 = field719[var5];
                            field719[var5++] = (int) (Math.random() * (double) (var230 + 1));
                            continue;
                        }
                        if (var384 == 4006) {
                            var5 -= 5;
                            int var231 = field719[var5];
                            int var232 = field719[var5 + 1];
                            int var233 = field719[var5 + 2];
                            int var234 = field719[var5 + 3];
                            int var235 = field719[var5 + 4];
                            field719[var5++] = (var232 - var231) * (var235 - var233) / (var234 - var233) + var231;
                            continue;
                        }
                        if (var384 == 4007) {
                            var5 -= 2;
                            int var236 = field719[var5];
                            int var237 = field719[var5 + 1];
                            field719[var5++] = var236 * var237 / 100 + var236;
                            continue;
                        }
                        if (var384 == 4008) {
                            var5 -= 2;
                            int var238 = field719[var5];
                            int var239 = field719[var5 + 1];
                            field719[var5++] = var238 | 0x1 << var239;
                            continue;
                        }
                        if (var384 == 4009) {
                            var5 -= 2;
                            int var240 = field719[var5];
                            int var241 = field719[var5 + 1];
                            field719[var5++] = var240 & -1 - (0x1 << var241);
                            continue;
                        }
                        if (var384 == 4010) {
                            var5 -= 2;
                            int var242 = field719[var5];
                            int var243 = field719[var5 + 1];
                            field719[var5++] = (var242 & 0x1 << var243) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var384 == 4011) {
                            var5 -= 2;
                            int var244 = field719[var5];
                            int var245 = field719[var5 + 1];
                            field719[var5++] = var244 % var245;
                            continue;
                        }
                        if (var384 == 4012) {
                            var5 -= 2;
                            int var246 = field719[var5];
                            int var247 = field719[var5 + 1];
                            if (var246 == 0) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = (int) Math.pow((double) var246, (double) var247);
                            }
                            continue;
                        }
                        if (var384 == 4013) {
                            var5 -= 2;
                            int var248 = field719[var5];
                            int var249 = field719[var5 + 1];
                            if (var248 == 0) {
                                field719[var5++] = 0;
                            } else if (var249 == 0) {
                                field719[var5++] = Integer.MAX_VALUE;
                            } else {
                                field719[var5++] = (int) Math.pow((double) var248, 1.0D / (double) var249);
                            }
                            continue;
                        }
                        if (var384 == 4014) {
                            var5 -= 2;
                            int var250 = field719[var5];
                            int var251 = field719[var5 + 1];
                            field719[var5++] = var250 & var251;
                            continue;
                        }
                        if (var384 == 4015) {
                            var5 -= 2;
                            int var252 = field719[var5];
                            int var253 = field719[var5 + 1];
                            field719[var5++] = var252 | var253;
                            continue;
                        }
                    } else if (var384 < 4200) {
                        if (var384 == 4100) {
                            var6--;
                            String var254 = field722[var6];
                            var5--;
                            int var255 = field719[var5];
                            field722[var6++] = var254 + var255;
                            continue;
                        }
                        if (var384 == 4101) {
                            var6 -= 2;
                            String var256 = field722[var6];
                            String var257 = field722[var6 + 1];
                            field722[var6++] = var256 + var257;
                            continue;
                        }
                        if (var384 == 4102) {
                            var6--;
                            String var258 = field722[var6];
                            var5--;
                            int var259 = field719[var5];
                            field722[var6++] = var258 + class154.method1071(var259, true);
                            continue;
                        }
                        if (var384 == 4103) {
                            var6--;
                            String var260 = field722[var6];
                            field722[var6++] = var260.toLowerCase();
                            continue;
                        }
                        if (var384 == 4104) {
                            var5--;
                            int var261 = field719[var5];
                            long var262 = ((long) var261 + 11745L) * 86400000L;
                            field733.setTime(new Date(var262));
                            int var264 = field733.get(5);
                            int var265 = field733.get(2);
                            int var266 = field733.get(1);
                            field722[var6++] = var264 + "-" + field729[var265] + "-" + var266;
                            continue;
                        }
                        if (var384 == 4105) {
                            var6 -= 2;
                            String var267 = field722[var6];
                            String var268 = field722[var6 + 1];
                            if (Statics.field579.field29 != null && Statics.field579.field29.field2798) {
                                field722[var6++] = var268;
                                continue;
                            }
                            field722[var6++] = var267;
                            continue;
                        }
                        if (var384 == 4106) {
                            var5--;
                            int var269 = field719[var5];
                            field722[var6++] = Integer.toString(var269);
                            continue;
                        }
                        if (var384 == 4107) {
                            var6 -= 2;
                            int[] var270 = field719;
                            int var271 = var5++;
                            int var272 = class157.method173(field722[var6], field722[var6 + 1], client.field255);
                            byte var273;
                            if (var272 > 0) {
                                var273 = 1;
                            } else if (var272 < 0) {
                                var273 = -1;
                            } else {
                                var273 = 0;
                            }
                            var270[var271] = var273;
                            continue;
                        }
                        if (var384 == 4108) {
                            var6--;
                            String var274 = field722[var6];
                            var5 -= 2;
                            int var275 = field719[var5];
                            int var276 = field719[var5 + 1];
                            byte[] var277 = Statics.field2539.method2819(var276, 0);
                            class215 var278 = new class215(var277);
                            field719[var5++] = var278.method3532(var274, var275);
                            continue;
                        }
                        if (var384 == 4109) {
                            var6--;
                            String var279 = field722[var6];
                            var5 -= 2;
                            int var280 = field719[var5];
                            int var281 = field719[var5 + 1];
                            byte[] var282 = Statics.field2539.method2819(var281, 0);
                            class215 var283 = new class215(var282);
                            field719[var5++] = var283.method3538(var279, var280);
                            continue;
                        }
                        if (var384 == 4110) {
                            var6 -= 2;
                            String var284 = field722[var6];
                            String var285 = field722[var6 + 1];
                            var5--;
                            if (field719[var5] == 1) {
                                field722[var6++] = var284;
                            } else {
                                field722[var6++] = var285;
                            }
                            continue;
                        }
                        if (var384 == 4111) {
                            var6--;
                            String var286 = field722[var6];
                            field722[var6++] = class214.method3616(var286);
                            continue;
                        }
                        if (var384 == 4112) {
                            var6--;
                            String var287 = field722[var6];
                            var5--;
                            int var288 = field719[var5];
                            field722[var6++] = var287 + (char) var288;
                            continue;
                        }
                        if (var384 == 4113) {
                            var5--;
                            int var289 = field719[var5];
                            int[] var290 = field719;
                            int var291 = var5++;
                            char var292 = (char) var289;
                            boolean var293;
                            if (var292 >= ' ' && var292 <= '~') {
                                var293 = true;
                            } else if (var292 >= 160 && var292 <= 255) {
                                var293 = true;
                            } else if (var292 == 8364 || var292 == 338 || var292 == 8212 || var292 == 339 || var292 == 376) {
                                var293 = true;
                            } else {
                                var293 = false;
                            }
                            var290[var291] = var293 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4114) {
                            var5--;
                            int var294 = field719[var5];
                            field719[var5++] = class154.method2743((char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4115) {
                            var5--;
                            int var295 = field719[var5];
                            int[] var296 = field719;
                            int var297 = var5++;
                            char var298 = (char) var295;
                            boolean var299 = var298 >= 'A' && var298 <= 'Z' || var298 >= 'a' && var298 <= 'z';
                            var296[var297] = var299 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4116) {
                            var5--;
                            int var300 = field719[var5];
                            field719[var5++] = class154.method1861((char) var300) ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4117) {
                            var6--;
                            String var301 = field722[var6];
                            if (var301 == null) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = var301.length();
                            }
                            continue;
                        }
                        if (var384 == 4118) {
                            var6--;
                            String var302 = field722[var6];
                            var5 -= 2;
                            int var303 = field719[var5];
                            int var304 = field719[var5 + 1];
                            field722[var6++] = var302.substring(var303, var304);
                            continue;
                        }
                        if (var384 == 4119) {
                            var6--;
                            String var305 = field722[var6];
                            StringBuilder var306 = new StringBuilder(var305.length());
                            boolean var307 = false;
                            for (int var308 = 0; var308 < var305.length(); var308++) {
                                char var309 = var305.charAt(var308);
                                if (var309 == '<') {
                                    var307 = true;
                                } else if (var309 == '>') {
                                    var307 = false;
                                } else if (!var307) {
                                    var306.append(var309);
                                }
                            }
                            field722[var6++] = var306.toString();
                            continue;
                        }
                        if (var384 == 4120) {
                            var6--;
                            String var310 = field722[var6];
                            var5--;
                            int var311 = field719[var5];
                            field719[var5++] = var310.indexOf(var311);
                            continue;
                        }
                        if (var384 == 4121) {
                            var6 -= 2;
                            String var312 = field722[var6];
                            String var313 = field722[var6 + 1];
                            var5--;
                            int var314 = field719[var5];
                            field719[var5++] = var312.indexOf(var313, var314);
                            continue;
                        }
                    } else if (var384 < 4300) {
                        if (var384 == 4200) {
                            var5--;
                            int var315 = field719[var5];
                            field722[var6++] = class47.method1037(var315).field1040;
                            continue;
                        }
                        if (var384 == 4201) {
                            var5 -= 2;
                            int var316 = field719[var5];
                            int var317 = field719[var5 + 1];
                            class47 var318 = class47.method1037(var316);
                            if (var317 >= 1 && var317 <= 5 && var318.field1060[var317 - 1] != null) {
                                field722[var6++] = var318.field1060[var317 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 4202) {
                            var5 -= 2;
                            int var319 = field719[var5];
                            int var320 = field719[var5 + 1];
                            class47 var321 = class47.method1037(var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field1055[var320 - 1] != null) {
                                field722[var6++] = var321.field1055[var320 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var384 == 4203) {
                            var5--;
                            int var322 = field719[var5];
                            field719[var5++] = class47.method1037(var322).field1049;
                            continue;
                        }
                        if (var384 == 4204) {
                            var5--;
                            int var323 = field719[var5];
                            field719[var5++] = class47.method1037(var323).field1051 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4205) {
                            var5--;
                            int var324 = field719[var5];
                            class47 var325 = class47.method1037(var324);
                            if (var325.field1057 == -1 && var325.field1070 >= 0) {
                                field719[var5++] = var325.field1070;
                                continue;
                            }
                            field719[var5++] = var324;
                            continue;
                        }
                        if (var384 == 4206) {
                            var5--;
                            int var326 = field719[var5];
                            class47 var327 = class47.method1037(var326);
                            if (var327.field1057 >= 0 && var327.field1070 >= 0) {
                                field719[var5++] = var327.field1070;
                                continue;
                            }
                            field719[var5++] = var326;
                            continue;
                        }
                        if (var384 == 4207) {
                            var5--;
                            int var328 = field719[var5];
                            field719[var5++] = class47.method1037(var328).field1053 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4210) {
                            var6--;
                            String var329 = field722[var6];
                            var5--;
                            int var330 = field719[var5];
                            boolean var332 = var330 == 1;
                            String var333 = var329.toLowerCase();
                            short[] var334 = new short[16];
                            int var335 = 0;
                            int var336 = 0;
                            while (true) {
                                if (var336 >= Statics.field1033) {
                                    Statics.field197 = var334;
                                    Statics.field1869 = 0;
                                    Statics.field1842 = var335;
                                    String[] var340 = new String[Statics.field1842];
                                    for (int var341 = 0; var341 < Statics.field1842; var341++) {
                                        var340[var341] = class47.method1037(var334[var341]).field1040;
                                    }
                                    short[] var342 = Statics.field197;
                                    class116.method1313(var340, var342, 0, var340.length - 1);
                                    break;
                                }
                                class47 var337 = class47.method1037(var336);
                                if ((!var332 || var337.field1078) && var337.field1057 == -1 && var337.field1040.toLowerCase().indexOf(var333) != -1) {
                                    if (var335 >= 250) {
                                        Statics.field1842 = -1;
                                        Statics.field197 = null;
                                        break;
                                    }
                                    if (var335 >= var334.length) {
                                        short[] var338 = new short[var334.length * 2];
                                        for (int var339 = 0; var339 < var335; var339++) {
                                            var338[var339] = var334[var339];
                                        }
                                        var334 = var338;
                                    }
                                    var334[var335++] = (short) var336;
                                }
                                var336++;
                            }
                            field719[var5++] = Statics.field1842;
                            continue;
                        }
                        if (var384 == 4211) {
                            if (Statics.field197 != null && Statics.field1869 < Statics.field1842) {
                                field719[var5++] = Statics.field197[++Statics.field1869 - 1] & 0xFFFF;
                                continue;
                            }
                            field719[var5++] = -1;
                            continue;
                        }
                        if (var384 == 4212) {
                            Statics.field1869 = 0;
                            continue;
                        }
                    } else if (var384 < 5100) {
                        if (var384 == 5000) {
                            field719[var5++] = client.field333;
                            continue;
                        }
                        if (var384 == 5001) {
                            var5 -= 3;
                            client.field333 = field719[var5];
                            Statics.field1377 = class122.method709(field719[var5 + 1]);
                            if (Statics.field1377 == null) {
                                Statics.field1377 = class122.field1960;
                            }
                            client.field473 = field719[var5 + 2];
                            client.field397.method2386(225);
                            client.field397.method2112(client.field333);
                            client.field397.method2112(Statics.field1377.field1957);
                            client.field397.method2112(client.field473);
                            continue;
                        }
                        if (var384 == 5002) {
                            var6--;
                            String var343 = field722[var6];
                            var5 -= 2;
                            int var344 = field719[var5];
                            int var345 = field719[var5 + 1];
                            client.field397.method2386(128);
                            client.field397.method2112(class111.method1876(var343) + 2);
                            client.field397.method2247(var343);
                            client.field397.method2112(var344 - 1);
                            client.field397.method2112(var345);
                            continue;
                        }
                        if (var384 == 5003) {
                            var5 -= 2;
                            int var346 = field719[var5];
                            int var347 = field719[var5 + 1];
                            class26 var348 = (class26) class11.field149.get(var346);
                            class33 var349 = var348.method541(var347);
                            if (var349 == null) {
                                field719[var5++] = -1;
                                field719[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field719[var5++] = var349.field714;
                                field719[var5++] = var349.field711;
                                field722[var6++] = var349.field708 == null ? "" : var349.field708;
                                field722[var6++] = var349.field712 == null ? "" : var349.field712;
                                field722[var6++] = var349.field713 == null ? "" : var349.field713;
                            }
                            continue;
                        }
                        if (var384 == 5004) {
                            var5--;
                            int var351 = field719[var5];
                            class33 var352 = (class33) class11.field150.method3304((long) var351);
                            if (var352 == null) {
                                field719[var5++] = -1;
                                field719[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field719[var5++] = var352.field716;
                                field719[var5++] = var352.field711;
                                field722[var6++] = var352.field708 == null ? "" : var352.field708;
                                field722[var6++] = var352.field712 == null ? "" : var352.field712;
                                field722[var6++] = var352.field713 == null ? "" : var352.field713;
                            }
                            continue;
                        }
                        if (var384 == 5005) {
                            if (Statics.field1377 == null) {
                                field719[var5++] = -1;
                            } else {
                                field719[var5++] = Statics.field1377.field1957;
                            }
                            continue;
                        }
                        if (var384 == 5008) {
                            var6--;
                            String var354 = field722[var6];
                            var5--;
                            int var355 = field719[var5];
                            String var356 = var354.toLowerCase();
                            byte var357 = 0;
                            if (var356.startsWith(class148.field2377)) {
                                var357 = 0;
                                var354 = var354.substring(class148.field2377.length());
                            } else if (var356.startsWith(class148.field2379)) {
                                var357 = 1;
                                var354 = var354.substring(class148.field2379.length());
                            } else if (var356.startsWith(class148.field2381)) {
                                var357 = 2;
                                var354 = var354.substring(class148.field2381.length());
                            } else if (var356.startsWith(class148.field2430)) {
                                var357 = 3;
                                var354 = var354.substring(class148.field2430.length());
                            } else if (var356.startsWith(class148.field2385)) {
                                var357 = 4;
                                var354 = var354.substring(class148.field2385.length());
                            } else if (var356.startsWith(class148.field2387)) {
                                var357 = 5;
                                var354 = var354.substring(class148.field2387.length());
                            } else if (var356.startsWith(class148.field2389)) {
                                var357 = 6;
                                var354 = var354.substring(class148.field2389.length());
                            } else if (var356.startsWith(class148.field2391)) {
                                var357 = 7;
                                var354 = var354.substring(class148.field2391.length());
                            } else if (var356.startsWith(class148.field2452)) {
                                var357 = 8;
                                var354 = var354.substring(class148.field2452.length());
                            } else if (var356.startsWith(class148.field2395)) {
                                var357 = 9;
                                var354 = var354.substring(class148.field2395.length());
                            } else if (var356.startsWith(class148.field2397)) {
                                var357 = 10;
                                var354 = var354.substring(class148.field2397.length());
                            } else if (var356.startsWith(class148.field2399)) {
                                var357 = 11;
                                var354 = var354.substring(class148.field2399.length());
                            } else if (client.field255 != 0) {
                                if (var356.startsWith(class148.field2378)) {
                                    var357 = 0;
                                    var354 = var354.substring(class148.field2378.length());
                                } else if (var356.startsWith(class148.field2376)) {
                                    var357 = 1;
                                    var354 = var354.substring(class148.field2376.length());
                                } else if (var356.startsWith(class148.field2382)) {
                                    var357 = 2;
                                    var354 = var354.substring(class148.field2382.length());
                                } else if (var356.startsWith(class148.field2406)) {
                                    var357 = 3;
                                    var354 = var354.substring(class148.field2406.length());
                                } else if (var356.startsWith(class148.field2386)) {
                                    var357 = 4;
                                    var354 = var354.substring(class148.field2386.length());
                                } else if (var356.startsWith(class148.field2388)) {
                                    var357 = 5;
                                    var354 = var354.substring(class148.field2388.length());
                                } else if (var356.startsWith(class148.field2467)) {
                                    var357 = 6;
                                    var354 = var354.substring(class148.field2467.length());
                                } else if (var356.startsWith(class148.field2392)) {
                                    var357 = 7;
                                    var354 = var354.substring(class148.field2392.length());
                                } else if (var356.startsWith(class148.field2418)) {
                                    var357 = 8;
                                    var354 = var354.substring(class148.field2418.length());
                                } else if (var356.startsWith(class148.field2396)) {
                                    var357 = 9;
                                    var354 = var354.substring(class148.field2396.length());
                                } else if (var356.startsWith(class148.field2250)) {
                                    var357 = 10;
                                    var354 = var354.substring(class148.field2250.length());
                                } else if (var356.startsWith(class148.field2269)) {
                                    var357 = 11;
                                    var354 = var354.substring(class148.field2269.length());
                                }
                            }
                            String var358 = var354.toLowerCase();
                            byte var359 = 0;
                            if (var358.startsWith(class148.field2456)) {
                                var359 = 1;
                                var354 = var354.substring(class148.field2456.length());
                            } else if (var358.startsWith(class148.field2403)) {
                                var359 = 2;
                                var354 = var354.substring(class148.field2403.length());
                            } else if (var358.startsWith(class148.field2402)) {
                                var359 = 3;
                                var354 = var354.substring(class148.field2402.length());
                            } else if (var358.startsWith(class148.field2407)) {
                                var359 = 4;
                                var354 = var354.substring(class148.field2407.length());
                            } else if (var358.startsWith(class148.field2400)) {
                                var359 = 5;
                                var354 = var354.substring(class148.field2400.length());
                            } else if (client.field255 != 0) {
                                if (var358.startsWith(class148.field2404)) {
                                    var359 = 1;
                                    var354 = var354.substring(class148.field2404.length());
                                } else if (var358.startsWith(class148.field2244)) {
                                    var359 = 2;
                                    var354 = var354.substring(class148.field2244.length());
                                } else if (var358.startsWith(class148.field2375)) {
                                    var359 = 3;
                                    var354 = var354.substring(class148.field2375.length());
                                } else if (var358.startsWith(class148.field2408)) {
                                    var359 = 4;
                                    var354 = var354.substring(class148.field2408.length());
                                } else if (var358.startsWith(class148.field2410)) {
                                    var359 = 5;
                                    var354 = var354.substring(class148.field2410.length());
                                }
                            }
                            client.field397.method2386(19);
                            client.field397.method2112(0);
                            int var360 = client.field397.field1894;
                            client.field397.method2112(var355);
                            client.field397.method2112(var357);
                            client.field397.method2112(var359);
                            class213.method597(client.field397, var354);
                            client.field397.method2137(client.field397.field1894 - var360);
                            continue;
                        }
                        if (var384 == 5009) {
                            var6 -= 2;
                            String var361 = field722[var6];
                            String var362 = field722[var6 + 1];
                            client.field397.method2386(28);
                            client.field397.method2201(0);
                            int var363 = client.field397.field1894;
                            client.field397.method2247(var361);
                            class213.method597(client.field397, var362);
                            client.field397.method2123(client.field397.field1894 - var363);
                            continue;
                        }
                        if (var384 == 5015) {
                            String var364;
                            if (Statics.field579 == null || Statics.field579.field33 == null) {
                                var364 = "";
                            } else {
                                var364 = Statics.field579.field33;
                            }
                            field722[var6++] = var364;
                            continue;
                        }
                        if (var384 == 5016) {
                            field719[var5++] = client.field473;
                            continue;
                        }
                        if (var384 == 5017) {
                            var5--;
                            int var365 = field719[var5];
                            field719[var5++] = class11.method1960(var365);
                            continue;
                        }
                        if (var384 == 5018) {
                            var5--;
                            int var366 = field719[var5];
                            field719[var5++] = class11.method2765(var366);
                            continue;
                        }
                        if (var384 == 5019) {
                            var5--;
                            int var367 = field719[var5];
                            int[] var368 = field719;
                            int var369 = var5++;
                            class33 var370 = (class33) class11.field150.method3304((long) var367);
                            int var371;
                            if (var370 == null) {
                                var371 = -1;
                            } else if (class11.field151.field2991 == var370.field2995) {
                                var371 = -1;
                            } else {
                                var371 = ((class33) var370.field2995).field714;
                            }
                            var368[var369] = var371;
                            continue;
                        }
                        if (var384 == 5020) {
                            var6--;
                            String var372 = field722[var6];
                            client.method539(var372);
                            continue;
                        }
                        if (var384 == 5021) {
                            var6--;
                            client.field309 = field722[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var384 == 5022) {
                            field722[var6++] = client.field309;
                            continue;
                        }
                    }
                }
                if (var384 < 5400) {
                    if (var384 == 5306) {
                        int[] var373 = field719;
                        int var374 = var5++;
                        int var375 = client.field499 ? 2 : 1;
                        var373[var374] = var375;
                        continue;
                    }
                    if (var384 == 5307) {
                        var5--;
                        int var376 = field719[var5];
                        if (var376 != 1 && var376 != 2) {
                            continue;
                        }
                        client.field467 = 0L;
                        if (var376 >= 2) {
                            client.field499 = true;
                        } else {
                            client.field499 = false;
                        }
                        client.method1333();
                        if (client.field257 >= 25) {
                            client.method918();
                        }
                        class136.field2089 = true;
                        continue;
                    }
                    if (var384 == 5308) {
                        field719[var5++] = Statics.field1015.field128;
                        continue;
                    }
                    if (var384 == 5309) {
                        var5--;
                        int var377 = field719[var5];
                        if (var377 == 1 || var377 == 2) {
                            Statics.field1015.field128 = var377;
                            Statics.method537();
                        }
                        continue;
                    }
                }
                if (var384 >= 5600 || var384 != 5504) {
                    if (var384 < 6300) {
                        if (var384 == 6200) {
                            var5 -= 2;
                            client.field490 = (short) field719[var5];
                            if (client.field490 <= 0) {
                                client.field490 = 256;
                            }
                            client.field511 = (short) field719[var5 + 1];
                            if (client.field511 <= 0) {
                                client.field511 = 205;
                            }
                            continue;
                        }
                        if (var384 == 6201) {
                            var5 -= 2;
                            client.field390 = (short) field719[var5];
                            if (client.field390 <= 0) {
                                client.field390 = 256;
                            }
                            client.field513 = (short) field719[var5 + 1];
                            if (client.field513 <= 0) {
                                client.field513 = 320;
                            }
                            continue;
                        }
                        if (var384 == 6202) {
                            var5 -= 4;
                            client.field514 = (short) field719[var5];
                            if (client.field514 <= 0) {
                                client.field514 = 1;
                            }
                            client.field515 = (short) field719[var5 + 1];
                            if (client.field515 <= 0) {
                                client.field515 = 32767;
                            } else if (client.field515 < client.field514) {
                                client.field515 = client.field514;
                            }
                            client.field419 = (short) field719[var5 + 2];
                            if (client.field419 <= 0) {
                                client.field419 = 1;
                            }
                            client.field517 = (short) field719[var5 + 3];
                            if (client.field517 <= 0) {
                                client.field517 = 32767;
                            } else if (client.field517 < client.field419) {
                                client.field517 = client.field419;
                            }
                            continue;
                        }
                        if (var384 == 6203) {
                            if (client.field424 == null) {
                                field719[var5++] = -1;
                                field719[var5++] = -1;
                            } else {
                                client.method602(0, 0, client.field424.field2653, client.field424.field2654, false);
                                field719[var5++] = client.field322;
                                field719[var5++] = client.field521;
                            }
                            continue;
                        }
                        if (var384 == 6204) {
                            field719[var5++] = client.field390;
                            field719[var5++] = client.field513;
                            continue;
                        }
                        if (var384 == 6205) {
                            field719[var5++] = client.field490;
                            field719[var5++] = client.field511;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var378 = field719[var5];
                int var379 = field719[var5 + 1];
                if (!client.field526) {
                    client.field334 = var378;
                    client.field330 = var379;
                }
            }
        } catch (Exception var383) {
            StringBuilder var381 = new StringBuilder(30);
            var381.append("").append(var4.field3006).append(" ");
            for (int var382 = field726 - 1; var382 >= 0; var382--) {
                var381.append("").append(field727[var382].field190.field3006).append(" ");
            }
            var381.append("").append(var10);
            class140.method2489(var381.toString(), var383);
        }
    }

    @ObfuscatedName("cw.e(II)V")
    public static void method2052(int arg0) {
        if (arg0 == -1 || !class164.method2749(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2726[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2717 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field5 = var3.field2717;
                method152(var4, 2000000);
            }
        }
    }
}
