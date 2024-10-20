package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ar")
public class class37 {

    @ObfuscatedName("ar.x")
    public static int[] field783 = new int[5];

    @ObfuscatedName("ar.y")
    public static int[][] field780 = new int[5][5000];

    @ObfuscatedName("ar.r")
    public static int[] field781 = new int[1000];

    @ObfuscatedName("ar.c")
    public static String[] field790 = new String[1000];

    @ObfuscatedName("ar.l")
    public static int field775 = 0;

    @ObfuscatedName("ar.u")
    public static class15[] field784 = new class15[50];

    @ObfuscatedName("ar.w")
    public static Calendar field786 = Calendar.getInstance();

    @ObfuscatedName("ar.z")
    public static final String[] field787 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ar.k")
    public static int field788 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.b(Lb;B)V")
    public static void method2222(class1 arg0) {
        method1948(arg0, 200000);
    }

    @ObfuscatedName("cq.g(Lb;IB)V")
    public static void method1948(class1 arg0, int arg1) {
        Object[] var2 = arg0.field13;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method589(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field598;
        int[] var9 = var4.field591;
        byte var10 = -1;
        field775 = 0;
        try {
            Statics.field777 = new int[var4.field593];
            int var11 = 0;
            Statics.field779 = new String[var4.field594];
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
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2749;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2750;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2749;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2750;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field777[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field779[var12++] = var15;
                }
            }
            int var16 = 0;
            field788 = arg0.field3;
            label3016: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var464 = var8[var7];
                if (var464 < 100) {
                    if (var464 == 0) {
                        field781[var5++] = var9[var7];
                        continue;
                    }
                    if (var464 == 1) {
                        int var17 = var9[var7];
                        field781[var5++] = class177.field2897[var17];
                        continue;
                    }
                    if (var464 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2897[var18] = field781[var5];
                        client.method41(var18);
                        continue;
                    }
                    if (var464 == 3) {
                        field790[var6++] = var4.field592[var7];
                        continue;
                    }
                    if (var464 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var464 == 7) {
                        var5 -= 2;
                        if (field781[var5 + 1] != field781[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var464 == 8) {
                        var5 -= 2;
                        if (field781[var5 + 1] == field781[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var464 == 9) {
                        var5 -= 2;
                        if (field781[var5] < field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var464 == 10) {
                        var5 -= 2;
                        if (field781[var5] > field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var464 == 21) {
                        if (field775 == 0) {
                            return;
                        }
                        class15 var19 = field784[--field775];
                        var4 = var19.field214;
                        var8 = var4.field598;
                        var9 = var4.field591;
                        var7 = var19.field207;
                        Statics.field777 = var19.field208;
                        Statics.field779 = var19.field209;
                        continue;
                    }
                    if (var464 == 25) {
                        int var20 = var9[var7];
                        field781[var5++] = class177.method89(var20);
                        continue;
                    }
                    if (var464 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field781[var5];
                        class48 var23 = (class48) class48.field1043.method3495((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1045.method3037(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method957(new class120(var25));
                            }
                            class48.field1043.method3490(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1044;
                        int var29 = var24.field1046;
                        int var30 = var24.field1048;
                        int var31 = class177.field2899[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class177.field2897[var28] = class177.field2897[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var464 == 31) {
                        var5 -= 2;
                        if (field781[var5] <= field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var464 == 32) {
                        var5 -= 2;
                        if (field781[var5] >= field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var464 == 33) {
                        field781[var5++] = Statics.field777[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var464 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field777[var10001] = field781[var5];
                        continue;
                    }
                    if (var464 == 35) {
                        field790[var6++] = Statics.field779[var9[var7]];
                        continue;
                    }
                    if (var464 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field779[var10001] = field790[var6];
                        continue;
                    }
                    if (var464 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class164.method2951(field790, var6, var33);
                        field790[var6++] = var34;
                        continue;
                    }
                    if (var464 == 38) {
                        var5--;
                        continue;
                    }
                    if (var464 == 39) {
                        var6--;
                        continue;
                    }
                    if (var464 == 40) {
                        int var35 = var9[var7];
                        class23 var36 = class23.method589(var35);
                        int[] var37 = new int[var36.field593];
                        String[] var38 = new String[var36.field594];
                        for (int var39 = 0; var39 < var36.field589; var39++) {
                            var37[var39] = field781[var5 - var36.field589 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field596; var40++) {
                            var38[var40] = field790[var6 - var36.field596 + var40];
                        }
                        var5 -= var36.field589;
                        var6 -= var36.field596;
                        class15 var41 = new class15();
                        var41.field214 = var4;
                        var41.field207 = var7;
                        var41.field208 = Statics.field777;
                        var41.field209 = Statics.field779;
                        field784[++field775 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field598;
                        var9 = var36.field591;
                        var7 = -1;
                        Statics.field777 = var37;
                        Statics.field779 = var38;
                        continue;
                    }
                    if (var464 == 42) {
                        field781[var5++] = Statics.field2125.method192(var9[var7]);
                        continue;
                    }
                    if (var464 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2125.method216(var10001, field781[var5]);
                        continue;
                    }
                    if (var464 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field781[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field783[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label3016;
                                }
                                field780[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field781[var5];
                        if (var48 >= 0 && var48 < field783[var47]) {
                            field781[var5++] = field780[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field781[var5];
                        if (var50 >= 0 && var50 < field783[var49]) {
                            field780[var49][var50] = field781[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 47) {
                        String var51 = Statics.field2125.method190(var9[var7]);
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field790[var6++] = var51;
                        continue;
                    }
                    if (var464 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2125.method189(var10001, field790[var6]);
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var464 < 1000) {
                    if (var464 == 100) {
                        var5 -= 3;
                        int var53 = field781[var5];
                        int var54 = field781[var5 + 1];
                        int var55 = field781[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var56 = class174.method2976(var53);
                        if (var56.field2873 == null) {
                            var56.field2873 = new class174[var55 + 1];
                        }
                        if (var56.field2873.length <= var55) {
                            class174[] var57 = new class174[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2873.length; var58++) {
                                var57[var58] = var56.field2873[var58];
                            }
                            var56.field2873 = var57;
                        }
                        if (var55 > 0 && var56.field2873[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class174 var59 = new class174();
                        var59.field2834 = var54;
                        var59.field2778 = var59.field2749 = var56.field2749;
                        var59.field2750 = var55;
                        var59.field2742 = true;
                        var56.field2873[var55] = var59;
                        if (var52) {
                            Statics.field3160 = var59;
                        } else {
                            Statics.field782 = var59;
                        }
                        client.method38(var56);
                        continue;
                    }
                    if (var464 == 101) {
                        class174 var60 = var52 ? Statics.field3160 : Statics.field782;
                        class174 var61 = class174.method2976(var60.field2749);
                        var61.field2873[var60.field2750] = null;
                        client.method38(var61);
                        continue;
                    }
                    if (var464 == 102) {
                        var5--;
                        class174 var62 = class174.method2976(field781[var5]);
                        var62.field2873 = null;
                        client.method38(var62);
                        continue;
                    }
                    if (var464 == 200) {
                        var5 -= 2;
                        int var63 = field781[var5];
                        int var64 = field781[var5 + 1];
                        class174 var65 = class174.method3018(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field781[var5++] = 1;
                            if (var52) {
                                Statics.field3160 = var65;
                            } else {
                                Statics.field782 = var65;
                            }
                            continue;
                        }
                        field781[var5++] = 0;
                        continue;
                    }
                    if (var464 == 201) {
                        var5--;
                        class174 var66 = class174.method2976(field781[var5]);
                        if (var66 == null) {
                            field781[var5++] = 0;
                        } else {
                            field781[var5++] = 1;
                            if (var52) {
                                Statics.field3160 = var66;
                            } else {
                                Statics.field782 = var66;
                            }
                        }
                        continue;
                    }
                } else if (var464 >= 1000 && var464 < 1100 || var464 >= 2000 && var464 < 2100) {
                    int var67 = -1;
                    class174 var68;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var5--;
                        var67 = field781[var5];
                        var68 = class174.method2976(var67);
                    } else {
                        var68 = var52 ? Statics.field3160 : Statics.field782;
                    }
                    if (var464 == 1000) {
                        var5 -= 4;
                        var68.field2763 = field781[var5];
                        var68.field2785 = field781[var5 + 1];
                        var68.field2754 = field781[var5 + 2];
                        var68.field2755 = field781[var5 + 3];
                        client.method38(var68);
                        client.method779(var68);
                        if (var67 != -1 && var68.field2834 == 0) {
                            client.method120(Statics.field2751[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var464 == 1001) {
                        var5 -= 4;
                        var68.field2760 = field781[var5];
                        var68.field2766 = field781[var5 + 1];
                        var68.field2819 = field781[var5 + 2];
                        var68.field2757 = field781[var5 + 3];
                        client.method38(var68);
                        client.method779(var68);
                        if (var67 != -1 && var68.field2834 == 0) {
                            client.method120(Statics.field2751[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var464 == 1003) {
                        var5--;
                        boolean var69 = field781[var5] == 1;
                        if (var68.field2883 != var69) {
                            var68.field2883 = var69;
                            client.method38(var68);
                        }
                        continue;
                    }
                    if (var464 == 1005) {
                        var5--;
                        var68.field2762 = field781[var5] == 1;
                        continue;
                    }
                    if (var464 == 1006) {
                        var5--;
                        var68.field2738 = field781[var5] == 1;
                        continue;
                    }
                } else if (!(var464 < 1100 || var464 >= 1200) || !(var464 < 2100 || var464 >= 2200)) {
                    int var70 = -1;
                    class174 var71;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var5--;
                        var70 = field781[var5];
                        var71 = class174.method2976(var70);
                    } else {
                        var71 = var52 ? Statics.field3160 : Statics.field782;
                    }
                    if (var464 == 1100) {
                        var5 -= 2;
                        var71.field2864 = field781[var5];
                        if (var71.field2864 > var71.field2772 - var71.field2764) {
                            var71.field2864 = var71.field2772 - var71.field2764;
                        }
                        if (var71.field2864 < 0) {
                            var71.field2864 = 0;
                        }
                        var71.field2771 = field781[var5 + 1];
                        if (var71.field2771 > var71.field2773 - var71.field2765) {
                            var71.field2771 = var71.field2773 - var71.field2765;
                        }
                        if (var71.field2771 < 0) {
                            var71.field2771 = 0;
                        }
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1101) {
                        var5--;
                        var71.field2774 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1102) {
                        var5--;
                        var71.field2851 = field781[var5] == 1;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1103) {
                        var5--;
                        var71.field2831 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1104) {
                        var5--;
                        var71.field2782 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1105) {
                        var5--;
                        var71.field2784 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1106) {
                        var5--;
                        var71.field2852 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1107) {
                        var5--;
                        var71.field2854 = field781[var5] == 1;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1108) {
                        var71.field2792 = 1;
                        var5--;
                        var71.field2793 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1109) {
                        var5 -= 6;
                        var71.field2798 = field781[var5];
                        var71.field2799 = field781[var5 + 1];
                        var71.field2840 = field781[var5 + 2];
                        var71.field2801 = field781[var5 + 3];
                        var71.field2845 = field781[var5 + 4];
                        var71.field2803 = field781[var5 + 5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1110) {
                        var5--;
                        int var72 = field781[var5];
                        if (var71.field2753 != var72) {
                            var71.field2753 = var72;
                            var71.field2871 = 0;
                            var71.field2856 = 0;
                            client.method38(var71);
                        }
                        continue;
                    }
                    if (var464 == 1111) {
                        var5--;
                        var71.field2806 = field781[var5] == 1;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1112) {
                        var6--;
                        String var73 = field790[var6];
                        if (!var73.equals(var71.field2809)) {
                            var71.field2809 = var73;
                            client.method38(var71);
                        }
                        continue;
                    }
                    if (var464 == 1113) {
                        var5--;
                        var71.field2839 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1114) {
                        var5 -= 3;
                        var71.field2812 = field781[var5];
                        var71.field2862 = field781[var5 + 1];
                        var71.field2814 = field781[var5 + 2];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1115) {
                        var5--;
                        var71.field2800 = field781[var5] == 1;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1116) {
                        var5--;
                        var71.field2788 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1117) {
                        var5--;
                        var71.field2739 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1118) {
                        var5--;
                        var71.field2790 = field781[var5] == 1;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1119) {
                        var5--;
                        var71.field2868 = field781[var5] == 1;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1120) {
                        var5 -= 2;
                        var71.field2772 = field781[var5];
                        var71.field2773 = field781[var5 + 1];
                        client.method38(var71);
                        if (var70 != -1 && var71.field2834 == 0) {
                            client.method120(Statics.field2751[var70 >> 16], var71, false);
                        }
                        continue;
                    }
                    if (var464 == 1121) {
                        int var74 = var71.field2749;
                        int var75 = var71.field2750;
                        client.field332.method2611(126);
                        client.field332.method2525(var75);
                        client.field332.method2332(var74);
                        client.field452 = var71;
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1122) {
                        var5--;
                        var71.field2758 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1123) {
                        var5--;
                        var71.field2756 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1124) {
                        var5--;
                        var71.field2781 = field781[var5];
                        client.method38(var71);
                        continue;
                    }
                    if (var464 == 1125) {
                        var5--;
                        int var76 = field781[var5];
                        class83 var77 = (class83) class110.method2955(class83.method3140(), var76);
                        if (var77 != null) {
                            var71.field2779 = var77;
                            client.method38(var71);
                        }
                        continue;
                    }
                } else if (var464 >= 1200 && var464 < 1300 || var464 >= 2200 && var464 < 2300) {
                    class174 var78;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var5--;
                        var78 = class174.method2976(field781[var5]);
                    } else {
                        var78 = var52 ? Statics.field3160 : Statics.field782;
                    }
                    client.method38(var78);
                    if (var464 == 1200 || var464 == 1205 || var464 == 1212) {
                        var5 -= 2;
                        int var79 = field781[var5];
                        int var80 = field781[var5 + 1];
                        var78.field2869 = var79;
                        var78.field2872 = var80;
                        class52 var81 = class52.method727(var79);
                        var78.field2840 = var81.field1092;
                        var78.field2801 = var81.field1084;
                        var78.field2845 = var81.field1094;
                        var78.field2798 = var81.field1090;
                        var78.field2799 = var81.field1096;
                        var78.field2803 = var81.field1107;
                        if (var464 == 1205) {
                            var78.field2807 = 0;
                        } else if (var464 == 1212 | var81.field1097 == 1) {
                            var78.field2807 = 1;
                        } else {
                            var78.field2807 = 2;
                        }
                        if (var78.field2804 > 0) {
                            var78.field2803 = var78.field2803 * 32 / var78.field2804;
                        } else if (var78.field2760 > 0) {
                            var78.field2803 = var78.field2803 * 32 / var78.field2760;
                        }
                        continue;
                    }
                    if (var464 == 1201) {
                        var78.field2792 = 2;
                        var5--;
                        var78.field2793 = field781[var5];
                        continue;
                    }
                    if (var464 == 1202) {
                        var78.field2792 = 3;
                        var78.field2793 = Statics.field2263.field50.method3259();
                        continue;
                    }
                } else if (var464 >= 1300 && var464 < 1400 || var464 >= 2300 && var464 < 2400) {
                    class174 var82;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var5--;
                        var82 = class174.method2976(field781[var5]);
                    } else {
                        var82 = var52 ? Statics.field3160 : Statics.field782;
                    }
                    if (var464 == 1300) {
                        var5--;
                        int var83 = field781[var5] - 1;
                        if (var83 >= 0 && var83 <= 9) {
                            var6--;
                            var82.method3181(var83, field790[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var464 == 1301) {
                        var5 -= 2;
                        int var84 = field781[var5];
                        int var85 = field781[var5 + 1];
                        var82.field2811 = class174.method3018(var84, var85);
                        continue;
                    }
                    if (var464 == 1302) {
                        var5--;
                        var82.field2827 = field781[var5] == 1;
                        continue;
                    }
                    if (var464 == 1303) {
                        var5--;
                        var82.field2825 = field781[var5];
                        continue;
                    }
                    if (var464 == 1304) {
                        var5--;
                        var82.field2826 = field781[var5];
                        continue;
                    }
                    if (var464 == 1305) {
                        var6--;
                        var82.field2761 = field790[var6];
                        continue;
                    }
                    if (var464 == 1306) {
                        var6--;
                        var82.field2870 = field790[var6];
                        continue;
                    }
                    if (var464 == 1307) {
                        var82.field2823 = null;
                        continue;
                    }
                } else {
                    if (var464 >= 1400 && var464 < 1500 || var464 >= 2400 && var464 < 2500) {
                        class174 var86;
                        if (var464 >= 2000) {
                            var464 -= 1000;
                            var5--;
                            var86 = class174.method2976(field781[var5]);
                        } else {
                            var86 = var52 ? Statics.field3160 : Statics.field782;
                        }
                        var6--;
                        String var87 = field790[var6];
                        int[] var88 = null;
                        if (var87.length() > 0 && var87.charAt(var87.length() - 1) == 'Y') {
                            var5--;
                            int var89 = field781[var5];
                            if (var89 > 0) {
                                var88 = new int[var89];
                                while (var89-- > 0) {
                                    var5--;
                                    var88[var89] = field781[var5];
                                }
                            }
                            var87 = var87.substring(0, var87.length() - 1);
                        }
                        Object[] var90 = new Object[var87.length() + 1];
                        for (int var91 = var90.length - 1; var91 >= 1; var91--) {
                            if (var87.charAt(var91 - 1) == 's') {
                                var6--;
                                var90[var91] = field790[var6];
                            } else {
                                var5--;
                                var90[var91] = Integer.valueOf(field781[var5]);
                            }
                        }
                        var5--;
                        int var92 = field781[var5];
                        if (var92 == -1) {
                            var90 = null;
                        } else {
                            var90[0] = Integer.valueOf(var92);
                        }
                        if (var464 == 1400) {
                            var86.field2828 = var90;
                        }
                        if (var464 == 1401) {
                            var86.field2876 = var90;
                        }
                        if (var464 == 1402) {
                            var86.field2833 = var90;
                        }
                        if (var464 == 1403) {
                            var86.field2835 = var90;
                        }
                        if (var464 == 1404) {
                            var86.field2837 = var90;
                        }
                        if (var464 == 1405) {
                            var86.field2770 = var90;
                        }
                        if (var464 == 1406) {
                            var86.field2841 = var90;
                        }
                        if (var464 == 1407) {
                            var86.field2842 = var90;
                            var86.field2843 = var88;
                        }
                        if (var464 == 1408) {
                            var86.field2848 = var90;
                        }
                        if (var464 == 1409) {
                            var86.field2849 = var90;
                        }
                        if (var464 == 1410) {
                            var86.field2805 = var90;
                        }
                        if (var464 == 1411) {
                            var86.field2759 = var90;
                        }
                        if (var464 == 1412) {
                            var86.field2865 = var90;
                        }
                        if (var464 == 1414) {
                            var86.field2844 = var90;
                            var86.field2882 = var88;
                        }
                        if (var464 == 1415) {
                            var86.field2847 = var90;
                            var86.field2813 = var88;
                        }
                        if (var464 == 1416) {
                            var86.field2748 = var90;
                        }
                        if (var464 == 1417) {
                            var86.field2838 = var90;
                        }
                        if (var464 == 1418) {
                            var86.field2741 = var90;
                        }
                        if (var464 == 1419) {
                            var86.field2808 = var90;
                        }
                        if (var464 == 1420) {
                            var86.field2853 = var90;
                        }
                        if (var464 == 1421) {
                            var86.field2878 = var90;
                        }
                        if (var464 == 1422) {
                            var86.field2855 = var90;
                        }
                        if (var464 == 1423) {
                            var86.field2836 = var90;
                        }
                        if (var464 == 1424) {
                            var86.field2857 = var90;
                        }
                        if (var464 == 1425) {
                            var86.field2859 = var90;
                        }
                        if (var464 == 1426) {
                            var86.field2860 = var90;
                        }
                        if (var464 == 1427) {
                            var86.field2858 = var90;
                        }
                        var86.field2768 = true;
                        continue;
                    }
                    if (var464 < 1600) {
                        class174 var93 = var52 ? Statics.field3160 : Statics.field782;
                        if (var464 == 1500) {
                            field781[var5++] = var93.field2797;
                            continue;
                        }
                        if (var464 == 1501) {
                            field781[var5++] = var93.field2824;
                            continue;
                        }
                        if (var464 == 1502) {
                            field781[var5++] = var93.field2764;
                            continue;
                        }
                        if (var464 == 1503) {
                            field781[var5++] = var93.field2765;
                            continue;
                        }
                        if (var464 == 1504) {
                            field781[var5++] = var93.field2883 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 1505) {
                            field781[var5++] = var93.field2778;
                            continue;
                        }
                    } else if (var464 < 1700) {
                        class174 var94 = var52 ? Statics.field3160 : Statics.field782;
                        if (var464 == 1600) {
                            field781[var5++] = var94.field2864;
                            continue;
                        }
                        if (var464 == 1601) {
                            field781[var5++] = var94.field2771;
                            continue;
                        }
                        if (var464 == 1602) {
                            field790[var6++] = var94.field2809;
                            continue;
                        }
                        if (var464 == 1603) {
                            field781[var5++] = var94.field2772;
                            continue;
                        }
                        if (var464 == 1604) {
                            field781[var5++] = var94.field2773;
                            continue;
                        }
                        if (var464 == 1605) {
                            field781[var5++] = var94.field2803;
                            continue;
                        }
                        if (var464 == 1606) {
                            field781[var5++] = var94.field2840;
                            continue;
                        }
                        if (var464 == 1607) {
                            field781[var5++] = var94.field2845;
                            continue;
                        }
                        if (var464 == 1608) {
                            field781[var5++] = var94.field2801;
                            continue;
                        }
                        if (var464 == 1609) {
                            field781[var5++] = var94.field2831;
                            continue;
                        }
                        if (var464 == 1610) {
                            field781[var5++] = var94.field2781;
                            continue;
                        }
                        if (var464 == 1611) {
                            field781[var5++] = var94.field2774;
                            continue;
                        }
                        if (var464 == 1612) {
                            field781[var5++] = var94.field2756;
                            continue;
                        }
                        if (var464 == 1613) {
                            field781[var5++] = var94.field2779.method547();
                            continue;
                        }
                    } else if (var464 < 1800) {
                        class174 var95 = var52 ? Statics.field3160 : Statics.field782;
                        if (var464 == 1700) {
                            field781[var5++] = var95.field2869;
                            continue;
                        }
                        if (var464 == 1701) {
                            if (var95.field2869 == -1) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var95.field2872;
                            }
                            continue;
                        }
                        if (var464 == 1702) {
                            field781[var5++] = var95.field2750;
                            continue;
                        }
                    } else if (var464 < 1900) {
                        class174 var96 = var52 ? Statics.field3160 : Statics.field782;
                        if (var464 == 1800) {
                            field781[var5++] = class179.method2291(client.method720(var96));
                            continue;
                        }
                        if (var464 == 1801) {
                            var5--;
                            int var97 = field781[var5];
                            int var465 = var97 - 1;
                            if (var96.field2823 != null && var465 < var96.field2823.length && var96.field2823[var465] != null) {
                                field790[var6++] = var96.field2823[var465];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 1802) {
                            if (var96.field2761 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = var96.field2761;
                            }
                            continue;
                        }
                    } else if (!(var464 < 1900 || var464 >= 2000) || !(var464 < 2900 || var464 >= 3000)) {
                        class174 var98;
                        if (var464 >= 2000) {
                            var464 -= 1000;
                            var5--;
                            var98 = class174.method2976(field781[var5]);
                        } else {
                            var98 = var52 ? Statics.field3160 : Statics.field782;
                        }
                        if (var464 == 1927) {
                            if (field788 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var98.field2858 == null) {
                                return;
                            }
                            class1 var99 = new class1();
                            var99.field11 = var98;
                            var99.field13 = var98.field2858;
                            var99.field3 = field788 + 1;
                            client.field487.method3550(arg0);
                            continue;
                        }
                    } else if (var464 < 2600) {
                        var5--;
                        class174 var100 = class174.method2976(field781[var5]);
                        if (var464 == 2500) {
                            field781[var5++] = var100.field2797;
                            continue;
                        }
                        if (var464 == 2501) {
                            field781[var5++] = var100.field2824;
                            continue;
                        }
                        if (var464 == 2502) {
                            field781[var5++] = var100.field2764;
                            continue;
                        }
                        if (var464 == 2503) {
                            field781[var5++] = var100.field2765;
                            continue;
                        }
                        if (var464 == 2504) {
                            field781[var5++] = var100.field2883 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 2505) {
                            field781[var5++] = var100.field2778;
                            continue;
                        }
                    } else if (var464 < 2700) {
                        var5--;
                        class174 var101 = class174.method2976(field781[var5]);
                        if (var464 == 2600) {
                            field781[var5++] = var101.field2864;
                            continue;
                        }
                        if (var464 == 2601) {
                            field781[var5++] = var101.field2771;
                            continue;
                        }
                        if (var464 == 2602) {
                            field790[var6++] = var101.field2809;
                            continue;
                        }
                        if (var464 == 2603) {
                            field781[var5++] = var101.field2772;
                            continue;
                        }
                        if (var464 == 2604) {
                            field781[var5++] = var101.field2773;
                            continue;
                        }
                        if (var464 == 2605) {
                            field781[var5++] = var101.field2803;
                            continue;
                        }
                        if (var464 == 2606) {
                            field781[var5++] = var101.field2840;
                            continue;
                        }
                        if (var464 == 2607) {
                            field781[var5++] = var101.field2845;
                            continue;
                        }
                        if (var464 == 2608) {
                            field781[var5++] = var101.field2801;
                            continue;
                        }
                        if (var464 == 2609) {
                            field781[var5++] = var101.field2831;
                            continue;
                        }
                        if (var464 == 2610) {
                            field781[var5++] = var101.field2781;
                            continue;
                        }
                        if (var464 == 2611) {
                            field781[var5++] = var101.field2774;
                            continue;
                        }
                        if (var464 == 2612) {
                            field781[var5++] = var101.field2756;
                            continue;
                        }
                        if (var464 == 2613) {
                            field781[var5++] = var101.field2779.method547();
                            continue;
                        }
                    } else if (var464 < 2800) {
                        if (var464 == 2700) {
                            var5--;
                            class174 var102 = class174.method2976(field781[var5]);
                            field781[var5++] = var102.field2869;
                            continue;
                        }
                        if (var464 == 2701) {
                            var5--;
                            class174 var103 = class174.method2976(field781[var5]);
                            if (var103.field2869 == -1) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var103.field2872;
                            }
                            continue;
                        }
                        if (var464 == 2702) {
                            var5--;
                            int var104 = field781[var5];
                            class4 var105 = (class4) client.field449.method3538((long) var104);
                            if (var105 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = 1;
                            }
                            continue;
                        }
                        if (var464 == 2706) {
                            field781[var5++] = client.field457;
                            continue;
                        }
                    } else if (var464 < 2900) {
                        var5--;
                        class174 var106 = class174.method2976(field781[var5]);
                        if (var464 == 2800) {
                            field781[var5++] = class179.method2291(client.method720(var106));
                            continue;
                        }
                        if (var464 == 2801) {
                            var5--;
                            int var107 = field781[var5];
                            int var466 = var107 - 1;
                            if (var106.field2823 != null && var466 < var106.field2823.length && var106.field2823[var466] != null) {
                                field790[var6++] = var106.field2823[var466];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 2802) {
                            if (var106.field2761 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = var106.field2761;
                            }
                            continue;
                        }
                    } else if (var464 < 3200) {
                        if (var464 == 3100) {
                            var6--;
                            String var108 = field790[var6];
                            class12.method936(0, "", var108);
                            continue;
                        }
                        if (var464 == 3101) {
                            var5 -= 2;
                            client.method2941(Statics.field2263, field781[var5], field781[var5 + 1]);
                            continue;
                        }
                        if (var464 == 3103) {
                            client.method2284();
                            continue;
                        }
                        if (var464 == 3104) {
                            var6--;
                            String var109 = field790[var6];
                            int var110 = 0;
                            if (class164.method2948(var109)) {
                                int var111 = class164.method116(var109, 10, true);
                                var110 = var111;
                            }
                            client.field332.method2611(182);
                            client.field332.method2332(var110);
                            continue;
                        }
                        if (var464 == 3105) {
                            var6--;
                            String var112 = field790[var6];
                            client.field332.method2611(99);
                            client.field332.method2480(var112.length() + 1);
                            client.field332.method2335(var112);
                            continue;
                        }
                        if (var464 == 3106) {
                            var6--;
                            String var113 = field790[var6];
                            client.field332.method2611(196);
                            client.field332.method2480(var113.length() + 1);
                            client.field332.method2335(var113);
                            continue;
                        }
                        if (var464 == 3107) {
                            var5--;
                            int var114 = field781[var5];
                            var6--;
                            String var115 = field790[var6];
                            client.method219(var114, var115);
                            continue;
                        }
                        if (var464 == 3108) {
                            var5 -= 3;
                            int var116 = field781[var5];
                            int var117 = field781[var5 + 1];
                            int var118 = field781[var5 + 2];
                            class174 var119 = class174.method2976(var118);
                            client.method3021(var119, var116, var117);
                            continue;
                        }
                        if (var464 == 3109) {
                            var5 -= 2;
                            int var120 = field781[var5];
                            int var121 = field781[var5 + 1];
                            class174 var122 = var52 ? Statics.field3160 : Statics.field782;
                            client.method3021(var122, var120, var121);
                            continue;
                        }
                        if (var464 == 3110) {
                            var5--;
                            Statics.field2632 = field781[var5] == 1;
                            continue;
                        }
                        if (var464 == 3111) {
                            field781[var5++] = Statics.field2638.field133 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3112) {
                            var5--;
                            Statics.field2638.field133 = field781[var5] == 1;
                            class9.method95();
                            continue;
                        }
                        if (var464 == 3113) {
                            var6--;
                            String var123 = field790[var6];
                            var5--;
                            boolean var124 = field781[var5] == 1;
                            Statics.method110(var123, var124, "openjs", false);
                            continue;
                        }
                        if (var464 == 3115) {
                            var5--;
                            int var125 = field781[var5];
                            client.field332.method2611(153);
                            client.field332.method2525(var125);
                            continue;
                        }
                        if (var464 == 3116) {
                            var5--;
                            int var126 = field781[var5];
                            var6 -= 2;
                            String var127 = field790[var6];
                            String var128 = field790[var6 + 1];
                            if (var127.length() <= 500 && var128.length() <= 500) {
                                client.field332.method2611(189);
                                client.field332.method2525(1 + class120.method42(var127) + class120.method42(var128));
                                client.field332.method2335(var127);
                                client.field332.method2335(var128);
                                client.field332.method2427(var126);
                            }
                            continue;
                        }
                    } else if (var464 < 3300) {
                        if (var464 == 3200) {
                            var5 -= 3;
                            client.method997(field781[var5], field781[var5 + 1], field781[var5 + 2]);
                            continue;
                        }
                        if (var464 == 3201) {
                            var5--;
                            int var129 = field781[var5];
                            if (var129 == -1 && !client.field527) {
                                Statics.field2953.method3378();
                                class184.field2954 = 1;
                                Statics.field1076 = null;
                            } else if (var129 != -1 && client.field526 != var129 && client.field525 != 0 && !client.field527) {
                                class184.method152(2, Statics.field359, var129, 0, client.field525, false);
                            }
                            client.field526 = var129;
                            continue;
                        }
                        if (var464 == 3202) {
                            var5 -= 2;
                            int var130 = field781[var5];
                            int var10000 = field781[var5 + 1];
                            if (client.field525 != 0 && var130 != -1) {
                                Statics.method1778(Statics.field1423, var130, 0, client.field525, false);
                                client.field527 = true;
                            }
                            continue;
                        }
                    } else if (var464 < 3400) {
                        if (var464 == 3300) {
                            field781[var5++] = client.field297;
                            continue;
                        }
                        if (var464 == 3301) {
                            var5 -= 2;
                            int var132 = field781[var5];
                            int var133 = field781[var5 + 1];
                            int[] var134 = field781;
                            int var135 = var5++;
                            class16 var136 = (class16) class16.field222.method3538((long) var132);
                            int var137;
                            if (var136 == null) {
                                var137 = -1;
                            } else if (var133 >= 0 && var133 < var136.field217.length) {
                                var137 = var136.field217[var133];
                            } else {
                                var137 = -1;
                            }
                            var134[var135] = var137;
                            continue;
                        }
                        if (var464 == 3302) {
                            var5 -= 2;
                            int var138 = field781[var5];
                            int var139 = field781[var5 + 1];
                            int[] var140 = field781;
                            int var141 = var5++;
                            class16 var142 = (class16) class16.field222.method3538((long) var138);
                            int var143;
                            if (var142 == null) {
                                var143 = 0;
                            } else if (var139 >= 0 && var139 < var142.field218.length) {
                                var143 = var142.field218[var139];
                            } else {
                                var143 = 0;
                            }
                            var140[var141] = var143;
                            continue;
                        }
                        if (var464 == 3303) {
                            var5 -= 2;
                            int var144 = field781[var5];
                            int var145 = field781[var5 + 1];
                            int[] var146 = field781;
                            int var147 = var5++;
                            class16 var148 = (class16) class16.field222.method3538((long) var144);
                            int var149;
                            if (var148 == null) {
                                var149 = 0;
                            } else if (var145 == -1) {
                                var149 = 0;
                            } else {
                                int var150 = 0;
                                for (int var151 = 0; var151 < var148.field218.length; var151++) {
                                    if (var148.field217[var151] == var145) {
                                        var150 += var148.field218[var151];
                                    }
                                }
                                var149 = var150;
                            }
                            var146[var147] = var149;
                            continue;
                        }
                        if (var464 == 3304) {
                            var5--;
                            int var152 = field781[var5];
                            field781[var5++] = Statics.method2220(var152).field1073;
                            continue;
                        }
                        if (var464 == 3305) {
                            var5--;
                            int var153 = field781[var5];
                            field781[var5++] = client.field357[var153];
                            continue;
                        }
                        if (var464 == 3306) {
                            var5--;
                            int var154 = field781[var5];
                            field781[var5++] = client.field426[var154];
                            continue;
                        }
                        if (var464 == 3307) {
                            var5--;
                            int var155 = field781[var5];
                            field781[var5++] = client.field427[var155];
                            continue;
                        }
                        if (var464 == 3308) {
                            int var156 = Statics.field2194;
                            int var157 = (Statics.field2263.field814 >> 7) + Statics.field63;
                            int var158 = (Statics.field2263.field792 >> 7) + Statics.field1435;
                            field781[var5++] = (var156 << 28) + (var157 << 14) + var158;
                            continue;
                        }
                        if (var464 == 3309) {
                            var5--;
                            int var159 = field781[var5];
                            field781[var5++] = var159 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var464 == 3310) {
                            var5--;
                            int var160 = field781[var5];
                            field781[var5++] = var160 >> 28;
                            continue;
                        }
                        if (var464 == 3311) {
                            var5--;
                            int var161 = field781[var5];
                            field781[var5++] = var161 & 0x3FFF;
                            continue;
                        }
                        if (var464 == 3312) {
                            field781[var5++] = client.field291 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3313) {
                            var5 -= 2;
                            int var162 = field781[var5] + 32768;
                            int var163 = field781[var5 + 1];
                            int[] var164 = field781;
                            int var165 = var5++;
                            class16 var166 = (class16) class16.field222.method3538((long) var162);
                            int var167;
                            if (var166 == null) {
                                var167 = -1;
                            } else if (var163 >= 0 && var163 < var166.field217.length) {
                                var167 = var166.field217[var163];
                            } else {
                                var167 = -1;
                            }
                            var164[var165] = var167;
                            continue;
                        }
                        if (var464 == 3314) {
                            var5 -= 2;
                            int var168 = field781[var5] + 32768;
                            int var169 = field781[var5 + 1];
                            int[] var170 = field781;
                            int var171 = var5++;
                            class16 var172 = (class16) class16.field222.method3538((long) var168);
                            int var173;
                            if (var172 == null) {
                                var173 = 0;
                            } else if (var169 >= 0 && var169 < var172.field218.length) {
                                var173 = var172.field218[var169];
                            } else {
                                var173 = 0;
                            }
                            var170[var171] = var173;
                            continue;
                        }
                        if (var464 == 3315) {
                            var5 -= 2;
                            int var174 = field781[var5] + 32768;
                            int var175 = field781[var5 + 1];
                            int[] var176 = field781;
                            int var177 = var5++;
                            class16 var178 = (class16) class16.field222.method3538((long) var174);
                            int var179;
                            if (var178 == null) {
                                var179 = 0;
                            } else if (var175 == -1) {
                                var179 = 0;
                            } else {
                                int var180 = 0;
                                for (int var181 = 0; var181 < var178.field218.length; var181++) {
                                    if (var178.field217[var181] == var175) {
                                        var180 += var178.field218[var181];
                                    }
                                }
                                var179 = var180;
                            }
                            var176[var177] = var179;
                            continue;
                        }
                        if (var464 == 3316) {
                            if (client.field355 >= 2) {
                                field781[var5++] = client.field355;
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                        if (var464 == 3317) {
                            field781[var5++] = client.field520;
                            continue;
                        }
                        if (var464 == 3318) {
                            field781[var5++] = client.field287;
                            continue;
                        }
                        if (var464 == 3321) {
                            field781[var5++] = client.field453;
                            continue;
                        }
                        if (var464 == 3322) {
                            field781[var5++] = client.field454;
                            continue;
                        }
                        if (var464 == 3323) {
                            if (client.field455) {
                                field781[var5++] = 1;
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                        if (var464 == 3324) {
                            field781[var5++] = client.field478;
                            continue;
                        }
                    } else if (var464 < 3500) {
                        if (var464 == 3400) {
                            var5 -= 2;
                            int var182 = field781[var5];
                            int var183 = field781[var5 + 1];
                            class49 var184 = (class49) class49.field1059.method3495((long) var182);
                            class49 var185;
                            if (var184 == null) {
                                byte[] var186 = Statics.field1054.method3037(8, var182);
                                class49 var187 = new class49();
                                if (var186 != null) {
                                    var187.method966(new class120(var186));
                                }
                                class49.field1059.method3490(var187, (long) var182);
                                var185 = var187;
                            } else {
                                var185 = var184;
                            }
                            class49 var188 = var185;
                            if (var185.field1052 != 's') {
                            }
                            for (int var189 = 0; var189 < var188.field1055; var189++) {
                                if (var188.field1056[var189] == var183) {
                                    field790[var6++] = var188.field1058[var189];
                                    var188 = null;
                                    break;
                                }
                            }
                            if (var188 != null) {
                                field790[var6++] = var188.field1053;
                            }
                            continue;
                        }
                        if (var464 == 3408) {
                            var5 -= 4;
                            int var190 = field781[var5];
                            int var191 = field781[var5 + 1];
                            int var192 = field781[var5 + 2];
                            int var193 = field781[var5 + 3];
                            class49 var194 = (class49) class49.field1059.method3495((long) var192);
                            class49 var195;
                            if (var194 == null) {
                                byte[] var196 = Statics.field1054.method3037(8, var192);
                                class49 var197 = new class49();
                                if (var196 != null) {
                                    var197.method966(new class120(var196));
                                }
                                class49.field1059.method3490(var197, (long) var192);
                                var195 = var197;
                            } else {
                                var195 = var194;
                            }
                            class49 var198 = var195;
                            if (var195.field1051 == var190 && var195.field1052 == var191) {
                                for (int var199 = 0; var199 < var198.field1055; var199++) {
                                    if (var198.field1056[var199] == var193) {
                                        if (var191 == 115) {
                                            field790[var6++] = var198.field1058[var199];
                                        } else {
                                            field781[var5++] = var198.field1057[var199];
                                        }
                                        var198 = null;
                                        break;
                                    }
                                }
                                if (var198 != null) {
                                    if (var191 == 115) {
                                        field790[var6++] = var198.field1053;
                                    } else {
                                        field781[var5++] = var198.field1060;
                                    }
                                }
                                continue;
                            }
                            if (var191 == 115) {
                                field790[var6++] = "null";
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var464 < 3700) {
                        if (var464 == 3600) {
                            if (client.field556 == 0) {
                                field781[var5++] = -2;
                            } else if (client.field556 == 1) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = client.field341;
                            }
                            continue;
                        }
                        if (var464 == 3601) {
                            var5--;
                            int var200 = field781[var5];
                            if (client.field556 == 2 && var200 < client.field341) {
                                field790[var6++] = client.field557[var200].field244;
                                field790[var6++] = client.field557[var200].field247;
                                continue;
                            }
                            field790[var6++] = "";
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 3602) {
                            var5--;
                            int var201 = field781[var5];
                            if (client.field556 == 2 && var201 < client.field341) {
                                field781[var5++] = client.field557[var201].field250;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var464 == 3603) {
                            var5--;
                            int var202 = field781[var5];
                            if (client.field556 == 2 && var202 < client.field341) {
                                field781[var5++] = client.field557[var202].field249;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var464 == 3604) {
                            var6--;
                            String var203 = field790[var6];
                            var5--;
                            int var204 = field781[var5];
                            client.field332.method2611(244);
                            client.field332.method2480(class120.method42(var203) + 1);
                            client.field332.method2369(var204);
                            client.field332.method2335(var203);
                            continue;
                        }
                        if (var464 == 3605) {
                            var6--;
                            String var205 = field790[var6];
                            if (var205 == null) {
                                continue;
                            }
                            if ((client.field341 < 200 || client.field413 == 1) && client.field341 < 400) {
                                String var206 = class165.method777(var205, Statics.field290);
                                if (var206 == null) {
                                    continue;
                                }
                                for (int var207 = 0; var207 < client.field341; var207++) {
                                    class18 var208 = client.field557[var207];
                                    String var209 = class165.method777(var208.field244, Statics.field290);
                                    if (var209 != null && var209.equals(var206)) {
                                        class12.method936(30, "", var205 + class158.field2462);
                                        continue label3016;
                                    }
                                    if (var208.field247 != null) {
                                        String var210 = class165.method777(var208.field247, Statics.field290);
                                        if (var210 != null && var210.equals(var206)) {
                                            class12.method936(30, "", var205 + class158.field2462);
                                            continue label3016;
                                        }
                                    }
                                }
                                for (int var211 = 0; var211 < client.field514; var211++) {
                                    class8 var212 = client.field560[var211];
                                    String var213 = class165.method777(var212.field125, Statics.field290);
                                    if (var213 != null && var213.equals(var206)) {
                                        class12.method936(30, "", class158.field2467 + var205 + class158.field2468);
                                        continue label3016;
                                    }
                                    if (var212.field123 != null) {
                                        String var214 = class165.method777(var212.field123, Statics.field290);
                                        if (var214 != null && var214.equals(var206)) {
                                            class12.method936(30, "", class158.field2467 + var205 + class158.field2468);
                                            continue label3016;
                                        }
                                    }
                                }
                                if (class165.method777(Statics.field2263.field27, Statics.field290).equals(var206)) {
                                    class12.method936(30, "", class158.field2472);
                                } else {
                                    client.field332.method2611(3);
                                    client.field332.method2480(class120.method42(var205));
                                    client.field332.method2335(var205);
                                }
                                continue;
                            }
                            class12.method936(30, "", class158.field2492);
                            continue;
                        }
                        if (var464 == 3606) {
                            var6--;
                            String var215 = field790[var6];
                            client.method659(var215);
                            continue;
                        }
                        if (var464 == 3607) {
                            var6--;
                            String var216 = field790[var6];
                            client.method2668(var216, false);
                            continue;
                        }
                        if (var464 == 3608) {
                            var6--;
                            String var217 = field790[var6];
                            Statics.method1544(var217);
                            continue;
                        }
                        if (var464 == 3609) {
                            var6--;
                            String var218 = field790[var6];
                            class153[] var219 = class153.method40();
                            for (int var220 = 0; var220 < var219.length; var220++) {
                                class153 var221 = var219[var220];
                                if (var221.field2250 != -1 && var218.startsWith(class2.method1152(var221.field2250))) {
                                    var218 = var218.substring(6 + Integer.toString(var221.field2250).length());
                                    break;
                                }
                            }
                            field781[var5++] = client.method146(var218, false) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3611) {
                            if (client.field515 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = class163.method995(client.field515);
                            }
                            continue;
                        }
                        if (var464 == 3612) {
                            if (client.field515 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = Statics.field1958;
                            }
                            continue;
                        }
                        if (var464 == 3613) {
                            var5--;
                            int var222 = field781[var5];
                            if (client.field515 != null && var222 < Statics.field1958) {
                                field790[var6++] = Statics.field924[var222].field618;
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 3614) {
                            var5--;
                            int var223 = field781[var5];
                            if (client.field515 != null && var223 < Statics.field1958) {
                                field781[var5++] = Statics.field924[var223].field620;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var464 == 3615) {
                            var5--;
                            int var224 = field781[var5];
                            if (client.field515 != null && var224 < Statics.field1958) {
                                field781[var5++] = Statics.field924[var224].field623;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var464 == 3616) {
                            field781[var5++] = Statics.field2265;
                            continue;
                        }
                        if (var464 == 3617) {
                            var6--;
                            String var225 = field790[var6];
                            if (Statics.field924 != null) {
                                client.field332.method2611(185);
                                client.field332.method2480(class120.method42(var225));
                                client.field332.method2335(var225);
                            }
                            continue;
                        }
                        if (var464 == 3618) {
                            field781[var5++] = Statics.field1987;
                            continue;
                        }
                        if (var464 == 3619) {
                            var6--;
                            String var226 = field790[var6];
                            if (!var226.equals("")) {
                                client.field332.method2611(144);
                                client.field332.method2480(class120.method42(var226));
                                client.field332.method2335(var226);
                            }
                            continue;
                        }
                        if (var464 == 3620) {
                            client.field332.method2611(144);
                            client.field332.method2480(0);
                            continue;
                        }
                        if (var464 == 3621) {
                            if (client.field556 == 0) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = client.field514;
                            }
                            continue;
                        }
                        if (var464 == 3622) {
                            var5--;
                            int var227 = field781[var5];
                            if (client.field556 != 0 && var227 < client.field514) {
                                field790[var6++] = client.field560[var227].field125;
                                field790[var6++] = client.field560[var227].field123;
                                continue;
                            }
                            field790[var6++] = "";
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 3623) {
                            var6--;
                            String var228 = field790[var6];
                            if (var228.startsWith(class2.method1152(0)) || var228.startsWith(class2.method1152(1))) {
                                var228 = var228.substring(7);
                            }
                            field781[var5++] = client.method934(var228) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3624) {
                            var5--;
                            int var229 = field781[var5];
                            if (Statics.field924 != null && var229 < Statics.field1958 && Statics.field924[var229].field618.equalsIgnoreCase(Statics.field2263.field27)) {
                                field781[var5++] = 1;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var464 == 3625) {
                            if (client.field516 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = class163.method995(client.field516);
                            }
                            continue;
                        }
                    } else if (var464 < 4000) {
                        if (var464 == 3903) {
                            var5--;
                            int var230 = field781[var5];
                            field781[var5++] = client.field529[var230].method3729();
                            continue;
                        }
                        if (var464 == 3904) {
                            var5--;
                            int var231 = field781[var5];
                            field781[var5++] = client.field529[var231].field3174;
                            continue;
                        }
                        if (var464 == 3905) {
                            var5--;
                            int var232 = field781[var5];
                            field781[var5++] = client.field529[var232].field3173;
                            continue;
                        }
                        if (var464 == 3906) {
                            var5--;
                            int var233 = field781[var5];
                            field781[var5++] = client.field529[var233].field3176;
                            continue;
                        }
                        if (var464 == 3907) {
                            var5--;
                            int var234 = field781[var5];
                            field781[var5++] = client.field529[var234].field3175;
                            continue;
                        }
                        if (var464 == 3908) {
                            var5--;
                            int var235 = field781[var5];
                            field781[var5++] = client.field529[var235].field3178;
                            continue;
                        }
                        if (var464 == 3910) {
                            var5--;
                            int var236 = field781[var5];
                            int var237 = client.field529[var236].method3737();
                            field781[var5++] = var237 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3911) {
                            var5--;
                            int var238 = field781[var5];
                            int var239 = client.field529[var238].method3737();
                            field781[var5++] = var239 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3912) {
                            var5--;
                            int var240 = field781[var5];
                            int var241 = client.field529[var240].method3737();
                            field781[var5++] = var241 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3913) {
                            var5--;
                            int var242 = field781[var5];
                            int var243 = client.field529[var242].method3737();
                            field781[var5++] = var243 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3914) {
                            var5--;
                            boolean var244 = field781[var5] == 1;
                            if (Statics.field2173 != null) {
                                Statics.field2173.method3751(class222.field3185, var244);
                            }
                            continue;
                        }
                        if (var464 == 3915) {
                            var5--;
                            boolean var245 = field781[var5] == 1;
                            if (Statics.field2173 != null) {
                                Statics.field2173.method3751(class222.field3182, var245);
                            }
                            continue;
                        }
                        if (var464 == 3916) {
                            var5 -= 2;
                            boolean var246 = field781[var5] == 1;
                            boolean var247 = field781[var5 + 1] == 1;
                            if (Statics.field2173 != null) {
                                Statics.field2173.method3751(new class22(var247), var246);
                            }
                            continue;
                        }
                        if (var464 == 3917) {
                            var5--;
                            boolean var248 = field781[var5] == 1;
                            if (Statics.field2173 != null) {
                                Statics.field2173.method3751(class222.field3180, var248);
                            }
                            continue;
                        }
                        if (var464 == 3918) {
                            var5--;
                            boolean var249 = field781[var5] == 1;
                            if (Statics.field2173 != null) {
                                Statics.field2173.method3751(class222.field3183, var249);
                            }
                            continue;
                        }
                        if (var464 == 3919) {
                            field781[var5++] = Statics.field2173 == null ? 0 : Statics.field2173.field3186.size();
                            continue;
                        }
                        if (var464 == 3920) {
                            var5--;
                            int var250 = field781[var5];
                            class215 var251 = (class215) Statics.field2173.field3186.get(var250);
                            field781[var5++] = var251.field3148;
                            continue;
                        }
                        if (var464 == 3921) {
                            var5--;
                            int var252 = field781[var5];
                            class215 var253 = (class215) Statics.field2173.field3186.get(var252);
                            field790[var6++] = var253.method3677();
                            continue;
                        }
                        if (var464 == 3922) {
                            var5--;
                            int var254 = field781[var5];
                            class215 var255 = (class215) Statics.field2173.field3186.get(var254);
                            field790[var6++] = var255.method3680();
                            continue;
                        }
                        if (var464 == 3923) {
                            var5--;
                            int var256 = field781[var5];
                            class215 var257 = (class215) Statics.field2173.field3186.get(var256);
                            long var258 = class116.method1946() - Statics.field2577 - var257.field3152;
                            int var260 = (int) (var258 / 3600000L);
                            int var261 = (int) ((var258 - (long) (var260 * 3600000)) / 60000L);
                            int var262 = (int) ((var258 - (long) (var260 * 3600000) - (long) (var261 * 60000)) / 1000L);
                            String var263 = var260 + ":" + var261 / 10 + var261 % 10 + ":" + var262 / 10 + var262 % 10;
                            field790[var6++] = var263;
                            continue;
                        }
                        if (var464 == 3924) {
                            var5--;
                            int var264 = field781[var5];
                            class215 var265 = (class215) Statics.field2173.field3186.get(var264);
                            field781[var5++] = var265.field3149.field3176;
                            continue;
                        }
                        if (var464 == 3925) {
                            var5--;
                            int var266 = field781[var5];
                            class215 var267 = (class215) Statics.field2173.field3186.get(var266);
                            field781[var5++] = var267.field3149.field3173;
                            continue;
                        }
                        if (var464 == 3926) {
                            var5--;
                            int var268 = field781[var5];
                            class215 var269 = (class215) Statics.field2173.field3186.get(var268);
                            field781[var5++] = var269.field3149.field3174;
                            continue;
                        }
                    } else if (var464 < 4100) {
                        if (var464 == 4000) {
                            var5 -= 2;
                            int var270 = field781[var5];
                            int var271 = field781[var5 + 1];
                            field781[var5++] = var270 + var271;
                            continue;
                        }
                        if (var464 == 4001) {
                            var5 -= 2;
                            int var272 = field781[var5];
                            int var273 = field781[var5 + 1];
                            field781[var5++] = var272 - var273;
                            continue;
                        }
                        if (var464 == 4002) {
                            var5 -= 2;
                            int var274 = field781[var5];
                            int var275 = field781[var5 + 1];
                            field781[var5++] = var274 * var275;
                            continue;
                        }
                        if (var464 == 4003) {
                            var5 -= 2;
                            int var276 = field781[var5];
                            int var277 = field781[var5 + 1];
                            field781[var5++] = var276 / var277;
                            continue;
                        }
                        if (var464 == 4004) {
                            var5--;
                            int var278 = field781[var5];
                            field781[var5++] = (int) (Math.random() * (double) var278);
                            continue;
                        }
                        if (var464 == 4005) {
                            var5--;
                            int var279 = field781[var5];
                            field781[var5++] = (int) (Math.random() * (double) (var279 + 1));
                            continue;
                        }
                        if (var464 == 4006) {
                            var5 -= 5;
                            int var280 = field781[var5];
                            int var281 = field781[var5 + 1];
                            int var282 = field781[var5 + 2];
                            int var283 = field781[var5 + 3];
                            int var284 = field781[var5 + 4];
                            field781[var5++] = (var281 - var280) * (var284 - var282) / (var283 - var282) + var280;
                            continue;
                        }
                        if (var464 == 4007) {
                            var5 -= 2;
                            int var285 = field781[var5];
                            int var286 = field781[var5 + 1];
                            field781[var5++] = var285 * var286 / 100 + var285;
                            continue;
                        }
                        if (var464 == 4008) {
                            var5 -= 2;
                            int var287 = field781[var5];
                            int var288 = field781[var5 + 1];
                            field781[var5++] = var287 | 0x1 << var288;
                            continue;
                        }
                        if (var464 == 4009) {
                            var5 -= 2;
                            int var289 = field781[var5];
                            int var290 = field781[var5 + 1];
                            field781[var5++] = var289 & -1 - (0x1 << var290);
                            continue;
                        }
                        if (var464 == 4010) {
                            var5 -= 2;
                            int var291 = field781[var5];
                            int var292 = field781[var5 + 1];
                            field781[var5++] = (var291 & 0x1 << var292) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var464 == 4011) {
                            var5 -= 2;
                            int var293 = field781[var5];
                            int var294 = field781[var5 + 1];
                            field781[var5++] = var293 % var294;
                            continue;
                        }
                        if (var464 == 4012) {
                            var5 -= 2;
                            int var295 = field781[var5];
                            int var296 = field781[var5 + 1];
                            if (var295 == 0) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = (int) Math.pow((double) var295, (double) var296);
                            }
                            continue;
                        }
                        if (var464 == 4013) {
                            var5 -= 2;
                            int var297 = field781[var5];
                            int var298 = field781[var5 + 1];
                            if (var297 == 0) {
                                field781[var5++] = 0;
                            } else if (var298 == 0) {
                                field781[var5++] = Integer.MAX_VALUE;
                            } else {
                                field781[var5++] = (int) Math.pow((double) var297, 1.0D / (double) var298);
                            }
                            continue;
                        }
                        if (var464 == 4014) {
                            var5 -= 2;
                            int var299 = field781[var5];
                            int var300 = field781[var5 + 1];
                            field781[var5++] = var299 & var300;
                            continue;
                        }
                        if (var464 == 4015) {
                            var5 -= 2;
                            int var301 = field781[var5];
                            int var302 = field781[var5 + 1];
                            field781[var5++] = var301 | var302;
                            continue;
                        }
                        if (var464 == 4018) {
                            var5 -= 3;
                            long var303 = (long) field781[var5];
                            long var305 = (long) field781[var5 + 1];
                            long var307 = (long) field781[var5 + 2];
                            field781[var5++] = (int) (var303 * var307 / var305);
                            continue;
                        }
                    } else if (var464 < 4200) {
                        if (var464 == 4100) {
                            var6--;
                            String var309 = field790[var6];
                            var5--;
                            int var310 = field781[var5];
                            field790[var6++] = var309 + var310;
                            continue;
                        }
                        if (var464 == 4101) {
                            var6 -= 2;
                            String var311 = field790[var6];
                            String var312 = field790[var6 + 1];
                            field790[var6++] = var311 + var312;
                            continue;
                        }
                        if (var464 == 4102) {
                            var6--;
                            String var313 = field790[var6];
                            var5--;
                            int var314 = field781[var5];
                            String[] var315 = field790;
                            int var316 = var6++;
                            String var318;
                            if (var314 < 0) {
                                var318 = Integer.toString(var314);
                            } else {
                                var318 = class164.method1769(var314, 10, true);
                            }
                            var315[var316] = var313 + var318;
                            continue;
                        }
                        if (var464 == 4103) {
                            var6--;
                            String var319 = field790[var6];
                            field790[var6++] = var319.toLowerCase();
                            continue;
                        }
                        if (var464 == 4104) {
                            var5--;
                            int var320 = field781[var5];
                            long var321 = ((long) var320 + 11745L) * 86400000L;
                            field786.setTime(new Date(var321));
                            int var323 = field786.get(5);
                            int var324 = field786.get(2);
                            int var325 = field786.get(1);
                            field790[var6++] = var323 + "-" + field787[var324] + "-" + var325;
                            continue;
                        }
                        if (var464 == 4105) {
                            var6 -= 2;
                            String var326 = field790[var6];
                            String var327 = field790[var6 + 1];
                            if (Statics.field2263.field50 != null && Statics.field2263.field50.field2914) {
                                field790[var6++] = var327;
                                continue;
                            }
                            field790[var6++] = var326;
                            continue;
                        }
                        if (var464 == 4106) {
                            var5--;
                            int var328 = field781[var5];
                            field790[var6++] = Integer.toString(var328);
                            continue;
                        }
                        if (var464 == 4107) {
                            var6 -= 2;
                            field781[var5++] = class164.method153(class167.method2132(field790[var6], field790[var6 + 1], client.field293));
                            continue;
                        }
                        if (var464 == 4108) {
                            var6--;
                            String var329 = field790[var6];
                            var5 -= 2;
                            int var330 = field781[var5];
                            int var331 = field781[var5 + 1];
                            byte[] var332 = Statics.field996.method3037(var331, 0);
                            class225 var333 = new class225(var332);
                            field781[var5++] = var333.method3762(var329, var330);
                            continue;
                        }
                        if (var464 == 4109) {
                            var6--;
                            String var334 = field790[var6];
                            var5 -= 2;
                            int var335 = field781[var5];
                            int var336 = field781[var5 + 1];
                            byte[] var337 = Statics.field996.method3037(var336, 0);
                            class225 var338 = new class225(var337);
                            field781[var5++] = var338.method3761(var334, var335);
                            continue;
                        }
                        if (var464 == 4110) {
                            var6 -= 2;
                            String var339 = field790[var6];
                            String var340 = field790[var6 + 1];
                            var5--;
                            if (field781[var5] == 1) {
                                field790[var6++] = var339;
                            } else {
                                field790[var6++] = var340;
                            }
                            continue;
                        }
                        if (var464 == 4111) {
                            var6--;
                            String var341 = field790[var6];
                            field790[var6++] = class224.method3763(var341);
                            continue;
                        }
                        if (var464 == 4112) {
                            var6--;
                            String var342 = field790[var6];
                            var5--;
                            int var343 = field781[var5];
                            field790[var6++] = var342 + (char) var343;
                            continue;
                        }
                        if (var464 == 4113) {
                            var5--;
                            int var344 = field781[var5];
                            int[] var345 = field781;
                            int var346 = var5++;
                            char var347 = (char) var344;
                            boolean var348;
                            if (var347 >= ' ' && var347 <= '~') {
                                var348 = true;
                            } else if (var347 >= 160 && var347 <= 255) {
                                var348 = true;
                            } else if (var347 == 8364 || var347 == 338 || var347 == 8212 || var347 == 339 || var347 == 376) {
                                var348 = true;
                            } else {
                                var348 = false;
                            }
                            var345[var346] = var348 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4114) {
                            var5--;
                            int var349 = field781[var5];
                            field781[var5++] = class164.method2946((char) var349) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4115) {
                            var5--;
                            int var350 = field781[var5];
                            int[] var351 = field781;
                            int var352 = var5++;
                            char var353 = (char) var350;
                            boolean var354 = var353 >= 'A' && var353 <= 'Z' || var353 >= 'a' && var353 <= 'z';
                            var351[var352] = var354 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4116) {
                            var5--;
                            int var355 = field781[var5];
                            int[] var356 = field781;
                            int var357 = var5++;
                            char var358 = (char) var355;
                            boolean var359 = var358 >= '0' && var358 <= '9';
                            var356[var357] = var359 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4117) {
                            var6--;
                            String var360 = field790[var6];
                            if (var360 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var360.length();
                            }
                            continue;
                        }
                        if (var464 == 4118) {
                            var6--;
                            String var361 = field790[var6];
                            var5 -= 2;
                            int var362 = field781[var5];
                            int var363 = field781[var5 + 1];
                            field790[var6++] = var361.substring(var362, var363);
                            continue;
                        }
                        if (var464 == 4119) {
                            var6--;
                            String var364 = field790[var6];
                            StringBuilder var365 = new StringBuilder(var364.length());
                            boolean var366 = false;
                            for (int var367 = 0; var367 < var364.length(); var367++) {
                                char var368 = var364.charAt(var367);
                                if (var368 == '<') {
                                    var366 = true;
                                } else if (var368 == '>') {
                                    var366 = false;
                                } else if (!var366) {
                                    var365.append(var368);
                                }
                            }
                            field790[var6++] = var365.toString();
                            continue;
                        }
                        if (var464 == 4120) {
                            var6--;
                            String var369 = field790[var6];
                            var5--;
                            int var370 = field781[var5];
                            field781[var5++] = var369.indexOf(var370);
                            continue;
                        }
                        if (var464 == 4121) {
                            var6 -= 2;
                            String var371 = field790[var6];
                            String var372 = field790[var6 + 1];
                            var5--;
                            int var373 = field781[var5];
                            field781[var5++] = var371.indexOf(var372, var373);
                            continue;
                        }
                    } else if (var464 < 4300) {
                        if (var464 == 4200) {
                            var5--;
                            int var374 = field781[var5];
                            field790[var6++] = class52.method727(var374).field1091;
                            continue;
                        }
                        if (var464 == 4201) {
                            var5 -= 2;
                            int var375 = field781[var5];
                            int var376 = field781[var5 + 1];
                            class52 var377 = class52.method727(var375);
                            if (var376 >= 1 && var376 <= 5 && var377.field1100[var376 - 1] != null) {
                                field790[var6++] = var377.field1100[var376 - 1];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 4202) {
                            var5 -= 2;
                            int var378 = field781[var5];
                            int var379 = field781[var5 + 1];
                            class52 var380 = class52.method727(var378);
                            if (var379 >= 1 && var379 <= 5 && var380.field1106[var379 - 1] != null) {
                                field790[var6++] = var380.field1106[var379 - 1];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var464 == 4203) {
                            var5--;
                            int var381 = field781[var5];
                            field781[var5++] = class52.method727(var381).field1098;
                            continue;
                        }
                        if (var464 == 4204) {
                            var5--;
                            int var382 = field781[var5];
                            field781[var5++] = class52.method727(var382).field1097 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4205) {
                            var5--;
                            int var383 = field781[var5];
                            class52 var384 = class52.method727(var383);
                            if (var384.field1117 == -1 && var384.field1113 >= 0) {
                                field781[var5++] = var384.field1113;
                                continue;
                            }
                            field781[var5++] = var383;
                            continue;
                        }
                        if (var464 == 4206) {
                            var5--;
                            int var385 = field781[var5];
                            class52 var386 = class52.method727(var385);
                            if (var386.field1117 >= 0 && var386.field1113 >= 0) {
                                field781[var5++] = var386.field1113;
                                continue;
                            }
                            field781[var5++] = var385;
                            continue;
                        }
                        if (var464 == 4207) {
                            var5--;
                            int var387 = field781[var5];
                            field781[var5++] = class52.method727(var387).field1099 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4208) {
                            var5--;
                            int var388 = field781[var5];
                            class52 var389 = class52.method727(var388);
                            if (var389.field1128 == -1 && var389.field1127 >= 0) {
                                field781[var5++] = var389.field1127;
                                continue;
                            }
                            field781[var5++] = var388;
                            continue;
                        }
                        if (var464 == 4209) {
                            var5--;
                            int var390 = field781[var5];
                            class52 var391 = class52.method727(var390);
                            if (var391.field1128 >= 0 && var391.field1127 >= 0) {
                                field781[var5++] = var391.field1127;
                                continue;
                            }
                            field781[var5++] = var390;
                            continue;
                        }
                        if (var464 == 4210) {
                            var6--;
                            String var392 = field790[var6];
                            var5--;
                            int var393 = field781[var5];
                            boolean var395 = var393 == 1;
                            String var396 = var392.toLowerCase();
                            short[] var397 = new short[16];
                            int var398 = 0;
                            int var399 = 0;
                            while (true) {
                                if (var399 >= Statics.field1079) {
                                    Statics.field58 = var397;
                                    Statics.field230 = 0;
                                    Statics.field59 = var398;
                                    String[] var403 = new String[Statics.field59];
                                    for (int var404 = 0; var404 < Statics.field59; var404++) {
                                        var403[var404] = class52.method727(var397[var404]).field1091;
                                    }
                                    short[] var405 = Statics.field58;
                                    class125.method2932(var403, var405, 0, var403.length - 1);
                                    break;
                                }
                                class52 var400 = class52.method727(var399);
                                if ((!var395 || var400.field1124) && var400.field1117 == -1 && var400.field1091.toLowerCase().indexOf(var396) != -1) {
                                    if (var398 >= 250) {
                                        Statics.field59 = -1;
                                        Statics.field58 = null;
                                        break;
                                    }
                                    if (var398 >= var397.length) {
                                        short[] var401 = new short[var397.length * 2];
                                        for (int var402 = 0; var402 < var398; var402++) {
                                            var401[var402] = var397[var402];
                                        }
                                        var397 = var401;
                                    }
                                    var397[var398++] = (short) var399;
                                }
                                var399++;
                            }
                            field781[var5++] = Statics.field59;
                            continue;
                        }
                        if (var464 == 4211) {
                            if (Statics.field58 != null && Statics.field230 < Statics.field59) {
                                field781[var5++] = Statics.field58[++Statics.field230 - 1] & 0xFFFF;
                                continue;
                            }
                            field781[var5++] = -1;
                            continue;
                        }
                        if (var464 == 4212) {
                            Statics.field230 = 0;
                            continue;
                        }
                    } else if (var464 < 5100) {
                        if (var464 == 5000) {
                            field781[var5++] = client.field356;
                            continue;
                        }
                        if (var464 == 5001) {
                            var5 -= 3;
                            client.field356 = field781[var5];
                            Statics.field157 = class131.method3477(field781[var5 + 1]);
                            if (Statics.field157 == null) {
                                Statics.field157 = class131.field2044;
                            }
                            client.field507 = field781[var5 + 2];
                            client.field332.method2611(156);
                            client.field332.method2480(client.field356);
                            client.field332.method2480(Statics.field157.field2046);
                            client.field332.method2480(client.field507);
                            continue;
                        }
                        if (var464 == 5002) {
                            var6--;
                            String var406 = field790[var6];
                            var5 -= 2;
                            int var407 = field781[var5];
                            int var408 = field781[var5 + 1];
                            client.field332.method2611(13);
                            client.field332.method2480(class120.method42(var406) + 2);
                            client.field332.method2335(var406);
                            client.field332.method2480(var407 - 1);
                            client.field332.method2480(var408);
                            continue;
                        }
                        if (var464 == 5003) {
                            var5 -= 2;
                            int var409 = field781[var5];
                            int var410 = field781[var5 + 1];
                            class36 var411 = class12.method1572(var409, var410);
                            if (var411 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                                field790[var6++] = "";
                                field790[var6++] = "";
                            } else {
                                field781[var5++] = var411.field770;
                                field781[var5++] = var411.field765;
                                field790[var6++] = var411.field767 == null ? "" : var411.field767;
                                field790[var6++] = var411.field768 == null ? "" : var411.field768;
                                field790[var6++] = var411.field769 == null ? "" : var411.field769;
                            }
                            continue;
                        }
                        if (var464 == 5004) {
                            var5--;
                            int var412 = field781[var5];
                            class36 var413 = (class36) class12.field170.method3539((long) var412);
                            if (var413 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                                field790[var6++] = "";
                                field790[var6++] = "";
                            } else {
                                field781[var5++] = var413.field766;
                                field781[var5++] = var413.field765;
                                field790[var6++] = var413.field767 == null ? "" : var413.field767;
                                field790[var6++] = var413.field768 == null ? "" : var413.field768;
                                field790[var6++] = var413.field769 == null ? "" : var413.field769;
                            }
                            continue;
                        }
                        if (var464 == 5005) {
                            if (Statics.field157 == null) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = Statics.field157.field2046;
                            }
                            continue;
                        }
                        if (var464 == 5008) {
                            var6--;
                            String var415 = field790[var6];
                            var5--;
                            int var416 = field781[var5];
                            String var417 = var415.toLowerCase();
                            byte var418 = 0;
                            if (var417.startsWith(class158.field2471)) {
                                var418 = 0;
                                var415 = var415.substring(class158.field2471.length());
                            } else if (var417.startsWith(class158.field2536)) {
                                var418 = 1;
                                var415 = var415.substring(class158.field2536.length());
                            } else if (var417.startsWith(class158.field2475)) {
                                var418 = 2;
                                var415 = var415.substring(class158.field2475.length());
                            } else if (var417.startsWith(class158.field2477)) {
                                var418 = 3;
                                var415 = var415.substring(class158.field2477.length());
                            } else if (var417.startsWith(class158.field2479)) {
                                var418 = 4;
                                var415 = var415.substring(class158.field2479.length());
                            } else if (var417.startsWith(class158.field2481)) {
                                var418 = 5;
                                var415 = var415.substring(class158.field2481.length());
                            } else if (var417.startsWith(class158.field2483)) {
                                var418 = 6;
                                var415 = var415.substring(class158.field2483.length());
                            } else if (var417.startsWith(class158.field2485)) {
                                var418 = 7;
                                var415 = var415.substring(class158.field2485.length());
                            } else if (var417.startsWith(class158.field2487)) {
                                var418 = 8;
                                var415 = var415.substring(class158.field2487.length());
                            } else if (var417.startsWith(class158.field2489)) {
                                var418 = 9;
                                var415 = var415.substring(class158.field2489.length());
                            } else if (var417.startsWith(class158.field2491)) {
                                var418 = 10;
                                var415 = var415.substring(class158.field2491.length());
                            } else if (var417.startsWith(class158.field2493)) {
                                var418 = 11;
                                var415 = var415.substring(class158.field2493.length());
                            } else if (client.field293 != 0) {
                                if (var417.startsWith(class158.field2353)) {
                                    var418 = 0;
                                    var415 = var415.substring(class158.field2353.length());
                                } else if (var417.startsWith(class158.field2474)) {
                                    var418 = 1;
                                    var415 = var415.substring(class158.field2474.length());
                                } else if (var417.startsWith(class158.field2343)) {
                                    var418 = 2;
                                    var415 = var415.substring(class158.field2343.length());
                                } else if (var417.startsWith(class158.field2569)) {
                                    var418 = 3;
                                    var415 = var415.substring(class158.field2569.length());
                                } else if (var417.startsWith(class158.field2439)) {
                                    var418 = 4;
                                    var415 = var415.substring(class158.field2439.length());
                                } else if (var417.startsWith(class158.field2321)) {
                                    var418 = 5;
                                    var415 = var415.substring(class158.field2321.length());
                                } else if (var417.startsWith(class158.field2391)) {
                                    var418 = 6;
                                    var415 = var415.substring(class158.field2391.length());
                                } else if (var417.startsWith(class158.field2486)) {
                                    var418 = 7;
                                    var415 = var415.substring(class158.field2486.length());
                                } else if (var417.startsWith(class158.field2383)) {
                                    var418 = 8;
                                    var415 = var415.substring(class158.field2383.length());
                                } else if (var417.startsWith(class158.field2490)) {
                                    var418 = 9;
                                    var415 = var415.substring(class158.field2490.length());
                                } else if (var417.startsWith(class158.field2518)) {
                                    var418 = 10;
                                    var415 = var415.substring(class158.field2518.length());
                                } else if (var417.startsWith(class158.field2499)) {
                                    var418 = 11;
                                    var415 = var415.substring(class158.field2499.length());
                                }
                            }
                            String var419 = var415.toLowerCase();
                            byte var420 = 0;
                            if (var419.startsWith(class158.field2495)) {
                                var420 = 1;
                                var415 = var415.substring(class158.field2495.length());
                            } else if (var419.startsWith(class158.field2376)) {
                                var420 = 2;
                                var415 = var415.substring(class158.field2376.length());
                            } else if (var419.startsWith(class158.field2380)) {
                                var420 = 3;
                                var415 = var415.substring(class158.field2380.length());
                            } else if (var419.startsWith(class158.field2501)) {
                                var420 = 4;
                                var415 = var415.substring(class158.field2501.length());
                            } else if (var419.startsWith(class158.field2503)) {
                                var420 = 5;
                                var415 = var415.substring(class158.field2503.length());
                            } else if (client.field293 != 0) {
                                if (var419.startsWith(class158.field2496)) {
                                    var420 = 1;
                                    var415 = var415.substring(class158.field2496.length());
                                } else if (var419.startsWith(class158.field2424)) {
                                    var420 = 2;
                                    var415 = var415.substring(class158.field2424.length());
                                } else if (var419.startsWith(class158.field2433)) {
                                    var420 = 3;
                                    var415 = var415.substring(class158.field2433.length());
                                } else if (var419.startsWith(class158.field2502)) {
                                    var420 = 4;
                                    var415 = var415.substring(class158.field2502.length());
                                } else if (var419.startsWith(class158.field2504)) {
                                    var420 = 5;
                                    var415 = var415.substring(class158.field2504.length());
                                }
                            }
                            client.field332.method2611(44);
                            client.field332.method2480(0);
                            int var421 = client.field332.field1977;
                            client.field332.method2480(var416);
                            client.field332.method2480(var418);
                            client.field332.method2480(var420);
                            class123 var422 = client.field332;
                            int var423 = var422.field1977;
                            byte[] var424 = class166.method935(var415);
                            var422.method2342(var424.length);
                            var422.field1977 += Statics.field3119.method2273(var424, 0, var424.length, var422.field1983, var422.field1977);
                            client.field332.method2341(client.field332.field1977 - var421);
                            continue;
                        }
                        if (var464 == 5009) {
                            var6 -= 2;
                            String var425 = field790[var6];
                            String var426 = field790[var6 + 1];
                            client.field332.method2611(222);
                            client.field332.method2525(0);
                            int var427 = client.field332.field1977;
                            client.field332.method2335(var425);
                            class123 var428 = client.field332;
                            int var429 = var428.field1977;
                            byte[] var430 = class166.method935(var426);
                            var428.method2342(var430.length);
                            var428.field1977 += Statics.field3119.method2273(var430, 0, var430.length, var428.field1983, var428.field1977);
                            client.field332.method2340(client.field332.field1977 - var427);
                            continue;
                        }
                        if (var464 == 5015) {
                            String var431;
                            if (Statics.field2263 == null || Statics.field2263.field27 == null) {
                                var431 = "";
                            } else {
                                var431 = Statics.field2263.field27;
                            }
                            field790[var6++] = var431;
                            continue;
                        }
                        if (var464 == 5016) {
                            field781[var5++] = client.field507;
                            continue;
                        }
                        if (var464 == 5017) {
                            var5--;
                            int var432 = field781[var5];
                            int[] var433 = field781;
                            int var434 = var5++;
                            class28 var435 = (class28) class12.field167.get(var432);
                            int var436;
                            if (var435 == null) {
                                var436 = 0;
                            } else {
                                var436 = var435.method638();
                            }
                            var433[var434] = var436;
                            continue;
                        }
                        if (var464 == 5018) {
                            var5--;
                            int var437 = field781[var5];
                            field781[var5++] = class12.method587(var437);
                            continue;
                        }
                        if (var464 == 5019) {
                            var5--;
                            int var438 = field781[var5];
                            field781[var5++] = class12.method2285(var438);
                            continue;
                        }
                        if (var464 == 5020) {
                            var6--;
                            String var439 = field790[var6];
                            if (var439.equalsIgnoreCase("toggleroof")) {
                                Statics.field2638.field133 = !Statics.field2638.field133;
                                class9.method95();
                                if (Statics.field2638.field133) {
                                    class12.method936(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method936(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var439.equalsIgnoreCase("displayfps")) {
                                client.field303 = !client.field303;
                            }
                            if (client.field355 >= 2) {
                                if (var439.equalsIgnoreCase("fpson")) {
                                    client.field303 = true;
                                }
                                if (var439.equalsIgnoreCase("fpsoff")) {
                                    client.field303 = false;
                                }
                                if (var439.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var439.equalsIgnoreCase("clientdrop")) {
                                    client.method2954();
                                }
                                if (var439.equalsIgnoreCase("errortest") && client.field549 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field332.method2611(69);
                            client.field332.method2480(var439.length() + 1);
                            client.field332.method2335(var439);
                            continue;
                        }
                        if (var464 == 5021) {
                            var6--;
                            client.field504 = field790[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var464 == 5022) {
                            field790[var6++] = client.field504;
                            continue;
                        }
                    }
                }
                if (var464 < 5400) {
                    if (var464 == 5306) {
                        int[] var440 = field781;
                        int var441 = var5++;
                        int var442 = client.field502 ? 2 : 1;
                        var440[var441] = var442;
                        continue;
                    }
                    if (var464 == 5307) {
                        var5--;
                        int var443 = field781[var5];
                        if (var443 == 1 || var443 == 2) {
                            client.method1489(var443);
                        }
                        continue;
                    }
                    if (var464 == 5308) {
                        field781[var5++] = Statics.field2638.field132;
                        continue;
                    }
                    if (var464 == 5309) {
                        var5--;
                        int var444 = field781[var5];
                        if (var444 == 1 || var444 == 2) {
                            Statics.field2638.field132 = var444;
                            class9.method95();
                        }
                        continue;
                    }
                }
                if (var464 < 5600) {
                    if (var464 == 5504) {
                        var5 -= 2;
                        int var445 = field781[var5];
                        int var446 = field781[var5 + 1];
                        if (!client.field536) {
                            client.field404 = var445;
                            client.field323 = var446;
                        }
                        continue;
                    }
                    if (var464 == 5505) {
                        field781[var5++] = client.field404;
                        continue;
                    }
                    if (var464 == 5506) {
                        field781[var5++] = client.field323;
                        continue;
                    }
                    if (var464 == 5530) {
                        var5--;
                        int var447 = field781[var5];
                        if (var447 < 0) {
                            var447 = 0;
                        }
                        client.field380 = var447;
                        continue;
                    }
                    if (var464 == 5531) {
                        field781[var5++] = client.field380;
                        continue;
                    }
                }
                if (var464 >= 5700 || var464 != 5630) {
                    if (var464 < 6300) {
                        if (var464 == 6200) {
                            var5 -= 2;
                            client.field542 = (short) field781[var5];
                            if (client.field542 <= 0) {
                                client.field542 = 256;
                            }
                            client.field543 = (short) field781[var5 + 1];
                            if (client.field543 <= 0) {
                                client.field543 = 205;
                            }
                            continue;
                        }
                        if (var464 == 6201) {
                            var5 -= 2;
                            client.field544 = (short) field781[var5];
                            if (client.field544 <= 0) {
                                client.field544 = 256;
                            }
                            client.field538 = (short) field781[var5 + 1];
                            if (client.field538 <= 0) {
                                client.field538 = 320;
                            }
                            continue;
                        }
                        if (var464 == 6202) {
                            var5 -= 4;
                            client.field548 = (short) field781[var5];
                            if (client.field548 <= 0) {
                                client.field548 = 1;
                            }
                            client.field547 = (short) field781[var5 + 1];
                            if (client.field547 <= 0) {
                                client.field547 = 32767;
                            } else if (client.field547 < client.field548) {
                                client.field547 = client.field548;
                            }
                            client.field329 = (short) field781[var5 + 2];
                            if (client.field329 <= 0) {
                                client.field329 = 1;
                            }
                            client.field517 = (short) field781[var5 + 3];
                            if (client.field517 <= 0) {
                                client.field517 = 32767;
                            } else if (client.field517 < client.field329) {
                                client.field517 = client.field329;
                            }
                            continue;
                        }
                        if (var464 == 6203) {
                            if (client.field460 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = -1;
                            } else {
                                client.method2221(0, 0, client.field460.field2764, client.field460.field2765, false);
                                field781[var5++] = client.field552;
                                field781[var5++] = client.field553;
                            }
                            continue;
                        }
                        if (var464 == 6204) {
                            field781[var5++] = client.field544;
                            field781[var5++] = client.field538;
                            continue;
                        }
                        if (var464 == 6205) {
                            field781[var5++] = client.field542;
                            field781[var5++] = client.field543;
                            continue;
                        }
                    }
                    if (var464 < 6600) {
                        if (var464 == 6500) {
                            field781[var5++] = class26.method1779() ? 1 : 0;
                            continue;
                        }
                        if (var464 == 6501) {
                            class26.field634 = 0;
                            class26 var448 = class26.method2045();
                            if (var448 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                            } else {
                                field781[var5++] = var448.field637;
                                field781[var5++] = var448.field641;
                                field790[var6++] = var448.field647;
                                field781[var5++] = var448.field642;
                                field781[var5++] = var448.field639;
                                field790[var6++] = var448.field638;
                            }
                            continue;
                        }
                        if (var464 == 6502) {
                            class26 var450 = class26.method2045();
                            if (var450 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                            } else {
                                field781[var5++] = var450.field637;
                                field781[var5++] = var450.field641;
                                field790[var6++] = var450.field647;
                                field781[var5++] = var450.field642;
                                field781[var5++] = var450.field639;
                                field790[var6++] = var450.field638;
                            }
                            continue;
                        }
                        if (var464 == 6506) {
                            var5--;
                            int var451 = field781[var5];
                            class26 var452 = null;
                            for (int var453 = 0; var453 < class26.field628; var453++) {
                                if (Statics.field636[var453].field637 == var451) {
                                    var452 = Statics.field636[var453];
                                    break;
                                }
                            }
                            if (var452 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field790[var6++] = "";
                            } else {
                                field781[var5++] = var452.field637;
                                field781[var5++] = var452.field641;
                                field790[var6++] = var452.field647;
                                field781[var5++] = var452.field642;
                                field781[var5++] = var452.field639;
                                field790[var6++] = var452.field638;
                            }
                            continue;
                        }
                        if (var464 == 6507) {
                            var5 -= 4;
                            int var454 = field781[var5];
                            boolean var455 = field781[var5 + 1] == 1;
                            int var456 = field781[var5 + 2];
                            boolean var457 = field781[var5 + 3] == 1;
                            class26.method1545(var454, var455, var456, var457);
                            continue;
                        }
                        if (var464 == 6511) {
                            var5--;
                            int var458 = field781[var5];
                            if (var458 >= 0 && var458 < class26.field628) {
                                class26 var459 = Statics.field636[var458];
                                field781[var5++] = var459.field637;
                                field781[var5++] = var459.field641;
                                field790[var6++] = var459.field647;
                                field781[var5++] = var459.field642;
                                field781[var5++] = var459.field639;
                                field790[var6++] = var459.field638;
                                continue;
                            }
                            field781[var5++] = -1;
                            field781[var5++] = 0;
                            field790[var6++] = "";
                            field781[var5++] = 0;
                            field781[var5++] = 0;
                            field790[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field400 = 250;
            }
        } catch (Exception var463) {
            StringBuilder var461 = new StringBuilder(30);
            var461.append("").append(var4.field3114).append(" ");
            for (int var462 = field775 - 1; var462 >= 0; var462--) {
                var461.append("").append(field784[var462].field214.field3114).append(" ");
            }
            var461.append("").append(var10);
            class149.method93(var461.toString(), var463);
        }
    }

    @ObfuscatedName("af.j(IB)V")
    public static void method704(int arg0) {
        if (arg0 == -1 || !class174.method1767(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2751[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2830 != null) {
                class1 var4 = new class1();
                var4.field11 = var3;
                var4.field13 = var3.field2830;
                method1948(var4, 2000000);
            }
        }
    }
}
