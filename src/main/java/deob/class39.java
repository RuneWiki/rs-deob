package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class39 {

    @ObfuscatedName("at.i")
    public static int[] field804 = new int[5];

    @ObfuscatedName("at.b")
    public static int[][] field813 = new int[5][5000];

    @ObfuscatedName("at.l")
    public static int[] field806 = new int[1000];

    @ObfuscatedName("at.m")
    public static String[] field810 = new String[1000];

    @ObfuscatedName("at.p")
    public static int field803 = 0;

    @ObfuscatedName("at.f")
    public static class15[] field809 = new class15[50];

    @ObfuscatedName("at.q")
    public static Calendar field811 = Calendar.getInstance();

    @ObfuscatedName("at.t")
    public static final String[] field802 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("at.g")
    public static int field807 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.x(Lx;II)V")
    public static void method2994(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class24 var4 = class24.method146(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field592;
        int[] var9 = var4.field599;
        byte var10 = -1;
        field803 = 0;
        try {
            Statics.field805 = new int[var4.field596];
            int var11 = 0;
            Statics.field2097 = new String[var4.field597];
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
                        var14 = arg0.field8 == null ? -1 : arg0.field8.field2857;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field8 == null ? -1 : arg0.field8.field2812;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2857;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2812;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field805[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2097[var12++] = var15;
                }
            }
            int var16 = 0;
            field807 = arg0.field11;
            label2917: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var431 = var8[var7];
                if (var431 < 100) {
                    if (var431 == 0) {
                        field806[var5++] = var9[var7];
                        continue;
                    }
                    if (var431 == 1) {
                        int var17 = var9[var7];
                        field806[var5++] = class180.field2960[var17];
                        continue;
                    }
                    if (var431 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2960[var18] = field806[var5];
                        client.method3250(var18);
                        continue;
                    }
                    if (var431 == 3) {
                        field810[var6++] = var4.field595[var7];
                        continue;
                    }
                    if (var431 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var431 == 7) {
                        var5 -= 2;
                        if (field806[var5 + 1] != field806[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var431 == 8) {
                        var5 -= 2;
                        if (field806[var5 + 1] == field806[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var431 == 9) {
                        var5 -= 2;
                        if (field806[var5] < field806[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var431 == 10) {
                        var5 -= 2;
                        if (field806[var5] > field806[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var431 == 21) {
                        if (field803 == 0) {
                            return;
                        }
                        class15 var19 = field809[--field803];
                        var4 = var19.field204;
                        var8 = var4.field592;
                        var9 = var4.field599;
                        var7 = var19.field205;
                        Statics.field805 = var19.field216;
                        Statics.field2097 = var19.field207;
                        continue;
                    }
                    if (var431 == 25) {
                        int var20 = var9[var7];
                        field806[var5++] = class180.method870(var20);
                        continue;
                    }
                    if (var431 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field806[var5];
                        class51 var23 = class51.method643(var21);
                        int var24 = var23.field1091;
                        int var25 = var23.field1094;
                        int var26 = var23.field1093;
                        int var27 = class180.field2958[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class180.field2960[var24] = class180.field2960[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var431 == 31) {
                        var5 -= 2;
                        if (field806[var5] <= field806[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var431 == 32) {
                        var5 -= 2;
                        if (field806[var5] >= field806[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var431 == 33) {
                        field806[var5++] = Statics.field805[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var431 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field805[var10001] = field806[var5];
                        continue;
                    }
                    if (var431 == 35) {
                        field810[var6++] = Statics.field2097[var9[var7]];
                        continue;
                    }
                    if (var431 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2097[var10001] = field810[var6];
                        continue;
                    }
                    if (var431 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class167.method654(field810, var6, var29);
                        field810[var6++] = var30;
                        continue;
                    }
                    if (var431 == 38) {
                        var5--;
                        continue;
                    }
                    if (var431 == 39) {
                        var6--;
                        continue;
                    }
                    if (var431 == 40) {
                        int var31 = var9[var7];
                        class24 var32 = class24.method146(var31);
                        int[] var33 = new int[var32.field596];
                        String[] var34 = new String[var32.field597];
                        for (int var35 = 0; var35 < var32.field598; var35++) {
                            var33[var35] = field806[var5 - var32.field598 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field601; var36++) {
                            var34[var36] = field810[var6 - var32.field601 + var36];
                        }
                        var5 -= var32.field598;
                        var6 -= var32.field601;
                        class15 var37 = new class15();
                        var37.field204 = var4;
                        var37.field205 = var7;
                        var37.field216 = Statics.field805;
                        var37.field207 = Statics.field2097;
                        field809[++field803 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field592;
                        var9 = var32.field599;
                        var7 = -1;
                        Statics.field805 = var33;
                        Statics.field2097 = var34;
                        continue;
                    }
                    if (var431 == 42) {
                        field806[var5++] = Statics.field139.method196(var9[var7]);
                        continue;
                    }
                    if (var431 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field139.method195(var10001, field806[var5]);
                        continue;
                    }
                    if (var431 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field806[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field804[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2917;
                                }
                                field813[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var431 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field806[var5];
                        if (var44 >= 0 && var44 < field804[var43]) {
                            field806[var5++] = field813[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var431 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field806[var5];
                        if (var46 >= 0 && var46 < field804[var45]) {
                            field813[var45][var46] = field806[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var431 == 47) {
                        String var47 = Statics.field139.method201(var9[var7]);
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field810[var6++] = var47;
                        continue;
                    }
                    if (var431 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field139.method197(var10001, field810[var6]);
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var431 < 1000) {
                    if (var431 == 100) {
                        var5 -= 3;
                        int var49 = field806[var5];
                        int var50 = field806[var5 + 1];
                        int var51 = field806[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var52 = class177.method621(var49);
                        if (var52.field2935 == null) {
                            var52.field2935 = new class177[var51 + 1];
                        }
                        if (var52.field2935.length <= var51) {
                            class177[] var53 = new class177[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2935.length; var54++) {
                                var53[var54] = var52.field2935[var54];
                            }
                            var52.field2935 = var53;
                        }
                        if (var51 > 0 && var52.field2935[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class177 var55 = new class177();
                        var55.field2838 = var50;
                        var55.field2854 = var55.field2857 = var52.field2857;
                        var55.field2812 = var51;
                        var55.field2810 = true;
                        var52.field2935[var51] = var55;
                        if (var48) {
                            Statics.field808 = var55;
                        } else {
                            Statics.field2307 = var55;
                        }
                        client.method1515(var52);
                        continue;
                    }
                    if (var431 == 101) {
                        class177 var56 = var48 ? Statics.field808 : Statics.field2307;
                        class177 var57 = class177.method621(var56.field2857);
                        var57.field2935[var56.field2812] = null;
                        client.method1515(var57);
                        continue;
                    }
                    if (var431 == 102) {
                        var5--;
                        class177 var58 = class177.method621(field806[var5]);
                        var58.field2935 = null;
                        client.method1515(var58);
                        continue;
                    }
                    if (var431 == 200) {
                        var5 -= 2;
                        int var59 = field806[var5];
                        int var60 = field806[var5 + 1];
                        class177 var61 = class177.method3054(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field806[var5++] = 1;
                            if (var48) {
                                Statics.field808 = var61;
                            } else {
                                Statics.field2307 = var61;
                            }
                            continue;
                        }
                        field806[var5++] = 0;
                        continue;
                    }
                    if (var431 == 201) {
                        var5--;
                        class177 var62 = class177.method621(field806[var5]);
                        if (var62 == null) {
                            field806[var5++] = 0;
                        } else {
                            field806[var5++] = 1;
                            if (var48) {
                                Statics.field808 = var62;
                            } else {
                                Statics.field2307 = var62;
                            }
                        }
                        continue;
                    }
                } else if (var431 >= 1000 && var431 < 1100 || var431 >= 2000 && var431 < 2100) {
                    int var63 = -1;
                    class177 var64;
                    if (var431 >= 2000) {
                        var431 -= 1000;
                        var5--;
                        var63 = field806[var5];
                        var64 = class177.method621(var63);
                    } else {
                        var64 = var48 ? Statics.field808 : Statics.field2307;
                    }
                    if (var431 == 1000) {
                        var5 -= 4;
                        var64.field2820 = field806[var5];
                        var64.field2821 = field806[var5 + 1];
                        var64.field2910 = field806[var5 + 2];
                        var64.field2921 = field806[var5 + 3];
                        client.method1515(var64);
                        client.method182(var64);
                        if (var63 != -1 && var64.field2838 == 0) {
                            client.method547(Statics.field2905[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var431 == 1001) {
                        var5 -= 4;
                        var64.field2885 = field806[var5];
                        var64.field2823 = field806[var5 + 1];
                        var64.field2811 = field806[var5 + 2];
                        var64.field2819 = field806[var5 + 3];
                        client.method1515(var64);
                        client.method182(var64);
                        if (var63 != -1 && var64.field2838 == 0) {
                            client.method547(Statics.field2905[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var431 == 1003) {
                        var5--;
                        boolean var65 = field806[var5] == 1;
                        if (var64.field2831 != var65) {
                            var64.field2831 = var65;
                            client.method1515(var64);
                        }
                        continue;
                    }
                    if (var431 == 1005) {
                        var5--;
                        var64.field2944 = field806[var5] == 1;
                        continue;
                    }
                    if (var431 == 1006) {
                        var5--;
                        var64.field2945 = field806[var5] == 1;
                        continue;
                    }
                } else if (var431 >= 1100 && var431 < 1200 || var431 >= 2100 && var431 < 2200) {
                    int var66 = -1;
                    class177 var67;
                    if (var431 >= 2000) {
                        var431 -= 1000;
                        var5--;
                        var66 = field806[var5];
                        var67 = class177.method621(var66);
                    } else {
                        var67 = var48 ? Statics.field808 : Statics.field2307;
                    }
                    if (var431 == 1100) {
                        var5 -= 2;
                        var67.field2832 = field806[var5];
                        if (var67.field2832 > var67.field2815 - var67.field2826) {
                            var67.field2832 = var67.field2815 - var67.field2826;
                        }
                        if (var67.field2832 < 0) {
                            var67.field2832 = 0;
                        }
                        var67.field2833 = field806[var5 + 1];
                        if (var67.field2833 > var67.field2835 - var67.field2827) {
                            var67.field2833 = var67.field2835 - var67.field2827;
                        }
                        if (var67.field2833 < 0) {
                            var67.field2833 = 0;
                        }
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1101) {
                        var5--;
                        var67.field2917 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1102) {
                        var5--;
                        var67.field2840 = field806[var5] == 1;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1103) {
                        var5--;
                        var67.field2842 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1104) {
                        var5--;
                        var67.field2844 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1105) {
                        var5--;
                        var67.field2846 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1106) {
                        var5--;
                        var67.field2920 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1107) {
                        var5--;
                        var67.field2847 = field806[var5] == 1;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1108) {
                        var67.field2911 = 1;
                        var5--;
                        var67.field2855 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1109) {
                        var5 -= 6;
                        var67.field2874 = field806[var5];
                        var67.field2861 = field806[var5 + 1];
                        var67.field2862 = field806[var5 + 2];
                        var67.field2863 = field806[var5 + 3];
                        var67.field2901 = field806[var5 + 4];
                        var67.field2865 = field806[var5 + 5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1110) {
                        var5--;
                        int var68 = field806[var5];
                        if (var67.field2858 != var68) {
                            var67.field2858 = var68;
                            var67.field2933 = 0;
                            var67.field2946 = 0;
                            client.method1515(var67);
                        }
                        continue;
                    }
                    if (var431 == 1111) {
                        var5--;
                        var67.field2868 = field806[var5] == 1;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1112) {
                        var6--;
                        String var69 = field810[var6];
                        if (!var69.equals(var67.field2871)) {
                            var67.field2871 = var69;
                            client.method1515(var67);
                        }
                        continue;
                    }
                    if (var431 == 1113) {
                        var5--;
                        var67.field2870 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1114) {
                        var5 -= 3;
                        var67.field2934 = field806[var5];
                        var67.field2817 = field806[var5 + 1];
                        var67.field2824 = field806[var5 + 2];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1115) {
                        var5--;
                        var67.field2896 = field806[var5] == 1;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1116) {
                        var5--;
                        var67.field2850 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1117) {
                        var5--;
                        var67.field2851 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1118) {
                        var5--;
                        var67.field2852 = field806[var5] == 1;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1119) {
                        var5--;
                        var67.field2853 = field806[var5] == 1;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1120) {
                        var5 -= 2;
                        var67.field2815 = field806[var5];
                        var67.field2835 = field806[var5 + 1];
                        client.method1515(var67);
                        if (var66 != -1 && var67.field2838 == 0) {
                            client.method547(Statics.field2905[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var431 == 1121) {
                        client.method145(var67.field2857, var67.field2812);
                        client.field444 = var67;
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1122) {
                        var5--;
                        var67.field2841 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1123) {
                        var5--;
                        var67.field2837 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1124) {
                        var5--;
                        var67.field2843 = field806[var5];
                        client.method1515(var67);
                        continue;
                    }
                    if (var431 == 1125) {
                        var5--;
                        int var70 = field806[var5];
                        class86 var71 = (class86) class113.method99(class86.method178(), var70);
                        if (var71 != null) {
                            var67.field2813 = var71;
                            client.method1515(var67);
                        }
                        continue;
                    }
                } else if (!(var431 < 1200 || var431 >= 1300) || !(var431 < 2200 || var431 >= 2300)) {
                    class177 var72;
                    if (var431 >= 2000) {
                        var431 -= 1000;
                        var5--;
                        var72 = class177.method621(field806[var5]);
                    } else {
                        var72 = var48 ? Statics.field808 : Statics.field2307;
                    }
                    client.method1515(var72);
                    if (var431 == 1200 || var431 == 1205 || var431 == 1212) {
                        var5 -= 2;
                        int var73 = field806[var5];
                        int var74 = field806[var5 + 1];
                        var72.field2834 = var73;
                        var72.field2932 = var74;
                        class56 var75 = class56.method709(var73);
                        var72.field2862 = var75.field1168;
                        var72.field2863 = var75.field1172;
                        var72.field2901 = var75.field1204;
                        var72.field2874 = var75.field1159;
                        var72.field2861 = var75.field1169;
                        var72.field2865 = var75.field1170;
                        if (var431 == 1205) {
                            var72.field2943 = 0;
                        } else if (var431 == 1212 | var75.field1209 == 1) {
                            var72.field2943 = 1;
                        } else {
                            var72.field2943 = 2;
                        }
                        if (var72.field2930 > 0) {
                            var72.field2865 = var72.field2865 * 32 / var72.field2930;
                        } else if (var72.field2885 > 0) {
                            var72.field2865 = var72.field2865 * 32 / var72.field2885;
                        }
                        continue;
                    }
                    if (var431 == 1201) {
                        var72.field2911 = 2;
                        var5--;
                        var72.field2855 = field806[var5];
                        continue;
                    }
                    if (var431 == 1202) {
                        var72.field2911 = 3;
                        var72.field2855 = Statics.field1067.field34.method3287();
                        continue;
                    }
                } else if (var431 >= 1300 && var431 < 1400 || var431 >= 2300 && var431 < 2400) {
                    class177 var76;
                    if (var431 >= 2000) {
                        var431 -= 1000;
                        var5--;
                        var76 = class177.method621(field806[var5]);
                    } else {
                        var76 = var48 ? Statics.field808 : Statics.field2307;
                    }
                    if (var431 == 1300) {
                        var5--;
                        int var77 = field806[var5] - 1;
                        if (var77 >= 0 && var77 <= 9) {
                            var6--;
                            var76.method3214(var77, field810[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var431 == 1301) {
                        var5 -= 2;
                        int var78 = field806[var5];
                        int var79 = field806[var5 + 1];
                        var76.field2886 = class177.method3054(var78, var79);
                        continue;
                    }
                    if (var431 == 1302) {
                        var5--;
                        var76.field2839 = field806[var5] == 1;
                        continue;
                    }
                    if (var431 == 1303) {
                        var5--;
                        var76.field2929 = field806[var5];
                        continue;
                    }
                    if (var431 == 1304) {
                        var5--;
                        var76.field2888 = field806[var5];
                        continue;
                    }
                    if (var431 == 1305) {
                        var6--;
                        var76.field2884 = field810[var6];
                        continue;
                    }
                    if (var431 == 1306) {
                        var6--;
                        var76.field2890 = field810[var6];
                        continue;
                    }
                    if (var431 == 1307) {
                        var76.field2845 = null;
                        continue;
                    }
                } else {
                    if (var431 >= 1400 && var431 < 1500 || var431 >= 2400 && var431 < 2500) {
                        class177 var80;
                        if (var431 >= 2000) {
                            var431 -= 1000;
                            var5--;
                            var80 = class177.method621(field806[var5]);
                        } else {
                            var80 = var48 ? Statics.field808 : Statics.field2307;
                        }
                        var6--;
                        String var81 = field810[var6];
                        int[] var82 = null;
                        if (var81.length() > 0 && var81.charAt(var81.length() - 1) == 'Y') {
                            var5--;
                            int var83 = field806[var5];
                            if (var83 > 0) {
                                var82 = new int[var83];
                                while (var83-- > 0) {
                                    var5--;
                                    var82[var83] = field806[var5];
                                }
                            }
                            var81 = var81.substring(0, var81.length() - 1);
                        }
                        Object[] var84 = new Object[var81.length() + 1];
                        for (int var85 = var84.length - 1; var85 >= 1; var85--) {
                            if (var81.charAt(var85 - 1) == 's') {
                                var6--;
                                var84[var85] = field810[var6];
                            } else {
                                var5--;
                                var84[var85] = Integer.valueOf(field806[var5]);
                            }
                        }
                        var5--;
                        int var86 = field806[var5];
                        if (var86 == -1) {
                            var84 = null;
                        } else {
                            var84[0] = Integer.valueOf(var86);
                        }
                        if (var431 == 1400) {
                            var80.field2893 = var84;
                        }
                        if (var431 == 1401) {
                            var80.field2914 = var84;
                        }
                        if (var431 == 1402) {
                            var80.field2895 = var84;
                        }
                        if (var431 == 1403) {
                            var80.field2859 = var84;
                        }
                        if (var431 == 1404) {
                            var80.field2899 = var84;
                        }
                        if (var431 == 1405) {
                            var80.field2900 = var84;
                        }
                        if (var431 == 1406) {
                            var80.field2903 = var84;
                        }
                        if (var431 == 1407) {
                            var80.field2904 = var84;
                            var80.field2864 = var82;
                        }
                        if (var431 == 1408) {
                            var80.field2816 = var84;
                        }
                        if (var431 == 1409) {
                            var80.field2805 = var84;
                        }
                        if (var431 == 1410) {
                            var80.field2869 = var84;
                        }
                        if (var431 == 1411) {
                            var80.field2849 = var84;
                        }
                        if (var431 == 1412) {
                            var80.field2898 = var84;
                        }
                        if (var431 == 1414) {
                            var80.field2877 = var84;
                            var80.field2907 = var82;
                        }
                        if (var431 == 1415) {
                            var80.field2908 = var84;
                            var80.field2909 = var82;
                        }
                        if (var431 == 1416) {
                            var80.field2902 = var84;
                        }
                        if (var431 == 1417) {
                            var80.field2912 = var84;
                        }
                        if (var431 == 1418) {
                            var80.field2913 = var84;
                        }
                        if (var431 == 1419) {
                            var80.field2848 = var84;
                        }
                        if (var431 == 1420) {
                            var80.field2915 = var84;
                        }
                        if (var431 == 1421) {
                            var80.field2916 = var84;
                        }
                        if (var431 == 1422) {
                            var80.field2889 = var84;
                        }
                        if (var431 == 1423) {
                            var80.field2894 = var84;
                        }
                        if (var431 == 1424) {
                            var80.field2931 = var84;
                        }
                        if (var431 == 1425) {
                            var80.field2918 = var84;
                        }
                        if (var431 == 1426) {
                            var80.field2922 = var84;
                        }
                        if (var431 == 1427) {
                            var80.field2828 = var84;
                        }
                        var80.field2830 = true;
                        continue;
                    }
                    if (var431 < 1600) {
                        class177 var87 = var48 ? Statics.field808 : Statics.field2307;
                        if (var431 == 1500) {
                            field806[var5++] = var87.field2897;
                            continue;
                        }
                        if (var431 == 1501) {
                            field806[var5++] = var87.field2825;
                            continue;
                        }
                        if (var431 == 1502) {
                            field806[var5++] = var87.field2826;
                            continue;
                        }
                        if (var431 == 1503) {
                            field806[var5++] = var87.field2827;
                            continue;
                        }
                        if (var431 == 1504) {
                            field806[var5++] = var87.field2831 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 1505) {
                            field806[var5++] = var87.field2854;
                            continue;
                        }
                    } else if (var431 < 1700) {
                        class177 var88 = var48 ? Statics.field808 : Statics.field2307;
                        if (var431 == 1600) {
                            field806[var5++] = var88.field2832;
                            continue;
                        }
                        if (var431 == 1601) {
                            field806[var5++] = var88.field2833;
                            continue;
                        }
                        if (var431 == 1602) {
                            field810[var6++] = var88.field2871;
                            continue;
                        }
                        if (var431 == 1603) {
                            field806[var5++] = var88.field2815;
                            continue;
                        }
                        if (var431 == 1604) {
                            field806[var5++] = var88.field2835;
                            continue;
                        }
                        if (var431 == 1605) {
                            field806[var5++] = var88.field2865;
                            continue;
                        }
                        if (var431 == 1606) {
                            field806[var5++] = var88.field2862;
                            continue;
                        }
                        if (var431 == 1607) {
                            field806[var5++] = var88.field2901;
                            continue;
                        }
                        if (var431 == 1608) {
                            field806[var5++] = var88.field2863;
                            continue;
                        }
                        if (var431 == 1609) {
                            field806[var5++] = var88.field2842;
                            continue;
                        }
                        if (var431 == 1610) {
                            field806[var5++] = var88.field2843;
                            continue;
                        }
                        if (var431 == 1611) {
                            field806[var5++] = var88.field2917;
                            continue;
                        }
                        if (var431 == 1612) {
                            field806[var5++] = var88.field2837;
                            continue;
                        }
                        if (var431 == 1613) {
                            field806[var5++] = var88.field2813.method543();
                            continue;
                        }
                    } else if (var431 < 1800) {
                        class177 var89 = var48 ? Statics.field808 : Statics.field2307;
                        if (var431 == 1700) {
                            field806[var5++] = var89.field2834;
                            continue;
                        }
                        if (var431 == 1701) {
                            if (var89.field2834 == -1) {
                                field806[var5++] = 0;
                            } else {
                                field806[var5++] = var89.field2932;
                            }
                            continue;
                        }
                        if (var431 == 1702) {
                            field806[var5++] = var89.field2812;
                            continue;
                        }
                    } else if (var431 < 1900) {
                        class177 var90 = var48 ? Statics.field808 : Statics.field2307;
                        if (var431 == 1800) {
                            field806[var5++] = class182.method1546(client.method2725(var90));
                            continue;
                        }
                        if (var431 == 1801) {
                            var5--;
                            int var91 = field806[var5];
                            int var432 = var91 - 1;
                            if (var90.field2845 != null && var432 < var90.field2845.length && var90.field2845[var432] != null) {
                                field810[var6++] = var90.field2845[var432];
                                continue;
                            }
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 1802) {
                            if (var90.field2884 == null) {
                                field810[var6++] = "";
                            } else {
                                field810[var6++] = var90.field2884;
                            }
                            continue;
                        }
                    } else if (!(var431 < 1900 || var431 >= 2000) || !(var431 < 2900 || var431 >= 3000)) {
                        class177 var92;
                        if (var431 >= 2000) {
                            var431 -= 1000;
                            var5--;
                            var92 = class177.method621(field806[var5]);
                        } else {
                            var92 = var48 ? Statics.field808 : Statics.field2307;
                        }
                        if (var431 == 1927) {
                            if (field807 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var92.field2828 == null) {
                                return;
                            }
                            class1 var93 = new class1();
                            var93.field8 = var92;
                            var93.field9 = var92.field2828;
                            var93.field11 = field807 + 1;
                            client.field479.method3594(arg0);
                            continue;
                        }
                    } else if (var431 < 2600) {
                        var5--;
                        class177 var94 = class177.method621(field806[var5]);
                        if (var431 == 2500) {
                            field806[var5++] = var94.field2897;
                            continue;
                        }
                        if (var431 == 2501) {
                            field806[var5++] = var94.field2825;
                            continue;
                        }
                        if (var431 == 2502) {
                            field806[var5++] = var94.field2826;
                            continue;
                        }
                        if (var431 == 2503) {
                            field806[var5++] = var94.field2827;
                            continue;
                        }
                        if (var431 == 2504) {
                            field806[var5++] = var94.field2831 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 2505) {
                            field806[var5++] = var94.field2854;
                            continue;
                        }
                    } else if (var431 < 2700) {
                        var5--;
                        class177 var95 = class177.method621(field806[var5]);
                        if (var431 == 2600) {
                            field806[var5++] = var95.field2832;
                            continue;
                        }
                        if (var431 == 2601) {
                            field806[var5++] = var95.field2833;
                            continue;
                        }
                        if (var431 == 2602) {
                            field810[var6++] = var95.field2871;
                            continue;
                        }
                        if (var431 == 2603) {
                            field806[var5++] = var95.field2815;
                            continue;
                        }
                        if (var431 == 2604) {
                            field806[var5++] = var95.field2835;
                            continue;
                        }
                        if (var431 == 2605) {
                            field806[var5++] = var95.field2865;
                            continue;
                        }
                        if (var431 == 2606) {
                            field806[var5++] = var95.field2862;
                            continue;
                        }
                        if (var431 == 2607) {
                            field806[var5++] = var95.field2901;
                            continue;
                        }
                        if (var431 == 2608) {
                            field806[var5++] = var95.field2863;
                            continue;
                        }
                        if (var431 == 2609) {
                            field806[var5++] = var95.field2842;
                            continue;
                        }
                        if (var431 == 2610) {
                            field806[var5++] = var95.field2843;
                            continue;
                        }
                        if (var431 == 2611) {
                            field806[var5++] = var95.field2917;
                            continue;
                        }
                        if (var431 == 2612) {
                            field806[var5++] = var95.field2837;
                            continue;
                        }
                        if (var431 == 2613) {
                            field806[var5++] = var95.field2813.method543();
                            continue;
                        }
                    } else if (var431 < 2800) {
                        if (var431 == 2700) {
                            var5--;
                            class177 var96 = class177.method621(field806[var5]);
                            field806[var5++] = var96.field2834;
                            continue;
                        }
                        if (var431 == 2701) {
                            var5--;
                            class177 var97 = class177.method621(field806[var5]);
                            if (var97.field2834 == -1) {
                                field806[var5++] = 0;
                            } else {
                                field806[var5++] = var97.field2932;
                            }
                            continue;
                        }
                        if (var431 == 2702) {
                            var5--;
                            int var98 = field806[var5];
                            class4 var99 = (class4) client.field407.method3580((long) var98);
                            if (var99 == null) {
                                field806[var5++] = 0;
                            } else {
                                field806[var5++] = 1;
                            }
                            continue;
                        }
                        if (var431 == 2706) {
                            field806[var5++] = client.field559;
                            continue;
                        }
                    } else if (var431 < 2900) {
                        var5--;
                        class177 var100 = class177.method621(field806[var5]);
                        if (var431 == 2800) {
                            field806[var5++] = class182.method1546(client.method2725(var100));
                            continue;
                        }
                        if (var431 == 2801) {
                            var5--;
                            int var101 = field806[var5];
                            int var433 = var101 - 1;
                            if (var100.field2845 != null && var433 < var100.field2845.length && var100.field2845[var433] != null) {
                                field810[var6++] = var100.field2845[var433];
                                continue;
                            }
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 2802) {
                            if (var100.field2884 == null) {
                                field810[var6++] = "";
                            } else {
                                field810[var6++] = var100.field2884;
                            }
                            continue;
                        }
                    } else if (var431 < 3200) {
                        if (var431 == 3100) {
                            var6--;
                            String var102 = field810[var6];
                            class12.method558(0, "", var102);
                            continue;
                        }
                        if (var431 == 3101) {
                            var5 -= 2;
                            client.method1822(Statics.field1067, field806[var5], field806[var5 + 1]);
                            continue;
                        }
                        if (var431 == 3103) {
                            client.method2208();
                            continue;
                        }
                        if (var431 == 3104) {
                            var6--;
                            String var103 = field810[var6];
                            int var104 = 0;
                            if (class167.method2113(var103)) {
                                int var105 = class167.method1581(var103, 10, true);
                                var104 = var105;
                            }
                            client.field324.method2670(151);
                            client.field324.method2396(var104);
                            continue;
                        }
                        if (var431 == 3105) {
                            var6--;
                            String var106 = field810[var6];
                            client.field324.method2670(56);
                            client.field324.method2567(var106.length() + 1);
                            client.field324.method2468(var106);
                            continue;
                        }
                        if (var431 == 3106) {
                            var6--;
                            String var107 = field810[var6];
                            client.field324.method2670(112);
                            client.field324.method2567(var107.length() + 1);
                            client.field324.method2468(var107);
                            continue;
                        }
                        if (var431 == 3107) {
                            var5--;
                            int var108 = field806[var5];
                            var6--;
                            String var109 = field810[var6];
                            client.method193(var108, var109);
                            continue;
                        }
                        if (var431 == 3108) {
                            var5 -= 3;
                            int var110 = field806[var5];
                            int var111 = field806[var5 + 1];
                            int var112 = field806[var5 + 2];
                            class177 var113 = class177.method621(var112);
                            client.method2115(var113, var110, var111);
                            continue;
                        }
                        if (var431 == 3109) {
                            var5 -= 2;
                            int var114 = field806[var5];
                            int var115 = field806[var5 + 1];
                            class177 var116 = var48 ? Statics.field808 : Statics.field2307;
                            client.method2115(var116, var114, var115);
                            continue;
                        }
                        if (var431 == 3110) {
                            var5--;
                            Statics.field2118 = field806[var5] == 1;
                            continue;
                        }
                        if (var431 == 3111) {
                            field806[var5++] = Statics.field2660.field146 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3112) {
                            var5--;
                            Statics.field2660.field146 = field806[var5] == 1;
                            class9.method81();
                            continue;
                        }
                        if (var431 == 3113) {
                            var6--;
                            String var117 = field810[var6];
                            var5--;
                            boolean var118 = field806[var5] == 1;
                            class142.method2338(var117, var118, false);
                            continue;
                        }
                        if (var431 == 3115) {
                            var5--;
                            int var119 = field806[var5];
                            client.field324.method2670(124);
                            client.field324.method2394(var119);
                            continue;
                        }
                        if (var431 == 3116) {
                            var5--;
                            int var120 = field806[var5];
                            var6 -= 2;
                            String var121 = field810[var6];
                            String var122 = field810[var6 + 1];
                            if (var121.length() <= 500 && var122.length() <= 500) {
                                client.field324.method2670(216);
                                client.field324.method2394(1 + class123.method826(var121) + class123.method826(var122));
                                client.field324.method2468(var122);
                                client.field324.method2610(var120);
                                client.field324.method2468(var121);
                            }
                            continue;
                        }
                    } else if (var431 < 3300) {
                        if (var431 == 3200) {
                            var5 -= 3;
                            client.method123(field806[var5], field806[var5 + 1], field806[var5 + 2]);
                            continue;
                        }
                        if (var431 == 3201) {
                            var5--;
                            int var123 = field806[var5];
                            if (var123 == -1 && !client.field519) {
                                Statics.field3009.method3444();
                                class187.field3010 = 1;
                                Statics.field3011 = null;
                            } else if (var123 != -1 && client.field518 != var123 && client.field517 != 0 && !client.field519) {
                                class172 var124 = Statics.field3109;
                                int var125 = client.field517;
                                class187.field3010 = 1;
                                Statics.field3011 = var124;
                                Statics.field2331 = var123;
                                Statics.field2092 = 0;
                                Statics.field3012 = var125;
                                Statics.field3017 = false;
                                Statics.field786 = 2;
                            }
                            client.field518 = var123;
                            continue;
                        }
                        if (var431 == 3202) {
                            var5 -= 2;
                            int var126 = field806[var5];
                            int var10000 = field806[var5 + 1];
                            if (client.field517 != 0 && var126 != -1) {
                                class187.method2627(Statics.field2095, var126, 0, client.field517, false);
                                client.field519 = true;
                            }
                            continue;
                        }
                    } else if (var431 < 3400) {
                        if (var431 == 3300) {
                            field806[var5++] = client.field291;
                            continue;
                        }
                        if (var431 == 3301) {
                            var5 -= 2;
                            int var128 = field806[var5];
                            int var129 = field806[var5 + 1];
                            field806[var5++] = class16.method738(var128, var129);
                            continue;
                        }
                        if (var431 == 3302) {
                            var5 -= 2;
                            int var130 = field806[var5];
                            int var131 = field806[var5 + 1];
                            field806[var5++] = class16.method359(var130, var131);
                            continue;
                        }
                        if (var431 == 3303) {
                            var5 -= 2;
                            int var132 = field806[var5];
                            int var133 = field806[var5 + 1];
                            field806[var5++] = class16.method48(var132, var133);
                            continue;
                        }
                        if (var431 == 3304) {
                            var5--;
                            int var134 = field806[var5];
                            field806[var5++] = Statics.method1038(var134).field1145;
                            continue;
                        }
                        if (var431 == 3305) {
                            var5--;
                            int var135 = field806[var5];
                            field806[var5++] = client.field417[var135];
                            continue;
                        }
                        if (var431 == 3306) {
                            var5--;
                            int var136 = field806[var5];
                            field806[var5++] = client.field418[var136];
                            continue;
                        }
                        if (var431 == 3307) {
                            var5--;
                            int var137 = field806[var5];
                            field806[var5++] = client.field465[var137];
                            continue;
                        }
                        if (var431 == 3308) {
                            int var138 = Statics.field1819;
                            int var139 = (Statics.field1067.field852 >> 7) + Statics.field676;
                            int var140 = (Statics.field1067.field869 >> 7) + Statics.field2366;
                            field806[var5++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var431 == 3309) {
                            var5--;
                            int var141 = field806[var5];
                            field806[var5++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var431 == 3310) {
                            var5--;
                            int var142 = field806[var5];
                            field806[var5++] = var142 >> 28;
                            continue;
                        }
                        if (var431 == 3311) {
                            var5--;
                            int var143 = field806[var5];
                            field806[var5++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var431 == 3312) {
                            field806[var5++] = client.field286 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3313) {
                            var5 -= 2;
                            int var144 = field806[var5] + 32768;
                            int var145 = field806[var5 + 1];
                            field806[var5++] = class16.method738(var144, var145);
                            continue;
                        }
                        if (var431 == 3314) {
                            var5 -= 2;
                            int var146 = field806[var5] + 32768;
                            int var147 = field806[var5 + 1];
                            field806[var5++] = class16.method359(var146, var147);
                            continue;
                        }
                        if (var431 == 3315) {
                            var5 -= 2;
                            int var148 = field806[var5] + 32768;
                            int var149 = field806[var5 + 1];
                            field806[var5++] = class16.method48(var148, var149);
                            continue;
                        }
                        if (var431 == 3316) {
                            if (client.field313 >= 2) {
                                field806[var5++] = client.field313;
                            } else {
                                field806[var5++] = 0;
                            }
                            continue;
                        }
                        if (var431 == 3317) {
                            field806[var5++] = client.field298;
                            continue;
                        }
                        if (var431 == 3318) {
                            field806[var5++] = client.field283;
                            continue;
                        }
                        if (var431 == 3321) {
                            field806[var5++] = client.field445;
                            continue;
                        }
                        if (var431 == 3322) {
                            field806[var5++] = client.field528;
                            continue;
                        }
                        if (var431 == 3323) {
                            if (client.field449) {
                                field806[var5++] = 1;
                            } else {
                                field806[var5++] = 0;
                            }
                            continue;
                        }
                        if (var431 == 3324) {
                            field806[var5++] = client.field284;
                            continue;
                        }
                    } else if (var431 < 3500) {
                        if (var431 == 3400) {
                            var5 -= 2;
                            int var150 = field806[var5];
                            int var151 = field806[var5 + 1];
                            class53 var152 = class53.method2328(var150);
                            if (var152.field1122 != 's') {
                            }
                            for (int var153 = 0; var153 < var152.field1119; var153++) {
                                if (var152.field1126[var153] == var151) {
                                    field810[var6++] = var152.field1123[var153];
                                    var152 = null;
                                    break;
                                }
                            }
                            if (var152 != null) {
                                field810[var6++] = var152.field1133;
                            }
                            continue;
                        }
                        if (var431 == 3408) {
                            var5 -= 4;
                            int var154 = field806[var5];
                            int var155 = field806[var5 + 1];
                            int var156 = field806[var5 + 2];
                            int var157 = field806[var5 + 3];
                            class53 var158 = class53.method2328(var156);
                            if (var158.field1121 == var154 && var158.field1122 == var155) {
                                for (int var159 = 0; var159 < var158.field1119; var159++) {
                                    if (var158.field1126[var159] == var157) {
                                        if (var155 == 115) {
                                            field810[var6++] = var158.field1123[var159];
                                        } else {
                                            field806[var5++] = var158.field1129[var159];
                                        }
                                        var158 = null;
                                        break;
                                    }
                                }
                                if (var158 != null) {
                                    if (var155 == 115) {
                                        field810[var6++] = var158.field1133;
                                    } else {
                                        field806[var5++] = var158.field1124;
                                    }
                                }
                                continue;
                            }
                            if (var155 == 115) {
                                field810[var6++] = "null";
                            } else {
                                field806[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var431 < 3700) {
                        if (var431 == 3600) {
                            if (client.field503 == 0) {
                                field806[var5++] = -2;
                            } else if (client.field503 == 1) {
                                field806[var5++] = -1;
                            } else {
                                field806[var5++] = client.field532;
                            }
                            continue;
                        }
                        if (var431 == 3601) {
                            var5--;
                            int var160 = field806[var5];
                            if (client.field503 == 2 && var160 < client.field532) {
                                field810[var6++] = client.field550[var160].field252;
                                field810[var6++] = client.field550[var160].field249;
                                continue;
                            }
                            field810[var6++] = "";
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 3602) {
                            var5--;
                            int var161 = field806[var5];
                            if (client.field503 == 2 && var161 < client.field532) {
                                field806[var5++] = client.field550[var161].field250;
                                continue;
                            }
                            field806[var5++] = 0;
                            continue;
                        }
                        if (var431 == 3603) {
                            var5--;
                            int var162 = field806[var5];
                            if (client.field503 == 2 && var162 < client.field532) {
                                field806[var5++] = client.field550[var162].field251;
                                continue;
                            }
                            field806[var5++] = 0;
                            continue;
                        }
                        if (var431 == 3604) {
                            var6--;
                            String var163 = field810[var6];
                            var5--;
                            int var164 = field806[var5];
                            client.method641(var163, var164);
                            continue;
                        }
                        if (var431 == 3605) {
                            var6--;
                            String var165 = field810[var6];
                            if (var165 == null) {
                                continue;
                            }
                            if ((client.field532 < 200 || client.field564 == 1) && client.field532 < 400) {
                                String var166 = class168.method120(var165, Statics.field2088);
                                if (var166 == null) {
                                    continue;
                                }
                                for (int var167 = 0; var167 < client.field532; var167++) {
                                    class18 var168 = client.field550[var167];
                                    String var169 = class168.method120(var168.field252, Statics.field2088);
                                    if (var169 != null && var169.equals(var166)) {
                                        class12.method558(30, "", var165 + class161.field2537);
                                        continue label2917;
                                    }
                                    if (var168.field249 != null) {
                                        String var170 = class168.method120(var168.field249, Statics.field2088);
                                        if (var170 != null && var170.equals(var166)) {
                                            class12.method558(30, "", var165 + class161.field2537);
                                            continue label2917;
                                        }
                                    }
                                }
                                for (int var171 = 0; var171 < client.field552; var171++) {
                                    class8 var172 = client.field553[var171];
                                    String var173 = class168.method120(var172.field129, Statics.field2088);
                                    if (var173 != null && var173.equals(var166)) {
                                        class12.method558(30, "", class161.field2542 + var165 + class161.field2543);
                                        continue label2917;
                                    }
                                    if (var172.field128 != null) {
                                        String var174 = class168.method120(var172.field128, Statics.field2088);
                                        if (var174 != null && var174.equals(var166)) {
                                            class12.method558(30, "", class161.field2542 + var165 + class161.field2543);
                                            continue label2917;
                                        }
                                    }
                                }
                                if (class168.method120(Statics.field1067.field28, Statics.field2088).equals(var166)) {
                                    class12.method558(30, "", class161.field2525);
                                } else {
                                    client.field324.method2670(121);
                                    client.field324.method2567(class123.method826(var165));
                                    client.field324.method2468(var165);
                                }
                                continue;
                            }
                            class12.method558(30, "", class161.field2624);
                            continue;
                        }
                        if (var431 == 3606) {
                            var6--;
                            String var175 = field810[var6];
                            if (var175 == null) {
                                continue;
                            }
                            String var176 = class168.method120(var175, Statics.field2088);
                            if (var176 == null) {
                                continue;
                            }
                            int var177 = 0;
                            while (true) {
                                if (var177 >= client.field532) {
                                    continue label2917;
                                }
                                class18 var178 = client.field550[var177];
                                String var179 = var178.field252;
                                String var180 = class168.method120(var179, Statics.field2088);
                                if (class133.method2216(var175, var176, var179, var180)) {
                                    client.field532--;
                                    for (int var181 = var177; var181 < client.field532; var181++) {
                                        client.field550[var181] = client.field550[var181 + 1];
                                    }
                                    client.field473 = client.field533;
                                    client.field324.method2670(204);
                                    client.field324.method2567(class123.method826(var175));
                                    client.field324.method2468(var175);
                                    continue label2917;
                                }
                                var177++;
                            }
                        }
                        if (var431 == 3607) {
                            var6--;
                            String var182 = field810[var6];
                            if (var182 == null) {
                                continue;
                            }
                            if ((client.field552 < 100 || client.field564 == 1) && client.field552 < 400) {
                                String var183 = class168.method120(var182, Statics.field2088);
                                if (var183 == null) {
                                    continue;
                                }
                                for (int var184 = 0; var184 < client.field552; var184++) {
                                    class8 var185 = client.field553[var184];
                                    String var186 = class168.method120(var185.field129, Statics.field2088);
                                    if (var186 != null && var186.equals(var183)) {
                                        class12.method558(31, "", var182 + class161.field2539);
                                        continue label2917;
                                    }
                                    if (var185.field128 != null) {
                                        String var187 = class168.method120(var185.field128, Statics.field2088);
                                        if (var187 != null && var187.equals(var183)) {
                                            class12.method558(31, "", var182 + class161.field2539);
                                            continue label2917;
                                        }
                                    }
                                }
                                for (int var188 = 0; var188 < client.field532; var188++) {
                                    class18 var189 = client.field550[var188];
                                    String var190 = class168.method120(var189.field252, Statics.field2088);
                                    if (var190 != null && var190.equals(var183)) {
                                        class12.method558(31, "", class161.field2554 + var182 + class161.field2541);
                                        continue label2917;
                                    }
                                    if (var189.field249 != null) {
                                        String var191 = class168.method120(var189.field249, Statics.field2088);
                                        if (var191 != null && var191.equals(var183)) {
                                            class12.method558(31, "", class161.field2554 + var182 + class161.field2541);
                                            continue label2917;
                                        }
                                    }
                                }
                                if (class168.method120(Statics.field1067.field28, Statics.field2088).equals(var183)) {
                                    class12.method558(31, "", class161.field2446);
                                } else {
                                    client.field324.method2670(236);
                                    client.field324.method2567(class123.method826(var182));
                                    client.field324.method2468(var182);
                                }
                                continue;
                            }
                            class12.method558(31, "", class161.field2538);
                            continue;
                        }
                        if (var431 == 3608) {
                            var6--;
                            String var192 = field810[var6];
                            client.method154(var192);
                            continue;
                        }
                        if (var431 == 3609) {
                            var6--;
                            String var193 = field810[var6];
                            class156[] var194 = new class156[] { class156.field2313, class156.field2315, class156.field2314, class156.field2312, class156.field2321 };
                            class156[] var195 = var194;
                            for (int var196 = 0; var196 < var195.length; var196++) {
                                class156 var197 = var195[var196];
                                if (var197.field2311 != -1) {
                                    int var199 = var197.field2311;
                                    String var200 = "<img=" + var199 + ">";
                                    if (var193.startsWith(var200)) {
                                        var193 = var193.substring(6 + Integer.toString(var197.field2311).length());
                                        break;
                                    }
                                }
                            }
                            field806[var5++] = client.method2294(var193, false) ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3611) {
                            if (client.field542 == null) {
                                field810[var6++] = "";
                            } else {
                                String[] var201 = field810;
                                int var202 = var6++;
                                String var203 = client.field542;
                                String var204 = class166.method2995(Statics.method2361(var203));
                                if (var204 == null) {
                                    var204 = "";
                                }
                                var201[var202] = var204;
                            }
                            continue;
                        }
                        if (var431 == 3612) {
                            if (client.field542 == null) {
                                field806[var5++] = 0;
                            } else {
                                field806[var5++] = Statics.field26;
                            }
                            continue;
                        }
                        if (var431 == 3613) {
                            var5--;
                            int var206 = field806[var5];
                            if (client.field542 != null && var206 < Statics.field26) {
                                field810[var6++] = Statics.field200[var206].field626;
                                continue;
                            }
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 3614) {
                            var5--;
                            int var207 = field806[var5];
                            if (client.field542 != null && var207 < Statics.field26) {
                                field806[var5++] = Statics.field200[var207].field623;
                                continue;
                            }
                            field806[var5++] = 0;
                            continue;
                        }
                        if (var431 == 3615) {
                            var5--;
                            int var208 = field806[var5];
                            if (client.field542 != null && var208 < Statics.field26) {
                                field806[var5++] = Statics.field200[var208].field624;
                                continue;
                            }
                            field806[var5++] = 0;
                            continue;
                        }
                        if (var431 == 3616) {
                            field806[var5++] = Statics.field1664;
                            continue;
                        }
                        if (var431 == 3617) {
                            var6--;
                            String var209 = field810[var6];
                            if (Statics.field200 != null) {
                                client.field324.method2670(27);
                                client.field324.method2567(class123.method826(var209));
                                client.field324.method2468(var209);
                            }
                            continue;
                        }
                        if (var431 == 3618) {
                            field806[var5++] = Statics.field637;
                            continue;
                        }
                        if (var431 == 3619) {
                            var6--;
                            String var210 = field810[var6];
                            Statics.method720(var210);
                            continue;
                        }
                        if (var431 == 3620) {
                            client.field324.method2670(160);
                            client.field324.method2567(0);
                            continue;
                        }
                        if (var431 == 3621) {
                            if (client.field503 == 0) {
                                field806[var5++] = -1;
                            } else {
                                field806[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var431 == 3622) {
                            var5--;
                            int var211 = field806[var5];
                            if (client.field503 != 0 && var211 < client.field552) {
                                field810[var6++] = client.field553[var211].field129;
                                field810[var6++] = client.field553[var211].field128;
                                continue;
                            }
                            field810[var6++] = "";
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 3623) {
                            String var212;
                            label2704: {
                                var6--;
                                var212 = field810[var6];
                                String var214 = "<img=0>";
                                if (!var212.startsWith(var214)) {
                                    String var216 = "<img=1>";
                                    if (!var212.startsWith(var216)) {
                                        break label2704;
                                    }
                                }
                                var212 = var212.substring(7);
                            }
                            field806[var5++] = client.method2813(var212) ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3624) {
                            var5--;
                            int var217 = field806[var5];
                            if (Statics.field200 != null && var217 < Statics.field26 && Statics.field200[var217].field626.equalsIgnoreCase(Statics.field1067.field28)) {
                                field806[var5++] = 1;
                                continue;
                            }
                            field806[var5++] = 0;
                            continue;
                        }
                        if (var431 == 3625) {
                            if (client.field508 == null) {
                                field810[var6++] = "";
                            } else {
                                String[] var218 = field810;
                                int var219 = var6++;
                                String var220 = client.field508;
                                String var221 = class166.method2995(Statics.method2361(var220));
                                if (var221 == null) {
                                    var221 = "";
                                }
                                var218[var219] = var221;
                            }
                            continue;
                        }
                    } else if (var431 < 4000) {
                        if (var431 == 3903) {
                            var5--;
                            int var223 = field806[var5];
                            field806[var5++] = client.field557[var223].method3764();
                            continue;
                        }
                        if (var431 == 3904) {
                            var5--;
                            int var224 = field806[var5];
                            field806[var5++] = client.field557[var224].field3222;
                            continue;
                        }
                        if (var431 == 3905) {
                            var5--;
                            int var225 = field806[var5];
                            field806[var5++] = client.field557[var225].field3220;
                            continue;
                        }
                        if (var431 == 3906) {
                            var5--;
                            int var226 = field806[var5];
                            field806[var5++] = client.field557[var226].field3221;
                            continue;
                        }
                        if (var431 == 3907) {
                            var5--;
                            int var227 = field806[var5];
                            field806[var5++] = client.field557[var227].field3223;
                            continue;
                        }
                        if (var431 == 3908) {
                            var5--;
                            int var228 = field806[var5];
                            field806[var5++] = client.field557[var228].field3224;
                            continue;
                        }
                        if (var431 == 3910) {
                            var5--;
                            int var229 = field806[var5];
                            int var230 = client.field557[var229].method3763();
                            field806[var5++] = var230 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3911) {
                            var5--;
                            int var231 = field806[var5];
                            int var232 = client.field557[var231].method3763();
                            field806[var5++] = var232 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3912) {
                            var5--;
                            int var233 = field806[var5];
                            int var234 = client.field557[var233].method3763();
                            field806[var5++] = var234 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3913) {
                            var5--;
                            int var235 = field806[var5];
                            int var236 = client.field557[var235].method3763();
                            field806[var5++] = var236 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 3914) {
                            var5--;
                            boolean var237 = field806[var5] == 1;
                            if (Statics.field56 != null) {
                                Statics.field56.method3781(class225.field3228, var237);
                            }
                            continue;
                        }
                        if (var431 == 3915) {
                            var5--;
                            boolean var238 = field806[var5] == 1;
                            if (Statics.field56 != null) {
                                Statics.field56.method3781(class225.field3225, var238);
                            }
                            continue;
                        }
                        if (var431 == 3916) {
                            var5 -= 2;
                            boolean var239 = field806[var5] == 1;
                            boolean var240 = field806[var5 + 1] == 1;
                            if (Statics.field56 != null) {
                                Statics.field56.method3781(new class23(var240), var239);
                            }
                            continue;
                        }
                        if (var431 == 3917) {
                            var5--;
                            boolean var241 = field806[var5] == 1;
                            if (Statics.field56 != null) {
                                Statics.field56.method3781(class225.field3226, var241);
                            }
                            continue;
                        }
                        if (var431 == 3918) {
                            var5--;
                            boolean var242 = field806[var5] == 1;
                            if (Statics.field56 != null) {
                                Statics.field56.method3781(class225.field3229, var242);
                            }
                            continue;
                        }
                        if (var431 == 3919) {
                            field806[var5++] = Statics.field56 == null ? 0 : Statics.field56.field3227.size();
                            continue;
                        }
                        if (var431 == 3920) {
                            var5--;
                            int var243 = field806[var5];
                            class218 var244 = (class218) Statics.field56.field3227.get(var243);
                            field806[var5++] = var244.field3205;
                            continue;
                        }
                        if (var431 == 3921) {
                            var5--;
                            int var245 = field806[var5];
                            class218 var246 = (class218) Statics.field56.field3227.get(var245);
                            field810[var6++] = var246.method3719();
                            continue;
                        }
                        if (var431 == 3922) {
                            var5--;
                            int var247 = field806[var5];
                            class218 var248 = (class218) Statics.field56.field3227.get(var247);
                            field810[var6++] = var248.method3717();
                            continue;
                        }
                        if (var431 == 3923) {
                            var5--;
                            int var249 = field806[var5];
                            class218 var250 = (class218) Statics.field56.field3227.get(var249);
                            long var251 = class119.method698() - Statics.field1138 - var250.field3207;
                            int var253 = (int) (var251 / 3600000L);
                            int var254 = (int) ((var251 - (long) (var253 * 3600000)) / 60000L);
                            int var255 = (int) ((var251 - (long) (var253 * 3600000) - (long) (var254 * 60000)) / 1000L);
                            String var256 = var253 + ":" + var254 / 10 + var254 % 10 + ":" + var255 / 10 + var255 % 10;
                            field810[var6++] = var256;
                            continue;
                        }
                        if (var431 == 3924) {
                            var5--;
                            int var257 = field806[var5];
                            class218 var258 = (class218) Statics.field56.field3227.get(var257);
                            field806[var5++] = var258.field3204.field3221;
                            continue;
                        }
                        if (var431 == 3925) {
                            var5--;
                            int var259 = field806[var5];
                            class218 var260 = (class218) Statics.field56.field3227.get(var259);
                            field806[var5++] = var260.field3204.field3220;
                            continue;
                        }
                        if (var431 == 3926) {
                            var5--;
                            int var261 = field806[var5];
                            class218 var262 = (class218) Statics.field56.field3227.get(var261);
                            field806[var5++] = var262.field3204.field3222;
                            continue;
                        }
                    } else if (var431 < 4100) {
                        if (var431 == 4000) {
                            var5 -= 2;
                            int var263 = field806[var5];
                            int var264 = field806[var5 + 1];
                            field806[var5++] = var263 + var264;
                            continue;
                        }
                        if (var431 == 4001) {
                            var5 -= 2;
                            int var265 = field806[var5];
                            int var266 = field806[var5 + 1];
                            field806[var5++] = var265 - var266;
                            continue;
                        }
                        if (var431 == 4002) {
                            var5 -= 2;
                            int var267 = field806[var5];
                            int var268 = field806[var5 + 1];
                            field806[var5++] = var267 * var268;
                            continue;
                        }
                        if (var431 == 4003) {
                            var5 -= 2;
                            int var269 = field806[var5];
                            int var270 = field806[var5 + 1];
                            field806[var5++] = var269 / var270;
                            continue;
                        }
                        if (var431 == 4004) {
                            var5--;
                            int var271 = field806[var5];
                            field806[var5++] = (int) (Math.random() * (double) var271);
                            continue;
                        }
                        if (var431 == 4005) {
                            var5--;
                            int var272 = field806[var5];
                            field806[var5++] = (int) (Math.random() * (double) (var272 + 1));
                            continue;
                        }
                        if (var431 == 4006) {
                            var5 -= 5;
                            int var273 = field806[var5];
                            int var274 = field806[var5 + 1];
                            int var275 = field806[var5 + 2];
                            int var276 = field806[var5 + 3];
                            int var277 = field806[var5 + 4];
                            field806[var5++] = (var274 - var273) * (var277 - var275) / (var276 - var275) + var273;
                            continue;
                        }
                        if (var431 == 4007) {
                            var5 -= 2;
                            int var278 = field806[var5];
                            int var279 = field806[var5 + 1];
                            field806[var5++] = var278 * var279 / 100 + var278;
                            continue;
                        }
                        if (var431 == 4008) {
                            var5 -= 2;
                            int var280 = field806[var5];
                            int var281 = field806[var5 + 1];
                            field806[var5++] = var280 | 0x1 << var281;
                            continue;
                        }
                        if (var431 == 4009) {
                            var5 -= 2;
                            int var282 = field806[var5];
                            int var283 = field806[var5 + 1];
                            field806[var5++] = var282 & -1 - (0x1 << var283);
                            continue;
                        }
                        if (var431 == 4010) {
                            var5 -= 2;
                            int var284 = field806[var5];
                            int var285 = field806[var5 + 1];
                            field806[var5++] = (var284 & 0x1 << var285) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var431 == 4011) {
                            var5 -= 2;
                            int var286 = field806[var5];
                            int var287 = field806[var5 + 1];
                            field806[var5++] = var286 % var287;
                            continue;
                        }
                        if (var431 == 4012) {
                            var5 -= 2;
                            int var288 = field806[var5];
                            int var289 = field806[var5 + 1];
                            if (var288 == 0) {
                                field806[var5++] = 0;
                            } else {
                                field806[var5++] = (int) Math.pow((double) var288, (double) var289);
                            }
                            continue;
                        }
                        if (var431 == 4013) {
                            var5 -= 2;
                            int var290 = field806[var5];
                            int var291 = field806[var5 + 1];
                            if (var290 == 0) {
                                field806[var5++] = 0;
                            } else if (var291 == 0) {
                                field806[var5++] = Integer.MAX_VALUE;
                            } else {
                                field806[var5++] = (int) Math.pow((double) var290, 1.0D / (double) var291);
                            }
                            continue;
                        }
                        if (var431 == 4014) {
                            var5 -= 2;
                            int var292 = field806[var5];
                            int var293 = field806[var5 + 1];
                            field806[var5++] = var292 & var293;
                            continue;
                        }
                        if (var431 == 4015) {
                            var5 -= 2;
                            int var294 = field806[var5];
                            int var295 = field806[var5 + 1];
                            field806[var5++] = var294 | var295;
                            continue;
                        }
                        if (var431 == 4018) {
                            var5 -= 3;
                            long var296 = (long) field806[var5];
                            long var298 = (long) field806[var5 + 1];
                            long var300 = (long) field806[var5 + 2];
                            field806[var5++] = (int) (var296 * var300 / var298);
                            continue;
                        }
                    } else if (var431 < 4200) {
                        if (var431 == 4100) {
                            var6--;
                            String var302 = field810[var6];
                            var5--;
                            int var303 = field806[var5];
                            field810[var6++] = var302 + var303;
                            continue;
                        }
                        if (var431 == 4101) {
                            var6 -= 2;
                            String var304 = field810[var6];
                            String var305 = field810[var6 + 1];
                            field810[var6++] = var304 + var305;
                            continue;
                        }
                        if (var431 == 4102) {
                            var6--;
                            String var306 = field810[var6];
                            var5--;
                            int var307 = field806[var5];
                            field810[var6++] = var306 + class167.method144(var307, true);
                            continue;
                        }
                        if (var431 == 4103) {
                            var6--;
                            String var308 = field810[var6];
                            field810[var6++] = var308.toLowerCase();
                            continue;
                        }
                        if (var431 == 4104) {
                            var5--;
                            int var309 = field806[var5];
                            long var310 = ((long) var309 + 11745L) * 86400000L;
                            field811.setTime(new Date(var310));
                            int var312 = field811.get(5);
                            int var313 = field811.get(2);
                            int var314 = field811.get(1);
                            field810[var6++] = var312 + "-" + field802[var313] + "-" + var314;
                            continue;
                        }
                        if (var431 == 4105) {
                            var6 -= 2;
                            String var315 = field810[var6];
                            String var316 = field810[var6 + 1];
                            if (Statics.field1067.field34 != null && Statics.field1067.field34.field2972) {
                                field810[var6++] = var316;
                                continue;
                            }
                            field810[var6++] = var315;
                            continue;
                        }
                        if (var431 == 4106) {
                            var5--;
                            int var317 = field806[var5];
                            field810[var6++] = Integer.toString(var317);
                            continue;
                        }
                        if (var431 == 4107) {
                            var6 -= 2;
                            int[] var318 = field806;
                            int var319 = var5++;
                            int var320 = class170.method1621(field810[var6], field810[var6 + 1], client.field282);
                            byte var321;
                            if (var320 > 0) {
                                var321 = 1;
                            } else if (var320 < 0) {
                                var321 = -1;
                            } else {
                                var321 = 0;
                            }
                            var318[var319] = var321;
                            continue;
                        }
                        if (var431 == 4108) {
                            var6--;
                            String var322 = field810[var6];
                            var5 -= 2;
                            int var323 = field806[var5];
                            int var324 = field806[var5 + 1];
                            byte[] var325 = Statics.field312.method3079(var324, 0);
                            class228 var326 = new class228(var325);
                            field806[var5++] = var326.method3791(var322, var323);
                            continue;
                        }
                        if (var431 == 4109) {
                            var6--;
                            String var327 = field810[var6];
                            var5 -= 2;
                            int var328 = field806[var5];
                            int var329 = field806[var5 + 1];
                            byte[] var330 = Statics.field312.method3079(var329, 0);
                            class228 var331 = new class228(var330);
                            field806[var5++] = var331.method3790(var327, var328);
                            continue;
                        }
                        if (var431 == 4110) {
                            var6 -= 2;
                            String var332 = field810[var6];
                            String var333 = field810[var6 + 1];
                            var5--;
                            if (field806[var5] == 1) {
                                field810[var6++] = var332;
                            } else {
                                field810[var6++] = var333;
                            }
                            continue;
                        }
                        if (var431 == 4111) {
                            var6--;
                            String var334 = field810[var6];
                            field810[var6++] = class227.method3832(var334);
                            continue;
                        }
                        if (var431 == 4112) {
                            var6--;
                            String var335 = field810[var6];
                            var5--;
                            int var336 = field806[var5];
                            field810[var6++] = var335 + (char) var336;
                            continue;
                        }
                        if (var431 == 4113) {
                            var5--;
                            int var337 = field806[var5];
                            field806[var5++] = class167.method2993((char) var337) ? 1 : 0;
                            continue;
                        }
                        if (var431 == 4114) {
                            var5--;
                            int var338 = field806[var5];
                            field806[var5++] = class167.method2787((char) var338) ? 1 : 0;
                            continue;
                        }
                        if (var431 == 4115) {
                            var5--;
                            int var339 = field806[var5];
                            int[] var340 = field806;
                            int var341 = var5++;
                            char var342 = (char) var339;
                            boolean var343 = var342 >= 'A' && var342 <= 'Z' || var342 >= 'a' && var342 <= 'z';
                            var340[var341] = var343 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 4116) {
                            var5--;
                            int var344 = field806[var5];
                            field806[var5++] = class167.method3012((char) var344) ? 1 : 0;
                            continue;
                        }
                        if (var431 == 4117) {
                            var6--;
                            String var345 = field810[var6];
                            if (var345 == null) {
                                field806[var5++] = 0;
                            } else {
                                field806[var5++] = var345.length();
                            }
                            continue;
                        }
                        if (var431 == 4118) {
                            var6--;
                            String var346 = field810[var6];
                            var5 -= 2;
                            int var347 = field806[var5];
                            int var348 = field806[var5 + 1];
                            field810[var6++] = var346.substring(var347, var348);
                            continue;
                        }
                        if (var431 == 4119) {
                            var6--;
                            String var349 = field810[var6];
                            StringBuilder var350 = new StringBuilder(var349.length());
                            boolean var351 = false;
                            for (int var352 = 0; var352 < var349.length(); var352++) {
                                char var353 = var349.charAt(var352);
                                if (var353 == '<') {
                                    var351 = true;
                                } else if (var353 == '>') {
                                    var351 = false;
                                } else if (!var351) {
                                    var350.append(var353);
                                }
                            }
                            field810[var6++] = var350.toString();
                            continue;
                        }
                        if (var431 == 4120) {
                            var6--;
                            String var354 = field810[var6];
                            var5--;
                            int var355 = field806[var5];
                            field806[var5++] = var354.indexOf(var355);
                            continue;
                        }
                        if (var431 == 4121) {
                            var6 -= 2;
                            String var356 = field810[var6];
                            String var357 = field810[var6 + 1];
                            var5--;
                            int var358 = field806[var5];
                            field806[var5++] = var356.indexOf(var357, var358);
                            continue;
                        }
                    } else if (var431 < 4300) {
                        if (var431 == 4200) {
                            var5--;
                            int var359 = field806[var5];
                            field810[var6++] = class56.method709(var359).field1158;
                            continue;
                        }
                        if (var431 == 4201) {
                            var5 -= 2;
                            int var360 = field806[var5];
                            int var361 = field806[var5 + 1];
                            class56 var362 = class56.method709(var360);
                            if (var361 >= 1 && var361 <= 5 && var362.field1179[var361 - 1] != null) {
                                field810[var6++] = var362.field1179[var361 - 1];
                                continue;
                            }
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 4202) {
                            var5 -= 2;
                            int var363 = field806[var5];
                            int var364 = field806[var5 + 1];
                            class56 var365 = class56.method709(var363);
                            if (var364 >= 1 && var364 <= 5 && var365.field1188[var364 - 1] != null) {
                                field810[var6++] = var365.field1188[var364 - 1];
                                continue;
                            }
                            field810[var6++] = "";
                            continue;
                        }
                        if (var431 == 4203) {
                            var5--;
                            int var366 = field806[var5];
                            field806[var5++] = class56.method709(var366).field1184;
                            continue;
                        }
                        if (var431 == 4204) {
                            var5--;
                            int var367 = field806[var5];
                            field806[var5++] = class56.method709(var367).field1209 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 4205) {
                            var5--;
                            int var368 = field806[var5];
                            class56 var369 = class56.method709(var368);
                            if (var369.field1196 == -1 && var369.field1195 >= 0) {
                                field806[var5++] = var369.field1195;
                                continue;
                            }
                            field806[var5++] = var368;
                            continue;
                        }
                        if (var431 == 4206) {
                            var5--;
                            int var370 = field806[var5];
                            class56 var371 = class56.method709(var370);
                            if (var371.field1196 >= 0 && var371.field1195 >= 0) {
                                field806[var5++] = var371.field1195;
                                continue;
                            }
                            field806[var5++] = var370;
                            continue;
                        }
                        if (var431 == 4207) {
                            var5--;
                            int var372 = field806[var5];
                            field806[var5++] = class56.method709(var372).field1178 ? 1 : 0;
                            continue;
                        }
                        if (var431 == 4208) {
                            var5--;
                            int var373 = field806[var5];
                            class56 var374 = class56.method709(var373);
                            if (var374.field1207 == -1 && var374.field1206 >= 0) {
                                field806[var5++] = var374.field1206;
                                continue;
                            }
                            field806[var5++] = var373;
                            continue;
                        }
                        if (var431 == 4209) {
                            var5--;
                            int var375 = field806[var5];
                            class56 var376 = class56.method709(var375);
                            if (var376.field1207 >= 0 && var376.field1206 >= 0) {
                                field806[var5++] = var376.field1206;
                                continue;
                            }
                            field806[var5++] = var375;
                            continue;
                        }
                        if (var431 == 4210) {
                            var6--;
                            String var377 = field810[var6];
                            var5--;
                            int var378 = field806[var5];
                            client.method50(var377, var378 == 1);
                            field806[var5++] = Statics.field567;
                            continue;
                        }
                        if (var431 == 4211) {
                            if (Statics.field1612 != null && Statics.field1667 < Statics.field567) {
                                field806[var5++] = Statics.field1612[++Statics.field1667 - 1] & 0xFFFF;
                                continue;
                            }
                            field806[var5++] = -1;
                            continue;
                        }
                        if (var431 == 4212) {
                            Statics.field1667 = 0;
                            continue;
                        }
                    } else if (var431 < 5100) {
                        if (var431 == 5000) {
                            field806[var5++] = client.field443;
                            continue;
                        }
                        if (var431 == 5001) {
                            var5 -= 3;
                            client.field443 = field806[var5];
                            Statics.field143 = class134.method2000(field806[var5 + 1]);
                            if (Statics.field143 == null) {
                                Statics.field143 = class134.field2111;
                            }
                            client.field323 = field806[var5 + 2];
                            client.field324.method2670(59);
                            client.field324.method2567(client.field443);
                            client.field324.method2567(Statics.field143.field2108);
                            client.field324.method2567(client.field323);
                            continue;
                        }
                        if (var431 == 5002) {
                            var6--;
                            String var379 = field810[var6];
                            var5 -= 2;
                            int var380 = field806[var5];
                            int var381 = field806[var5 + 1];
                            client.field324.method2670(167);
                            client.field324.method2567(class123.method826(var379) + 2);
                            client.field324.method2468(var379);
                            client.field324.method2567(var380 - 1);
                            client.field324.method2567(var381);
                            continue;
                        }
                        if (var431 == 5003) {
                            var5 -= 2;
                            int var382 = field806[var5];
                            int var383 = field806[var5 + 1];
                            class30 var384 = (class30) class12.field175.get(var382);
                            class38 var385 = var384.method627(var383);
                            if (var385 == null) {
                                field806[var5++] = -1;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                                field810[var6++] = "";
                                field810[var6++] = "";
                            } else {
                                field806[var5++] = var385.field794;
                                field806[var5++] = var385.field797;
                                field810[var6++] = var385.field798 == null ? "" : var385.field798;
                                field810[var6++] = var385.field801 == null ? "" : var385.field801;
                                field810[var6++] = var385.field799 == null ? "" : var385.field799;
                            }
                            continue;
                        }
                        if (var431 == 5004) {
                            var5--;
                            int var387 = field806[var5];
                            class38 var388 = class12.method2095(var387);
                            if (var388 == null) {
                                field806[var5++] = -1;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                                field810[var6++] = "";
                                field810[var6++] = "";
                            } else {
                                field806[var5++] = var388.field796;
                                field806[var5++] = var388.field797;
                                field810[var6++] = var388.field798 == null ? "" : var388.field798;
                                field810[var6++] = var388.field801 == null ? "" : var388.field801;
                                field810[var6++] = var388.field799 == null ? "" : var388.field799;
                            }
                            continue;
                        }
                        if (var431 == 5005) {
                            if (Statics.field143 == null) {
                                field806[var5++] = -1;
                            } else {
                                field806[var5++] = Statics.field143.field2108;
                            }
                            continue;
                        }
                        if (var431 == 5008) {
                            var6--;
                            String var389 = field810[var6];
                            var5--;
                            int var390 = field806[var5];
                            String var391 = var389.toLowerCase();
                            byte var392 = 0;
                            if (var391.startsWith(class161.field2546)) {
                                var392 = 0;
                                var389 = var389.substring(class161.field2546.length());
                            } else if (var391.startsWith(class161.field2623)) {
                                var392 = 1;
                                var389 = var389.substring(class161.field2623.length());
                            } else if (var391.startsWith(class161.field2550)) {
                                var392 = 2;
                                var389 = var389.substring(class161.field2550.length());
                            } else if (var391.startsWith(class161.field2587)) {
                                var392 = 3;
                                var389 = var389.substring(class161.field2587.length());
                            } else if (var391.startsWith(class161.field2570)) {
                                var392 = 4;
                                var389 = var389.substring(class161.field2570.length());
                            } else if (var391.startsWith(class161.field2548)) {
                                var392 = 5;
                                var389 = var389.substring(class161.field2548.length());
                            } else if (var391.startsWith(class161.field2557)) {
                                var392 = 6;
                                var389 = var389.substring(class161.field2557.length());
                            } else if (var391.startsWith(class161.field2560)) {
                                var392 = 7;
                                var389 = var389.substring(class161.field2560.length());
                            } else if (var391.startsWith(class161.field2562)) {
                                var392 = 8;
                                var389 = var389.substring(class161.field2562.length());
                            } else if (var391.startsWith(class161.field2564)) {
                                var392 = 9;
                                var389 = var389.substring(class161.field2564.length());
                            } else if (var391.startsWith(class161.field2566)) {
                                var392 = 10;
                                var389 = var389.substring(class161.field2566.length());
                            } else if (var391.startsWith(class161.field2568)) {
                                var392 = 11;
                                var389 = var389.substring(class161.field2568.length());
                            } else if (client.field282 != 0) {
                                if (var391.startsWith(class161.field2547)) {
                                    var392 = 0;
                                    var389 = var389.substring(class161.field2547.length());
                                } else if (var391.startsWith(class161.field2475)) {
                                    var392 = 1;
                                    var389 = var389.substring(class161.field2475.length());
                                } else if (var391.startsWith(class161.field2551)) {
                                    var392 = 2;
                                    var389 = var389.substring(class161.field2551.length());
                                } else if (var391.startsWith(class161.field2637)) {
                                    var392 = 3;
                                    var389 = var389.substring(class161.field2637.length());
                                } else if (var391.startsWith(class161.field2555)) {
                                    var392 = 4;
                                    var389 = var389.substring(class161.field2555.length());
                                } else if (var391.startsWith(class161.field2531)) {
                                    var392 = 5;
                                    var389 = var389.substring(class161.field2531.length());
                                } else if (var391.startsWith(class161.field2559)) {
                                    var392 = 6;
                                    var389 = var389.substring(class161.field2559.length());
                                } else if (var391.startsWith(class161.field2561)) {
                                    var392 = 7;
                                    var389 = var389.substring(class161.field2561.length());
                                } else if (var391.startsWith(class161.field2582)) {
                                    var392 = 8;
                                    var389 = var389.substring(class161.field2582.length());
                                } else if (var391.startsWith(class161.field2565)) {
                                    var392 = 9;
                                    var389 = var389.substring(class161.field2565.length());
                                } else if (var391.startsWith(class161.field2413)) {
                                    var392 = 10;
                                    var389 = var389.substring(class161.field2413.length());
                                } else if (var391.startsWith(class161.field2520)) {
                                    var392 = 11;
                                    var389 = var389.substring(class161.field2520.length());
                                }
                            }
                            String var393 = var389.toLowerCase();
                            byte var394 = 0;
                            if (var393.startsWith(class161.field2638)) {
                                var394 = 1;
                                var389 = var389.substring(class161.field2638.length());
                            } else if (var393.startsWith(class161.field2572)) {
                                var394 = 2;
                                var389 = var389.substring(class161.field2572.length());
                            } else if (var393.startsWith(class161.field2641)) {
                                var394 = 3;
                                var389 = var389.substring(class161.field2641.length());
                            } else if (var393.startsWith(class161.field2576)) {
                                var394 = 4;
                                var389 = var389.substring(class161.field2576.length());
                            } else if (var393.startsWith(class161.field2578)) {
                                var394 = 5;
                                var389 = var389.substring(class161.field2578.length());
                            } else if (client.field282 != 0) {
                                if (var393.startsWith(class161.field2571)) {
                                    var394 = 1;
                                    var389 = var389.substring(class161.field2571.length());
                                } else if (var393.startsWith(class161.field2651)) {
                                    var394 = 2;
                                    var389 = var389.substring(class161.field2651.length());
                                } else if (var393.startsWith(class161.field2596)) {
                                    var394 = 3;
                                    var389 = var389.substring(class161.field2596.length());
                                } else if (var393.startsWith(class161.field2577)) {
                                    var394 = 4;
                                    var389 = var389.substring(class161.field2577.length());
                                } else if (var393.startsWith(class161.field2579)) {
                                    var394 = 5;
                                    var389 = var389.substring(class161.field2579.length());
                                }
                            }
                            client.field324.method2670(26);
                            client.field324.method2567(0);
                            int var395 = client.field324.field2057;
                            client.field324.method2567(var390);
                            client.field324.method2567(var392);
                            client.field324.method2567(var394);
                            class226.method961(client.field324, var389);
                            client.field324.method2405(client.field324.field2057 - var395);
                            continue;
                        }
                        if (var431 == 5009) {
                            var6 -= 2;
                            String var396 = field810[var6];
                            String var397 = field810[var6 + 1];
                            client.field324.method2670(202);
                            client.field324.method2394(0);
                            int var398 = client.field324.field2057;
                            client.field324.method2468(var396);
                            class226.method961(client.field324, var397);
                            client.field324.method2404(client.field324.field2057 - var398);
                            continue;
                        }
                        if (var431 == 5015) {
                            String var399;
                            if (Statics.field1067 == null || Statics.field1067.field28 == null) {
                                var399 = "";
                            } else {
                                var399 = Statics.field1067.field28;
                            }
                            field810[var6++] = var399;
                            continue;
                        }
                        if (var431 == 5016) {
                            field806[var5++] = client.field323;
                            continue;
                        }
                        if (var431 == 5017) {
                            var5--;
                            int var400 = field806[var5];
                            field806[var5++] = class12.method119(var400);
                            continue;
                        }
                        if (var431 == 5018) {
                            var5--;
                            int var401 = field806[var5];
                            field806[var5++] = class12.method2006(var401);
                            continue;
                        }
                        if (var431 == 5019) {
                            var5--;
                            int var402 = field806[var5];
                            int[] var403 = field806;
                            int var404 = var5++;
                            class38 var405 = (class38) class12.field165.method3589((long) var402);
                            int var406;
                            if (var405 == null) {
                                var406 = -1;
                            } else if (class12.field166.field3158 == var405.field3164) {
                                var406 = -1;
                            } else {
                                var406 = ((class38) var405.field3164).field794;
                            }
                            var403[var404] = var406;
                            continue;
                        }
                        if (var431 == 5020) {
                            var6--;
                            String var407 = field810[var6];
                            if (var407.equalsIgnoreCase("toggleroof")) {
                                Statics.field2660.field146 = !Statics.field2660.field146;
                                class9.method81();
                                if (Statics.field2660.field146) {
                                    class12.method558(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method558(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var407.equalsIgnoreCase("displayfps")) {
                                client.field297 = !client.field297;
                            }
                            if (client.field313 >= 2) {
                                if (var407.equalsIgnoreCase("fpson")) {
                                    client.field297 = true;
                                }
                                if (var407.equalsIgnoreCase("fpsoff")) {
                                    client.field297 = false;
                                }
                                if (var407.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var407.equalsIgnoreCase("clientdrop")) {
                                    if (client.field441 > 0) {
                                        client.method2872();
                                    } else {
                                        client.method2720(40);
                                        Statics.field1260 = Statics.field695;
                                        Statics.field695 = null;
                                    }
                                }
                                if (var407.equalsIgnoreCase("errortest") && client.field561 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field324.method2670(201);
                            client.field324.method2567(var407.length() + 1);
                            client.field324.method2468(var407);
                            continue;
                        }
                        if (var431 == 5021) {
                            var6--;
                            client.field500 = field810[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var431 == 5022) {
                            field810[var6++] = client.field500;
                            continue;
                        }
                    }
                }
                if (var431 < 5400) {
                    if (var431 == 5306) {
                        field806[var5++] = client.method2001();
                        continue;
                    }
                    if (var431 == 5307) {
                        var5--;
                        int var408 = field806[var5];
                        if (var408 == 1 || var408 == 2) {
                            client.method160(var408);
                        }
                        continue;
                    }
                    if (var431 == 5308) {
                        field806[var5++] = Statics.field2660.field134;
                        continue;
                    }
                    if (var431 == 5309) {
                        var5--;
                        int var409 = field806[var5];
                        if (var409 == 1 || var409 == 2) {
                            Statics.field2660.field134 = var409;
                            class9.method81();
                        }
                        continue;
                    }
                }
                if (var431 < 5600) {
                    if (var431 == 5504) {
                        var5 -= 2;
                        int var410 = field806[var5];
                        int var411 = field806[var5 + 1];
                        if (!client.field419) {
                            client.field366 = var410;
                            client.field367 = var411;
                        }
                        continue;
                    }
                    if (var431 == 5505) {
                        field806[var5++] = client.field366;
                        continue;
                    }
                    if (var431 == 5506) {
                        field806[var5++] = client.field367;
                        continue;
                    }
                    if (var431 == 5530) {
                        var5--;
                        int var412 = field806[var5];
                        if (var412 < 0) {
                            var412 = 0;
                        }
                        client.field372 = var412;
                        continue;
                    }
                    if (var431 == 5531) {
                        field806[var5++] = client.field372;
                        continue;
                    }
                }
                if (var431 >= 5700 || var431 != 5630) {
                    if (var431 < 6300) {
                        if (var431 == 6200) {
                            var5 -= 2;
                            client.field499 = (short) field806[var5];
                            if (client.field499 <= 0) {
                                client.field499 = 256;
                            }
                            client.field332 = (short) field806[var5 + 1];
                            if (client.field332 <= 0) {
                                client.field332 = 205;
                            }
                            continue;
                        }
                        if (var431 == 6201) {
                            var5 -= 2;
                            client.field393 = (short) field806[var5];
                            if (client.field393 <= 0) {
                                client.field393 = 256;
                            }
                            client.field538 = (short) field806[var5 + 1];
                            if (client.field538 <= 0) {
                                client.field538 = 320;
                            }
                            continue;
                        }
                        if (var431 == 6202) {
                            var5 -= 4;
                            client.field539 = (short) field806[var5];
                            if (client.field539 <= 0) {
                                client.field539 = 1;
                            }
                            client.field540 = (short) field806[var5 + 1];
                            if (client.field540 <= 0) {
                                client.field540 = 32767;
                            } else if (client.field540 < client.field539) {
                                client.field540 = client.field539;
                            }
                            client.field541 = (short) field806[var5 + 2];
                            if (client.field541 <= 0) {
                                client.field541 = 1;
                            }
                            client.field285 = (short) field806[var5 + 3];
                            if (client.field285 <= 0) {
                                client.field285 = 32767;
                            } else if (client.field285 < client.field541) {
                                client.field285 = client.field541;
                            }
                            continue;
                        }
                        if (var431 == 6203) {
                            if (client.field464 == null) {
                                field806[var5++] = -1;
                                field806[var5++] = -1;
                            } else {
                                Statics.method116(0, 0, client.field464.field2826, client.field464.field2827, false);
                                field806[var5++] = client.field545;
                                field806[var5++] = client.field339;
                            }
                            continue;
                        }
                        if (var431 == 6204) {
                            field806[var5++] = client.field393;
                            field806[var5++] = client.field538;
                            continue;
                        }
                        if (var431 == 6205) {
                            field806[var5++] = client.field499;
                            field806[var5++] = client.field332;
                            continue;
                        }
                    }
                    if (var431 < 6600) {
                        if (var431 == 6500) {
                            field806[var5++] = class28.method2341() ? 1 : 0;
                            continue;
                        }
                        if (var431 == 6501) {
                            class28.field657 = 0;
                            class28 var413;
                            if (class28.field657 < class28.field647) {
                                var413 = Statics.field777[++class28.field657 - 1];
                            } else {
                                var413 = null;
                            }
                            if (var413 == null) {
                                field806[var5++] = -1;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                                field806[var5++] = 0;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                            } else {
                                field806[var5++] = var413.field655;
                                field806[var5++] = var413.field652;
                                field810[var6++] = var413.field648;
                                field806[var5++] = var413.field656;
                                field806[var5++] = var413.field646;
                                field810[var6++] = var413.field654;
                            }
                            continue;
                        }
                        if (var431 == 6502) {
                            class28 var416;
                            if (class28.field657 < class28.field647) {
                                var416 = Statics.field777[++class28.field657 - 1];
                            } else {
                                var416 = null;
                            }
                            if (var416 == null) {
                                field806[var5++] = -1;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                                field806[var5++] = 0;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                            } else {
                                field806[var5++] = var416.field655;
                                field806[var5++] = var416.field652;
                                field810[var6++] = var416.field648;
                                field806[var5++] = var416.field656;
                                field806[var5++] = var416.field646;
                                field810[var6++] = var416.field654;
                            }
                            continue;
                        }
                        if (var431 == 6506) {
                            var5--;
                            int var418 = field806[var5];
                            class28 var419 = null;
                            for (int var420 = 0; var420 < class28.field647; var420++) {
                                if (Statics.field777[var420].field655 == var418) {
                                    var419 = Statics.field777[var420];
                                    break;
                                }
                            }
                            if (var419 == null) {
                                field806[var5++] = -1;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                                field806[var5++] = 0;
                                field806[var5++] = 0;
                                field810[var6++] = "";
                            } else {
                                field806[var5++] = var419.field655;
                                field806[var5++] = var419.field652;
                                field810[var6++] = var419.field648;
                                field806[var5++] = var419.field656;
                                field806[var5++] = var419.field646;
                                field810[var6++] = var419.field654;
                            }
                            continue;
                        }
                        if (var431 == 6507) {
                            var5 -= 4;
                            int var421 = field806[var5];
                            boolean var422 = field806[var5 + 1] == 1;
                            int var423 = field806[var5 + 2];
                            boolean var424 = field806[var5 + 3] == 1;
                            if (Statics.field777 != null) {
                                class28.method3253(0, Statics.field777.length - 1, var421, var422, var423, var424);
                            }
                            continue;
                        }
                        if (var431 == 6511) {
                            var5--;
                            int var425 = field806[var5];
                            if (var425 >= 0 && var425 < class28.field647) {
                                class28 var426 = Statics.field777[var425];
                                field806[var5++] = var426.field655;
                                field806[var5++] = var426.field652;
                                field810[var6++] = var426.field648;
                                field806[var5++] = var426.field656;
                                field806[var5++] = var426.field646;
                                field810[var6++] = var426.field654;
                                continue;
                            }
                            field806[var5++] = -1;
                            field806[var5++] = 0;
                            field810[var6++] = "";
                            field806[var5++] = 0;
                            field806[var5++] = 0;
                            field810[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field441 = 250;
            }
        } catch (Exception var430) {
            StringBuilder var428 = new StringBuilder(30);
            var428.append("").append(var4.field3174).append(" ");
            for (int var429 = field803 - 1; var429 >= 0; var429--) {
                var428.append("").append(field809[var429].field204.field3174).append(" ");
            }
            var428.append("").append(var10);
            class152.method2217(var428.toString(), var430);
        }
    }

    @ObfuscatedName("ab.r(II)V")
    public static void method710(int arg0) {
        if (arg0 == -1 || !class177.method3201(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2905[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2892 != null) {
                class1 var4 = new class1();
                var4.field8 = var3;
                var4.field9 = var3.field2892;
                method2994(var4, 2000000);
            }
        }
    }
}
