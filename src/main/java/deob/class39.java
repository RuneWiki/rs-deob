package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class39 {

    @ObfuscatedName("at.r")
    public static int[] field840 = new int[5];

    @ObfuscatedName("at.a")
    public static int[][] field841 = new int[5][5000];

    @ObfuscatedName("at.b")
    public static int[] field845 = new int[1000];

    @ObfuscatedName("at.u")
    public static String[] field846 = new String[1000];

    @ObfuscatedName("at.o")
    public static int field837 = 0;

    @ObfuscatedName("at.p")
    public static class15[] field849 = new class15[50];

    @ObfuscatedName("at.g")
    public static Calendar field847 = Calendar.getInstance();

    @ObfuscatedName("at.j")
    public static final String[] field844 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("at.w")
    public static int field848 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.e(Le;I)V")
    public static void method2918(class1 arg0) {
        method771(arg0, 200000);
    }

    @ObfuscatedName("ag.l(Le;II)V")
    public static void method771(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class24 var4 = class24.method1126(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field612;
        int[] var9 = var4.field613;
        byte var10 = -1;
        field837 = 0;
        try {
            Statics.field839 = new int[var4.field615];
            int var11 = 0;
            Statics.field73 = new String[var4.field616];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2795;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2796;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2795;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2796;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field839[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field73[var12++] = var15;
                }
            }
            int var16 = 0;
            field848 = arg0.field13;
            label3214: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var535 = var8[var7];
                if (var535 < 100) {
                    if (var535 == 0) {
                        field845[var5++] = var9[var7];
                        continue;
                    }
                    if (var535 == 1) {
                        int var17 = var9[var7];
                        field845[var5++] = class180.field2945[var17];
                        continue;
                    }
                    if (var535 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2945[var18] = field845[var5];
                        client.method2390(var18);
                        continue;
                    }
                    if (var535 == 3) {
                        field846[var6++] = var4.field621[var7];
                        continue;
                    }
                    if (var535 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var535 == 7) {
                        var5 -= 2;
                        if (field845[var5 + 1] != field845[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var535 == 8) {
                        var5 -= 2;
                        if (field845[var5 + 1] == field845[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var535 == 9) {
                        var5 -= 2;
                        if (field845[var5] < field845[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var535 == 10) {
                        var5 -= 2;
                        if (field845[var5] > field845[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var535 == 21) {
                        if (field837 == 0) {
                            return;
                        }
                        class15 var19 = field849[--field837];
                        var4 = var19.field224;
                        var8 = var4.field612;
                        var9 = var4.field613;
                        var7 = var19.field222;
                        Statics.field839 = var19.field223;
                        Statics.field73 = var19.field226;
                        continue;
                    }
                    if (var535 == 25) {
                        int var20 = var9[var7];
                        field845[var5++] = class180.method3258(var20);
                        continue;
                    }
                    if (var535 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field845[var5];
                        class51 var23 = (class51) class51.field1111.method3589((long) var21);
                        class51 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1116.method3130(14, var21);
                            class51 var26 = new class51();
                            if (var25 != null) {
                                var26.method1048(new class123(var25));
                            }
                            class51.field1111.method3591(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1113;
                        int var29 = var24.field1114;
                        int var30 = var24.field1115;
                        int var31 = class180.field2946[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class180.field2945[var28] = class180.field2945[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var535 == 31) {
                        var5 -= 2;
                        if (field845[var5] <= field845[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var535 == 32) {
                        var5 -= 2;
                        if (field845[var5] >= field845[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var535 == 33) {
                        field845[var5++] = Statics.field839[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var535 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field839[var10001] = field845[var5];
                        continue;
                    }
                    if (var535 == 35) {
                        field846[var6++] = Statics.field73[var9[var7]];
                        continue;
                    }
                    if (var535 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field73[var10001] = field846[var6];
                        continue;
                    }
                    if (var535 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field846;
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
                        field846[var6++] = var35;
                        continue;
                    }
                    if (var535 == 38) {
                        var5--;
                        continue;
                    }
                    if (var535 == 39) {
                        var6--;
                        continue;
                    }
                    if (var535 == 40) {
                        int var45 = var9[var7];
                        class24 var46 = class24.method1126(var45);
                        int[] var47 = new int[var46.field615];
                        String[] var48 = new String[var46.field616];
                        for (int var49 = 0; var49 < var46.field617; var49++) {
                            var47[var49] = field845[var5 - var46.field617 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field618; var50++) {
                            var48[var50] = field846[var6 - var46.field618 + var50];
                        }
                        var5 -= var46.field617;
                        var6 -= var46.field618;
                        class15 var51 = new class15();
                        var51.field224 = var4;
                        var51.field222 = var7;
                        var51.field223 = Statics.field839;
                        var51.field226 = Statics.field73;
                        field849[++field837 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field612;
                        var9 = var46.field613;
                        var7 = -1;
                        Statics.field839 = var47;
                        Statics.field73 = var48;
                        continue;
                    }
                    if (var535 == 42) {
                        field845[var5++] = Statics.field188.method183(var9[var7]);
                        continue;
                    }
                    if (var535 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field188.method187(var10001, field845[var5]);
                        continue;
                    }
                    if (var535 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field845[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field840[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label3214;
                                }
                                field841[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var535 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field845[var5];
                        if (var58 >= 0 && var58 < field840[var57]) {
                            field845[var5++] = field841[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var535 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field845[var5];
                        if (var60 >= 0 && var60 < field840[var59]) {
                            field841[var59][var60] = field845[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var535 == 47) {
                        String var61 = Statics.field188.method196(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field846[var6++] = var61;
                        continue;
                    }
                    if (var535 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field188.method171(var10001, field846[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var535 < 1000) {
                    if (var535 == 100) {
                        var5 -= 3;
                        int var63 = field845[var5];
                        int var64 = field845[var5 + 1];
                        int var65 = field845[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var66 = class177.method203(var63);
                        if (var66.field2828 == null) {
                            var66.field2828 = new class177[var65 + 1];
                        }
                        if (var66.field2828.length <= var65) {
                            class177[] var67 = new class177[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2828.length; var68++) {
                                var67[var68] = var66.field2828[var68];
                            }
                            var66.field2828 = var67;
                        }
                        if (var65 > 0 && var66.field2828[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class177 var69 = new class177();
                        var69.field2797 = var64;
                        var69.field2814 = var69.field2795 = var66.field2795;
                        var69.field2796 = var65;
                        var69.field2794 = true;
                        var66.field2828[var65] = var69;
                        if (var62) {
                            Statics.field843 = var69;
                        } else {
                            Statics.field726 = var69;
                        }
                        client.method1092(var66);
                        continue;
                    }
                    if (var535 == 101) {
                        class177 var70 = var62 ? Statics.field843 : Statics.field726;
                        class177 var71 = class177.method203(var70.field2795);
                        var71.field2828[var70.field2796] = null;
                        client.method1092(var71);
                        continue;
                    }
                    if (var535 == 102) {
                        var5--;
                        class177 var72 = class177.method203(field845[var5]);
                        var72.field2828 = null;
                        client.method1092(var72);
                        continue;
                    }
                    if (var535 == 200) {
                        var5 -= 2;
                        int var73 = field845[var5];
                        int var74 = field845[var5 + 1];
                        class177 var75 = class177.method2059(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field845[var5++] = 1;
                            if (var62) {
                                Statics.field843 = var75;
                            } else {
                                Statics.field726 = var75;
                            }
                            continue;
                        }
                        field845[var5++] = 0;
                        continue;
                    }
                    if (var535 == 201) {
                        var5--;
                        class177 var76 = class177.method203(field845[var5]);
                        if (var76 == null) {
                            field845[var5++] = 0;
                        } else {
                            field845[var5++] = 1;
                            if (var62) {
                                Statics.field843 = var76;
                            } else {
                                Statics.field726 = var76;
                            }
                        }
                        continue;
                    }
                } else if (!(var535 < 1000 || var535 >= 1100) || !(var535 < 2000 || var535 >= 2100)) {
                    int var77 = -1;
                    class177 var78;
                    if (var535 >= 2000) {
                        var535 -= 1000;
                        var5--;
                        var77 = field845[var5];
                        var78 = class177.method203(var77);
                    } else {
                        var78 = var62 ? Statics.field843 : Statics.field726;
                    }
                    if (var535 == 1000) {
                        var5 -= 4;
                        var78.field2804 = field845[var5];
                        var78.field2805 = field845[var5 + 1];
                        var78.field2800 = field845[var5 + 2];
                        var78.field2801 = field845[var5 + 3];
                        client.method1092(var78);
                        client.method2490(var78);
                        if (var77 != -1 && var78.field2797 == 0) {
                            client.method134(Statics.field2812[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var535 == 1001) {
                        var5 -= 4;
                        var78.field2806 = field845[var5];
                        var78.field2807 = field845[var5 + 1];
                        var78.field2824 = field845[var5 + 2];
                        var78.field2803 = field845[var5 + 3];
                        client.method1092(var78);
                        client.method2490(var78);
                        if (var77 != -1 && var78.field2797 == 0) {
                            client.method134(Statics.field2812[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var535 == 1003) {
                        var5--;
                        boolean var79 = field845[var5] == 1;
                        if (var78.field2815 != var79) {
                            var78.field2815 = var79;
                            client.method1092(var78);
                        }
                        continue;
                    }
                    if (var535 == 1005) {
                        var5--;
                        var78.field2928 = field845[var5] == 1;
                        continue;
                    }
                    if (var535 == 1006) {
                        var5--;
                        var78.field2929 = field845[var5] == 1;
                        continue;
                    }
                } else if (var535 >= 1100 && var535 < 1200 || var535 >= 2100 && var535 < 2200) {
                    int var80 = -1;
                    class177 var81;
                    if (var535 >= 2000) {
                        var535 -= 1000;
                        var5--;
                        var80 = field845[var5];
                        var81 = class177.method203(var80);
                    } else {
                        var81 = var62 ? Statics.field843 : Statics.field726;
                    }
                    if (var535 == 1100) {
                        var5 -= 2;
                        var81.field2816 = field845[var5];
                        if (var81.field2816 > var81.field2818 - var81.field2867) {
                            var81.field2816 = var81.field2818 - var81.field2867;
                        }
                        if (var81.field2816 < 0) {
                            var81.field2816 = 0;
                        }
                        var81.field2884 = field845[var5 + 1];
                        if (var81.field2884 > var81.field2868 - var81.field2811) {
                            var81.field2884 = var81.field2868 - var81.field2811;
                        }
                        if (var81.field2884 < 0) {
                            var81.field2884 = 0;
                        }
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1101) {
                        var5--;
                        var81.field2799 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1102) {
                        var5--;
                        var81.field2860 = field845[var5] == 1;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1103) {
                        var5--;
                        var81.field2866 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1104) {
                        var5--;
                        var81.field2848 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1105) {
                        var5--;
                        var81.field2830 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1106) {
                        var5--;
                        var81.field2832 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1107) {
                        var5--;
                        var81.field2833 = field845[var5] == 1;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1108) {
                        var81.field2838 = 1;
                        var5--;
                        var81.field2864 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1109) {
                        var5 -= 6;
                        var81.field2844 = field845[var5];
                        var81.field2839 = field845[var5 + 1];
                        var81.field2846 = field845[var5 + 2];
                        var81.field2847 = field845[var5 + 3];
                        var81.field2930 = field845[var5 + 4];
                        var81.field2849 = field845[var5 + 5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1110) {
                        var5--;
                        int var82 = field845[var5];
                        if (var81.field2842 != var82) {
                            var81.field2842 = var82;
                            var81.field2791 = 0;
                            var81.field2918 = 0;
                            client.method1092(var81);
                        }
                        continue;
                    }
                    if (var535 == 1111) {
                        var5--;
                        var81.field2852 = field845[var5] == 1;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1112) {
                        var6--;
                        String var83 = field846[var6];
                        if (!var83.equals(var81.field2845)) {
                            var81.field2845 = var83;
                            client.method1092(var81);
                        }
                        continue;
                    }
                    if (var535 == 1113) {
                        var5--;
                        var81.field2854 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1114) {
                        var5 -= 3;
                        var81.field2843 = field845[var5];
                        var81.field2855 = field845[var5 + 1];
                        var81.field2857 = field845[var5 + 2];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1115) {
                        var5--;
                        var81.field2897 = field845[var5] == 1;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1116) {
                        var5--;
                        var81.field2834 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1117) {
                        var5--;
                        var81.field2877 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1118) {
                        var5--;
                        var81.field2885 = field845[var5] == 1;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1119) {
                        var5--;
                        var81.field2837 = field845[var5] == 1;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1120) {
                        var5 -= 2;
                        var81.field2818 = field845[var5];
                        var81.field2868 = field845[var5 + 1];
                        client.method1092(var81);
                        if (var80 != -1 && var81.field2797 == 0) {
                            client.method134(Statics.field2812[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var535 == 1121) {
                        int var84 = var81.field2795;
                        int var85 = var81.field2796;
                        client.field337.method2708(2);
                        client.field337.method2586(var85);
                        client.field337.method2596(var84);
                        client.field372 = var81;
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1122) {
                        var5--;
                        var81.field2831 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1123) {
                        var5--;
                        var81.field2821 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1124) {
                        var5--;
                        var81.field2827 = field845[var5];
                        client.method1092(var81);
                        continue;
                    }
                    if (var535 == 1125) {
                        var5--;
                        int var86 = field845[var5];
                        class86[] var87 = new class86[] { class86.field1497, class86.field1494, class86.field1496, class86.field1498, class86.field1505 };
                        class86 var88 = (class86) class113.method576(var87, var86);
                        if (var88 != null) {
                            var81.field2910 = var88;
                            client.method1092(var81);
                        }
                        continue;
                    }
                } else if (!(var535 < 1200 || var535 >= 1300) || !(var535 < 2200 || var535 >= 2300)) {
                    class177 var89;
                    if (var535 >= 2000) {
                        var535 -= 1000;
                        var5--;
                        var89 = class177.method203(field845[var5]);
                    } else {
                        var89 = var62 ? Statics.field843 : Statics.field726;
                    }
                    client.method1092(var89);
                    if (var535 == 1200 || var535 == 1205 || var535 == 1212) {
                        var5 -= 2;
                        int var90 = field845[var5];
                        int var91 = field845[var5 + 1];
                        var89.field2915 = var90;
                        var89.field2916 = var91;
                        class56 var92 = class56.method104(var90);
                        var89.field2846 = var92.field1201;
                        var89.field2847 = var92.field1187;
                        var89.field2930 = var92.field1192;
                        var89.field2844 = var92.field1193;
                        var89.field2839 = var92.field1194;
                        var89.field2849 = var92.field1196;
                        if (var535 == 1205) {
                            var89.field2853 = 0;
                        } else if (var535 == 1212 | var92.field1195 == 1) {
                            var89.field2853 = 1;
                        } else {
                            var89.field2853 = 2;
                        }
                        if (var89.field2850 > 0) {
                            var89.field2849 = var89.field2849 * 32 / var89.field2850;
                        } else if (var89.field2806 > 0) {
                            var89.field2849 = var89.field2849 * 32 / var89.field2806;
                        }
                        continue;
                    }
                    if (var535 == 1201) {
                        var89.field2838 = 2;
                        var5--;
                        var89.field2864 = field845[var5];
                        continue;
                    }
                    if (var535 == 1202) {
                        var89.field2838 = 3;
                        var89.field2864 = Statics.field2036.field54.method3361();
                        continue;
                    }
                } else if (var535 >= 1300 && var535 < 1400 || var535 >= 2300 && var535 < 2400) {
                    class177 var93;
                    if (var535 >= 2000) {
                        var535 -= 1000;
                        var5--;
                        var93 = class177.method203(field845[var5]);
                    } else {
                        var93 = var62 ? Statics.field843 : Statics.field726;
                    }
                    if (var535 == 1300) {
                        var5--;
                        int var94 = field845[var5] - 1;
                        if (var94 >= 0 && var94 <= 9) {
                            var6--;
                            var93.method3277(var94, field846[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var535 == 1301) {
                        var5 -= 2;
                        int var95 = field845[var5];
                        int var96 = field845[var5 + 1];
                        var93.field2870 = class177.method2059(var95, var96);
                        continue;
                    }
                    if (var535 == 1302) {
                        var5--;
                        var93.field2911 = field845[var5] == 1;
                        continue;
                    }
                    if (var535 == 1303) {
                        var5--;
                        var93.field2871 = field845[var5];
                        continue;
                    }
                    if (var535 == 1304) {
                        var5--;
                        var93.field2836 = field845[var5];
                        continue;
                    }
                    if (var535 == 1305) {
                        var6--;
                        var93.field2923 = field846[var6];
                        continue;
                    }
                    if (var535 == 1306) {
                        var6--;
                        var93.field2874 = field846[var6];
                        continue;
                    }
                    if (var535 == 1307) {
                        var93.field2869 = null;
                        continue;
                    }
                } else {
                    if (var535 >= 1400 && var535 < 1500 || var535 >= 2400 && var535 < 2500) {
                        class177 var97;
                        if (var535 >= 2000) {
                            var535 -= 1000;
                            var5--;
                            var97 = class177.method203(field845[var5]);
                        } else {
                            var97 = var62 ? Statics.field843 : Statics.field726;
                        }
                        var6--;
                        String var98 = field846[var6];
                        int[] var99 = null;
                        if (var98.length() > 0 && var98.charAt(var98.length() - 1) == 'Y') {
                            var5--;
                            int var100 = field845[var5];
                            if (var100 > 0) {
                                var99 = new int[var100];
                                while (var100-- > 0) {
                                    var5--;
                                    var99[var100] = field845[var5];
                                }
                            }
                            var98 = var98.substring(0, var98.length() - 1);
                        }
                        Object[] var101 = new Object[var98.length() + 1];
                        for (int var102 = var101.length - 1; var102 >= 1; var102--) {
                            if (var98.charAt(var102 - 1) == 's') {
                                var6--;
                                var101[var102] = field846[var6];
                            } else {
                                var5--;
                                var101[var102] = Integer.valueOf(field845[var5]);
                            }
                        }
                        var5--;
                        int var103 = field845[var5];
                        if (var103 == -1) {
                            var101 = null;
                        } else {
                            var101[0] = Integer.valueOf(var103);
                        }
                        if (var535 == 1400) {
                            var97.field2927 = var101;
                        }
                        if (var535 == 1401) {
                            var97.field2880 = var101;
                        }
                        if (var535 == 1402) {
                            var97.field2879 = var101;
                        }
                        if (var535 == 1403) {
                            var97.field2865 = var101;
                        }
                        if (var535 == 1404) {
                            var97.field2883 = var101;
                        }
                        if (var535 == 1405) {
                            var97.field2798 = var101;
                        }
                        if (var535 == 1406) {
                            var97.field2914 = var101;
                        }
                        if (var535 == 1407) {
                            var97.field2859 = var101;
                            var97.field2889 = var99;
                        }
                        if (var535 == 1408) {
                            var97.field2840 = var101;
                        }
                        if (var535 == 1409) {
                            var97.field2895 = var101;
                        }
                        if (var535 == 1410) {
                            var97.field2793 = var101;
                        }
                        if (var535 == 1411) {
                            var97.field2826 = var101;
                        }
                        if (var535 == 1412) {
                            var97.field2882 = var101;
                        }
                        if (var535 == 1414) {
                            var97.field2890 = var101;
                            var97.field2891 = var99;
                        }
                        if (var535 == 1415) {
                            var97.field2841 = var101;
                            var97.field2893 = var99;
                        }
                        if (var535 == 1416) {
                            var97.field2886 = var101;
                        }
                        if (var535 == 1417) {
                            var97.field2896 = var101;
                        }
                        if (var535 == 1418) {
                            var97.field2820 = var101;
                        }
                        if (var535 == 1419) {
                            var97.field2898 = var101;
                        }
                        if (var535 == 1420) {
                            var97.field2899 = var101;
                        }
                        if (var535 == 1421) {
                            var97.field2900 = var101;
                        }
                        if (var535 == 1422) {
                            var97.field2901 = var101;
                        }
                        if (var535 == 1423) {
                            var97.field2902 = var101;
                        }
                        if (var535 == 1424) {
                            var97.field2862 = var101;
                        }
                        if (var535 == 1425) {
                            var97.field2892 = var101;
                        }
                        if (var535 == 1426) {
                            var97.field2906 = var101;
                        }
                        if (var535 == 1427) {
                            var97.field2904 = var101;
                        }
                        var97.field2875 = true;
                        continue;
                    }
                    if (var535 < 1600) {
                        class177 var104 = var62 ? Statics.field843 : Statics.field726;
                        if (var535 == 1500) {
                            field845[var5++] = var104.field2808;
                            continue;
                        }
                        if (var535 == 1501) {
                            field845[var5++] = var104.field2809;
                            continue;
                        }
                        if (var535 == 1502) {
                            field845[var5++] = var104.field2867;
                            continue;
                        }
                        if (var535 == 1503) {
                            field845[var5++] = var104.field2811;
                            continue;
                        }
                        if (var535 == 1504) {
                            field845[var5++] = var104.field2815 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 1505) {
                            field845[var5++] = var104.field2814;
                            continue;
                        }
                    } else if (var535 < 1700) {
                        class177 var105 = var62 ? Statics.field843 : Statics.field726;
                        if (var535 == 1600) {
                            field845[var5++] = var105.field2816;
                            continue;
                        }
                        if (var535 == 1601) {
                            field845[var5++] = var105.field2884;
                            continue;
                        }
                        if (var535 == 1602) {
                            field846[var6++] = var105.field2845;
                            continue;
                        }
                        if (var535 == 1603) {
                            field845[var5++] = var105.field2818;
                            continue;
                        }
                        if (var535 == 1604) {
                            field845[var5++] = var105.field2868;
                            continue;
                        }
                        if (var535 == 1605) {
                            field845[var5++] = var105.field2849;
                            continue;
                        }
                        if (var535 == 1606) {
                            field845[var5++] = var105.field2846;
                            continue;
                        }
                        if (var535 == 1607) {
                            field845[var5++] = var105.field2930;
                            continue;
                        }
                        if (var535 == 1608) {
                            field845[var5++] = var105.field2847;
                            continue;
                        }
                        if (var535 == 1609) {
                            field845[var5++] = var105.field2866;
                            continue;
                        }
                        if (var535 == 1610) {
                            field845[var5++] = var105.field2827;
                            continue;
                        }
                        if (var535 == 1611) {
                            field845[var5++] = var105.field2799;
                            continue;
                        }
                        if (var535 == 1612) {
                            field845[var5++] = var105.field2821;
                            continue;
                        }
                        if (var535 == 1613) {
                            field845[var5++] = var105.field2910.method534();
                            continue;
                        }
                    } else if (var535 < 1800) {
                        class177 var106 = var62 ? Statics.field843 : Statics.field726;
                        if (var535 == 1700) {
                            field845[var5++] = var106.field2915;
                            continue;
                        }
                        if (var535 == 1701) {
                            if (var106.field2915 == -1) {
                                field845[var5++] = 0;
                            } else {
                                field845[var5++] = var106.field2916;
                            }
                            continue;
                        }
                        if (var535 == 1702) {
                            field845[var5++] = var106.field2796;
                            continue;
                        }
                    } else if (var535 < 1900) {
                        class177 var107 = var62 ? Statics.field843 : Statics.field726;
                        if (var535 == 1800) {
                            field845[var5++] = class182.method3384(client.method635(var107));
                            continue;
                        }
                        if (var535 == 1801) {
                            var5--;
                            int var108 = field845[var5];
                            int var536 = var108 - 1;
                            if (var107.field2869 != null && var536 < var107.field2869.length && var107.field2869[var536] != null) {
                                field846[var6++] = var107.field2869[var536];
                                continue;
                            }
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 1802) {
                            if (var107.field2923 == null) {
                                field846[var6++] = "";
                            } else {
                                field846[var6++] = var107.field2923;
                            }
                            continue;
                        }
                    } else if (!(var535 < 1900 || var535 >= 2000) || !(var535 < 2900 || var535 >= 3000)) {
                        class177 var109;
                        if (var535 >= 2000) {
                            var535 -= 1000;
                            var5--;
                            var109 = class177.method203(field845[var5]);
                        } else {
                            var109 = var62 ? Statics.field843 : Statics.field726;
                        }
                        if (var535 == 1927) {
                            if (field848 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var109.field2904 == null) {
                                return;
                            }
                            class1 var110 = new class1();
                            var110.field3 = var109;
                            var110.field5 = var109.field2904;
                            var110.field13 = field848 + 1;
                            client.field358.method3650(arg0);
                            continue;
                        }
                    } else if (var535 < 2600) {
                        var5--;
                        class177 var111 = class177.method203(field845[var5]);
                        if (var535 == 2500) {
                            field845[var5++] = var111.field2808;
                            continue;
                        }
                        if (var535 == 2501) {
                            field845[var5++] = var111.field2809;
                            continue;
                        }
                        if (var535 == 2502) {
                            field845[var5++] = var111.field2867;
                            continue;
                        }
                        if (var535 == 2503) {
                            field845[var5++] = var111.field2811;
                            continue;
                        }
                        if (var535 == 2504) {
                            field845[var5++] = var111.field2815 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 2505) {
                            field845[var5++] = var111.field2814;
                            continue;
                        }
                    } else if (var535 < 2700) {
                        var5--;
                        class177 var112 = class177.method203(field845[var5]);
                        if (var535 == 2600) {
                            field845[var5++] = var112.field2816;
                            continue;
                        }
                        if (var535 == 2601) {
                            field845[var5++] = var112.field2884;
                            continue;
                        }
                        if (var535 == 2602) {
                            field846[var6++] = var112.field2845;
                            continue;
                        }
                        if (var535 == 2603) {
                            field845[var5++] = var112.field2818;
                            continue;
                        }
                        if (var535 == 2604) {
                            field845[var5++] = var112.field2868;
                            continue;
                        }
                        if (var535 == 2605) {
                            field845[var5++] = var112.field2849;
                            continue;
                        }
                        if (var535 == 2606) {
                            field845[var5++] = var112.field2846;
                            continue;
                        }
                        if (var535 == 2607) {
                            field845[var5++] = var112.field2930;
                            continue;
                        }
                        if (var535 == 2608) {
                            field845[var5++] = var112.field2847;
                            continue;
                        }
                        if (var535 == 2609) {
                            field845[var5++] = var112.field2866;
                            continue;
                        }
                        if (var535 == 2610) {
                            field845[var5++] = var112.field2827;
                            continue;
                        }
                        if (var535 == 2611) {
                            field845[var5++] = var112.field2799;
                            continue;
                        }
                        if (var535 == 2612) {
                            field845[var5++] = var112.field2821;
                            continue;
                        }
                        if (var535 == 2613) {
                            field845[var5++] = var112.field2910.method534();
                            continue;
                        }
                    } else if (var535 < 2800) {
                        if (var535 == 2700) {
                            var5--;
                            class177 var113 = class177.method203(field845[var5]);
                            field845[var5++] = var113.field2915;
                            continue;
                        }
                        if (var535 == 2701) {
                            var5--;
                            class177 var114 = class177.method203(field845[var5]);
                            if (var114.field2915 == -1) {
                                field845[var5++] = 0;
                            } else {
                                field845[var5++] = var114.field2916;
                            }
                            continue;
                        }
                        if (var535 == 2702) {
                            var5--;
                            int var115 = field845[var5];
                            class4 var116 = (class4) client.field456.method3619((long) var115);
                            if (var116 == null) {
                                field845[var5++] = 0;
                            } else {
                                field845[var5++] = 1;
                            }
                            continue;
                        }
                        if (var535 == 2706) {
                            field845[var5++] = client.field455;
                            continue;
                        }
                    } else if (var535 < 2900) {
                        var5--;
                        class177 var117 = class177.method203(field845[var5]);
                        if (var535 == 2800) {
                            field845[var5++] = class182.method3384(client.method635(var117));
                            continue;
                        }
                        if (var535 == 2801) {
                            var5--;
                            int var118 = field845[var5];
                            int var537 = var118 - 1;
                            if (var117.field2869 != null && var537 < var117.field2869.length && var117.field2869[var537] != null) {
                                field846[var6++] = var117.field2869[var537];
                                continue;
                            }
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 2802) {
                            if (var117.field2923 == null) {
                                field846[var6++] = "";
                            } else {
                                field846[var6++] = var117.field2923;
                            }
                            continue;
                        }
                    } else if (var535 < 3200) {
                        if (var535 == 3100) {
                            var6--;
                            String var119 = field846[var6];
                            class12.method577(0, "", var119);
                            continue;
                        }
                        if (var535 == 3101) {
                            var5 -= 2;
                            client.method2385(Statics.field2036, field845[var5], field845[var5 + 1]);
                            continue;
                        }
                        if (var535 == 3103) {
                            client.method804();
                            continue;
                        }
                        if (var535 == 3104) {
                            var6--;
                            String var120 = field846[var6];
                            int var121 = 0;
                            boolean var122 = false;
                            boolean var123 = false;
                            int var124 = 0;
                            int var125 = var120.length();
                            int var126 = 0;
                            boolean var128;
                            while (true) {
                                if (var126 >= var125) {
                                    var128 = var123;
                                    break;
                                }
                                label3488: {
                                    char var127 = var120.charAt(var126);
                                    if (var126 == 0) {
                                        if (var127 == '-') {
                                            var122 = true;
                                            break label3488;
                                        }
                                        if (var127 == '+') {
                                            break label3488;
                                        }
                                    }
                                    int var538;
                                    if (var127 >= '0' && var127 <= '9') {
                                        var538 = var127 - '0';
                                    } else if (var127 >= 'A' && var127 <= 'Z') {
                                        var538 = var127 - '7';
                                    } else {
                                        if (var127 < 'a' || var127 > 'z') {
                                            var128 = false;
                                            break;
                                        }
                                        var538 = var127 - 'W';
                                    }
                                    if (var538 >= 10) {
                                        var128 = false;
                                        break;
                                    }
                                    if (var122) {
                                        var538 = -var538;
                                    }
                                    int var129 = var124 * 10 + var538;
                                    if (var129 / 10 != var124) {
                                        var128 = false;
                                        break;
                                    }
                                    var124 = var129;
                                    var123 = true;
                                }
                                var126++;
                            }
                            if (var128) {
                                var121 = class167.method1014(var120);
                            }
                            client.field337.method2708(245);
                            client.field337.method2452(var121);
                            continue;
                        }
                        if (var535 == 3105) {
                            var6--;
                            String var131 = field846[var6];
                            client.field337.method2708(154);
                            client.field337.method2649(var131.length() + 1);
                            client.field337.method2455(var131);
                            continue;
                        }
                        if (var535 == 3106) {
                            var6--;
                            String var132 = field846[var6];
                            client.field337.method2708(253);
                            client.field337.method2649(var132.length() + 1);
                            client.field337.method2455(var132);
                            continue;
                        }
                        if (var535 == 3107) {
                            var5--;
                            int var133 = field845[var5];
                            var6--;
                            String var134 = field846[var6];
                            client.method3777(var133, var134);
                            continue;
                        }
                        if (var535 == 3108) {
                            var5 -= 3;
                            int var135 = field845[var5];
                            int var136 = field845[var5 + 1];
                            int var137 = field845[var5 + 2];
                            class177 var138 = class177.method203(var137);
                            client.method890(var138, var135, var136);
                            continue;
                        }
                        if (var535 == 3109) {
                            var5 -= 2;
                            int var139 = field845[var5];
                            int var140 = field845[var5 + 1];
                            class177 var141 = var62 ? Statics.field843 : Statics.field726;
                            client.method890(var141, var139, var140);
                            continue;
                        }
                        if (var535 == 3110) {
                            var5--;
                            Statics.field470 = field845[var5] == 1;
                            continue;
                        }
                        if (var535 == 3111) {
                            field845[var5++] = Statics.field572.field154 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3112) {
                            var5--;
                            Statics.field572.field154 = field845[var5] == 1;
                            class9.method1030();
                            continue;
                        }
                        if (var535 == 3113) {
                            var6--;
                            String var142 = field846[var6];
                            var5--;
                            boolean var143 = field845[var5] == 1;
                            class142.method2707(var142, var143, "openjs", false);
                            continue;
                        }
                        if (var535 == 3115) {
                            var5--;
                            int var144 = field845[var5];
                            client.field337.method2708(78);
                            client.field337.method2635(var144);
                            continue;
                        }
                        if (var535 == 3116) {
                            var5--;
                            int var145 = field845[var5];
                            var6 -= 2;
                            String var146 = field846[var6];
                            String var147 = field846[var6 + 1];
                            if (var146.length() <= 500 && var147.length() <= 500) {
                                client.field337.method2708(93);
                                client.field337.method2635(1 + class123.method641(var146) + class123.method641(var147));
                                client.field337.method2455(var147);
                                client.field337.method2659(var145);
                                client.field337.method2455(var146);
                            }
                            continue;
                        }
                    } else if (var535 < 3300) {
                        if (var535 == 3200) {
                            var5 -= 3;
                            client.method2783(field845[var5], field845[var5 + 1], field845[var5 + 2]);
                            continue;
                        }
                        if (var535 == 3201) {
                            var5--;
                            int var148 = field845[var5];
                            if (var148 == -1 && !client.field412) {
                                class187.method2055();
                            } else if (var148 != -1 && client.field534 != var148 && client.field355 != 0 && !client.field412) {
                                class187.method1880(2, Statics.field1949, var148, 0, client.field355, false);
                            }
                            client.field534 = var148;
                            continue;
                        }
                        if (var535 == 3202) {
                            var5 -= 2;
                            client.method3017(field845[var5], field845[var5 + 1]);
                            continue;
                        }
                    } else if (var535 < 3400) {
                        if (var535 == 3300) {
                            field845[var5++] = client.field568;
                            continue;
                        }
                        if (var535 == 3301) {
                            var5 -= 2;
                            int var149 = field845[var5];
                            int var150 = field845[var5 + 1];
                            int[] var151 = field845;
                            int var152 = var5++;
                            class16 var153 = (class16) class16.field228.method3619((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = -1;
                            } else if (var150 >= 0 && var150 < var153.field227.length) {
                                var154 = var153.field227[var150];
                            } else {
                                var154 = -1;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var535 == 3302) {
                            var5 -= 2;
                            int var155 = field845[var5];
                            int var156 = field845[var5 + 1];
                            int[] var157 = field845;
                            int var158 = var5++;
                            class16 var159 = (class16) class16.field228.method3619((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = 0;
                            } else if (var156 >= 0 && var156 < var159.field229.length) {
                                var160 = var159.field229[var156];
                            } else {
                                var160 = 0;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var535 == 3303) {
                            var5 -= 2;
                            int var161 = field845[var5];
                            int var162 = field845[var5 + 1];
                            int[] var163 = field845;
                            int var164 = var5++;
                            class16 var165 = (class16) class16.field228.method3619((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = 0;
                            } else if (var162 == -1) {
                                var166 = 0;
                            } else {
                                int var167 = 0;
                                for (int var168 = 0; var168 < var165.field229.length; var168++) {
                                    if (var165.field227[var168] == var162) {
                                        var167 += var165.field229[var168];
                                    }
                                }
                                var166 = var167;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var535 == 3304) {
                            var5--;
                            int var169 = field845[var5];
                            int[] var170 = field845;
                            int var171 = var5++;
                            class55 var172 = (class55) class55.field1166.method3589((long) var169);
                            class55 var173;
                            if (var172 == null) {
                                byte[] var174 = Statics.field1170.method3130(5, var169);
                                class55 var175 = new class55();
                                if (var174 != null) {
                                    var175.method1127(new class123(var174));
                                }
                                class55.field1166.method3591(var175, (long) var169);
                                var173 = var175;
                            } else {
                                var173 = var172;
                            }
                            var170[var171] = var173.field1169;
                            continue;
                        }
                        if (var535 == 3305) {
                            var5--;
                            int var176 = field845[var5];
                            field845[var5++] = client.field338[var176];
                            continue;
                        }
                        if (var535 == 3306) {
                            var5--;
                            int var177 = field845[var5];
                            field845[var5++] = client.field432[var177];
                            continue;
                        }
                        if (var535 == 3307) {
                            var5--;
                            int var178 = field845[var5];
                            field845[var5++] = client.field433[var178];
                            continue;
                        }
                        if (var535 == 3308) {
                            int var179 = Statics.field1120;
                            int var180 = (Statics.field2036.field897 >> 7) + Statics.field287;
                            int var181 = (Statics.field2036.field880 >> 7) + Statics.field129;
                            field845[var5++] = (var179 << 28) + (var180 << 14) + var181;
                            continue;
                        }
                        if (var535 == 3309) {
                            var5--;
                            int var182 = field845[var5];
                            field845[var5++] = var182 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var535 == 3310) {
                            var5--;
                            int var183 = field845[var5];
                            field845[var5++] = var183 >> 28;
                            continue;
                        }
                        if (var535 == 3311) {
                            var5--;
                            int var184 = field845[var5];
                            field845[var5++] = var184 & 0x3FFF;
                            continue;
                        }
                        if (var535 == 3312) {
                            field845[var5++] = client.field389 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3313) {
                            var5 -= 2;
                            int var185 = field845[var5] + 32768;
                            int var186 = field845[var5 + 1];
                            int[] var187 = field845;
                            int var188 = var5++;
                            class16 var189 = (class16) class16.field228.method3619((long) var185);
                            int var190;
                            if (var189 == null) {
                                var190 = -1;
                            } else if (var186 >= 0 && var186 < var189.field227.length) {
                                var190 = var189.field227[var186];
                            } else {
                                var190 = -1;
                            }
                            var187[var188] = var190;
                            continue;
                        }
                        if (var535 == 3314) {
                            var5 -= 2;
                            int var191 = field845[var5] + 32768;
                            int var192 = field845[var5 + 1];
                            int[] var193 = field845;
                            int var194 = var5++;
                            class16 var195 = (class16) class16.field228.method3619((long) var191);
                            int var196;
                            if (var195 == null) {
                                var196 = 0;
                            } else if (var192 >= 0 && var192 < var195.field229.length) {
                                var196 = var195.field229[var192];
                            } else {
                                var196 = 0;
                            }
                            var193[var194] = var196;
                            continue;
                        }
                        if (var535 == 3315) {
                            var5 -= 2;
                            int var197 = field845[var5] + 32768;
                            int var198 = field845[var5 + 1];
                            int[] var199 = field845;
                            int var200 = var5++;
                            class16 var201 = (class16) class16.field228.method3619((long) var197);
                            int var202;
                            if (var201 == null) {
                                var202 = 0;
                            } else if (var198 == -1) {
                                var202 = 0;
                            } else {
                                int var203 = 0;
                                for (int var204 = 0; var204 < var201.field229.length; var204++) {
                                    if (var201.field227[var204] == var198) {
                                        var203 += var201.field229[var204];
                                    }
                                }
                                var202 = var203;
                            }
                            var199[var200] = var202;
                            continue;
                        }
                        if (var535 == 3316) {
                            if (client.field440 >= 2) {
                                field845[var5++] = client.field440;
                            } else {
                                field845[var5++] = 0;
                            }
                            continue;
                        }
                        if (var535 == 3317) {
                            field845[var5++] = client.field311;
                            continue;
                        }
                        if (var535 == 3318) {
                            field845[var5++] = client.field469;
                            continue;
                        }
                        if (var535 == 3321) {
                            field845[var5++] = client.field490;
                            continue;
                        }
                        if (var535 == 3322) {
                            field845[var5++] = client.field461;
                            continue;
                        }
                        if (var535 == 3323) {
                            if (client.field464) {
                                field845[var5++] = 1;
                            } else {
                                field845[var5++] = 0;
                            }
                            continue;
                        }
                        if (var535 == 3324) {
                            field845[var5++] = client.field293;
                            continue;
                        }
                    } else if (var535 < 3500) {
                        if (var535 == 3400) {
                            var5 -= 2;
                            int var205 = field845[var5];
                            int var206 = field845[var5 + 1];
                            class53 var207 = (class53) class53.field1146.method3589((long) var205);
                            class53 var208;
                            if (var207 == null) {
                                byte[] var209 = Statics.field1153.method3130(8, var205);
                                class53 var210 = new class53();
                                if (var209 != null) {
                                    var210.method1093(new class123(var209));
                                }
                                class53.field1146.method3591(var210, (long) var205);
                                var208 = var210;
                            } else {
                                var208 = var207;
                            }
                            class53 var211 = var208;
                            if (var208.field1148 != 's') {
                            }
                            for (int var212 = 0; var212 < var211.field1151; var212++) {
                                if (var211.field1154[var212] == var206) {
                                    field846[var6++] = var211.field1158[var212];
                                    var211 = null;
                                    break;
                                }
                            }
                            if (var211 != null) {
                                field846[var6++] = var211.field1149;
                            }
                            continue;
                        }
                        if (var535 == 3408) {
                            var5 -= 4;
                            int var213 = field845[var5];
                            int var214 = field845[var5 + 1];
                            int var215 = field845[var5 + 2];
                            int var216 = field845[var5 + 3];
                            class53 var217 = (class53) class53.field1146.method3589((long) var215);
                            class53 var218;
                            if (var217 == null) {
                                byte[] var219 = Statics.field1153.method3130(8, var215);
                                class53 var220 = new class53();
                                if (var219 != null) {
                                    var220.method1093(new class123(var219));
                                }
                                class53.field1146.method3591(var220, (long) var215);
                                var218 = var220;
                            } else {
                                var218 = var217;
                            }
                            class53 var221 = var218;
                            if (var218.field1156 == var213 && var218.field1148 == var214) {
                                for (int var222 = 0; var222 < var221.field1151; var222++) {
                                    if (var221.field1154[var222] == var216) {
                                        if (var214 == 115) {
                                            field846[var6++] = var221.field1158[var222];
                                        } else {
                                            field845[var5++] = var221.field1145[var222];
                                        }
                                        var221 = null;
                                        break;
                                    }
                                }
                                if (var221 != null) {
                                    if (var214 == 115) {
                                        field846[var6++] = var221.field1149;
                                    } else {
                                        field845[var5++] = var221.field1147;
                                    }
                                }
                                continue;
                            }
                            if (var214 == 115) {
                                field846[var6++] = "null";
                            } else {
                                field845[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var535 < 3700) {
                        if (var535 == 3600) {
                            if (client.field417 == 0) {
                                field845[var5++] = -2;
                            } else if (client.field417 == 1) {
                                field845[var5++] = -1;
                            } else {
                                field845[var5++] = client.field512;
                            }
                            continue;
                        }
                        if (var535 == 3601) {
                            var5--;
                            int var223 = field845[var5];
                            if (client.field417 == 2 && var223 < client.field512) {
                                field846[var6++] = client.field565[var223].field254;
                                field846[var6++] = client.field565[var223].field258;
                                continue;
                            }
                            field846[var6++] = "";
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 3602) {
                            var5--;
                            int var224 = field845[var5];
                            if (client.field417 == 2 && var224 < client.field512) {
                                field845[var5++] = client.field565[var224].field250;
                                continue;
                            }
                            field845[var5++] = 0;
                            continue;
                        }
                        if (var535 == 3603) {
                            var5--;
                            int var225 = field845[var5];
                            if (client.field417 == 2 && var225 < client.field512) {
                                field845[var5++] = client.field565[var225].field249;
                                continue;
                            }
                            field845[var5++] = 0;
                            continue;
                        }
                        if (var535 == 3604) {
                            var6--;
                            String var226 = field846[var6];
                            var5--;
                            int var227 = field845[var5];
                            client.method593(var226, var227);
                            continue;
                        }
                        if (var535 == 3605) {
                            var6--;
                            String var228 = field846[var6];
                            client.method1584(var228);
                            continue;
                        }
                        if (var535 == 3606) {
                            var6--;
                            String var229 = field846[var6];
                            client.method794(var229);
                            continue;
                        }
                        if (var535 == 3607) {
                            var6--;
                            String var230 = field846[var6];
                            client.method2784(var230, false);
                            continue;
                        }
                        if (var535 == 3608) {
                            var6--;
                            String var231 = field846[var6];
                            if (var231 == null) {
                                continue;
                            }
                            String var232 = class168.method158(var231, Statics.field297);
                            if (var232 == null) {
                                continue;
                            }
                            int var233 = 0;
                            while (true) {
                                if (var233 >= client.field347) {
                                    continue label3214;
                                }
                                class8 var234 = client.field561[var233];
                                String var235 = var234.field142;
                                String var236 = class168.method158(var235, Statics.field297);
                                if (class133.method1016(var231, var232, var235, var236)) {
                                    client.field347--;
                                    for (int var237 = var233; var237 < client.field347; var237++) {
                                        client.field561[var237] = client.field561[var237 + 1];
                                    }
                                    client.field516 = client.field507;
                                    client.field337.method2708(130);
                                    client.field337.method2649(class123.method641(var231));
                                    client.field337.method2455(var231);
                                    continue label3214;
                                }
                                var233++;
                            }
                        }
                        if (var535 == 3609) {
                            var6--;
                            String var238 = field846[var6];
                            class156[] var239 = new class156[] { class156.field2314, class156.field2311, class156.field2321, class156.field2310, class156.field2312 };
                            class156[] var240 = var239;
                            for (int var241 = 0; var241 < var240.length; var241++) {
                                class156 var242 = var240[var241];
                                if (var242.field2315 != -1) {
                                    int var244 = var242.field2315;
                                    String var245 = "<img=" + var244 + ">";
                                    if (var238.startsWith(var245)) {
                                        var238 = var238.substring(6 + Integer.toString(var242.field2315).length());
                                        break;
                                    }
                                }
                            }
                            field845[var5++] = client.method1583(var238, false) ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3611) {
                            if (client.field523 == null) {
                                field846[var6++] = "";
                            } else {
                                String[] var246 = field846;
                                int var247 = var6++;
                                String var248 = client.field523;
                                String var249 = class166.method731(class166.method135(var248));
                                if (var249 == null) {
                                    var249 = "";
                                }
                                var246[var247] = var249;
                            }
                            continue;
                        }
                        if (var535 == 3612) {
                            if (client.field523 == null) {
                                field845[var5++] = 0;
                            } else {
                                field845[var5++] = Statics.field597;
                            }
                            continue;
                        }
                        if (var535 == 3613) {
                            var5--;
                            int var251 = field845[var5];
                            if (client.field523 != null && var251 < Statics.field597) {
                                field846[var6++] = Statics.field604[var251].field647;
                                continue;
                            }
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 3614) {
                            var5--;
                            int var252 = field845[var5];
                            if (client.field523 != null && var252 < Statics.field597) {
                                field845[var5++] = Statics.field604[var252].field649;
                                continue;
                            }
                            field845[var5++] = 0;
                            continue;
                        }
                        if (var535 == 3615) {
                            var5--;
                            int var253 = field845[var5];
                            if (client.field523 != null && var253 < Statics.field597) {
                                field845[var5++] = Statics.field604[var253].field650;
                                continue;
                            }
                            field845[var5++] = 0;
                            continue;
                        }
                        if (var535 == 3616) {
                            field845[var5++] = Statics.field143;
                            continue;
                        }
                        if (var535 == 3617) {
                            var6--;
                            String var254 = field846[var6];
                            client.method950(var254);
                            continue;
                        }
                        if (var535 == 3618) {
                            field845[var5++] = Statics.field298;
                            continue;
                        }
                        if (var535 == 3619) {
                            var6--;
                            String var255 = field846[var6];
                            if (!var255.equals("")) {
                                client.field337.method2708(40);
                                client.field337.method2649(class123.method641(var255));
                                client.field337.method2455(var255);
                            }
                            continue;
                        }
                        if (var535 == 3620) {
                            client.field337.method2708(40);
                            client.field337.method2649(0);
                            continue;
                        }
                        if (var535 == 3621) {
                            if (client.field417 == 0) {
                                field845[var5++] = -1;
                            } else {
                                field845[var5++] = client.field347;
                            }
                            continue;
                        }
                        if (var535 == 3622) {
                            var5--;
                            int var256 = field845[var5];
                            if (client.field417 != 0 && var256 < client.field347) {
                                field846[var6++] = client.field561[var256].field142;
                                field846[var6++] = client.field561[var256].field132;
                                continue;
                            }
                            field846[var6++] = "";
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 3623) {
                            String var257;
                            label2884: {
                                var6--;
                                var257 = field846[var6];
                                String var259 = "<img=0>";
                                if (!var257.startsWith(var259)) {
                                    String var261 = "<img=1>";
                                    if (!var257.startsWith(var261)) {
                                        break label2884;
                                    }
                                }
                                var257 = var257.substring(7);
                            }
                            field845[var5++] = client.method2396(var257) ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3624) {
                            var5--;
                            int var262 = field845[var5];
                            if (Statics.field604 != null && var262 < Statics.field597 && Statics.field604[var262].field647.equalsIgnoreCase(Statics.field2036.field53)) {
                                field845[var5++] = 1;
                                continue;
                            }
                            field845[var5++] = 0;
                            continue;
                        }
                        if (var535 == 3625) {
                            if (client.field524 == null) {
                                field846[var6++] = "";
                            } else {
                                String[] var263 = field846;
                                int var264 = var6++;
                                String var265 = client.field524;
                                String var266 = class166.method731(class166.method135(var265));
                                if (var266 == null) {
                                    var266 = "";
                                }
                                var263[var264] = var266;
                            }
                            continue;
                        }
                    } else if (var535 < 4000) {
                        if (var535 == 3903) {
                            var5--;
                            int var268 = field845[var5];
                            field845[var5++] = client.field488[var268].method3840();
                            continue;
                        }
                        if (var535 == 3904) {
                            var5--;
                            int var269 = field845[var5];
                            field845[var5++] = client.field488[var269].field3215;
                            continue;
                        }
                        if (var535 == 3905) {
                            var5--;
                            int var270 = field845[var5];
                            field845[var5++] = client.field488[var270].field3216;
                            continue;
                        }
                        if (var535 == 3906) {
                            var5--;
                            int var271 = field845[var5];
                            field845[var5++] = client.field488[var271].field3214;
                            continue;
                        }
                        if (var535 == 3907) {
                            var5--;
                            int var272 = field845[var5];
                            field845[var5++] = client.field488[var272].field3218;
                            continue;
                        }
                        if (var535 == 3908) {
                            var5--;
                            int var273 = field845[var5];
                            field845[var5++] = client.field488[var273].field3219;
                            continue;
                        }
                        if (var535 == 3910) {
                            var5--;
                            int var274 = field845[var5];
                            int var275 = client.field488[var274].method3850();
                            field845[var5++] = var275 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3911) {
                            var5--;
                            int var276 = field845[var5];
                            int var277 = client.field488[var276].method3850();
                            field845[var5++] = var277 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3912) {
                            var5--;
                            int var278 = field845[var5];
                            int var279 = client.field488[var278].method3850();
                            field845[var5++] = var279 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3913) {
                            var5--;
                            int var280 = field845[var5];
                            int var281 = client.field488[var280].method3850();
                            field845[var5++] = var281 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 3914) {
                            var5--;
                            boolean var282 = field845[var5] == 1;
                            if (Statics.field173 != null) {
                                Statics.field173.method3852(class225.field3223, var282);
                            }
                            continue;
                        }
                        if (var535 == 3915) {
                            var5--;
                            boolean var283 = field845[var5] == 1;
                            if (Statics.field173 != null) {
                                Statics.field173.method3852(class225.field3220, var283);
                            }
                            continue;
                        }
                        if (var535 == 3916) {
                            var5 -= 2;
                            boolean var284 = field845[var5] == 1;
                            boolean var285 = field845[var5 + 1] == 1;
                            if (Statics.field173 != null) {
                                Statics.field173.method3852(new class23(var285), var284);
                            }
                            continue;
                        }
                        if (var535 == 3917) {
                            var5--;
                            boolean var286 = field845[var5] == 1;
                            if (Statics.field173 != null) {
                                Statics.field173.method3852(class225.field3221, var286);
                            }
                            continue;
                        }
                        if (var535 == 3918) {
                            var5--;
                            boolean var287 = field845[var5] == 1;
                            if (Statics.field173 != null) {
                                Statics.field173.method3852(class225.field3224, var287);
                            }
                            continue;
                        }
                        if (var535 == 3919) {
                            field845[var5++] = Statics.field173 == null ? 0 : Statics.field173.field3222.size();
                            continue;
                        }
                        if (var535 == 3920) {
                            var5--;
                            int var288 = field845[var5];
                            class218 var289 = (class218) Statics.field173.field3222.get(var288);
                            field845[var5++] = var289.field3198;
                            continue;
                        }
                        if (var535 == 3921) {
                            var5--;
                            int var290 = field845[var5];
                            class218 var291 = (class218) Statics.field173.field3222.get(var290);
                            field846[var6++] = var291.method3790();
                            continue;
                        }
                        if (var535 == 3922) {
                            var5--;
                            int var292 = field845[var5];
                            class218 var293 = (class218) Statics.field173.field3222.get(var292);
                            field846[var6++] = var293.method3792();
                            continue;
                        }
                        if (var535 == 3923) {
                            var5--;
                            int var294 = field845[var5];
                            class218 var295 = (class218) Statics.field173.field3222.get(var294);
                            long var296 = class119.method415() - Statics.field2125 - var295.field3193;
                            int var298 = (int) (var296 / 3600000L);
                            int var299 = (int) ((var296 - (long) (var298 * 3600000)) / 60000L);
                            int var300 = (int) ((var296 - (long) (var298 * 3600000) - (long) (var299 * 60000)) / 1000L);
                            String var301 = var298 + ":" + var299 / 10 + var299 % 10 + ":" + var300 / 10 + var300 % 10;
                            field846[var6++] = var301;
                            continue;
                        }
                        if (var535 == 3924) {
                            var5--;
                            int var302 = field845[var5];
                            class218 var303 = (class218) Statics.field173.field3222.get(var302);
                            field845[var5++] = var303.field3195.field3214;
                            continue;
                        }
                        if (var535 == 3925) {
                            var5--;
                            int var304 = field845[var5];
                            class218 var305 = (class218) Statics.field173.field3222.get(var304);
                            field845[var5++] = var305.field3195.field3216;
                            continue;
                        }
                        if (var535 == 3926) {
                            var5--;
                            int var306 = field845[var5];
                            class218 var307 = (class218) Statics.field173.field3222.get(var306);
                            field845[var5++] = var307.field3195.field3215;
                            continue;
                        }
                    } else if (var535 < 4100) {
                        if (var535 == 4000) {
                            var5 -= 2;
                            int var308 = field845[var5];
                            int var309 = field845[var5 + 1];
                            field845[var5++] = var308 + var309;
                            continue;
                        }
                        if (var535 == 4001) {
                            var5 -= 2;
                            int var310 = field845[var5];
                            int var311 = field845[var5 + 1];
                            field845[var5++] = var310 - var311;
                            continue;
                        }
                        if (var535 == 4002) {
                            var5 -= 2;
                            int var312 = field845[var5];
                            int var313 = field845[var5 + 1];
                            field845[var5++] = var312 * var313;
                            continue;
                        }
                        if (var535 == 4003) {
                            var5 -= 2;
                            int var314 = field845[var5];
                            int var315 = field845[var5 + 1];
                            field845[var5++] = var314 / var315;
                            continue;
                        }
                        if (var535 == 4004) {
                            var5--;
                            int var316 = field845[var5];
                            field845[var5++] = (int) (Math.random() * (double) var316);
                            continue;
                        }
                        if (var535 == 4005) {
                            var5--;
                            int var317 = field845[var5];
                            field845[var5++] = (int) (Math.random() * (double) (var317 + 1));
                            continue;
                        }
                        if (var535 == 4006) {
                            var5 -= 5;
                            int var318 = field845[var5];
                            int var319 = field845[var5 + 1];
                            int var320 = field845[var5 + 2];
                            int var321 = field845[var5 + 3];
                            int var322 = field845[var5 + 4];
                            field845[var5++] = (var319 - var318) * (var322 - var320) / (var321 - var320) + var318;
                            continue;
                        }
                        if (var535 == 4007) {
                            var5 -= 2;
                            int var323 = field845[var5];
                            int var324 = field845[var5 + 1];
                            field845[var5++] = var323 * var324 / 100 + var323;
                            continue;
                        }
                        if (var535 == 4008) {
                            var5 -= 2;
                            int var325 = field845[var5];
                            int var326 = field845[var5 + 1];
                            field845[var5++] = var325 | 0x1 << var326;
                            continue;
                        }
                        if (var535 == 4009) {
                            var5 -= 2;
                            int var327 = field845[var5];
                            int var328 = field845[var5 + 1];
                            field845[var5++] = var327 & -1 - (0x1 << var328);
                            continue;
                        }
                        if (var535 == 4010) {
                            var5 -= 2;
                            int var329 = field845[var5];
                            int var330 = field845[var5 + 1];
                            field845[var5++] = (var329 & 0x1 << var330) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var535 == 4011) {
                            var5 -= 2;
                            int var331 = field845[var5];
                            int var332 = field845[var5 + 1];
                            field845[var5++] = var331 % var332;
                            continue;
                        }
                        if (var535 == 4012) {
                            var5 -= 2;
                            int var333 = field845[var5];
                            int var334 = field845[var5 + 1];
                            if (var333 == 0) {
                                field845[var5++] = 0;
                            } else {
                                field845[var5++] = (int) Math.pow((double) var333, (double) var334);
                            }
                            continue;
                        }
                        if (var535 == 4013) {
                            var5 -= 2;
                            int var335 = field845[var5];
                            int var336 = field845[var5 + 1];
                            if (var335 == 0) {
                                field845[var5++] = 0;
                            } else if (var336 == 0) {
                                field845[var5++] = Integer.MAX_VALUE;
                            } else {
                                field845[var5++] = (int) Math.pow((double) var335, 1.0D / (double) var336);
                            }
                            continue;
                        }
                        if (var535 == 4014) {
                            var5 -= 2;
                            int var337 = field845[var5];
                            int var338 = field845[var5 + 1];
                            field845[var5++] = var337 & var338;
                            continue;
                        }
                        if (var535 == 4015) {
                            var5 -= 2;
                            int var339 = field845[var5];
                            int var340 = field845[var5 + 1];
                            field845[var5++] = var339 | var340;
                            continue;
                        }
                        if (var535 == 4018) {
                            var5 -= 3;
                            long var341 = (long) field845[var5];
                            long var343 = (long) field845[var5 + 1];
                            long var345 = (long) field845[var5 + 2];
                            field845[var5++] = (int) (var341 * var345 / var343);
                            continue;
                        }
                    } else if (var535 < 4200) {
                        if (var535 == 4100) {
                            var6--;
                            String var347 = field846[var6];
                            var5--;
                            int var348 = field845[var5];
                            field846[var6++] = var347 + var348;
                            continue;
                        }
                        if (var535 == 4101) {
                            var6 -= 2;
                            String var349 = field846[var6];
                            String var350 = field846[var6 + 1];
                            field846[var6++] = var349 + var350;
                            continue;
                        }
                        if (var535 == 4102) {
                            var6--;
                            String var351 = field846[var6];
                            var5--;
                            int var352 = field845[var5];
                            String[] var353 = field846;
                            int var354 = var6++;
                            String var356;
                            if (var352 < 0) {
                                var356 = Integer.toString(var352);
                            } else {
                                int var357 = var352;
                                String var358;
                                if (var352 < 0) {
                                    var358 = Integer.toString(var352, 10);
                                } else {
                                    int var359 = 2;
                                    int var360 = var352 / 10;
                                    while (var360 != 0) {
                                        var360 /= 10;
                                        var359++;
                                    }
                                    char[] var361 = new char[var359];
                                    var361[0] = '+';
                                    for (int var362 = var359 - 1; var362 > 0; var362--) {
                                        int var363 = var357;
                                        var357 /= 10;
                                        int var364 = var363 - var357 * 10;
                                        if (var364 >= 10) {
                                            var361[var362] = (char) (var364 + 87);
                                        } else {
                                            var361[var362] = (char) (var364 + 48);
                                        }
                                    }
                                    var358 = new String(var361);
                                }
                                var356 = var358;
                            }
                            var353[var354] = var351 + var356;
                            continue;
                        }
                        if (var535 == 4103) {
                            var6--;
                            String var365 = field846[var6];
                            field846[var6++] = var365.toLowerCase();
                            continue;
                        }
                        if (var535 == 4104) {
                            var5--;
                            int var366 = field845[var5];
                            long var367 = ((long) var366 + 11745L) * 86400000L;
                            field847.setTime(new Date(var367));
                            int var369 = field847.get(5);
                            int var370 = field847.get(2);
                            int var371 = field847.get(1);
                            field846[var6++] = var369 + "-" + field844[var370] + "-" + var371;
                            continue;
                        }
                        if (var535 == 4105) {
                            var6 -= 2;
                            String var372 = field846[var6];
                            String var373 = field846[var6 + 1];
                            if (Statics.field2036.field54 != null && Statics.field2036.field54.field2958) {
                                field846[var6++] = var373;
                                continue;
                            }
                            field846[var6++] = var372;
                            continue;
                        }
                        if (var535 == 4106) {
                            var5--;
                            int var374 = field845[var5];
                            field846[var6++] = Integer.toString(var374);
                            continue;
                        }
                        if (var535 == 4107) {
                            var6 -= 2;
                            int[] var375 = field845;
                            int var376 = var5++;
                            String var377 = field846[var6];
                            String var378 = field846[var6 + 1];
                            int var379 = client.field300;
                            int var380 = var377.length();
                            int var381 = var378.length();
                            int var382 = 0;
                            int var383 = 0;
                            byte var384 = 0;
                            byte var385 = 0;
                            int var386;
                            label2970: while (true) {
                                if (var382 - var384 >= var380 && var383 - var385 >= var381) {
                                    int var397 = Math.min(var380, var381);
                                    for (int var398 = 0; var398 < var397; var398++) {
                                        char var401 = var377.charAt(var398);
                                        char var402 = var378.charAt(var398);
                                        if (var401 != var402 && Character.toUpperCase(var401) != Character.toUpperCase(var402)) {
                                            char var403 = Character.toLowerCase(var401);
                                            char var404 = Character.toLowerCase(var402);
                                            if (var403 != var404) {
                                                var386 = class170.method106(var403, var379) - class170.method106(var404, var379);
                                                break label2970;
                                            }
                                        }
                                    }
                                    int var405 = var380 - var381;
                                    if (var405 == 0) {
                                        for (int var406 = 0; var406 < var397; var406++) {
                                            char var407 = var377.charAt(var406);
                                            char var408 = var378.charAt(var406);
                                            if (var407 != var408) {
                                                var386 = class170.method106(var407, var379) - class170.method106(var408, var379);
                                                break label2970;
                                            }
                                        }
                                        var386 = 0;
                                    } else {
                                        var386 = var405;
                                    }
                                    break;
                                }
                                if (var382 - var384 >= var380) {
                                    var386 = -1;
                                    break;
                                }
                                if (var383 - var385 >= var381) {
                                    var386 = 1;
                                    break;
                                }
                                char var387;
                                if (var384 == 0) {
                                    var387 = var377.charAt(var382++);
                                } else {
                                    var387 = (char) var384;
                                    boolean var388 = false;
                                }
                                char var389;
                                if (var385 == 0) {
                                    var389 = var378.charAt(var383++);
                                } else {
                                    var389 = (char) var385;
                                    boolean var390 = false;
                                }
                                byte var391;
                                if (var387 == 198) {
                                    var391 = 69;
                                } else if (var387 == 230) {
                                    var391 = 101;
                                } else if (var387 == 223) {
                                    var391 = 115;
                                } else if (var387 == 338) {
                                    var391 = 69;
                                } else if (var387 == 339) {
                                    var391 = 101;
                                } else {
                                    var391 = 0;
                                }
                                var384 = var391;
                                byte var392;
                                if (var389 == 198) {
                                    var392 = 69;
                                } else if (var389 == 230) {
                                    var392 = 101;
                                } else if (var389 == 223) {
                                    var392 = 115;
                                } else if (var389 == 338) {
                                    var392 = 69;
                                } else if (var389 == 339) {
                                    var392 = 101;
                                } else {
                                    var392 = 0;
                                }
                                var385 = var392;
                                char var393 = class170.method2736(var387, var379);
                                char var394 = class170.method2736(var389, var379);
                                if (var393 != var394 && Character.toUpperCase(var393) != Character.toUpperCase(var394)) {
                                    char var395 = Character.toLowerCase(var393);
                                    char var396 = Character.toLowerCase(var394);
                                    if (var395 != var396) {
                                        var386 = class170.method106(var395, var379) - class170.method106(var396, var379);
                                        break;
                                    }
                                }
                            }
                            var375[var376] = class167.method982(var386);
                            continue;
                        }
                        if (var535 == 4108) {
                            var6--;
                            String var409 = field846[var6];
                            var5 -= 2;
                            int var410 = field845[var5];
                            int var411 = field845[var5 + 1];
                            byte[] var412 = Statics.field624.method3130(var411, 0);
                            class228 var413 = new class228(var412);
                            field845[var5++] = var413.method3865(var409, var410);
                            continue;
                        }
                        if (var535 == 4109) {
                            var6--;
                            String var414 = field846[var6];
                            var5 -= 2;
                            int var415 = field845[var5];
                            int var416 = field845[var5 + 1];
                            byte[] var417 = Statics.field624.method3130(var416, 0);
                            class228 var418 = new class228(var417);
                            field845[var5++] = var418.method3864(var414, var415);
                            continue;
                        }
                        if (var535 == 4110) {
                            var6 -= 2;
                            String var419 = field846[var6];
                            String var420 = field846[var6 + 1];
                            var5--;
                            if (field845[var5] == 1) {
                                field846[var6++] = var419;
                            } else {
                                field846[var6++] = var420;
                            }
                            continue;
                        }
                        if (var535 == 4111) {
                            var6--;
                            String var421 = field846[var6];
                            field846[var6++] = class227.method3894(var421);
                            continue;
                        }
                        if (var535 == 4112) {
                            var6--;
                            String var422 = field846[var6];
                            var5--;
                            int var423 = field845[var5];
                            field846[var6++] = var422 + (char) var423;
                            continue;
                        }
                        if (var535 == 4113) {
                            var5--;
                            int var424 = field845[var5];
                            int[] var425 = field845;
                            int var426 = var5++;
                            char var427 = (char) var424;
                            boolean var428;
                            if (var427 >= ' ' && var427 <= '~') {
                                var428 = true;
                            } else if (var427 >= 160 && var427 <= 255) {
                                var428 = true;
                            } else if (var427 == 8364 || var427 == 338 || var427 == 8212 || var427 == 339 || var427 == 376) {
                                var428 = true;
                            } else {
                                var428 = false;
                            }
                            var425[var426] = var428 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 4114) {
                            var5--;
                            int var429 = field845[var5];
                            field845[var5++] = class167.method504((char) var429) ? 1 : 0;
                            continue;
                        }
                        if (var535 == 4115) {
                            var5--;
                            int var430 = field845[var5];
                            field845[var5++] = class167.method1045((char) var430) ? 1 : 0;
                            continue;
                        }
                        if (var535 == 4116) {
                            var5--;
                            int var431 = field845[var5];
                            field845[var5++] = class167.method2871((char) var431) ? 1 : 0;
                            continue;
                        }
                        if (var535 == 4117) {
                            var6--;
                            String var432 = field846[var6];
                            if (var432 == null) {
                                field845[var5++] = 0;
                            } else {
                                field845[var5++] = var432.length();
                            }
                            continue;
                        }
                        if (var535 == 4118) {
                            var6--;
                            String var433 = field846[var6];
                            var5 -= 2;
                            int var434 = field845[var5];
                            int var435 = field845[var5 + 1];
                            field846[var6++] = var433.substring(var434, var435);
                            continue;
                        }
                        if (var535 == 4119) {
                            var6--;
                            String var436 = field846[var6];
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
                            field846[var6++] = var437.toString();
                            continue;
                        }
                        if (var535 == 4120) {
                            var6--;
                            String var441 = field846[var6];
                            var5--;
                            int var442 = field845[var5];
                            field845[var5++] = var441.indexOf(var442);
                            continue;
                        }
                        if (var535 == 4121) {
                            var6 -= 2;
                            String var443 = field846[var6];
                            String var444 = field846[var6 + 1];
                            var5--;
                            int var445 = field845[var5];
                            field845[var5++] = var443.indexOf(var444, var445);
                            continue;
                        }
                    } else if (var535 < 4300) {
                        if (var535 == 4200) {
                            var5--;
                            int var446 = field845[var5];
                            field846[var6++] = class56.method104(var446).field1184;
                            continue;
                        }
                        if (var535 == 4201) {
                            var5 -= 2;
                            int var447 = field845[var5];
                            int var448 = field845[var5 + 1];
                            class56 var449 = class56.method104(var447);
                            if (var448 >= 1 && var448 <= 5 && var449.field1190[var448 - 1] != null) {
                                field846[var6++] = var449.field1190[var448 - 1];
                                continue;
                            }
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 4202) {
                            var5 -= 2;
                            int var450 = field845[var5];
                            int var451 = field845[var5 + 1];
                            class56 var452 = class56.method104(var450);
                            if (var451 >= 1 && var451 <= 5 && var452.field1181[var451 - 1] != null) {
                                field846[var6++] = var452.field1181[var451 - 1];
                                continue;
                            }
                            field846[var6++] = "";
                            continue;
                        }
                        if (var535 == 4203) {
                            var5--;
                            int var453 = field845[var5];
                            field845[var5++] = class56.method104(var453).field1198;
                            continue;
                        }
                        if (var535 == 4204) {
                            var5--;
                            int var454 = field845[var5];
                            field845[var5++] = class56.method104(var454).field1195 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 4205) {
                            var5--;
                            int var455 = field845[var5];
                            class56 var456 = class56.method104(var455);
                            if (var456.field1191 == -1 && var456.field1226 >= 0) {
                                field845[var5++] = var456.field1226;
                                continue;
                            }
                            field845[var5++] = var455;
                            continue;
                        }
                        if (var535 == 4206) {
                            var5--;
                            int var457 = field845[var5];
                            class56 var458 = class56.method104(var457);
                            if (var458.field1191 >= 0 && var458.field1226 >= 0) {
                                field845[var5++] = var458.field1226;
                                continue;
                            }
                            field845[var5++] = var457;
                            continue;
                        }
                        if (var535 == 4207) {
                            var5--;
                            int var459 = field845[var5];
                            field845[var5++] = class56.method104(var459).field1197 ? 1 : 0;
                            continue;
                        }
                        if (var535 == 4208) {
                            var5--;
                            int var460 = field845[var5];
                            class56 var461 = class56.method104(var460);
                            if (var461.field1215 == -1 && var461.field1225 >= 0) {
                                field845[var5++] = var461.field1225;
                                continue;
                            }
                            field845[var5++] = var460;
                            continue;
                        }
                        if (var535 == 4209) {
                            var5--;
                            int var462 = field845[var5];
                            class56 var463 = class56.method104(var462);
                            if (var463.field1215 >= 0 && var463.field1225 >= 0) {
                                field845[var5++] = var463.field1225;
                                continue;
                            }
                            field845[var5++] = var462;
                            continue;
                        }
                        if (var535 == 4210) {
                            var6--;
                            String var464 = field846[var6];
                            var5--;
                            int var465 = field845[var5];
                            boolean var467 = var465 == 1;
                            String var468 = var464.toLowerCase();
                            short[] var469 = new short[16];
                            int var470 = 0;
                            int var471 = 0;
                            while (true) {
                                if (var471 >= Statics.field1177) {
                                    Statics.field601 = var469;
                                    Statics.field2103 = 0;
                                    Statics.field130 = var470;
                                    String[] var475 = new String[Statics.field130];
                                    for (int var476 = 0; var476 < Statics.field130; var476++) {
                                        var475[var476] = class56.method104(var469[var476]).field1184;
                                    }
                                    class128.method3576(var475, Statics.field601);
                                    break;
                                }
                                class56 var472 = class56.method104(var471);
                                if ((!var467 || var472.field1183) && var472.field1191 == -1 && var472.field1184.toLowerCase().indexOf(var468) != -1) {
                                    if (var470 >= 250) {
                                        Statics.field130 = -1;
                                        Statics.field601 = null;
                                        break;
                                    }
                                    if (var470 >= var469.length) {
                                        short[] var473 = new short[var469.length * 2];
                                        for (int var474 = 0; var474 < var470; var474++) {
                                            var473[var474] = var469[var474];
                                        }
                                        var469 = var473;
                                    }
                                    var469[var470++] = (short) var471;
                                }
                                var471++;
                            }
                            field845[var5++] = Statics.field130;
                            continue;
                        }
                        if (var535 == 4211) {
                            if (Statics.field601 != null && Statics.field2103 < Statics.field130) {
                                field845[var5++] = Statics.field601[++Statics.field2103 - 1] & 0xFFFF;
                                continue;
                            }
                            field845[var5++] = -1;
                            continue;
                        }
                        if (var535 == 4212) {
                            Statics.field2103 = 0;
                            continue;
                        }
                    } else if (var535 < 5100) {
                        if (var535 == 5000) {
                            field845[var5++] = client.field514;
                            continue;
                        }
                        if (var535 == 5001) {
                            var5 -= 3;
                            client.field514 = field845[var5];
                            int var477 = field845[var5 + 1];
                            class134[] var478 = class134.method166();
                            int var479 = 0;
                            class134 var481;
                            while (true) {
                                if (var479 >= var478.length) {
                                    var481 = null;
                                    break;
                                }
                                class134 var480 = var478[var479];
                                if (var480.field2112 == var477) {
                                    var481 = var480;
                                    break;
                                }
                                var479++;
                            }
                            Statics.field1836 = var481;
                            if (Statics.field1836 == null) {
                                Statics.field1836 = class134.field2114;
                            }
                            client.field499 = field845[var5 + 2];
                            client.field337.method2708(110);
                            client.field337.method2649(client.field514);
                            client.field337.method2649(Statics.field1836.field2112);
                            client.field337.method2649(client.field499);
                            continue;
                        }
                        if (var535 == 5002) {
                            var6--;
                            String var482 = field846[var6];
                            var5 -= 2;
                            int var483 = field845[var5];
                            int var484 = field845[var5 + 1];
                            client.field337.method2708(232);
                            client.field337.method2649(class123.method641(var482) + 2);
                            client.field337.method2455(var482);
                            client.field337.method2649(var483 - 1);
                            client.field337.method2649(var484);
                            continue;
                        }
                        if (var535 == 5003) {
                            var5 -= 2;
                            int var485 = field845[var5];
                            int var486 = field845[var5 + 1];
                            class30 var487 = (class30) class12.field192.get(var485);
                            class38 var488 = var487.method642(var486);
                            if (var488 == null) {
                                field845[var5++] = -1;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                                field846[var6++] = "";
                                field846[var6++] = "";
                            } else {
                                field845[var5++] = var488.field834;
                                field845[var5++] = var488.field833;
                                field846[var6++] = var488.field832 == null ? "" : var488.field832;
                                field846[var6++] = var488.field830 == null ? "" : var488.field830;
                                field846[var6++] = var488.field836 == null ? "" : var488.field836;
                            }
                            continue;
                        }
                        if (var535 == 5004) {
                            var5--;
                            int var490 = field845[var5];
                            class38 var491 = (class38) class12.field189.method3637((long) var490);
                            if (var491 == null) {
                                field845[var5++] = -1;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                                field846[var6++] = "";
                                field846[var6++] = "";
                            } else {
                                field845[var5++] = var491.field831;
                                field845[var5++] = var491.field833;
                                field846[var6++] = var491.field832 == null ? "" : var491.field832;
                                field846[var6++] = var491.field830 == null ? "" : var491.field830;
                                field846[var6++] = var491.field836 == null ? "" : var491.field836;
                            }
                            continue;
                        }
                        if (var535 == 5005) {
                            if (Statics.field1836 == null) {
                                field845[var5++] = -1;
                            } else {
                                field845[var5++] = Statics.field1836.field2112;
                            }
                            continue;
                        }
                        if (var535 == 5008) {
                            var6--;
                            String var493 = field846[var6];
                            var5--;
                            int var494 = field845[var5];
                            String var495 = var493.toLowerCase();
                            byte var496 = 0;
                            if (var495.startsWith(class161.field2533)) {
                                var496 = 0;
                                var493 = var493.substring(class161.field2533.length());
                            } else if (var495.startsWith(class161.field2409)) {
                                var496 = 1;
                                var493 = var493.substring(class161.field2409.length());
                            } else if (var495.startsWith(class161.field2537)) {
                                var496 = 2;
                                var493 = var493.substring(class161.field2537.length());
                            } else if (var495.startsWith(class161.field2539)) {
                                var496 = 3;
                                var493 = var493.substring(class161.field2539.length());
                            } else if (var495.startsWith(class161.field2541)) {
                                var496 = 4;
                                var493 = var493.substring(class161.field2541.length());
                            } else if (var495.startsWith(class161.field2543)) {
                                var496 = 5;
                                var493 = var493.substring(class161.field2543.length());
                            } else if (var495.startsWith(class161.field2545)) {
                                var496 = 6;
                                var493 = var493.substring(class161.field2545.length());
                            } else if (var495.startsWith(class161.field2547)) {
                                var496 = 7;
                                var493 = var493.substring(class161.field2547.length());
                            } else if (var495.startsWith(class161.field2549)) {
                                var496 = 8;
                                var493 = var493.substring(class161.field2549.length());
                            } else if (var495.startsWith(class161.field2531)) {
                                var496 = 9;
                                var493 = var493.substring(class161.field2531.length());
                            } else if (var495.startsWith(class161.field2605)) {
                                var496 = 10;
                                var493 = var493.substring(class161.field2605.length());
                            } else if (var495.startsWith(class161.field2555)) {
                                var496 = 11;
                                var493 = var493.substring(class161.field2555.length());
                            } else if (client.field300 != 0) {
                                if (var495.startsWith(class161.field2432)) {
                                    var496 = 0;
                                    var493 = var493.substring(class161.field2432.length());
                                } else if (var495.startsWith(class161.field2536)) {
                                    var496 = 1;
                                    var493 = var493.substring(class161.field2536.length());
                                } else if (var495.startsWith(class161.field2538)) {
                                    var496 = 2;
                                    var493 = var493.substring(class161.field2538.length());
                                } else if (var495.startsWith(class161.field2428)) {
                                    var496 = 3;
                                    var493 = var493.substring(class161.field2428.length());
                                } else if (var495.startsWith(class161.field2509)) {
                                    var496 = 4;
                                    var493 = var493.substring(class161.field2509.length());
                                } else if (var495.startsWith(class161.field2544)) {
                                    var496 = 5;
                                    var493 = var493.substring(class161.field2544.length());
                                } else if (var495.startsWith(class161.field2546)) {
                                    var496 = 6;
                                    var493 = var493.substring(class161.field2546.length());
                                } else if (var495.startsWith(class161.field2548)) {
                                    var496 = 7;
                                    var493 = var493.substring(class161.field2548.length());
                                } else if (var495.startsWith(class161.field2468)) {
                                    var496 = 8;
                                    var493 = var493.substring(class161.field2468.length());
                                } else if (var495.startsWith(class161.field2552)) {
                                    var496 = 9;
                                    var493 = var493.substring(class161.field2552.length());
                                } else if (var495.startsWith(class161.field2554)) {
                                    var496 = 10;
                                    var493 = var493.substring(class161.field2554.length());
                                } else if (var495.startsWith(class161.field2556)) {
                                    var496 = 11;
                                    var493 = var493.substring(class161.field2556.length());
                                }
                            }
                            String var497 = var493.toLowerCase();
                            byte var498 = 0;
                            if (var497.startsWith(class161.field2557)) {
                                var498 = 1;
                                var493 = var493.substring(class161.field2557.length());
                            } else if (var497.startsWith(class161.field2559)) {
                                var498 = 2;
                                var493 = var493.substring(class161.field2559.length());
                            } else if (var497.startsWith(class161.field2561)) {
                                var498 = 3;
                                var493 = var493.substring(class161.field2561.length());
                            } else if (var497.startsWith(class161.field2563)) {
                                var498 = 4;
                                var493 = var493.substring(class161.field2563.length());
                            } else if (var497.startsWith(class161.field2565)) {
                                var498 = 5;
                                var493 = var493.substring(class161.field2565.length());
                            } else if (client.field300 != 0) {
                                if (var497.startsWith(class161.field2567)) {
                                    var498 = 1;
                                    var493 = var493.substring(class161.field2567.length());
                                } else if (var497.startsWith(class161.field2417)) {
                                    var498 = 2;
                                    var493 = var493.substring(class161.field2417.length());
                                } else if (var497.startsWith(class161.field2479)) {
                                    var498 = 3;
                                    var493 = var493.substring(class161.field2479.length());
                                } else if (var497.startsWith(class161.field2597)) {
                                    var498 = 4;
                                    var493 = var493.substring(class161.field2597.length());
                                } else if (var497.startsWith(class161.field2566)) {
                                    var498 = 5;
                                    var493 = var493.substring(class161.field2566.length());
                                }
                            }
                            client.field337.method2708(214);
                            client.field337.method2649(0);
                            int var499 = client.field337.field2062;
                            client.field337.method2649(var494);
                            client.field337.method2649(var496);
                            client.field337.method2649(var498);
                            class126 var500 = client.field337;
                            int var501 = var500.field2062;
                            byte[] var502 = class169.method2733(var493);
                            var500.method2462(var502.length);
                            var500.field2062 += Statics.field3226.method2381(var502, 0, var502.length, var500.field2055, var500.field2062);
                            client.field337.method2461(client.field337.field2062 - var499);
                            continue;
                        }
                        if (var535 == 5009) {
                            var6 -= 2;
                            String var503 = field846[var6];
                            String var504 = field846[var6 + 1];
                            client.field337.method2708(75);
                            client.field337.method2635(0);
                            int var505 = client.field337.field2062;
                            client.field337.method2455(var503);
                            class126 var506 = client.field337;
                            int var507 = var506.field2062;
                            byte[] var508 = class169.method2733(var504);
                            var506.method2462(var508.length);
                            var506.field2062 += Statics.field3226.method2381(var508, 0, var508.length, var506.field2055, var506.field2062);
                            client.field337.method2460(client.field337.field2062 - var505);
                            continue;
                        }
                        if (var535 == 5015) {
                            String var509;
                            if (Statics.field2036 == null || Statics.field2036.field53 == null) {
                                var509 = "";
                            } else {
                                var509 = Statics.field2036.field53;
                            }
                            field846[var6++] = var509;
                            continue;
                        }
                        if (var535 == 5016) {
                            field845[var5++] = client.field499;
                            continue;
                        }
                        if (var535 == 5017) {
                            var5--;
                            int var510 = field845[var5];
                            field845[var5++] = class12.method2057(var510);
                            continue;
                        }
                        if (var535 == 5018) {
                            var5--;
                            int var511 = field845[var5];
                            field845[var5++] = class12.method882(var511);
                            continue;
                        }
                        if (var535 == 5019) {
                            var5--;
                            int var512 = field845[var5];
                            field845[var5++] = class12.method3052(var512);
                            continue;
                        }
                        if (var535 == 5020) {
                            var6--;
                            String var513 = field846[var6];
                            if (var513.equalsIgnoreCase("toggleroof")) {
                                Statics.field572.field154 = !Statics.field572.field154;
                                class9.method1030();
                                if (Statics.field572.field154) {
                                    class12.method577(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method577(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var513.equalsIgnoreCase("displayfps")) {
                                client.field310 = !client.field310;
                            }
                            if (client.field440 >= 2) {
                                if (var513.equalsIgnoreCase("fpson")) {
                                    client.field310 = true;
                                }
                                if (var513.equalsIgnoreCase("fpsoff")) {
                                    client.field310 = false;
                                }
                                if (var513.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var513.equalsIgnoreCase("clientdrop")) {
                                    client.method145();
                                }
                                if (var513.equalsIgnoreCase("errortest") && client.field400 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field337.method2708(11);
                            client.field337.method2649(var513.length() + 1);
                            client.field337.method2455(var513);
                            continue;
                        }
                        if (var535 == 5021) {
                            var6--;
                            client.field405 = field846[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var535 == 5022) {
                            field846[var6++] = client.field405;
                            continue;
                        }
                    }
                }
                if (var535 < 5400) {
                    if (var535 == 5306) {
                        field845[var5++] = Statics.method146();
                        continue;
                    }
                    if (var535 == 5307) {
                        var5--;
                        int var514 = field845[var5];
                        if (var514 != 1 && var514 != 2) {
                            continue;
                        }
                        client.field509 = 0L;
                        if (var514 >= 2) {
                            client.field510 = true;
                        } else {
                            client.field510 = false;
                        }
                        client.method37();
                        if (client.field302 >= 25) {
                            client.method1879();
                        }
                        class148.field2252 = true;
                        continue;
                    }
                    if (var535 == 5308) {
                        field845[var5++] = Statics.field572.field149;
                        continue;
                    }
                    if (var535 == 5309) {
                        var5--;
                        int var515 = field845[var5];
                        if (var515 == 1 || var515 == 2) {
                            Statics.field572.field149 = var515;
                            class9.method1030();
                        }
                        continue;
                    }
                }
                if (var535 < 5600) {
                    if (var535 == 5504) {
                        var5 -= 2;
                        int var516 = field845[var5];
                        int var517 = field845[var5 + 1];
                        if (!client.field544) {
                            client.field380 = var516;
                            client.field515 = var517;
                        }
                        continue;
                    }
                    if (var535 == 5505) {
                        field845[var5++] = client.field380;
                        continue;
                    }
                    if (var535 == 5506) {
                        field845[var5++] = client.field515;
                        continue;
                    }
                    if (var535 == 5530) {
                        var5--;
                        int var518 = field845[var5];
                        if (var518 < 0) {
                            var518 = 0;
                        }
                        client.field386 = var518;
                        continue;
                    }
                    if (var535 == 5531) {
                        field845[var5++] = client.field386;
                        continue;
                    }
                }
                if (var535 >= 5700 || var535 != 5630) {
                    if (var535 < 6300) {
                        if (var535 == 6200) {
                            var5 -= 2;
                            client.field397 = (short) field845[var5];
                            if (client.field397 <= 0) {
                                client.field397 = 256;
                            }
                            client.field551 = (short) field845[var5 + 1];
                            if (client.field551 <= 0) {
                                client.field551 = 205;
                            }
                            continue;
                        }
                        if (var535 == 6201) {
                            var5 -= 2;
                            client.field552 = (short) field845[var5];
                            if (client.field552 <= 0) {
                                client.field552 = 256;
                            }
                            client.field553 = (short) field845[var5 + 1];
                            if (client.field553 <= 0) {
                                client.field553 = 320;
                            }
                            continue;
                        }
                        if (var535 == 6202) {
                            var5 -= 4;
                            client.field350 = (short) field845[var5];
                            if (client.field350 <= 0) {
                                client.field350 = 1;
                            }
                            client.field459 = (short) field845[var5 + 1];
                            if (client.field459 <= 0) {
                                client.field459 = 32767;
                            } else if (client.field459 < client.field350) {
                                client.field459 = client.field350;
                            }
                            client.field472 = (short) field845[var5 + 2];
                            if (client.field472 <= 0) {
                                client.field472 = 1;
                            }
                            client.field557 = (short) field845[var5 + 3];
                            if (client.field557 <= 0) {
                                client.field557 = 32767;
                            } else if (client.field557 < client.field472) {
                                client.field557 = client.field472;
                            }
                            continue;
                        }
                        if (var535 == 6203) {
                            if (client.field446 == null) {
                                field845[var5++] = -1;
                                field845[var5++] = -1;
                            } else {
                                client.method2806(0, 0, client.field446.field2867, client.field446.field2811, false);
                                field845[var5++] = client.field560;
                                field845[var5++] = client.field563;
                            }
                            continue;
                        }
                        if (var535 == 6204) {
                            field845[var5++] = client.field552;
                            field845[var5++] = client.field553;
                            continue;
                        }
                        if (var535 == 6205) {
                            field845[var5++] = client.field397;
                            field845[var5++] = client.field551;
                            continue;
                        }
                    }
                    if (var535 < 6600) {
                        if (var535 == 6500) {
                            field845[var5++] = class28.method3958() ? 1 : 0;
                            continue;
                        }
                        if (var535 == 6501) {
                            class28.field680 = 0;
                            class28 var519 = class28.method1087();
                            if (var519 == null) {
                                field845[var5++] = -1;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                                field845[var5++] = 0;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                            } else {
                                field845[var5++] = var519.field675;
                                field845[var5++] = var519.field677;
                                field846[var6++] = var519.field683;
                                field845[var5++] = var519.field684;
                                field845[var5++] = var519.field678;
                                field846[var6++] = var519.field686;
                            }
                            continue;
                        }
                        if (var535 == 6502) {
                            class28 var521 = class28.method1087();
                            if (var521 == null) {
                                field845[var5++] = -1;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                                field845[var5++] = 0;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                            } else {
                                field845[var5++] = var521.field675;
                                field845[var5++] = var521.field677;
                                field846[var6++] = var521.field683;
                                field845[var5++] = var521.field684;
                                field845[var5++] = var521.field678;
                                field846[var6++] = var521.field686;
                            }
                            continue;
                        }
                        if (var535 == 6506) {
                            var5--;
                            int var522 = field845[var5];
                            class28 var523 = null;
                            for (int var524 = 0; var524 < class28.field674; var524++) {
                                if (Statics.field2033[var524].field675 == var522) {
                                    var523 = Statics.field2033[var524];
                                    break;
                                }
                            }
                            if (var523 == null) {
                                field845[var5++] = -1;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                                field845[var5++] = 0;
                                field845[var5++] = 0;
                                field846[var6++] = "";
                            } else {
                                field845[var5++] = var523.field675;
                                field845[var5++] = var523.field677;
                                field846[var6++] = var523.field683;
                                field845[var5++] = var523.field684;
                                field845[var5++] = var523.field678;
                                field846[var6++] = var523.field686;
                            }
                            continue;
                        }
                        if (var535 == 6507) {
                            var5 -= 4;
                            int var525 = field845[var5];
                            boolean var526 = field845[var5 + 1] == 1;
                            int var527 = field845[var5 + 2];
                            boolean var528 = field845[var5 + 3] == 1;
                            if (Statics.field2033 != null) {
                                class28.method2864(0, Statics.field2033.length - 1, var525, var526, var527, var528);
                            }
                            continue;
                        }
                        if (var535 == 6511) {
                            var5--;
                            int var529 = field845[var5];
                            if (var529 >= 0 && var529 < class28.field674) {
                                class28 var530 = Statics.field2033[var529];
                                field845[var5++] = var530.field675;
                                field845[var5++] = var530.field677;
                                field846[var6++] = var530.field683;
                                field845[var5++] = var530.field684;
                                field845[var5++] = var530.field678;
                                field846[var6++] = var530.field686;
                                continue;
                            }
                            field845[var5++] = -1;
                            field845[var5++] = 0;
                            field846[var6++] = "";
                            field845[var5++] = 0;
                            field845[var5++] = 0;
                            field846[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field479 = 250;
            }
        } catch (Exception var534) {
            StringBuilder var532 = new StringBuilder(30);
            var532.append("").append(var4.field3162).append(" ");
            for (int var533 = field837 - 1; var533 >= 0; var533--) {
                var532.append("").append(field849[var533].field224.field3162).append(" ");
            }
            var532.append("").append(var10);
            class152.method976(var532.toString(), var534);
        }
    }

    @ObfuscatedName("z.c(IB)V")
    public static void method164(int arg0) {
        if (arg0 == -1 || !class177.method108(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2812[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2876 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field5 = var3.field2876;
                method771(var4, 2000000);
            }
        }
    }
}
