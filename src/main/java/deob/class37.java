package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ab")
public class class37 {

    @ObfuscatedName("ab.x")
    public static int[] field794 = new int[5];

    @ObfuscatedName("ab.q")
    public static int[][] field795 = new int[5][5000];

    @ObfuscatedName("ab.h")
    public static int[] field791 = new int[1000];

    @ObfuscatedName("ab.d")
    public static String[] field797 = new String[1000];

    @ObfuscatedName("ab.c")
    public static int field798 = 0;

    @ObfuscatedName("ab.y")
    public static class15[] field799 = new class15[50];

    @ObfuscatedName("ab.z")
    public static Calendar field800 = Calendar.getInstance();

    @ObfuscatedName("ab.t")
    public static final String[] field808 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ab.b")
    public static int field802 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.i(Li;II)V")
    public static void method571(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2297(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field592;
        int[] var9 = var4.field588;
        byte var10 = -1;
        field798 = 0;
        try {
            Statics.field793 = new int[var4.field590];
            int var11 = 0;
            Statics.field3115 = new String[var4.field591];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2741;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2742;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2741;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2742;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field793[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field4;
                    }
                    Statics.field3115[var12++] = var15;
                }
            }
            int var16 = 0;
            field802 = arg0.field11;
            label3037: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var482 = var8[var7];
                if (var482 < 100) {
                    if (var482 == 0) {
                        field791[var5++] = var9[var7];
                        continue;
                    }
                    if (var482 == 1) {
                        int var17 = var9[var7];
                        field791[var5++] = class176.field2886[var17];
                        continue;
                    }
                    if (var482 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2886[var18] = field791[var5];
                        client.method1218(var18);
                        continue;
                    }
                    if (var482 == 3) {
                        field797[var6++] = var4.field589[var7];
                        continue;
                    }
                    if (var482 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var482 == 7) {
                        var5 -= 2;
                        if (field791[var5 + 1] != field791[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var482 == 8) {
                        var5 -= 2;
                        if (field791[var5 + 1] == field791[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var482 == 9) {
                        var5 -= 2;
                        if (field791[var5] < field791[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var482 == 10) {
                        var5 -= 2;
                        if (field791[var5] > field791[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var482 == 21) {
                        if (field798 == 0) {
                            return;
                        }
                        class15 var19 = field799[--field798];
                        var4 = var19.field204;
                        var8 = var4.field592;
                        var9 = var4.field588;
                        var7 = var19.field202;
                        Statics.field793 = var19.field201;
                        Statics.field3115 = var19.field206;
                        continue;
                    }
                    if (var482 == 25) {
                        int var20 = var9[var7];
                        field791[var5++] = class176.method140(var20);
                        continue;
                    }
                    if (var482 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field791[var5];
                        class48 var23 = class48.method2970(var21);
                        int var24 = var23.field1062;
                        int var25 = var23.field1066;
                        int var26 = var23.field1060;
                        int var27 = class176.field2887[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class176.field2886[var24] = class176.field2886[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var482 == 31) {
                        var5 -= 2;
                        if (field791[var5] <= field791[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var482 == 32) {
                        var5 -= 2;
                        if (field791[var5] >= field791[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var482 == 33) {
                        field791[var5++] = Statics.field793[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var482 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field793[var10001] = field791[var5];
                        continue;
                    }
                    if (var482 == 35) {
                        field797[var6++] = Statics.field3115[var9[var7]];
                        continue;
                    }
                    if (var482 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field3115[var10001] = field797[var6];
                        continue;
                    }
                    if (var482 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class163.method1516(field797, var6, var29);
                        field797[var6++] = var30;
                        continue;
                    }
                    if (var482 == 38) {
                        var5--;
                        continue;
                    }
                    if (var482 == 39) {
                        var6--;
                        continue;
                    }
                    if (var482 == 40) {
                        int var31 = var9[var7];
                        class23 var32 = class23.method2297(var31);
                        int[] var33 = new int[var32.field590];
                        String[] var34 = new String[var32.field591];
                        for (int var35 = 0; var35 < var32.field594; var35++) {
                            var33[var35] = field791[var5 - var32.field594 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field596; var36++) {
                            var34[var36] = field797[var6 - var32.field596 + var36];
                        }
                        var5 -= var32.field594;
                        var6 -= var32.field596;
                        class15 var37 = new class15();
                        var37.field204 = var4;
                        var37.field202 = var7;
                        var37.field201 = Statics.field793;
                        var37.field206 = Statics.field3115;
                        field799[++field798 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field592;
                        var9 = var32.field588;
                        var7 = -1;
                        Statics.field793 = var33;
                        Statics.field3115 = var34;
                        continue;
                    }
                    if (var482 == 42) {
                        field791[var5++] = Statics.field275.method183(var9[var7]);
                        continue;
                    }
                    if (var482 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field275.method182(var10001, field791[var5]);
                        continue;
                    }
                    if (var482 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field791[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field794[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label3037;
                                }
                                field795[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var482 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field791[var5];
                        if (var44 >= 0 && var44 < field794[var43]) {
                            field791[var5++] = field795[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var482 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field791[var5];
                        if (var46 >= 0 && var46 < field794[var45]) {
                            field795[var45][var46] = field791[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var482 == 47) {
                        String var47 = Statics.field275.method185(var9[var7]);
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field797[var6++] = var47;
                        continue;
                    }
                    if (var482 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field275.method209(var10001, field797[var6]);
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var482 < 1000) {
                    if (var482 == 100) {
                        var5 -= 3;
                        int var49 = field791[var5];
                        int var50 = field791[var5 + 1];
                        int var51 = field791[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var52 = class173.method2966(var49);
                        if (var52.field2863 == null) {
                            var52.field2863 = new class173[var51 + 1];
                        }
                        if (var52.field2863.length <= var51) {
                            class173[] var53 = new class173[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2863.length; var54++) {
                                var53[var54] = var52.field2863[var54];
                            }
                            var52.field2863 = var53;
                        }
                        if (var51 > 0 && var52.field2863[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class173 var55 = new class173();
                        var55.field2743 = var50;
                        var55.field2829 = var55.field2741 = var52.field2741;
                        var55.field2742 = var51;
                        var55.field2831 = true;
                        var52.field2863[var51] = var55;
                        if (var48) {
                            Statics.field2081 = var55;
                        } else {
                            Statics.field264 = var55;
                        }
                        client.method2951(var52);
                        continue;
                    }
                    if (var482 == 101) {
                        class173 var56 = var48 ? Statics.field2081 : Statics.field264;
                        class173 var57 = class173.method2966(var56.field2741);
                        var57.field2863[var56.field2742] = null;
                        client.method2951(var57);
                        continue;
                    }
                    if (var482 == 102) {
                        var5--;
                        class173 var58 = class173.method2966(field791[var5]);
                        var58.field2863 = null;
                        client.method2951(var58);
                        continue;
                    }
                    if (var482 == 200) {
                        var5 -= 2;
                        int var59 = field791[var5];
                        int var60 = field791[var5 + 1];
                        class173 var61 = class173.method3127(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field791[var5++] = 1;
                            if (var48) {
                                Statics.field2081 = var61;
                            } else {
                                Statics.field264 = var61;
                            }
                            continue;
                        }
                        field791[var5++] = 0;
                        continue;
                    }
                    if (var482 == 201) {
                        var5--;
                        class173 var62 = class173.method2966(field791[var5]);
                        if (var62 == null) {
                            field791[var5++] = 0;
                        } else {
                            field791[var5++] = 1;
                            if (var48) {
                                Statics.field2081 = var62;
                            } else {
                                Statics.field264 = var62;
                            }
                        }
                        continue;
                    }
                } else if (!(var482 < 1000 || var482 >= 1100) || !(var482 < 2000 || var482 >= 2100)) {
                    int var63 = -1;
                    class173 var64;
                    if (var482 >= 2000) {
                        var482 -= 1000;
                        var5--;
                        var63 = field791[var5];
                        var64 = class173.method2966(var63);
                    } else {
                        var64 = var48 ? Statics.field2081 : Statics.field264;
                    }
                    if (var482 == 1000) {
                        var5 -= 4;
                        var64.field2735 = field791[var5];
                        var64.field2858 = field791[var5 + 1];
                        var64.field2746 = field791[var5 + 2];
                        var64.field2865 = field791[var5 + 3];
                        client.method2951(var64);
                        client.method216(var64);
                        if (var63 != -1 && var64.field2743 == 0) {
                            client.method2278(Statics.field2801[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var482 == 1001) {
                        var5 -= 4;
                        var64.field2752 = field791[var5];
                        var64.field2753 = field791[var5 + 1];
                        var64.field2758 = field791[var5 + 2];
                        var64.field2737 = field791[var5 + 3];
                        client.method2951(var64);
                        client.method216(var64);
                        if (var63 != -1 && var64.field2743 == 0) {
                            client.method2278(Statics.field2801[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var482 == 1003) {
                        var5--;
                        boolean var65 = field791[var5] == 1;
                        if (var64.field2840 != var65) {
                            var64.field2840 = var65;
                            client.method2951(var64);
                        }
                        continue;
                    }
                    if (var482 == 1005) {
                        var5--;
                        var64.field2751 = field791[var5] == 1;
                        continue;
                    }
                    if (var482 == 1006) {
                        var5--;
                        var64.field2830 = field791[var5] == 1;
                        continue;
                    }
                } else if (var482 >= 1100 && var482 < 1200 || var482 >= 2100 && var482 < 2200) {
                    int var66 = -1;
                    class173 var67;
                    if (var482 >= 2000) {
                        var482 -= 1000;
                        var5--;
                        var66 = field791[var5];
                        var67 = class173.method2966(var66);
                    } else {
                        var67 = var48 ? Statics.field2081 : Statics.field264;
                    }
                    if (var482 == 1100) {
                        var5 -= 2;
                        var67.field2842 = field791[var5];
                        if (var67.field2842 > var67.field2764 - var67.field2756) {
                            var67.field2842 = var67.field2764 - var67.field2756;
                        }
                        if (var67.field2842 < 0) {
                            var67.field2842 = 0;
                        }
                        var67.field2763 = field791[var5 + 1];
                        if (var67.field2763 > var67.field2765 - var67.field2872) {
                            var67.field2763 = var67.field2765 - var67.field2872;
                        }
                        if (var67.field2763 < 0) {
                            var67.field2763 = 0;
                        }
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1101) {
                        var5--;
                        var67.field2766 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1102) {
                        var5--;
                        var67.field2772 = field791[var5] == 1;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1103) {
                        var5--;
                        var67.field2771 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1104) {
                        var5--;
                        var67.field2856 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1105) {
                        var5--;
                        var67.field2774 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1106) {
                        var5--;
                        var67.field2787 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1107) {
                        var5--;
                        var67.field2777 = field791[var5] == 1;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1108) {
                        var67.field2747 = 1;
                        var5--;
                        var67.field2789 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1109) {
                        var5 -= 6;
                        var67.field2788 = field791[var5];
                        var67.field2759 = field791[var5 + 1];
                        var67.field2790 = field791[var5 + 2];
                        var67.field2791 = field791[var5 + 3];
                        var67.field2851 = field791[var5 + 4];
                        var67.field2793 = field791[var5 + 5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1110) {
                        var5--;
                        int var68 = field791[var5];
                        if (var67.field2808 != var68) {
                            var67.field2808 = var68;
                            var67.field2861 = 0;
                            var67.field2827 = 0;
                            client.method2951(var67);
                        }
                        continue;
                    }
                    if (var482 == 1111) {
                        var5--;
                        var67.field2796 = field791[var5] == 1;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1112) {
                        var6--;
                        String var69 = field797[var6];
                        if (!var69.equals(var67.field2799)) {
                            var67.field2799 = var69;
                            client.method2951(var67);
                        }
                        continue;
                    }
                    if (var482 == 1113) {
                        var5--;
                        var67.field2798 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1114) {
                        var5 -= 3;
                        var67.field2802 = field791[var5];
                        var67.field2813 = field791[var5 + 1];
                        var67.field2823 = field791[var5 + 2];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1115) {
                        var5--;
                        var67.field2804 = field791[var5] == 1;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1116) {
                        var5--;
                        var67.field2778 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1117) {
                        var5--;
                        var67.field2779 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1118) {
                        var5--;
                        var67.field2780 = field791[var5] == 1;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1119) {
                        var5--;
                        var67.field2781 = field791[var5] == 1;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1120) {
                        var5 -= 2;
                        var67.field2764 = field791[var5];
                        var67.field2765 = field791[var5 + 1];
                        client.method2951(var67);
                        if (var66 != -1 && var67.field2743 == 0) {
                            client.method2278(Statics.field2801[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var482 == 1121) {
                        client.method2721(var67.field2741, var67.field2742);
                        client.field450 = var67;
                        client.method2951(var67);
                        continue;
                    }
                    if (var482 == 1122) {
                        var5--;
                        var67.field2775 = field791[var5];
                        client.method2951(var67);
                        continue;
                    }
                } else if (var482 >= 1200 && var482 < 1300 || var482 >= 2200 && var482 < 2300) {
                    class173 var70;
                    if (var482 >= 2000) {
                        var482 -= 1000;
                        var5--;
                        var70 = class173.method2966(field791[var5]);
                    } else {
                        var70 = var48 ? Statics.field2081 : Statics.field264;
                    }
                    client.method2951(var70);
                    if (var482 == 1200 || var482 == 1205 || var482 == 1212) {
                        var5 -= 2;
                        int var71 = field791[var5];
                        int var72 = field791[var5 + 1];
                        var70.field2859 = var71;
                        var70.field2860 = var72;
                        class52 var73 = class52.method970(var71);
                        var70.field2790 = var73.field1125;
                        var70.field2791 = var73.field1131;
                        var70.field2851 = var73.field1139;
                        var70.field2788 = var73.field1128;
                        var70.field2759 = var73.field1129;
                        var70.field2793 = var73.field1124;
                        if (var482 == 1205) {
                            var70.field2797 = 0;
                        } else if (var482 == 1212 | var73.field1130 == 1) {
                            var70.field2797 = 1;
                        } else {
                            var70.field2797 = 2;
                        }
                        if (var70.field2755 > 0) {
                            var70.field2793 = var70.field2793 * 32 / var70.field2755;
                        } else if (var70.field2752 > 0) {
                            var70.field2793 = var70.field2793 * 32 / var70.field2752;
                        }
                        continue;
                    }
                    if (var482 == 1201) {
                        var70.field2747 = 2;
                        var5--;
                        var70.field2789 = field791[var5];
                        continue;
                    }
                    if (var482 == 1202) {
                        var70.field2747 = 3;
                        var70.field2789 = Statics.field1544.field30.method3244();
                        continue;
                    }
                } else if (var482 >= 1300 && var482 < 1400 || var482 >= 2300 && var482 < 2400) {
                    class173 var74;
                    if (var482 >= 2000) {
                        var482 -= 1000;
                        var5--;
                        var74 = class173.method2966(field791[var5]);
                    } else {
                        var74 = var48 ? Statics.field2081 : Statics.field264;
                    }
                    if (var482 == 1300) {
                        var5--;
                        int var75 = field791[var5] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var6--;
                            var74.method3203(var75, field797[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var482 == 1301) {
                        var5 -= 2;
                        int var76 = field791[var5];
                        int var77 = field791[var5 + 1];
                        var74.field2814 = class173.method3127(var76, var77);
                        continue;
                    }
                    if (var482 == 1302) {
                        var5--;
                        var74.field2817 = field791[var5] == 1;
                        continue;
                    }
                    if (var482 == 1303) {
                        var5--;
                        var74.field2815 = field791[var5];
                        continue;
                    }
                    if (var482 == 1304) {
                        var5--;
                        var74.field2826 = field791[var5];
                        continue;
                    }
                    if (var482 == 1305) {
                        var6--;
                        var74.field2812 = field797[var6];
                        continue;
                    }
                    if (var482 == 1306) {
                        var6--;
                        var74.field2818 = field797[var6];
                        continue;
                    }
                    if (var482 == 1307) {
                        var74.field2819 = null;
                        continue;
                    }
                } else {
                    if (var482 >= 1400 && var482 < 1500 || var482 >= 2400 && var482 < 2500) {
                        class173 var78;
                        if (var482 >= 2000) {
                            var482 -= 1000;
                            var5--;
                            var78 = class173.method2966(field791[var5]);
                        } else {
                            var78 = var48 ? Statics.field2081 : Statics.field264;
                        }
                        var6--;
                        String var79 = field797[var6];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var5--;
                            int var81 = field791[var5];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var5--;
                                    var80[var81] = field791[var5];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var6--;
                                var82[var83] = field797[var6];
                            } else {
                                var5--;
                                var82[var83] = Integer.valueOf(field791[var5]);
                            }
                        }
                        var5--;
                        int var84 = field791[var5];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var482 == 1400) {
                            var78.field2821 = var82;
                        }
                        if (var482 == 1401) {
                            var78.field2824 = var82;
                        }
                        if (var482 == 1402) {
                            var78.field2839 = var82;
                        }
                        if (var482 == 1403) {
                            var78.field2825 = var82;
                        }
                        if (var482 == 1404) {
                            var78.field2873 = var82;
                        }
                        if (var482 == 1405) {
                            var78.field2828 = var82;
                        }
                        if (var482 == 1406) {
                            var78.field2803 = var82;
                        }
                        if (var482 == 1407) {
                            var78.field2750 = var82;
                            var78.field2833 = var80;
                        }
                        if (var482 == 1408) {
                            var78.field2757 = var82;
                        }
                        if (var482 == 1409) {
                            var78.field2783 = var82;
                        }
                        if (var482 == 1410) {
                            var78.field2749 = var82;
                        }
                        if (var482 == 1411) {
                            var78.field2786 = var82;
                        }
                        if (var482 == 1412) {
                            var78.field2784 = var82;
                        }
                        if (var482 == 1414) {
                            var78.field2834 = var82;
                            var78.field2835 = var80;
                        }
                        if (var482 == 1415) {
                            var78.field2811 = var82;
                            var78.field2776 = var80;
                        }
                        if (var482 == 1416) {
                            var78.field2760 = var82;
                        }
                        if (var482 == 1417) {
                            var78.field2740 = var82;
                        }
                        if (var482 == 1418) {
                            var78.field2841 = var82;
                        }
                        if (var482 == 1419) {
                            var78.field2862 = var82;
                        }
                        if (var482 == 1420) {
                            var78.field2843 = var82;
                        }
                        if (var482 == 1421) {
                            var78.field2844 = var82;
                        }
                        if (var482 == 1422) {
                            var78.field2845 = var82;
                        }
                        if (var482 == 1423) {
                            var78.field2846 = var82;
                        }
                        if (var482 == 1424) {
                            var78.field2847 = var82;
                        }
                        if (var482 == 1425) {
                            var78.field2792 = var82;
                        }
                        if (var482 == 1426) {
                            var78.field2850 = var82;
                        }
                        if (var482 == 1427) {
                            var78.field2848 = var82;
                        }
                        var78.field2785 = true;
                        continue;
                    }
                    if (var482 < 1600) {
                        class173 var85 = var48 ? Statics.field2081 : Statics.field264;
                        if (var482 == 1500) {
                            field791[var5++] = var85.field2754;
                            continue;
                        }
                        if (var482 == 1501) {
                            field791[var5++] = var85.field2748;
                            continue;
                        }
                        if (var482 == 1502) {
                            field791[var5++] = var85.field2756;
                            continue;
                        }
                        if (var482 == 1503) {
                            field791[var5++] = var85.field2872;
                            continue;
                        }
                        if (var482 == 1504) {
                            field791[var5++] = var85.field2840 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 1505) {
                            field791[var5++] = var85.field2829;
                            continue;
                        }
                    } else if (var482 < 1700) {
                        class173 var86 = var48 ? Statics.field2081 : Statics.field264;
                        if (var482 == 1600) {
                            field791[var5++] = var86.field2842;
                            continue;
                        }
                        if (var482 == 1601) {
                            field791[var5++] = var86.field2763;
                            continue;
                        }
                        if (var482 == 1602) {
                            field797[var6++] = var86.field2799;
                            continue;
                        }
                        if (var482 == 1603) {
                            field791[var5++] = var86.field2764;
                            continue;
                        }
                        if (var482 == 1604) {
                            field791[var5++] = var86.field2765;
                            continue;
                        }
                        if (var482 == 1605) {
                            field791[var5++] = var86.field2793;
                            continue;
                        }
                        if (var482 == 1606) {
                            field791[var5++] = var86.field2790;
                            continue;
                        }
                        if (var482 == 1607) {
                            field791[var5++] = var86.field2851;
                            continue;
                        }
                        if (var482 == 1608) {
                            field791[var5++] = var86.field2791;
                            continue;
                        }
                        if (var482 == 1609) {
                            field791[var5++] = var86.field2771;
                            continue;
                        }
                    } else if (var482 < 1800) {
                        class173 var87 = var48 ? Statics.field2081 : Statics.field264;
                        if (var482 == 1700) {
                            field791[var5++] = var87.field2859;
                            continue;
                        }
                        if (var482 == 1701) {
                            if (var87.field2859 == -1) {
                                field791[var5++] = 0;
                            } else {
                                field791[var5++] = var87.field2860;
                            }
                            continue;
                        }
                        if (var482 == 1702) {
                            field791[var5++] = var87.field2742;
                            continue;
                        }
                    } else if (var482 < 1900) {
                        class173 var88 = var48 ? Statics.field2081 : Statics.field264;
                        if (var482 == 1800) {
                            int[] var89 = field791;
                            int var90 = var5++;
                            int var91 = client.method217(var88);
                            int var92 = var91 >> 11 & 0x3F;
                            var89[var90] = var92;
                            continue;
                        }
                        if (var482 == 1801) {
                            var5--;
                            int var93 = field791[var5];
                            int var483 = var93 - 1;
                            if (var88.field2819 != null && var483 < var88.field2819.length && var88.field2819[var483] != null) {
                                field797[var6++] = var88.field2819[var483];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 1802) {
                            if (var88.field2812 == null) {
                                field797[var6++] = "";
                            } else {
                                field797[var6++] = var88.field2812;
                            }
                            continue;
                        }
                    } else if (var482 >= 1900 && var482 < 2000 || var482 >= 2900 && var482 < 3000) {
                        class173 var94;
                        if (var482 >= 2000) {
                            var482 -= 1000;
                            var5--;
                            var94 = class173.method2966(field791[var5]);
                        } else {
                            var94 = var48 ? Statics.field2081 : Statics.field264;
                        }
                        if (var482 == 1927) {
                            if (field802 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var94.field2848 == null) {
                                return;
                            }
                            class1 var95 = new class1();
                            var95.field3 = var94;
                            var95.field12 = var94.field2848;
                            var95.field11 = field802 + 1;
                            client.field485.method3529(arg0);
                            continue;
                        }
                    } else if (var482 < 2600) {
                        var5--;
                        class173 var96 = class173.method2966(field791[var5]);
                        if (var482 == 2500) {
                            field791[var5++] = var96.field2754;
                            continue;
                        }
                        if (var482 == 2501) {
                            field791[var5++] = var96.field2748;
                            continue;
                        }
                        if (var482 == 2502) {
                            field791[var5++] = var96.field2756;
                            continue;
                        }
                        if (var482 == 2503) {
                            field791[var5++] = var96.field2872;
                            continue;
                        }
                        if (var482 == 2504) {
                            field791[var5++] = var96.field2840 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 2505) {
                            field791[var5++] = var96.field2829;
                            continue;
                        }
                    } else if (var482 < 2700) {
                        var5--;
                        class173 var97 = class173.method2966(field791[var5]);
                        if (var482 == 2600) {
                            field791[var5++] = var97.field2842;
                            continue;
                        }
                        if (var482 == 2601) {
                            field791[var5++] = var97.field2763;
                            continue;
                        }
                        if (var482 == 2602) {
                            field797[var6++] = var97.field2799;
                            continue;
                        }
                        if (var482 == 2603) {
                            field791[var5++] = var97.field2764;
                            continue;
                        }
                        if (var482 == 2604) {
                            field791[var5++] = var97.field2765;
                            continue;
                        }
                        if (var482 == 2605) {
                            field791[var5++] = var97.field2793;
                            continue;
                        }
                        if (var482 == 2606) {
                            field791[var5++] = var97.field2790;
                            continue;
                        }
                        if (var482 == 2607) {
                            field791[var5++] = var97.field2851;
                            continue;
                        }
                        if (var482 == 2608) {
                            field791[var5++] = var97.field2791;
                            continue;
                        }
                        if (var482 == 2609) {
                            field791[var5++] = var97.field2771;
                            continue;
                        }
                    } else if (var482 < 2800) {
                        if (var482 == 2700) {
                            var5--;
                            class173 var98 = class173.method2966(field791[var5]);
                            field791[var5++] = var98.field2859;
                            continue;
                        }
                        if (var482 == 2701) {
                            var5--;
                            class173 var99 = class173.method2966(field791[var5]);
                            if (var99.field2859 == -1) {
                                field791[var5++] = 0;
                            } else {
                                field791[var5++] = var99.field2860;
                            }
                            continue;
                        }
                        if (var482 == 2702) {
                            var5--;
                            int var100 = field791[var5];
                            class4 var101 = (class4) client.field447.method3496((long) var100);
                            if (var101 == null) {
                                field791[var5++] = 0;
                            } else {
                                field791[var5++] = 1;
                            }
                            continue;
                        }
                        if (var482 == 2706) {
                            field791[var5++] = client.field446;
                            continue;
                        }
                    } else if (var482 < 2900) {
                        var5--;
                        class173 var102 = class173.method2966(field791[var5]);
                        if (var482 == 2800) {
                            int[] var103 = field791;
                            int var104 = var5++;
                            int var105 = client.method217(var102);
                            int var106 = var105 >> 11 & 0x3F;
                            var103[var104] = var106;
                            continue;
                        }
                        if (var482 == 2801) {
                            var5--;
                            int var107 = field791[var5];
                            int var484 = var107 - 1;
                            if (var102.field2819 != null && var484 < var102.field2819.length && var102.field2819[var484] != null) {
                                field797[var6++] = var102.field2819[var484];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 2802) {
                            if (var102.field2812 == null) {
                                field797[var6++] = "";
                            } else {
                                field797[var6++] = var102.field2812;
                            }
                            continue;
                        }
                    } else if (var482 < 3200) {
                        if (var482 == 3100) {
                            var6--;
                            String var108 = field797[var6];
                            class12.method112(0, "", var108);
                            continue;
                        }
                        if (var482 == 3101) {
                            var5 -= 2;
                            client.method729(Statics.field1544, field791[var5], field791[var5 + 1]);
                            continue;
                        }
                        if (var482 == 3103) {
                            client.field330.method2578(208);
                            for (class4 var109 = (class4) client.field447.method3506(); var109 != null; var109 = (class4) client.field447.method3500()) {
                                if (var109.field60 == 0 || var109.field60 == 3) {
                                    client.method101(var109, true);
                                }
                            }
                            if (client.field450 != null) {
                                client.method2951(client.field450);
                                client.field450 = null;
                            }
                            continue;
                        }
                        if (var482 == 3104) {
                            var6--;
                            String var110 = field797[var6];
                            int var111 = 0;
                            if (class163.method2018(var110)) {
                                var111 = class163.method1088(var110);
                            }
                            client.field330.method2578(111);
                            client.field330.method2333(var111);
                            continue;
                        }
                        if (var482 == 3105) {
                            var6--;
                            String var112 = field797[var6];
                            client.field330.method2578(122);
                            client.field330.method2436(var112.length() + 1);
                            client.field330.method2336(var112);
                            continue;
                        }
                        if (var482 == 3106) {
                            var6--;
                            String var113 = field797[var6];
                            client.field330.method2578(172);
                            client.field330.method2436(var113.length() + 1);
                            client.field330.method2336(var113);
                            continue;
                        }
                        if (var482 == 3107) {
                            var5--;
                            int var114 = field791[var5];
                            var6--;
                            String var115 = field797[var6];
                            int var116 = class33.field750;
                            int[] var117 = class33.field751;
                            boolean var118 = false;
                            for (int var119 = 0; var119 < var116; var119++) {
                                class3 var120 = client.field409[var117[var119]];
                                if (var120 != null && Statics.field1544 != var120 && var120.field35 != null && var120.field35.equalsIgnoreCase(var115)) {
                                    if (var114 == 1) {
                                        client.field330.method2578(191);
                                        client.field330.method2339(var117[var119]);
                                        client.field330.method2436(0);
                                    } else if (var114 == 4) {
                                        client.field330.method2578(207);
                                        client.field330.method2436(0);
                                        client.field330.method2339(var117[var119]);
                                    } else if (var114 == 6) {
                                        client.field330.method2578(231);
                                        client.field330.method2365(var117[var119]);
                                        client.field330.method2417(0);
                                    } else if (var114 == 7) {
                                        client.field330.method2578(235);
                                        client.field330.method2417(0);
                                        client.field330.method2365(var117[var119]);
                                    }
                                    var118 = true;
                                    break;
                                }
                            }
                            if (!var118) {
                                class12.method112(4, "", class157.field2405 + var115);
                            }
                            continue;
                        }
                        if (var482 == 3108) {
                            var5 -= 3;
                            int var121 = field791[var5];
                            int var122 = field791[var5 + 1];
                            int var123 = field791[var5 + 2];
                            class173 var124 = class173.method2966(var123);
                            client.method1948(var124, var121, var122);
                            continue;
                        }
                        if (var482 == 3109) {
                            var5 -= 2;
                            int var125 = field791[var5];
                            int var126 = field791[var5 + 1];
                            class173 var127 = var48 ? Statics.field2081 : Statics.field264;
                            client.method1948(var127, var125, var126);
                            continue;
                        }
                        if (var482 == 3110) {
                            var5--;
                            Statics.field312 = field791[var5] == 1;
                            continue;
                        }
                        if (var482 == 3111) {
                            field791[var5++] = Statics.field1389.field136 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3112) {
                            var5--;
                            Statics.field1389.field136 = field791[var5] == 1;
                            class9.method86();
                            continue;
                        }
                        if (var482 == 3113) {
                            var6--;
                            String var128 = field797[var6];
                            var5--;
                            boolean var129 = field791[var5] == 1;
                            class138.method2643(var128, var129, "openjs", false);
                            continue;
                        }
                        if (var482 == 3115) {
                            var5--;
                            int var130 = field791[var5];
                            client.field330.method2578(242);
                            client.field330.method2331(var130);
                            continue;
                        }
                        if (var482 == 3116) {
                            var5--;
                            int var131 = field791[var5];
                            var6 -= 2;
                            String var132 = field797[var6];
                            String var133 = field797[var6 + 1];
                            if (var132.length() <= 500 && var133.length() <= 500) {
                                client.field330.method2578(6);
                                client.field330.method2331(1 + class119.method141(var132) + class119.method141(var133));
                                client.field330.method2336(var133);
                                client.field330.method2336(var132);
                                client.field330.method2368(var131);
                            }
                            continue;
                        }
                    } else if (var482 < 3300) {
                        if (var482 == 3200) {
                            var5 -= 3;
                            client.method666(field791[var5], field791[var5 + 1], field791[var5 + 2]);
                            continue;
                        }
                        if (var482 == 3201) {
                            var5--;
                            client.method2602(field791[var5]);
                            continue;
                        }
                        if (var482 == 3202) {
                            var5 -= 2;
                            client.method726(field791[var5], field791[var5 + 1]);
                            continue;
                        }
                    } else if (var482 < 3400) {
                        if (var482 == 3300) {
                            field791[var5++] = client.field290;
                            continue;
                        }
                        if (var482 == 3301) {
                            var5 -= 2;
                            int var134 = field791[var5];
                            int var135 = field791[var5 + 1];
                            int[] var136 = field791;
                            int var137 = var5++;
                            class16 var138 = (class16) class16.field213.method3496((long) var134);
                            int var139;
                            if (var138 == null) {
                                var139 = -1;
                            } else if (var135 >= 0 && var135 < var138.field216.length) {
                                var139 = var138.field216[var135];
                            } else {
                                var139 = -1;
                            }
                            var136[var137] = var139;
                            continue;
                        }
                        if (var482 == 3302) {
                            var5 -= 2;
                            int var140 = field791[var5];
                            int var141 = field791[var5 + 1];
                            int[] var142 = field791;
                            int var143 = var5++;
                            class16 var144 = (class16) class16.field213.method3496((long) var140);
                            int var145;
                            if (var144 == null) {
                                var145 = 0;
                            } else if (var141 >= 0 && var141 < var144.field210.length) {
                                var145 = var144.field210[var141];
                            } else {
                                var145 = 0;
                            }
                            var142[var143] = var145;
                            continue;
                        }
                        if (var482 == 3303) {
                            var5 -= 2;
                            int var146 = field791[var5];
                            int var147 = field791[var5 + 1];
                            int[] var148 = field791;
                            int var149 = var5++;
                            class16 var150 = (class16) class16.field213.method3496((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 == -1) {
                                var151 = 0;
                            } else {
                                int var152 = 0;
                                for (int var153 = 0; var153 < var150.field210.length; var153++) {
                                    if (var150.field216[var153] == var147) {
                                        var152 += var150.field210[var153];
                                    }
                                }
                                var151 = var152;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var482 == 3304) {
                            var5--;
                            int var154 = field791[var5];
                            field791[var5++] = class51.method3228(var154).field1099;
                            continue;
                        }
                        if (var482 == 3305) {
                            var5--;
                            int var155 = field791[var5];
                            field791[var5++] = client.field423[var155];
                            continue;
                        }
                        if (var482 == 3306) {
                            var5--;
                            int var156 = field791[var5];
                            field791[var5++] = client.field424[var156];
                            continue;
                        }
                        if (var482 == 3307) {
                            var5--;
                            int var157 = field791[var5];
                            field791[var5++] = client.field425[var157];
                            continue;
                        }
                        if (var482 == 3308) {
                            int var158 = Statics.field1181;
                            int var159 = (Statics.field1544.field866 >> 7) + Statics.field1201;
                            int var160 = (Statics.field1544.field814 >> 7) + Statics.field1150;
                            field791[var5++] = (var158 << 28) + (var159 << 14) + var160;
                            continue;
                        }
                        if (var482 == 3309) {
                            var5--;
                            int var161 = field791[var5];
                            field791[var5++] = var161 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var482 == 3310) {
                            var5--;
                            int var162 = field791[var5];
                            field791[var5++] = var162 >> 28;
                            continue;
                        }
                        if (var482 == 3311) {
                            var5--;
                            int var163 = field791[var5];
                            field791[var5++] = var163 & 0x3FFF;
                            continue;
                        }
                        if (var482 == 3312) {
                            field791[var5++] = client.field361 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3313) {
                            var5 -= 2;
                            int var164 = field791[var5] + 32768;
                            int var165 = field791[var5 + 1];
                            int[] var166 = field791;
                            int var167 = var5++;
                            class16 var168 = (class16) class16.field213.method3496((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = -1;
                            } else if (var165 >= 0 && var165 < var168.field216.length) {
                                var169 = var168.field216[var165];
                            } else {
                                var169 = -1;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var482 == 3314) {
                            var5 -= 2;
                            int var170 = field791[var5] + 32768;
                            int var171 = field791[var5 + 1];
                            int[] var172 = field791;
                            int var173 = var5++;
                            class16 var174 = (class16) class16.field213.method3496((long) var170);
                            int var175;
                            if (var174 == null) {
                                var175 = 0;
                            } else if (var171 >= 0 && var171 < var174.field210.length) {
                                var175 = var174.field210[var171];
                            } else {
                                var175 = 0;
                            }
                            var172[var173] = var175;
                            continue;
                        }
                        if (var482 == 3315) {
                            var5 -= 2;
                            int var176 = field791[var5] + 32768;
                            int var177 = field791[var5 + 1];
                            int[] var178 = field791;
                            int var179 = var5++;
                            class16 var180 = (class16) class16.field213.method3496((long) var176);
                            int var181;
                            if (var180 == null) {
                                var181 = 0;
                            } else if (var177 == -1) {
                                var181 = 0;
                            } else {
                                int var182 = 0;
                                for (int var183 = 0; var183 < var180.field210.length; var183++) {
                                    if (var180.field216[var183] == var177) {
                                        var182 += var180.field210[var183];
                                    }
                                }
                                var181 = var182;
                            }
                            var178[var179] = var181;
                            continue;
                        }
                        if (var482 == 3316) {
                            if (client.field384 >= 2) {
                                field791[var5++] = client.field384;
                            } else {
                                field791[var5++] = 0;
                            }
                            continue;
                        }
                        if (var482 == 3317) {
                            field791[var5++] = client.field303;
                            continue;
                        }
                        if (var482 == 3318) {
                            field791[var5++] = client.field460;
                            continue;
                        }
                        if (var482 == 3321) {
                            field791[var5++] = client.field451;
                            continue;
                        }
                        if (var482 == 3322) {
                            field791[var5++] = client.field461;
                            continue;
                        }
                        if (var482 == 3323) {
                            if (client.field422) {
                                field791[var5++] = 1;
                            } else {
                                field791[var5++] = 0;
                            }
                            continue;
                        }
                        if (var482 == 3324) {
                            field791[var5++] = client.field287;
                            continue;
                        }
                    } else if (var482 < 3500) {
                        if (var482 == 3400) {
                            var5 -= 2;
                            int var184 = field791[var5];
                            int var185 = field791[var5 + 1];
                            class49 var186 = Statics.method1947(var184);
                            if (var186.field1083 != 's') {
                            }
                            for (int var187 = 0; var187 < var186.field1077; var187++) {
                                if (var186.field1078[var187] == var185) {
                                    field797[var6++] = var186.field1071[var187];
                                    var186 = null;
                                    break;
                                }
                            }
                            if (var186 != null) {
                                field797[var6++] = var186.field1084;
                            }
                            continue;
                        }
                        if (var482 == 3408) {
                            var5 -= 4;
                            int var188 = field791[var5];
                            int var189 = field791[var5 + 1];
                            int var190 = field791[var5 + 2];
                            int var191 = field791[var5 + 3];
                            class49 var192 = Statics.method1947(var190);
                            if (var192.field1072 == var188 && var192.field1083 == var189) {
                                for (int var193 = 0; var193 < var192.field1077; var193++) {
                                    if (var192.field1078[var193] == var191) {
                                        if (var189 == 115) {
                                            field797[var6++] = var192.field1071[var193];
                                        } else {
                                            field791[var5++] = var192.field1079[var193];
                                        }
                                        var192 = null;
                                        break;
                                    }
                                }
                                if (var192 != null) {
                                    if (var189 == 115) {
                                        field797[var6++] = var192.field1084;
                                    } else {
                                        field791[var5++] = var192.field1076;
                                    }
                                }
                                continue;
                            }
                            if (var189 == 115) {
                                field797[var6++] = "null";
                            } else {
                                field791[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var482 < 3700) {
                        if (var482 == 3600) {
                            if (client.field456 == 0) {
                                field791[var5++] = -2;
                            } else if (client.field456 == 1) {
                                field791[var5++] = -1;
                            } else {
                                field791[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var482 == 3601) {
                            var5--;
                            int var194 = field791[var5];
                            if (client.field456 == 2 && var194 < client.field554) {
                                field797[var6++] = client.field486[var194].field243;
                                field797[var6++] = client.field486[var194].field242;
                                continue;
                            }
                            field797[var6++] = "";
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 3602) {
                            var5--;
                            int var195 = field791[var5];
                            if (client.field456 == 2 && var195 < client.field554) {
                                field791[var5++] = client.field486[var195].field241;
                                continue;
                            }
                            field791[var5++] = 0;
                            continue;
                        }
                        if (var482 == 3603) {
                            var5--;
                            int var196 = field791[var5];
                            if (client.field456 == 2 && var196 < client.field554) {
                                field791[var5++] = client.field486[var196].field244;
                                continue;
                            }
                            field791[var5++] = 0;
                            continue;
                        }
                        if (var482 == 3604) {
                            var6--;
                            String var197 = field797[var6];
                            var5--;
                            int var198 = field791[var5];
                            client.field330.method2578(56);
                            client.field330.method2436(class119.method141(var197) + 1);
                            client.field330.method2417(var198);
                            client.field330.method2336(var197);
                            continue;
                        }
                        if (var482 == 3605) {
                            var6--;
                            String var199 = field797[var6];
                            if (var199 == null) {
                                continue;
                            }
                            if ((client.field554 < 200 || client.field411 == 1) && client.field554 < 400) {
                                String var200 = class164.method48(var199, Statics.field289);
                                if (var200 == null) {
                                    continue;
                                }
                                for (int var201 = 0; var201 < client.field554; var201++) {
                                    class18 var202 = client.field486[var201];
                                    String var203 = class164.method48(var202.field243, Statics.field289);
                                    if (var203 != null && var203.equals(var200)) {
                                        class12.method112(30, "", var199 + class157.field2467);
                                        continue label3037;
                                    }
                                    if (var202.field242 != null) {
                                        String var204 = class164.method48(var202.field242, Statics.field289);
                                        if (var204 != null && var204.equals(var200)) {
                                            class12.method112(30, "", var199 + class157.field2467);
                                            continue label3037;
                                        }
                                    }
                                }
                                for (int var205 = 0; var205 < client.field558; var205++) {
                                    class8 var206 = client.field421[var205];
                                    String var207 = class164.method48(var206.field131, Statics.field289);
                                    if (var207 != null && var207.equals(var200)) {
                                        class12.method112(30, "", class157.field2472 + var199 + class157.field2473);
                                        continue label3037;
                                    }
                                    if (var206.field125 != null) {
                                        String var208 = class164.method48(var206.field125, Statics.field289);
                                        if (var208 != null && var208.equals(var200)) {
                                            class12.method112(30, "", class157.field2472 + var199 + class157.field2473);
                                            continue label3037;
                                        }
                                    }
                                }
                                if (class164.method48(Statics.field1544.field35, Statics.field289).equals(var200)) {
                                    class12.method112(30, "", class157.field2470);
                                } else {
                                    client.field330.method2578(82);
                                    client.field330.method2436(class119.method141(var199));
                                    client.field330.method2336(var199);
                                }
                                continue;
                            }
                            class12.method112(30, "", class157.field2439);
                            continue;
                        }
                        if (var482 == 3606) {
                            var6--;
                            String var209 = field797[var6];
                            if (var209 == null) {
                                continue;
                            }
                            String var210 = class164.method48(var209, Statics.field289);
                            if (var210 == null) {
                                continue;
                            }
                            int var211 = 0;
                            while (true) {
                                if (var211 >= client.field554) {
                                    continue label3037;
                                }
                                class18 var212 = client.field486[var211];
                                String var213 = var212.field243;
                                String var214 = class164.method48(var213, Statics.field289);
                                if (class129.method768(var209, var210, var213, var214)) {
                                    client.field554--;
                                    for (int var215 = var211; var215 < client.field554; var215++) {
                                        client.field486[var215] = client.field486[var215 + 1];
                                    }
                                    client.field433 = client.field566;
                                    client.field330.method2578(186);
                                    client.field330.method2436(class119.method141(var209));
                                    client.field330.method2336(var209);
                                    continue label3037;
                                }
                                var211++;
                            }
                        }
                        if (var482 == 3607) {
                            var6--;
                            String var216 = field797[var6];
                            client.method647(var216, false);
                            continue;
                        }
                        if (var482 == 3608) {
                            var6--;
                            String var217 = field797[var6];
                            client.method2936(var217);
                            continue;
                        }
                        if (var482 == 3609) {
                            var6--;
                            String var218 = field797[var6];
                            class152[] var219 = new class152[] { class152.field2262, class152.field2255, class152.field2254, class152.field2253, class152.field2256 };
                            class152[] var220 = var219;
                            for (int var221 = 0; var221 < var220.length; var221++) {
                                class152 var222 = var220[var221];
                                if (var222.field2258 != -1) {
                                    int var224 = var222.field2258;
                                    String var225 = "<img=" + var224 + ">";
                                    if (var218.startsWith(var225)) {
                                        var218 = var218.substring(6 + Integer.toString(var222.field2258).length());
                                        break;
                                    }
                                }
                            }
                            field791[var5++] = client.method4(var218, false) ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3611) {
                            if (client.field366 == null) {
                                field797[var6++] = "";
                                continue;
                            }
                            String[] var226 = field797;
                            int var227 = var6++;
                            String var228 = client.field366;
                            long var229 = 0L;
                            int var231 = var228.length();
                            for (int var232 = 0; var232 < var231; var232++) {
                                var229 *= 37L;
                                char var233 = var228.charAt(var232);
                                if (var233 >= 'A' && var233 <= 'Z') {
                                    var229 += (long) (var233 + 1 - 65);
                                } else if (var233 >= 'a' && var233 <= 'z') {
                                    var229 += (long) (var233 + 1 - 97);
                                } else if (var233 >= '0' && var233 <= '9') {
                                    var229 += (long) (var233 + 27 - 48);
                                }
                                if (var229 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var229 % 37L == 0L && var229 != 0L) {
                                var229 /= 37L;
                            }
                            String var236 = Statics.method842(var229);
                            if (var236 == null) {
                                var236 = "";
                            }
                            var226[var227] = var236;
                            continue;
                        }
                        if (var482 == 3612) {
                            if (client.field366 == null) {
                                field791[var5++] = 0;
                            } else {
                                field791[var5++] = Statics.field679;
                            }
                            continue;
                        }
                        if (var482 == 3613) {
                            var5--;
                            int var238 = field791[var5];
                            if (client.field366 != null && var238 < Statics.field679) {
                                field797[var6++] = Statics.field170[var238].field622;
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 3614) {
                            var5--;
                            int var239 = field791[var5];
                            if (client.field366 != null && var239 < Statics.field679) {
                                field791[var5++] = Statics.field170[var239].field623;
                                continue;
                            }
                            field791[var5++] = 0;
                            continue;
                        }
                        if (var482 == 3615) {
                            var5--;
                            int var240 = field791[var5];
                            if (client.field366 != null && var240 < Statics.field679) {
                                field791[var5++] = Statics.field170[var240].field631;
                                continue;
                            }
                            field791[var5++] = 0;
                            continue;
                        }
                        if (var482 == 3616) {
                            field791[var5++] = Statics.field2241;
                            continue;
                        }
                        if (var482 == 3617) {
                            var6--;
                            String var241 = field797[var6];
                            if (Statics.field170 != null) {
                                client.field330.method2578(218);
                                client.field330.method2436(class119.method141(var241));
                                client.field330.method2336(var241);
                            }
                            continue;
                        }
                        if (var482 == 3618) {
                            field791[var5++] = Statics.field238;
                            continue;
                        }
                        if (var482 == 3619) {
                            var6--;
                            String var242 = field797[var6];
                            if (!var242.equals("")) {
                                client.field330.method2578(166);
                                client.field330.method2436(class119.method141(var242));
                                client.field330.method2336(var242);
                            }
                            continue;
                        }
                        if (var482 == 3620) {
                            client.method2225();
                            continue;
                        }
                        if (var482 == 3621) {
                            if (client.field456 == 0) {
                                field791[var5++] = -1;
                            } else {
                                field791[var5++] = client.field558;
                            }
                            continue;
                        }
                        if (var482 == 3622) {
                            var5--;
                            int var243 = field791[var5];
                            if (client.field456 != 0 && var243 < client.field558) {
                                field797[var6++] = client.field421[var243].field131;
                                field797[var6++] = client.field421[var243].field125;
                                continue;
                            }
                            field797[var6++] = "";
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 3623) {
                            String var244;
                            label2725: {
                                var6--;
                                var244 = field797[var6];
                                String var246 = "<img=0>";
                                if (!var244.startsWith(var246)) {
                                    String var248 = "<img=1>";
                                    if (!var244.startsWith(var248)) {
                                        break label2725;
                                    }
                                }
                                var244 = var244.substring(7);
                            }
                            field791[var5++] = client.method113(var244) ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3624) {
                            var5--;
                            int var249 = field791[var5];
                            if (Statics.field170 != null && var249 < Statics.field679 && Statics.field170[var249].field622.equalsIgnoreCase(Statics.field1544.field35)) {
                                field791[var5++] = 1;
                                continue;
                            }
                            field791[var5++] = 0;
                            continue;
                        }
                        if (var482 == 3625) {
                            if (client.field515 == null) {
                                field797[var6++] = "";
                                continue;
                            }
                            String[] var250 = field797;
                            int var251 = var6++;
                            String var252 = client.field515;
                            long var253 = 0L;
                            int var255 = var252.length();
                            for (int var256 = 0; var256 < var255; var256++) {
                                var253 *= 37L;
                                char var257 = var252.charAt(var256);
                                if (var257 >= 'A' && var257 <= 'Z') {
                                    var253 += (long) (var257 + 1 - 65);
                                } else if (var257 >= 'a' && var257 <= 'z') {
                                    var253 += (long) (var257 + 1 - 97);
                                } else if (var257 >= '0' && var257 <= '9') {
                                    var253 += (long) (var257 + 27 - 48);
                                }
                                if (var253 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var253 % 37L == 0L && var253 != 0L) {
                                var253 /= 37L;
                            }
                            String var260 = Statics.method842(var253);
                            if (var260 == null) {
                                var260 = "";
                            }
                            var250[var251] = var260;
                            continue;
                        }
                    } else if (var482 < 4000) {
                        if (var482 == 3903) {
                            var5--;
                            int var262 = field791[var5];
                            field791[var5++] = client.field563[var262].method3696();
                            continue;
                        }
                        if (var482 == 3904) {
                            var5--;
                            int var263 = field791[var5];
                            field791[var5++] = client.field563[var263].field3153;
                            continue;
                        }
                        if (var482 == 3905) {
                            var5--;
                            int var264 = field791[var5];
                            field791[var5++] = client.field563[var264].field3154;
                            continue;
                        }
                        if (var482 == 3906) {
                            var5--;
                            int var265 = field791[var5];
                            field791[var5++] = client.field563[var265].field3155;
                            continue;
                        }
                        if (var482 == 3907) {
                            var5--;
                            int var266 = field791[var5];
                            field791[var5++] = client.field563[var266].field3156;
                            continue;
                        }
                        if (var482 == 3908) {
                            var5--;
                            int var267 = field791[var5];
                            field791[var5++] = client.field563[var267].field3152;
                            continue;
                        }
                        if (var482 == 3910) {
                            var5--;
                            int var268 = field791[var5];
                            int var269 = client.field563[var268].method3711();
                            field791[var5++] = var269 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3911) {
                            var5--;
                            int var270 = field791[var5];
                            int var271 = client.field563[var270].method3711();
                            field791[var5++] = var271 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3912) {
                            var5--;
                            int var272 = field791[var5];
                            int var273 = client.field563[var272].method3711();
                            field791[var5++] = var273 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3913) {
                            var5--;
                            int var274 = field791[var5];
                            int var275 = client.field563[var274].method3711();
                            field791[var5++] = var275 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 3914) {
                            var5--;
                            boolean var276 = field791[var5] == 1;
                            if (Statics.field133 != null) {
                                Statics.field133.method3716(class221.field3161, var276);
                            }
                            continue;
                        }
                        if (var482 == 3915) {
                            var5--;
                            boolean var277 = field791[var5] == 1;
                            if (Statics.field133 != null) {
                                Statics.field133.method3716(class221.field3160, var277);
                            }
                            continue;
                        }
                        if (var482 == 3916) {
                            var5 -= 2;
                            boolean var278 = field791[var5] == 1;
                            boolean var279 = field791[var5 + 1] == 1;
                            if (Statics.field133 != null) {
                                Statics.field133.method3716(new class22(var279), var278);
                            }
                            continue;
                        }
                        if (var482 == 3917) {
                            var5--;
                            boolean var280 = field791[var5] == 1;
                            if (Statics.field133 != null) {
                                Statics.field133.method3716(class221.field3163, var280);
                            }
                            continue;
                        }
                        if (var482 == 3918) {
                            var5--;
                            boolean var281 = field791[var5] == 1;
                            if (Statics.field133 != null) {
                                Statics.field133.method3716(class221.field3162, var281);
                            }
                            continue;
                        }
                        if (var482 == 3919) {
                            field791[var5++] = Statics.field133 == null ? 0 : Statics.field133.field3159.size();
                            continue;
                        }
                        if (var482 == 3920) {
                            var5--;
                            int var282 = field791[var5];
                            class214 var283 = (class214) Statics.field133.field3159.get(var282);
                            field791[var5++] = var283.field3136;
                            continue;
                        }
                        if (var482 == 3921) {
                            var5--;
                            int var284 = field791[var5];
                            class214 var285 = (class214) Statics.field133.field3159.get(var284);
                            field797[var6++] = var285.method3660();
                            continue;
                        }
                        if (var482 == 3922) {
                            var5--;
                            int var286 = field791[var5];
                            class214 var287 = (class214) Statics.field133.field3159.get(var286);
                            field797[var6++] = var287.method3662();
                            continue;
                        }
                        if (var482 == 3923) {
                            var5--;
                            int var288 = field791[var5];
                            class214 var289 = (class214) Statics.field133.field3159.get(var288);
                            long var290 = class115.method2134() - Statics.field1161 - var289.field3137;
                            int var292 = (int) (var290 / 3600000L);
                            int var293 = (int) ((var290 - (long) (var292 * 3600000)) / 60000L);
                            int var294 = (int) ((var290 - (long) (var292 * 3600000) - (long) (var293 * 60000)) / 1000L);
                            String var295 = var292 + ":" + var293 / 10 + var293 % 10 + ":" + var294 / 10 + var294 % 10;
                            field797[var6++] = var295;
                            continue;
                        }
                        if (var482 == 3924) {
                            var5--;
                            int var296 = field791[var5];
                            class214 var297 = (class214) Statics.field133.field3159.get(var296);
                            field791[var5++] = var297.field3133.field3155;
                            continue;
                        }
                        if (var482 == 3925) {
                            var5--;
                            int var298 = field791[var5];
                            class214 var299 = (class214) Statics.field133.field3159.get(var298);
                            field791[var5++] = var299.field3133.field3154;
                            continue;
                        }
                        if (var482 == 3926) {
                            var5--;
                            int var300 = field791[var5];
                            class214 var301 = (class214) Statics.field133.field3159.get(var300);
                            field791[var5++] = var301.field3133.field3153;
                            continue;
                        }
                    } else if (var482 < 4100) {
                        if (var482 == 4000) {
                            var5 -= 2;
                            int var302 = field791[var5];
                            int var303 = field791[var5 + 1];
                            field791[var5++] = var302 + var303;
                            continue;
                        }
                        if (var482 == 4001) {
                            var5 -= 2;
                            int var304 = field791[var5];
                            int var305 = field791[var5 + 1];
                            field791[var5++] = var304 - var305;
                            continue;
                        }
                        if (var482 == 4002) {
                            var5 -= 2;
                            int var306 = field791[var5];
                            int var307 = field791[var5 + 1];
                            field791[var5++] = var306 * var307;
                            continue;
                        }
                        if (var482 == 4003) {
                            var5 -= 2;
                            int var308 = field791[var5];
                            int var309 = field791[var5 + 1];
                            field791[var5++] = var308 / var309;
                            continue;
                        }
                        if (var482 == 4004) {
                            var5--;
                            int var310 = field791[var5];
                            field791[var5++] = (int) (Math.random() * (double) var310);
                            continue;
                        }
                        if (var482 == 4005) {
                            var5--;
                            int var311 = field791[var5];
                            field791[var5++] = (int) (Math.random() * (double) (var311 + 1));
                            continue;
                        }
                        if (var482 == 4006) {
                            var5 -= 5;
                            int var312 = field791[var5];
                            int var313 = field791[var5 + 1];
                            int var314 = field791[var5 + 2];
                            int var315 = field791[var5 + 3];
                            int var316 = field791[var5 + 4];
                            field791[var5++] = (var313 - var312) * (var316 - var314) / (var315 - var314) + var312;
                            continue;
                        }
                        if (var482 == 4007) {
                            var5 -= 2;
                            int var317 = field791[var5];
                            int var318 = field791[var5 + 1];
                            field791[var5++] = var317 * var318 / 100 + var317;
                            continue;
                        }
                        if (var482 == 4008) {
                            var5 -= 2;
                            int var319 = field791[var5];
                            int var320 = field791[var5 + 1];
                            field791[var5++] = var319 | 0x1 << var320;
                            continue;
                        }
                        if (var482 == 4009) {
                            var5 -= 2;
                            int var321 = field791[var5];
                            int var322 = field791[var5 + 1];
                            field791[var5++] = var321 & -1 - (0x1 << var322);
                            continue;
                        }
                        if (var482 == 4010) {
                            var5 -= 2;
                            int var323 = field791[var5];
                            int var324 = field791[var5 + 1];
                            field791[var5++] = (var323 & 0x1 << var324) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var482 == 4011) {
                            var5 -= 2;
                            int var325 = field791[var5];
                            int var326 = field791[var5 + 1];
                            field791[var5++] = var325 % var326;
                            continue;
                        }
                        if (var482 == 4012) {
                            var5 -= 2;
                            int var327 = field791[var5];
                            int var328 = field791[var5 + 1];
                            if (var327 == 0) {
                                field791[var5++] = 0;
                            } else {
                                field791[var5++] = (int) Math.pow((double) var327, (double) var328);
                            }
                            continue;
                        }
                        if (var482 == 4013) {
                            var5 -= 2;
                            int var329 = field791[var5];
                            int var330 = field791[var5 + 1];
                            if (var329 == 0) {
                                field791[var5++] = 0;
                            } else if (var330 == 0) {
                                field791[var5++] = Integer.MAX_VALUE;
                            } else {
                                field791[var5++] = (int) Math.pow((double) var329, 1.0D / (double) var330);
                            }
                            continue;
                        }
                        if (var482 == 4014) {
                            var5 -= 2;
                            int var331 = field791[var5];
                            int var332 = field791[var5 + 1];
                            field791[var5++] = var331 & var332;
                            continue;
                        }
                        if (var482 == 4015) {
                            var5 -= 2;
                            int var333 = field791[var5];
                            int var334 = field791[var5 + 1];
                            field791[var5++] = var333 | var334;
                            continue;
                        }
                    } else if (var482 < 4200) {
                        if (var482 == 4100) {
                            var6--;
                            String var335 = field797[var6];
                            var5--;
                            int var336 = field791[var5];
                            field797[var6++] = var335 + var336;
                            continue;
                        }
                        if (var482 == 4101) {
                            var6 -= 2;
                            String var337 = field797[var6];
                            String var338 = field797[var6 + 1];
                            field797[var6++] = var337 + var338;
                            continue;
                        }
                        if (var482 == 4102) {
                            var6--;
                            String var339 = field797[var6];
                            var5--;
                            int var340 = field791[var5];
                            String[] var341 = field797;
                            int var342 = var6++;
                            String var344;
                            if (var340 < 0) {
                                var344 = Integer.toString(var340);
                            } else {
                                var344 = class163.method2945(var340, 10, true);
                            }
                            var341[var342] = var339 + var344;
                            continue;
                        }
                        if (var482 == 4103) {
                            var6--;
                            String var345 = field797[var6];
                            field797[var6++] = var345.toLowerCase();
                            continue;
                        }
                        if (var482 == 4104) {
                            var5--;
                            int var346 = field791[var5];
                            long var347 = ((long) var346 + 11745L) * 86400000L;
                            field800.setTime(new Date(var347));
                            int var349 = field800.get(5);
                            int var350 = field800.get(2);
                            int var351 = field800.get(1);
                            field797[var6++] = var349 + "-" + field808[var350] + "-" + var351;
                            continue;
                        }
                        if (var482 == 4105) {
                            var6 -= 2;
                            String var352 = field797[var6];
                            String var353 = field797[var6 + 1];
                            if (Statics.field1544.field30 != null && Statics.field1544.field30.field2902) {
                                field797[var6++] = var353;
                                continue;
                            }
                            field797[var6++] = var352;
                            continue;
                        }
                        if (var482 == 4106) {
                            var5--;
                            int var354 = field791[var5];
                            field797[var6++] = Integer.toString(var354);
                            continue;
                        }
                        if (var482 == 4107) {
                            var6 -= 2;
                            int[] var355 = field791;
                            int var356 = var5++;
                            int var357 = class166.method2132(field797[var6], field797[var6 + 1], client.field358);
                            byte var358;
                            if (var357 > 0) {
                                var358 = 1;
                            } else if (var357 < 0) {
                                var358 = -1;
                            } else {
                                var358 = 0;
                            }
                            var355[var356] = var358;
                            continue;
                        }
                        if (var482 == 4108) {
                            var6--;
                            String var359 = field797[var6];
                            var5 -= 2;
                            int var360 = field791[var5];
                            int var361 = field791[var5 + 1];
                            byte[] var362 = Statics.field318.method3035(var361, 0);
                            class224 var363 = new class224(var362);
                            field791[var5++] = var363.method3788(var359, var360);
                            continue;
                        }
                        if (var482 == 4109) {
                            var6--;
                            String var364 = field797[var6];
                            var5 -= 2;
                            int var365 = field791[var5];
                            int var366 = field791[var5 + 1];
                            byte[] var367 = Statics.field318.method3035(var366, 0);
                            class224 var368 = new class224(var367);
                            field791[var5++] = var368.method3744(var364, var365);
                            continue;
                        }
                        if (var482 == 4110) {
                            var6 -= 2;
                            String var369 = field797[var6];
                            String var370 = field797[var6 + 1];
                            var5--;
                            if (field791[var5] == 1) {
                                field797[var6++] = var369;
                            } else {
                                field797[var6++] = var370;
                            }
                            continue;
                        }
                        if (var482 == 4111) {
                            var6--;
                            String var371 = field797[var6];
                            field797[var6++] = class223.method3732(var371);
                            continue;
                        }
                        if (var482 == 4112) {
                            var6--;
                            String var372 = field797[var6];
                            var5--;
                            int var373 = field791[var5];
                            field797[var6++] = var372 + (char) var373;
                            continue;
                        }
                        if (var482 == 4113) {
                            var5--;
                            int var374 = field791[var5];
                            int[] var375 = field791;
                            int var376 = var5++;
                            char var377 = (char) var374;
                            boolean var378;
                            if (var377 >= ' ' && var377 <= '~') {
                                var378 = true;
                            } else if (var377 >= 160 && var377 <= 255) {
                                var378 = true;
                            } else if (var377 == 8364 || var377 == 338 || var377 == 8212 || var377 == 339 || var377 == 376) {
                                var378 = true;
                            } else {
                                var378 = false;
                            }
                            var375[var376] = var378 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 4114) {
                            var5--;
                            int var379 = field791[var5];
                            int[] var380 = field791;
                            int var381 = var5++;
                            char var382 = (char) var379;
                            boolean var383 = var382 >= '0' && var382 <= '9' || var382 >= 'A' && var382 <= 'Z' || var382 >= 'a' && var382 <= 'z';
                            var380[var381] = var383 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 4115) {
                            var5--;
                            int var384 = field791[var5];
                            field791[var5++] = class163.method2133((char) var384) ? 1 : 0;
                            continue;
                        }
                        if (var482 == 4116) {
                            var5--;
                            int var385 = field791[var5];
                            int[] var386 = field791;
                            int var387 = var5++;
                            char var388 = (char) var385;
                            boolean var389 = var388 >= '0' && var388 <= '9';
                            var386[var387] = var389 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 4117) {
                            var6--;
                            String var390 = field797[var6];
                            if (var390 == null) {
                                field791[var5++] = 0;
                            } else {
                                field791[var5++] = var390.length();
                            }
                            continue;
                        }
                        if (var482 == 4118) {
                            var6--;
                            String var391 = field797[var6];
                            var5 -= 2;
                            int var392 = field791[var5];
                            int var393 = field791[var5 + 1];
                            field797[var6++] = var391.substring(var392, var393);
                            continue;
                        }
                        if (var482 == 4119) {
                            var6--;
                            String var394 = field797[var6];
                            StringBuilder var395 = new StringBuilder(var394.length());
                            boolean var396 = false;
                            for (int var397 = 0; var397 < var394.length(); var397++) {
                                char var398 = var394.charAt(var397);
                                if (var398 == '<') {
                                    var396 = true;
                                } else if (var398 == '>') {
                                    var396 = false;
                                } else if (!var396) {
                                    var395.append(var398);
                                }
                            }
                            field797[var6++] = var395.toString();
                            continue;
                        }
                        if (var482 == 4120) {
                            var6--;
                            String var399 = field797[var6];
                            var5--;
                            int var400 = field791[var5];
                            field791[var5++] = var399.indexOf(var400);
                            continue;
                        }
                        if (var482 == 4121) {
                            var6 -= 2;
                            String var401 = field797[var6];
                            String var402 = field797[var6 + 1];
                            var5--;
                            int var403 = field791[var5];
                            field791[var5++] = var401.indexOf(var402, var403);
                            continue;
                        }
                    } else if (var482 < 4300) {
                        if (var482 == 4200) {
                            var5--;
                            int var404 = field791[var5];
                            field797[var6++] = class52.method970(var404).field1119;
                            continue;
                        }
                        if (var482 == 4201) {
                            var5 -= 2;
                            int var405 = field791[var5];
                            int var406 = field791[var5 + 1];
                            class52 var407 = class52.method970(var405);
                            if (var406 >= 1 && var406 <= 5 && var407.field1133[var406 - 1] != null) {
                                field797[var6++] = var407.field1133[var406 - 1];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 4202) {
                            var5 -= 2;
                            int var408 = field791[var5];
                            int var409 = field791[var5 + 1];
                            class52 var410 = class52.method970(var408);
                            if (var409 >= 1 && var409 <= 5 && var410.field1134[var409 - 1] != null) {
                                field797[var6++] = var410.field1134[var409 - 1];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var482 == 4203) {
                            var5--;
                            int var411 = field791[var5];
                            field791[var5++] = class52.method970(var411).field1112;
                            continue;
                        }
                        if (var482 == 4204) {
                            var5--;
                            int var412 = field791[var5];
                            field791[var5++] = class52.method970(var412).field1130 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 4205) {
                            var5--;
                            int var413 = field791[var5];
                            class52 var414 = class52.method970(var413);
                            if (var414.field1115 == -1 && var414.field1149 >= 0) {
                                field791[var5++] = var414.field1149;
                                continue;
                            }
                            field791[var5++] = var413;
                            continue;
                        }
                        if (var482 == 4206) {
                            var5--;
                            int var415 = field791[var5];
                            class52 var416 = class52.method970(var415);
                            if (var416.field1115 >= 0 && var416.field1149 >= 0) {
                                field791[var5++] = var416.field1149;
                                continue;
                            }
                            field791[var5++] = var415;
                            continue;
                        }
                        if (var482 == 4207) {
                            var5--;
                            int var417 = field791[var5];
                            field791[var5++] = class52.method970(var417).field1137 ? 1 : 0;
                            continue;
                        }
                        if (var482 == 4210) {
                            var6--;
                            String var418 = field797[var6];
                            var5--;
                            int var419 = field791[var5];
                            boolean var421 = var419 == 1;
                            String var422 = var418.toLowerCase();
                            short[] var423 = new short[16];
                            int var424 = 0;
                            int var425 = 0;
                            while (true) {
                                if (var425 >= Statics.field1113) {
                                    Statics.field2269 = var423;
                                    Statics.field31 = 0;
                                    Statics.field2239 = var424;
                                    String[] var429 = new String[Statics.field2239];
                                    for (int var430 = 0; var430 < Statics.field2239; var430++) {
                                        var429[var430] = class52.method970(var423[var430]).field1119;
                                    }
                                    short[] var431 = Statics.field2269;
                                    class124.method669(var429, var431, 0, var429.length - 1);
                                    break;
                                }
                                class52 var426 = class52.method970(var425);
                                if ((!var421 || var426.field1132) && var426.field1115 == -1 && var426.field1119.toLowerCase().indexOf(var422) != -1) {
                                    if (var424 >= 250) {
                                        Statics.field2239 = -1;
                                        Statics.field2269 = null;
                                        break;
                                    }
                                    if (var424 >= var423.length) {
                                        short[] var427 = new short[var423.length * 2];
                                        for (int var428 = 0; var428 < var424; var428++) {
                                            var427[var428] = var423[var428];
                                        }
                                        var423 = var427;
                                    }
                                    var423[var424++] = (short) var425;
                                }
                                var425++;
                            }
                            field791[var5++] = Statics.field2239;
                            continue;
                        }
                        if (var482 == 4211) {
                            if (Statics.field2269 != null && Statics.field31 < Statics.field2239) {
                                field791[var5++] = Statics.field2269[++Statics.field31 - 1] & 0xFFFF;
                                continue;
                            }
                            field791[var5++] = -1;
                            continue;
                        }
                        if (var482 == 4212) {
                            Statics.field31 = 0;
                            continue;
                        }
                    } else if (var482 < 5100) {
                        if (var482 == 5000) {
                            field791[var5++] = client.field395;
                            continue;
                        }
                        if (var482 == 5001) {
                            var5 -= 3;
                            client.field395 = field791[var5];
                            Statics.field651 = class130.method2268(field791[var5 + 1]);
                            if (Statics.field651 == null) {
                                Statics.field651 = class130.field2043;
                            }
                            client.field505 = field791[var5 + 2];
                            client.field330.method2578(40);
                            client.field330.method2436(client.field395);
                            client.field330.method2436(Statics.field651.field2046);
                            client.field330.method2436(client.field505);
                            continue;
                        }
                        if (var482 == 5002) {
                            var6--;
                            String var432 = field797[var6];
                            var5 -= 2;
                            int var433 = field791[var5];
                            int var434 = field791[var5 + 1];
                            client.field330.method2578(76);
                            client.field330.method2436(class119.method141(var432) + 2);
                            client.field330.method2336(var432);
                            client.field330.method2436(var433 - 1);
                            client.field330.method2436(var434);
                            continue;
                        }
                        if (var482 == 5003) {
                            var5 -= 2;
                            int var435 = field791[var5];
                            int var436 = field791[var5 + 1];
                            class28 var437 = (class28) class12.field167.get(var435);
                            class36 var438 = var437.method652(var436);
                            if (var438 == null) {
                                field791[var5++] = -1;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                                field797[var6++] = "";
                                field797[var6++] = "";
                            } else {
                                field791[var5++] = var438.field789;
                                field791[var5++] = var438.field782;
                                field797[var6++] = var438.field788 == null ? "" : var438.field788;
                                field797[var6++] = var438.field785 == null ? "" : var438.field785;
                                field797[var6++] = var438.field786 == null ? "" : var438.field786;
                            }
                            continue;
                        }
                        if (var482 == 5004) {
                            var5--;
                            int var440 = field791[var5];
                            class36 var441 = (class36) class12.field166.method3512((long) var440);
                            if (var441 == null) {
                                field791[var5++] = -1;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                                field797[var6++] = "";
                                field797[var6++] = "";
                            } else {
                                field791[var5++] = var441.field783;
                                field791[var5++] = var441.field782;
                                field797[var6++] = var441.field788 == null ? "" : var441.field788;
                                field797[var6++] = var441.field785 == null ? "" : var441.field785;
                                field797[var6++] = var441.field786 == null ? "" : var441.field786;
                            }
                            continue;
                        }
                        if (var482 == 5005) {
                            if (Statics.field651 == null) {
                                field791[var5++] = -1;
                            } else {
                                field791[var5++] = Statics.field651.field2046;
                            }
                            continue;
                        }
                        if (var482 == 5008) {
                            var6--;
                            String var443 = field797[var6];
                            var5--;
                            int var444 = field791[var5];
                            String var445 = var443.toLowerCase();
                            byte var446 = 0;
                            if (var445.startsWith(class157.field2361)) {
                                var446 = 0;
                                var443 = var443.substring(class157.field2361.length());
                            } else if (var445.startsWith(class157.field2478)) {
                                var446 = 1;
                                var443 = var443.substring(class157.field2478.length());
                            } else if (var445.startsWith(class157.field2480)) {
                                var446 = 2;
                                var443 = var443.substring(class157.field2480.length());
                            } else if (var445.startsWith(class157.field2409)) {
                                var446 = 3;
                                var443 = var443.substring(class157.field2409.length());
                            } else if (var445.startsWith(class157.field2322)) {
                                var446 = 4;
                                var443 = var443.substring(class157.field2322.length());
                            } else if (var445.startsWith(class157.field2486)) {
                                var446 = 5;
                                var443 = var443.substring(class157.field2486.length());
                            } else if (var445.startsWith(class157.field2466)) {
                                var446 = 6;
                                var443 = var443.substring(class157.field2466.length());
                            } else if (var445.startsWith(class157.field2490)) {
                                var446 = 7;
                                var443 = var443.substring(class157.field2490.length());
                            } else if (var445.startsWith(class157.field2492)) {
                                var446 = 8;
                                var443 = var443.substring(class157.field2492.length());
                            } else if (var445.startsWith(class157.field2494)) {
                                var446 = 9;
                                var443 = var443.substring(class157.field2494.length());
                            } else if (var445.startsWith(class157.field2496)) {
                                var446 = 10;
                                var443 = var443.substring(class157.field2496.length());
                            } else if (var445.startsWith(class157.field2498)) {
                                var446 = 11;
                                var443 = var443.substring(class157.field2498.length());
                            } else if (client.field358 != 0) {
                                if (var445.startsWith(class157.field2477)) {
                                    var446 = 0;
                                    var443 = var443.substring(class157.field2477.length());
                                } else if (var445.startsWith(class157.field2565)) {
                                    var446 = 1;
                                    var443 = var443.substring(class157.field2565.length());
                                } else if (var445.startsWith(class157.field2568)) {
                                    var446 = 2;
                                    var443 = var443.substring(class157.field2568.length());
                                } else if (var445.startsWith(class157.field2483)) {
                                    var446 = 3;
                                    var443 = var443.substring(class157.field2483.length());
                                } else if (var445.startsWith(class157.field2485)) {
                                    var446 = 4;
                                    var443 = var443.substring(class157.field2485.length());
                                } else if (var445.startsWith(class157.field2487)) {
                                    var446 = 5;
                                    var443 = var443.substring(class157.field2487.length());
                                } else if (var445.startsWith(class157.field2489)) {
                                    var446 = 6;
                                    var443 = var443.substring(class157.field2489.length());
                                } else if (var445.startsWith(class157.field2299)) {
                                    var446 = 7;
                                    var443 = var443.substring(class157.field2299.length());
                                } else if (var445.startsWith(class157.field2493)) {
                                    var446 = 8;
                                    var443 = var443.substring(class157.field2493.length());
                                } else if (var445.startsWith(class157.field2476)) {
                                    var446 = 9;
                                    var443 = var443.substring(class157.field2476.length());
                                } else if (var445.startsWith(class157.field2497)) {
                                    var446 = 10;
                                    var443 = var443.substring(class157.field2497.length());
                                } else if (var445.startsWith(class157.field2499)) {
                                    var446 = 11;
                                    var443 = var443.substring(class157.field2499.length());
                                }
                            }
                            String var447 = var443.toLowerCase();
                            byte var448 = 0;
                            if (var447.startsWith(class157.field2500)) {
                                var448 = 1;
                                var443 = var443.substring(class157.field2500.length());
                            } else if (var447.startsWith(class157.field2502)) {
                                var448 = 2;
                                var443 = var443.substring(class157.field2502.length());
                            } else if (var447.startsWith(class157.field2504)) {
                                var448 = 3;
                                var443 = var443.substring(class157.field2504.length());
                            } else if (var447.startsWith(class157.field2320)) {
                                var448 = 4;
                                var443 = var443.substring(class157.field2320.length());
                            } else if (var447.startsWith(class157.field2508)) {
                                var448 = 5;
                                var443 = var443.substring(class157.field2508.length());
                            } else if (client.field358 != 0) {
                                if (var447.startsWith(class157.field2501)) {
                                    var448 = 1;
                                    var443 = var443.substring(class157.field2501.length());
                                } else if (var447.startsWith(class157.field2503)) {
                                    var448 = 2;
                                    var443 = var443.substring(class157.field2503.length());
                                } else if (var447.startsWith(class157.field2505)) {
                                    var448 = 3;
                                    var443 = var443.substring(class157.field2505.length());
                                } else if (var447.startsWith(class157.field2507)) {
                                    var448 = 4;
                                    var443 = var443.substring(class157.field2507.length());
                                } else if (var447.startsWith(class157.field2509)) {
                                    var448 = 5;
                                    var443 = var443.substring(class157.field2509.length());
                                }
                            }
                            client.field330.method2578(88);
                            client.field330.method2436(0);
                            int var449 = client.field330.field1980;
                            client.field330.method2436(var444);
                            client.field330.method2436(var446);
                            client.field330.method2436(var448);
                            class222.method1583(client.field330, var443);
                            client.field330.method2366(client.field330.field1980 - var449);
                            continue;
                        }
                        if (var482 == 5009) {
                            var6 -= 2;
                            String var450 = field797[var6];
                            String var451 = field797[var6 + 1];
                            client.field330.method2578(21);
                            client.field330.method2331(0);
                            int var452 = client.field330.field1980;
                            client.field330.method2336(var450);
                            class222.method1583(client.field330, var451);
                            client.field330.method2474(client.field330.field1980 - var452);
                            continue;
                        }
                        if (var482 == 5015) {
                            String var453;
                            if (Statics.field1544 == null || Statics.field1544.field35 == null) {
                                var453 = "";
                            } else {
                                var453 = Statics.field1544.field35;
                            }
                            field797[var6++] = var453;
                            continue;
                        }
                        if (var482 == 5016) {
                            field791[var5++] = client.field505;
                            continue;
                        }
                        if (var482 == 5017) {
                            var5--;
                            int var454 = field791[var5];
                            int[] var455 = field791;
                            int var456 = var5++;
                            class28 var457 = (class28) class12.field167.get(var454);
                            int var458;
                            if (var457 == null) {
                                var458 = 0;
                            } else {
                                var458 = var457.method664();
                            }
                            var455[var456] = var458;
                            continue;
                        }
                        if (var482 == 5018) {
                            var5--;
                            int var459 = field791[var5];
                            field791[var5++] = class12.method14(var459);
                            continue;
                        }
                        if (var482 == 5019) {
                            var5--;
                            int var460 = field791[var5];
                            field791[var5++] = Statics.method178(var460);
                            continue;
                        }
                        if (var482 == 5020) {
                            var6--;
                            String var461 = field797[var6];
                            client.method45(var461);
                            continue;
                        }
                        if (var482 == 5021) {
                            var6--;
                            client.field506 = field797[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var482 == 5022) {
                            field797[var6++] = client.field506;
                            continue;
                        }
                    }
                }
                if (var482 < 5400) {
                    if (var482 == 5306) {
                        field791[var5++] = client.method167();
                        continue;
                    }
                    if (var482 == 5307) {
                        var5--;
                        int var462 = field791[var5];
                        if (var462 == 1 || var462 == 2) {
                            client.method188(var462);
                        }
                        continue;
                    }
                    if (var482 == 5308) {
                        field791[var5++] = Statics.field1389.field138;
                        continue;
                    }
                    if (var482 == 5309) {
                        var5--;
                        int var463 = field791[var5];
                        if (var463 == 1 || var463 == 2) {
                            Statics.field1389.field138 = var463;
                            class9.method86();
                        }
                        continue;
                    }
                }
                if (var482 < 5600) {
                    if (var482 == 5504) {
                        var5 -= 2;
                        int var464 = field791[var5];
                        int var465 = field791[var5 + 1];
                        if (!client.field344) {
                            client.field372 = var464;
                            client.field373 = var465;
                        }
                        continue;
                    }
                    if (var482 == 5505) {
                        field791[var5++] = client.field372;
                        continue;
                    }
                    if (var482 == 5506) {
                        field791[var5++] = client.field373;
                        continue;
                    }
                    if (var482 == 5530) {
                        var5--;
                        int var466 = field791[var5];
                        if (var466 < 0) {
                            var466 = 0;
                        }
                        client.field378 = var466;
                        continue;
                    }
                    if (var482 == 5531) {
                        field791[var5++] = client.field378;
                        continue;
                    }
                }
                if (var482 >= 5700 || var482 != 5630) {
                    if (var482 < 6300) {
                        if (var482 == 6200) {
                            var5 -= 2;
                            client.field541 = (short) field791[var5];
                            if (client.field541 <= 0) {
                                client.field541 = 256;
                            }
                            client.field542 = (short) field791[var5 + 1];
                            if (client.field542 <= 0) {
                                client.field542 = 205;
                            }
                            continue;
                        }
                        if (var482 == 6201) {
                            var5 -= 2;
                            client.field543 = (short) field791[var5];
                            if (client.field543 <= 0) {
                                client.field543 = 256;
                            }
                            client.field544 = (short) field791[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 320;
                            }
                            continue;
                        }
                        if (var482 == 6202) {
                            var5 -= 4;
                            client.field545 = (short) field791[var5];
                            if (client.field545 <= 0) {
                                client.field545 = 1;
                            }
                            client.field546 = (short) field791[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 32767;
                            } else if (client.field546 < client.field545) {
                                client.field546 = client.field545;
                            }
                            client.field315 = (short) field791[var5 + 2];
                            if (client.field315 <= 0) {
                                client.field315 = 1;
                            }
                            client.field548 = (short) field791[var5 + 3];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field315) {
                                client.field548 = client.field315;
                            }
                            continue;
                        }
                        if (var482 == 6203) {
                            if (client.field458 == null) {
                                field791[var5++] = -1;
                                field791[var5++] = -1;
                            } else {
                                client.method2038(0, 0, client.field458.field2756, client.field458.field2872, false);
                                field791[var5++] = client.field551;
                                field791[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var482 == 6204) {
                            field791[var5++] = client.field543;
                            field791[var5++] = client.field544;
                            continue;
                        }
                        if (var482 == 6205) {
                            field791[var5++] = client.field541;
                            field791[var5++] = client.field542;
                            continue;
                        }
                    }
                    if (var482 < 6600) {
                        if (var482 == 6500) {
                            field791[var5++] = class26.method2288() ? 1 : 0;
                            continue;
                        }
                        if (var482 == 6501) {
                            class26 var467 = class26.method97();
                            if (var467 == null) {
                                field791[var5++] = -1;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                                field791[var5++] = 0;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                            } else {
                                field791[var5++] = var467.field640;
                                field791[var5++] = var467.field650;
                                field797[var6++] = var467.field644;
                                field791[var5++] = var467.field645;
                                field791[var5++] = var467.field641;
                                field797[var6++] = var467.field643;
                            }
                            continue;
                        }
                        if (var482 == 6502) {
                            class26 var468 = class26.method152();
                            if (var468 == null) {
                                field791[var5++] = -1;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                                field791[var5++] = 0;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                            } else {
                                field791[var5++] = var468.field640;
                                field791[var5++] = var468.field650;
                                field797[var6++] = var468.field644;
                                field791[var5++] = var468.field645;
                                field791[var5++] = var468.field641;
                                field797[var6++] = var468.field643;
                            }
                            continue;
                        }
                        if (var482 == 6506) {
                            var5--;
                            int var469 = field791[var5];
                            class26 var470 = null;
                            for (int var471 = 0; var471 < class26.field636; var471++) {
                                if (Statics.field212[var471].field640 == var469) {
                                    var470 = Statics.field212[var471];
                                    break;
                                }
                            }
                            if (var470 == null) {
                                field791[var5++] = -1;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                                field791[var5++] = 0;
                                field791[var5++] = 0;
                                field797[var6++] = "";
                            } else {
                                field791[var5++] = var470.field640;
                                field791[var5++] = var470.field650;
                                field797[var6++] = var470.field644;
                                field791[var5++] = var470.field645;
                                field791[var5++] = var470.field641;
                                field797[var6++] = var470.field643;
                            }
                            continue;
                        }
                        if (var482 == 6507) {
                            var5 -= 4;
                            int var472 = field791[var5];
                            boolean var473 = field791[var5 + 1] == 1;
                            int var474 = field791[var5 + 2];
                            boolean var475 = field791[var5 + 3] == 1;
                            class26.method2144(var472, var473, var474, var475);
                            continue;
                        }
                        if (var482 == 6511) {
                            var5--;
                            int var476 = field791[var5];
                            if (var476 >= 0 && var476 < class26.field636) {
                                class26 var477 = Statics.field212[var476];
                                field791[var5++] = var477.field640;
                                field791[var5++] = var477.field650;
                                field797[var6++] = var477.field644;
                                field791[var5++] = var477.field645;
                                field791[var5++] = var477.field641;
                                field797[var6++] = var477.field643;
                                continue;
                            }
                            field791[var5++] = -1;
                            field791[var5++] = 0;
                            field797[var6++] = "";
                            field791[var5++] = 0;
                            field791[var5++] = 0;
                            field797[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field340 = 250;
            }
        } catch (Exception var481) {
            StringBuilder var479 = new StringBuilder(30);
            var479.append("").append(var4.field3100).append(" ");
            for (int var480 = field798 - 1; var480 >= 0; var480--) {
                var479.append("").append(field799[var480].field204.field3100).append(" ");
            }
            var479.append("").append(var10);
            class148.method145(var479.toString(), var481);
        }
    }

    @ObfuscatedName("ar.v(IB)V")
    public static void method663(int arg0) {
        if (arg0 == -1 || !class173.method2289(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2801[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2820 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field12 = var3.field2820;
                method571(var4, 2000000);
            }
        }
    }
}
