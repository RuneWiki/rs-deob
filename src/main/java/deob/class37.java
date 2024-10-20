package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ad")
public class class37 {

    @ObfuscatedName("ad.g")
    public static int[] field798 = new int[5];

    @ObfuscatedName("ad.o")
    public static int[][] field799 = new int[5][5000];

    @ObfuscatedName("ad.i")
    public static int[] field810 = new int[1000];

    @ObfuscatedName("ad.w")
    public static String[] field800 = new String[1000];

    @ObfuscatedName("ad.m")
    public static int field802 = 0;

    @ObfuscatedName("ad.r")
    public static class15[] field811 = new class15[50];

    @ObfuscatedName("ad.f")
    public static Calendar field804 = Calendar.getInstance();

    @ObfuscatedName("ad.x")
    public static final String[] field805 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ad.d")
    public static int field806 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.c(Lc;I)V")
    public static void method103(class1 arg0) {
        method2087(arg0, 200000);
    }

    @ObfuscatedName("ca.h(Lc;II)V")
    public static void method2087(class1 arg0, int arg1) {
        Object[] var2 = arg0.field17;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2885(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field582;
        int[] var9 = var4.field594;
        byte var10 = -1;
        field802 = 0;
        try {
            Statics.field2630 = new int[var4.field581];
            int var11 = 0;
            Statics.field667 = new String[var4.field585];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2822;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2742;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2822;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2742;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field2630[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field2;
                    }
                    Statics.field667[var12++] = var15;
                }
            }
            int var16 = 0;
            field806 = arg0.field11;
            label3054: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var424 = var8[var7];
                if (var424 < 100) {
                    if (var424 == 0) {
                        field810[var5++] = var9[var7];
                        continue;
                    }
                    if (var424 == 1) {
                        int var17 = var9[var7];
                        field810[var5++] = class176.field2887[var17];
                        continue;
                    }
                    if (var424 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2887[var18] = field810[var5];
                        client.method1219(var18);
                        continue;
                    }
                    if (var424 == 3) {
                        field800[var6++] = var4.field583[var7];
                        continue;
                    }
                    if (var424 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var424 == 7) {
                        var5 -= 2;
                        if (field810[var5 + 1] != field810[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 8) {
                        var5 -= 2;
                        if (field810[var5 + 1] == field810[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 9) {
                        var5 -= 2;
                        if (field810[var5] < field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 10) {
                        var5 -= 2;
                        if (field810[var5] > field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 21) {
                        if (field802 == 0) {
                            return;
                        }
                        class15 var19 = field811[--field802];
                        var4 = var19.field204;
                        var8 = var4.field582;
                        var9 = var4.field594;
                        var7 = var19.field207;
                        Statics.field2630 = var19.field201;
                        Statics.field667 = var19.field202;
                        continue;
                    }
                    if (var424 == 25) {
                        int var20 = var9[var7];
                        field810[var5++] = class176.method43(var20);
                        continue;
                    }
                    if (var424 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method1897(var21, field810[var5]);
                        continue;
                    }
                    if (var424 == 31) {
                        var5 -= 2;
                        if (field810[var5] <= field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 32) {
                        var5 -= 2;
                        if (field810[var5] >= field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 33) {
                        field810[var5++] = Statics.field2630[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var424 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2630[var10001] = field810[var5];
                        continue;
                    }
                    if (var424 == 35) {
                        field800[var6++] = Statics.field667[var9[var7]];
                        continue;
                    }
                    if (var424 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field667[var10001] = field800[var6];
                        continue;
                    }
                    if (var424 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field800;
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
                        field800[var6++] = var24;
                        continue;
                    }
                    if (var424 == 38) {
                        var5--;
                        continue;
                    }
                    if (var424 == 39) {
                        var6--;
                        continue;
                    }
                    if (var424 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method2885(var34);
                        int[] var36 = new int[var35.field581];
                        String[] var37 = new String[var35.field585];
                        for (int var38 = 0; var38 < var35.field586; var38++) {
                            var36[var38] = field810[var5 - var35.field586 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field587; var39++) {
                            var37[var39] = field800[var6 - var35.field587 + var39];
                        }
                        var5 -= var35.field586;
                        var6 -= var35.field587;
                        class15 var40 = new class15();
                        var40.field204 = var4;
                        var40.field207 = var7;
                        var40.field201 = Statics.field2630;
                        var40.field202 = Statics.field667;
                        field811[++field802 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field582;
                        var9 = var35.field594;
                        var7 = -1;
                        Statics.field2630 = var36;
                        Statics.field667 = var37;
                        continue;
                    }
                    if (var424 == 42) {
                        field810[var5++] = Statics.field2670.method190(var9[var7]);
                        continue;
                    }
                    if (var424 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2670.method189(var10001, field810[var5]);
                        continue;
                    }
                    if (var424 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field810[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field798[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3054;
                                }
                                field799[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var424 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field810[var5];
                        if (var47 >= 0 && var47 < field798[var46]) {
                            field810[var5++] = field799[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var424 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field810[var5];
                        if (var49 >= 0 && var49 < field798[var48]) {
                            field799[var48][var49] = field810[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var424 == 47) {
                        String var50 = Statics.field2670.method202(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field800[var6++] = var50;
                        continue;
                    }
                    if (var424 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2670.method191(var10001, field800[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var424 < 1000) {
                    if (var424 == 100) {
                        var5 -= 3;
                        int var52 = field810[var5];
                        int var53 = field810[var5 + 1];
                        int var54 = field810[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var55 = class173.method708(var52);
                        if (var55.field2811 == null) {
                            var55.field2811 = new class173[var54 + 1];
                        }
                        if (var55.field2811.length <= var54) {
                            class173[] var56 = new class173[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2811.length; var57++) {
                                var56[var57] = var55.field2811[var57];
                            }
                            var55.field2811 = var56;
                        }
                        if (var54 > 0 && var55.field2811[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class173 var58 = new class173();
                        var58.field2770 = var53;
                        var58.field2802 = var58.field2822 = var55.field2822;
                        var58.field2742 = var54;
                        var58.field2844 = true;
                        var55.field2811[var54] = var58;
                        if (var51) {
                            Statics.field2727 = var58;
                        } else {
                            Statics.field3148 = var58;
                        }
                        client.method643(var55);
                        continue;
                    }
                    if (var424 == 101) {
                        class173 var59 = var51 ? Statics.field2727 : Statics.field3148;
                        class173 var60 = class173.method708(var59.field2822);
                        var60.field2811[var59.field2742] = null;
                        client.method643(var60);
                        continue;
                    }
                    if (var424 == 102) {
                        var5--;
                        class173 var61 = class173.method708(field810[var5]);
                        var61.field2811 = null;
                        client.method643(var61);
                        continue;
                    }
                    if (var424 == 200) {
                        var5 -= 2;
                        int var62 = field810[var5];
                        int var63 = field810[var5 + 1];
                        class173 var64 = class173.method3108(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field810[var5++] = 1;
                            if (var51) {
                                Statics.field2727 = var64;
                            } else {
                                Statics.field3148 = var64;
                            }
                            continue;
                        }
                        field810[var5++] = 0;
                        continue;
                    }
                    if (var424 == 201) {
                        var5--;
                        class173 var65 = class173.method708(field810[var5]);
                        if (var65 == null) {
                            field810[var5++] = 0;
                        } else {
                            field810[var5++] = 1;
                            if (var51) {
                                Statics.field2727 = var65;
                            } else {
                                Statics.field3148 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var424 >= 1000 && var424 < 1100 || var424 >= 2000 && var424 < 2100) {
                    int var66 = -1;
                    class173 var67;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var66 = field810[var5];
                        var67 = class173.method708(var66);
                    } else {
                        var67 = var51 ? Statics.field2727 : Statics.field3148;
                    }
                    if (var424 == 1000) {
                        var5 -= 4;
                        var67.field2853 = field810[var5];
                        var67.field2806 = field810[var5 + 1];
                        var67.field2746 = field810[var5 + 2];
                        var67.field2747 = field810[var5 + 3];
                        client.method643(var67);
                        client.method984(var67);
                        if (var66 != -1 && var67.field2770 == 0) {
                            client.method2567(Statics.field2827[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var424 == 1001) {
                        var5 -= 4;
                        var67.field2752 = field810[var5];
                        var67.field2753 = field810[var5 + 1];
                        var67.field2748 = field810[var5 + 2];
                        var67.field2749 = field810[var5 + 3];
                        client.method643(var67);
                        client.method984(var67);
                        if (var66 != -1 && var67.field2770 == 0) {
                            client.method2567(Statics.field2827[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var424 == 1003) {
                        var5--;
                        boolean var68 = field810[var5] == 1;
                        if (var67.field2761 != var68) {
                            var67.field2761 = var68;
                            client.method643(var67);
                        }
                        continue;
                    }
                    if (var424 == 1005) {
                        var5--;
                        var67.field2872 = field810[var5] == 1;
                        continue;
                    }
                    if (var424 == 1006) {
                        var5--;
                        var67.field2873 = field810[var5] == 1;
                        continue;
                    }
                } else if (var424 >= 1100 && var424 < 1200 || var424 >= 2100 && var424 < 2200) {
                    int var69 = -1;
                    class173 var70;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var69 = field810[var5];
                        var70 = class173.method708(var69);
                    } else {
                        var70 = var51 ? Statics.field2727 : Statics.field3148;
                    }
                    if (var424 == 1100) {
                        var5 -= 2;
                        var70.field2826 = field810[var5];
                        if (var70.field2826 > var70.field2764 - var70.field2855) {
                            var70.field2826 = var70.field2764 - var70.field2855;
                        }
                        if (var70.field2826 < 0) {
                            var70.field2826 = 0;
                        }
                        var70.field2763 = field810[var5 + 1];
                        if (var70.field2763 > var70.field2750 - var70.field2740) {
                            var70.field2763 = var70.field2750 - var70.field2740;
                        }
                        if (var70.field2763 < 0) {
                            var70.field2763 = 0;
                        }
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1101) {
                        var5--;
                        var70.field2766 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1102) {
                        var5--;
                        var70.field2760 = field810[var5] == 1;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1103) {
                        var5--;
                        var70.field2771 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1104) {
                        var5--;
                        var70.field2849 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1105) {
                        var5--;
                        var70.field2774 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1106) {
                        var5--;
                        var70.field2776 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1107) {
                        var5--;
                        var70.field2772 = field810[var5] == 1;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1108) {
                        var70.field2821 = 1;
                        var5--;
                        var70.field2835 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1109) {
                        var5 -= 6;
                        var70.field2788 = field810[var5];
                        var70.field2789 = field810[var5 + 1];
                        var70.field2840 = field810[var5 + 2];
                        var70.field2791 = field810[var5 + 3];
                        var70.field2792 = field810[var5 + 4];
                        var70.field2790 = field810[var5 + 5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1110) {
                        var5--;
                        int var71 = field810[var5];
                        if (var70.field2786 != var71) {
                            var70.field2786 = var71;
                            var70.field2861 = 0;
                            var70.field2800 = 0;
                            client.method643(var70);
                        }
                        continue;
                    }
                    if (var424 == 1111) {
                        var5--;
                        var70.field2796 = field810[var5] == 1;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1112) {
                        var6--;
                        String var72 = field800[var6];
                        if (!var72.equals(var70.field2799)) {
                            var70.field2799 = var72;
                            client.method643(var70);
                        }
                        continue;
                    }
                    if (var424 == 1113) {
                        var5--;
                        var70.field2798 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1114) {
                        var5 -= 3;
                        var70.field2868 = field810[var5];
                        var70.field2803 = field810[var5 + 1];
                        var70.field2801 = field810[var5 + 2];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1115) {
                        var5--;
                        var70.field2804 = field810[var5] == 1;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1116) {
                        var5--;
                        var70.field2778 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1117) {
                        var5--;
                        var70.field2779 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1118) {
                        var5--;
                        var70.field2780 = field810[var5] == 1;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1119) {
                        var5--;
                        var70.field2756 = field810[var5] == 1;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1120) {
                        var5 -= 2;
                        var70.field2764 = field810[var5];
                        var70.field2750 = field810[var5 + 1];
                        client.method643(var70);
                        if (var69 != -1 && var70.field2770 == 0) {
                            client.method2567(Statics.field2827[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var424 == 1121) {
                        client.method642(var70.field2822, var70.field2742);
                        client.field439 = var70;
                        client.method643(var70);
                        continue;
                    }
                    if (var424 == 1122) {
                        var5--;
                        var70.field2775 = field810[var5];
                        client.method643(var70);
                        continue;
                    }
                } else if (var424 >= 1200 && var424 < 1300 || var424 >= 2200 && var424 < 2300) {
                    class173 var73;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var73 = class173.method708(field810[var5]);
                    } else {
                        var73 = var51 ? Statics.field2727 : Statics.field3148;
                    }
                    client.method643(var73);
                    if (var424 == 1200 || var424 == 1205 || var424 == 1212) {
                        var5 -= 2;
                        int var74 = field810[var5];
                        int var75 = field810[var5 + 1];
                        var73.field2859 = var74;
                        var73.field2860 = var75;
                        class52 var76 = class52.method971(var74);
                        var73.field2840 = var76.field1119;
                        var73.field2791 = var76.field1120;
                        var73.field2792 = var76.field1104;
                        var73.field2788 = var76.field1122;
                        var73.field2789 = var76.field1123;
                        var73.field2790 = var76.field1118;
                        if (var424 == 1205) {
                            var73.field2797 = 0;
                        } else if (var424 == 1212 | var76.field1121 == 1) {
                            var73.field2797 = 1;
                        } else {
                            var73.field2797 = 2;
                        }
                        if (var73.field2794 > 0) {
                            var73.field2790 = var73.field2790 * 32 / var73.field2794;
                        } else if (var73.field2752 > 0) {
                            var73.field2790 = var73.field2790 * 32 / var73.field2752;
                        }
                        continue;
                    }
                    if (var424 == 1201) {
                        var73.field2821 = 2;
                        var5--;
                        var73.field2835 = field810[var5];
                        continue;
                    }
                    if (var424 == 1202) {
                        var73.field2821 = 3;
                        var73.field2835 = Statics.field2644.field43.method3272();
                        continue;
                    }
                } else if ((var424 < 1300 || var424 >= 1400) && (var424 < 2300 || var424 >= 2400)) {
                    if (var424 >= 1400 && var424 < 1500 || var424 >= 2400 && var424 < 2500) {
                        class173 var81;
                        if (var424 >= 2000) {
                            var424 -= 1000;
                            var5--;
                            var81 = class173.method708(field810[var5]);
                        } else {
                            var81 = var51 ? Statics.field2727 : Statics.field3148;
                        }
                        var6--;
                        String var82 = field800[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field810[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field810[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field800[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field810[var5]);
                            }
                        }
                        var5--;
                        int var87 = field810[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var424 == 1400) {
                            var81.field2765 = var85;
                        }
                        if (var424 == 1401) {
                            var81.field2824 = var85;
                        }
                        if (var424 == 1402) {
                            var81.field2823 = var85;
                        }
                        if (var424 == 1403) {
                            var81.field2741 = var85;
                        }
                        if (var424 == 1404) {
                            var81.field2830 = var85;
                        }
                        if (var424 == 1405) {
                            var81.field2828 = var85;
                        }
                        if (var424 == 1406) {
                            var81.field2831 = var85;
                        }
                        if (var424 == 1407) {
                            var81.field2773 = var85;
                            var81.field2751 = var83;
                        }
                        if (var424 == 1408) {
                            var81.field2838 = var85;
                        }
                        if (var424 == 1409) {
                            var81.field2839 = var85;
                        }
                        if (var424 == 1410) {
                            var81.field2829 = var85;
                        }
                        if (var424 == 1411) {
                            var81.field2833 = var85;
                        }
                        if (var424 == 1412) {
                            var81.field2842 = var85;
                        }
                        if (var424 == 1414) {
                            var81.field2816 = var85;
                            var81.field2782 = var83;
                        }
                        if (var424 == 1415) {
                            var81.field2807 = var85;
                            var81.field2837 = var83;
                        }
                        if (var424 == 1416) {
                            var81.field2777 = var85;
                        }
                        if (var424 == 1417) {
                            var81.field2846 = var85;
                        }
                        if (var424 == 1418) {
                            var81.field2863 = var85;
                        }
                        if (var424 == 1419) {
                            var81.field2825 = var85;
                        }
                        if (var424 == 1420) {
                            var81.field2843 = var85;
                        }
                        if (var424 == 1421) {
                            var81.field2785 = var85;
                        }
                        if (var424 == 1422) {
                            var81.field2845 = var85;
                        }
                        if (var424 == 1423) {
                            var81.field2870 = var85;
                        }
                        if (var424 == 1424) {
                            var81.field2847 = var85;
                        }
                        if (var424 == 1425) {
                            var81.field2767 = var85;
                        }
                        if (var424 == 1426) {
                            var81.field2850 = var85;
                        }
                        if (var424 == 1427) {
                            var81.field2848 = var85;
                        }
                        var81.field2819 = true;
                        continue;
                    }
                    if (var424 < 1600) {
                        class173 var88 = var51 ? Statics.field2727 : Statics.field3148;
                        if (var424 == 1500) {
                            field810[var5++] = var88.field2754;
                            continue;
                        }
                        if (var424 == 1501) {
                            field810[var5++] = var88.field2755;
                            continue;
                        }
                        if (var424 == 1502) {
                            field810[var5++] = var88.field2855;
                            continue;
                        }
                        if (var424 == 1503) {
                            field810[var5++] = var88.field2740;
                            continue;
                        }
                        if (var424 == 1504) {
                            field810[var5++] = var88.field2761 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 1505) {
                            field810[var5++] = var88.field2802;
                            continue;
                        }
                    } else if (var424 < 1700) {
                        class173 var89 = var51 ? Statics.field2727 : Statics.field3148;
                        if (var424 == 1600) {
                            field810[var5++] = var89.field2826;
                            continue;
                        }
                        if (var424 == 1601) {
                            field810[var5++] = var89.field2763;
                            continue;
                        }
                        if (var424 == 1602) {
                            field800[var6++] = var89.field2799;
                            continue;
                        }
                        if (var424 == 1603) {
                            field810[var5++] = var89.field2764;
                            continue;
                        }
                        if (var424 == 1604) {
                            field810[var5++] = var89.field2750;
                            continue;
                        }
                        if (var424 == 1605) {
                            field810[var5++] = var89.field2790;
                            continue;
                        }
                        if (var424 == 1606) {
                            field810[var5++] = var89.field2840;
                            continue;
                        }
                        if (var424 == 1607) {
                            field810[var5++] = var89.field2792;
                            continue;
                        }
                        if (var424 == 1608) {
                            field810[var5++] = var89.field2791;
                            continue;
                        }
                        if (var424 == 1609) {
                            field810[var5++] = var89.field2771;
                            continue;
                        }
                    } else if (var424 < 1800) {
                        class173 var90 = var51 ? Statics.field2727 : Statics.field3148;
                        if (var424 == 1700) {
                            field810[var5++] = var90.field2859;
                            continue;
                        }
                        if (var424 == 1701) {
                            if (var90.field2859 == -1) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var90.field2860;
                            }
                            continue;
                        }
                        if (var424 == 1702) {
                            field810[var5++] = var90.field2742;
                            continue;
                        }
                    } else if (var424 < 1900) {
                        class173 var91 = var51 ? Statics.field2727 : Statics.field3148;
                        if (var424 == 1800) {
                            field810[var5++] = class178.method2575(client.method1035(var91));
                            continue;
                        }
                        if (var424 == 1801) {
                            var5--;
                            int var92 = field810[var5];
                            int var425 = var92 - 1;
                            if (var91.field2732 != null && var425 < var91.field2732.length && var91.field2732[var425] != null) {
                                field800[var6++] = var91.field2732[var425];
                                continue;
                            }
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 1802) {
                            if (var91.field2812 == null) {
                                field800[var6++] = "";
                            } else {
                                field800[var6++] = var91.field2812;
                            }
                            continue;
                        }
                    } else if (var424 >= 1900 && var424 < 2000 || var424 >= 2900 && var424 < 3000) {
                        class173 var93;
                        if (var424 >= 2000) {
                            var424 -= 1000;
                            var5--;
                            var93 = class173.method708(field810[var5]);
                        } else {
                            var93 = var51 ? Statics.field2727 : Statics.field3148;
                        }
                        if (var424 == 1927) {
                            if (field806 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var93.field2848 == null) {
                                return;
                            }
                            class1 var94 = new class1();
                            var94.field3 = var93;
                            var94.field17 = var93.field2848;
                            var94.field11 = field806 + 1;
                            client.field458.method3585(arg0);
                            continue;
                        }
                    } else if (var424 < 2600) {
                        var5--;
                        class173 var95 = class173.method708(field810[var5]);
                        if (var424 == 2500) {
                            field810[var5++] = var95.field2754;
                            continue;
                        }
                        if (var424 == 2501) {
                            field810[var5++] = var95.field2755;
                            continue;
                        }
                        if (var424 == 2502) {
                            field810[var5++] = var95.field2855;
                            continue;
                        }
                        if (var424 == 2503) {
                            field810[var5++] = var95.field2740;
                            continue;
                        }
                        if (var424 == 2504) {
                            field810[var5++] = var95.field2761 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 2505) {
                            field810[var5++] = var95.field2802;
                            continue;
                        }
                    } else if (var424 < 2700) {
                        var5--;
                        class173 var96 = class173.method708(field810[var5]);
                        if (var424 == 2600) {
                            field810[var5++] = var96.field2826;
                            continue;
                        }
                        if (var424 == 2601) {
                            field810[var5++] = var96.field2763;
                            continue;
                        }
                        if (var424 == 2602) {
                            field800[var6++] = var96.field2799;
                            continue;
                        }
                        if (var424 == 2603) {
                            field810[var5++] = var96.field2764;
                            continue;
                        }
                        if (var424 == 2604) {
                            field810[var5++] = var96.field2750;
                            continue;
                        }
                        if (var424 == 2605) {
                            field810[var5++] = var96.field2790;
                            continue;
                        }
                        if (var424 == 2606) {
                            field810[var5++] = var96.field2840;
                            continue;
                        }
                        if (var424 == 2607) {
                            field810[var5++] = var96.field2792;
                            continue;
                        }
                        if (var424 == 2608) {
                            field810[var5++] = var96.field2791;
                            continue;
                        }
                        if (var424 == 2609) {
                            field810[var5++] = var96.field2771;
                            continue;
                        }
                    } else if (var424 < 2800) {
                        if (var424 == 2700) {
                            var5--;
                            class173 var97 = class173.method708(field810[var5]);
                            field810[var5++] = var97.field2859;
                            continue;
                        }
                        if (var424 == 2701) {
                            var5--;
                            class173 var98 = class173.method708(field810[var5]);
                            if (var98.field2859 == -1) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var98.field2860;
                            }
                            continue;
                        }
                        if (var424 == 2702) {
                            var5--;
                            int var99 = field810[var5];
                            class4 var100 = (class4) client.field421.method3521((long) var99);
                            if (var100 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = 1;
                            }
                            continue;
                        }
                        if (var424 == 2706) {
                            field810[var5++] = client.field284;
                            continue;
                        }
                    } else if (var424 < 2900) {
                        var5--;
                        class173 var101 = class173.method708(field810[var5]);
                        if (var424 == 2800) {
                            field810[var5++] = class178.method2575(client.method1035(var101));
                            continue;
                        }
                        if (var424 == 2801) {
                            var5--;
                            int var102 = field810[var5];
                            int var426 = var102 - 1;
                            if (var101.field2732 != null && var426 < var101.field2732.length && var101.field2732[var426] != null) {
                                field800[var6++] = var101.field2732[var426];
                                continue;
                            }
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 2802) {
                            if (var101.field2812 == null) {
                                field800[var6++] = "";
                            } else {
                                field800[var6++] = var101.field2812;
                            }
                            continue;
                        }
                    } else if (var424 < 3200) {
                        if (var424 == 3100) {
                            var6--;
                            String var103 = field800[var6];
                            class12.method156(0, "", var103);
                            continue;
                        }
                        if (var424 == 3101) {
                            var5 -= 2;
                            client.method2980(Statics.field2644, field810[var5], field810[var5 + 1]);
                            continue;
                        }
                        if (var424 == 3103) {
                            client.method705();
                            continue;
                        }
                        if (var424 == 3104) {
                            var6--;
                            String var104 = field800[var6];
                            int var105 = 0;
                            if (class163.method2229(var104)) {
                                int var106 = class163.method47(var104, 10, true);
                                var105 = var106;
                            }
                            client.field317.method2544(3);
                            client.field317.method2484(var105);
                            continue;
                        }
                        if (var424 == 3105) {
                            var6--;
                            String var107 = field800[var6];
                            client.field317.method2544(31);
                            client.field317.method2276(var107.length() + 1);
                            client.field317.method2282(var107);
                            continue;
                        }
                        if (var424 == 3106) {
                            var6--;
                            String var108 = field800[var6];
                            client.field317.method2544(42);
                            client.field317.method2276(var108.length() + 1);
                            client.field317.method2282(var108);
                            continue;
                        }
                        if (var424 == 3107) {
                            var5--;
                            int var109 = field810[var5];
                            var6--;
                            String var110 = field800[var6];
                            int var111 = class33.field754;
                            int[] var112 = class33.field757;
                            boolean var113 = false;
                            for (int var114 = 0; var114 < var111; var114++) {
                                class3 var115 = client.field404[var112[var114]];
                                if (var115 != null && Statics.field2644 != var115 && var115.field35 != null && var115.field35.equalsIgnoreCase(var110)) {
                                    if (var109 == 1) {
                                        client.field317.method2544(9);
                                        client.field317.method2416(var112[var114]);
                                        client.field317.method2315(0);
                                    } else if (var109 == 4) {
                                        client.field317.method2544(43);
                                        client.field317.method2276(0);
                                        client.field317.method2416(var112[var114]);
                                    } else if (var109 == 6) {
                                        client.field317.method2544(183);
                                        client.field317.method2416(var112[var114]);
                                        client.field317.method2316(0);
                                    } else if (var109 == 7) {
                                        client.field317.method2544(110);
                                        client.field317.method2315(0);
                                        client.field317.method2451(var112[var114]);
                                    }
                                    var113 = true;
                                    break;
                                }
                            }
                            if (!var113) {
                                class12.method156(4, "", class157.field2435 + var110);
                            }
                            continue;
                        }
                        if (var424 == 3108) {
                            var5 -= 3;
                            int var116 = field810[var5];
                            int var117 = field810[var5 + 1];
                            int var118 = field810[var5 + 2];
                            class173 var119 = class173.method708(var118);
                            client.method154(var119, var116, var117);
                            continue;
                        }
                        if (var424 == 3109) {
                            var5 -= 2;
                            int var120 = field810[var5];
                            int var121 = field810[var5 + 1];
                            class173 var122 = var51 ? Statics.field2727 : Statics.field3148;
                            client.method154(var122, var120, var121);
                            continue;
                        }
                        if (var424 == 3110) {
                            var5--;
                            Statics.field208 = field810[var5] == 1;
                            continue;
                        }
                        if (var424 == 3111) {
                            field810[var5++] = Statics.field2046.field133 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3112) {
                            var5--;
                            Statics.field2046.field133 = field810[var5] == 1;
                            class9.method1993();
                            continue;
                        }
                        if (var424 == 3113) {
                            var6--;
                            String var123 = field800[var6];
                            var5--;
                            boolean var124 = field810[var5] == 1;
                            class138.method837(var123, var124, false);
                            continue;
                        }
                        if (var424 == 3115) {
                            var5--;
                            int var125 = field810[var5];
                            client.field317.method2544(6);
                            client.field317.method2451(var125);
                            continue;
                        }
                        if (var424 == 3116) {
                            var5--;
                            int var126 = field810[var5];
                            var6 -= 2;
                            String var127 = field800[var6];
                            String var128 = field800[var6 + 1];
                            if (var127.length() <= 500 && var128.length() <= 500) {
                                client.field317.method2544(193);
                                client.field317.method2451(1 + class119.method224(var127) + class119.method224(var128));
                                client.field317.method2282(var127);
                                client.field317.method2282(var128);
                                client.field317.method2400(var126);
                            }
                            continue;
                        }
                    } else if (var424 < 3300) {
                        if (var424 == 3200) {
                            var5 -= 3;
                            int var129 = field810[var5];
                            int var130 = field810[var5 + 1];
                            int var131 = field810[var5 + 2];
                            if (client.field515 != 0 && var130 != 0 && client.field517 < 50) {
                                client.field518[client.field517] = var129;
                                client.field519[client.field517] = var130;
                                client.field520[client.field517] = var131;
                                client.field522[client.field517] = null;
                                client.field282[client.field517] = 0;
                                client.field517++;
                            }
                            continue;
                        }
                        if (var424 == 3201) {
                            var5--;
                            int var132 = field810[var5];
                            if (var132 == -1 && !client.field514) {
                                Statics.field2936.method3366();
                                class183.field2940 = 1;
                                Statics.field2941 = null;
                            } else if (var132 != -1 && client.field462 != var132 && client.field512 != 0 && !client.field514) {
                                class183.method2238(2, Statics.field24, var132, 0, client.field512, false);
                            }
                            client.field462 = var132;
                            continue;
                        }
                        if (var424 == 3202) {
                            var5 -= 2;
                            client.method2003(field810[var5], field810[var5 + 1]);
                            continue;
                        }
                    } else if (var424 < 3400) {
                        if (var424 == 3300) {
                            field810[var5++] = client.field285;
                            continue;
                        }
                        if (var424 == 3301) {
                            var5 -= 2;
                            int var133 = field810[var5];
                            int var134 = field810[var5 + 1];
                            int[] var135 = field810;
                            int var136 = var5++;
                            class16 var137 = (class16) class16.field215.method3521((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = -1;
                            } else if (var134 >= 0 && var134 < var137.field210.length) {
                                var138 = var137.field210[var134];
                            } else {
                                var138 = -1;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var424 == 3302) {
                            var5 -= 2;
                            int var139 = field810[var5];
                            int var140 = field810[var5 + 1];
                            int[] var141 = field810;
                            int var142 = var5++;
                            class16 var143 = (class16) class16.field215.method3521((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field212.length) {
                                var144 = var143.field212[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var424 == 3303) {
                            var5 -= 2;
                            int var145 = field810[var5];
                            int var146 = field810[var5 + 1];
                            field810[var5++] = class16.method2001(var145, var146);
                            continue;
                        }
                        if (var424 == 3304) {
                            var5--;
                            int var147 = field810[var5];
                            field810[var5++] = class51.method555(var147).field1094;
                            continue;
                        }
                        if (var424 == 3305) {
                            var5--;
                            int var148 = field810[var5];
                            field810[var5++] = client.field412[var148];
                            continue;
                        }
                        if (var424 == 3306) {
                            var5--;
                            int var149 = field810[var5];
                            field810[var5++] = client.field413[var149];
                            continue;
                        }
                        if (var424 == 3307) {
                            var5--;
                            int var150 = field810[var5];
                            field810[var5++] = client.field414[var150];
                            continue;
                        }
                        if (var424 == 3308) {
                            int var151 = Statics.field2983;
                            int var152 = (Statics.field2644.field859 >> 7) + Statics.field14;
                            int var153 = (Statics.field2644.field839 >> 7) + Statics.field1436;
                            field810[var5++] = (var151 << 28) + (var152 << 14) + var153;
                            continue;
                        }
                        if (var424 == 3309) {
                            var5--;
                            int var154 = field810[var5];
                            field810[var5++] = var154 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var424 == 3310) {
                            var5--;
                            int var155 = field810[var5];
                            field810[var5++] = var155 >> 28;
                            continue;
                        }
                        if (var424 == 3311) {
                            var5--;
                            int var156 = field810[var5];
                            field810[var5++] = var156 & 0x3FFF;
                            continue;
                        }
                        if (var424 == 3312) {
                            field810[var5++] = client.field454 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3313) {
                            var5 -= 2;
                            int var157 = field810[var5] + 32768;
                            int var158 = field810[var5 + 1];
                            int[] var159 = field810;
                            int var160 = var5++;
                            class16 var161 = (class16) class16.field215.method3521((long) var157);
                            int var162;
                            if (var161 == null) {
                                var162 = -1;
                            } else if (var158 >= 0 && var158 < var161.field210.length) {
                                var162 = var161.field210[var158];
                            } else {
                                var162 = -1;
                            }
                            var159[var160] = var162;
                            continue;
                        }
                        if (var424 == 3314) {
                            var5 -= 2;
                            int var163 = field810[var5] + 32768;
                            int var164 = field810[var5 + 1];
                            int[] var165 = field810;
                            int var166 = var5++;
                            class16 var167 = (class16) class16.field215.method3521((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 >= 0 && var164 < var167.field212.length) {
                                var168 = var167.field212[var164];
                            } else {
                                var168 = 0;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var424 == 3315) {
                            var5 -= 2;
                            int var169 = field810[var5] + 32768;
                            int var170 = field810[var5 + 1];
                            field810[var5++] = class16.method2001(var169, var170);
                            continue;
                        }
                        if (var424 == 3316) {
                            if (client.field442 >= 2) {
                                field810[var5++] = client.field442;
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                        if (var424 == 3317) {
                            field810[var5++] = client.field300;
                            continue;
                        }
                        if (var424 == 3318) {
                            field810[var5++] = client.field273;
                            continue;
                        }
                        if (var424 == 3321) {
                            field810[var5++] = client.field440;
                            continue;
                        }
                        if (var424 == 3322) {
                            field810[var5++] = client.field441;
                            continue;
                        }
                        if (var424 == 3323) {
                            if (client.field437) {
                                field810[var5++] = 1;
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                        if (var424 == 3324) {
                            field810[var5++] = client.field486;
                            continue;
                        }
                    } else if (var424 < 3500) {
                        if (var424 == 3400) {
                            var5 -= 2;
                            int var171 = field810[var5];
                            int var172 = field810[var5 + 1];
                            class49 var173 = class49.method2168(var171);
                            if (var173.field1075 != 's') {
                            }
                            for (int var174 = 0; var174 < var173.field1078; var174++) {
                                if (var173.field1074[var174] == var172) {
                                    field800[var6++] = var173.field1079[var174];
                                    var173 = null;
                                    break;
                                }
                            }
                            if (var173 != null) {
                                field800[var6++] = var173.field1076;
                            }
                            continue;
                        }
                        if (var424 == 3408) {
                            var5 -= 4;
                            int var175 = field810[var5];
                            int var176 = field810[var5 + 1];
                            int var177 = field810[var5 + 2];
                            int var178 = field810[var5 + 3];
                            class49 var179 = class49.method2168(var177);
                            if (var179.field1082 == var175 && var179.field1075 == var176) {
                                for (int var180 = 0; var180 < var179.field1078; var180++) {
                                    if (var179.field1074[var180] == var178) {
                                        if (var176 == 115) {
                                            field800[var6++] = var179.field1079[var180];
                                        } else {
                                            field810[var5++] = var179.field1080[var180];
                                        }
                                        var179 = null;
                                        break;
                                    }
                                }
                                if (var179 != null) {
                                    if (var176 == 115) {
                                        field800[var6++] = var179.field1076;
                                    } else {
                                        field810[var5++] = var179.field1077;
                                    }
                                }
                                continue;
                            }
                            if (var176 == 115) {
                                field800[var6++] = "null";
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var424 < 3700) {
                        if (var424 == 3600) {
                            if (client.field543 == 0) {
                                field810[var5++] = -2;
                            } else if (client.field543 == 1) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = client.field335;
                            }
                            continue;
                        }
                        if (var424 == 3601) {
                            var5--;
                            int var181 = field810[var5];
                            if (client.field543 == 2 && var181 < client.field335) {
                                field800[var6++] = client.field544[var181].field237;
                                field800[var6++] = client.field544[var181].field241;
                                continue;
                            }
                            field800[var6++] = "";
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 3602) {
                            var5--;
                            int var182 = field810[var5];
                            if (client.field543 == 2 && var182 < client.field335) {
                                field810[var5++] = client.field544[var182].field238;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3603) {
                            var5--;
                            int var183 = field810[var5];
                            if (client.field543 == 2 && var183 < client.field335) {
                                field810[var5++] = client.field544[var183].field236;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3604) {
                            var6--;
                            String var184 = field800[var6];
                            var5--;
                            int var185 = field810[var5];
                            client.method685(var184, var185);
                            continue;
                        }
                        if (var424 == 3605) {
                            var6--;
                            String var186 = field800[var6];
                            client.method1992(var186);
                            continue;
                        }
                        if (var424 == 3606) {
                            var6--;
                            String var187 = field800[var6];
                            if (var187 == null) {
                                continue;
                            }
                            String var188 = Statics.method716(var187, Statics.field1742);
                            if (var188 == null) {
                                continue;
                            }
                            int var189 = 0;
                            while (true) {
                                if (var189 >= client.field335) {
                                    continue label3054;
                                }
                                class18 var190 = client.field544[var189];
                                String var191 = var190.field237;
                                String var192 = Statics.method716(var191, Statics.field1742);
                                if (class129.method641(var187, var188, var191, var192)) {
                                    client.field335--;
                                    for (int var193 = var189; var193 < client.field335; var193++) {
                                        client.field544[var193] = client.field544[var193 + 1];
                                    }
                                    client.field324 = client.field460;
                                    client.field317.method2544(58);
                                    client.field317.method2276(class119.method224(var187));
                                    client.field317.method2282(var187);
                                    continue label3054;
                                }
                                var189++;
                            }
                        }
                        if (var424 == 3607) {
                            var6--;
                            String var194 = field800[var6];
                            client.method2004(var194, false);
                            continue;
                        }
                        if (var424 == 3608) {
                            var6--;
                            String var195 = field800[var6];
                            client.method107(var195);
                            continue;
                        }
                        if (var424 == 3609) {
                            var6--;
                            String var196 = field800[var6];
                            class152[] var197 = new class152[] { class152.field2237, class152.field2234, class152.field2236, class152.field2242, class152.field2235 };
                            class152[] var198 = var197;
                            for (int var199 = 0; var199 < var198.length; var199++) {
                                class152 var200 = var198[var199];
                                if (var200.field2239 != -1 && var196.startsWith(class2.method2000(var200.field2239))) {
                                    var196 = var196.substring(6 + Integer.toString(var200.field2239).length());
                                    break;
                                }
                            }
                            field810[var5++] = client.method983(var196, false) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3611) {
                            if (client.field502 == null) {
                                field800[var6++] = "";
                            } else {
                                field800[var6++] = class162.method2600(client.field502);
                            }
                            continue;
                        }
                        if (var424 == 3612) {
                            if (client.field502 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = Statics.field91;
                            }
                            continue;
                        }
                        if (var424 == 3613) {
                            var5--;
                            int var201 = field810[var5];
                            if (client.field502 != null && var201 < Statics.field91) {
                                field800[var6++] = Statics.field209[var201].field617;
                                continue;
                            }
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 3614) {
                            var5--;
                            int var202 = field810[var5];
                            if (client.field502 != null && var202 < Statics.field91) {
                                field810[var5++] = Statics.field209[var202].field619;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3615) {
                            var5--;
                            int var203 = field810[var5];
                            if (client.field502 != null && var203 < Statics.field91) {
                                field810[var5++] = Statics.field209[var203].field621;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3616) {
                            field810[var5++] = Statics.field159;
                            continue;
                        }
                        if (var424 == 3617) {
                            var6--;
                            String var204 = field800[var6];
                            client.method187(var204);
                            continue;
                        }
                        if (var424 == 3618) {
                            field810[var5++] = Statics.field1930;
                            continue;
                        }
                        if (var424 == 3619) {
                            var6--;
                            String var205 = field800[var6];
                            if (!var205.equals("")) {
                                client.field317.method2544(57);
                                client.field317.method2276(class119.method224(var205));
                                client.field317.method2282(var205);
                            }
                            continue;
                        }
                        if (var424 == 3620) {
                            client.field317.method2544(57);
                            client.field317.method2276(0);
                            continue;
                        }
                        if (var424 == 3621) {
                            if (client.field543 == 0) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = client.field274;
                            }
                            continue;
                        }
                        if (var424 == 3622) {
                            var5--;
                            int var206 = field810[var5];
                            if (client.field543 != 0 && var206 < client.field274) {
                                field800[var6++] = client.field547[var206].field124;
                                field800[var6++] = client.field547[var206].field129;
                                continue;
                            }
                            field800[var6++] = "";
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 3623) {
                            var6--;
                            String var207 = field800[var6];
                            if (var207.startsWith(class2.method2000(0)) || var207.startsWith(class2.method2000(1))) {
                                var207 = var207.substring(7);
                            }
                            field810[var5++] = client.method109(var207) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3624) {
                            var5--;
                            int var208 = field810[var5];
                            if (Statics.field209 != null && var208 < Statics.field91 && Statics.field209[var208].field617.equalsIgnoreCase(Statics.field2644.field35)) {
                                field810[var5++] = 1;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3625) {
                            if (client.field503 == null) {
                                field800[var6++] = "";
                            } else {
                                field800[var6++] = class162.method2600(client.field503);
                            }
                            continue;
                        }
                    } else if (var424 < 4000) {
                        if (var424 == 3903) {
                            var5--;
                            int var209 = field810[var5];
                            field810[var5++] = client.field524[var209].method3709();
                            continue;
                        }
                        if (var424 == 3904) {
                            var5--;
                            int var210 = field810[var5];
                            field810[var5++] = client.field524[var210].field3143;
                            continue;
                        }
                        if (var424 == 3905) {
                            var5--;
                            int var211 = field810[var5];
                            field810[var5++] = client.field524[var211].field3144;
                            continue;
                        }
                        if (var424 == 3906) {
                            var5--;
                            int var212 = field810[var5];
                            field810[var5++] = client.field524[var212].field3145;
                            continue;
                        }
                        if (var424 == 3907) {
                            var5--;
                            int var213 = field810[var5];
                            field810[var5++] = client.field524[var213].field3142;
                            continue;
                        }
                        if (var424 == 3908) {
                            var5--;
                            int var214 = field810[var5];
                            field810[var5++] = client.field524[var214].field3149;
                            continue;
                        }
                        if (var424 == 3910) {
                            var5--;
                            int var215 = field810[var5];
                            int var216 = client.field524[var215].method3722();
                            field810[var5++] = var216 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3911) {
                            var5--;
                            int var217 = field810[var5];
                            int var218 = client.field524[var217].method3722();
                            field810[var5++] = var218 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3912) {
                            var5--;
                            int var219 = field810[var5];
                            int var220 = client.field524[var219].method3722();
                            field810[var5++] = var220 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3913) {
                            var5--;
                            int var221 = field810[var5];
                            int var222 = client.field524[var221].method3722();
                            field810[var5++] = var222 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3914) {
                            var5--;
                            boolean var223 = field810[var5] == 1;
                            if (Statics.field2645 != null) {
                                Statics.field2645.method3724(class221.field3153, var223);
                            }
                            continue;
                        }
                        if (var424 == 3915) {
                            var5--;
                            boolean var224 = field810[var5] == 1;
                            if (Statics.field2645 != null) {
                                Statics.field2645.method3724(class221.field3152, var224);
                            }
                            continue;
                        }
                        if (var424 == 3916) {
                            var5 -= 2;
                            boolean var225 = field810[var5] == 1;
                            boolean var226 = field810[var5 + 1] == 1;
                            if (Statics.field2645 != null) {
                                Statics.field2645.method3724(new class22(var226), var225);
                            }
                            continue;
                        }
                        if (var424 == 3917) {
                            var5--;
                            boolean var227 = field810[var5] == 1;
                            if (Statics.field2645 != null) {
                                Statics.field2645.method3724(class221.field3156, var227);
                            }
                            continue;
                        }
                        if (var424 == 3918) {
                            var5--;
                            boolean var228 = field810[var5] == 1;
                            if (Statics.field2645 != null) {
                                Statics.field2645.method3724(class221.field3154, var228);
                            }
                            continue;
                        }
                        if (var424 == 3919) {
                            field810[var5++] = Statics.field2645 == null ? 0 : Statics.field2645.field3150.size();
                            continue;
                        }
                        if (var424 == 3920) {
                            var5--;
                            int var229 = field810[var5];
                            class214 var230 = (class214) Statics.field2645.field3150.get(var229);
                            field810[var5++] = var230.field3123;
                            continue;
                        }
                        if (var424 == 3921) {
                            var5--;
                            int var231 = field810[var5];
                            class214 var232 = (class214) Statics.field2645.field3150.get(var231);
                            field800[var6++] = var232.method3680();
                            continue;
                        }
                        if (var424 == 3922) {
                            var5--;
                            int var233 = field810[var5];
                            class214 var234 = (class214) Statics.field2645.field3150.get(var233);
                            field800[var6++] = var234.method3684();
                            continue;
                        }
                        if (var424 == 3923) {
                            var5--;
                            int var235 = field810[var5];
                            class214 var236 = (class214) Statics.field2645.field3150.get(var235);
                            long var237 = class115.method2622() - Statics.field200 - var236.field3124;
                            int var239 = (int) (var237 / 3600000L);
                            int var240 = (int) ((var237 - (long) (var239 * 3600000)) / 60000L);
                            int var241 = (int) ((var237 - (long) (var239 * 3600000) - (long) (var240 * 60000)) / 1000L);
                            String var242 = var239 + ":" + var240 / 10 + var240 % 10 + ":" + var241 / 10 + var241 % 10;
                            field800[var6++] = var242;
                            continue;
                        }
                        if (var424 == 3924) {
                            var5--;
                            int var243 = field810[var5];
                            class214 var244 = (class214) Statics.field2645.field3150.get(var243);
                            field810[var5++] = var244.field3125.field3145;
                            continue;
                        }
                        if (var424 == 3925) {
                            var5--;
                            int var245 = field810[var5];
                            class214 var246 = (class214) Statics.field2645.field3150.get(var245);
                            field810[var5++] = var246.field3125.field3144;
                            continue;
                        }
                        if (var424 == 3926) {
                            var5--;
                            int var247 = field810[var5];
                            class214 var248 = (class214) Statics.field2645.field3150.get(var247);
                            field810[var5++] = var248.field3125.field3143;
                            continue;
                        }
                    } else if (var424 < 4100) {
                        if (var424 == 4000) {
                            var5 -= 2;
                            int var249 = field810[var5];
                            int var250 = field810[var5 + 1];
                            field810[var5++] = var249 + var250;
                            continue;
                        }
                        if (var424 == 4001) {
                            var5 -= 2;
                            int var251 = field810[var5];
                            int var252 = field810[var5 + 1];
                            field810[var5++] = var251 - var252;
                            continue;
                        }
                        if (var424 == 4002) {
                            var5 -= 2;
                            int var253 = field810[var5];
                            int var254 = field810[var5 + 1];
                            field810[var5++] = var253 * var254;
                            continue;
                        }
                        if (var424 == 4003) {
                            var5 -= 2;
                            int var255 = field810[var5];
                            int var256 = field810[var5 + 1];
                            field810[var5++] = var255 / var256;
                            continue;
                        }
                        if (var424 == 4004) {
                            var5--;
                            int var257 = field810[var5];
                            field810[var5++] = (int) (Math.random() * (double) var257);
                            continue;
                        }
                        if (var424 == 4005) {
                            var5--;
                            int var258 = field810[var5];
                            field810[var5++] = (int) (Math.random() * (double) (var258 + 1));
                            continue;
                        }
                        if (var424 == 4006) {
                            var5 -= 5;
                            int var259 = field810[var5];
                            int var260 = field810[var5 + 1];
                            int var261 = field810[var5 + 2];
                            int var262 = field810[var5 + 3];
                            int var263 = field810[var5 + 4];
                            field810[var5++] = (var260 - var259) * (var263 - var261) / (var262 - var261) + var259;
                            continue;
                        }
                        if (var424 == 4007) {
                            var5 -= 2;
                            int var264 = field810[var5];
                            int var265 = field810[var5 + 1];
                            field810[var5++] = var264 * var265 / 100 + var264;
                            continue;
                        }
                        if (var424 == 4008) {
                            var5 -= 2;
                            int var266 = field810[var5];
                            int var267 = field810[var5 + 1];
                            field810[var5++] = var266 | 0x1 << var267;
                            continue;
                        }
                        if (var424 == 4009) {
                            var5 -= 2;
                            int var268 = field810[var5];
                            int var269 = field810[var5 + 1];
                            field810[var5++] = var268 & -1 - (0x1 << var269);
                            continue;
                        }
                        if (var424 == 4010) {
                            var5 -= 2;
                            int var270 = field810[var5];
                            int var271 = field810[var5 + 1];
                            field810[var5++] = (var270 & 0x1 << var271) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var424 == 4011) {
                            var5 -= 2;
                            int var272 = field810[var5];
                            int var273 = field810[var5 + 1];
                            field810[var5++] = var272 % var273;
                            continue;
                        }
                        if (var424 == 4012) {
                            var5 -= 2;
                            int var274 = field810[var5];
                            int var275 = field810[var5 + 1];
                            if (var274 == 0) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = (int) Math.pow((double) var274, (double) var275);
                            }
                            continue;
                        }
                        if (var424 == 4013) {
                            var5 -= 2;
                            int var276 = field810[var5];
                            int var277 = field810[var5 + 1];
                            if (var276 == 0) {
                                field810[var5++] = 0;
                            } else if (var277 == 0) {
                                field810[var5++] = Integer.MAX_VALUE;
                            } else {
                                field810[var5++] = (int) Math.pow((double) var276, 1.0D / (double) var277);
                            }
                            continue;
                        }
                        if (var424 == 4014) {
                            var5 -= 2;
                            int var278 = field810[var5];
                            int var279 = field810[var5 + 1];
                            field810[var5++] = var278 & var279;
                            continue;
                        }
                        if (var424 == 4015) {
                            var5 -= 2;
                            int var280 = field810[var5];
                            int var281 = field810[var5 + 1];
                            field810[var5++] = var280 | var281;
                            continue;
                        }
                    } else if (var424 < 4200) {
                        if (var424 == 4100) {
                            var6--;
                            String var282 = field800[var6];
                            var5--;
                            int var283 = field810[var5];
                            field800[var6++] = var282 + var283;
                            continue;
                        }
                        if (var424 == 4101) {
                            var6 -= 2;
                            String var284 = field800[var6];
                            String var285 = field800[var6 + 1];
                            field800[var6++] = var284 + var285;
                            continue;
                        }
                        if (var424 == 4102) {
                            var6--;
                            String var286 = field800[var6];
                            var5--;
                            int var287 = field810[var5];
                            field800[var6++] = var286 + class163.method2919(var287, true);
                            continue;
                        }
                        if (var424 == 4103) {
                            var6--;
                            String var288 = field800[var6];
                            field800[var6++] = var288.toLowerCase();
                            continue;
                        }
                        if (var424 == 4104) {
                            var5--;
                            int var289 = field810[var5];
                            long var290 = ((long) var289 + 11745L) * 86400000L;
                            field804.setTime(new Date(var290));
                            int var292 = field804.get(5);
                            int var293 = field804.get(2);
                            int var294 = field804.get(1);
                            field800[var6++] = var292 + "-" + field805[var293] + "-" + var294;
                            continue;
                        }
                        if (var424 == 4105) {
                            var6 -= 2;
                            String var295 = field800[var6];
                            String var296 = field800[var6 + 1];
                            if (Statics.field2644.field43 != null && Statics.field2644.field43.field2900) {
                                field800[var6++] = var296;
                                continue;
                            }
                            field800[var6++] = var295;
                            continue;
                        }
                        if (var424 == 4106) {
                            var5--;
                            int var297 = field810[var5];
                            field800[var6++] = Integer.toString(var297);
                            continue;
                        }
                        if (var424 == 4107) {
                            var6 -= 2;
                            int[] var298 = field810;
                            int var299 = var5++;
                            int var300 = class166.method3477(field800[var6], field800[var6 + 1], client.field279);
                            byte var301;
                            if (var300 > 0) {
                                var301 = 1;
                            } else if (var300 < 0) {
                                var301 = -1;
                            } else {
                                var301 = 0;
                            }
                            var298[var299] = var301;
                            continue;
                        }
                        if (var424 == 4108) {
                            var6--;
                            String var302 = field800[var6];
                            var5 -= 2;
                            int var303 = field810[var5];
                            int var304 = field810[var5 + 1];
                            byte[] var305 = Statics.field128.method2994(var304, 0);
                            class224 var306 = new class224(var305);
                            field810[var5++] = var306.method3735(var302, var303);
                            continue;
                        }
                        if (var424 == 4109) {
                            var6--;
                            String var307 = field800[var6];
                            var5 -= 2;
                            int var308 = field810[var5];
                            int var309 = field810[var5 + 1];
                            byte[] var310 = Statics.field128.method2994(var309, 0);
                            class224 var311 = new class224(var310);
                            field810[var5++] = var311.method3734(var307, var308);
                            continue;
                        }
                        if (var424 == 4110) {
                            var6 -= 2;
                            String var312 = field800[var6];
                            String var313 = field800[var6 + 1];
                            var5--;
                            if (field810[var5] == 1) {
                                field800[var6++] = var312;
                            } else {
                                field800[var6++] = var313;
                            }
                            continue;
                        }
                        if (var424 == 4111) {
                            var6--;
                            String var314 = field800[var6];
                            field800[var6++] = class223.method3736(var314);
                            continue;
                        }
                        if (var424 == 4112) {
                            var6--;
                            String var315 = field800[var6];
                            var5--;
                            int var316 = field810[var5];
                            field800[var6++] = var315 + (char) var316;
                            continue;
                        }
                        if (var424 == 4113) {
                            var5--;
                            int var317 = field810[var5];
                            field810[var5++] = class163.method2231((char) var317) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4114) {
                            var5--;
                            int var318 = field810[var5];
                            int[] var319 = field810;
                            int var320 = var5++;
                            char var321 = (char) var318;
                            boolean var322 = var321 >= '0' && var321 <= '9' || var321 >= 'A' && var321 <= 'Z' || var321 >= 'a' && var321 <= 'z';
                            var319[var320] = var322 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4115) {
                            var5--;
                            int var323 = field810[var5];
                            field810[var5++] = class163.method2080((char) var323) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4116) {
                            var5--;
                            int var324 = field810[var5];
                            int[] var325 = field810;
                            int var326 = var5++;
                            char var327 = (char) var324;
                            boolean var328 = var327 >= '0' && var327 <= '9';
                            var325[var326] = var328 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4117) {
                            var6--;
                            String var329 = field800[var6];
                            if (var329 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var329.length();
                            }
                            continue;
                        }
                        if (var424 == 4118) {
                            var6--;
                            String var330 = field800[var6];
                            var5 -= 2;
                            int var331 = field810[var5];
                            int var332 = field810[var5 + 1];
                            field800[var6++] = var330.substring(var331, var332);
                            continue;
                        }
                        if (var424 == 4119) {
                            var6--;
                            String var333 = field800[var6];
                            StringBuilder var334 = new StringBuilder(var333.length());
                            boolean var335 = false;
                            for (int var336 = 0; var336 < var333.length(); var336++) {
                                char var337 = var333.charAt(var336);
                                if (var337 == '<') {
                                    var335 = true;
                                } else if (var337 == '>') {
                                    var335 = false;
                                } else if (!var335) {
                                    var334.append(var337);
                                }
                            }
                            field800[var6++] = var334.toString();
                            continue;
                        }
                        if (var424 == 4120) {
                            var6--;
                            String var338 = field800[var6];
                            var5--;
                            int var339 = field810[var5];
                            field810[var5++] = var338.indexOf(var339);
                            continue;
                        }
                        if (var424 == 4121) {
                            var6 -= 2;
                            String var340 = field800[var6];
                            String var341 = field800[var6 + 1];
                            var5--;
                            int var342 = field810[var5];
                            field810[var5++] = var340.indexOf(var341, var342);
                            continue;
                        }
                    } else if (var424 < 4300) {
                        if (var424 == 4200) {
                            var5--;
                            int var343 = field810[var5];
                            field800[var6++] = class52.method971(var343).field1145;
                            continue;
                        }
                        if (var424 == 4201) {
                            var5 -= 2;
                            int var344 = field810[var5];
                            int var345 = field810[var5 + 1];
                            class52 var346 = class52.method971(var344);
                            if (var345 >= 1 && var345 <= 5 && var346.field1124[var345 - 1] != null) {
                                field800[var6++] = var346.field1124[var345 - 1];
                                continue;
                            }
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 4202) {
                            var5 -= 2;
                            int var347 = field810[var5];
                            int var348 = field810[var5 + 1];
                            class52 var349 = class52.method971(var347);
                            if (var348 >= 1 && var348 <= 5 && var349.field1128[var348 - 1] != null) {
                                field800[var6++] = var349.field1128[var348 - 1];
                                continue;
                            }
                            field800[var6++] = "";
                            continue;
                        }
                        if (var424 == 4203) {
                            var5--;
                            int var350 = field810[var5];
                            field810[var5++] = class52.method971(var350).field1125;
                            continue;
                        }
                        if (var424 == 4204) {
                            var5--;
                            int var351 = field810[var5];
                            field810[var5++] = class52.method971(var351).field1121 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4205) {
                            var5--;
                            int var352 = field810[var5];
                            class52 var353 = class52.method971(var352);
                            if (var353.field1144 == -1 && var353.field1143 >= 0) {
                                field810[var5++] = var353.field1143;
                                continue;
                            }
                            field810[var5++] = var352;
                            continue;
                        }
                        if (var424 == 4206) {
                            var5--;
                            int var354 = field810[var5];
                            class52 var355 = class52.method971(var354);
                            if (var355.field1144 >= 0 && var355.field1143 >= 0) {
                                field810[var5++] = var355.field1143;
                                continue;
                            }
                            field810[var5++] = var354;
                            continue;
                        }
                        if (var424 == 4207) {
                            var5--;
                            int var356 = field810[var5];
                            field810[var5++] = class52.method971(var356).field1130 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4210) {
                            var6--;
                            String var357 = field800[var6];
                            var5--;
                            int var358 = field810[var5];
                            client.method2769(var357, var358 == 1);
                            field810[var5++] = Statics.field1762;
                            continue;
                        }
                        if (var424 == 4211) {
                            if (Statics.field883 != null && Statics.field1964 < Statics.field1762) {
                                field810[var5++] = Statics.field883[++Statics.field1964 - 1] & 0xFFFF;
                                continue;
                            }
                            field810[var5++] = -1;
                            continue;
                        }
                        if (var424 == 4212) {
                            Statics.field1964 = 0;
                            continue;
                        }
                    } else if (var424 < 5100) {
                        if (var424 == 5000) {
                            field810[var5++] = client.field328;
                            continue;
                        }
                        if (var424 == 5001) {
                            var5 -= 3;
                            client.field328 = field810[var5];
                            Statics.field624 = class130.method2896(field810[var5 + 1]);
                            if (Statics.field624 == null) {
                                Statics.field624 = class130.field2026;
                            }
                            client.field280 = field810[var5 + 2];
                            client.field317.method2544(236);
                            client.field317.method2276(client.field328);
                            client.field317.method2276(Statics.field624.field2028);
                            client.field317.method2276(client.field280);
                            continue;
                        }
                        if (var424 == 5002) {
                            var6--;
                            String var359 = field800[var6];
                            var5 -= 2;
                            int var360 = field810[var5];
                            int var361 = field810[var5 + 1];
                            client.field317.method2544(84);
                            client.field317.method2276(class119.method224(var359) + 2);
                            client.field317.method2282(var359);
                            client.field317.method2276(var360 - 1);
                            client.field317.method2276(var361);
                            continue;
                        }
                        if (var424 == 5003) {
                            var5 -= 2;
                            int var362 = field810[var5];
                            int var363 = field810[var5 + 1];
                            class36 var364 = class12.method1895(var362, var363);
                            if (var364 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                                field800[var6++] = "";
                                field800[var6++] = "";
                            } else {
                                field810[var5++] = var364.field792;
                                field810[var5++] = var364.field783;
                                field800[var6++] = var364.field786 == null ? "" : var364.field786;
                                field800[var6++] = var364.field795 == null ? "" : var364.field795;
                                field800[var6++] = var364.field788 == null ? "" : var364.field788;
                            }
                            continue;
                        }
                        if (var424 == 5004) {
                            var5--;
                            int var365 = field810[var5];
                            class36 var366 = (class36) class12.field171.method3548((long) var365);
                            if (var366 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                                field800[var6++] = "";
                                field800[var6++] = "";
                            } else {
                                field810[var5++] = var366.field785;
                                field810[var5++] = var366.field783;
                                field800[var6++] = var366.field786 == null ? "" : var366.field786;
                                field800[var6++] = var366.field795 == null ? "" : var366.field795;
                                field800[var6++] = var366.field788 == null ? "" : var366.field788;
                            }
                            continue;
                        }
                        if (var424 == 5005) {
                            if (Statics.field624 == null) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = Statics.field624.field2028;
                            }
                            continue;
                        }
                        if (var424 == 5008) {
                            var6--;
                            String var368 = field800[var6];
                            var5--;
                            int var369 = field810[var5];
                            String var370 = var368.toLowerCase();
                            byte var371 = 0;
                            if (var370.startsWith(class157.field2462)) {
                                var371 = 0;
                                var368 = var368.substring(class157.field2462.length());
                            } else if (var370.startsWith(class157.field2479)) {
                                var371 = 1;
                                var368 = var368.substring(class157.field2479.length());
                            } else if (var370.startsWith(class157.field2398)) {
                                var371 = 2;
                                var368 = var368.substring(class157.field2398.length());
                            } else if (var370.startsWith(class157.field2468)) {
                                var371 = 3;
                                var368 = var368.substring(class157.field2468.length());
                            } else if (var370.startsWith(class157.field2470)) {
                                var371 = 4;
                                var368 = var368.substring(class157.field2470.length());
                            } else if (var370.startsWith(class157.field2335)) {
                                var371 = 5;
                                var368 = var368.substring(class157.field2335.length());
                            } else if (var370.startsWith(class157.field2474)) {
                                var371 = 6;
                                var368 = var368.substring(class157.field2474.length());
                            } else if (var370.startsWith(class157.field2476)) {
                                var371 = 7;
                                var368 = var368.substring(class157.field2476.length());
                            } else if (var370.startsWith(class157.field2478)) {
                                var371 = 8;
                                var368 = var368.substring(class157.field2478.length());
                            } else if (var370.startsWith(class157.field2285)) {
                                var371 = 9;
                                var368 = var368.substring(class157.field2285.length());
                            } else if (var370.startsWith(class157.field2545)) {
                                var371 = 10;
                                var368 = var368.substring(class157.field2545.length());
                            } else if (var370.startsWith(class157.field2484)) {
                                var371 = 11;
                                var368 = var368.substring(class157.field2484.length());
                            } else if (client.field279 != 0) {
                                if (var370.startsWith(class157.field2463)) {
                                    var371 = 0;
                                    var368 = var368.substring(class157.field2463.length());
                                } else if (var370.startsWith(class157.field2465)) {
                                    var371 = 1;
                                    var368 = var368.substring(class157.field2465.length());
                                } else if (var370.startsWith(class157.field2349)) {
                                    var371 = 2;
                                    var368 = var368.substring(class157.field2349.length());
                                } else if (var370.startsWith(class157.field2506)) {
                                    var371 = 3;
                                    var368 = var368.substring(class157.field2506.length());
                                } else if (var370.startsWith(class157.field2322)) {
                                    var371 = 4;
                                    var368 = var368.substring(class157.field2322.length());
                                } else if (var370.startsWith(class157.field2473)) {
                                    var371 = 5;
                                    var368 = var368.substring(class157.field2473.length());
                                } else if (var370.startsWith(class157.field2475)) {
                                    var371 = 6;
                                    var368 = var368.substring(class157.field2475.length());
                                } else if (var370.startsWith(class157.field2477)) {
                                    var371 = 7;
                                    var368 = var368.substring(class157.field2477.length());
                                } else if (var370.startsWith(class157.field2423)) {
                                    var371 = 8;
                                    var368 = var368.substring(class157.field2423.length());
                                } else if (var370.startsWith(class157.field2481)) {
                                    var371 = 9;
                                    var368 = var368.substring(class157.field2481.length());
                                } else if (var370.startsWith(class157.field2483)) {
                                    var371 = 10;
                                    var368 = var368.substring(class157.field2483.length());
                                } else if (var370.startsWith(class157.field2485)) {
                                    var371 = 11;
                                    var368 = var368.substring(class157.field2485.length());
                                }
                            }
                            String var372 = var368.toLowerCase();
                            byte var373 = 0;
                            if (var372.startsWith(class157.field2486)) {
                                var373 = 1;
                                var368 = var368.substring(class157.field2486.length());
                            } else if (var372.startsWith(class157.field2488)) {
                                var373 = 2;
                                var368 = var368.substring(class157.field2488.length());
                            } else if (var372.startsWith(class157.field2490)) {
                                var373 = 3;
                                var368 = var368.substring(class157.field2490.length());
                            } else if (var372.startsWith(class157.field2492)) {
                                var373 = 4;
                                var368 = var368.substring(class157.field2492.length());
                            } else if (var372.startsWith(class157.field2447)) {
                                var373 = 5;
                                var368 = var368.substring(class157.field2447.length());
                            } else if (client.field279 != 0) {
                                if (var372.startsWith(class157.field2555)) {
                                    var373 = 1;
                                    var368 = var368.substring(class157.field2555.length());
                                } else if (var372.startsWith(class157.field2489)) {
                                    var373 = 2;
                                    var368 = var368.substring(class157.field2489.length());
                                } else if (var372.startsWith(class157.field2302)) {
                                    var373 = 3;
                                    var368 = var368.substring(class157.field2302.length());
                                } else if (var372.startsWith(class157.field2493)) {
                                    var373 = 4;
                                    var368 = var368.substring(class157.field2493.length());
                                } else if (var372.startsWith(class157.field2495)) {
                                    var373 = 5;
                                    var368 = var368.substring(class157.field2495.length());
                                }
                            }
                            client.field317.method2544(89);
                            client.field317.method2276(0);
                            int var374 = client.field317.field1955;
                            client.field317.method2276(var369);
                            client.field317.method2276(var371);
                            client.field317.method2276(var373);
                            class122 var375 = client.field317;
                            int var376 = var375.field1955;
                            int var377 = var368.length();
                            byte[] var378 = new byte[var377];
                            for (int var379 = 0; var379 < var377; var379++) {
                                char var380 = var368.charAt(var379);
                                if (var380 > 0 && var380 < 128 || var380 >= 160 && var380 <= 255) {
                                    var378[var379] = (byte) var380;
                                } else if (var380 == 8364) {
                                    var378[var379] = -128;
                                } else if (var380 == 8218) {
                                    var378[var379] = -126;
                                } else if (var380 == 402) {
                                    var378[var379] = -125;
                                } else if (var380 == 8222) {
                                    var378[var379] = -124;
                                } else if (var380 == 8230) {
                                    var378[var379] = -123;
                                } else if (var380 == 8224) {
                                    var378[var379] = -122;
                                } else if (var380 == 8225) {
                                    var378[var379] = -121;
                                } else if (var380 == 710) {
                                    var378[var379] = -120;
                                } else if (var380 == 8240) {
                                    var378[var379] = -119;
                                } else if (var380 == 352) {
                                    var378[var379] = -118;
                                } else if (var380 == 8249) {
                                    var378[var379] = -117;
                                } else if (var380 == 338) {
                                    var378[var379] = -116;
                                } else if (var380 == 381) {
                                    var378[var379] = -114;
                                } else if (var380 == 8216) {
                                    var378[var379] = -111;
                                } else if (var380 == 8217) {
                                    var378[var379] = -110;
                                } else if (var380 == 8220) {
                                    var378[var379] = -109;
                                } else if (var380 == 8221) {
                                    var378[var379] = -108;
                                } else if (var380 == 8226) {
                                    var378[var379] = -107;
                                } else if (var380 == 8211) {
                                    var378[var379] = -106;
                                } else if (var380 == 8212) {
                                    var378[var379] = -105;
                                } else if (var380 == 732) {
                                    var378[var379] = -104;
                                } else if (var380 == 8482) {
                                    var378[var379] = -103;
                                } else if (var380 == 353) {
                                    var378[var379] = -102;
                                } else if (var380 == 8250) {
                                    var378[var379] = -101;
                                } else if (var380 == 339) {
                                    var378[var379] = -100;
                                } else if (var380 == 382) {
                                    var378[var379] = -98;
                                } else if (var380 == 376) {
                                    var378[var379] = -97;
                                } else {
                                    var378[var379] = 63;
                                }
                            }
                            var375.method2289(var378.length);
                            var375.field1955 += Statics.field3157.method2212(var378, 0, var378.length, var375.field1956, var375.field1955);
                            client.field317.method2450(client.field317.field1955 - var374);
                            continue;
                        }
                        if (var424 == 5009) {
                            var6 -= 2;
                            String var383 = field800[var6];
                            String var384 = field800[var6 + 1];
                            client.field317.method2544(198);
                            client.field317.method2451(0);
                            int var385 = client.field317.field1955;
                            client.field317.method2282(var383);
                            class122 var386 = client.field317;
                            int var387 = var386.field1955;
                            int var388 = var384.length();
                            byte[] var389 = new byte[var388];
                            for (int var390 = 0; var390 < var388; var390++) {
                                char var391 = var384.charAt(var390);
                                if (!(var391 <= 0 || var391 >= 128) || !(var391 < 160 || var391 > 255)) {
                                    var389[var390] = (byte) var391;
                                } else if (var391 == 8364) {
                                    var389[var390] = -128;
                                } else if (var391 == 8218) {
                                    var389[var390] = -126;
                                } else if (var391 == 402) {
                                    var389[var390] = -125;
                                } else if (var391 == 8222) {
                                    var389[var390] = -124;
                                } else if (var391 == 8230) {
                                    var389[var390] = -123;
                                } else if (var391 == 8224) {
                                    var389[var390] = -122;
                                } else if (var391 == 8225) {
                                    var389[var390] = -121;
                                } else if (var391 == 710) {
                                    var389[var390] = -120;
                                } else if (var391 == 8240) {
                                    var389[var390] = -119;
                                } else if (var391 == 352) {
                                    var389[var390] = -118;
                                } else if (var391 == 8249) {
                                    var389[var390] = -117;
                                } else if (var391 == 338) {
                                    var389[var390] = -116;
                                } else if (var391 == 381) {
                                    var389[var390] = -114;
                                } else if (var391 == 8216) {
                                    var389[var390] = -111;
                                } else if (var391 == 8217) {
                                    var389[var390] = -110;
                                } else if (var391 == 8220) {
                                    var389[var390] = -109;
                                } else if (var391 == 8221) {
                                    var389[var390] = -108;
                                } else if (var391 == 8226) {
                                    var389[var390] = -107;
                                } else if (var391 == 8211) {
                                    var389[var390] = -106;
                                } else if (var391 == 8212) {
                                    var389[var390] = -105;
                                } else if (var391 == 732) {
                                    var389[var390] = -104;
                                } else if (var391 == 8482) {
                                    var389[var390] = -103;
                                } else if (var391 == 353) {
                                    var389[var390] = -102;
                                } else if (var391 == 8250) {
                                    var389[var390] = -101;
                                } else if (var391 == 339) {
                                    var389[var390] = -100;
                                } else if (var391 == 382) {
                                    var389[var390] = -98;
                                } else if (var391 == 376) {
                                    var389[var390] = -97;
                                } else {
                                    var389[var390] = 63;
                                }
                            }
                            var386.method2289(var389.length);
                            var386.field1955 += Statics.field3157.method2212(var389, 0, var389.length, var386.field1956, var386.field1955);
                            client.field317.method2328(client.field317.field1955 - var385);
                            continue;
                        }
                        if (var424 == 5015) {
                            String var394;
                            if (Statics.field2644 == null || Statics.field2644.field35 == null) {
                                var394 = "";
                            } else {
                                var394 = Statics.field2644.field35;
                            }
                            field800[var6++] = var394;
                            continue;
                        }
                        if (var424 == 5016) {
                            field810[var5++] = client.field280;
                            continue;
                        }
                        if (var424 == 5017) {
                            var5--;
                            int var395 = field810[var5];
                            field810[var5++] = class12.method2900(var395);
                            continue;
                        }
                        if (var424 == 5018) {
                            var5--;
                            int var396 = field810[var5];
                            field810[var5++] = class12.method907(var396);
                            continue;
                        }
                        if (var424 == 5019) {
                            var5--;
                            int var397 = field810[var5];
                            int[] var398 = field810;
                            int var399 = var5++;
                            class36 var400 = (class36) class12.field171.method3548((long) var397);
                            int var401;
                            if (var400 == null) {
                                var401 = -1;
                            } else if (class12.field161.field3082 == var400.field3086) {
                                var401 = -1;
                            } else {
                                var401 = ((class36) var400.field3086).field792;
                            }
                            var398[var399] = var401;
                            continue;
                        }
                        if (var424 == 5020) {
                            var6--;
                            String var402 = field800[var6];
                            if (var402.equalsIgnoreCase("toggleroof")) {
                                Statics.field2046.field133 = !Statics.field2046.field133;
                                class9.method1993();
                                if (Statics.field2046.field133) {
                                    class12.method156(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method156(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var402.equalsIgnoreCase("displayfps")) {
                                client.field291 = !client.field291;
                            }
                            if (client.field442 >= 2) {
                                if (var402.equalsIgnoreCase("fpson")) {
                                    client.field291 = true;
                                }
                                if (var402.equalsIgnoreCase("fpsoff")) {
                                    client.field291 = false;
                                }
                                if (var402.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var402.equalsIgnoreCase("clientdrop")) {
                                    client.method124();
                                }
                                if (var402.equalsIgnoreCase("errortest") && client.field301 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field317.method2544(65);
                            client.field317.method2276(var402.length() + 1);
                            client.field317.method2282(var402);
                            continue;
                        }
                        if (var424 == 5021) {
                            var6--;
                            client.field422 = field800[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var424 == 5022) {
                            field800[var6++] = client.field422;
                            continue;
                        }
                    }
                } else {
                    class173 var77;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var77 = class173.method708(field810[var5]);
                    } else {
                        var77 = var51 ? Statics.field2727 : Statics.field3148;
                    }
                    if (var424 == 1300) {
                        var5--;
                        int var78 = field810[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method3148(var78, field800[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var424 == 1301) {
                        var5 -= 2;
                        int var79 = field810[var5];
                        int var80 = field810[var5 + 1];
                        var77.field2814 = class173.method3108(var79, var80);
                        continue;
                    }
                    if (var424 == 1302) {
                        var5--;
                        var77.field2817 = field810[var5] == 1;
                        continue;
                    }
                    if (var424 == 1303) {
                        var5--;
                        var77.field2815 = field810[var5];
                        continue;
                    }
                    if (var424 == 1304) {
                        var5--;
                        var77.field2836 = field810[var5];
                        continue;
                    }
                    if (var424 == 1305) {
                        var6--;
                        var77.field2812 = field800[var6];
                        continue;
                    }
                    if (var424 == 1306) {
                        var6--;
                        var77.field2818 = field800[var6];
                        continue;
                    }
                    if (var424 == 1307) {
                        var77.field2732 = null;
                        continue;
                    }
                }
                if (var424 < 5400) {
                    if (var424 == 5306) {
                        field810[var5++] = client.method591();
                        continue;
                    }
                    if (var424 == 5307) {
                        var5--;
                        int var403 = field810[var5];
                        if (var403 != 1 && var403 != 2) {
                            continue;
                        }
                        client.field488 = 0L;
                        if (var403 >= 2) {
                            client.field489 = true;
                        } else {
                            client.field489 = false;
                        }
                        client.method611();
                        if (client.field379 >= 25) {
                            client.field317.method2544(160);
                            client.field317.method2276(client.method591());
                            client.field317.method2451(Statics.field1604);
                            client.field317.method2451(Statics.field776);
                        }
                        class144.field2171 = true;
                        continue;
                    }
                    if (var424 == 5308) {
                        field810[var5++] = Statics.field2046.field140;
                        continue;
                    }
                    if (var424 == 5309) {
                        var5--;
                        int var404 = field810[var5];
                        if (var404 == 1 || var404 == 2) {
                            Statics.field2046.field140 = var404;
                            class9.method1993();
                        }
                        continue;
                    }
                }
                if (var424 < 5600) {
                    if (var424 == 5504) {
                        var5 -= 2;
                        int var405 = field810[var5];
                        int var406 = field810[var5 + 1];
                        if (!client.field508) {
                            client.field435 = var405;
                            client.field362 = var406;
                        }
                        continue;
                    }
                    if (var424 == 5505) {
                        field810[var5++] = client.field435;
                        continue;
                    }
                    if (var424 == 5506) {
                        field810[var5++] = client.field362;
                        continue;
                    }
                    if (var424 == 5530) {
                        var5--;
                        int var407 = field810[var5];
                        if (var407 < 0) {
                            var407 = 0;
                        }
                        client.field427 = var407;
                        continue;
                    }
                    if (var424 == 5531) {
                        field810[var5++] = client.field427;
                        continue;
                    }
                }
                if (var424 >= 5700 || var424 != 5630) {
                    if (var424 < 6300) {
                        if (var424 == 6200) {
                            var5 -= 2;
                            client.field529 = (short) field810[var5];
                            if (client.field529 <= 0) {
                                client.field529 = 256;
                            }
                            client.field388 = (short) field810[var5 + 1];
                            if (client.field388 <= 0) {
                                client.field388 = 205;
                            }
                            continue;
                        }
                        if (var424 == 6201) {
                            var5 -= 2;
                            client.field531 = (short) field810[var5];
                            if (client.field531 <= 0) {
                                client.field531 = 256;
                            }
                            client.field532 = (short) field810[var5 + 1];
                            if (client.field532 <= 0) {
                                client.field532 = 320;
                            }
                            continue;
                        }
                        if (var424 == 6202) {
                            var5 -= 4;
                            client.field330 = (short) field810[var5];
                            if (client.field330 <= 0) {
                                client.field330 = 1;
                            }
                            client.field337 = (short) field810[var5 + 1];
                            if (client.field337 <= 0) {
                                client.field337 = 32767;
                            } else if (client.field337 < client.field330) {
                                client.field337 = client.field330;
                            }
                            client.field535 = (short) field810[var5 + 2];
                            if (client.field535 <= 0) {
                                client.field535 = 1;
                            }
                            client.field551 = (short) field810[var5 + 3];
                            if (client.field551 <= 0) {
                                client.field551 = 32767;
                            } else if (client.field551 < client.field535) {
                                client.field551 = client.field535;
                            }
                            continue;
                        }
                        if (var424 == 6203) {
                            if (client.field447 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = -1;
                            } else {
                                client.method682(0, 0, client.field447.field2855, client.field447.field2740, false);
                                field810[var5++] = client.field316;
                                field810[var5++] = client.field550;
                            }
                            continue;
                        }
                        if (var424 == 6204) {
                            field810[var5++] = client.field531;
                            field810[var5++] = client.field532;
                            continue;
                        }
                        if (var424 == 6205) {
                            field810[var5++] = client.field529;
                            field810[var5++] = client.field388;
                            continue;
                        }
                    }
                    if (var424 < 6600) {
                        if (var424 == 6500) {
                            field810[var5++] = class26.method572() ? 1 : 0;
                            continue;
                        }
                        if (var424 == 6501) {
                            class26.field632 = 0;
                            class26 var408 = class26.method872();
                            if (var408 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                            } else {
                                field810[var5++] = var408.field628;
                                field810[var5++] = var408.field643;
                                field800[var6++] = var408.field639;
                                field810[var5++] = var408.field640;
                                field810[var5++] = var408.field637;
                                field800[var6++] = var408.field636;
                            }
                            continue;
                        }
                        if (var424 == 6502) {
                            class26 var410 = class26.method872();
                            if (var410 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                            } else {
                                field810[var5++] = var410.field628;
                                field810[var5++] = var410.field643;
                                field800[var6++] = var410.field639;
                                field810[var5++] = var410.field640;
                                field810[var5++] = var410.field637;
                                field800[var6++] = var410.field636;
                            }
                            continue;
                        }
                        if (var424 == 6506) {
                            var5--;
                            int var411 = field810[var5];
                            class26 var412 = null;
                            for (int var413 = 0; var413 < class26.field631; var413++) {
                                if (Statics.field645[var413].field628 == var411) {
                                    var412 = Statics.field645[var413];
                                    break;
                                }
                            }
                            if (var412 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field800[var6++] = "";
                            } else {
                                field810[var5++] = var412.field628;
                                field810[var5++] = var412.field643;
                                field800[var6++] = var412.field639;
                                field810[var5++] = var412.field640;
                                field810[var5++] = var412.field637;
                                field800[var6++] = var412.field636;
                            }
                            continue;
                        }
                        if (var424 == 6507) {
                            var5 -= 4;
                            int var414 = field810[var5];
                            boolean var415 = field810[var5 + 1] == 1;
                            int var416 = field810[var5 + 2];
                            boolean var417 = field810[var5 + 3] == 1;
                            class26.method3115(var414, var415, var416, var417);
                            continue;
                        }
                        if (var424 == 6511) {
                            var5--;
                            int var418 = field810[var5];
                            if (var418 >= 0 && var418 < class26.field631) {
                                class26 var419 = Statics.field645[var418];
                                field810[var5++] = var419.field628;
                                field810[var5++] = var419.field643;
                                field800[var6++] = var419.field639;
                                field810[var5++] = var419.field640;
                                field810[var5++] = var419.field637;
                                field800[var6++] = var419.field636;
                                continue;
                            }
                            field810[var5++] = -1;
                            field810[var5++] = 0;
                            field800[var6++] = "";
                            field810[var5++] = 0;
                            field810[var5++] = 0;
                            field800[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field327 = 250;
            }
        } catch (Exception var423) {
            StringBuilder var421 = new StringBuilder(30);
            var421.append("").append(var4.field3096).append(" ");
            for (int var422 = field802 - 1; var422 >= 0; var422--) {
                var421.append("").append(field811[var422].field204.field3096).append(" ");
            }
            var421.append("").append(var10);
            class148.method2598(var421.toString(), var423);
        }
    }

    @ObfuscatedName("ao.k(IB)V")
    public static void method698(int arg0) {
        if (arg0 == -1 || !class173.method4(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2827[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2757 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field17 = var3.field2757;
                method2087(var4, 2000000);
            }
        }
    }
}
