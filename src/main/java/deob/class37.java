package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aa")
public class class37 {

    @ObfuscatedName("aa.k")
    public static int[] field759 = new int[5];

    @ObfuscatedName("aa.j")
    public static int[][] field761 = new int[5][5000];

    @ObfuscatedName("aa.i")
    public static int[] field763 = new int[1000];

    @ObfuscatedName("aa.x")
    public static String[] field762 = new String[1000];

    @ObfuscatedName("aa.g")
    public static int field765 = 0;

    @ObfuscatedName("aa.e")
    public static class15[] field766 = new class15[50];

    @ObfuscatedName("aa.v")
    public static Calendar field768 = Calendar.getInstance();

    @ObfuscatedName("aa.c")
    public static final String[] field769 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aa.s")
    public static int field774 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.m(Lm;I)V")
    public static void method616(class1 arg0) {
        method2077(arg0, 200000);
    }

    @ObfuscatedName("cl.l(Lm;IB)V")
    public static void method2077(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2178(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field560;
        int[] var9 = var4.field561;
        byte var10 = -1;
        field765 = 0;
        try {
            Statics.field1859 = new int[var4.field559];
            int var11 = 0;
            Statics.field772 = new String[var4.field564];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2732;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2861;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2732;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2861;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field16;
                    }
                    Statics.field1859[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field772[var12++] = var15;
                }
            }
            int var16 = 0;
            field774 = arg0.field11;
            label3436: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var541 = var8[var7];
                if (var541 < 100) {
                    if (var541 == 0) {
                        field763[var5++] = var9[var7];
                        continue;
                    }
                    if (var541 == 1) {
                        int var17 = var9[var7];
                        field763[var5++] = class176.field2878[var17];
                        continue;
                    }
                    if (var541 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2878[var18] = field763[var5];
                        client.method2322(var18);
                        continue;
                    }
                    if (var541 == 3) {
                        field762[var6++] = var4.field565[var7];
                        continue;
                    }
                    if (var541 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var541 == 7) {
                        var5 -= 2;
                        if (field763[var5 + 1] != field763[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var541 == 8) {
                        var5 -= 2;
                        if (field763[var5 + 1] == field763[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var541 == 9) {
                        var5 -= 2;
                        if (field763[var5] < field763[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var541 == 10) {
                        var5 -= 2;
                        if (field763[var5] > field763[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var541 == 21) {
                        if (field765 == 0) {
                            return;
                        }
                        class15 var19 = field766[--field765];
                        var4 = var19.field190;
                        var8 = var4.field560;
                        var9 = var4.field561;
                        var7 = var19.field188;
                        Statics.field1859 = var19.field187;
                        Statics.field772 = var19.field193;
                        continue;
                    }
                    if (var541 == 25) {
                        int var20 = var9[var7];
                        field763[var5++] = class176.method2171(var20);
                        continue;
                    }
                    if (var541 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field763[var5];
                        class48 var23 = class48.method3213(var21);
                        int var24 = var23.field1029;
                        int var25 = var23.field1038;
                        int var26 = var23.field1030;
                        int var27 = class176.field2883[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class176.field2878[var24] = class176.field2878[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var541 == 31) {
                        var5 -= 2;
                        if (field763[var5] <= field763[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var541 == 32) {
                        var5 -= 2;
                        if (field763[var5] >= field763[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var541 == 33) {
                        field763[var5++] = Statics.field1859[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var541 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1859[var10001] = field763[var5];
                        continue;
                    }
                    if (var541 == 35) {
                        field762[var6++] = Statics.field772[var9[var7]];
                        continue;
                    }
                    if (var541 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field772[var10001] = field762[var6];
                        continue;
                    }
                    if (var541 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field762;
                        String var31;
                        if (var29 == 0) {
                            var31 = "";
                        } else if (var29 == 1) {
                            String var32 = var30[var6];
                            if (var32 == null) {
                                var31 = "null";
                            } else {
                                var31 = var32.toString();
                            }
                        } else {
                            int var33 = var6 + var29;
                            int var34 = 0;
                            for (int var35 = var6; var35 < var33; var35++) {
                                String var36 = var30[var35];
                                if (var36 == null) {
                                    var34 += 4;
                                } else {
                                    var34 += var36.length();
                                }
                            }
                            StringBuilder var37 = new StringBuilder(var34);
                            for (int var38 = var6; var38 < var33; var38++) {
                                String var39 = var30[var38];
                                if (var39 == null) {
                                    var37.append("null");
                                } else {
                                    var37.append(var39);
                                }
                            }
                            var31 = var37.toString();
                        }
                        field762[var6++] = var31;
                        continue;
                    }
                    if (var541 == 38) {
                        var5--;
                        continue;
                    }
                    if (var541 == 39) {
                        var6--;
                        continue;
                    }
                    if (var541 == 40) {
                        int var41 = var9[var7];
                        class23 var42 = class23.method2178(var41);
                        int[] var43 = new int[var42.field559];
                        String[] var44 = new String[var42.field564];
                        for (int var45 = 0; var45 < var42.field568; var45++) {
                            var43[var45] = field763[var5 - var42.field568 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field566; var46++) {
                            var44[var46] = field762[var6 - var42.field566 + var46];
                        }
                        var5 -= var42.field568;
                        var6 -= var42.field566;
                        class15 var47 = new class15();
                        var47.field190 = var4;
                        var47.field188 = var7;
                        var47.field187 = Statics.field1859;
                        var47.field193 = Statics.field772;
                        field766[++field765 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field560;
                        var9 = var42.field561;
                        var7 = -1;
                        Statics.field1859 = var43;
                        Statics.field772 = var44;
                        continue;
                    }
                    if (var541 == 42) {
                        field763[var5++] = Statics.field13.method233(var9[var7]);
                        continue;
                    }
                    if (var541 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field13.method203(var10001, field763[var5]);
                        continue;
                    }
                    if (var541 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field763[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field759[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3436;
                                }
                                field761[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var541 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field763[var5];
                        if (var54 >= 0 && var54 < field759[var53]) {
                            field763[var5++] = field761[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var541 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field763[var5];
                        if (var56 >= 0 && var56 < field759[var55]) {
                            field761[var55][var56] = field763[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var541 == 47) {
                        String var57 = Statics.field13.method219(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field762[var6++] = var57;
                        continue;
                    }
                    if (var541 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field13.method205(var10001, field762[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var541 < 1000) {
                    if (var541 == 100) {
                        var5 -= 3;
                        int var59 = field763[var5];
                        int var60 = field763[var5 + 1];
                        int var61 = field763[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var62 = class173.method47(var59);
                        if (var62.field2853 == null) {
                            var62.field2853 = new class173[var61 + 1];
                        }
                        if (var62.field2853.length <= var61) {
                            class173[] var63 = new class173[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2853.length; var64++) {
                                var63[var64] = var62.field2853[var64];
                            }
                            var62.field2853 = var63;
                        }
                        if (var61 > 0 && var62.field2853[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class173 var65 = new class173();
                        var65.field2733 = var60;
                        var65.field2834 = var65.field2732 = var62.field2732;
                        var65.field2861 = var61;
                        var65.field2730 = true;
                        var62.field2853[var61] = var65;
                        if (var58) {
                            Statics.field767 = var65;
                        } else {
                            Statics.field1941 = var65;
                        }
                        client.method172(var62);
                        continue;
                    }
                    if (var541 == 101) {
                        class173 var66 = var58 ? Statics.field767 : Statics.field1941;
                        class173 var67 = class173.method47(var66.field2732);
                        var67.field2853[var66.field2861] = null;
                        client.method172(var67);
                        continue;
                    }
                    if (var541 == 102) {
                        var5--;
                        class173 var68 = class173.method47(field763[var5]);
                        var68.field2853 = null;
                        client.method172(var68);
                        continue;
                    }
                    if (var541 == 200) {
                        var5 -= 2;
                        int var69 = field763[var5];
                        int var70 = field763[var5 + 1];
                        class173 var71 = class173.method956(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field763[var5++] = 1;
                            if (var58) {
                                Statics.field767 = var71;
                            } else {
                                Statics.field1941 = var71;
                            }
                            continue;
                        }
                        field763[var5++] = 0;
                        continue;
                    }
                    if (var541 == 201) {
                        var5--;
                        class173 var72 = class173.method47(field763[var5]);
                        if (var72 == null) {
                            field763[var5++] = 0;
                        } else {
                            field763[var5++] = 1;
                            if (var58) {
                                Statics.field767 = var72;
                            } else {
                                Statics.field1941 = var72;
                            }
                        }
                        continue;
                    }
                } else if (!(var541 < 1000 || var541 >= 1100) || !(var541 < 2000 || var541 >= 2100)) {
                    int var73 = -1;
                    class173 var74;
                    if (var541 >= 2000) {
                        var541 -= 1000;
                        var5--;
                        var73 = field763[var5];
                        var74 = class173.method47(var73);
                    } else {
                        var74 = var58 ? Statics.field767 : Statics.field1941;
                    }
                    if (var541 == 1000) {
                        var5 -= 4;
                        var74.field2740 = field763[var5];
                        var74.field2741 = field763[var5 + 1];
                        var74.field2736 = field763[var5 + 2];
                        var74.field2754 = field763[var5 + 3];
                        client.method172(var74);
                        client.method2180(var74);
                        if (var73 != -1 && var74.field2733 == 0) {
                            Statics.method870(Statics.field2766[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var541 == 1001) {
                        var5 -= 4;
                        var74.field2742 = field763[var5];
                        var74.field2743 = field763[var5 + 1];
                        var74.field2738 = field763[var5 + 2];
                        var74.field2739 = field763[var5 + 3];
                        client.method172(var74);
                        client.method2180(var74);
                        if (var73 != -1 && var74.field2733 == 0) {
                            Statics.method870(Statics.field2766[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var541 == 1003) {
                        var5--;
                        boolean var75 = field763[var5] == 1;
                        if (var74.field2751 != var75) {
                            var74.field2751 = var75;
                            client.method172(var74);
                        }
                        continue;
                    }
                    if (var541 == 1005) {
                        var5--;
                        var74.field2862 = field763[var5] == 1;
                        continue;
                    }
                    if (var541 == 1006) {
                        var5--;
                        var74.field2846 = field763[var5] == 1;
                        continue;
                    }
                } else if (!(var541 < 1100 || var541 >= 1200) || !(var541 < 2100 || var541 >= 2200)) {
                    int var76 = -1;
                    class173 var77;
                    if (var541 >= 2000) {
                        var541 -= 1000;
                        var5--;
                        var76 = field763[var5];
                        var77 = class173.method47(var76);
                    } else {
                        var77 = var58 ? Statics.field767 : Statics.field1941;
                    }
                    if (var541 == 1100) {
                        var5 -= 2;
                        var77.field2815 = field763[var5];
                        if (var77.field2815 > var77.field2725 - var77.field2746) {
                            var77.field2815 = var77.field2725 - var77.field2746;
                        }
                        if (var77.field2815 < 0) {
                            var77.field2815 = 0;
                        }
                        var77.field2753 = field763[var5 + 1];
                        if (var77.field2753 > var77.field2755 - var77.field2797) {
                            var77.field2753 = var77.field2755 - var77.field2797;
                        }
                        if (var77.field2753 < 0) {
                            var77.field2753 = 0;
                        }
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1101) {
                        var5--;
                        var77.field2756 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1102) {
                        var5--;
                        var77.field2760 = field763[var5] == 1;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1103) {
                        var5--;
                        var77.field2761 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1104) {
                        var5--;
                        var77.field2762 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1105) {
                        var5--;
                        var77.field2764 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1106) {
                        var5--;
                        var77.field2816 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1107) {
                        var5--;
                        var77.field2854 = field763[var5] == 1;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1108) {
                        var77.field2772 = 1;
                        var5--;
                        var77.field2737 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1109) {
                        var5 -= 6;
                        var77.field2795 = field763[var5];
                        var77.field2748 = field763[var5 + 1];
                        var77.field2780 = field763[var5 + 2];
                        var77.field2837 = field763[var5 + 3];
                        var77.field2723 = field763[var5 + 4];
                        var77.field2783 = field763[var5 + 5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1110) {
                        var5--;
                        int var78 = field763[var5];
                        if (var77.field2859 != var78) {
                            var77.field2859 = var78;
                            var77.field2851 = 0;
                            var77.field2852 = 0;
                            client.method172(var77);
                        }
                        continue;
                    }
                    if (var541 == 1111) {
                        var5--;
                        var77.field2786 = field763[var5] == 1;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1112) {
                        var6--;
                        String var79 = field762[var6];
                        if (!var79.equals(var77.field2856)) {
                            var77.field2856 = var79;
                            client.method172(var77);
                        }
                        continue;
                    }
                    if (var541 == 1113) {
                        var5--;
                        var77.field2788 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1114) {
                        var5 -= 3;
                        var77.field2792 = field763[var5];
                        var77.field2724 = field763[var5 + 1];
                        var77.field2860 = field763[var5 + 2];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1115) {
                        var5--;
                        var77.field2794 = field763[var5] == 1;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1116) {
                        var5--;
                        var77.field2768 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1117) {
                        var5--;
                        var77.field2750 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1118) {
                        var5--;
                        var77.field2770 = field763[var5] == 1;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1119) {
                        var5--;
                        var77.field2771 = field763[var5] == 1;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1120) {
                        var5 -= 2;
                        var77.field2725 = field763[var5];
                        var77.field2755 = field763[var5 + 1];
                        client.method172(var77);
                        if (var76 != -1 && var77.field2733 == 0) {
                            Statics.method870(Statics.field2766[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var541 == 1121) {
                        client.method2781(var77.field2732, var77.field2861);
                        client.field416 = var77;
                        client.method172(var77);
                        continue;
                    }
                    if (var541 == 1122) {
                        var5--;
                        var77.field2765 = field763[var5];
                        client.method172(var77);
                        continue;
                    }
                } else if (!(var541 < 1200 || var541 >= 1300) || !(var541 < 2200 || var541 >= 2300)) {
                    class173 var80;
                    if (var541 >= 2000) {
                        var541 -= 1000;
                        var5--;
                        var80 = class173.method47(field763[var5]);
                    } else {
                        var80 = var58 ? Statics.field767 : Statics.field1941;
                    }
                    client.method172(var80);
                    if (var541 == 1200 || var541 == 1205 || var541 == 1212) {
                        var5 -= 2;
                        int var81 = field763[var5];
                        int var82 = field763[var5 + 1];
                        var80.field2849 = var81;
                        var80.field2850 = var82;
                        class52 var83 = class52.method168(var81);
                        var80.field2780 = var83.field1084;
                        var80.field2837 = var83.field1085;
                        var80.field2723 = var83.field1086;
                        var80.field2795 = var83.field1087;
                        var80.field2748 = var83.field1081;
                        var80.field2783 = var83.field1114;
                        if (var541 == 1205) {
                            var80.field2787 = 0;
                        } else if (var541 == 1212 | var83.field1089 == 1) {
                            var80.field2787 = 1;
                        } else {
                            var80.field2787 = 2;
                        }
                        if (var80.field2784 > 0) {
                            var80.field2783 = var80.field2783 * 32 / var80.field2784;
                        } else if (var80.field2742 > 0) {
                            var80.field2783 = var80.field2783 * 32 / var80.field2742;
                        }
                        continue;
                    }
                    if (var541 == 1201) {
                        var80.field2772 = 2;
                        var5--;
                        var80.field2737 = field763[var5];
                        continue;
                    }
                    if (var541 == 1202) {
                        var80.field2772 = 3;
                        var80.field2737 = Statics.field989.field32.method3307();
                        continue;
                    }
                } else if (var541 >= 1300 && var541 < 1400 || var541 >= 2300 && var541 < 2400) {
                    class173 var84;
                    if (var541 >= 2000) {
                        var541 -= 1000;
                        var5--;
                        var84 = class173.method47(field763[var5]);
                    } else {
                        var84 = var58 ? Statics.field767 : Statics.field1941;
                    }
                    if (var541 == 1300) {
                        var5--;
                        int var85 = field763[var5] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var6--;
                            var84.method3268(var85, field762[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var541 == 1301) {
                        var5 -= 2;
                        int var86 = field763[var5];
                        int var87 = field763[var5 + 1];
                        var84.field2778 = class173.method956(var86, var87);
                        continue;
                    }
                    if (var541 == 1302) {
                        var5--;
                        var84.field2825 = field763[var5] == 1;
                        continue;
                    }
                    if (var541 == 1303) {
                        var5--;
                        var84.field2805 = field763[var5];
                        continue;
                    }
                    if (var541 == 1304) {
                        var5--;
                        var84.field2806 = field763[var5];
                        continue;
                    }
                    if (var541 == 1305) {
                        var6--;
                        var84.field2802 = field762[var6];
                        continue;
                    }
                    if (var541 == 1306) {
                        var6--;
                        var84.field2811 = field762[var6];
                        continue;
                    }
                    if (var541 == 1307) {
                        var84.field2803 = null;
                        continue;
                    }
                } else {
                    if (var541 >= 1400 && var541 < 1500 || var541 >= 2400 && var541 < 2500) {
                        class173 var88;
                        if (var541 >= 2000) {
                            var541 -= 1000;
                            var5--;
                            var88 = class173.method47(field763[var5]);
                        } else {
                            var88 = var58 ? Statics.field767 : Statics.field1941;
                        }
                        var6--;
                        String var89 = field762[var6];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var5--;
                            int var91 = field763[var5];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var5--;
                                    var90[var91] = field763[var5];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var6--;
                                var92[var93] = field762[var6];
                            } else {
                                var5--;
                                var92[var93] = Integer.valueOf(field763[var5]);
                            }
                        }
                        var5--;
                        int var94 = field763[var5];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var541 == 1400) {
                            var88.field2822 = var92;
                        }
                        if (var541 == 1401) {
                            var88.field2814 = var92;
                        }
                        if (var541 == 1402) {
                            var88.field2813 = var92;
                        }
                        if (var541 == 1403) {
                            var88.field2808 = var92;
                        }
                        if (var541 == 1404) {
                            var88.field2817 = var92;
                        }
                        if (var541 == 1405) {
                            var88.field2818 = var92;
                        }
                        if (var541 == 1406) {
                            var88.field2821 = var92;
                        }
                        if (var541 == 1407) {
                            var88.field2779 = var92;
                            var88.field2823 = var90;
                        }
                        if (var541 == 1408) {
                            var88.field2828 = var92;
                        }
                        if (var541 == 1409) {
                            var88.field2758 = var92;
                        }
                        if (var541 == 1410) {
                            var88.field2819 = var92;
                        }
                        if (var541 == 1411) {
                            var88.field2812 = var92;
                        }
                        if (var541 == 1412) {
                            var88.field2757 = var92;
                        }
                        if (var541 == 1414) {
                            var88.field2863 = var92;
                            var88.field2832 = var90;
                        }
                        if (var541 == 1415) {
                            var88.field2826 = var92;
                            var88.field2827 = var90;
                        }
                        if (var541 == 1416) {
                            var88.field2820 = var92;
                        }
                        if (var541 == 1417) {
                            var88.field2782 = var92;
                        }
                        if (var541 == 1418) {
                            var88.field2767 = var92;
                        }
                        if (var541 == 1419) {
                            var88.field2731 = var92;
                        }
                        if (var541 == 1420) {
                            var88.field2833 = var92;
                        }
                        if (var541 == 1421) {
                            var88.field2789 = var92;
                        }
                        if (var541 == 1422) {
                            var88.field2835 = var92;
                        }
                        if (var541 == 1423) {
                            var88.field2836 = var92;
                        }
                        if (var541 == 1424) {
                            var88.field2785 = var92;
                        }
                        if (var541 == 1425) {
                            var88.field2839 = var92;
                        }
                        if (var541 == 1426) {
                            var88.field2840 = var92;
                        }
                        if (var541 == 1427) {
                            var88.field2838 = var92;
                        }
                        var88.field2809 = true;
                        continue;
                    }
                    if (var541 < 1600) {
                        class173 var95 = var58 ? Statics.field767 : Statics.field1941;
                        if (var541 == 1500) {
                            field763[var5++] = var95.field2744;
                            continue;
                        }
                        if (var541 == 1501) {
                            field763[var5++] = var95.field2745;
                            continue;
                        }
                        if (var541 == 1502) {
                            field763[var5++] = var95.field2746;
                            continue;
                        }
                        if (var541 == 1503) {
                            field763[var5++] = var95.field2797;
                            continue;
                        }
                        if (var541 == 1504) {
                            field763[var5++] = var95.field2751 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 1505) {
                            field763[var5++] = var95.field2834;
                            continue;
                        }
                    } else if (var541 < 1700) {
                        class173 var96 = var58 ? Statics.field767 : Statics.field1941;
                        if (var541 == 1600) {
                            field763[var5++] = var96.field2815;
                            continue;
                        }
                        if (var541 == 1601) {
                            field763[var5++] = var96.field2753;
                            continue;
                        }
                        if (var541 == 1602) {
                            field762[var6++] = var96.field2856;
                            continue;
                        }
                        if (var541 == 1603) {
                            field763[var5++] = var96.field2725;
                            continue;
                        }
                        if (var541 == 1604) {
                            field763[var5++] = var96.field2755;
                            continue;
                        }
                        if (var541 == 1605) {
                            field763[var5++] = var96.field2783;
                            continue;
                        }
                        if (var541 == 1606) {
                            field763[var5++] = var96.field2780;
                            continue;
                        }
                        if (var541 == 1607) {
                            field763[var5++] = var96.field2723;
                            continue;
                        }
                        if (var541 == 1608) {
                            field763[var5++] = var96.field2837;
                            continue;
                        }
                        if (var541 == 1609) {
                            field763[var5++] = var96.field2761;
                            continue;
                        }
                    } else if (var541 < 1800) {
                        class173 var97 = var58 ? Statics.field767 : Statics.field1941;
                        if (var541 == 1700) {
                            field763[var5++] = var97.field2849;
                            continue;
                        }
                        if (var541 == 1701) {
                            if (var97.field2849 == -1) {
                                field763[var5++] = 0;
                            } else {
                                field763[var5++] = var97.field2850;
                            }
                            continue;
                        }
                        if (var541 == 1702) {
                            field763[var5++] = var97.field2861;
                            continue;
                        }
                    } else if (var541 < 1900) {
                        class173 var98 = var58 ? Statics.field767 : Statics.field1941;
                        if (var541 == 1800) {
                            int[] var99 = field763;
                            int var100 = var5++;
                            int var101 = client.method34(var98);
                            int var102 = var101 >> 11 & 0x3F;
                            var99[var100] = var102;
                            continue;
                        }
                        if (var541 == 1801) {
                            var5--;
                            int var103 = field763[var5];
                            int var542 = var103 - 1;
                            if (var98.field2803 != null && var542 < var98.field2803.length && var98.field2803[var542] != null) {
                                field762[var6++] = var98.field2803[var542];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 1802) {
                            if (var98.field2802 == null) {
                                field762[var6++] = "";
                            } else {
                                field762[var6++] = var98.field2802;
                            }
                            continue;
                        }
                    } else if (!(var541 < 1900 || var541 >= 2000) || !(var541 < 2900 || var541 >= 3000)) {
                        class173 var104;
                        if (var541 >= 2000) {
                            var541 -= 1000;
                            var5--;
                            var104 = class173.method47(field763[var5]);
                        } else {
                            var104 = var58 ? Statics.field767 : Statics.field1941;
                        }
                        if (var541 == 1927) {
                            if (field774 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var104.field2838 == null) {
                                return;
                            }
                            class1 var105 = new class1();
                            var105.field3 = var104;
                            var105.field8 = var104.field2838;
                            var105.field11 = field774 + 1;
                            client.field456.method3606(arg0);
                            continue;
                        }
                    } else if (var541 < 2600) {
                        var5--;
                        class173 var106 = class173.method47(field763[var5]);
                        if (var541 == 2500) {
                            field763[var5++] = var106.field2744;
                            continue;
                        }
                        if (var541 == 2501) {
                            field763[var5++] = var106.field2745;
                            continue;
                        }
                        if (var541 == 2502) {
                            field763[var5++] = var106.field2746;
                            continue;
                        }
                        if (var541 == 2503) {
                            field763[var5++] = var106.field2797;
                            continue;
                        }
                        if (var541 == 2504) {
                            field763[var5++] = var106.field2751 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 2505) {
                            field763[var5++] = var106.field2834;
                            continue;
                        }
                    } else if (var541 < 2700) {
                        var5--;
                        class173 var107 = class173.method47(field763[var5]);
                        if (var541 == 2600) {
                            field763[var5++] = var107.field2815;
                            continue;
                        }
                        if (var541 == 2601) {
                            field763[var5++] = var107.field2753;
                            continue;
                        }
                        if (var541 == 2602) {
                            field762[var6++] = var107.field2856;
                            continue;
                        }
                        if (var541 == 2603) {
                            field763[var5++] = var107.field2725;
                            continue;
                        }
                        if (var541 == 2604) {
                            field763[var5++] = var107.field2755;
                            continue;
                        }
                        if (var541 == 2605) {
                            field763[var5++] = var107.field2783;
                            continue;
                        }
                        if (var541 == 2606) {
                            field763[var5++] = var107.field2780;
                            continue;
                        }
                        if (var541 == 2607) {
                            field763[var5++] = var107.field2723;
                            continue;
                        }
                        if (var541 == 2608) {
                            field763[var5++] = var107.field2837;
                            continue;
                        }
                        if (var541 == 2609) {
                            field763[var5++] = var107.field2761;
                            continue;
                        }
                    } else if (var541 < 2800) {
                        if (var541 == 2700) {
                            var5--;
                            class173 var108 = class173.method47(field763[var5]);
                            field763[var5++] = var108.field2849;
                            continue;
                        }
                        if (var541 == 2701) {
                            var5--;
                            class173 var109 = class173.method47(field763[var5]);
                            if (var109.field2849 == -1) {
                                field763[var5++] = 0;
                            } else {
                                field763[var5++] = var109.field2850;
                            }
                            continue;
                        }
                        if (var541 == 2702) {
                            var5--;
                            int var110 = field763[var5];
                            class4 var111 = (class4) client.field517.method3571((long) var110);
                            if (var111 == null) {
                                field763[var5++] = 0;
                            } else {
                                field763[var5++] = 1;
                            }
                            continue;
                        }
                        if (var541 == 2706) {
                            field763[var5++] = client.field262;
                            continue;
                        }
                    } else if (var541 < 2900) {
                        var5--;
                        class173 var112 = class173.method47(field763[var5]);
                        if (var541 == 2800) {
                            int[] var113 = field763;
                            int var114 = var5++;
                            int var115 = client.method34(var112);
                            int var116 = var115 >> 11 & 0x3F;
                            var113[var114] = var116;
                            continue;
                        }
                        if (var541 == 2801) {
                            var5--;
                            int var117 = field763[var5];
                            int var543 = var117 - 1;
                            if (var112.field2803 != null && var543 < var112.field2803.length && var112.field2803[var543] != null) {
                                field762[var6++] = var112.field2803[var543];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 2802) {
                            if (var112.field2802 == null) {
                                field762[var6++] = "";
                            } else {
                                field762[var6++] = var112.field2802;
                            }
                            continue;
                        }
                    } else if (var541 < 3200) {
                        if (var541 == 3100) {
                            var6--;
                            String var118 = field762[var6];
                            class12.method2685(0, "", var118);
                            continue;
                        }
                        if (var541 == 3101) {
                            var5 -= 2;
                            client.method8(Statics.field989, field763[var5], field763[var5 + 1]);
                            continue;
                        }
                        if (var541 == 3103) {
                            client.field301.method2648(66);
                            for (class4 var119 = (class4) client.field517.method3574(); var119 != null; var119 = (class4) client.field517.method3573()) {
                                if (var119.field62 == 0 || var119.field62 == 3) {
                                    client.method2172(var119, true);
                                }
                            }
                            if (client.field416 != null) {
                                client.method172(client.field416);
                                client.field416 = null;
                            }
                            continue;
                        }
                        if (var541 == 3104) {
                            var6--;
                            String var120 = field762[var6];
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
                                label3721: {
                                    char var127 = var120.charAt(var126);
                                    if (var126 == 0) {
                                        if (var127 == '-') {
                                            var122 = true;
                                            break label3721;
                                        }
                                        if (var127 == '+') {
                                            break label3721;
                                        }
                                    }
                                    int var544;
                                    if (var127 >= '0' && var127 <= '9') {
                                        var544 = var127 - '0';
                                    } else if (var127 >= 'A' && var127 <= 'Z') {
                                        var544 = var127 - '7';
                                    } else {
                                        if (var127 < 'a' || var127 > 'z') {
                                            var128 = false;
                                            break;
                                        }
                                        var544 = var127 - 'W';
                                    }
                                    if (var544 >= 10) {
                                        var128 = false;
                                        break;
                                    }
                                    if (var122) {
                                        var544 = -var544;
                                    }
                                    int var129 = var124 * 10 + var544;
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
                                var121 = class163.method2984(var120);
                            }
                            client.field301.method2648(24);
                            client.field301.method2514(var121);
                            continue;
                        }
                        if (var541 == 3105) {
                            var6--;
                            String var131 = field762[var6];
                            client.field301.method2648(95);
                            client.field301.method2366(var131.length() + 1);
                            client.field301.method2372(var131);
                            continue;
                        }
                        if (var541 == 3106) {
                            var6--;
                            String var132 = field762[var6];
                            client.field301.method2648(183);
                            client.field301.method2366(var132.length() + 1);
                            client.field301.method2372(var132);
                            continue;
                        }
                        if (var541 == 3107) {
                            var5--;
                            int var133 = field763[var5];
                            var6--;
                            String var134 = field762[var6];
                            client.method865(var133, var134);
                            continue;
                        }
                        if (var541 == 3108) {
                            var5 -= 3;
                            int var135 = field763[var5];
                            int var136 = field763[var5 + 1];
                            int var137 = field763[var5 + 2];
                            class173 var138 = class173.method47(var137);
                            client.method2320(var138, var135, var136);
                            continue;
                        }
                        if (var541 == 3109) {
                            var5 -= 2;
                            int var139 = field763[var5];
                            int var140 = field763[var5 + 1];
                            class173 var141 = var58 ? Statics.field767 : Statics.field1941;
                            client.method2320(var141, var139, var140);
                            continue;
                        }
                        if (var541 == 3110) {
                            var5--;
                            Statics.field2882 = field763[var5] == 1;
                            continue;
                        }
                        if (var541 == 3111) {
                            field763[var5++] = Statics.field2665.field132 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3112) {
                            var5--;
                            Statics.field2665.field132 = field763[var5] == 1;
                            class9.method3224();
                            continue;
                        }
                        if (var541 == 3113) {
                            var6--;
                            String var142 = field762[var6];
                            var5--;
                            boolean var143 = field763[var5] == 1;
                            class138.method193(var142, var143, "openjs", false);
                            continue;
                        }
                        if (var541 == 3115) {
                            var5--;
                            int var144 = field763[var5];
                            client.field301.method2648(193);
                            client.field301.method2466(var144);
                            continue;
                        }
                        if (var541 == 3116) {
                            var5--;
                            int var145 = field763[var5];
                            var6 -= 2;
                            String var146 = field762[var6];
                            String var147 = field762[var6 + 1];
                            if (var146.length() <= 500 && var147.length() <= 500) {
                                client.field301.method2648(121);
                                client.field301.method2466(1 + class119.method2753(var146) + class119.method2753(var147));
                                client.field301.method2406(var145);
                                client.field301.method2372(var147);
                                client.field301.method2372(var146);
                            }
                            continue;
                        }
                    } else if (var541 < 3300) {
                        if (var541 == 3200) {
                            var5 -= 3;
                            client.method204(field763[var5], field763[var5 + 1], field763[var5 + 2]);
                            continue;
                        }
                        if (var541 == 3201) {
                            var5--;
                            client.method45(field763[var5]);
                            continue;
                        }
                        if (var541 == 3202) {
                            var5 -= 2;
                            client.method164(field763[var5], field763[var5 + 1]);
                            continue;
                        }
                    } else if (var541 < 3400) {
                        if (var541 == 3300) {
                            field763[var5++] = client.field423;
                            continue;
                        }
                        if (var541 == 3301) {
                            var5 -= 2;
                            int var148 = field763[var5];
                            int var149 = field763[var5 + 1];
                            int[] var150 = field763;
                            int var151 = var5++;
                            class16 var152 = (class16) class16.field200.method3571((long) var148);
                            int var153;
                            if (var152 == null) {
                                var153 = -1;
                            } else if (var149 >= 0 && var149 < var152.field196.length) {
                                var153 = var152.field196[var149];
                            } else {
                                var153 = -1;
                            }
                            var150[var151] = var153;
                            continue;
                        }
                        if (var541 == 3302) {
                            var5 -= 2;
                            int var154 = field763[var5];
                            int var155 = field763[var5 + 1];
                            int[] var156 = field763;
                            int var157 = var5++;
                            class16 var158 = (class16) class16.field200.method3571((long) var154);
                            int var159;
                            if (var158 == null) {
                                var159 = 0;
                            } else if (var155 >= 0 && var155 < var158.field198.length) {
                                var159 = var158.field198[var155];
                            } else {
                                var159 = 0;
                            }
                            var156[var157] = var159;
                            continue;
                        }
                        if (var541 == 3303) {
                            var5 -= 2;
                            int var160 = field763[var5];
                            int var161 = field763[var5 + 1];
                            field763[var5++] = class16.method130(var160, var161);
                            continue;
                        }
                        if (var541 == 3304) {
                            var5--;
                            int var162 = field763[var5];
                            int[] var163 = field763;
                            int var164 = var5++;
                            class51 var165 = (class51) class51.field1064.method3537((long) var162);
                            class51 var166;
                            if (var165 == null) {
                                byte[] var167 = Statics.field1067.method3080(5, var162);
                                class51 var168 = new class51();
                                if (var167 != null) {
                                    var168.method1028(new class119(var167));
                                }
                                class51.field1064.method3539(var168, (long) var162);
                                var166 = var168;
                            } else {
                                var166 = var165;
                            }
                            var163[var164] = var166.field1065;
                            continue;
                        }
                        if (var541 == 3305) {
                            var5--;
                            int var169 = field763[var5];
                            field763[var5++] = client.field394[var169];
                            continue;
                        }
                        if (var541 == 3306) {
                            var5--;
                            int var170 = field763[var5];
                            field763[var5++] = client.field395[var170];
                            continue;
                        }
                        if (var541 == 3307) {
                            var5--;
                            int var171 = field763[var5];
                            field763[var5++] = client.field396[var171];
                            continue;
                        }
                        if (var541 == 3308) {
                            int var172 = Statics.field19;
                            int var173 = (Statics.field989.field815 >> 7) + Statics.field2112;
                            int var174 = (Statics.field989.field805 >> 7) + Statics.field2677;
                            field763[var5++] = (var172 << 28) + (var173 << 14) + var174;
                            continue;
                        }
                        if (var541 == 3309) {
                            var5--;
                            int var175 = field763[var5];
                            field763[var5++] = var175 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var541 == 3310) {
                            var5--;
                            int var176 = field763[var5];
                            field763[var5++] = var176 >> 28;
                            continue;
                        }
                        if (var541 == 3311) {
                            var5--;
                            int var177 = field763[var5];
                            field763[var5++] = var177 & 0x3FFF;
                            continue;
                        }
                        if (var541 == 3312) {
                            field763[var5++] = client.field263 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3313) {
                            var5 -= 2;
                            int var178 = field763[var5] + 32768;
                            int var179 = field763[var5 + 1];
                            int[] var180 = field763;
                            int var181 = var5++;
                            class16 var182 = (class16) class16.field200.method3571((long) var178);
                            int var183;
                            if (var182 == null) {
                                var183 = -1;
                            } else if (var179 >= 0 && var179 < var182.field196.length) {
                                var183 = var182.field196[var179];
                            } else {
                                var183 = -1;
                            }
                            var180[var181] = var183;
                            continue;
                        }
                        if (var541 == 3314) {
                            var5 -= 2;
                            int var184 = field763[var5] + 32768;
                            int var185 = field763[var5 + 1];
                            int[] var186 = field763;
                            int var187 = var5++;
                            class16 var188 = (class16) class16.field200.method3571((long) var184);
                            int var189;
                            if (var188 == null) {
                                var189 = 0;
                            } else if (var185 >= 0 && var185 < var188.field198.length) {
                                var189 = var188.field198[var185];
                            } else {
                                var189 = 0;
                            }
                            var186[var187] = var189;
                            continue;
                        }
                        if (var541 == 3315) {
                            var5 -= 2;
                            int var190 = field763[var5] + 32768;
                            int var191 = field763[var5 + 1];
                            field763[var5++] = class16.method130(var190, var191);
                            continue;
                        }
                        if (var541 == 3316) {
                            if (client.field493 >= 2) {
                                field763[var5++] = client.field493;
                            } else {
                                field763[var5++] = 0;
                            }
                            continue;
                        }
                        if (var541 == 3317) {
                            field763[var5++] = client.field306;
                            continue;
                        }
                        if (var541 == 3318) {
                            field763[var5++] = client.field260;
                            continue;
                        }
                        if (var541 == 3321) {
                            field763[var5++] = client.field422;
                            continue;
                        }
                        if (var541 == 3322) {
                            field763[var5++] = client.field294;
                            continue;
                        }
                        if (var541 == 3323) {
                            if (client.field426) {
                                field763[var5++] = 1;
                            } else {
                                field763[var5++] = 0;
                            }
                            continue;
                        }
                        if (var541 == 3324) {
                            field763[var5++] = client.field461;
                            continue;
                        }
                    } else if (var541 < 3500) {
                        if (var541 == 3400) {
                            var5 -= 2;
                            int var192 = field763[var5];
                            int var193 = field763[var5 + 1];
                            class49 var194 = class49.method583(var192);
                            if (var194.field1043 != 's') {
                            }
                            for (int var195 = 0; var195 < var194.field1046; var195++) {
                                if (var194.field1047[var195] == var193) {
                                    field762[var6++] = var194.field1049[var195];
                                    var194 = null;
                                    break;
                                }
                            }
                            if (var194 != null) {
                                field762[var6++] = var194.field1042;
                            }
                            continue;
                        }
                        if (var541 == 3408) {
                            var5 -= 4;
                            int var196 = field763[var5];
                            int var197 = field763[var5 + 1];
                            int var198 = field763[var5 + 2];
                            int var199 = field763[var5 + 3];
                            class49 var200 = class49.method583(var198);
                            if (var200.field1054 == var196 && var200.field1043 == var197) {
                                for (int var201 = 0; var201 < var200.field1046; var201++) {
                                    if (var200.field1047[var201] == var199) {
                                        if (var197 == 115) {
                                            field762[var6++] = var200.field1049[var201];
                                        } else {
                                            field763[var5++] = var200.field1040[var201];
                                        }
                                        var200 = null;
                                        break;
                                    }
                                }
                                if (var200 != null) {
                                    if (var197 == 115) {
                                        field762[var6++] = var200.field1042;
                                    } else {
                                        field763[var5++] = var200.field1045;
                                    }
                                }
                                continue;
                            }
                            if (var197 == 115) {
                                field762[var6++] = "null";
                            } else {
                                field763[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var541 < 3700) {
                        if (var541 == 3600) {
                            if (client.field525 == 0) {
                                field763[var5++] = -2;
                            } else if (client.field525 == 1) {
                                field763[var5++] = -1;
                            } else {
                                field763[var5++] = client.field410;
                            }
                            continue;
                        }
                        if (var541 == 3601) {
                            var5--;
                            int var202 = field763[var5];
                            if (client.field525 == 2 && var202 < client.field410) {
                                field762[var6++] = client.field284[var202].field228;
                                field762[var6++] = client.field284[var202].field223;
                                continue;
                            }
                            field762[var6++] = "";
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 3602) {
                            var5--;
                            int var203 = field763[var5];
                            if (client.field525 == 2 && var203 < client.field410) {
                                field763[var5++] = client.field284[var203].field224;
                                continue;
                            }
                            field763[var5++] = 0;
                            continue;
                        }
                        if (var541 == 3603) {
                            var5--;
                            int var204 = field763[var5];
                            if (client.field525 == 2 && var204 < client.field410) {
                                field763[var5++] = client.field284[var204].field225;
                                continue;
                            }
                            field763[var5++] = 0;
                            continue;
                        }
                        if (var541 == 3604) {
                            var6--;
                            String var205 = field762[var6];
                            var5--;
                            int var206 = field763[var5];
                            client.method151(var205, var206);
                            continue;
                        }
                        if (var541 == 3605) {
                            var6--;
                            String var207 = field762[var6];
                            if (var207 == null) {
                                continue;
                            }
                            if ((client.field410 < 200 || client.field339 == 1) && client.field410 < 400) {
                                String var208 = class164.method1092(var207, Statics.field1826);
                                if (var208 == null) {
                                    continue;
                                }
                                for (int var209 = 0; var209 < client.field410; var209++) {
                                    class18 var210 = client.field284[var209];
                                    String var211 = class164.method1092(var210.field228, Statics.field1826);
                                    if (var211 != null && var211.equals(var208)) {
                                        class12.method2685(30, "", var207 + class157.field2451);
                                        continue label3436;
                                    }
                                    if (var210.field223 != null) {
                                        String var212 = class164.method1092(var210.field223, Statics.field1826);
                                        if (var212 != null && var212.equals(var208)) {
                                            class12.method2685(30, "", var207 + class157.field2451);
                                            continue label3436;
                                        }
                                    }
                                }
                                for (int var213 = 0; var213 < client.field528; var213++) {
                                    class8 var214 = client.field529[var213];
                                    String var215 = class164.method1092(var214.field123, Statics.field1826);
                                    if (var215 != null && var215.equals(var208)) {
                                        class12.method2685(30, "", class157.field2456 + var207 + class157.field2457);
                                        continue label3436;
                                    }
                                    if (var214.field120 != null) {
                                        String var216 = class164.method1092(var214.field120, Statics.field1826);
                                        if (var216 != null && var216.equals(var208)) {
                                            class12.method2685(30, "", class157.field2456 + var207 + class157.field2457);
                                            continue label3436;
                                        }
                                    }
                                }
                                if (class164.method1092(Statics.field989.field47, Statics.field1826).equals(var208)) {
                                    class12.method2685(30, "", class157.field2454);
                                } else {
                                    client.field301.method2648(235);
                                    client.field301.method2366(class119.method2753(var207));
                                    client.field301.method2372(var207);
                                }
                                continue;
                            }
                            class12.method2685(30, "", class157.field2450);
                            continue;
                        }
                        if (var541 == 3606) {
                            var6--;
                            String var217 = field762[var6];
                            if (var217 == null) {
                                continue;
                            }
                            String var218 = class164.method1092(var217, Statics.field1826);
                            if (var218 == null) {
                                continue;
                            }
                            int var219 = 0;
                            while (true) {
                                if (var219 >= client.field410) {
                                    continue label3436;
                                }
                                class18 var220 = client.field284[var219];
                                String var221 = var220.field228;
                                String var222 = class164.method1092(var221, Statics.field1826);
                                boolean var223;
                                if (var217 == null || var221 == null) {
                                    var223 = false;
                                } else if (var217.startsWith("#") || var221.startsWith("#")) {
                                    var223 = var217.equals(var221);
                                } else {
                                    var223 = var218.equals(var222);
                                }
                                if (var223) {
                                    client.field410--;
                                    for (int var224 = var219; var224 < client.field410; var224++) {
                                        client.field284[var224] = client.field284[var224 + 1];
                                    }
                                    client.field361 = client.field442;
                                    client.field301.method2648(44);
                                    client.field301.method2366(class119.method2753(var217));
                                    client.field301.method2372(var217);
                                    continue label3436;
                                }
                                var219++;
                            }
                        }
                        if (var541 == 3607) {
                            var6--;
                            String var225 = field762[var6];
                            if (var225 == null) {
                                continue;
                            }
                            if ((client.field528 < 100 || client.field339 == 1) && client.field528 < 400) {
                                String var226 = class164.method1092(var225, Statics.field1826);
                                if (var226 == null) {
                                    continue;
                                }
                                for (int var227 = 0; var227 < client.field528; var227++) {
                                    class8 var228 = client.field529[var227];
                                    String var229 = class164.method1092(var228.field123, Statics.field1826);
                                    if (var229 != null && var229.equals(var226)) {
                                        class12.method2685(31, "", var225 + class157.field2453);
                                        continue label3436;
                                    }
                                    if (var228.field120 != null) {
                                        String var230 = class164.method1092(var228.field120, Statics.field1826);
                                        if (var230 != null && var230.equals(var226)) {
                                            class12.method2685(31, "", var225 + class157.field2453);
                                            continue label3436;
                                        }
                                    }
                                }
                                for (int var231 = 0; var231 < client.field410; var231++) {
                                    class18 var232 = client.field284[var231];
                                    String var233 = class164.method1092(var232.field228, Statics.field1826);
                                    if (var233 != null && var233.equals(var226)) {
                                        class12.method2685(31, "", class157.field2416 + var225 + class157.field2459);
                                        continue label3436;
                                    }
                                    if (var232.field223 != null) {
                                        String var234 = class164.method1092(var232.field223, Statics.field1826);
                                        if (var234 != null && var234.equals(var226)) {
                                            class12.method2685(31, "", class157.field2416 + var225 + class157.field2459);
                                            continue label3436;
                                        }
                                    }
                                }
                                if (class164.method1092(Statics.field989.field47, Statics.field1826).equals(var226)) {
                                    class12.method2685(31, "", class157.field2344);
                                } else {
                                    client.field301.method2648(92);
                                    client.field301.method2366(class119.method2753(var225));
                                    client.field301.method2372(var225);
                                }
                                continue;
                            }
                            class12.method2685(31, "", class157.field2437);
                            continue;
                        }
                        if (var541 == 3608) {
                            var6--;
                            String var235 = field762[var6];
                            if (var235 == null) {
                                continue;
                            }
                            String var236 = class164.method1092(var235, Statics.field1826);
                            if (var236 == null) {
                                continue;
                            }
                            int var237 = 0;
                            while (true) {
                                if (var237 >= client.field528) {
                                    continue label3436;
                                }
                                class8 var238 = client.field529[var237];
                                String var239 = var238.field123;
                                String var240 = class164.method1092(var239, Statics.field1826);
                                boolean var241;
                                if (var235 == null || var239 == null) {
                                    var241 = false;
                                } else if (var235.startsWith("#") || var239.startsWith("#")) {
                                    var241 = var235.equals(var239);
                                } else {
                                    var241 = var236.equals(var240);
                                }
                                if (var241) {
                                    client.field528--;
                                    for (int var242 = var237; var242 < client.field528; var242++) {
                                        client.field529[var242] = client.field529[var242 + 1];
                                    }
                                    client.field361 = client.field442;
                                    client.field301.method2648(0);
                                    client.field301.method2366(class119.method2753(var235));
                                    client.field301.method2372(var235);
                                    continue label3436;
                                }
                                var237++;
                            }
                        }
                        if (var541 == 3609) {
                            var6--;
                            String var243 = field762[var6];
                            class152[] var244 = class152.method2303();
                            for (int var245 = 0; var245 < var244.length; var245++) {
                                class152 var246 = var244[var245];
                                if (var246.field2234 != -1) {
                                    int var248 = var246.field2234;
                                    String var249 = "<img=" + var248 + ">";
                                    if (var243.startsWith(var249)) {
                                        var243 = var243.substring(6 + Integer.toString(var246.field2234).length());
                                        break;
                                    }
                                }
                            }
                            field763[var5++] = Statics.method928(var243, false) ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3611) {
                            if (client.field484 == null) {
                                field762[var6++] = "";
                            } else {
                                String[] var250 = field762;
                                int var251 = var6++;
                                String var252 = client.field484;
                                String var253 = class162.method178(class162.method1997(var252));
                                if (var253 == null) {
                                    var253 = "";
                                }
                                var250[var251] = var253;
                            }
                            continue;
                        }
                        if (var541 == 3612) {
                            if (client.field484 == null) {
                                field763[var5++] = 0;
                            } else {
                                field763[var5++] = Statics.field2683;
                            }
                            continue;
                        }
                        if (var541 == 3613) {
                            var5--;
                            int var255 = field763[var5];
                            if (client.field484 != null && var255 < Statics.field2683) {
                                field762[var6++] = Statics.field2214[var255].field594;
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 3614) {
                            var5--;
                            int var256 = field763[var5];
                            if (client.field484 != null && var256 < Statics.field2683) {
                                field763[var5++] = Statics.field2214[var256].field591;
                                continue;
                            }
                            field763[var5++] = 0;
                            continue;
                        }
                        if (var541 == 3615) {
                            var5--;
                            int var257 = field763[var5];
                            if (client.field484 != null && var257 < Statics.field2683) {
                                field763[var5++] = Statics.field2214[var257].field593;
                                continue;
                            }
                            field763[var5++] = 0;
                            continue;
                        }
                        if (var541 == 3616) {
                            field763[var5++] = Statics.field1820;
                            continue;
                        }
                        if (var541 == 3617) {
                            var6--;
                            String var258 = field762[var6];
                            Statics.method42(var258);
                            continue;
                        }
                        if (var541 == 3618) {
                            field763[var5++] = Statics.field1828;
                            continue;
                        }
                        if (var541 == 3619) {
                            var6--;
                            String var259 = field762[var6];
                            client.method191(var259);
                            continue;
                        }
                        if (var541 == 3620) {
                            client.method133();
                            continue;
                        }
                        if (var541 == 3621) {
                            if (client.field525 == 0) {
                                field763[var5++] = -1;
                            } else {
                                field763[var5++] = client.field528;
                            }
                            continue;
                        }
                        if (var541 == 3622) {
                            var5--;
                            int var260 = field763[var5];
                            if (client.field525 != 0 && var260 < client.field528) {
                                field762[var6++] = client.field529[var260].field123;
                                field762[var6++] = client.field529[var260].field120;
                                continue;
                            }
                            field762[var6++] = "";
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 3623) {
                            String var261;
                            label3082: {
                                var6--;
                                var261 = field762[var6];
                                String var263 = "<img=0>";
                                if (!var261.startsWith(var263)) {
                                    String var265 = "<img=1>";
                                    if (!var261.startsWith(var265)) {
                                        break label3082;
                                    }
                                }
                                var261 = var261.substring(7);
                            }
                            field763[var5++] = client.method2170(var261) ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3624) {
                            var5--;
                            int var266 = field763[var5];
                            if (Statics.field2214 != null && var266 < Statics.field2683 && Statics.field2214[var266].field594.equalsIgnoreCase(Statics.field989.field47)) {
                                field763[var5++] = 1;
                                continue;
                            }
                            field763[var5++] = 0;
                            continue;
                        }
                        if (var541 == 3625) {
                            if (client.field485 == null) {
                                field762[var6++] = "";
                            } else {
                                String[] var267 = field762;
                                int var268 = var6++;
                                String var269 = client.field485;
                                String var270 = class162.method178(class162.method1997(var269));
                                if (var270 == null) {
                                    var270 = "";
                                }
                                var267[var268] = var270;
                            }
                            continue;
                        }
                    } else if (var541 < 4000) {
                        if (var541 == 3903) {
                            var5--;
                            int var272 = field763[var5];
                            field763[var5++] = client.field331[var272].method3788();
                            continue;
                        }
                        if (var541 == 3904) {
                            var5--;
                            int var273 = field763[var5];
                            field763[var5++] = client.field331[var273].field3145;
                            continue;
                        }
                        if (var541 == 3905) {
                            var5--;
                            int var274 = field763[var5];
                            field763[var5++] = client.field331[var274].field3149;
                            continue;
                        }
                        if (var541 == 3906) {
                            var5--;
                            int var275 = field763[var5];
                            field763[var5++] = client.field331[var275].field3146;
                            continue;
                        }
                        if (var541 == 3907) {
                            var5--;
                            int var276 = field763[var5];
                            field763[var5++] = client.field331[var276].field3148;
                            continue;
                        }
                        if (var541 == 3908) {
                            var5--;
                            int var277 = field763[var5];
                            field763[var5++] = client.field331[var277].field3144;
                            continue;
                        }
                        if (var541 == 3910) {
                            var5--;
                            int var278 = field763[var5];
                            int var279 = client.field331[var278].method3787();
                            field763[var5++] = var279 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3911) {
                            var5--;
                            int var280 = field763[var5];
                            int var281 = client.field331[var280].method3787();
                            field763[var5++] = var281 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3912) {
                            var5--;
                            int var282 = field763[var5];
                            int var283 = client.field331[var282].method3787();
                            field763[var5++] = var283 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3913) {
                            var5--;
                            int var284 = field763[var5];
                            int var285 = client.field331[var284].method3787();
                            field763[var5++] = var285 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 3914) {
                            var5--;
                            boolean var286 = field763[var5] == 1;
                            if (Statics.field189 != null) {
                                Statics.field189.method3806(class221.field3150, var286);
                            }
                            continue;
                        }
                        if (var541 == 3915) {
                            var5--;
                            boolean var287 = field763[var5] == 1;
                            if (Statics.field189 != null) {
                                Statics.field189.method3806(class221.field3151, var287);
                            }
                            continue;
                        }
                        if (var541 == 3916) {
                            var5 -= 2;
                            boolean var288 = field763[var5] == 1;
                            boolean var289 = field763[var5 + 1] == 1;
                            if (Statics.field189 != null) {
                                Statics.field189.method3806(new class22(var289), var288);
                            }
                            continue;
                        }
                        if (var541 == 3917) {
                            var5--;
                            boolean var290 = field763[var5] == 1;
                            if (Statics.field189 != null) {
                                Statics.field189.method3806(class221.field3153, var290);
                            }
                            continue;
                        }
                        if (var541 == 3918) {
                            var5--;
                            boolean var291 = field763[var5] == 1;
                            if (Statics.field189 != null) {
                                Statics.field189.method3806(class221.field3154, var291);
                            }
                            continue;
                        }
                        if (var541 == 3919) {
                            field763[var5++] = Statics.field189 == null ? 0 : Statics.field189.field3152.size();
                            continue;
                        }
                        if (var541 == 3920) {
                            var5--;
                            int var292 = field763[var5];
                            class214 var293 = (class214) Statics.field189.field3152.get(var292);
                            field763[var5++] = var293.field3126;
                            continue;
                        }
                        if (var541 == 3921) {
                            var5--;
                            int var294 = field763[var5];
                            class214 var295 = (class214) Statics.field189.field3152.get(var294);
                            field762[var6++] = var295.method3739();
                            continue;
                        }
                        if (var541 == 3922) {
                            var5--;
                            int var296 = field763[var5];
                            class214 var297 = (class214) Statics.field189.field3152.get(var296);
                            field762[var6++] = var297.method3740();
                            continue;
                        }
                        if (var541 == 3923) {
                            var5--;
                            int var298 = field763[var5];
                            class214 var299 = (class214) Statics.field189.field3152.get(var298);
                            long var300 = class115.method2177() - Statics.field1925 - var299.field3121;
                            int var302 = (int) (var300 / 3600000L);
                            int var303 = (int) ((var300 - (long) (var302 * 3600000)) / 60000L);
                            int var304 = (int) ((var300 - (long) (var302 * 3600000) - (long) (var303 * 60000)) / 1000L);
                            String var305 = var302 + ":" + var303 / 10 + var303 % 10 + ":" + var304 / 10 + var304 % 10;
                            field762[var6++] = var305;
                            continue;
                        }
                        if (var541 == 3924) {
                            var5--;
                            int var306 = field763[var5];
                            class214 var307 = (class214) Statics.field189.field3152.get(var306);
                            field763[var5++] = var307.field3122.field3146;
                            continue;
                        }
                        if (var541 == 3925) {
                            var5--;
                            int var308 = field763[var5];
                            class214 var309 = (class214) Statics.field189.field3152.get(var308);
                            field763[var5++] = var309.field3122.field3149;
                            continue;
                        }
                        if (var541 == 3926) {
                            var5--;
                            int var310 = field763[var5];
                            class214 var311 = (class214) Statics.field189.field3152.get(var310);
                            field763[var5++] = var311.field3122.field3145;
                            continue;
                        }
                    } else if (var541 < 4100) {
                        if (var541 == 4000) {
                            var5 -= 2;
                            int var312 = field763[var5];
                            int var313 = field763[var5 + 1];
                            field763[var5++] = var312 + var313;
                            continue;
                        }
                        if (var541 == 4001) {
                            var5 -= 2;
                            int var314 = field763[var5];
                            int var315 = field763[var5 + 1];
                            field763[var5++] = var314 - var315;
                            continue;
                        }
                        if (var541 == 4002) {
                            var5 -= 2;
                            int var316 = field763[var5];
                            int var317 = field763[var5 + 1];
                            field763[var5++] = var316 * var317;
                            continue;
                        }
                        if (var541 == 4003) {
                            var5 -= 2;
                            int var318 = field763[var5];
                            int var319 = field763[var5 + 1];
                            field763[var5++] = var318 / var319;
                            continue;
                        }
                        if (var541 == 4004) {
                            var5--;
                            int var320 = field763[var5];
                            field763[var5++] = (int) (Math.random() * (double) var320);
                            continue;
                        }
                        if (var541 == 4005) {
                            var5--;
                            int var321 = field763[var5];
                            field763[var5++] = (int) (Math.random() * (double) (var321 + 1));
                            continue;
                        }
                        if (var541 == 4006) {
                            var5 -= 5;
                            int var322 = field763[var5];
                            int var323 = field763[var5 + 1];
                            int var324 = field763[var5 + 2];
                            int var325 = field763[var5 + 3];
                            int var326 = field763[var5 + 4];
                            field763[var5++] = (var323 - var322) * (var326 - var324) / (var325 - var324) + var322;
                            continue;
                        }
                        if (var541 == 4007) {
                            var5 -= 2;
                            int var327 = field763[var5];
                            int var328 = field763[var5 + 1];
                            field763[var5++] = var327 * var328 / 100 + var327;
                            continue;
                        }
                        if (var541 == 4008) {
                            var5 -= 2;
                            int var329 = field763[var5];
                            int var330 = field763[var5 + 1];
                            field763[var5++] = var329 | 0x1 << var330;
                            continue;
                        }
                        if (var541 == 4009) {
                            var5 -= 2;
                            int var331 = field763[var5];
                            int var332 = field763[var5 + 1];
                            field763[var5++] = var331 & -1 - (0x1 << var332);
                            continue;
                        }
                        if (var541 == 4010) {
                            var5 -= 2;
                            int var333 = field763[var5];
                            int var334 = field763[var5 + 1];
                            field763[var5++] = (var333 & 0x1 << var334) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var541 == 4011) {
                            var5 -= 2;
                            int var335 = field763[var5];
                            int var336 = field763[var5 + 1];
                            field763[var5++] = var335 % var336;
                            continue;
                        }
                        if (var541 == 4012) {
                            var5 -= 2;
                            int var337 = field763[var5];
                            int var338 = field763[var5 + 1];
                            if (var337 == 0) {
                                field763[var5++] = 0;
                            } else {
                                field763[var5++] = (int) Math.pow((double) var337, (double) var338);
                            }
                            continue;
                        }
                        if (var541 == 4013) {
                            var5 -= 2;
                            int var339 = field763[var5];
                            int var340 = field763[var5 + 1];
                            if (var339 == 0) {
                                field763[var5++] = 0;
                            } else if (var340 == 0) {
                                field763[var5++] = Integer.MAX_VALUE;
                            } else {
                                field763[var5++] = (int) Math.pow((double) var339, 1.0D / (double) var340);
                            }
                            continue;
                        }
                        if (var541 == 4014) {
                            var5 -= 2;
                            int var341 = field763[var5];
                            int var342 = field763[var5 + 1];
                            field763[var5++] = var341 & var342;
                            continue;
                        }
                        if (var541 == 4015) {
                            var5 -= 2;
                            int var343 = field763[var5];
                            int var344 = field763[var5 + 1];
                            field763[var5++] = var343 | var344;
                            continue;
                        }
                    } else if (var541 < 4200) {
                        if (var541 == 4100) {
                            var6--;
                            String var345 = field762[var6];
                            var5--;
                            int var346 = field763[var5];
                            field762[var6++] = var345 + var346;
                            continue;
                        }
                        if (var541 == 4101) {
                            var6 -= 2;
                            String var347 = field762[var6];
                            String var348 = field762[var6 + 1];
                            field762[var6++] = var347 + var348;
                            continue;
                        }
                        if (var541 == 4102) {
                            var6--;
                            String var349 = field762[var6];
                            var5--;
                            int var350 = field763[var5];
                            String[] var351 = field762;
                            int var352 = var6++;
                            String var354;
                            if (var350 < 0) {
                                var354 = Integer.toString(var350);
                            } else {
                                int var355 = var350;
                                String var356;
                                if (var350 < 0) {
                                    var356 = Integer.toString(var350, 10);
                                } else {
                                    int var357 = 2;
                                    int var358 = var350 / 10;
                                    while (var358 != 0) {
                                        var358 /= 10;
                                        var357++;
                                    }
                                    char[] var359 = new char[var357];
                                    var359[0] = '+';
                                    for (int var360 = var357 - 1; var360 > 0; var360--) {
                                        int var361 = var355;
                                        var355 /= 10;
                                        int var362 = var361 - var355 * 10;
                                        if (var362 >= 10) {
                                            var359[var360] = (char) (var362 + 87);
                                        } else {
                                            var359[var360] = (char) (var362 + 48);
                                        }
                                    }
                                    var356 = new String(var359);
                                }
                                var354 = var356;
                            }
                            var351[var352] = var349 + var354;
                            continue;
                        }
                        if (var541 == 4103) {
                            var6--;
                            String var363 = field762[var6];
                            field762[var6++] = var363.toLowerCase();
                            continue;
                        }
                        if (var541 == 4104) {
                            var5--;
                            int var364 = field763[var5];
                            long var365 = ((long) var364 + 11745L) * 86400000L;
                            field768.setTime(new Date(var365));
                            int var367 = field768.get(5);
                            int var368 = field768.get(2);
                            int var369 = field768.get(1);
                            field762[var6++] = var367 + "-" + field769[var368] + "-" + var369;
                            continue;
                        }
                        if (var541 == 4105) {
                            var6 -= 2;
                            String var370 = field762[var6];
                            String var371 = field762[var6 + 1];
                            if (Statics.field989.field32 != null && Statics.field989.field32.field2895) {
                                field762[var6++] = var371;
                                continue;
                            }
                            field762[var6++] = var370;
                            continue;
                        }
                        if (var541 == 4106) {
                            var5--;
                            int var372 = field763[var5];
                            field762[var6++] = Integer.toString(var372);
                            continue;
                        }
                        if (var541 == 4107) {
                            var6 -= 2;
                            int[] var373 = field763;
                            int var374 = var5++;
                            String var375 = field762[var6];
                            String var376 = field762[var6 + 1];
                            int var377 = client.field265;
                            int var378 = var375.length();
                            int var379 = var376.length();
                            int var380 = 0;
                            int var381 = 0;
                            byte var382 = 0;
                            byte var383 = 0;
                            int var384;
                            label3163: while (true) {
                                if (var380 - var382 >= var378 && var381 - var383 >= var379) {
                                    int var395 = Math.min(var378, var379);
                                    for (int var396 = 0; var396 < var395; var396++) {
                                        char var399 = var375.charAt(var396);
                                        char var400 = var376.charAt(var396);
                                        if (var399 != var400 && Character.toUpperCase(var399) != Character.toUpperCase(var400)) {
                                            char var401 = Character.toLowerCase(var399);
                                            char var402 = Character.toLowerCase(var400);
                                            if (var401 != var402) {
                                                var384 = class166.method751(var401, var377) - class166.method751(var402, var377);
                                                break label3163;
                                            }
                                        }
                                    }
                                    int var403 = var378 - var379;
                                    if (var403 == 0) {
                                        for (int var404 = 0; var404 < var395; var404++) {
                                            char var405 = var375.charAt(var404);
                                            char var406 = var376.charAt(var404);
                                            if (var405 != var406) {
                                                var384 = class166.method751(var405, var377) - class166.method751(var406, var377);
                                                break label3163;
                                            }
                                        }
                                        var384 = 0;
                                    } else {
                                        var384 = var403;
                                    }
                                    break;
                                }
                                if (var380 - var382 >= var378) {
                                    var384 = -1;
                                    break;
                                }
                                if (var381 - var383 >= var379) {
                                    var384 = 1;
                                    break;
                                }
                                char var385;
                                if (var382 == 0) {
                                    var385 = var375.charAt(var380++);
                                } else {
                                    var385 = (char) var382;
                                    boolean var386 = false;
                                }
                                char var387;
                                if (var383 == 0) {
                                    var387 = var376.charAt(var381++);
                                } else {
                                    var387 = (char) var383;
                                    boolean var388 = false;
                                }
                                byte var389;
                                if (var385 == 198) {
                                    var389 = 69;
                                } else if (var385 == 230) {
                                    var389 = 101;
                                } else if (var385 == 223) {
                                    var389 = 115;
                                } else if (var385 == 338) {
                                    var389 = 69;
                                } else if (var385 == 339) {
                                    var389 = 101;
                                } else {
                                    var389 = 0;
                                }
                                var382 = var389;
                                byte var390;
                                if (var387 == 198) {
                                    var390 = 69;
                                } else if (var387 == 230) {
                                    var390 = 101;
                                } else if (var387 == 223) {
                                    var390 = 115;
                                } else if (var387 == 338) {
                                    var390 = 69;
                                } else if (var387 == 339) {
                                    var390 = 101;
                                } else {
                                    var390 = 0;
                                }
                                var383 = var390;
                                char var391 = class166.method778(var385, var377);
                                char var392 = class166.method778(var387, var377);
                                if (var391 != var392 && Character.toUpperCase(var391) != Character.toUpperCase(var392)) {
                                    char var393 = Character.toLowerCase(var391);
                                    char var394 = Character.toLowerCase(var392);
                                    if (var393 != var394) {
                                        var384 = class166.method751(var393, var377) - class166.method751(var394, var377);
                                        break;
                                    }
                                }
                            }
                            var373[var374] = class163.method201(var384);
                            continue;
                        }
                        if (var541 == 4108) {
                            var6--;
                            String var407 = field762[var6];
                            var5 -= 2;
                            int var408 = field763[var5];
                            int var409 = field763[var5 + 1];
                            byte[] var410 = Statics.field1635.method3080(var409, 0);
                            class224 var411 = new class224(var410);
                            field763[var5++] = var411.method3839(var407, var408);
                            continue;
                        }
                        if (var541 == 4109) {
                            var6--;
                            String var412 = field762[var6];
                            var5 -= 2;
                            int var413 = field763[var5];
                            int var414 = field763[var5 + 1];
                            byte[] var415 = Statics.field1635.method3080(var414, 0);
                            class224 var416 = new class224(var415);
                            field763[var5++] = var416.method3823(var412, var413);
                            continue;
                        }
                        if (var541 == 4110) {
                            var6 -= 2;
                            String var417 = field762[var6];
                            String var418 = field762[var6 + 1];
                            var5--;
                            if (field763[var5] == 1) {
                                field762[var6++] = var417;
                            } else {
                                field762[var6++] = var418;
                            }
                            continue;
                        }
                        if (var541 == 4111) {
                            var6--;
                            String var419 = field762[var6];
                            field762[var6++] = class223.method3825(var419);
                            continue;
                        }
                        if (var541 == 4112) {
                            var6--;
                            String var420 = field762[var6];
                            var5--;
                            int var421 = field763[var5];
                            field762[var6++] = var420 + (char) var421;
                            continue;
                        }
                        if (var541 == 4113) {
                            var5--;
                            int var422 = field763[var5];
                            int[] var423 = field763;
                            int var424 = var5++;
                            char var425 = (char) var422;
                            boolean var426;
                            if (var425 >= ' ' && var425 <= '~') {
                                var426 = true;
                            } else if (var425 >= 160 && var425 <= 255) {
                                var426 = true;
                            } else if (var425 == 8364 || var425 == 338 || var425 == 8212 || var425 == 339 || var425 == 376) {
                                var426 = true;
                            } else {
                                var426 = false;
                            }
                            var423[var424] = var426 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 4114) {
                            var5--;
                            int var427 = field763[var5];
                            int[] var428 = field763;
                            int var429 = var5++;
                            char var430 = (char) var427;
                            boolean var431 = var430 >= '0' && var430 <= '9' || var430 >= 'A' && var430 <= 'Z' || var430 >= 'a' && var430 <= 'z';
                            var428[var429] = var431 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 4115) {
                            var5--;
                            int var432 = field763[var5];
                            field763[var5++] = class163.method1588((char) var432) ? 1 : 0;
                            continue;
                        }
                        if (var541 == 4116) {
                            var5--;
                            int var433 = field763[var5];
                            field763[var5++] = class163.method96((char) var433) ? 1 : 0;
                            continue;
                        }
                        if (var541 == 4117) {
                            var6--;
                            String var434 = field762[var6];
                            if (var434 == null) {
                                field763[var5++] = 0;
                            } else {
                                field763[var5++] = var434.length();
                            }
                            continue;
                        }
                        if (var541 == 4118) {
                            var6--;
                            String var435 = field762[var6];
                            var5 -= 2;
                            int var436 = field763[var5];
                            int var437 = field763[var5 + 1];
                            field762[var6++] = var435.substring(var436, var437);
                            continue;
                        }
                        if (var541 == 4119) {
                            var6--;
                            String var438 = field762[var6];
                            StringBuilder var439 = new StringBuilder(var438.length());
                            boolean var440 = false;
                            for (int var441 = 0; var441 < var438.length(); var441++) {
                                char var442 = var438.charAt(var441);
                                if (var442 == '<') {
                                    var440 = true;
                                } else if (var442 == '>') {
                                    var440 = false;
                                } else if (!var440) {
                                    var439.append(var442);
                                }
                            }
                            field762[var6++] = var439.toString();
                            continue;
                        }
                        if (var541 == 4120) {
                            var6--;
                            String var443 = field762[var6];
                            var5--;
                            int var444 = field763[var5];
                            field763[var5++] = var443.indexOf(var444);
                            continue;
                        }
                        if (var541 == 4121) {
                            var6 -= 2;
                            String var445 = field762[var6];
                            String var446 = field762[var6 + 1];
                            var5--;
                            int var447 = field763[var5];
                            field763[var5++] = var445.indexOf(var446, var447);
                            continue;
                        }
                    } else if (var541 < 4300) {
                        if (var541 == 4200) {
                            var5--;
                            int var448 = field763[var5];
                            field762[var6++] = class52.method168(var448).field1082;
                            continue;
                        }
                        if (var541 == 4201) {
                            var5 -= 2;
                            int var449 = field763[var5];
                            int var450 = field763[var5 + 1];
                            class52 var451 = class52.method168(var449);
                            if (var450 >= 1 && var450 <= 5 && var451.field1070[var450 - 1] != null) {
                                field762[var6++] = var451.field1070[var450 - 1];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 4202) {
                            var5 -= 2;
                            int var452 = field763[var5];
                            int var453 = field763[var5 + 1];
                            class52 var454 = class52.method168(var452);
                            if (var453 >= 1 && var453 <= 5 && var454.field1103[var453 - 1] != null) {
                                field762[var6++] = var454.field1103[var453 - 1];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var541 == 4203) {
                            var5--;
                            int var455 = field763[var5];
                            field763[var5++] = class52.method168(var455).field1088;
                            continue;
                        }
                        if (var541 == 4204) {
                            var5--;
                            int var456 = field763[var5];
                            field763[var5++] = class52.method168(var456).field1089 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 4205) {
                            var5--;
                            int var457 = field763[var5];
                            class52 var458 = class52.method168(var457);
                            if (var458.field1109 == -1 && var458.field1083 >= 0) {
                                field763[var5++] = var458.field1083;
                                continue;
                            }
                            field763[var5++] = var457;
                            continue;
                        }
                        if (var541 == 4206) {
                            var5--;
                            int var459 = field763[var5];
                            class52 var460 = class52.method168(var459);
                            if (var460.field1109 >= 0 && var460.field1083 >= 0) {
                                field763[var5++] = var460.field1083;
                                continue;
                            }
                            field763[var5++] = var459;
                            continue;
                        }
                        if (var541 == 4207) {
                            var5--;
                            int var461 = field763[var5];
                            field763[var5++] = class52.method168(var461).field1091 ? 1 : 0;
                            continue;
                        }
                        if (var541 == 4210) {
                            var6--;
                            String var462 = field762[var6];
                            var5--;
                            int var463 = field763[var5];
                            boolean var465 = var463 == 1;
                            String var466 = var462.toLowerCase();
                            short[] var467 = new short[16];
                            int var468 = 0;
                            int var469 = 0;
                            while (true) {
                                if (var469 >= Statics.field2886) {
                                    Statics.field1924 = var467;
                                    Statics.field712 = 0;
                                    Statics.field2631 = var468;
                                    String[] var473 = new String[Statics.field2631];
                                    for (int var474 = 0; var474 < Statics.field2631; var474++) {
                                        var473[var474] = class52.method168(var467[var474]).field1082;
                                    }
                                    class124.method2263(var473, Statics.field1924);
                                    break;
                                }
                                class52 var470 = class52.method168(var469);
                                if ((!var465 || var470.field1116) && var470.field1109 == -1 && var470.field1082.toLowerCase().indexOf(var466) != -1) {
                                    if (var468 >= 250) {
                                        Statics.field2631 = -1;
                                        Statics.field1924 = null;
                                        break;
                                    }
                                    if (var468 >= var467.length) {
                                        short[] var471 = new short[var467.length * 2];
                                        for (int var472 = 0; var472 < var468; var472++) {
                                            var471[var472] = var467[var472];
                                        }
                                        var467 = var471;
                                    }
                                    var467[var468++] = (short) var469;
                                }
                                var469++;
                            }
                            field763[var5++] = Statics.field2631;
                            continue;
                        }
                        if (var541 == 4211) {
                            if (Statics.field1924 != null && Statics.field712 < Statics.field2631) {
                                field763[var5++] = Statics.field1924[++Statics.field712 - 1] & 0xFFFF;
                                continue;
                            }
                            field763[var5++] = -1;
                            continue;
                        }
                        if (var541 == 4212) {
                            Statics.field712 = 0;
                            continue;
                        }
                    } else if (var541 < 5100) {
                        if (var541 == 5000) {
                            field763[var5++] = client.field475;
                            continue;
                        }
                        if (var541 == 5001) {
                            var5 -= 3;
                            client.field475 = field763[var5];
                            Statics.field218 = class130.method161(field763[var5 + 1]);
                            if (Statics.field218 == null) {
                                Statics.field218 = class130.field2021;
                            }
                            client.field289 = field763[var5 + 2];
                            client.field301.method2648(124);
                            client.field301.method2366(client.field475);
                            client.field301.method2366(Statics.field218.field2022);
                            client.field301.method2366(client.field289);
                            continue;
                        }
                        if (var541 == 5002) {
                            var6--;
                            String var475 = field762[var6];
                            var5 -= 2;
                            int var476 = field763[var5];
                            int var477 = field763[var5 + 1];
                            client.field301.method2648(161);
                            client.field301.method2366(class119.method2753(var475) + 2);
                            client.field301.method2372(var475);
                            client.field301.method2366(var476 - 1);
                            client.field301.method2366(var477);
                            continue;
                        }
                        if (var541 == 5003) {
                            var5 -= 2;
                            int var478 = field763[var5];
                            int var479 = field763[var5 + 1];
                            class28 var480 = (class28) class12.field160.get(var478);
                            class36 var481 = var480.method661(var479);
                            if (var481 == null) {
                                field763[var5++] = -1;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                                field762[var6++] = "";
                                field762[var6++] = "";
                            } else {
                                field763[var5++] = var481.field755;
                                field763[var5++] = var481.field750;
                                field762[var6++] = var481.field751 == null ? "" : var481.field751;
                                field762[var6++] = var481.field753 == null ? "" : var481.field753;
                                field762[var6++] = var481.field754 == null ? "" : var481.field754;
                            }
                            continue;
                        }
                        if (var541 == 5004) {
                            var5--;
                            int var483 = field763[var5];
                            class36 var484 = class12.method733(var483);
                            if (var484 == null) {
                                field763[var5++] = -1;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                                field762[var6++] = "";
                                field762[var6++] = "";
                            } else {
                                field763[var5++] = var484.field752;
                                field763[var5++] = var484.field750;
                                field762[var6++] = var484.field751 == null ? "" : var484.field751;
                                field762[var6++] = var484.field753 == null ? "" : var484.field753;
                                field762[var6++] = var484.field754 == null ? "" : var484.field754;
                            }
                            continue;
                        }
                        if (var541 == 5005) {
                            if (Statics.field218 == null) {
                                field763[var5++] = -1;
                            } else {
                                field763[var5++] = Statics.field218.field2022;
                            }
                            continue;
                        }
                        if (var541 == 5008) {
                            var6--;
                            String var485 = field762[var6];
                            var5--;
                            int var486 = field763[var5];
                            String var487 = var485.toLowerCase();
                            byte var488 = 0;
                            if (var487.startsWith(class157.field2460)) {
                                var488 = 0;
                                var485 = var485.substring(class157.field2460.length());
                            } else if (var487.startsWith(class157.field2327)) {
                                var488 = 1;
                                var485 = var485.substring(class157.field2327.length());
                            } else if (var487.startsWith(class157.field2294)) {
                                var488 = 2;
                                var485 = var485.substring(class157.field2294.length());
                            } else if (var487.startsWith(class157.field2351)) {
                                var488 = 3;
                                var485 = var485.substring(class157.field2351.length());
                            } else if (var487.startsWith(class157.field2504)) {
                                var488 = 4;
                                var485 = var485.substring(class157.field2504.length());
                            } else if (var487.startsWith(class157.field2501)) {
                                var488 = 5;
                                var485 = var485.substring(class157.field2501.length());
                            } else if (var487.startsWith(class157.field2472)) {
                                var488 = 6;
                                var485 = var485.substring(class157.field2472.length());
                            } else if (var487.startsWith(class157.field2474)) {
                                var488 = 7;
                                var485 = var485.substring(class157.field2474.length());
                            } else if (var487.startsWith(class157.field2506)) {
                                var488 = 8;
                                var485 = var485.substring(class157.field2506.length());
                            } else if (var487.startsWith(class157.field2478)) {
                                var488 = 9;
                                var485 = var485.substring(class157.field2478.length());
                            } else if (var487.startsWith(class157.field2469)) {
                                var488 = 10;
                                var485 = var485.substring(class157.field2469.length());
                            } else if (var487.startsWith(class157.field2482)) {
                                var488 = 11;
                                var485 = var485.substring(class157.field2482.length());
                            } else if (client.field265 != 0) {
                                if (var487.startsWith(class157.field2461)) {
                                    var488 = 0;
                                    var485 = var485.substring(class157.field2461.length());
                                } else if (var487.startsWith(class157.field2463)) {
                                    var488 = 1;
                                    var485 = var485.substring(class157.field2463.length());
                                } else if (var487.startsWith(class157.field2465)) {
                                    var488 = 2;
                                    var485 = var485.substring(class157.field2465.length());
                                } else if (var487.startsWith(class157.field2467)) {
                                    var488 = 3;
                                    var485 = var485.substring(class157.field2467.length());
                                } else if (var487.startsWith(class157.field2315)) {
                                    var488 = 4;
                                    var485 = var485.substring(class157.field2315.length());
                                } else if (var487.startsWith(class157.field2471)) {
                                    var488 = 5;
                                    var485 = var485.substring(class157.field2471.length());
                                } else if (var487.startsWith(class157.field2394)) {
                                    var488 = 6;
                                    var485 = var485.substring(class157.field2394.length());
                                } else if (var487.startsWith(class157.field2475)) {
                                    var488 = 7;
                                    var485 = var485.substring(class157.field2475.length());
                                } else if (var487.startsWith(class157.field2477)) {
                                    var488 = 8;
                                    var485 = var485.substring(class157.field2477.length());
                                } else if (var487.startsWith(class157.field2387)) {
                                    var488 = 9;
                                    var485 = var485.substring(class157.field2387.length());
                                } else if (var487.startsWith(class157.field2481)) {
                                    var488 = 10;
                                    var485 = var485.substring(class157.field2481.length());
                                } else if (var487.startsWith(class157.field2335)) {
                                    var488 = 11;
                                    var485 = var485.substring(class157.field2335.length());
                                }
                            }
                            String var489 = var485.toLowerCase();
                            byte var490 = 0;
                            if (var489.startsWith(class157.field2370)) {
                                var490 = 1;
                                var485 = var485.substring(class157.field2370.length());
                            } else if (var489.startsWith(class157.field2476)) {
                                var490 = 2;
                                var485 = var485.substring(class157.field2476.length());
                            } else if (var489.startsWith(class157.field2524)) {
                                var490 = 3;
                                var485 = var485.substring(class157.field2524.length());
                            } else if (var489.startsWith(class157.field2490)) {
                                var490 = 4;
                                var485 = var485.substring(class157.field2490.length());
                            } else if (var489.startsWith(class157.field2299)) {
                                var490 = 5;
                                var485 = var485.substring(class157.field2299.length());
                            } else if (client.field265 != 0) {
                                if (var489.startsWith(class157.field2302)) {
                                    var490 = 1;
                                    var485 = var485.substring(class157.field2302.length());
                                } else if (var489.startsWith(class157.field2487)) {
                                    var490 = 2;
                                    var485 = var485.substring(class157.field2487.length());
                                } else if (var489.startsWith(class157.field2489)) {
                                    var490 = 3;
                                    var485 = var485.substring(class157.field2489.length());
                                } else if (var489.startsWith(class157.field2491)) {
                                    var490 = 4;
                                    var485 = var485.substring(class157.field2491.length());
                                } else if (var489.startsWith(class157.field2493)) {
                                    var490 = 5;
                                    var485 = var485.substring(class157.field2493.length());
                                }
                            }
                            client.field301.method2648(219);
                            client.field301.method2366(0);
                            int var491 = client.field301.field1955;
                            client.field301.method2366(var486);
                            client.field301.method2366(var488);
                            client.field301.method2366(var490);
                            class122 var492 = client.field301;
                            int var493 = var492.field1955;
                            int var494 = var485.length();
                            byte[] var495 = new byte[var494];
                            for (int var496 = 0; var496 < var494; var496++) {
                                char var497 = var485.charAt(var496);
                                if (!(var497 <= 0 || var497 >= 128) || !(var497 < 160 || var497 > 255)) {
                                    var495[var496] = (byte) var497;
                                } else if (var497 == 8364) {
                                    var495[var496] = -128;
                                } else if (var497 == 8218) {
                                    var495[var496] = -126;
                                } else if (var497 == 402) {
                                    var495[var496] = -125;
                                } else if (var497 == 8222) {
                                    var495[var496] = -124;
                                } else if (var497 == 8230) {
                                    var495[var496] = -123;
                                } else if (var497 == 8224) {
                                    var495[var496] = -122;
                                } else if (var497 == 8225) {
                                    var495[var496] = -121;
                                } else if (var497 == 710) {
                                    var495[var496] = -120;
                                } else if (var497 == 8240) {
                                    var495[var496] = -119;
                                } else if (var497 == 352) {
                                    var495[var496] = -118;
                                } else if (var497 == 8249) {
                                    var495[var496] = -117;
                                } else if (var497 == 338) {
                                    var495[var496] = -116;
                                } else if (var497 == 381) {
                                    var495[var496] = -114;
                                } else if (var497 == 8216) {
                                    var495[var496] = -111;
                                } else if (var497 == 8217) {
                                    var495[var496] = -110;
                                } else if (var497 == 8220) {
                                    var495[var496] = -109;
                                } else if (var497 == 8221) {
                                    var495[var496] = -108;
                                } else if (var497 == 8226) {
                                    var495[var496] = -107;
                                } else if (var497 == 8211) {
                                    var495[var496] = -106;
                                } else if (var497 == 8212) {
                                    var495[var496] = -105;
                                } else if (var497 == 732) {
                                    var495[var496] = -104;
                                } else if (var497 == 8482) {
                                    var495[var496] = -103;
                                } else if (var497 == 353) {
                                    var495[var496] = -102;
                                } else if (var497 == 8250) {
                                    var495[var496] = -101;
                                } else if (var497 == 339) {
                                    var495[var496] = -100;
                                } else if (var497 == 382) {
                                    var495[var496] = -98;
                                } else if (var497 == 376) {
                                    var495[var496] = -97;
                                } else {
                                    var495[var496] = 63;
                                }
                            }
                            var492.method2379(var495.length);
                            var492.field1955 += Statics.field3155.method2310(var495, 0, var495.length, var492.field1959, var492.field1955);
                            client.field301.method2533(client.field301.field1955 - var491);
                            continue;
                        }
                        if (var541 == 5009) {
                            var6 -= 2;
                            String var500 = field762[var6];
                            String var501 = field762[var6 + 1];
                            client.field301.method2648(72);
                            client.field301.method2466(0);
                            int var502 = client.field301.field1955;
                            client.field301.method2372(var500);
                            class122 var503 = client.field301;
                            int var504 = var503.field1955;
                            int var505 = var501.length();
                            byte[] var506 = new byte[var505];
                            for (int var507 = 0; var507 < var505; var507++) {
                                char var508 = var501.charAt(var507);
                                if (var508 > 0 && var508 < 128 || var508 >= 160 && var508 <= 255) {
                                    var506[var507] = (byte) var508;
                                } else if (var508 == 8364) {
                                    var506[var507] = -128;
                                } else if (var508 == 8218) {
                                    var506[var507] = -126;
                                } else if (var508 == 402) {
                                    var506[var507] = -125;
                                } else if (var508 == 8222) {
                                    var506[var507] = -124;
                                } else if (var508 == 8230) {
                                    var506[var507] = -123;
                                } else if (var508 == 8224) {
                                    var506[var507] = -122;
                                } else if (var508 == 8225) {
                                    var506[var507] = -121;
                                } else if (var508 == 710) {
                                    var506[var507] = -120;
                                } else if (var508 == 8240) {
                                    var506[var507] = -119;
                                } else if (var508 == 352) {
                                    var506[var507] = -118;
                                } else if (var508 == 8249) {
                                    var506[var507] = -117;
                                } else if (var508 == 338) {
                                    var506[var507] = -116;
                                } else if (var508 == 381) {
                                    var506[var507] = -114;
                                } else if (var508 == 8216) {
                                    var506[var507] = -111;
                                } else if (var508 == 8217) {
                                    var506[var507] = -110;
                                } else if (var508 == 8220) {
                                    var506[var507] = -109;
                                } else if (var508 == 8221) {
                                    var506[var507] = -108;
                                } else if (var508 == 8226) {
                                    var506[var507] = -107;
                                } else if (var508 == 8211) {
                                    var506[var507] = -106;
                                } else if (var508 == 8212) {
                                    var506[var507] = -105;
                                } else if (var508 == 732) {
                                    var506[var507] = -104;
                                } else if (var508 == 8482) {
                                    var506[var507] = -103;
                                } else if (var508 == 353) {
                                    var506[var507] = -102;
                                } else if (var508 == 8250) {
                                    var506[var507] = -101;
                                } else if (var508 == 339) {
                                    var506[var507] = -100;
                                } else if (var508 == 382) {
                                    var506[var507] = -98;
                                } else if (var508 == 376) {
                                    var506[var507] = -97;
                                } else {
                                    var506[var507] = 63;
                                }
                            }
                            var503.method2379(var506.length);
                            var503.field1955 += Statics.field3155.method2310(var506, 0, var506.length, var503.field1959, var503.field1955);
                            client.field301.method2377(client.field301.field1955 - var502);
                            continue;
                        }
                        if (var541 == 5015) {
                            String var511;
                            if (Statics.field989 == null || Statics.field989.field47 == null) {
                                var511 = "";
                            } else {
                                var511 = Statics.field989.field47;
                            }
                            field762[var6++] = var511;
                            continue;
                        }
                        if (var541 == 5016) {
                            field763[var5++] = client.field289;
                            continue;
                        }
                        if (var541 == 5017) {
                            var5--;
                            int var512 = field763[var5];
                            field763[var5++] = class12.method744(var512);
                            continue;
                        }
                        if (var541 == 5018) {
                            var5--;
                            int var513 = field763[var5];
                            field763[var5++] = class12.method2304(var513);
                            continue;
                        }
                        if (var541 == 5019) {
                            var5--;
                            int var514 = field763[var5];
                            int[] var515 = field763;
                            int var516 = var5++;
                            class36 var517 = (class36) class12.field161.method3589((long) var514);
                            int var518;
                            if (var517 == null) {
                                var518 = -1;
                            } else if (class12.field162.field3079 == var517.field3084) {
                                var518 = -1;
                            } else {
                                var518 = ((class36) var517.field3084).field755;
                            }
                            var515[var516] = var518;
                            continue;
                        }
                        if (var541 == 5020) {
                            var6--;
                            String var519 = field762[var6];
                            client.method777(var519);
                            continue;
                        }
                        if (var541 == 5021) {
                            var6--;
                            client.field477 = field762[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var541 == 5022) {
                            field762[var6++] = client.field477;
                            continue;
                        }
                    }
                }
                if (var541 < 5400) {
                    if (var541 == 5306) {
                        field763[var5++] = client.method728();
                        continue;
                    }
                    if (var541 == 5307) {
                        var5--;
                        int var520 = field763[var5];
                        if (var520 != 1 && var520 != 2) {
                            continue;
                        }
                        client.field470 = 0L;
                        if (var520 >= 2) {
                            client.field471 = true;
                        } else {
                            client.field471 = false;
                        }
                        client.method1627();
                        if (client.field382 >= 25) {
                            client.method603();
                        }
                        class144.field2162 = true;
                        continue;
                    }
                    if (var541 == 5308) {
                        field763[var5++] = Statics.field2665.field134;
                        continue;
                    }
                    if (var541 == 5309) {
                        var5--;
                        int var521 = field763[var5];
                        if (var521 == 1 || var521 == 2) {
                            Statics.field2665.field134 = var521;
                            class9.method3224();
                        }
                        continue;
                    }
                }
                if (var541 < 5600) {
                    if (var541 == 5504) {
                        var5 -= 2;
                        int var522 = field763[var5];
                        int var523 = field763[var5 + 1];
                        if (!client.field505) {
                            client.field343 = var522;
                            client.field273 = var523;
                        }
                        continue;
                    }
                    if (var541 == 5505) {
                        field763[var5++] = client.field343;
                        continue;
                    }
                    if (var541 == 5506) {
                        field763[var5++] = client.field273;
                        continue;
                    }
                    if (var541 == 5530) {
                        var5--;
                        int var524 = field763[var5];
                        if (var524 < 0) {
                            var524 = 0;
                        }
                        client.field349 = var524;
                        continue;
                    }
                    if (var541 == 5531) {
                        field763[var5++] = client.field349;
                        continue;
                    }
                }
                if (var541 >= 5700 || var541 != 5630) {
                    if (var541 < 6300) {
                        if (var541 == 6200) {
                            var5 -= 2;
                            client.field511 = (short) field763[var5];
                            if (client.field511 <= 0) {
                                client.field511 = 256;
                            }
                            client.field526 = (short) field763[var5 + 1];
                            if (client.field526 <= 0) {
                                client.field526 = 205;
                            }
                            continue;
                        }
                        if (var541 == 6201) {
                            var5 -= 2;
                            client.field513 = (short) field763[var5];
                            if (client.field513 <= 0) {
                                client.field513 = 256;
                            }
                            client.field476 = (short) field763[var5 + 1];
                            if (client.field476 <= 0) {
                                client.field476 = 320;
                            }
                            continue;
                        }
                        if (var541 == 6202) {
                            var5 -= 4;
                            client.field515 = (short) field763[var5];
                            if (client.field515 <= 0) {
                                client.field515 = 1;
                            }
                            client.field346 = (short) field763[var5 + 1];
                            if (client.field346 <= 0) {
                                client.field346 = 32767;
                            } else if (client.field346 < client.field515) {
                                client.field346 = client.field515;
                            }
                            client.field385 = (short) field763[var5 + 2];
                            if (client.field385 <= 0) {
                                client.field385 = 1;
                            }
                            client.field487 = (short) field763[var5 + 3];
                            if (client.field487 <= 0) {
                                client.field487 = 32767;
                            } else if (client.field487 < client.field385) {
                                client.field487 = client.field385;
                            }
                            continue;
                        }
                        if (var541 == 6203) {
                            if (client.field429 == null) {
                                field763[var5++] = -1;
                                field763[var5++] = -1;
                            } else {
                                client.method1033(0, 0, client.field429.field2746, client.field429.field2797, false);
                                field763[var5++] = client.field521;
                                field763[var5++] = client.field522;
                            }
                            continue;
                        }
                        if (var541 == 6204) {
                            field763[var5++] = client.field513;
                            field763[var5++] = client.field476;
                            continue;
                        }
                        if (var541 == 6205) {
                            field763[var5++] = client.field511;
                            field763[var5++] = client.field526;
                            continue;
                        }
                    }
                    if (var541 < 6600) {
                        if (var541 == 6500) {
                            field763[var5++] = class26.method157() ? 1 : 0;
                            continue;
                        }
                        if (var541 == 6501) {
                            class26 var525 = class26.method190();
                            if (var525 == null) {
                                field763[var5++] = -1;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                                field763[var5++] = 0;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                            } else {
                                field763[var5++] = var525.field607;
                                field763[var5++] = var525.field608;
                                field762[var6++] = var525.field614;
                                field763[var5++] = var525.field612;
                                field763[var5++] = var525.field617;
                                field762[var6++] = var525.field610;
                            }
                            continue;
                        }
                        if (var541 == 6502) {
                            class26 var526;
                            if (class26.field604 < class26.field603) {
                                var526 = Statics.field602[++class26.field604 - 1];
                            } else {
                                var526 = null;
                            }
                            if (var526 == null) {
                                field763[var5++] = -1;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                                field763[var5++] = 0;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                            } else {
                                field763[var5++] = var526.field607;
                                field763[var5++] = var526.field608;
                                field762[var6++] = var526.field614;
                                field763[var5++] = var526.field612;
                                field763[var5++] = var526.field617;
                                field762[var6++] = var526.field610;
                            }
                            continue;
                        }
                        if (var541 == 6506) {
                            var5--;
                            int var528 = field763[var5];
                            class26 var529 = null;
                            for (int var530 = 0; var530 < class26.field603; var530++) {
                                if (Statics.field602[var530].field607 == var528) {
                                    var529 = Statics.field602[var530];
                                    break;
                                }
                            }
                            if (var529 == null) {
                                field763[var5++] = -1;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                                field763[var5++] = 0;
                                field763[var5++] = 0;
                                field762[var6++] = "";
                            } else {
                                field763[var5++] = var529.field607;
                                field763[var5++] = var529.field608;
                                field762[var6++] = var529.field614;
                                field763[var5++] = var529.field612;
                                field763[var5++] = var529.field617;
                                field762[var6++] = var529.field610;
                            }
                            continue;
                        }
                        if (var541 == 6507) {
                            var5 -= 4;
                            int var531 = field763[var5];
                            boolean var532 = field763[var5 + 1] == 1;
                            int var533 = field763[var5 + 2];
                            boolean var534 = field763[var5 + 3] == 1;
                            class26.method1993(var531, var532, var533, var534);
                            continue;
                        }
                        if (var541 == 6511) {
                            var5--;
                            int var535 = field763[var5];
                            if (var535 >= 0 && var535 < class26.field603) {
                                class26 var536 = Statics.field602[var535];
                                field763[var5++] = var536.field607;
                                field763[var5++] = var536.field608;
                                field762[var6++] = var536.field614;
                                field763[var5++] = var536.field612;
                                field763[var5++] = var536.field617;
                                field762[var6++] = var536.field610;
                                continue;
                            }
                            field763[var5++] = -1;
                            field763[var5++] = 0;
                            field762[var6++] = "";
                            field763[var5++] = 0;
                            field763[var5++] = 0;
                            field762[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field489 = 250;
            }
        } catch (Exception var540) {
            StringBuilder var538 = new StringBuilder(30);
            var538.append("").append(var4.field3095).append(" ");
            for (int var539 = field765 - 1; var539 >= 0; var539--) {
                var538.append("").append(field766[var539].field190.field3095).append(" ");
            }
            var538.append("").append(var10);
            class148.method1554(var538.toString(), var540);
        }
    }

    @ObfuscatedName("t.y(IB)V")
    public static void method653(int arg0) {
        if (arg0 == -1 || !class173.method2979(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2766[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2810 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2810;
                method2077(var4, 2000000);
            }
        }
    }
}
