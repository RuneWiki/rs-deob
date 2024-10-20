package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class39 {

    @ObfuscatedName("at.g")
    public static int[] field816 = new int[5];

    @ObfuscatedName("at.l")
    public static int[][] field818 = new int[5][5000];

    @ObfuscatedName("at.j")
    public static int[] field824 = new int[1000];

    @ObfuscatedName("at.r")
    public static String[] field819 = new String[1000];

    @ObfuscatedName("at.x")
    public static int field820 = 0;

    @ObfuscatedName("at.k")
    public static class15[] field821 = new class15[50];

    @ObfuscatedName("at.u")
    public static Calendar field823 = Calendar.getInstance();

    @ObfuscatedName("at.y")
    public static final String[] field817 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("at.p")
    public static int field827 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.m(Lm;IB)V")
    public static void method850(class1 arg0, int arg1) {
        Object[] var2 = arg0.field2;
        int var3 = (Integer) var2[0];
        class24 var4 = Statics.method686(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field592;
        int[] var9 = var4.field593;
        byte var10 = -1;
        field820 = 0;
        try {
            Statics.field814 = new int[var4.field597];
            int var11 = 0;
            Statics.field1531 = new String[var4.field596];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2796;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2797;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2796;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2797;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field12;
                    }
                    Statics.field814[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field14;
                    }
                    Statics.field1531[var12++] = var15;
                }
            }
            int var16 = 0;
            field827 = arg0.field11;
            label3300: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var515 = var8[var7];
                if (var515 < 100) {
                    if (var515 == 0) {
                        field824[var5++] = var9[var7];
                        continue;
                    }
                    if (var515 == 1) {
                        int var17 = var9[var7];
                        field824[var5++] = class180.field2950[var17];
                        continue;
                    }
                    if (var515 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2950[var18] = field824[var5];
                        client.method37(var18);
                        continue;
                    }
                    if (var515 == 3) {
                        field819[var6++] = var4.field594[var7];
                        continue;
                    }
                    if (var515 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var515 == 7) {
                        var5 -= 2;
                        if (field824[var5 + 1] != field824[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var515 == 8) {
                        var5 -= 2;
                        if (field824[var5 + 1] == field824[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var515 == 9) {
                        var5 -= 2;
                        if (field824[var5] < field824[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var515 == 10) {
                        var5 -= 2;
                        if (field824[var5] > field824[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var515 == 21) {
                        if (field820 == 0) {
                            return;
                        }
                        class15 var19 = field821[--field820];
                        var4 = var19.field193;
                        var8 = var4.field592;
                        var9 = var4.field593;
                        var7 = var19.field194;
                        Statics.field814 = var19.field190;
                        Statics.field1531 = var19.field191;
                        continue;
                    }
                    if (var515 == 25) {
                        int var20 = var9[var7];
                        field824[var5++] = class180.method145(var20);
                        continue;
                    }
                    if (var515 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class180.method3050(var21, field824[var5]);
                        continue;
                    }
                    if (var515 == 31) {
                        var5 -= 2;
                        if (field824[var5] <= field824[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var515 == 32) {
                        var5 -= 2;
                        if (field824[var5] >= field824[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var515 == 33) {
                        field824[var5++] = Statics.field814[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var515 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field814[var10001] = field824[var5];
                        continue;
                    }
                    if (var515 == 35) {
                        field819[var6++] = Statics.field1531[var9[var7]];
                        continue;
                    }
                    if (var515 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1531[var10001] = field819[var6];
                        continue;
                    }
                    if (var515 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field819;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field819[var6++] = var24;
                        continue;
                    }
                    if (var515 == 38) {
                        var5--;
                        continue;
                    }
                    if (var515 == 39) {
                        var6--;
                        continue;
                    }
                    if (var515 == 40) {
                        int var34 = var9[var7];
                        class24 var35 = Statics.method686(var34);
                        int[] var36 = new int[var35.field597];
                        String[] var37 = new String[var35.field596];
                        for (int var38 = 0; var38 < var35.field598; var38++) {
                            var36[var38] = field824[var5 - var35.field598 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field591; var39++) {
                            var37[var39] = field819[var6 - var35.field591 + var39];
                        }
                        var5 -= var35.field598;
                        var6 -= var35.field591;
                        class15 var40 = new class15();
                        var40.field193 = var4;
                        var40.field194 = var7;
                        var40.field190 = Statics.field814;
                        var40.field191 = Statics.field1531;
                        field821[++field820 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field592;
                        var9 = var35.field593;
                        var7 = -1;
                        Statics.field814 = var36;
                        Statics.field1531 = var37;
                        continue;
                    }
                    if (var515 == 42) {
                        field824[var5++] = Statics.field765.method186(var9[var7]);
                        continue;
                    }
                    if (var515 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field765.method187(var10001, field824[var5]);
                        continue;
                    }
                    if (var515 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field824[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field816[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3300;
                                }
                                field818[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var515 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field824[var5];
                        if (var47 >= 0 && var47 < field816[var46]) {
                            field824[var5++] = field818[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var515 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field824[var5];
                        if (var49 >= 0 && var49 < field816[var48]) {
                            field818[var48][var49] = field824[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var515 == 47) {
                        String var50 = Statics.field765.method190(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field819[var6++] = var50;
                        continue;
                    }
                    if (var515 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field765.method189(var10001, field819[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var515 < 1000) {
                    if (var515 == 100) {
                        var5 -= 3;
                        int var52 = field824[var5];
                        int var53 = field824[var5 + 1];
                        int var54 = field824[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var55 = class177.method701(var52);
                        if (var55.field2920 == null) {
                            var55.field2920 = new class177[var54 + 1];
                        }
                        if (var55.field2920.length <= var54) {
                            class177[] var56 = new class177[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2920.length; var57++) {
                                var56[var57] = var55.field2920[var57];
                            }
                            var55.field2920 = var56;
                        }
                        if (var54 > 0 && var55.field2920[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class177 var58 = new class177();
                        var58.field2930 = var53;
                        var58.field2837 = var58.field2796 = var55.field2796;
                        var58.field2797 = var54;
                        var58.field2795 = true;
                        var55.field2920[var54] = var58;
                        if (var51) {
                            Statics.field826 = var58;
                        } else {
                            Statics.field641 = var58;
                        }
                        client.method2034(var55);
                        continue;
                    }
                    if (var515 == 101) {
                        class177 var59 = var51 ? Statics.field826 : Statics.field641;
                        class177 var60 = class177.method701(var59.field2796);
                        var60.field2920[var59.field2797] = null;
                        client.method2034(var60);
                        continue;
                    }
                    if (var515 == 102) {
                        var5--;
                        class177 var61 = class177.method701(field824[var5]);
                        var61.field2920 = null;
                        client.method2034(var61);
                        continue;
                    }
                    if (var515 == 200) {
                        var5 -= 2;
                        int var62 = field824[var5];
                        int var63 = field824[var5 + 1];
                        class177 var64 = class177.method2998(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field824[var5++] = 1;
                            if (var51) {
                                Statics.field826 = var64;
                            } else {
                                Statics.field641 = var64;
                            }
                            continue;
                        }
                        field824[var5++] = 0;
                        continue;
                    }
                    if (var515 == 201) {
                        var5--;
                        class177 var65 = class177.method701(field824[var5]);
                        if (var65 == null) {
                            field824[var5++] = 0;
                        } else {
                            field824[var5++] = 1;
                            if (var51) {
                                Statics.field826 = var65;
                            } else {
                                Statics.field641 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var515 >= 1000 && var515 < 1100 || var515 >= 2000 && var515 < 2100) {
                    int var66 = -1;
                    class177 var67;
                    if (var515 >= 2000) {
                        var515 -= 1000;
                        var5--;
                        var66 = field824[var5];
                        var67 = class177.method701(var66);
                    } else {
                        var67 = var51 ? Statics.field826 : Statics.field641;
                    }
                    if (var515 == 1000) {
                        var5 -= 4;
                        var67.field2817 = field824[var5];
                        var67.field2806 = field824[var5 + 1];
                        var67.field2801 = field824[var5 + 2];
                        var67.field2910 = field824[var5 + 3];
                        client.method2034(var67);
                        client.method152(var67);
                        if (var66 != -1 && var67.field2930 == 0) {
                            client.method542(Statics.field2815[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var515 == 1001) {
                        var5 -= 4;
                        var67.field2807 = field824[var5];
                        var67.field2916 = field824[var5 + 1];
                        var67.field2803 = field824[var5 + 2];
                        var67.field2804 = field824[var5 + 3];
                        client.method2034(var67);
                        client.method152(var67);
                        if (var66 != -1 && var67.field2930 == 0) {
                            client.method542(Statics.field2815[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var515 == 1003) {
                        var5--;
                        boolean var68 = field824[var5] == 1;
                        if (var67.field2816 != var68) {
                            var67.field2816 = var68;
                            client.method2034(var67);
                        }
                        continue;
                    }
                    if (var515 == 1005) {
                        var5--;
                        var67.field2929 = field824[var5] == 1;
                        continue;
                    }
                    if (var515 == 1006) {
                        var5--;
                        var67.field2889 = field824[var5] == 1;
                        continue;
                    }
                } else if (!(var515 < 1100 || var515 >= 1200) || !(var515 < 2100 || var515 >= 2200)) {
                    int var69 = -1;
                    class177 var70;
                    if (var515 >= 2000) {
                        var515 -= 1000;
                        var5--;
                        var69 = field824[var5];
                        var70 = class177.method701(var69);
                    } else {
                        var70 = var51 ? Statics.field826 : Statics.field641;
                    }
                    if (var515 == 1100) {
                        var5 -= 2;
                        var70.field2895 = field824[var5];
                        if (var70.field2895 > var70.field2819 - var70.field2927) {
                            var70.field2895 = var70.field2819 - var70.field2927;
                        }
                        if (var70.field2895 < 0) {
                            var70.field2895 = 0;
                        }
                        var70.field2818 = field824[var5 + 1];
                        if (var70.field2818 > var70.field2820 - var70.field2878) {
                            var70.field2818 = var70.field2820 - var70.field2878;
                        }
                        if (var70.field2818 < 0) {
                            var70.field2818 = 0;
                        }
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1101) {
                        var5--;
                        var70.field2892 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1102) {
                        var5--;
                        var70.field2825 = field824[var5] == 1;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1103) {
                        var5--;
                        var70.field2827 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1104) {
                        var5--;
                        var70.field2829 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1105) {
                        var5--;
                        var70.field2850 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1106) {
                        var5--;
                        var70.field2833 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1107) {
                        var5--;
                        var70.field2834 = field824[var5] == 1;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1108) {
                        var70.field2787 = 1;
                        var5--;
                        var70.field2840 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1109) {
                        var5 -= 6;
                        var70.field2864 = field824[var5];
                        var70.field2852 = field824[var5 + 1];
                        var70.field2854 = field824[var5 + 2];
                        var70.field2848 = field824[var5 + 3];
                        var70.field2849 = field824[var5 + 4];
                        var70.field2821 = field824[var5 + 5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1110) {
                        var5--;
                        int var71 = field824[var5];
                        if (var70.field2832 != var71) {
                            var70.field2832 = var71;
                            var70.field2918 = 0;
                            var70.field2865 = 0;
                            client.method2034(var70);
                        }
                        continue;
                    }
                    if (var515 == 1111) {
                        var5--;
                        var70.field2853 = field824[var5] == 1;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1112) {
                        var6--;
                        String var72 = field819[var6];
                        if (!var72.equals(var70.field2856)) {
                            var70.field2856 = var72;
                            client.method2034(var70);
                        }
                        continue;
                    }
                    if (var515 == 1113) {
                        var5--;
                        var70.field2855 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1114) {
                        var5 -= 3;
                        var70.field2859 = field824[var5];
                        var70.field2860 = field824[var5 + 1];
                        var70.field2885 = field824[var5 + 2];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1115) {
                        var5--;
                        var70.field2861 = field824[var5] == 1;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1116) {
                        var5--;
                        var70.field2845 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1117) {
                        var5--;
                        var70.field2836 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1118) {
                        var5--;
                        var70.field2847 = field824[var5] == 1;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1119) {
                        var5--;
                        var70.field2838 = field824[var5] == 1;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1120) {
                        var5 -= 2;
                        var70.field2819 = field824[var5];
                        var70.field2820 = field824[var5 + 1];
                        client.method2034(var70);
                        if (var69 != -1 && var70.field2930 == 0) {
                            client.method542(Statics.field2815[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var515 == 1121) {
                        int var73 = var70.field2796;
                        int var74 = var70.field2797;
                        client.field314.method2639(65);
                        client.field314.method2447(var74);
                        client.field314.method2571(var73);
                        client.field403 = var70;
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1122) {
                        var5--;
                        var70.field2867 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1123) {
                        var5--;
                        var70.field2822 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1124) {
                        var5--;
                        var70.field2887 = field824[var5];
                        client.method2034(var70);
                        continue;
                    }
                    if (var515 == 1125) {
                        var5--;
                        int var75 = field824[var5];
                        class86[] var76 = new class86[] { class86.field1508, class86.field1509, class86.field1507, class86.field1505, class86.field1504 };
                        class86 var77 = (class86) class113.method78(var76, var75);
                        if (var77 != null) {
                            var70.field2812 = var77;
                            client.method2034(var70);
                        }
                        continue;
                    }
                } else if (!(var515 < 1200 || var515 >= 1300) || !(var515 < 2200 || var515 >= 2300)) {
                    class177 var78;
                    if (var515 >= 2000) {
                        var515 -= 1000;
                        var5--;
                        var78 = class177.method701(field824[var5]);
                    } else {
                        var78 = var51 ? Statics.field826 : Statics.field641;
                    }
                    client.method2034(var78);
                    if (var515 == 1200 || var515 == 1205 || var515 == 1212) {
                        var5 -= 2;
                        int var79 = field824[var5];
                        int var80 = field824[var5 + 1];
                        var78.field2835 = var79;
                        var78.field2917 = var80;
                        class56 var81 = class56.method43(var79);
                        var78.field2854 = var81.field1217;
                        var78.field2848 = var81.field1191;
                        var78.field2849 = var81.field1190;
                        var78.field2864 = var81.field1193;
                        var78.field2852 = var81.field1194;
                        var78.field2821 = var81.field1189;
                        if (var515 == 1205) {
                            var78.field2914 = 0;
                        } else if (var515 == 1212 | var81.field1195 == 1) {
                            var78.field2914 = 1;
                        } else {
                            var78.field2914 = 2;
                        }
                        if (var78.field2898 > 0) {
                            var78.field2821 = var78.field2821 * 32 / var78.field2898;
                        } else if (var78.field2807 > 0) {
                            var78.field2821 = var78.field2821 * 32 / var78.field2807;
                        }
                        continue;
                    }
                    if (var515 == 1201) {
                        var78.field2787 = 2;
                        var5--;
                        var78.field2840 = field824[var5];
                        continue;
                    }
                    if (var515 == 1202) {
                        var78.field2787 = 3;
                        var78.field2840 = Statics.field2011.field51.method3321();
                        continue;
                    }
                } else if ((var515 < 1300 || var515 >= 1400) && (var515 < 2300 || var515 >= 2400)) {
                    if (var515 >= 1400 && var515 < 1500 || var515 >= 2400 && var515 < 2500) {
                        class177 var86;
                        if (var515 >= 2000) {
                            var515 -= 1000;
                            var5--;
                            var86 = class177.method701(field824[var5]);
                        } else {
                            var86 = var51 ? Statics.field826 : Statics.field641;
                        }
                        var6--;
                        String var87 = field819[var6];
                        int[] var88 = null;
                        if (var87.length() > 0 && var87.charAt(var87.length() - 1) == 'Y') {
                            var5--;
                            int var89 = field824[var5];
                            if (var89 > 0) {
                                var88 = new int[var89];
                                while (var89-- > 0) {
                                    var5--;
                                    var88[var89] = field824[var5];
                                }
                            }
                            var87 = var87.substring(0, var87.length() - 1);
                        }
                        Object[] var90 = new Object[var87.length() + 1];
                        for (int var91 = var90.length - 1; var91 >= 1; var91--) {
                            if (var87.charAt(var91 - 1) == 's') {
                                var6--;
                                var90[var91] = field819[var6];
                            } else {
                                var5--;
                                var90[var91] = Integer.valueOf(field824[var5]);
                            }
                        }
                        var5--;
                        int var92 = field824[var5];
                        if (var92 == -1) {
                            var90 = null;
                        } else {
                            var90[0] = Integer.valueOf(var92);
                        }
                        if (var515 == 1400) {
                            var86.field2839 = var90;
                        }
                        if (var515 == 1401) {
                            var86.field2881 = var90;
                        }
                        if (var515 == 1402) {
                            var86.field2880 = var90;
                        }
                        if (var515 == 1403) {
                            var86.field2882 = var90;
                        }
                        if (var515 == 1404) {
                            var86.field2884 = var90;
                        }
                        if (var515 == 1405) {
                            var86.field2843 = var90;
                        }
                        if (var515 == 1406) {
                            var86.field2888 = var90;
                        }
                        if (var515 == 1407) {
                            var86.field2809 = var90;
                            var86.field2900 = var88;
                        }
                        if (var515 == 1408) {
                            var86.field2872 = var90;
                        }
                        if (var515 == 1409) {
                            var86.field2896 = var90;
                        }
                        if (var515 == 1410) {
                            var86.field2886 = var90;
                        }
                        if (var515 == 1411) {
                            var86.field2879 = var90;
                        }
                        if (var515 == 1412) {
                            var86.field2883 = var90;
                        }
                        if (var515 == 1414) {
                            var86.field2891 = var90;
                            var86.field2828 = var88;
                        }
                        if (var515 == 1415) {
                            var86.field2893 = var90;
                            var86.field2894 = var88;
                        }
                        if (var515 == 1416) {
                            var86.field2906 = var90;
                        }
                        if (var515 == 1417) {
                            var86.field2897 = var90;
                        }
                        if (var515 == 1418) {
                            var86.field2926 = var90;
                        }
                        if (var515 == 1419) {
                            var86.field2899 = var90;
                        }
                        if (var515 == 1420) {
                            var86.field2790 = var90;
                        }
                        if (var515 == 1421) {
                            var86.field2901 = var90;
                        }
                        if (var515 == 1422) {
                            var86.field2902 = var90;
                        }
                        if (var515 == 1423) {
                            var86.field2903 = var90;
                        }
                        if (var515 == 1424) {
                            var86.field2904 = var90;
                        }
                        if (var515 == 1425) {
                            var86.field2802 = var90;
                        }
                        if (var515 == 1426) {
                            var86.field2907 = var90;
                        }
                        if (var515 == 1427) {
                            var86.field2905 = var90;
                        }
                        var86.field2808 = true;
                        continue;
                    }
                    if (var515 < 1600) {
                        class177 var93 = var51 ? Statics.field826 : Statics.field641;
                        if (var515 == 1500) {
                            field824[var5++] = var93.field2805;
                            continue;
                        }
                        if (var515 == 1501) {
                            field824[var5++] = var93.field2810;
                            continue;
                        }
                        if (var515 == 1502) {
                            field824[var5++] = var93.field2927;
                            continue;
                        }
                        if (var515 == 1503) {
                            field824[var5++] = var93.field2878;
                            continue;
                        }
                        if (var515 == 1504) {
                            field824[var5++] = var93.field2816 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 1505) {
                            field824[var5++] = var93.field2837;
                            continue;
                        }
                    } else if (var515 < 1700) {
                        class177 var94 = var51 ? Statics.field826 : Statics.field641;
                        if (var515 == 1600) {
                            field824[var5++] = var94.field2895;
                            continue;
                        }
                        if (var515 == 1601) {
                            field824[var5++] = var94.field2818;
                            continue;
                        }
                        if (var515 == 1602) {
                            field819[var6++] = var94.field2856;
                            continue;
                        }
                        if (var515 == 1603) {
                            field824[var5++] = var94.field2819;
                            continue;
                        }
                        if (var515 == 1604) {
                            field824[var5++] = var94.field2820;
                            continue;
                        }
                        if (var515 == 1605) {
                            field824[var5++] = var94.field2821;
                            continue;
                        }
                        if (var515 == 1606) {
                            field824[var5++] = var94.field2854;
                            continue;
                        }
                        if (var515 == 1607) {
                            field824[var5++] = var94.field2849;
                            continue;
                        }
                        if (var515 == 1608) {
                            field824[var5++] = var94.field2848;
                            continue;
                        }
                        if (var515 == 1609) {
                            field824[var5++] = var94.field2827;
                            continue;
                        }
                        if (var515 == 1610) {
                            field824[var5++] = var94.field2887;
                            continue;
                        }
                        if (var515 == 1611) {
                            field824[var5++] = var94.field2892;
                            continue;
                        }
                        if (var515 == 1612) {
                            field824[var5++] = var94.field2822;
                            continue;
                        }
                        if (var515 == 1613) {
                            field824[var5++] = var94.field2812.method549();
                            continue;
                        }
                    } else if (var515 < 1800) {
                        class177 var95 = var51 ? Statics.field826 : Statics.field641;
                        if (var515 == 1700) {
                            field824[var5++] = var95.field2835;
                            continue;
                        }
                        if (var515 == 1701) {
                            if (var95.field2835 == -1) {
                                field824[var5++] = 0;
                            } else {
                                field824[var5++] = var95.field2917;
                            }
                            continue;
                        }
                        if (var515 == 1702) {
                            field824[var5++] = var95.field2797;
                            continue;
                        }
                    } else if (var515 < 1900) {
                        class177 var96 = var51 ? Statics.field826 : Statics.field641;
                        if (var515 == 1800) {
                            field824[var5++] = class182.method590(client.method143(var96));
                            continue;
                        }
                        if (var515 == 1801) {
                            var5--;
                            int var97 = field824[var5];
                            int var516 = var97 - 1;
                            if (var96.field2813 != null && var516 < var96.field2813.length && var96.field2813[var516] != null) {
                                field819[var6++] = var96.field2813[var516];
                                continue;
                            }
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 1802) {
                            if (var96.field2869 == null) {
                                field819[var6++] = "";
                            } else {
                                field819[var6++] = var96.field2869;
                            }
                            continue;
                        }
                    } else if (var515 >= 1900 && var515 < 2000 || var515 >= 2900 && var515 < 3000) {
                        class177 var98;
                        if (var515 >= 2000) {
                            var515 -= 1000;
                            var5--;
                            var98 = class177.method701(field824[var5]);
                        } else {
                            var98 = var51 ? Statics.field826 : Statics.field641;
                        }
                        if (var515 == 1927) {
                            if (field827 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var98.field2905 == null) {
                                return;
                            }
                            class1 var99 = new class1();
                            var99.field4 = var98;
                            var99.field2 = var98.field2905;
                            var99.field11 = field827 + 1;
                            client.field328.method3616(arg0);
                            continue;
                        }
                    } else if (var515 < 2600) {
                        var5--;
                        class177 var100 = class177.method701(field824[var5]);
                        if (var515 == 2500) {
                            field824[var5++] = var100.field2805;
                            continue;
                        }
                        if (var515 == 2501) {
                            field824[var5++] = var100.field2810;
                            continue;
                        }
                        if (var515 == 2502) {
                            field824[var5++] = var100.field2927;
                            continue;
                        }
                        if (var515 == 2503) {
                            field824[var5++] = var100.field2878;
                            continue;
                        }
                        if (var515 == 2504) {
                            field824[var5++] = var100.field2816 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 2505) {
                            field824[var5++] = var100.field2837;
                            continue;
                        }
                    } else if (var515 < 2700) {
                        var5--;
                        class177 var101 = class177.method701(field824[var5]);
                        if (var515 == 2600) {
                            field824[var5++] = var101.field2895;
                            continue;
                        }
                        if (var515 == 2601) {
                            field824[var5++] = var101.field2818;
                            continue;
                        }
                        if (var515 == 2602) {
                            field819[var6++] = var101.field2856;
                            continue;
                        }
                        if (var515 == 2603) {
                            field824[var5++] = var101.field2819;
                            continue;
                        }
                        if (var515 == 2604) {
                            field824[var5++] = var101.field2820;
                            continue;
                        }
                        if (var515 == 2605) {
                            field824[var5++] = var101.field2821;
                            continue;
                        }
                        if (var515 == 2606) {
                            field824[var5++] = var101.field2854;
                            continue;
                        }
                        if (var515 == 2607) {
                            field824[var5++] = var101.field2849;
                            continue;
                        }
                        if (var515 == 2608) {
                            field824[var5++] = var101.field2848;
                            continue;
                        }
                        if (var515 == 2609) {
                            field824[var5++] = var101.field2827;
                            continue;
                        }
                        if (var515 == 2610) {
                            field824[var5++] = var101.field2887;
                            continue;
                        }
                        if (var515 == 2611) {
                            field824[var5++] = var101.field2892;
                            continue;
                        }
                        if (var515 == 2612) {
                            field824[var5++] = var101.field2822;
                            continue;
                        }
                        if (var515 == 2613) {
                            field824[var5++] = var101.field2812.method549();
                            continue;
                        }
                    } else if (var515 < 2800) {
                        if (var515 == 2700) {
                            var5--;
                            class177 var102 = class177.method701(field824[var5]);
                            field824[var5++] = var102.field2835;
                            continue;
                        }
                        if (var515 == 2701) {
                            var5--;
                            class177 var103 = class177.method701(field824[var5]);
                            if (var103.field2835 == -1) {
                                field824[var5++] = 0;
                            } else {
                                field824[var5++] = var103.field2917;
                            }
                            continue;
                        }
                        if (var515 == 2702) {
                            var5--;
                            int var104 = field824[var5];
                            class4 var105 = (class4) client.field536.method3595((long) var104);
                            if (var105 == null) {
                                field824[var5++] = 0;
                            } else {
                                field824[var5++] = 1;
                            }
                            continue;
                        }
                        if (var515 == 2706) {
                            field824[var5++] = client.field431;
                            continue;
                        }
                    } else if (var515 < 2900) {
                        var5--;
                        class177 var106 = class177.method701(field824[var5]);
                        if (var515 == 2800) {
                            field824[var5++] = class182.method590(client.method143(var106));
                            continue;
                        }
                        if (var515 == 2801) {
                            var5--;
                            int var107 = field824[var5];
                            int var517 = var107 - 1;
                            if (var106.field2813 != null && var517 < var106.field2813.length && var106.field2813[var517] != null) {
                                field819[var6++] = var106.field2813[var517];
                                continue;
                            }
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 2802) {
                            if (var106.field2869 == null) {
                                field819[var6++] = "";
                            } else {
                                field819[var6++] = var106.field2869;
                            }
                            continue;
                        }
                    } else if (var515 < 3200) {
                        if (var515 == 3100) {
                            var6--;
                            String var108 = field819[var6];
                            class12.method1270(0, "", var108);
                            continue;
                        }
                        if (var515 == 3101) {
                            var5 -= 2;
                            client.method170(Statics.field2011, field824[var5], field824[var5 + 1]);
                            continue;
                        }
                        if (var515 == 3103) {
                            client.method94();
                            continue;
                        }
                        if (var515 == 3104) {
                            var6--;
                            String var109 = field819[var6];
                            int var110 = 0;
                            boolean var111 = class167.method548(var109, 10, true);
                            if (var111) {
                                var110 = class167.method2747(var109);
                            }
                            client.field314.method2639(236);
                            client.field314.method2402(var110);
                            continue;
                        }
                        if (var515 == 3105) {
                            var6--;
                            String var112 = field819[var6];
                            client.field314.method2639(112);
                            client.field314.method2399(var112.length() + 1);
                            client.field314.method2405(var112);
                            continue;
                        }
                        if (var515 == 3106) {
                            var6--;
                            String var113 = field819[var6];
                            client.field314.method2639(165);
                            client.field314.method2399(var113.length() + 1);
                            client.field314.method2405(var113);
                            continue;
                        }
                        if (var515 == 3107) {
                            var5--;
                            int var114 = field824[var5];
                            var6--;
                            String var115 = field819[var6];
                            int var116 = class35.field778;
                            int[] var117 = class35.field781;
                            boolean var118 = false;
                            for (int var119 = 0; var119 < var116; var119++) {
                                class3 var120 = client.field394[var117[var119]];
                                if (var120 != null && Statics.field2011 != var120 && var120.field44 != null && var120.field44.equalsIgnoreCase(var115)) {
                                    if (var114 == 1) {
                                        client.field314.method2639(242);
                                        client.field314.method2438(0);
                                        client.field314.method2409(var117[var119]);
                                    } else if (var114 == 4) {
                                        client.field314.method2639(220);
                                        client.field314.method2409(var117[var119]);
                                        client.field314.method2437(0);
                                    } else if (var114 == 6) {
                                        client.field314.method2639(11);
                                        client.field314.method2439(0);
                                        client.field314.method2409(var117[var119]);
                                    } else if (var114 == 7) {
                                        client.field314.method2639(95);
                                        client.field314.method2409(var117[var119]);
                                        client.field314.method2437(0);
                                    }
                                    var118 = true;
                                    break;
                                }
                            }
                            if (!var118) {
                                class12.method1270(4, "", class161.field2545 + var115);
                            }
                            continue;
                        }
                        if (var515 == 3108) {
                            var5 -= 3;
                            int var121 = field824[var5];
                            int var122 = field824[var5 + 1];
                            int var123 = field824[var5 + 2];
                            class177 var124 = class177.method701(var123);
                            client.method3819(var124, var121, var122);
                            continue;
                        }
                        if (var515 == 3109) {
                            var5 -= 2;
                            int var125 = field824[var5];
                            int var126 = field824[var5 + 1];
                            class177 var127 = var51 ? Statics.field826 : Statics.field641;
                            client.method3819(var127, var125, var126);
                            continue;
                        }
                        if (var515 == 3110) {
                            var5--;
                            Statics.field236 = field824[var5] == 1;
                            continue;
                        }
                        if (var515 == 3111) {
                            field824[var5++] = Statics.field163.field128 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3112) {
                            var5--;
                            Statics.field163.field128 = field824[var5] == 1;
                            class9.method660();
                            continue;
                        }
                        if (var515 == 3113) {
                            var6--;
                            String var128 = field819[var6];
                            var5--;
                            boolean var129 = field824[var5] == 1;
                            class142.method2997(var128, var129, "openjs", false);
                            continue;
                        }
                        if (var515 == 3115) {
                            var5--;
                            int var130 = field824[var5];
                            client.field314.method2639(170);
                            client.field314.method2400(var130);
                            continue;
                        }
                        if (var515 == 3116) {
                            var5--;
                            int var131 = field824[var5];
                            var6 -= 2;
                            String var132 = field819[var6];
                            String var133 = field819[var6 + 1];
                            if (var132.length() <= 500 && var133.length() <= 500) {
                                client.field314.method2639(187);
                                client.field314.method2400(1 + class123.method1584(var132) + class123.method1584(var133));
                                client.field314.method2405(var133);
                                client.field314.method2437(var131);
                                client.field314.method2405(var132);
                            }
                            continue;
                        }
                    } else if (var515 < 3300) {
                        if (var515 == 3200) {
                            var5 -= 3;
                            client.method563(field824[var5], field824[var5 + 1], field824[var5 + 2]);
                            continue;
                        }
                        if (var515 == 3201) {
                            var5--;
                            client.method639(field824[var5]);
                            continue;
                        }
                        if (var515 == 3202) {
                            var5 -= 2;
                            client.method2118(field824[var5], field824[var5 + 1]);
                            continue;
                        }
                    } else if (var515 < 3400) {
                        if (var515 == 3300) {
                            field824[var5++] = client.field283;
                            continue;
                        }
                        if (var515 == 3301) {
                            var5 -= 2;
                            int var134 = field824[var5];
                            int var135 = field824[var5 + 1];
                            int[] var136 = field824;
                            int var137 = var5++;
                            class16 var138 = (class16) class16.field205.method3595((long) var134);
                            int var139;
                            if (var138 == null) {
                                var139 = -1;
                            } else if (var135 >= 0 && var135 < var138.field207.length) {
                                var139 = var138.field207[var135];
                            } else {
                                var139 = -1;
                            }
                            var136[var137] = var139;
                            continue;
                        }
                        if (var515 == 3302) {
                            var5 -= 2;
                            int var140 = field824[var5];
                            int var141 = field824[var5 + 1];
                            field824[var5++] = class16.method1626(var140, var141);
                            continue;
                        }
                        if (var515 == 3303) {
                            var5 -= 2;
                            int var142 = field824[var5];
                            int var143 = field824[var5 + 1];
                            field824[var5++] = class16.method604(var142, var143);
                            continue;
                        }
                        if (var515 == 3304) {
                            var5--;
                            int var144 = field824[var5];
                            int[] var145 = field824;
                            int var146 = var5++;
                            class55 var147 = (class55) class55.field1167.method3556((long) var144);
                            class55 var148;
                            if (var147 == null) {
                                byte[] var149 = Statics.field1171.method3086(5, var144);
                                class55 var150 = new class55();
                                if (var149 != null) {
                                    var150.method1095(new class123(var149));
                                }
                                class55.field1167.method3562(var150, (long) var144);
                                var148 = var150;
                            } else {
                                var148 = var147;
                            }
                            var145[var146] = var148.field1168;
                            continue;
                        }
                        if (var515 == 3305) {
                            var5--;
                            int var151 = field824[var5];
                            field824[var5++] = client.field408[var151];
                            continue;
                        }
                        if (var515 == 3306) {
                            var5--;
                            int var152 = field824[var5];
                            field824[var5++] = client.field409[var152];
                            continue;
                        }
                        if (var515 == 3307) {
                            var5--;
                            int var153 = field824[var5];
                            field824[var5++] = client.field470[var153];
                            continue;
                        }
                        if (var515 == 3308) {
                            int var154 = Statics.field1120;
                            int var155 = (Statics.field2011.field865 >> 7) + Statics.field839;
                            int var156 = (Statics.field2011.field832 >> 7) + Statics.field185;
                            field824[var5++] = (var154 << 28) + (var155 << 14) + var156;
                            continue;
                        }
                        if (var515 == 3309) {
                            var5--;
                            int var157 = field824[var5];
                            field824[var5++] = var157 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var515 == 3310) {
                            var5--;
                            int var158 = field824[var5];
                            field824[var5++] = var158 >> 28;
                            continue;
                        }
                        if (var515 == 3311) {
                            var5--;
                            int var159 = field824[var5];
                            field824[var5++] = var159 & 0x3FFF;
                            continue;
                        }
                        if (var515 == 3312) {
                            field824[var5++] = client.field277 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3313) {
                            var5 -= 2;
                            int var160 = field824[var5] + 32768;
                            int var161 = field824[var5 + 1];
                            int[] var162 = field824;
                            int var163 = var5++;
                            class16 var164 = (class16) class16.field205.method3595((long) var160);
                            int var165;
                            if (var164 == null) {
                                var165 = -1;
                            } else if (var161 >= 0 && var161 < var164.field207.length) {
                                var165 = var164.field207[var161];
                            } else {
                                var165 = -1;
                            }
                            var162[var163] = var165;
                            continue;
                        }
                        if (var515 == 3314) {
                            var5 -= 2;
                            int var166 = field824[var5] + 32768;
                            int var167 = field824[var5 + 1];
                            field824[var5++] = class16.method1626(var166, var167);
                            continue;
                        }
                        if (var515 == 3315) {
                            var5 -= 2;
                            int var168 = field824[var5] + 32768;
                            int var169 = field824[var5 + 1];
                            field824[var5++] = class16.method604(var168, var169);
                            continue;
                        }
                        if (var515 == 3316) {
                            if (client.field410 >= 2) {
                                field824[var5++] = client.field410;
                            } else {
                                field824[var5++] = 0;
                            }
                            continue;
                        }
                        if (var515 == 3317) {
                            field824[var5++] = client.field290;
                            continue;
                        }
                        if (var515 == 3318) {
                            field824[var5++] = client.field273;
                            continue;
                        }
                        if (var515 == 3321) {
                            field824[var5++] = client.field436;
                            continue;
                        }
                        if (var515 == 3322) {
                            field824[var5++] = client.field437;
                            continue;
                        }
                        if (var515 == 3323) {
                            if (client.field440) {
                                field824[var5++] = 1;
                            } else {
                                field824[var5++] = 0;
                            }
                            continue;
                        }
                        if (var515 == 3324) {
                            field824[var5++] = client.field481;
                            continue;
                        }
                    } else if (var515 < 3500) {
                        if (var515 == 3400) {
                            var5 -= 2;
                            int var170 = field824[var5];
                            int var171 = field824[var5 + 1];
                            class53 var172 = (class53) class53.field1144.method3556((long) var170);
                            class53 var173;
                            if (var172 == null) {
                                byte[] var174 = Statics.field1150.method3086(8, var170);
                                class53 var175 = new class53();
                                if (var174 != null) {
                                    var175.method1065(new class123(var174));
                                }
                                class53.field1144.method3562(var175, (long) var170);
                                var173 = var175;
                            } else {
                                var173 = var172;
                            }
                            class53 var176 = var173;
                            if (var173.field1146 != 's') {
                            }
                            for (int var177 = 0; var177 < var176.field1143; var177++) {
                                if (var176.field1154[var177] == var171) {
                                    field819[var6++] = var176.field1152[var177];
                                    var176 = null;
                                    break;
                                }
                            }
                            if (var176 != null) {
                                field819[var6++] = var176.field1147;
                            }
                            continue;
                        }
                        if (var515 == 3408) {
                            var5 -= 4;
                            int var178 = field824[var5];
                            int var179 = field824[var5 + 1];
                            int var180 = field824[var5 + 2];
                            int var181 = field824[var5 + 3];
                            class53 var182 = (class53) class53.field1144.method3556((long) var180);
                            class53 var183;
                            if (var182 == null) {
                                byte[] var184 = Statics.field1150.method3086(8, var180);
                                class53 var185 = new class53();
                                if (var184 != null) {
                                    var185.method1065(new class123(var184));
                                }
                                class53.field1144.method3562(var185, (long) var180);
                                var183 = var185;
                            } else {
                                var183 = var182;
                            }
                            class53 var186 = var183;
                            if (var183.field1148 == var178 && var183.field1146 == var179) {
                                for (int var187 = 0; var187 < var186.field1143; var187++) {
                                    if (var186.field1154[var187] == var181) {
                                        if (var179 == 115) {
                                            field819[var6++] = var186.field1152[var187];
                                        } else {
                                            field824[var5++] = var186.field1151[var187];
                                        }
                                        var186 = null;
                                        break;
                                    }
                                }
                                if (var186 != null) {
                                    if (var179 == 115) {
                                        field819[var6++] = var186.field1147;
                                    } else {
                                        field824[var5++] = var186.field1153;
                                    }
                                }
                                continue;
                            }
                            if (var179 == 115) {
                                field819[var6++] = "null";
                            } else {
                                field824[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var515 < 3700) {
                        if (var515 == 3600) {
                            if (client.field539 == 0) {
                                field824[var5++] = -2;
                            } else if (client.field539 == 1) {
                                field824[var5++] = -1;
                            } else {
                                field824[var5++] = client.field538;
                            }
                            continue;
                        }
                        if (var515 == 3601) {
                            var5--;
                            int var188 = field824[var5];
                            if (client.field539 == 2 && var188 < client.field538) {
                                field819[var6++] = client.field274[var188].field230;
                                field819[var6++] = client.field274[var188].field225;
                                continue;
                            }
                            field819[var6++] = "";
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 3602) {
                            var5--;
                            int var189 = field824[var5];
                            if (client.field539 == 2 && var189 < client.field538) {
                                field824[var5++] = client.field274[var189].field224;
                                continue;
                            }
                            field824[var5++] = 0;
                            continue;
                        }
                        if (var515 == 3603) {
                            var5--;
                            int var190 = field824[var5];
                            if (client.field539 == 2 && var190 < client.field538) {
                                field824[var5++] = client.field274[var190].field227;
                                continue;
                            }
                            field824[var5++] = 0;
                            continue;
                        }
                        if (var515 == 3604) {
                            var6--;
                            String var191 = field819[var6];
                            var5--;
                            int var192 = field824[var5];
                            client.field314.method2639(145);
                            client.field314.method2399(class123.method1584(var191) + 1);
                            client.field314.method2405(var191);
                            client.field314.method2439(var192);
                            continue;
                        }
                        if (var515 == 3605) {
                            var6--;
                            String var193 = field819[var6];
                            client.method93(var193);
                            continue;
                        }
                        if (var515 == 3606) {
                            var6--;
                            String var194 = field819[var6];
                            client.method9(var194);
                            continue;
                        }
                        if (var515 == 3607) {
                            var6--;
                            String var195 = field819[var6];
                            if (var195 == null) {
                                continue;
                            }
                            if ((client.field544 < 100 || client.field550 == 1) && client.field544 < 400) {
                                String var196 = class168.method570(var195, Statics.field2118);
                                if (var196 == null) {
                                    continue;
                                }
                                for (int var197 = 0; var197 < client.field544; var197++) {
                                    class8 var198 = client.field385[var197];
                                    String var199 = class168.method570(var198.field121, Statics.field2118);
                                    if (var199 != null && var199.equals(var196)) {
                                        class12.method1270(31, "", var195 + class161.field2536);
                                        continue label3300;
                                    }
                                    if (var198.field123 != null) {
                                        String var200 = class168.method570(var198.field123, Statics.field2118);
                                        if (var200 != null && var200.equals(var196)) {
                                            class12.method1270(31, "", var195 + class161.field2536);
                                            continue label3300;
                                        }
                                    }
                                }
                                for (int var201 = 0; var201 < client.field538; var201++) {
                                    class18 var202 = client.field274[var201];
                                    String var203 = class168.method570(var202.field230, Statics.field2118);
                                    if (var203 != null && var203.equals(var196)) {
                                        class12.method1270(31, "", class161.field2541 + var195 + class161.field2542);
                                        continue label3300;
                                    }
                                    if (var202.field225 != null) {
                                        String var204 = class168.method570(var202.field225, Statics.field2118);
                                        if (var204 != null && var204.equals(var196)) {
                                            class12.method1270(31, "", class161.field2541 + var195 + class161.field2542);
                                            continue label3300;
                                        }
                                    }
                                }
                                if (class168.method570(Statics.field2011.field44, Statics.field2118).equals(var196)) {
                                    class12.method1270(31, "", class161.field2538);
                                } else {
                                    client.field314.method2639(180);
                                    client.field314.method2399(class123.method1584(var195));
                                    client.field314.method2405(var195);
                                }
                                continue;
                            }
                            class12.method1270(31, "", class161.field2535);
                            continue;
                        }
                        if (var515 == 3608) {
                            var6--;
                            String var205 = field819[var6];
                            client.method1075(var205);
                            continue;
                        }
                        if (var515 == 3609) {
                            var6--;
                            String var206 = field819[var6];
                            class156[] var207 = class156.method2835();
                            for (int var208 = 0; var208 < var207.length; var208++) {
                                class156 var209 = var207[var208];
                                if (var209.field2324 != -1) {
                                    int var211 = var209.field2324;
                                    String var212 = "<img=" + var211 + ">";
                                    if (var206.startsWith(var212)) {
                                        var206 = var206.substring(6 + Integer.toString(var209.field2324).length());
                                        break;
                                    }
                                }
                            }
                            field824[var5++] = client.method3016(var206, false) ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3611) {
                            if (client.field498 == null) {
                                field819[var6++] = "";
                                continue;
                            }
                            String[] var213 = field819;
                            int var214 = var6++;
                            String var215 = client.field498;
                            long var216 = 0L;
                            int var218 = var215.length();
                            for (int var219 = 0; var219 < var218; var219++) {
                                var216 *= 37L;
                                char var220 = var215.charAt(var219);
                                if (var220 >= 'A' && var220 <= 'Z') {
                                    var216 += (long) (var220 + 1 - 65);
                                } else if (var220 >= 'a' && var220 <= 'z') {
                                    var216 += (long) (var220 + 1 - 97);
                                } else if (var220 >= '0' && var220 <= '9') {
                                    var216 += (long) (var220 + 27 - 48);
                                }
                                if (var216 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var216 % 37L == 0L && var216 != 0L) {
                                var216 /= 37L;
                            }
                            String var223 = class166.method1217(var216);
                            if (var223 == null) {
                                var223 = "";
                            }
                            var213[var214] = var223;
                            continue;
                        }
                        if (var515 == 3612) {
                            if (client.field498 == null) {
                                field824[var5++] = 0;
                            } else {
                                field824[var5++] = Statics.field2301;
                            }
                            continue;
                        }
                        if (var515 == 3613) {
                            var5--;
                            int var225 = field824[var5];
                            if (client.field498 != null && var225 < Statics.field2301) {
                                field819[var6++] = Statics.field237[var225].field632;
                                continue;
                            }
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 3614) {
                            var5--;
                            int var226 = field824[var5];
                            if (client.field498 != null && var226 < Statics.field2301) {
                                field824[var5++] = Statics.field237[var226].field631;
                                continue;
                            }
                            field824[var5++] = 0;
                            continue;
                        }
                        if (var515 == 3615) {
                            var5--;
                            int var227 = field824[var5];
                            if (client.field498 != null && var227 < Statics.field2301) {
                                field824[var5++] = Statics.field237[var227].field635;
                                continue;
                            }
                            field824[var5++] = 0;
                            continue;
                        }
                        if (var515 == 3616) {
                            field824[var5++] = Statics.field2063;
                            continue;
                        }
                        if (var515 == 3617) {
                            var6--;
                            String var228 = field819[var6];
                            if (Statics.field237 != null) {
                                client.field314.method2639(7);
                                client.field314.method2399(class123.method1584(var228));
                                client.field314.method2405(var228);
                            }
                            continue;
                        }
                        if (var515 == 3618) {
                            field824[var5++] = Statics.field182;
                            continue;
                        }
                        if (var515 == 3619) {
                            var6--;
                            String var229 = field819[var6];
                            if (!var229.equals("")) {
                                client.field314.method2639(214);
                                client.field314.method2399(class123.method1584(var229));
                                client.field314.method2405(var229);
                            }
                            continue;
                        }
                        if (var515 == 3620) {
                            client.method2();
                            continue;
                        }
                        if (var515 == 3621) {
                            if (client.field539 == 0) {
                                field824[var5++] = -1;
                            } else {
                                field824[var5++] = client.field544;
                            }
                            continue;
                        }
                        if (var515 == 3622) {
                            var5--;
                            int var230 = field824[var5];
                            if (client.field539 != 0 && var230 < client.field544) {
                                field819[var6++] = client.field385[var230].field121;
                                field819[var6++] = client.field385[var230].field123;
                                continue;
                            }
                            field819[var6++] = "";
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 3623) {
                            String var231;
                            label2947: {
                                var6--;
                                var231 = field819[var6];
                                String var233 = "<img=0>";
                                if (!var231.startsWith(var233)) {
                                    String var235 = "<img=1>";
                                    if (!var231.startsWith(var235)) {
                                        break label2947;
                                    }
                                }
                                var231 = var231.substring(7);
                            }
                            field824[var5++] = client.method1084(var231) ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3624) {
                            var5--;
                            int var236 = field824[var5];
                            if (Statics.field237 != null && var236 < Statics.field2301 && Statics.field237[var236].field632.equalsIgnoreCase(Statics.field2011.field44)) {
                                field824[var5++] = 1;
                                continue;
                            }
                            field824[var5++] = 0;
                            continue;
                        }
                        if (var515 == 3625) {
                            if (client.field499 == null) {
                                field819[var6++] = "";
                                continue;
                            }
                            String[] var237 = field819;
                            int var238 = var6++;
                            String var239 = client.field499;
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
                            String var247 = class166.method1217(var240);
                            if (var247 == null) {
                                var247 = "";
                            }
                            var237[var238] = var247;
                            continue;
                        }
                    } else if (var515 < 4000) {
                        if (var515 == 3903) {
                            var5--;
                            int var249 = field824[var5];
                            field824[var5++] = client.field547[var249].method3806();
                            continue;
                        }
                        if (var515 == 3904) {
                            var5--;
                            int var250 = field824[var5];
                            field824[var5++] = client.field547[var250].field3219;
                            continue;
                        }
                        if (var515 == 3905) {
                            var5--;
                            int var251 = field824[var5];
                            field824[var5++] = client.field547[var251].field3218;
                            continue;
                        }
                        if (var515 == 3906) {
                            var5--;
                            int var252 = field824[var5];
                            field824[var5++] = client.field547[var252].field3221;
                            continue;
                        }
                        if (var515 == 3907) {
                            var5--;
                            int var253 = field824[var5];
                            field824[var5++] = client.field547[var253].field3222;
                            continue;
                        }
                        if (var515 == 3908) {
                            var5--;
                            int var254 = field824[var5];
                            field824[var5++] = client.field547[var254].field3220;
                            continue;
                        }
                        if (var515 == 3910) {
                            var5--;
                            int var255 = field824[var5];
                            int var256 = client.field547[var255].method3804();
                            field824[var5++] = var256 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3911) {
                            var5--;
                            int var257 = field824[var5];
                            int var258 = client.field547[var257].method3804();
                            field824[var5++] = var258 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3912) {
                            var5--;
                            int var259 = field824[var5];
                            int var260 = client.field547[var259].method3804();
                            field824[var5++] = var260 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3913) {
                            var5--;
                            int var261 = field824[var5];
                            int var262 = client.field547[var261].method3804();
                            field824[var5++] = var262 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 3914) {
                            var5--;
                            boolean var263 = field824[var5] == 1;
                            if (Statics.field2126 != null) {
                                Statics.field2126.method3821(class225.field3227, var263);
                            }
                            continue;
                        }
                        if (var515 == 3915) {
                            var5--;
                            boolean var264 = field824[var5] == 1;
                            if (Statics.field2126 != null) {
                                Statics.field2126.method3821(class225.field3226, var264);
                            }
                            continue;
                        }
                        if (var515 == 3916) {
                            var5 -= 2;
                            boolean var265 = field824[var5] == 1;
                            boolean var266 = field824[var5 + 1] == 1;
                            if (Statics.field2126 != null) {
                                Statics.field2126.method3821(new class23(var266), var265);
                            }
                            continue;
                        }
                        if (var515 == 3917) {
                            var5--;
                            boolean var267 = field824[var5] == 1;
                            if (Statics.field2126 != null) {
                                Statics.field2126.method3821(class225.field3228, var267);
                            }
                            continue;
                        }
                        if (var515 == 3918) {
                            var5--;
                            boolean var268 = field824[var5] == 1;
                            if (Statics.field2126 != null) {
                                Statics.field2126.method3821(class225.field3224, var268);
                            }
                            continue;
                        }
                        if (var515 == 3919) {
                            field824[var5++] = Statics.field2126 == null ? 0 : Statics.field2126.field3225.size();
                            continue;
                        }
                        if (var515 == 3920) {
                            var5--;
                            int var269 = field824[var5];
                            class218 var270 = (class218) Statics.field2126.field3225.get(var269);
                            field824[var5++] = var270.field3202;
                            continue;
                        }
                        if (var515 == 3921) {
                            var5--;
                            int var271 = field824[var5];
                            class218 var272 = (class218) Statics.field2126.field3225.get(var271);
                            field819[var6++] = var272.method3770();
                            continue;
                        }
                        if (var515 == 3922) {
                            var5--;
                            int var273 = field824[var5];
                            class218 var274 = (class218) Statics.field2126.field3225.get(var273);
                            field819[var6++] = var274.method3766();
                            continue;
                        }
                        if (var515 == 3923) {
                            var5--;
                            int var275 = field824[var5];
                            class218 var276 = (class218) Statics.field2126.field3225.get(var275);
                            long var277 = class119.method3544() - Statics.field2226 - var276.field3198;
                            int var279 = (int) (var277 / 3600000L);
                            int var280 = (int) ((var277 - (long) (var279 * 3600000)) / 60000L);
                            int var281 = (int) ((var277 - (long) (var279 * 3600000) - (long) (var280 * 60000)) / 1000L);
                            String var282 = var279 + ":" + var280 / 10 + var280 % 10 + ":" + var281 / 10 + var281 % 10;
                            field819[var6++] = var282;
                            continue;
                        }
                        if (var515 == 3924) {
                            var5--;
                            int var283 = field824[var5];
                            class218 var284 = (class218) Statics.field2126.field3225.get(var283);
                            field824[var5++] = var284.field3199.field3221;
                            continue;
                        }
                        if (var515 == 3925) {
                            var5--;
                            int var285 = field824[var5];
                            class218 var286 = (class218) Statics.field2126.field3225.get(var285);
                            field824[var5++] = var286.field3199.field3218;
                            continue;
                        }
                        if (var515 == 3926) {
                            var5--;
                            int var287 = field824[var5];
                            class218 var288 = (class218) Statics.field2126.field3225.get(var287);
                            field824[var5++] = var288.field3199.field3219;
                            continue;
                        }
                    } else if (var515 < 4100) {
                        if (var515 == 4000) {
                            var5 -= 2;
                            int var289 = field824[var5];
                            int var290 = field824[var5 + 1];
                            field824[var5++] = var289 + var290;
                            continue;
                        }
                        if (var515 == 4001) {
                            var5 -= 2;
                            int var291 = field824[var5];
                            int var292 = field824[var5 + 1];
                            field824[var5++] = var291 - var292;
                            continue;
                        }
                        if (var515 == 4002) {
                            var5 -= 2;
                            int var293 = field824[var5];
                            int var294 = field824[var5 + 1];
                            field824[var5++] = var293 * var294;
                            continue;
                        }
                        if (var515 == 4003) {
                            var5 -= 2;
                            int var295 = field824[var5];
                            int var296 = field824[var5 + 1];
                            field824[var5++] = var295 / var296;
                            continue;
                        }
                        if (var515 == 4004) {
                            var5--;
                            int var297 = field824[var5];
                            field824[var5++] = (int) (Math.random() * (double) var297);
                            continue;
                        }
                        if (var515 == 4005) {
                            var5--;
                            int var298 = field824[var5];
                            field824[var5++] = (int) (Math.random() * (double) (var298 + 1));
                            continue;
                        }
                        if (var515 == 4006) {
                            var5 -= 5;
                            int var299 = field824[var5];
                            int var300 = field824[var5 + 1];
                            int var301 = field824[var5 + 2];
                            int var302 = field824[var5 + 3];
                            int var303 = field824[var5 + 4];
                            field824[var5++] = (var300 - var299) * (var303 - var301) / (var302 - var301) + var299;
                            continue;
                        }
                        if (var515 == 4007) {
                            var5 -= 2;
                            int var304 = field824[var5];
                            int var305 = field824[var5 + 1];
                            field824[var5++] = var304 * var305 / 100 + var304;
                            continue;
                        }
                        if (var515 == 4008) {
                            var5 -= 2;
                            int var306 = field824[var5];
                            int var307 = field824[var5 + 1];
                            field824[var5++] = var306 | 0x1 << var307;
                            continue;
                        }
                        if (var515 == 4009) {
                            var5 -= 2;
                            int var308 = field824[var5];
                            int var309 = field824[var5 + 1];
                            field824[var5++] = var308 & -1 - (0x1 << var309);
                            continue;
                        }
                        if (var515 == 4010) {
                            var5 -= 2;
                            int var310 = field824[var5];
                            int var311 = field824[var5 + 1];
                            field824[var5++] = (var310 & 0x1 << var311) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var515 == 4011) {
                            var5 -= 2;
                            int var312 = field824[var5];
                            int var313 = field824[var5 + 1];
                            field824[var5++] = var312 % var313;
                            continue;
                        }
                        if (var515 == 4012) {
                            var5 -= 2;
                            int var314 = field824[var5];
                            int var315 = field824[var5 + 1];
                            if (var314 == 0) {
                                field824[var5++] = 0;
                            } else {
                                field824[var5++] = (int) Math.pow((double) var314, (double) var315);
                            }
                            continue;
                        }
                        if (var515 == 4013) {
                            var5 -= 2;
                            int var316 = field824[var5];
                            int var317 = field824[var5 + 1];
                            if (var316 == 0) {
                                field824[var5++] = 0;
                            } else if (var317 == 0) {
                                field824[var5++] = Integer.MAX_VALUE;
                            } else {
                                field824[var5++] = (int) Math.pow((double) var316, 1.0D / (double) var317);
                            }
                            continue;
                        }
                        if (var515 == 4014) {
                            var5 -= 2;
                            int var318 = field824[var5];
                            int var319 = field824[var5 + 1];
                            field824[var5++] = var318 & var319;
                            continue;
                        }
                        if (var515 == 4015) {
                            var5 -= 2;
                            int var320 = field824[var5];
                            int var321 = field824[var5 + 1];
                            field824[var5++] = var320 | var321;
                            continue;
                        }
                        if (var515 == 4018) {
                            var5 -= 3;
                            long var322 = (long) field824[var5];
                            long var324 = (long) field824[var5 + 1];
                            long var326 = (long) field824[var5 + 2];
                            field824[var5++] = (int) (var322 * var326 / var324);
                            continue;
                        }
                    } else if (var515 < 4200) {
                        if (var515 == 4100) {
                            var6--;
                            String var328 = field819[var6];
                            var5--;
                            int var329 = field824[var5];
                            field819[var6++] = var328 + var329;
                            continue;
                        }
                        if (var515 == 4101) {
                            var6 -= 2;
                            String var330 = field819[var6];
                            String var331 = field819[var6 + 1];
                            field819[var6++] = var330 + var331;
                            continue;
                        }
                        if (var515 == 4102) {
                            var6--;
                            String var332 = field819[var6];
                            var5--;
                            int var333 = field824[var5];
                            field819[var6++] = var332 + class167.method3343(var333, true);
                            continue;
                        }
                        if (var515 == 4103) {
                            var6--;
                            String var334 = field819[var6];
                            field819[var6++] = var334.toLowerCase();
                            continue;
                        }
                        if (var515 == 4104) {
                            var5--;
                            int var335 = field824[var5];
                            long var336 = ((long) var335 + 11745L) * 86400000L;
                            field823.setTime(new Date(var336));
                            int var338 = field823.get(5);
                            int var339 = field823.get(2);
                            int var340 = field823.get(1);
                            field819[var6++] = var338 + "-" + field817[var339] + "-" + var340;
                            continue;
                        }
                        if (var515 == 4105) {
                            var6 -= 2;
                            String var341 = field819[var6];
                            String var342 = field819[var6 + 1];
                            if (Statics.field2011.field51 != null && Statics.field2011.field51.field2975) {
                                field819[var6++] = var342;
                                continue;
                            }
                            field819[var6++] = var341;
                            continue;
                        }
                        if (var515 == 4106) {
                            var5--;
                            int var343 = field824[var5];
                            field819[var6++] = Integer.toString(var343);
                            continue;
                        }
                        if (var515 == 4107) {
                            var6 -= 2;
                            int[] var344 = field824;
                            int var345 = var5++;
                            String var346 = field819[var6];
                            String var347 = field819[var6 + 1];
                            int var348 = client.field534;
                            int var349 = var346.length();
                            int var350 = var347.length();
                            int var351 = 0;
                            int var352 = 0;
                            char var353 = 0;
                            char var354 = 0;
                            int var355;
                            label3040: while (true) {
                                if (var351 - var353 >= var349 && var352 - var354 >= var350) {
                                    int var364 = Math.min(var349, var350);
                                    for (int var365 = 0; var365 < var364; var365++) {
                                        char var368 = var346.charAt(var365);
                                        char var369 = var347.charAt(var365);
                                        if (var368 != var369 && Character.toUpperCase(var368) != Character.toUpperCase(var369)) {
                                            char var370 = Character.toLowerCase(var368);
                                            char var371 = Character.toLowerCase(var369);
                                            if (var370 != var371) {
                                                var355 = class170.method2337(var370, var348) - class170.method2337(var371, var348);
                                                break label3040;
                                            }
                                        }
                                    }
                                    int var372 = var349 - var350;
                                    if (var372 == 0) {
                                        for (int var373 = 0; var373 < var364; var373++) {
                                            char var374 = var346.charAt(var373);
                                            char var375 = var347.charAt(var373);
                                            if (var374 != var375) {
                                                var355 = class170.method2337(var374, var348) - class170.method2337(var375, var348);
                                                break label3040;
                                            }
                                        }
                                        var355 = 0;
                                    } else {
                                        var355 = var372;
                                    }
                                    break;
                                }
                                if (var351 - var353 >= var349) {
                                    var355 = -1;
                                    break;
                                }
                                if (var352 - var354 >= var350) {
                                    var355 = 1;
                                    break;
                                }
                                char var356;
                                if (var353 == 0) {
                                    var356 = var346.charAt(var351++);
                                } else {
                                    var356 = var353;
                                    boolean var357 = false;
                                }
                                char var358;
                                if (var354 == 0) {
                                    var358 = var347.charAt(var352++);
                                } else {
                                    var358 = var354;
                                    boolean var359 = false;
                                }
                                var353 = class170.method1565(var356);
                                var354 = class170.method1565(var358);
                                char var360 = class170.method2329(var356, var348);
                                char var361 = class170.method2329(var358, var348);
                                if (var360 != var361 && Character.toUpperCase(var360) != Character.toUpperCase(var361)) {
                                    char var362 = Character.toLowerCase(var360);
                                    char var363 = Character.toLowerCase(var361);
                                    if (var362 != var363) {
                                        var355 = class170.method2337(var362, var348) - class170.method2337(var363, var348);
                                        break;
                                    }
                                }
                            }
                            byte var377;
                            if (var355 > 0) {
                                var377 = 1;
                            } else if (var355 < 0) {
                                var377 = -1;
                            } else {
                                var377 = 0;
                            }
                            var344[var345] = var377;
                            continue;
                        }
                        if (var515 == 4108) {
                            var6--;
                            String var378 = field819[var6];
                            var5 -= 2;
                            int var379 = field824[var5];
                            int var380 = field824[var5 + 1];
                            byte[] var381 = Statics.field1532.method3086(var380, 0);
                            class228 var382 = new class228(var381);
                            field824[var5++] = var382.method3919(var378, var379);
                            continue;
                        }
                        if (var515 == 4109) {
                            var6--;
                            String var383 = field819[var6];
                            var5 -= 2;
                            int var384 = field824[var5];
                            int var385 = field824[var5 + 1];
                            byte[] var386 = Statics.field1532.method3086(var385, 0);
                            class228 var387 = new class228(var386);
                            field824[var5++] = var387.method3835(var383, var384);
                            continue;
                        }
                        if (var515 == 4110) {
                            var6 -= 2;
                            String var388 = field819[var6];
                            String var389 = field819[var6 + 1];
                            var5--;
                            if (field824[var5] == 1) {
                                field819[var6++] = var388;
                            } else {
                                field819[var6++] = var389;
                            }
                            continue;
                        }
                        if (var515 == 4111) {
                            var6--;
                            String var390 = field819[var6];
                            field819[var6++] = class227.method3837(var390);
                            continue;
                        }
                        if (var515 == 4112) {
                            var6--;
                            String var391 = field819[var6];
                            var5--;
                            int var392 = field824[var5];
                            field819[var6++] = var391 + (char) var392;
                            continue;
                        }
                        if (var515 == 4113) {
                            var5--;
                            int var393 = field824[var5];
                            field824[var5++] = class167.method591((char) var393) ? 1 : 0;
                            continue;
                        }
                        if (var515 == 4114) {
                            var5--;
                            int var394 = field824[var5];
                            field824[var5++] = class167.method584((char) var394) ? 1 : 0;
                            continue;
                        }
                        if (var515 == 4115) {
                            var5--;
                            int var395 = field824[var5];
                            int[] var396 = field824;
                            int var397 = var5++;
                            char var398 = (char) var395;
                            boolean var399 = var398 >= 'A' && var398 <= 'Z' || var398 >= 'a' && var398 <= 'z';
                            var396[var397] = var399 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 4116) {
                            var5--;
                            int var400 = field824[var5];
                            field824[var5++] = class167.method651((char) var400) ? 1 : 0;
                            continue;
                        }
                        if (var515 == 4117) {
                            var6--;
                            String var401 = field819[var6];
                            if (var401 == null) {
                                field824[var5++] = 0;
                            } else {
                                field824[var5++] = var401.length();
                            }
                            continue;
                        }
                        if (var515 == 4118) {
                            var6--;
                            String var402 = field819[var6];
                            var5 -= 2;
                            int var403 = field824[var5];
                            int var404 = field824[var5 + 1];
                            field819[var6++] = var402.substring(var403, var404);
                            continue;
                        }
                        if (var515 == 4119) {
                            var6--;
                            String var405 = field819[var6];
                            StringBuilder var406 = new StringBuilder(var405.length());
                            boolean var407 = false;
                            for (int var408 = 0; var408 < var405.length(); var408++) {
                                char var409 = var405.charAt(var408);
                                if (var409 == '<') {
                                    var407 = true;
                                } else if (var409 == '>') {
                                    var407 = false;
                                } else if (!var407) {
                                    var406.append(var409);
                                }
                            }
                            field819[var6++] = var406.toString();
                            continue;
                        }
                        if (var515 == 4120) {
                            var6--;
                            String var410 = field819[var6];
                            var5--;
                            int var411 = field824[var5];
                            field824[var5++] = var410.indexOf(var411);
                            continue;
                        }
                        if (var515 == 4121) {
                            var6 -= 2;
                            String var412 = field819[var6];
                            String var413 = field819[var6 + 1];
                            var5--;
                            int var414 = field824[var5];
                            field824[var5++] = var412.indexOf(var413, var414);
                            continue;
                        }
                    } else if (var515 < 4300) {
                        if (var515 == 4200) {
                            var5--;
                            int var415 = field824[var5];
                            field819[var6++] = class56.method43(var415).field1184;
                            continue;
                        }
                        if (var515 == 4201) {
                            var5 -= 2;
                            int var416 = field824[var5];
                            int var417 = field824[var5 + 1];
                            class56 var418 = class56.method43(var416);
                            if (var417 >= 1 && var417 <= 5 && var418.field1198[var417 - 1] != null) {
                                field819[var6++] = var418.field1198[var417 - 1];
                                continue;
                            }
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 4202) {
                            var5 -= 2;
                            int var419 = field824[var5];
                            int var420 = field824[var5 + 1];
                            class56 var421 = class56.method43(var419);
                            if (var420 >= 1 && var420 <= 5 && var421.field1199[var420 - 1] != null) {
                                field819[var6++] = var421.field1199[var420 - 1];
                                continue;
                            }
                            field819[var6++] = "";
                            continue;
                        }
                        if (var515 == 4203) {
                            var5--;
                            int var422 = field824[var5];
                            field824[var5++] = class56.method43(var422).field1186;
                            continue;
                        }
                        if (var515 == 4204) {
                            var5--;
                            int var423 = field824[var5];
                            field824[var5++] = class56.method43(var423).field1195 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 4205) {
                            var5--;
                            int var424 = field824[var5];
                            class56 var425 = class56.method43(var424);
                            if (var425.field1215 == -1 && var425.field1214 >= 0) {
                                field824[var5++] = var425.field1214;
                                continue;
                            }
                            field824[var5++] = var424;
                            continue;
                        }
                        if (var515 == 4206) {
                            var5--;
                            int var426 = field824[var5];
                            class56 var427 = class56.method43(var426);
                            if (var427.field1215 >= 0 && var427.field1214 >= 0) {
                                field824[var5++] = var427.field1214;
                                continue;
                            }
                            field824[var5++] = var426;
                            continue;
                        }
                        if (var515 == 4207) {
                            var5--;
                            int var428 = field824[var5];
                            field824[var5++] = class56.method43(var428).field1197 ? 1 : 0;
                            continue;
                        }
                        if (var515 == 4208) {
                            var5--;
                            int var429 = field824[var5];
                            class56 var430 = class56.method43(var429);
                            if (var430.field1226 == -1 && var430.field1225 >= 0) {
                                field824[var5++] = var430.field1225;
                                continue;
                            }
                            field824[var5++] = var429;
                            continue;
                        }
                        if (var515 == 4209) {
                            var5--;
                            int var431 = field824[var5];
                            class56 var432 = class56.method43(var431);
                            if (var432.field1226 >= 0 && var432.field1225 >= 0) {
                                field824[var5++] = var432.field1225;
                                continue;
                            }
                            field824[var5++] = var431;
                            continue;
                        }
                        if (var515 == 4210) {
                            var6--;
                            String var433 = field819[var6];
                            var5--;
                            int var434 = field824[var5];
                            boolean var436 = var434 == 1;
                            String var437 = var433.toLowerCase();
                            short[] var438 = new short[16];
                            int var439 = 0;
                            int var440 = 0;
                            while (true) {
                                if (var440 >= Statics.field3262) {
                                    Statics.field2086 = var438;
                                    Statics.field893 = 0;
                                    Statics.field617 = var439;
                                    String[] var444 = new String[Statics.field617];
                                    for (int var445 = 0; var445 < Statics.field617; var445++) {
                                        var444[var445] = class56.method43(var438[var445]).field1184;
                                    }
                                    class128.method1598(var444, Statics.field2086);
                                    break;
                                }
                                class56 var441 = class56.method43(var440);
                                if ((!var436 || var441.field1221) && var441.field1215 == -1 && var441.field1184.toLowerCase().indexOf(var437) != -1) {
                                    if (var439 >= 250) {
                                        Statics.field617 = -1;
                                        Statics.field2086 = null;
                                        break;
                                    }
                                    if (var439 >= var438.length) {
                                        short[] var442 = new short[var438.length * 2];
                                        for (int var443 = 0; var443 < var439; var443++) {
                                            var442[var443] = var438[var443];
                                        }
                                        var438 = var442;
                                    }
                                    var438[var439++] = (short) var440;
                                }
                                var440++;
                            }
                            field824[var5++] = Statics.field617;
                            continue;
                        }
                        if (var515 == 4211) {
                            if (Statics.field2086 != null && Statics.field893 < Statics.field617) {
                                field824[var5++] = Statics.field2086[++Statics.field893 - 1] & 0xFFFF;
                                continue;
                            }
                            field824[var5++] = -1;
                            continue;
                        }
                        if (var515 == 4212) {
                            Statics.field893 = 0;
                            continue;
                        }
                    } else if (var515 < 5100) {
                        if (var515 == 5000) {
                            field824[var5++] = client.field396;
                            continue;
                        }
                        if (var515 == 5001) {
                            var5 -= 3;
                            client.field396 = field824[var5];
                            Statics.field1536 = class134.method1861(field824[var5 + 1]);
                            if (Statics.field1536 == null) {
                                Statics.field1536 = class134.field2111;
                            }
                            client.field553 = field824[var5 + 2];
                            client.field314.method2639(186);
                            client.field314.method2399(client.field396);
                            client.field314.method2399(Statics.field1536.field2113);
                            client.field314.method2399(client.field553);
                            continue;
                        }
                        if (var515 == 5002) {
                            var6--;
                            String var446 = field819[var6];
                            var5 -= 2;
                            int var447 = field824[var5];
                            int var448 = field824[var5 + 1];
                            client.field314.method2639(36);
                            client.field314.method2399(class123.method1584(var446) + 2);
                            client.field314.method2405(var446);
                            client.field314.method2399(var447 - 1);
                            client.field314.method2399(var448);
                            continue;
                        }
                        if (var515 == 5003) {
                            var5 -= 2;
                            int var449 = field824[var5];
                            int var450 = field824[var5 + 1];
                            class30 var451 = (class30) class12.field157.get(var449);
                            class38 var452 = var451.method642(var450);
                            if (var452 == null) {
                                field824[var5++] = -1;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                                field819[var6++] = "";
                                field819[var6++] = "";
                            } else {
                                field824[var5++] = var452.field810;
                                field824[var5++] = var452.field806;
                                field819[var6++] = var452.field812 == null ? "" : var452.field812;
                                field819[var6++] = var452.field809 == null ? "" : var452.field809;
                                field819[var6++] = var452.field813 == null ? "" : var452.field813;
                            }
                            continue;
                        }
                        if (var515 == 5004) {
                            var5--;
                            int var454 = field824[var5];
                            class38 var455 = (class38) class12.field158.method3603((long) var454);
                            if (var455 == null) {
                                field824[var5++] = -1;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                                field819[var6++] = "";
                                field819[var6++] = "";
                            } else {
                                field824[var5++] = var455.field807;
                                field824[var5++] = var455.field806;
                                field819[var6++] = var455.field812 == null ? "" : var455.field812;
                                field819[var6++] = var455.field809 == null ? "" : var455.field809;
                                field819[var6++] = var455.field813 == null ? "" : var455.field813;
                            }
                            continue;
                        }
                        if (var515 == 5005) {
                            if (Statics.field1536 == null) {
                                field824[var5++] = -1;
                            } else {
                                field824[var5++] = Statics.field1536.field2113;
                            }
                            continue;
                        }
                        if (var515 == 5008) {
                            var6--;
                            String var457 = field819[var6];
                            var5--;
                            int var458 = field824[var5];
                            String var459 = var457.toLowerCase();
                            byte var460 = 0;
                            if (var459.startsWith(class161.field2543)) {
                                var460 = 0;
                                var457 = var457.substring(class161.field2543.length());
                            } else if (var459.startsWith(class161.field2475)) {
                                var460 = 1;
                                var457 = var457.substring(class161.field2475.length());
                            } else if (var459.startsWith(class161.field2547)) {
                                var460 = 2;
                                var457 = var457.substring(class161.field2547.length());
                            } else if (var459.startsWith(class161.field2604)) {
                                var460 = 3;
                                var457 = var457.substring(class161.field2604.length());
                            } else if (var459.startsWith(class161.field2551)) {
                                var460 = 4;
                                var457 = var457.substring(class161.field2551.length());
                            } else if (var459.startsWith(class161.field2553)) {
                                var460 = 5;
                                var457 = var457.substring(class161.field2553.length());
                            } else if (var459.startsWith(class161.field2602)) {
                                var460 = 6;
                                var457 = var457.substring(class161.field2602.length());
                            } else if (var459.startsWith(class161.field2557)) {
                                var460 = 7;
                                var457 = var457.substring(class161.field2557.length());
                            } else if (var459.startsWith(class161.field2598)) {
                                var460 = 8;
                                var457 = var457.substring(class161.field2598.length());
                            } else if (var459.startsWith(class161.field2417)) {
                                var460 = 9;
                                var457 = var457.substring(class161.field2417.length());
                            } else if (var459.startsWith(class161.field2563)) {
                                var460 = 10;
                                var457 = var457.substring(class161.field2563.length());
                            } else if (var459.startsWith(class161.field2565)) {
                                var460 = 11;
                                var457 = var457.substring(class161.field2565.length());
                            } else if (client.field534 != 0) {
                                if (var459.startsWith(class161.field2544)) {
                                    var460 = 0;
                                    var457 = var457.substring(class161.field2544.length());
                                } else if (var459.startsWith(class161.field2546)) {
                                    var460 = 1;
                                    var457 = var457.substring(class161.field2546.length());
                                } else if (var459.startsWith(class161.field2548)) {
                                    var460 = 2;
                                    var457 = var457.substring(class161.field2548.length());
                                } else if (var459.startsWith(class161.field2387)) {
                                    var460 = 3;
                                    var457 = var457.substring(class161.field2387.length());
                                } else if (var459.startsWith(class161.field2552)) {
                                    var460 = 4;
                                    var457 = var457.substring(class161.field2552.length());
                                } else if (var459.startsWith(class161.field2573)) {
                                    var460 = 5;
                                    var457 = var457.substring(class161.field2573.length());
                                } else if (var459.startsWith(class161.field2556)) {
                                    var460 = 6;
                                    var457 = var457.substring(class161.field2556.length());
                                } else if (var459.startsWith(class161.field2558)) {
                                    var460 = 7;
                                    var457 = var457.substring(class161.field2558.length());
                                } else if (var459.startsWith(class161.field2560)) {
                                    var460 = 8;
                                    var457 = var457.substring(class161.field2560.length());
                                } else if (var459.startsWith(class161.field2562)) {
                                    var460 = 9;
                                    var457 = var457.substring(class161.field2562.length());
                                } else if (var459.startsWith(class161.field2444)) {
                                    var460 = 10;
                                    var457 = var457.substring(class161.field2444.length());
                                } else if (var459.startsWith(class161.field2566)) {
                                    var460 = 11;
                                    var457 = var457.substring(class161.field2566.length());
                                }
                            }
                            String var461 = var457.toLowerCase();
                            byte var462 = 0;
                            if (var461.startsWith(class161.field2567)) {
                                var462 = 1;
                                var457 = var457.substring(class161.field2567.length());
                            } else if (var461.startsWith(class161.field2569)) {
                                var462 = 2;
                                var457 = var457.substring(class161.field2569.length());
                            } else if (var461.startsWith(class161.field2453)) {
                                var462 = 3;
                                var457 = var457.substring(class161.field2453.length());
                            } else if (var461.startsWith(class161.field2643)) {
                                var462 = 4;
                                var457 = var457.substring(class161.field2643.length());
                            } else if (var461.startsWith(class161.field2575)) {
                                var462 = 5;
                                var457 = var457.substring(class161.field2575.length());
                            } else if (client.field534 != 0) {
                                if (var461.startsWith(class161.field2568)) {
                                    var462 = 1;
                                    var457 = var457.substring(class161.field2568.length());
                                } else if (var461.startsWith(class161.field2578)) {
                                    var462 = 2;
                                    var457 = var457.substring(class161.field2578.length());
                                } else if (var461.startsWith(class161.field2572)) {
                                    var462 = 3;
                                    var457 = var457.substring(class161.field2572.length());
                                } else if (var461.startsWith(class161.field2497)) {
                                    var462 = 4;
                                    var457 = var457.substring(class161.field2497.length());
                                } else if (var461.startsWith(class161.field2576)) {
                                    var462 = 5;
                                    var457 = var457.substring(class161.field2576.length());
                                }
                            }
                            client.field314.method2639(133);
                            client.field314.method2399(0);
                            int var463 = client.field314.field2046;
                            client.field314.method2399(var458);
                            client.field314.method2399(var460);
                            client.field314.method2399(var462);
                            class126 var464 = client.field314;
                            int var465 = var464.field2046;
                            int var466 = var457.length();
                            byte[] var467 = new byte[var466];
                            for (int var468 = 0; var468 < var466; var468++) {
                                char var469 = var457.charAt(var468);
                                if (var469 > 0 && var469 < 128 || var469 >= 160 && var469 <= 255) {
                                    var467[var468] = (byte) var469;
                                } else if (var469 == 8364) {
                                    var467[var468] = -128;
                                } else if (var469 == 8218) {
                                    var467[var468] = -126;
                                } else if (var469 == 402) {
                                    var467[var468] = -125;
                                } else if (var469 == 8222) {
                                    var467[var468] = -124;
                                } else if (var469 == 8230) {
                                    var467[var468] = -123;
                                } else if (var469 == 8224) {
                                    var467[var468] = -122;
                                } else if (var469 == 8225) {
                                    var467[var468] = -121;
                                } else if (var469 == 710) {
                                    var467[var468] = -120;
                                } else if (var469 == 8240) {
                                    var467[var468] = -119;
                                } else if (var469 == 352) {
                                    var467[var468] = -118;
                                } else if (var469 == 8249) {
                                    var467[var468] = -117;
                                } else if (var469 == 338) {
                                    var467[var468] = -116;
                                } else if (var469 == 381) {
                                    var467[var468] = -114;
                                } else if (var469 == 8216) {
                                    var467[var468] = -111;
                                } else if (var469 == 8217) {
                                    var467[var468] = -110;
                                } else if (var469 == 8220) {
                                    var467[var468] = -109;
                                } else if (var469 == 8221) {
                                    var467[var468] = -108;
                                } else if (var469 == 8226) {
                                    var467[var468] = -107;
                                } else if (var469 == 8211) {
                                    var467[var468] = -106;
                                } else if (var469 == 8212) {
                                    var467[var468] = -105;
                                } else if (var469 == 732) {
                                    var467[var468] = -104;
                                } else if (var469 == 8482) {
                                    var467[var468] = -103;
                                } else if (var469 == 353) {
                                    var467[var468] = -102;
                                } else if (var469 == 8250) {
                                    var467[var468] = -101;
                                } else if (var469 == 339) {
                                    var467[var468] = -100;
                                } else if (var469 == 382) {
                                    var467[var468] = -98;
                                } else if (var469 == 376) {
                                    var467[var468] = -97;
                                } else {
                                    var467[var468] = 63;
                                }
                            }
                            var464.method2412(var467.length);
                            var464.field2046 += Statics.field3231.method2338(var467, 0, var467.length, var464.field2048, var464.field2046);
                            client.field314.method2543(client.field314.field2046 - var463);
                            continue;
                        }
                        if (var515 == 5009) {
                            var6 -= 2;
                            String var472 = field819[var6];
                            String var473 = field819[var6 + 1];
                            client.field314.method2639(31);
                            client.field314.method2400(0);
                            int var474 = client.field314.field2046;
                            client.field314.method2405(var472);
                            class126 var475 = client.field314;
                            int var476 = var475.field2046;
                            int var477 = var473.length();
                            byte[] var478 = new byte[var477];
                            for (int var479 = 0; var479 < var477; var479++) {
                                char var480 = var473.charAt(var479);
                                if (var480 > 0 && var480 < 128 || var480 >= 160 && var480 <= 255) {
                                    var478[var479] = (byte) var480;
                                } else if (var480 == 8364) {
                                    var478[var479] = -128;
                                } else if (var480 == 8218) {
                                    var478[var479] = -126;
                                } else if (var480 == 402) {
                                    var478[var479] = -125;
                                } else if (var480 == 8222) {
                                    var478[var479] = -124;
                                } else if (var480 == 8230) {
                                    var478[var479] = -123;
                                } else if (var480 == 8224) {
                                    var478[var479] = -122;
                                } else if (var480 == 8225) {
                                    var478[var479] = -121;
                                } else if (var480 == 710) {
                                    var478[var479] = -120;
                                } else if (var480 == 8240) {
                                    var478[var479] = -119;
                                } else if (var480 == 352) {
                                    var478[var479] = -118;
                                } else if (var480 == 8249) {
                                    var478[var479] = -117;
                                } else if (var480 == 338) {
                                    var478[var479] = -116;
                                } else if (var480 == 381) {
                                    var478[var479] = -114;
                                } else if (var480 == 8216) {
                                    var478[var479] = -111;
                                } else if (var480 == 8217) {
                                    var478[var479] = -110;
                                } else if (var480 == 8220) {
                                    var478[var479] = -109;
                                } else if (var480 == 8221) {
                                    var478[var479] = -108;
                                } else if (var480 == 8226) {
                                    var478[var479] = -107;
                                } else if (var480 == 8211) {
                                    var478[var479] = -106;
                                } else if (var480 == 8212) {
                                    var478[var479] = -105;
                                } else if (var480 == 732) {
                                    var478[var479] = -104;
                                } else if (var480 == 8482) {
                                    var478[var479] = -103;
                                } else if (var480 == 353) {
                                    var478[var479] = -102;
                                } else if (var480 == 8250) {
                                    var478[var479] = -101;
                                } else if (var480 == 339) {
                                    var478[var479] = -100;
                                } else if (var480 == 382) {
                                    var478[var479] = -98;
                                } else if (var480 == 376) {
                                    var478[var479] = -97;
                                } else {
                                    var478[var479] = 63;
                                }
                            }
                            var475.method2412(var478.length);
                            var475.field2046 += Statics.field3231.method2338(var478, 0, var478.length, var475.field2048, var475.field2046);
                            client.field314.method2410(client.field314.field2046 - var474);
                            continue;
                        }
                        if (var515 == 5015) {
                            String var483;
                            if (Statics.field2011 == null || Statics.field2011.field44 == null) {
                                var483 = "";
                            } else {
                                var483 = Statics.field2011.field44;
                            }
                            field819[var6++] = var483;
                            continue;
                        }
                        if (var515 == 5016) {
                            field824[var5++] = client.field553;
                            continue;
                        }
                        if (var515 == 5017) {
                            var5--;
                            int var484 = field824[var5];
                            int[] var485 = field824;
                            int var486 = var5++;
                            class30 var487 = (class30) class12.field157.get(var484);
                            int var488;
                            if (var487 == null) {
                                var488 = 0;
                            } else {
                                var488 = var487.method640();
                            }
                            var485[var486] = var488;
                            continue;
                        }
                        if (var515 == 5018) {
                            var5--;
                            int var489 = field824[var5];
                            field824[var5++] = class12.method711(var489);
                            continue;
                        }
                        if (var515 == 5019) {
                            var5--;
                            int var490 = field824[var5];
                            field824[var5++] = class12.method2296(var490);
                            continue;
                        }
                        if (var515 == 5020) {
                            var6--;
                            String var491 = field819[var6];
                            client.method35(var491);
                            continue;
                        }
                        if (var515 == 5021) {
                            var6--;
                            client.field491 = field819[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var515 == 5022) {
                            field819[var6++] = client.field491;
                            continue;
                        }
                    }
                } else {
                    class177 var82;
                    if (var515 >= 2000) {
                        var515 -= 1000;
                        var5--;
                        var82 = class177.method701(field824[var5]);
                    } else {
                        var82 = var51 ? Statics.field826 : Statics.field641;
                    }
                    if (var515 == 1300) {
                        var5--;
                        int var83 = field824[var5] - 1;
                        if (var83 >= 0 && var83 <= 9) {
                            var6--;
                            var82.method3259(var83, field819[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var515 == 1301) {
                        var5 -= 2;
                        int var84 = field824[var5];
                        int var85 = field824[var5 + 1];
                        var82.field2871 = class177.method2998(var84, var85);
                        continue;
                    }
                    if (var515 == 1302) {
                        var5--;
                        var82.field2874 = field824[var5] == 1;
                        continue;
                    }
                    if (var515 == 1303) {
                        var5--;
                        var82.field2826 = field824[var5];
                        continue;
                    }
                    if (var515 == 1304) {
                        var5--;
                        var82.field2798 = field824[var5];
                        continue;
                    }
                    if (var515 == 1305) {
                        var6--;
                        var82.field2869 = field819[var6];
                        continue;
                    }
                    if (var515 == 1306) {
                        var6--;
                        var82.field2875 = field819[var6];
                        continue;
                    }
                    if (var515 == 1307) {
                        var82.field2813 = null;
                        continue;
                    }
                }
                if (var515 < 5400) {
                    if (var515 == 5306) {
                        int[] var492 = field824;
                        int var493 = var5++;
                        int var494 = client.field361 ? 2 : 1;
                        var492[var493] = var494;
                        continue;
                    }
                    if (var515 == 5307) {
                        var5--;
                        int var495 = field824[var5];
                        if (var495 != 1 && var495 != 2) {
                            continue;
                        }
                        client.field484 = 0L;
                        if (var495 >= 2) {
                            client.field361 = true;
                        } else {
                            client.field361 = false;
                        }
                        client.method172();
                        if (client.field281 >= 25) {
                            client.method3270();
                        }
                        class148.field2266 = true;
                        continue;
                    }
                    if (var515 == 5308) {
                        field824[var5++] = Statics.field163.field137;
                        continue;
                    }
                    if (var515 == 5309) {
                        var5--;
                        int var496 = field824[var5];
                        if (var496 == 1 || var496 == 2) {
                            Statics.field163.field137 = var496;
                            class9.method660();
                        }
                        continue;
                    }
                }
                if (var515 < 5600) {
                    if (var515 == 5504) {
                        var5 -= 2;
                        int var497 = field824[var5];
                        int var498 = field824[var5 + 1];
                        if (!client.field519) {
                            client.field357 = var497;
                            client.field358 = var498;
                        }
                        continue;
                    }
                    if (var515 == 5505) {
                        field824[var5++] = client.field357;
                        continue;
                    }
                    if (var515 == 5506) {
                        field824[var5++] = client.field358;
                        continue;
                    }
                    if (var515 == 5530) {
                        var5--;
                        int var499 = field824[var5];
                        if (var499 < 0) {
                            var499 = 0;
                        }
                        client.field438 = var499;
                        continue;
                    }
                    if (var515 == 5531) {
                        field824[var5++] = client.field438;
                        continue;
                    }
                }
                if (var515 >= 5700 || var515 != 5630) {
                    if (var515 < 6300) {
                        if (var515 == 6200) {
                            var5 -= 2;
                            client.field525 = (short) field824[var5];
                            if (client.field525 <= 0) {
                                client.field525 = 256;
                            }
                            client.field526 = (short) field824[var5 + 1];
                            if (client.field526 <= 0) {
                                client.field526 = 205;
                            }
                            continue;
                        }
                        if (var515 == 6201) {
                            var5 -= 2;
                            client.field348 = (short) field824[var5];
                            if (client.field348 <= 0) {
                                client.field348 = 256;
                            }
                            client.field368 = (short) field824[var5 + 1];
                            if (client.field368 <= 0) {
                                client.field368 = 320;
                            }
                            continue;
                        }
                        if (var515 == 6202) {
                            var5 -= 4;
                            client.field509 = (short) field824[var5];
                            if (client.field509 <= 0) {
                                client.field509 = 1;
                            }
                            client.field426 = (short) field824[var5 + 1];
                            if (client.field426 <= 0) {
                                client.field426 = 32767;
                            } else if (client.field426 < client.field509) {
                                client.field426 = client.field509;
                            }
                            client.field531 = (short) field824[var5 + 2];
                            if (client.field531 <= 0) {
                                client.field531 = 1;
                            }
                            client.field543 = (short) field824[var5 + 3];
                            if (client.field543 <= 0) {
                                client.field543 = 32767;
                            } else if (client.field543 < client.field531) {
                                client.field543 = client.field531;
                            }
                            continue;
                        }
                        if (var515 == 6203) {
                            if (client.field293 == null) {
                                field824[var5++] = -1;
                                field824[var5++] = -1;
                            } else {
                                client.method871(0, 0, client.field293.field2927, client.field293.field2878, false);
                                field824[var5++] = client.field535;
                                field824[var5++] = client.field365;
                            }
                            continue;
                        }
                        if (var515 == 6204) {
                            field824[var5++] = client.field348;
                            field824[var5++] = client.field368;
                            continue;
                        }
                        if (var515 == 6205) {
                            field824[var5++] = client.field525;
                            field824[var5++] = client.field526;
                            continue;
                        }
                    }
                    if (var515 < 6600) {
                        if (var515 == 6500) {
                            field824[var5++] = class28.method177() ? 1 : 0;
                            continue;
                        }
                        if (var515 == 6501) {
                            class28 var500 = Statics.method139();
                            if (var500 == null) {
                                field824[var5++] = -1;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                                field824[var5++] = 0;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                            } else {
                                field824[var5++] = var500.field651;
                                field824[var5++] = var500.field652;
                                field819[var6++] = var500.field646;
                                field824[var5++] = var500.field656;
                                field824[var5++] = var500.field653;
                                field819[var6++] = var500.field655;
                            }
                            continue;
                        }
                        if (var515 == 6502) {
                            class28 var501 = class28.method659();
                            if (var501 == null) {
                                field824[var5++] = -1;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                                field824[var5++] = 0;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                            } else {
                                field824[var5++] = var501.field651;
                                field824[var5++] = var501.field652;
                                field819[var6++] = var501.field646;
                                field824[var5++] = var501.field656;
                                field824[var5++] = var501.field653;
                                field819[var6++] = var501.field655;
                            }
                            continue;
                        }
                        if (var515 == 6506) {
                            var5--;
                            int var502 = field824[var5];
                            class28 var503 = null;
                            for (int var504 = 0; var504 < class28.field647; var504++) {
                                if (Statics.field3211[var504].field651 == var502) {
                                    var503 = Statics.field3211[var504];
                                    break;
                                }
                            }
                            if (var503 == null) {
                                field824[var5++] = -1;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                                field824[var5++] = 0;
                                field824[var5++] = 0;
                                field819[var6++] = "";
                            } else {
                                field824[var5++] = var503.field651;
                                field824[var5++] = var503.field652;
                                field819[var6++] = var503.field646;
                                field824[var5++] = var503.field656;
                                field824[var5++] = var503.field653;
                                field819[var6++] = var503.field655;
                            }
                            continue;
                        }
                        if (var515 == 6507) {
                            var5 -= 4;
                            int var505 = field824[var5];
                            boolean var506 = field824[var5 + 1] == 1;
                            int var507 = field824[var5 + 2];
                            boolean var508 = field824[var5 + 3] == 1;
                            if (Statics.field3211 != null) {
                                class28.method40(0, Statics.field3211.length - 1, var505, var506, var507, var508);
                            }
                            continue;
                        }
                        if (var515 == 6511) {
                            var5--;
                            int var509 = field824[var5];
                            if (var509 >= 0 && var509 < class28.field647) {
                                class28 var510 = Statics.field3211[var509];
                                field824[var5++] = var510.field651;
                                field824[var5++] = var510.field652;
                                field819[var6++] = var510.field646;
                                field824[var5++] = var510.field656;
                                field824[var5++] = var510.field653;
                                field819[var6++] = var510.field655;
                                continue;
                            }
                            field824[var5++] = -1;
                            field824[var5++] = 0;
                            field819[var6++] = "";
                            field824[var5++] = 0;
                            field824[var5++] = 0;
                            field819[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field324 = 250;
            }
        } catch (Exception var514) {
            StringBuilder var512 = new StringBuilder(30);
            var512.append("").append(var4.field3168).append(" ");
            for (int var513 = field820 - 1; var513 >= 0; var513--) {
                var512.append("").append(field821[var513].field193.field3168).append(" ");
            }
            var512.append("").append(var10);
            class152.method1096(var512.toString(), var514);
        }
    }

    @ObfuscatedName("dm.w(II)V")
    public static void method2212(int arg0) {
        if (arg0 == -1 || !class177.method2581(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2815[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2877 != null) {
                class1 var4 = new class1();
                var4.field4 = var3;
                var4.field2 = var3.field2877;
                method850(var4, 2000000);
            }
        }
    }
}
