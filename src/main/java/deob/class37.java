package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ao")
public class class37 {

    @ObfuscatedName("ao.y")
    public static int[] field808 = new int[5];

    @ObfuscatedName("ao.k")
    public static int[][] field801 = new int[5][5000];

    @ObfuscatedName("ao.r")
    public static int[] field814 = new int[1000];

    @ObfuscatedName("ao.p")
    public static String[] field806 = new String[1000];

    @ObfuscatedName("ao.q")
    public static int field809 = 0;

    @ObfuscatedName("ao.m")
    public static class15[] field810 = new class15[50];

    @ObfuscatedName("ao.z")
    public static Calendar field811 = Calendar.getInstance();

    @ObfuscatedName("ao.i")
    public static final String[] field812 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ao.t")
    public static int field813 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.a(La;II)V")
    public static void method3232(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method221(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field599;
        int[] var9 = var4.field607;
        byte var10 = -1;
        field809 = 0;
        try {
            Statics.field803 = new int[var4.field602];
            int var11 = 0;
            Statics.field807 = new String[var4.field600];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field17;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2843;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2760;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2843;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2760;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field15;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field803[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field807[var12++] = var15;
                }
            }
            int var16 = 0;
            field813 = arg0.field11;
            label3230: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var480 = var8[var7];
                if (var480 < 100) {
                    if (var480 == 0) {
                        field814[var5++] = var9[var7];
                        continue;
                    }
                    if (var480 == 1) {
                        int var17 = var9[var7];
                        field814[var5++] = class177.field2906[var17];
                        continue;
                    }
                    if (var480 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2906[var18] = field814[var5];
                        client.method3(var18);
                        continue;
                    }
                    if (var480 == 3) {
                        field806[var6++] = var4.field601[var7];
                        continue;
                    }
                    if (var480 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var480 == 7) {
                        var5 -= 2;
                        if (field814[var5 + 1] != field814[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var480 == 8) {
                        var5 -= 2;
                        if (field814[var5 + 1] == field814[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var480 == 9) {
                        var5 -= 2;
                        if (field814[var5] < field814[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var480 == 10) {
                        var5 -= 2;
                        if (field814[var5] > field814[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var480 == 21) {
                        if (field809 == 0) {
                            return;
                        }
                        class15 var19 = field810[--field809];
                        var4 = var19.field217;
                        var8 = var4.field599;
                        var9 = var4.field607;
                        var7 = var19.field218;
                        Statics.field803 = var19.field219;
                        Statics.field807 = var19.field225;
                        continue;
                    }
                    if (var480 == 25) {
                        int var20 = var9[var7];
                        field814[var5++] = class177.method2119(var20);
                        continue;
                    }
                    if (var480 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class177.method3052(var21, field814[var5]);
                        continue;
                    }
                    if (var480 == 31) {
                        var5 -= 2;
                        if (field814[var5] <= field814[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var480 == 32) {
                        var5 -= 2;
                        if (field814[var5] >= field814[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var480 == 33) {
                        field814[var5++] = Statics.field803[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var480 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field803[var10001] = field814[var5];
                        continue;
                    }
                    if (var480 == 35) {
                        field806[var6++] = Statics.field807[var9[var7]];
                        continue;
                    }
                    if (var480 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field807[var10001] = field806[var6];
                        continue;
                    }
                    if (var480 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field806;
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
                        field806[var6++] = var24;
                        continue;
                    }
                    if (var480 == 38) {
                        var5--;
                        continue;
                    }
                    if (var480 == 39) {
                        var6--;
                        continue;
                    }
                    if (var480 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method221(var34);
                        int[] var36 = new int[var35.field602];
                        String[] var37 = new String[var35.field600];
                        for (int var38 = 0; var38 < var35.field604; var38++) {
                            var36[var38] = field814[var5 - var35.field604 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field605; var39++) {
                            var37[var39] = field806[var6 - var35.field605 + var39];
                        }
                        var5 -= var35.field604;
                        var6 -= var35.field605;
                        class15 var40 = new class15();
                        var40.field217 = var4;
                        var40.field218 = var7;
                        var40.field219 = Statics.field803;
                        var40.field225 = Statics.field807;
                        field810[++field809 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field599;
                        var9 = var35.field607;
                        var7 = -1;
                        Statics.field803 = var36;
                        Statics.field807 = var37;
                        continue;
                    }
                    if (var480 == 42) {
                        field814[var5++] = Statics.field2724.method243(var9[var7]);
                        continue;
                    }
                    if (var480 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2724.method225(var10001, field814[var5]);
                        continue;
                    }
                    if (var480 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field814[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field808[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3230;
                                }
                                field801[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var480 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field814[var5];
                        if (var47 >= 0 && var47 < field808[var46]) {
                            field814[var5++] = field801[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var480 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field814[var5];
                        if (var49 >= 0 && var49 < field808[var48]) {
                            field801[var48][var49] = field814[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var480 == 47) {
                        String var50 = Statics.field2724.method228(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field806[var6++] = var50;
                        continue;
                    }
                    if (var480 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2724.method227(var10001, field806[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var480 < 1000) {
                    if (var480 == 100) {
                        var5 -= 3;
                        int var52 = field814[var5];
                        int var53 = field814[var5 + 1];
                        int var54 = field814[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var55 = class174.method636(var52);
                        if (var55.field2868 == null) {
                            var55.field2868 = new class174[var54 + 1];
                        }
                        if (var55.field2868.length <= var54) {
                            class174[] var56 = new class174[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2868.length; var57++) {
                                var56[var57] = var55.field2868[var57];
                            }
                            var55.field2868 = var56;
                        }
                        if (var54 > 0 && var55.field2868[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class174 var58 = new class174();
                        var58.field2825 = var53;
                        var58.field2778 = var58.field2843 = var55.field2843;
                        var58.field2760 = var54;
                        var58.field2758 = true;
                        var55.field2868[var54] = var58;
                        if (var51) {
                            Statics.field212 = var58;
                        } else {
                            Statics.field77 = var58;
                        }
                        client.method652(var55);
                        continue;
                    }
                    if (var480 == 101) {
                        class174 var59 = var51 ? Statics.field212 : Statics.field77;
                        class174 var60 = class174.method636(var59.field2843);
                        var60.field2868[var59.field2760] = null;
                        client.method652(var60);
                        continue;
                    }
                    if (var480 == 102) {
                        var5--;
                        class174 var61 = class174.method636(field814[var5]);
                        var61.field2868 = null;
                        client.method652(var61);
                        continue;
                    }
                    if (var480 == 200) {
                        var5 -= 2;
                        int var62 = field814[var5];
                        int var63 = field814[var5 + 1];
                        class174 var64 = class174.method3749(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field814[var5++] = 1;
                            if (var51) {
                                Statics.field212 = var64;
                            } else {
                                Statics.field77 = var64;
                            }
                            continue;
                        }
                        field814[var5++] = 0;
                        continue;
                    }
                    if (var480 == 201) {
                        var5--;
                        class174 var65 = class174.method636(field814[var5]);
                        if (var65 == null) {
                            field814[var5++] = 0;
                        } else {
                            field814[var5++] = 1;
                            if (var51) {
                                Statics.field212 = var65;
                            } else {
                                Statics.field77 = var65;
                            }
                        }
                        continue;
                    }
                } else if (!(var480 < 1000 || var480 >= 1100) || !(var480 < 2000 || var480 >= 2100)) {
                    int var66 = -1;
                    class174 var67;
                    if (var480 >= 2000) {
                        var480 -= 1000;
                        var5--;
                        var66 = field814[var5];
                        var67 = class174.method636(var66);
                    } else {
                        var67 = var51 ? Statics.field212 : Statics.field77;
                    }
                    if (var480 == 1000) {
                        var5 -= 4;
                        var67.field2754 = field814[var5];
                        var67.field2769 = field814[var5 + 1];
                        var67.field2764 = field814[var5 + 2];
                        var67.field2850 = field814[var5 + 3];
                        client.method652(var67);
                        client.method2136(var67);
                        if (var66 != -1 && var67.field2825 == 0) {
                            client.method197(Statics.field2887[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var480 == 1001) {
                        var5 -= 4;
                        var67.field2828 = field814[var5];
                        var67.field2810 = field814[var5 + 1];
                        var67.field2882 = field814[var5 + 2];
                        var67.field2881 = field814[var5 + 3];
                        client.method652(var67);
                        client.method2136(var67);
                        if (var66 != -1 && var67.field2825 == 0) {
                            client.method197(Statics.field2887[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var480 == 1003) {
                        var5--;
                        boolean var68 = field814[var5] == 1;
                        if (var67.field2779 != var68) {
                            var67.field2779 = var68;
                            client.method652(var67);
                        }
                        continue;
                    }
                    if (var480 == 1005) {
                        var5--;
                        var67.field2892 = field814[var5] == 1;
                        continue;
                    }
                    if (var480 == 1006) {
                        var5--;
                        var67.field2893 = field814[var5] == 1;
                        continue;
                    }
                } else if (var480 >= 1100 && var480 < 1200 || var480 >= 2100 && var480 < 2200) {
                    int var69 = -1;
                    class174 var70;
                    if (var480 >= 2000) {
                        var480 -= 1000;
                        var5--;
                        var69 = field814[var5];
                        var70 = class174.method636(var69);
                    } else {
                        var70 = var51 ? Statics.field212 : Statics.field77;
                    }
                    if (var480 == 1100) {
                        var5 -= 2;
                        var70.field2880 = field814[var5];
                        if (var70.field2880 > var70.field2854 - var70.field2774) {
                            var70.field2880 = var70.field2854 - var70.field2774;
                        }
                        if (var70.field2880 < 0) {
                            var70.field2880 = 0;
                        }
                        var70.field2781 = field814[var5 + 1];
                        if (var70.field2781 > var70.field2766 - var70.field2775) {
                            var70.field2781 = var70.field2766 - var70.field2775;
                        }
                        if (var70.field2781 < 0) {
                            var70.field2781 = 0;
                        }
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1101) {
                        var5--;
                        var70.field2784 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1102) {
                        var5--;
                        var70.field2788 = field814[var5] == 1;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1103) {
                        var5--;
                        var70.field2808 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1104) {
                        var5--;
                        var70.field2792 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1105) {
                        var5--;
                        var70.field2794 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1106) {
                        var5--;
                        var70.field2796 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1107) {
                        var5--;
                        var70.field2797 = field814[var5] == 1;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1108) {
                        var70.field2802 = 1;
                        var5--;
                        var70.field2870 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1109) {
                        var5 -= 6;
                        var70.field2761 = field814[var5];
                        var70.field2809 = field814[var5 + 1];
                        var70.field2801 = field814[var5 + 2];
                        var70.field2811 = field814[var5 + 3];
                        var70.field2812 = field814[var5 + 4];
                        var70.field2813 = field814[var5 + 5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1110) {
                        var5--;
                        int var71 = field814[var5];
                        if (var70.field2806 != var71) {
                            var70.field2806 = var71;
                            var70.field2772 = 0;
                            var70.field2857 = 0;
                            client.method652(var70);
                        }
                        continue;
                    }
                    if (var480 == 1111) {
                        var5--;
                        var70.field2816 = field814[var5] == 1;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1112) {
                        var6--;
                        String var72 = field806[var6];
                        if (!var72.equals(var70.field2770)) {
                            var70.field2770 = var72;
                            client.method652(var70);
                        }
                        continue;
                    }
                    if (var480 == 1113) {
                        var5--;
                        var70.field2818 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1114) {
                        var5 -= 3;
                        var70.field2822 = field814[var5];
                        var70.field2783 = field814[var5 + 1];
                        var70.field2815 = field814[var5 + 2];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1115) {
                        var5--;
                        var70.field2824 = field814[var5] == 1;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1116) {
                        var5--;
                        var70.field2821 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1117) {
                        var5--;
                        var70.field2799 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1118) {
                        var5--;
                        var70.field2749 = field814[var5] == 1;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1119) {
                        var5--;
                        var70.field2756 = field814[var5] == 1;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1120) {
                        var5 -= 2;
                        var70.field2854 = field814[var5];
                        var70.field2766 = field814[var5 + 1];
                        client.method652(var70);
                        if (var69 != -1 && var70.field2825 == 0) {
                            client.method197(Statics.field2887[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var480 == 1121) {
                        client.method3812(var70.field2843, var70.field2760);
                        client.field527 = var70;
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1122) {
                        var5--;
                        var70.field2795 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1123) {
                        var5--;
                        var70.field2785 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1124) {
                        var5--;
                        var70.field2834 = field814[var5];
                        client.method652(var70);
                        continue;
                    }
                    if (var480 == 1125) {
                        var5--;
                        int var73 = field814[var5];
                        class83 var74 = (class83) class110.method2766(class83.method1028(), var73);
                        if (var74 != null) {
                            var70.field2846 = var74;
                            client.method652(var70);
                        }
                        continue;
                    }
                } else if (!(var480 < 1200 || var480 >= 1300) || !(var480 < 2200 || var480 >= 2300)) {
                    class174 var75;
                    if (var480 >= 2000) {
                        var480 -= 1000;
                        var5--;
                        var75 = class174.method636(field814[var5]);
                    } else {
                        var75 = var51 ? Statics.field212 : Statics.field77;
                    }
                    client.method652(var75);
                    if (var480 == 1200 || var480 == 1205 || var480 == 1212) {
                        var5 -= 2;
                        int var76 = field814[var5];
                        int var77 = field814[var5 + 1];
                        var75.field2879 = var76;
                        var75.field2767 = var77;
                        class52 var78 = class52.method176(var76);
                        var75.field2801 = var78.field1132;
                        var75.field2811 = var78.field1133;
                        var75.field2812 = var78.field1122;
                        var75.field2761 = var78.field1135;
                        var75.field2809 = var78.field1115;
                        var75.field2813 = var78.field1149;
                        if (var480 == 1205) {
                            var75.field2817 = 0;
                        } else if (var480 == 1212 | var78.field1137 == 1) {
                            var75.field2817 = 1;
                        } else {
                            var75.field2817 = 2;
                        }
                        if (var75.field2814 > 0) {
                            var75.field2813 = var75.field2813 * 32 / var75.field2814;
                        } else if (var75.field2828 > 0) {
                            var75.field2813 = var75.field2813 * 32 / var75.field2828;
                        }
                        continue;
                    }
                    if (var480 == 1201) {
                        var75.field2802 = 2;
                        var5--;
                        var75.field2870 = field814[var5];
                        continue;
                    }
                    if (var480 == 1202) {
                        var75.field2802 = 3;
                        var75.field2870 = Statics.field94.field34.method3346();
                        continue;
                    }
                } else if (var480 >= 1300 && var480 < 1400 || var480 >= 2300 && var480 < 2400) {
                    class174 var79;
                    if (var480 >= 2000) {
                        var480 -= 1000;
                        var5--;
                        var79 = class174.method636(field814[var5]);
                    } else {
                        var79 = var51 ? Statics.field212 : Statics.field77;
                    }
                    if (var480 == 1300) {
                        var5--;
                        int var80 = field814[var5] - 1;
                        if (var80 >= 0 && var80 <= 9) {
                            var6--;
                            var79.method3277(var80, field806[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var480 == 1301) {
                        var5 -= 2;
                        int var81 = field814[var5];
                        int var82 = field814[var5 + 1];
                        var79.field2789 = class174.method3749(var81, var82);
                        continue;
                    }
                    if (var480 == 1302) {
                        var5--;
                        var79.field2837 = field814[var5] == 1;
                        continue;
                    }
                    if (var480 == 1303) {
                        var5--;
                        var79.field2757 = field814[var5];
                        continue;
                    }
                    if (var480 == 1304) {
                        var5--;
                        var79.field2836 = field814[var5];
                        continue;
                    }
                    if (var480 == 1305) {
                        var6--;
                        var79.field2832 = field806[var6];
                        continue;
                    }
                    if (var480 == 1306) {
                        var6--;
                        var79.field2819 = field806[var6];
                        continue;
                    }
                    if (var480 == 1307) {
                        var79.field2833 = null;
                        continue;
                    }
                } else {
                    if (var480 >= 1400 && var480 < 1500 || var480 >= 2400 && var480 < 2500) {
                        class174 var83;
                        if (var480 >= 2000) {
                            var480 -= 1000;
                            var5--;
                            var83 = class174.method636(field814[var5]);
                        } else {
                            var83 = var51 ? Statics.field212 : Statics.field77;
                        }
                        var6--;
                        String var84 = field806[var6];
                        int[] var85 = null;
                        if (var84.length() > 0 && var84.charAt(var84.length() - 1) == 'Y') {
                            var5--;
                            int var86 = field814[var5];
                            if (var86 > 0) {
                                var85 = new int[var86];
                                while (var86-- > 0) {
                                    var5--;
                                    var85[var86] = field814[var5];
                                }
                            }
                            var84 = var84.substring(0, var84.length() - 1);
                        }
                        Object[] var87 = new Object[var84.length() + 1];
                        for (int var88 = var87.length - 1; var88 >= 1; var88--) {
                            if (var84.charAt(var88 - 1) == 's') {
                                var6--;
                                var87[var88] = field806[var6];
                            } else {
                                var5--;
                                var87[var88] = Integer.valueOf(field814[var5]);
                            }
                        }
                        var5--;
                        int var89 = field814[var5];
                        if (var89 == -1) {
                            var87 = null;
                        } else {
                            var87[0] = Integer.valueOf(var89);
                        }
                        if (var480 == 1400) {
                            var83.field2841 = var87;
                        }
                        if (var480 == 1401) {
                            var83.field2844 = var87;
                        }
                        if (var480 == 1402) {
                            var83.field2750 = var87;
                        }
                        if (var480 == 1403) {
                            var83.field2845 = var87;
                        }
                        if (var480 == 1404) {
                            var83.field2847 = var87;
                        }
                        if (var480 == 1405) {
                            var83.field2848 = var87;
                        }
                        if (var480 == 1406) {
                            var83.field2851 = var87;
                        }
                        if (var480 == 1407) {
                            var83.field2852 = var87;
                            var83.field2853 = var85;
                        }
                        if (var480 == 1408) {
                            var83.field2858 = var87;
                        }
                        if (var480 == 1409) {
                            var83.field2807 = var87;
                        }
                        if (var480 == 1410) {
                            var83.field2838 = var87;
                        }
                        if (var480 == 1411) {
                            var83.field2800 = var87;
                        }
                        if (var480 == 1412) {
                            var83.field2790 = var87;
                        }
                        if (var480 == 1414) {
                            var83.field2768 = var87;
                            var83.field2855 = var85;
                        }
                        if (var480 == 1415) {
                            var83.field2856 = var87;
                            var83.field2883 = var85;
                        }
                        if (var480 == 1416) {
                            var83.field2865 = var87;
                        }
                        if (var480 == 1417) {
                            var83.field2860 = var87;
                        }
                        if (var480 == 1418) {
                            var83.field2861 = var87;
                        }
                        if (var480 == 1419) {
                            var83.field2862 = var87;
                        }
                        if (var480 == 1420) {
                            var83.field2863 = var87;
                        }
                        if (var480 == 1421) {
                            var83.field2864 = var87;
                        }
                        if (var480 == 1422) {
                            var83.field2787 = var87;
                        }
                        if (var480 == 1423) {
                            var83.field2866 = var87;
                        }
                        if (var480 == 1424) {
                            var83.field2867 = var87;
                        }
                        if (var480 == 1425) {
                            var83.field2869 = var87;
                        }
                        if (var480 == 1426) {
                            var83.field2859 = var87;
                        }
                        if (var480 == 1427) {
                            var83.field2798 = var87;
                        }
                        var83.field2839 = true;
                        continue;
                    }
                    if (var480 < 1600) {
                        class174 var90 = var51 ? Statics.field212 : Statics.field77;
                        if (var480 == 1500) {
                            field814[var5++] = var90.field2849;
                            continue;
                        }
                        if (var480 == 1501) {
                            field814[var5++] = var90.field2773;
                            continue;
                        }
                        if (var480 == 1502) {
                            field814[var5++] = var90.field2774;
                            continue;
                        }
                        if (var480 == 1503) {
                            field814[var5++] = var90.field2775;
                            continue;
                        }
                        if (var480 == 1504) {
                            field814[var5++] = var90.field2779 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 1505) {
                            field814[var5++] = var90.field2778;
                            continue;
                        }
                    } else if (var480 < 1700) {
                        class174 var91 = var51 ? Statics.field212 : Statics.field77;
                        if (var480 == 1600) {
                            field814[var5++] = var91.field2880;
                            continue;
                        }
                        if (var480 == 1601) {
                            field814[var5++] = var91.field2781;
                            continue;
                        }
                        if (var480 == 1602) {
                            field806[var6++] = var91.field2770;
                            continue;
                        }
                        if (var480 == 1603) {
                            field814[var5++] = var91.field2854;
                            continue;
                        }
                        if (var480 == 1604) {
                            field814[var5++] = var91.field2766;
                            continue;
                        }
                        if (var480 == 1605) {
                            field814[var5++] = var91.field2813;
                            continue;
                        }
                        if (var480 == 1606) {
                            field814[var5++] = var91.field2801;
                            continue;
                        }
                        if (var480 == 1607) {
                            field814[var5++] = var91.field2812;
                            continue;
                        }
                        if (var480 == 1608) {
                            field814[var5++] = var91.field2811;
                            continue;
                        }
                        if (var480 == 1609) {
                            field814[var5++] = var91.field2808;
                            continue;
                        }
                        if (var480 == 1610) {
                            field814[var5++] = var91.field2834;
                            continue;
                        }
                        if (var480 == 1611) {
                            field814[var5++] = var91.field2784;
                            continue;
                        }
                        if (var480 == 1612) {
                            field814[var5++] = var91.field2785;
                            continue;
                        }
                        if (var480 == 1613) {
                            field814[var5++] = var91.field2846.method628();
                            continue;
                        }
                    } else if (var480 < 1800) {
                        class174 var92 = var51 ? Statics.field212 : Statics.field77;
                        if (var480 == 1700) {
                            field814[var5++] = var92.field2879;
                            continue;
                        }
                        if (var480 == 1701) {
                            if (var92.field2879 == -1) {
                                field814[var5++] = 0;
                            } else {
                                field814[var5++] = var92.field2767;
                            }
                            continue;
                        }
                        if (var480 == 1702) {
                            field814[var5++] = var92.field2760;
                            continue;
                        }
                    } else if (var480 < 1900) {
                        class174 var93 = var51 ? Statics.field212 : Statics.field77;
                        if (var480 == 1800) {
                            field814[var5++] = class179.method2141(client.method765(var93));
                            continue;
                        }
                        if (var480 == 1801) {
                            var5--;
                            int var94 = field814[var5];
                            int var481 = var94 - 1;
                            if (var93.field2833 != null && var481 < var93.field2833.length && var93.field2833[var481] != null) {
                                field806[var6++] = var93.field2833[var481];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 1802) {
                            if (var93.field2832 == null) {
                                field806[var6++] = "";
                            } else {
                                field806[var6++] = var93.field2832;
                            }
                            continue;
                        }
                    } else if (!(var480 < 1900 || var480 >= 2000) || !(var480 < 2900 || var480 >= 3000)) {
                        class174 var95;
                        if (var480 >= 2000) {
                            var480 -= 1000;
                            var5--;
                            var95 = class174.method636(field814[var5]);
                        } else {
                            var95 = var51 ? Statics.field212 : Statics.field77;
                        }
                        if (var480 == 1927) {
                            if (field813 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var95.field2798 == null) {
                                return;
                            }
                            class1 var96 = new class1();
                            var96.field3 = var95;
                            var96.field5 = var95.field2798;
                            var96.field11 = field813 + 1;
                            client.field493.method3639(arg0);
                            continue;
                        }
                    } else if (var480 < 2600) {
                        var5--;
                        class174 var97 = class174.method636(field814[var5]);
                        if (var480 == 2500) {
                            field814[var5++] = var97.field2849;
                            continue;
                        }
                        if (var480 == 2501) {
                            field814[var5++] = var97.field2773;
                            continue;
                        }
                        if (var480 == 2502) {
                            field814[var5++] = var97.field2774;
                            continue;
                        }
                        if (var480 == 2503) {
                            field814[var5++] = var97.field2775;
                            continue;
                        }
                        if (var480 == 2504) {
                            field814[var5++] = var97.field2779 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 2505) {
                            field814[var5++] = var97.field2778;
                            continue;
                        }
                    } else if (var480 < 2700) {
                        var5--;
                        class174 var98 = class174.method636(field814[var5]);
                        if (var480 == 2600) {
                            field814[var5++] = var98.field2880;
                            continue;
                        }
                        if (var480 == 2601) {
                            field814[var5++] = var98.field2781;
                            continue;
                        }
                        if (var480 == 2602) {
                            field806[var6++] = var98.field2770;
                            continue;
                        }
                        if (var480 == 2603) {
                            field814[var5++] = var98.field2854;
                            continue;
                        }
                        if (var480 == 2604) {
                            field814[var5++] = var98.field2766;
                            continue;
                        }
                        if (var480 == 2605) {
                            field814[var5++] = var98.field2813;
                            continue;
                        }
                        if (var480 == 2606) {
                            field814[var5++] = var98.field2801;
                            continue;
                        }
                        if (var480 == 2607) {
                            field814[var5++] = var98.field2812;
                            continue;
                        }
                        if (var480 == 2608) {
                            field814[var5++] = var98.field2811;
                            continue;
                        }
                        if (var480 == 2609) {
                            field814[var5++] = var98.field2808;
                            continue;
                        }
                        if (var480 == 2610) {
                            field814[var5++] = var98.field2834;
                            continue;
                        }
                        if (var480 == 2611) {
                            field814[var5++] = var98.field2784;
                            continue;
                        }
                        if (var480 == 2612) {
                            field814[var5++] = var98.field2785;
                            continue;
                        }
                        if (var480 == 2613) {
                            field814[var5++] = var98.field2846.method628();
                            continue;
                        }
                    } else if (var480 < 2800) {
                        if (var480 == 2700) {
                            var5--;
                            class174 var99 = class174.method636(field814[var5]);
                            field814[var5++] = var99.field2879;
                            continue;
                        }
                        if (var480 == 2701) {
                            var5--;
                            class174 var100 = class174.method636(field814[var5]);
                            if (var100.field2879 == -1) {
                                field814[var5++] = 0;
                            } else {
                                field814[var5++] = var100.field2767;
                            }
                            continue;
                        }
                        if (var480 == 2702) {
                            var5--;
                            int var101 = field814[var5];
                            class4 var102 = (class4) client.field454.method3607((long) var101);
                            if (var102 == null) {
                                field814[var5++] = 0;
                            } else {
                                field814[var5++] = 1;
                            }
                            continue;
                        }
                        if (var480 == 2706) {
                            field814[var5++] = client.field453;
                            continue;
                        }
                    } else if (var480 < 2900) {
                        var5--;
                        class174 var103 = class174.method636(field814[var5]);
                        if (var480 == 2800) {
                            field814[var5++] = class179.method2141(client.method765(var103));
                            continue;
                        }
                        if (var480 == 2801) {
                            var5--;
                            int var104 = field814[var5];
                            int var482 = var104 - 1;
                            if (var103.field2833 != null && var482 < var103.field2833.length && var103.field2833[var482] != null) {
                                field806[var6++] = var103.field2833[var482];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 2802) {
                            if (var103.field2832 == null) {
                                field806[var6++] = "";
                            } else {
                                field806[var6++] = var103.field2832;
                            }
                            continue;
                        }
                    } else if (var480 < 3200) {
                        if (var480 == 3100) {
                            var6--;
                            String var105 = field806[var6];
                            class12.method2783(0, "", var105);
                            continue;
                        }
                        if (var480 == 3101) {
                            var5 -= 2;
                            client.method3489(Statics.field94, field814[var5], field814[var5 + 1]);
                            continue;
                        }
                        if (var480 == 3103) {
                            client.method2882();
                            continue;
                        }
                        if (var480 == 3104) {
                            var6--;
                            String var106 = field806[var6];
                            int var107 = 0;
                            if (class164.method2813(var106)) {
                                int var108 = class164.method3053(var106, 10, true);
                                var107 = var108;
                            }
                            client.field339.method2722(98);
                            client.field339.method2635(var107);
                            continue;
                        }
                        if (var480 == 3105) {
                            var6--;
                            String var109 = field806[var6];
                            client.field339.method2722(190);
                            client.field339.method2452(var109.length() + 1);
                            client.field339.method2543(var109);
                            continue;
                        }
                        if (var480 == 3106) {
                            var6--;
                            String var110 = field806[var6];
                            client.field339.method2722(90);
                            client.field339.method2452(var110.length() + 1);
                            client.field339.method2543(var110);
                            continue;
                        }
                        if (var480 == 3107) {
                            var5--;
                            int var111 = field814[var5];
                            var6--;
                            String var112 = field806[var6];
                            client.method16(var111, var112);
                            continue;
                        }
                        if (var480 == 3108) {
                            var5 -= 3;
                            int var113 = field814[var5];
                            int var114 = field814[var5 + 1];
                            int var115 = field814[var5 + 2];
                            class174 var116 = class174.method636(var115);
                            client.method1089(var116, var113, var114);
                            continue;
                        }
                        if (var480 == 3109) {
                            var5 -= 2;
                            int var117 = field814[var5];
                            int var118 = field814[var5 + 1];
                            class174 var119 = var51 ? Statics.field212 : Statics.field77;
                            client.method1089(var119, var117, var118);
                            continue;
                        }
                        if (var480 == 3110) {
                            var5--;
                            Statics.field144 = field814[var5] == 1;
                            continue;
                        }
                        if (var480 == 3111) {
                            field814[var5++] = Statics.field2079.field148 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3112) {
                            var5--;
                            Statics.field2079.field148 = field814[var5] == 1;
                            class9.method3770();
                            continue;
                        }
                        if (var480 == 3113) {
                            var6--;
                            String var120 = field806[var6];
                            var5--;
                            boolean var121 = field814[var5] == 1;
                            class139.method665(var120, var121, "openjs", false);
                            continue;
                        }
                        if (var480 == 3115) {
                            var5--;
                            int var122 = field814[var5];
                            client.field339.method2722(205);
                            client.field339.method2448(var122);
                            continue;
                        }
                        if (var480 == 3116) {
                            var5--;
                            int var123 = field814[var5];
                            var6 -= 2;
                            String var124 = field806[var6];
                            String var125 = field806[var6 + 1];
                            if (var124.length() <= 500 && var125.length() <= 500) {
                                client.field339.method2722(58);
                                client.field339.method2448(1 + class120.method2241(var124) + class120.method2241(var125));
                                client.field339.method2543(var124);
                                client.field339.method2487(var123);
                                client.field339.method2543(var125);
                            }
                            continue;
                        }
                    } else if (var480 < 3300) {
                        if (var480 == 3200) {
                            var5 -= 3;
                            client.method2328(field814[var5], field814[var5 + 1], field814[var5 + 2]);
                            continue;
                        }
                        if (var480 == 3201) {
                            var5--;
                            int var126 = field814[var5];
                            if (var126 == -1 && !client.field300) {
                                class184.method161();
                            } else if (var126 != -1 && client.field533 != var126 && client.field532 != 0 && !client.field300) {
                                class184.method3315(2, Statics.field885, var126, 0, client.field532, false);
                            }
                            client.field533 = var126;
                            continue;
                        }
                        if (var480 == 3202) {
                            var5 -= 2;
                            int var127 = field814[var5];
                            int var10000 = field814[var5 + 1];
                            if (client.field532 != 0 && var127 != -1) {
                                class184.method2976(Statics.field815, var127, 0, client.field532, false);
                                client.field300 = true;
                            }
                            continue;
                        }
                    } else if (var480 < 3400) {
                        if (var480 == 3300) {
                            field814[var5++] = client.field307;
                            continue;
                        }
                        if (var480 == 3301) {
                            var5 -= 2;
                            int var129 = field814[var5];
                            int var130 = field814[var5 + 1];
                            field814[var5++] = class16.method58(var129, var130);
                            continue;
                        }
                        if (var480 == 3302) {
                            var5 -= 2;
                            int var131 = field814[var5];
                            int var132 = field814[var5 + 1];
                            field814[var5++] = class16.method788(var131, var132);
                            continue;
                        }
                        if (var480 == 3303) {
                            var5 -= 2;
                            int var133 = field814[var5];
                            int var134 = field814[var5 + 1];
                            int[] var135 = field814;
                            int var136 = var5++;
                            class16 var137 = (class16) class16.field231.method3607((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = 0;
                            } else if (var134 == -1) {
                                var138 = 0;
                            } else {
                                int var139 = 0;
                                for (int var140 = 0; var140 < var137.field235.length; var140++) {
                                    if (var137.field230[var140] == var134) {
                                        var139 += var137.field235[var140];
                                    }
                                }
                                var138 = var139;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var480 == 3304) {
                            var5--;
                            int var141 = field814[var5];
                            field814[var5++] = class51.method1307(var141).field1112;
                            continue;
                        }
                        if (var480 == 3305) {
                            var5--;
                            int var142 = field814[var5];
                            field814[var5++] = client.field430[var142];
                            continue;
                        }
                        if (var480 == 3306) {
                            var5--;
                            int var143 = field814[var5];
                            field814[var5++] = client.field431[var143];
                            continue;
                        }
                        if (var480 == 3307) {
                            var5--;
                            int var144 = field814[var5];
                            field814[var5++] = client.field480[var144];
                            continue;
                        }
                        if (var480 == 3308) {
                            int var145 = Statics.field1003;
                            int var146 = (Statics.field94.field845 >> 7) + Statics.field2205;
                            int var147 = (Statics.field94.field820 >> 7) + Statics.field68;
                            field814[var5++] = (var145 << 28) + (var146 << 14) + var147;
                            continue;
                        }
                        if (var480 == 3309) {
                            var5--;
                            int var148 = field814[var5];
                            field814[var5++] = var148 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var480 == 3310) {
                            var5--;
                            int var149 = field814[var5];
                            field814[var5++] = var149 >> 28;
                            continue;
                        }
                        if (var480 == 3311) {
                            var5--;
                            int var150 = field814[var5];
                            field814[var5++] = var150 & 0x3FFF;
                            continue;
                        }
                        if (var480 == 3312) {
                            field814[var5++] = client.field302 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3313) {
                            var5 -= 2;
                            int var151 = field814[var5] + 32768;
                            int var152 = field814[var5 + 1];
                            field814[var5++] = class16.method58(var151, var152);
                            continue;
                        }
                        if (var480 == 3314) {
                            var5 -= 2;
                            int var153 = field814[var5] + 32768;
                            int var154 = field814[var5 + 1];
                            field814[var5++] = class16.method788(var153, var154);
                            continue;
                        }
                        if (var480 == 3315) {
                            var5 -= 2;
                            int var155 = field814[var5] + 32768;
                            int var156 = field814[var5 + 1];
                            int[] var157 = field814;
                            int var158 = var5++;
                            class16 var159 = (class16) class16.field231.method3607((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = 0;
                            } else if (var156 == -1) {
                                var160 = 0;
                            } else {
                                int var161 = 0;
                                for (int var162 = 0; var162 < var159.field235.length; var162++) {
                                    if (var159.field230[var162] == var156) {
                                        var161 += var159.field235[var162];
                                    }
                                }
                                var160 = var161;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var480 == 3316) {
                            if (client.field346 >= 2) {
                                field814[var5++] = client.field346;
                            } else {
                                field814[var5++] = 0;
                            }
                            continue;
                        }
                        if (var480 == 3317) {
                            field814[var5++] = client.field314;
                            continue;
                        }
                        if (var480 == 3318) {
                            field814[var5++] = client.field297;
                            continue;
                        }
                        if (var480 == 3321) {
                            field814[var5++] = client.field492;
                            continue;
                        }
                        if (var480 == 3322) {
                            field814[var5++] = client.field459;
                            continue;
                        }
                        if (var480 == 3323) {
                            if (client.field462) {
                                field814[var5++] = 1;
                            } else {
                                field814[var5++] = 0;
                            }
                            continue;
                        }
                        if (var480 == 3324) {
                            field814[var5++] = client.field432;
                            continue;
                        }
                    } else if (var480 < 3500) {
                        if (var480 == 3400) {
                            var5 -= 2;
                            int var163 = field814[var5];
                            int var164 = field814[var5 + 1];
                            class49 var165 = class49.method136(var163);
                            if (var165.field1083 != 's') {
                            }
                            for (int var166 = 0; var166 < var165.field1086; var166++) {
                                if (var165.field1081[var166] == var164) {
                                    field806[var6++] = var165.field1087[var166];
                                    var165 = null;
                                    break;
                                }
                            }
                            if (var165 != null) {
                                field806[var6++] = var165.field1084;
                            }
                            continue;
                        }
                        if (var480 == 3408) {
                            var5 -= 4;
                            int var167 = field814[var5];
                            int var168 = field814[var5 + 1];
                            int var169 = field814[var5 + 2];
                            int var170 = field814[var5 + 3];
                            class49 var171 = class49.method136(var169);
                            if (var171.field1082 == var167 && var171.field1083 == var168) {
                                for (int var172 = 0; var172 < var171.field1086; var172++) {
                                    if (var171.field1081[var172] == var170) {
                                        if (var168 == 115) {
                                            field806[var6++] = var171.field1087[var172];
                                        } else {
                                            field814[var5++] = var171.field1088[var172];
                                        }
                                        var171 = null;
                                        break;
                                    }
                                }
                                if (var171 != null) {
                                    if (var168 == 115) {
                                        field806[var6++] = var171.field1084;
                                    } else {
                                        field814[var5++] = var171.field1094;
                                    }
                                }
                                continue;
                            }
                            if (var168 == 115) {
                                field806[var6++] = "null";
                            } else {
                                field814[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var480 < 3700) {
                        if (var480 == 3600) {
                            if (client.field563 == 0) {
                                field814[var5++] = -2;
                            } else if (client.field563 == 1) {
                                field814[var5++] = -1;
                            } else {
                                field814[var5++] = client.field562;
                            }
                            continue;
                        }
                        if (var480 == 3601) {
                            var5--;
                            int var173 = field814[var5];
                            if (client.field563 == 2 && var173 < client.field562) {
                                field806[var6++] = client.field564[var173].field262;
                                field806[var6++] = client.field564[var173].field263;
                                continue;
                            }
                            field806[var6++] = "";
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 3602) {
                            var5--;
                            int var174 = field814[var5];
                            if (client.field563 == 2 && var174 < client.field562) {
                                field814[var5++] = client.field564[var174].field257;
                                continue;
                            }
                            field814[var5++] = 0;
                            continue;
                        }
                        if (var480 == 3603) {
                            var5--;
                            int var175 = field814[var5];
                            if (client.field563 == 2 && var175 < client.field562) {
                                field814[var5++] = client.field564[var175].field258;
                                continue;
                            }
                            field814[var5++] = 0;
                            continue;
                        }
                        if (var480 == 3604) {
                            var6--;
                            String var176 = field806[var6];
                            var5--;
                            int var177 = field814[var5];
                            client.method831(var176, var177);
                            continue;
                        }
                        if (var480 == 3605) {
                            var6--;
                            String var178 = field806[var6];
                            client.method195(var178);
                            continue;
                        }
                        if (var480 == 3606) {
                            var6--;
                            String var179 = field806[var6];
                            client.method157(var179);
                            continue;
                        }
                        if (var480 == 3607) {
                            var6--;
                            String var180 = field806[var6];
                            client.method2338(var180, false);
                            continue;
                        }
                        if (var480 == 3608) {
                            var6--;
                            String var181 = field806[var6];
                            client.method2232(var181);
                            continue;
                        }
                        if (var480 == 3609) {
                            var6--;
                            String var182 = field806[var6];
                            class153[] var183 = new class153[] { class153.field2262, class153.field2269, class153.field2263, class153.field2264, class153.field2266 };
                            class153[] var184 = var183;
                            for (int var185 = 0; var185 < var184.length; var185++) {
                                class153 var186 = var184[var185];
                                if (var186.field2261 != -1) {
                                    int var188 = var186.field2261;
                                    String var189 = "<img=" + var188 + ">";
                                    if (var182.startsWith(var189)) {
                                        var182 = var182.substring(6 + Integer.toString(var186.field2261).length());
                                        break;
                                    }
                                }
                            }
                            field814[var5++] = client.method926(var182, false) ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3611) {
                            if (client.field513 == null) {
                                field806[var6++] = "";
                                continue;
                            }
                            String[] var190 = field806;
                            int var191 = var6++;
                            String var192 = client.field513;
                            long var193 = 0L;
                            int var195 = var192.length();
                            for (int var196 = 0; var196 < var195; var196++) {
                                var193 *= 37L;
                                char var197 = var192.charAt(var196);
                                if (var197 >= 'A' && var197 <= 'Z') {
                                    var193 += (long) (var197 + 1 - 65);
                                } else if (var197 >= 'a' && var197 <= 'z') {
                                    var193 += (long) (var197 + 1 - 97);
                                } else if (var197 >= '0' && var197 <= '9') {
                                    var193 += (long) (var197 + 27 - 48);
                                }
                                if (var193 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var193 % 37L == 0L && var193 != 0L) {
                                var193 /= 37L;
                            }
                            String var200 = class163.method3563(var193);
                            if (var200 == null) {
                                var200 = "";
                            }
                            var190[var191] = var200;
                            continue;
                        }
                        if (var480 == 3612) {
                            if (client.field513 == null) {
                                field814[var5++] = 0;
                            } else {
                                field814[var5++] = Statics.field2144;
                            }
                            continue;
                        }
                        if (var480 == 3613) {
                            var5--;
                            int var202 = field814[var5];
                            if (client.field513 != null && var202 < Statics.field2144) {
                                field806[var6++] = Statics.field1227[var202].field638;
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 3614) {
                            var5--;
                            int var203 = field814[var5];
                            if (client.field513 != null && var203 < Statics.field2144) {
                                field814[var5++] = Statics.field1227[var203].field634;
                                continue;
                            }
                            field814[var5++] = 0;
                            continue;
                        }
                        if (var480 == 3615) {
                            var5--;
                            int var204 = field814[var5];
                            if (client.field513 != null && var204 < Statics.field2144) {
                                field814[var5++] = Statics.field1227[var204].field632;
                                continue;
                            }
                            field814[var5++] = 0;
                            continue;
                        }
                        if (var480 == 3616) {
                            field814[var5++] = Statics.field2745;
                            continue;
                        }
                        if (var480 == 3617) {
                            var6--;
                            String var205 = field806[var6];
                            client.method133(var205);
                            continue;
                        }
                        if (var480 == 3618) {
                            field814[var5++] = Statics.field129;
                            continue;
                        }
                        if (var480 == 3619) {
                            var6--;
                            String var206 = field806[var6];
                            client.method651(var206);
                            continue;
                        }
                        if (var480 == 3620) {
                            client.field339.method2722(83);
                            client.field339.method2452(0);
                            continue;
                        }
                        if (var480 == 3621) {
                            if (client.field563 == 0) {
                                field814[var5++] = -1;
                            } else {
                                field814[var5++] = client.field398;
                            }
                            continue;
                        }
                        if (var480 == 3622) {
                            var5--;
                            int var207 = field814[var5];
                            if (client.field563 != 0 && var207 < client.field398) {
                                field806[var6++] = client.field396[var207].field141;
                                field806[var6++] = client.field396[var207].field138;
                                continue;
                            }
                            field806[var6++] = "";
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 3623) {
                            var6--;
                            String var208 = field806[var6];
                            if (var208.startsWith(class2.method2761(0)) || var208.startsWith(class2.method2761(1))) {
                                var208 = var208.substring(7);
                            }
                            field814[var5++] = client.method789(var208) ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3624) {
                            var5--;
                            int var209 = field814[var5];
                            if (Statics.field1227 != null && var209 < Statics.field2144 && Statics.field1227[var209].field638.equalsIgnoreCase(Statics.field94.field59)) {
                                field814[var5++] = 1;
                                continue;
                            }
                            field814[var5++] = 0;
                            continue;
                        }
                        if (var480 == 3625) {
                            if (client.field523 == null) {
                                field806[var6++] = "";
                                continue;
                            }
                            String[] var210 = field806;
                            int var211 = var6++;
                            String var212 = client.field523;
                            long var213 = 0L;
                            int var215 = var212.length();
                            for (int var216 = 0; var216 < var215; var216++) {
                                var213 *= 37L;
                                char var217 = var212.charAt(var216);
                                if (var217 >= 'A' && var217 <= 'Z') {
                                    var213 += (long) (var217 + 1 - 65);
                                } else if (var217 >= 'a' && var217 <= 'z') {
                                    var213 += (long) (var217 + 1 - 97);
                                } else if (var217 >= '0' && var217 <= '9') {
                                    var213 += (long) (var217 + 27 - 48);
                                }
                                if (var213 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var213 % 37L == 0L && var213 != 0L) {
                                var213 /= 37L;
                            }
                            String var220 = class163.method3563(var213);
                            if (var220 == null) {
                                var220 = "";
                            }
                            var210[var211] = var220;
                            continue;
                        }
                    } else if (var480 < 4000) {
                        if (var480 == 3903) {
                            var5--;
                            int var222 = field814[var5];
                            field814[var5++] = client.field571[var222].method3818();
                            continue;
                        }
                        if (var480 == 3904) {
                            var5--;
                            int var223 = field814[var5];
                            field814[var5++] = client.field571[var223].field3171;
                            continue;
                        }
                        if (var480 == 3905) {
                            var5--;
                            int var224 = field814[var5];
                            field814[var5++] = client.field571[var224].field3172;
                            continue;
                        }
                        if (var480 == 3906) {
                            var5--;
                            int var225 = field814[var5];
                            field814[var5++] = client.field571[var225].field3173;
                            continue;
                        }
                        if (var480 == 3907) {
                            var5--;
                            int var226 = field814[var5];
                            field814[var5++] = client.field571[var226].field3170;
                            continue;
                        }
                        if (var480 == 3908) {
                            var5--;
                            int var227 = field814[var5];
                            field814[var5++] = client.field571[var227].field3175;
                            continue;
                        }
                        if (var480 == 3910) {
                            var5--;
                            int var228 = field814[var5];
                            int var229 = client.field571[var228].method3817();
                            field814[var5++] = var229 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3911) {
                            var5--;
                            int var230 = field814[var5];
                            int var231 = client.field571[var230].method3817();
                            field814[var5++] = var231 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3912) {
                            var5--;
                            int var232 = field814[var5];
                            int var233 = client.field571[var232].method3817();
                            field814[var5++] = var233 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3913) {
                            var5--;
                            int var234 = field814[var5];
                            int var235 = client.field571[var234].method3817();
                            field814[var5++] = var235 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 3914) {
                            var5--;
                            boolean var236 = field814[var5] == 1;
                            if (Statics.field657 != null) {
                                Statics.field657.method3838(class222.field3181, var236);
                            }
                            continue;
                        }
                        if (var480 == 3915) {
                            var5--;
                            boolean var237 = field814[var5] == 1;
                            if (Statics.field657 != null) {
                                Statics.field657.method3838(class222.field3179, var237);
                            }
                            continue;
                        }
                        if (var480 == 3916) {
                            var5 -= 2;
                            boolean var238 = field814[var5] == 1;
                            boolean var239 = field814[var5 + 1] == 1;
                            if (Statics.field657 != null) {
                                Statics.field657.method3838(new class22(var239), var238);
                            }
                            continue;
                        }
                        if (var480 == 3917) {
                            var5--;
                            boolean var240 = field814[var5] == 1;
                            if (Statics.field657 != null) {
                                Statics.field657.method3838(class222.field3178, var240);
                            }
                            continue;
                        }
                        if (var480 == 3918) {
                            var5--;
                            boolean var241 = field814[var5] == 1;
                            if (Statics.field657 != null) {
                                Statics.field657.method3838(class222.field3180, var241);
                            }
                            continue;
                        }
                        if (var480 == 3919) {
                            field814[var5++] = Statics.field657 == null ? 0 : Statics.field657.field3177.size();
                            continue;
                        }
                        if (var480 == 3920) {
                            var5--;
                            int var242 = field814[var5];
                            class215 var243 = (class215) Statics.field657.field3177.get(var242);
                            field814[var5++] = var243.field3156;
                            continue;
                        }
                        if (var480 == 3921) {
                            var5--;
                            int var244 = field814[var5];
                            class215 var245 = (class215) Statics.field657.field3177.get(var244);
                            field806[var6++] = var245.method3772();
                            continue;
                        }
                        if (var480 == 3922) {
                            var5--;
                            int var246 = field814[var5];
                            class215 var247 = (class215) Statics.field657.field3177.get(var246);
                            field806[var6++] = var247.method3773();
                            continue;
                        }
                        if (var480 == 3923) {
                            var5--;
                            int var248 = field814[var5];
                            class215 var249 = (class215) Statics.field657.field3177.get(var248);
                            long var250 = class116.method2781() - Statics.field719 - var249.field3152;
                            int var252 = (int) (var250 / 3600000L);
                            int var253 = (int) ((var250 - (long) (var252 * 3600000)) / 60000L);
                            int var254 = (int) ((var250 - (long) (var252 * 3600000) - (long) (var253 * 60000)) / 1000L);
                            String var255 = var252 + ":" + var253 / 10 + var253 % 10 + ":" + var254 / 10 + var254 % 10;
                            field806[var6++] = var255;
                            continue;
                        }
                        if (var480 == 3924) {
                            var5--;
                            int var256 = field814[var5];
                            class215 var257 = (class215) Statics.field657.field3177.get(var256);
                            field814[var5++] = var257.field3154.field3173;
                            continue;
                        }
                        if (var480 == 3925) {
                            var5--;
                            int var258 = field814[var5];
                            class215 var259 = (class215) Statics.field657.field3177.get(var258);
                            field814[var5++] = var259.field3154.field3172;
                            continue;
                        }
                        if (var480 == 3926) {
                            var5--;
                            int var260 = field814[var5];
                            class215 var261 = (class215) Statics.field657.field3177.get(var260);
                            field814[var5++] = var261.field3154.field3171;
                            continue;
                        }
                    } else if (var480 < 4100) {
                        if (var480 == 4000) {
                            var5 -= 2;
                            int var262 = field814[var5];
                            int var263 = field814[var5 + 1];
                            field814[var5++] = var262 + var263;
                            continue;
                        }
                        if (var480 == 4001) {
                            var5 -= 2;
                            int var264 = field814[var5];
                            int var265 = field814[var5 + 1];
                            field814[var5++] = var264 - var265;
                            continue;
                        }
                        if (var480 == 4002) {
                            var5 -= 2;
                            int var266 = field814[var5];
                            int var267 = field814[var5 + 1];
                            field814[var5++] = var266 * var267;
                            continue;
                        }
                        if (var480 == 4003) {
                            var5 -= 2;
                            int var268 = field814[var5];
                            int var269 = field814[var5 + 1];
                            field814[var5++] = var268 / var269;
                            continue;
                        }
                        if (var480 == 4004) {
                            var5--;
                            int var270 = field814[var5];
                            field814[var5++] = (int) (Math.random() * (double) var270);
                            continue;
                        }
                        if (var480 == 4005) {
                            var5--;
                            int var271 = field814[var5];
                            field814[var5++] = (int) (Math.random() * (double) (var271 + 1));
                            continue;
                        }
                        if (var480 == 4006) {
                            var5 -= 5;
                            int var272 = field814[var5];
                            int var273 = field814[var5 + 1];
                            int var274 = field814[var5 + 2];
                            int var275 = field814[var5 + 3];
                            int var276 = field814[var5 + 4];
                            field814[var5++] = (var273 - var272) * (var276 - var274) / (var275 - var274) + var272;
                            continue;
                        }
                        if (var480 == 4007) {
                            var5 -= 2;
                            int var277 = field814[var5];
                            int var278 = field814[var5 + 1];
                            field814[var5++] = var277 * var278 / 100 + var277;
                            continue;
                        }
                        if (var480 == 4008) {
                            var5 -= 2;
                            int var279 = field814[var5];
                            int var280 = field814[var5 + 1];
                            field814[var5++] = var279 | 0x1 << var280;
                            continue;
                        }
                        if (var480 == 4009) {
                            var5 -= 2;
                            int var281 = field814[var5];
                            int var282 = field814[var5 + 1];
                            field814[var5++] = var281 & -1 - (0x1 << var282);
                            continue;
                        }
                        if (var480 == 4010) {
                            var5 -= 2;
                            int var283 = field814[var5];
                            int var284 = field814[var5 + 1];
                            field814[var5++] = (var283 & 0x1 << var284) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var480 == 4011) {
                            var5 -= 2;
                            int var285 = field814[var5];
                            int var286 = field814[var5 + 1];
                            field814[var5++] = var285 % var286;
                            continue;
                        }
                        if (var480 == 4012) {
                            var5 -= 2;
                            int var287 = field814[var5];
                            int var288 = field814[var5 + 1];
                            if (var287 == 0) {
                                field814[var5++] = 0;
                            } else {
                                field814[var5++] = (int) Math.pow((double) var287, (double) var288);
                            }
                            continue;
                        }
                        if (var480 == 4013) {
                            var5 -= 2;
                            int var289 = field814[var5];
                            int var290 = field814[var5 + 1];
                            if (var289 == 0) {
                                field814[var5++] = 0;
                            } else if (var290 == 0) {
                                field814[var5++] = Integer.MAX_VALUE;
                            } else {
                                field814[var5++] = (int) Math.pow((double) var289, 1.0D / (double) var290);
                            }
                            continue;
                        }
                        if (var480 == 4014) {
                            var5 -= 2;
                            int var291 = field814[var5];
                            int var292 = field814[var5 + 1];
                            field814[var5++] = var291 & var292;
                            continue;
                        }
                        if (var480 == 4015) {
                            var5 -= 2;
                            int var293 = field814[var5];
                            int var294 = field814[var5 + 1];
                            field814[var5++] = var293 | var294;
                            continue;
                        }
                    } else if (var480 < 4200) {
                        if (var480 == 4100) {
                            var6--;
                            String var295 = field806[var6];
                            var5--;
                            int var296 = field814[var5];
                            field806[var6++] = var295 + var296;
                            continue;
                        }
                        if (var480 == 4101) {
                            var6 -= 2;
                            String var297 = field806[var6];
                            String var298 = field806[var6 + 1];
                            field806[var6++] = var297 + var298;
                            continue;
                        }
                        if (var480 == 4102) {
                            var6--;
                            String var299 = field806[var6];
                            var5--;
                            int var300 = field814[var5];
                            field806[var6++] = var299 + class164.method635(var300, true);
                            continue;
                        }
                        if (var480 == 4103) {
                            var6--;
                            String var301 = field806[var6];
                            field806[var6++] = var301.toLowerCase();
                            continue;
                        }
                        if (var480 == 4104) {
                            var5--;
                            int var302 = field814[var5];
                            long var303 = ((long) var302 + 11745L) * 86400000L;
                            field811.setTime(new Date(var303));
                            int var305 = field811.get(5);
                            int var306 = field811.get(2);
                            int var307 = field811.get(1);
                            field806[var6++] = var305 + "-" + field812[var306] + "-" + var307;
                            continue;
                        }
                        if (var480 == 4105) {
                            var6 -= 2;
                            String var308 = field806[var6];
                            String var309 = field806[var6 + 1];
                            if (Statics.field94.field34 != null && Statics.field94.field34.field2925) {
                                field806[var6++] = var309;
                                continue;
                            }
                            field806[var6++] = var308;
                            continue;
                        }
                        if (var480 == 4106) {
                            var5--;
                            int var310 = field814[var5];
                            field806[var6++] = Integer.toString(var310);
                            continue;
                        }
                        if (var480 == 4107) {
                            var6 -= 2;
                            int[] var311 = field814;
                            int var312 = var5++;
                            String var313 = field806[var6];
                            String var314 = field806[var6 + 1];
                            int var315 = client.field373;
                            int var316 = var313.length();
                            int var317 = var314.length();
                            int var318 = 0;
                            int var319 = 0;
                            byte var320 = 0;
                            byte var321 = 0;
                            int var322;
                            label2994: while (true) {
                                if (var318 - var320 >= var316 && var319 - var321 >= var317) {
                                    int var333 = Math.min(var316, var317);
                                    for (int var334 = 0; var334 < var333; var334++) {
                                        char var337 = var313.charAt(var334);
                                        char var338 = var314.charAt(var334);
                                        if (var337 != var338 && Character.toUpperCase(var337) != Character.toUpperCase(var338)) {
                                            char var339 = Character.toLowerCase(var337);
                                            char var340 = Character.toLowerCase(var338);
                                            if (var339 != var340) {
                                                var322 = class167.method2123(var339, var315) - class167.method2123(var340, var315);
                                                break label2994;
                                            }
                                        }
                                    }
                                    int var341 = var316 - var317;
                                    if (var341 == 0) {
                                        for (int var342 = 0; var342 < var333; var342++) {
                                            char var343 = var313.charAt(var342);
                                            char var344 = var314.charAt(var342);
                                            if (var343 != var344) {
                                                var322 = class167.method2123(var343, var315) - class167.method2123(var344, var315);
                                                break label2994;
                                            }
                                        }
                                        var322 = 0;
                                    } else {
                                        var322 = var341;
                                    }
                                    break;
                                }
                                if (var318 - var320 >= var316) {
                                    var322 = -1;
                                    break;
                                }
                                if (var319 - var321 >= var317) {
                                    var322 = 1;
                                    break;
                                }
                                char var323;
                                if (var320 == 0) {
                                    var323 = var313.charAt(var318++);
                                } else {
                                    var323 = (char) var320;
                                    boolean var324 = false;
                                }
                                char var325;
                                if (var321 == 0) {
                                    var325 = var314.charAt(var319++);
                                } else {
                                    var325 = (char) var321;
                                    boolean var326 = false;
                                }
                                byte var327;
                                if (var323 == 198) {
                                    var327 = 69;
                                } else if (var323 == 230) {
                                    var327 = 101;
                                } else if (var323 == 223) {
                                    var327 = 115;
                                } else if (var323 == 338) {
                                    var327 = 69;
                                } else if (var323 == 339) {
                                    var327 = 101;
                                } else {
                                    var327 = 0;
                                }
                                var320 = var327;
                                byte var328;
                                if (var325 == 198) {
                                    var328 = 69;
                                } else if (var325 == 230) {
                                    var328 = 101;
                                } else if (var325 == 223) {
                                    var328 = 115;
                                } else if (var325 == 338) {
                                    var328 = 69;
                                } else if (var325 == 339) {
                                    var328 = 101;
                                } else {
                                    var328 = 0;
                                }
                                var321 = var328;
                                char var329 = class167.method51(var323, var315);
                                char var330 = class167.method51(var325, var315);
                                if (var329 != var330 && Character.toUpperCase(var329) != Character.toUpperCase(var330)) {
                                    char var331 = Character.toLowerCase(var329);
                                    char var332 = Character.toLowerCase(var330);
                                    if (var331 != var332) {
                                        var322 = class167.method2123(var331, var315) - class167.method2123(var332, var315);
                                        break;
                                    }
                                }
                            }
                            byte var346;
                            if (var322 > 0) {
                                var346 = 1;
                            } else if (var322 < 0) {
                                var346 = -1;
                            } else {
                                var346 = 0;
                            }
                            var311[var312] = var346;
                            continue;
                        }
                        if (var480 == 4108) {
                            var6--;
                            String var347 = field806[var6];
                            var5 -= 2;
                            int var348 = field814[var5];
                            int var349 = field814[var5 + 1];
                            byte[] var350 = Statics.field220.method3188(var349, 0);
                            class225 var351 = new class225(var350);
                            field814[var5++] = var351.method3853(var347, var348);
                            continue;
                        }
                        if (var480 == 4109) {
                            var6--;
                            String var352 = field806[var6];
                            var5 -= 2;
                            int var353 = field814[var5];
                            int var354 = field814[var5 + 1];
                            byte[] var355 = Statics.field220.method3188(var354, 0);
                            class225 var356 = new class225(var355);
                            field814[var5++] = var356.method3852(var352, var353);
                            continue;
                        }
                        if (var480 == 4110) {
                            var6 -= 2;
                            String var357 = field806[var6];
                            String var358 = field806[var6 + 1];
                            var5--;
                            if (field814[var5] == 1) {
                                field806[var6++] = var357;
                            } else {
                                field806[var6++] = var358;
                            }
                            continue;
                        }
                        if (var480 == 4111) {
                            var6--;
                            String var359 = field806[var6];
                            field806[var6++] = class224.method3854(var359);
                            continue;
                        }
                        if (var480 == 4112) {
                            var6--;
                            String var360 = field806[var6];
                            var5--;
                            int var361 = field814[var5];
                            field806[var6++] = var360 + (char) var361;
                            continue;
                        }
                        if (var480 == 4113) {
                            var5--;
                            int var362 = field814[var5];
                            int[] var363 = field814;
                            int var364 = var5++;
                            char var365 = (char) var362;
                            boolean var366;
                            if (var365 >= ' ' && var365 <= '~') {
                                var366 = true;
                            } else if (var365 >= 160 && var365 <= 255) {
                                var366 = true;
                            } else if (var365 == 8364 || var365 == 338 || var365 == 8212 || var365 == 339 || var365 == 376) {
                                var366 = true;
                            } else {
                                var366 = false;
                            }
                            var363[var364] = var366 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 4114) {
                            var5--;
                            int var367 = field814[var5];
                            field814[var5++] = class164.method2713((char) var367) ? 1 : 0;
                            continue;
                        }
                        if (var480 == 4115) {
                            var5--;
                            int var368 = field814[var5];
                            field814[var5++] = class164.method2786((char) var368) ? 1 : 0;
                            continue;
                        }
                        if (var480 == 4116) {
                            var5--;
                            int var369 = field814[var5];
                            int[] var370 = field814;
                            int var371 = var5++;
                            char var372 = (char) var369;
                            boolean var373 = var372 >= '0' && var372 <= '9';
                            var370[var371] = var373 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 4117) {
                            var6--;
                            String var374 = field806[var6];
                            if (var374 == null) {
                                field814[var5++] = 0;
                            } else {
                                field814[var5++] = var374.length();
                            }
                            continue;
                        }
                        if (var480 == 4118) {
                            var6--;
                            String var375 = field806[var6];
                            var5 -= 2;
                            int var376 = field814[var5];
                            int var377 = field814[var5 + 1];
                            field806[var6++] = var375.substring(var376, var377);
                            continue;
                        }
                        if (var480 == 4119) {
                            var6--;
                            String var378 = field806[var6];
                            StringBuilder var379 = new StringBuilder(var378.length());
                            boolean var380 = false;
                            for (int var381 = 0; var381 < var378.length(); var381++) {
                                char var382 = var378.charAt(var381);
                                if (var382 == '<') {
                                    var380 = true;
                                } else if (var382 == '>') {
                                    var380 = false;
                                } else if (!var380) {
                                    var379.append(var382);
                                }
                            }
                            field806[var6++] = var379.toString();
                            continue;
                        }
                        if (var480 == 4120) {
                            var6--;
                            String var383 = field806[var6];
                            var5--;
                            int var384 = field814[var5];
                            field814[var5++] = var383.indexOf(var384);
                            continue;
                        }
                        if (var480 == 4121) {
                            var6 -= 2;
                            String var385 = field806[var6];
                            String var386 = field806[var6 + 1];
                            var5--;
                            int var387 = field814[var5];
                            field814[var5++] = var385.indexOf(var386, var387);
                            continue;
                        }
                    } else if (var480 < 4300) {
                        if (var480 == 4200) {
                            var5--;
                            int var388 = field814[var5];
                            field806[var6++] = class52.method176(var388).field1126;
                            continue;
                        }
                        if (var480 == 4201) {
                            var5 -= 2;
                            int var389 = field814[var5];
                            int var390 = field814[var5 + 1];
                            class52 var391 = class52.method176(var389);
                            if (var390 >= 1 && var390 <= 5 && var391.field1140[var390 - 1] != null) {
                                field806[var6++] = var391.field1140[var390 - 1];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 4202) {
                            var5 -= 2;
                            int var392 = field814[var5];
                            int var393 = field814[var5 + 1];
                            class52 var394 = class52.method176(var392);
                            if (var393 >= 1 && var393 <= 5 && var394.field1141[var393 - 1] != null) {
                                field806[var6++] = var394.field1141[var393 - 1];
                                continue;
                            }
                            field806[var6++] = "";
                            continue;
                        }
                        if (var480 == 4203) {
                            var5--;
                            int var395 = field814[var5];
                            field814[var5++] = class52.method176(var395).field1151;
                            continue;
                        }
                        if (var480 == 4204) {
                            var5--;
                            int var396 = field814[var5];
                            field814[var5++] = class52.method176(var396).field1137 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 4205) {
                            var5--;
                            int var397 = field814[var5];
                            class52 var398 = class52.method176(var397);
                            if (var398.field1157 == -1 && var398.field1156 >= 0) {
                                field814[var5++] = var398.field1156;
                                continue;
                            }
                            field814[var5++] = var397;
                            continue;
                        }
                        if (var480 == 4206) {
                            var5--;
                            int var399 = field814[var5];
                            class52 var400 = class52.method176(var399);
                            if (var400.field1157 >= 0 && var400.field1156 >= 0) {
                                field814[var5++] = var400.field1156;
                                continue;
                            }
                            field814[var5++] = var399;
                            continue;
                        }
                        if (var480 == 4207) {
                            var5--;
                            int var401 = field814[var5];
                            field814[var5++] = class52.method176(var401).field1139 ? 1 : 0;
                            continue;
                        }
                        if (var480 == 4208) {
                            var5--;
                            int var402 = field814[var5];
                            class52 var403 = class52.method176(var402);
                            if (var403.field1145 == -1 && var403.field1120 >= 0) {
                                field814[var5++] = var403.field1120;
                                continue;
                            }
                            field814[var5++] = var402;
                            continue;
                        }
                        if (var480 == 4209) {
                            var5--;
                            int var404 = field814[var5];
                            class52 var405 = class52.method176(var404);
                            if (var405.field1145 >= 0 && var405.field1120 >= 0) {
                                field814[var5++] = var405.field1120;
                                continue;
                            }
                            field814[var5++] = var404;
                            continue;
                        }
                        if (var480 == 4210) {
                            var6--;
                            String var406 = field806[var6];
                            var5--;
                            int var407 = field814[var5];
                            client.method734(var406, var407 == 1);
                            field814[var5++] = Statics.field211;
                            continue;
                        }
                        if (var480 == 4211) {
                            if (Statics.field717 != null && Statics.field1035 < Statics.field211) {
                                field814[var5++] = Statics.field717[++Statics.field1035 - 1] & 0xFFFF;
                                continue;
                            }
                            field814[var5++] = -1;
                            continue;
                        }
                        if (var480 == 4212) {
                            Statics.field1035 = 0;
                            continue;
                        }
                    } else if (var480 < 5100) {
                        if (var480 == 5000) {
                            field814[var5++] = client.field512;
                            continue;
                        }
                        if (var480 == 5001) {
                            var5 -= 3;
                            client.field512 = field814[var5];
                            int var408 = field814[var5 + 1];
                            class131[] var409 = class131.method2143();
                            int var410 = 0;
                            class131 var412;
                            while (true) {
                                if (var410 >= var409.length) {
                                    var412 = null;
                                    break;
                                }
                                class131 var411 = var409[var410];
                                if (var411.field2063 == var408) {
                                    var412 = var411;
                                    break;
                                }
                                var410++;
                            }
                            Statics.field190 = var412;
                            if (Statics.field190 == null) {
                                Statics.field190 = class131.field2059;
                            }
                            client.field446 = field814[var5 + 2];
                            client.field339.method2722(19);
                            client.field339.method2452(client.field512);
                            client.field339.method2452(Statics.field190.field2063);
                            client.field339.method2452(client.field446);
                            continue;
                        }
                        if (var480 == 5002) {
                            var6--;
                            String var413 = field806[var6];
                            var5 -= 2;
                            int var414 = field814[var5];
                            int var415 = field814[var5 + 1];
                            client.field339.method2722(131);
                            client.field339.method2452(class120.method2241(var413) + 2);
                            client.field339.method2543(var413);
                            client.field339.method2452(var414 - 1);
                            client.field339.method2452(var415);
                            continue;
                        }
                        if (var480 == 5003) {
                            var5 -= 2;
                            int var416 = field814[var5];
                            int var417 = field814[var5 + 1];
                            class36 var418 = class12.method624(var416, var417);
                            if (var418 == null) {
                                field814[var5++] = -1;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                                field806[var6++] = "";
                                field806[var6++] = "";
                            } else {
                                field814[var5++] = var418.field798;
                                field814[var5++] = var418.field790;
                                field806[var6++] = var418.field793 == null ? "" : var418.field793;
                                field806[var6++] = var418.field792 == null ? "" : var418.field792;
                                field806[var6++] = var418.field796 == null ? "" : var418.field796;
                            }
                            continue;
                        }
                        if (var480 == 5004) {
                            var5--;
                            int var419 = field814[var5];
                            class36 var420 = (class36) class12.field182.method3628((long) var419);
                            if (var420 == null) {
                                field814[var5++] = -1;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                                field806[var6++] = "";
                                field806[var6++] = "";
                            } else {
                                field814[var5++] = var420.field791;
                                field814[var5++] = var420.field790;
                                field806[var6++] = var420.field793 == null ? "" : var420.field793;
                                field806[var6++] = var420.field792 == null ? "" : var420.field792;
                                field806[var6++] = var420.field796 == null ? "" : var420.field796;
                            }
                            continue;
                        }
                        if (var480 == 5005) {
                            if (Statics.field190 == null) {
                                field814[var5++] = -1;
                            } else {
                                field814[var5++] = Statics.field190.field2063;
                            }
                            continue;
                        }
                        if (var480 == 5008) {
                            var6--;
                            String var422 = field806[var6];
                            var5--;
                            int var423 = field814[var5];
                            String var424 = var422.toLowerCase();
                            byte var425 = 0;
                            if (var424.startsWith(class158.field2542)) {
                                var425 = 0;
                                var422 = var422.substring(class158.field2542.length());
                            } else if (var424.startsWith(class158.field2325)) {
                                var425 = 1;
                                var422 = var422.substring(class158.field2325.length());
                            } else if (var424.startsWith(class158.field2479)) {
                                var425 = 2;
                                var422 = var422.substring(class158.field2479.length());
                            } else if (var424.startsWith(class158.field2467)) {
                                var425 = 3;
                                var422 = var422.substring(class158.field2467.length());
                            } else if (var424.startsWith(class158.field2415)) {
                                var425 = 4;
                                var422 = var422.substring(class158.field2415.length());
                            } else if (var424.startsWith(class158.field2485)) {
                                var425 = 5;
                                var422 = var422.substring(class158.field2485.length());
                            } else if (var424.startsWith(class158.field2487)) {
                                var425 = 6;
                                var422 = var422.substring(class158.field2487.length());
                            } else if (var424.startsWith(class158.field2489)) {
                                var425 = 7;
                                var422 = var422.substring(class158.field2489.length());
                            } else if (var424.startsWith(class158.field2491)) {
                                var425 = 8;
                                var422 = var422.substring(class158.field2491.length());
                            } else if (var424.startsWith(class158.field2493)) {
                                var425 = 9;
                                var422 = var422.substring(class158.field2493.length());
                            } else if (var424.startsWith(class158.field2495)) {
                                var425 = 10;
                                var422 = var422.substring(class158.field2495.length());
                            } else if (var424.startsWith(class158.field2475)) {
                                var425 = 11;
                                var422 = var422.substring(class158.field2475.length());
                            } else if (client.field373 != 0) {
                                if (var424.startsWith(class158.field2476)) {
                                    var425 = 0;
                                    var422 = var422.substring(class158.field2476.length());
                                } else if (var424.startsWith(class158.field2478)) {
                                    var425 = 1;
                                    var422 = var422.substring(class158.field2478.length());
                                } else if (var424.startsWith(class158.field2480)) {
                                    var425 = 2;
                                    var422 = var422.substring(class158.field2480.length());
                                } else if (var424.startsWith(class158.field2482)) {
                                    var425 = 3;
                                    var422 = var422.substring(class158.field2482.length());
                                } else if (var424.startsWith(class158.field2557)) {
                                    var425 = 4;
                                    var422 = var422.substring(class158.field2557.length());
                                } else if (var424.startsWith(class158.field2486)) {
                                    var425 = 5;
                                    var422 = var422.substring(class158.field2486.length());
                                } else if (var424.startsWith(class158.field2488)) {
                                    var425 = 6;
                                    var422 = var422.substring(class158.field2488.length());
                                } else if (var424.startsWith(class158.field2490)) {
                                    var425 = 7;
                                    var422 = var422.substring(class158.field2490.length());
                                } else if (var424.startsWith(class158.field2492)) {
                                    var425 = 8;
                                    var422 = var422.substring(class158.field2492.length());
                                } else if (var424.startsWith(class158.field2494)) {
                                    var425 = 9;
                                    var422 = var422.substring(class158.field2494.length());
                                } else if (var424.startsWith(class158.field2496)) {
                                    var425 = 10;
                                    var422 = var422.substring(class158.field2496.length());
                                } else if (var424.startsWith(class158.field2498)) {
                                    var425 = 11;
                                    var422 = var422.substring(class158.field2498.length());
                                }
                            }
                            String var426 = var422.toLowerCase();
                            byte var427 = 0;
                            if (var426.startsWith(class158.field2407)) {
                                var427 = 1;
                                var422 = var422.substring(class158.field2407.length());
                            } else if (var426.startsWith(class158.field2329)) {
                                var427 = 2;
                                var422 = var422.substring(class158.field2329.length());
                            } else if (var426.startsWith(class158.field2503)) {
                                var427 = 3;
                                var422 = var422.substring(class158.field2503.length());
                            } else if (var426.startsWith(class158.field2505)) {
                                var427 = 4;
                                var422 = var422.substring(class158.field2505.length());
                            } else if (var426.startsWith(class158.field2323)) {
                                var427 = 5;
                                var422 = var422.substring(class158.field2323.length());
                            } else if (client.field373 != 0) {
                                if (var426.startsWith(class158.field2352)) {
                                    var427 = 1;
                                    var422 = var422.substring(class158.field2352.length());
                                } else if (var426.startsWith(class158.field2502)) {
                                    var427 = 2;
                                    var422 = var422.substring(class158.field2502.length());
                                } else if (var426.startsWith(class158.field2504)) {
                                    var427 = 3;
                                    var422 = var422.substring(class158.field2504.length());
                                } else if (var426.startsWith(class158.field2302)) {
                                    var427 = 4;
                                    var422 = var422.substring(class158.field2302.length());
                                } else if (var426.startsWith(class158.field2555)) {
                                    var427 = 5;
                                    var422 = var422.substring(class158.field2555.length());
                                }
                            }
                            client.field339.method2722(139);
                            client.field339.method2452(0);
                            int var428 = client.field339.field1993;
                            client.field339.method2452(var423);
                            client.field339.method2452(var425);
                            client.field339.method2452(var427);
                            class123 var429 = client.field339;
                            int var430 = var429.field1993;
                            int var431 = var422.length();
                            byte[] var432 = new byte[var431];
                            for (int var433 = 0; var433 < var431; var433++) {
                                char var434 = var422.charAt(var433);
                                if (var434 > 0 && var434 < 128 || var434 >= 160 && var434 <= 255) {
                                    var432[var433] = (byte) var434;
                                } else if (var434 == 8364) {
                                    var432[var433] = -128;
                                } else if (var434 == 8218) {
                                    var432[var433] = -126;
                                } else if (var434 == 402) {
                                    var432[var433] = -125;
                                } else if (var434 == 8222) {
                                    var432[var433] = -124;
                                } else if (var434 == 8230) {
                                    var432[var433] = -123;
                                } else if (var434 == 8224) {
                                    var432[var433] = -122;
                                } else if (var434 == 8225) {
                                    var432[var433] = -121;
                                } else if (var434 == 710) {
                                    var432[var433] = -120;
                                } else if (var434 == 8240) {
                                    var432[var433] = -119;
                                } else if (var434 == 352) {
                                    var432[var433] = -118;
                                } else if (var434 == 8249) {
                                    var432[var433] = -117;
                                } else if (var434 == 338) {
                                    var432[var433] = -116;
                                } else if (var434 == 381) {
                                    var432[var433] = -114;
                                } else if (var434 == 8216) {
                                    var432[var433] = -111;
                                } else if (var434 == 8217) {
                                    var432[var433] = -110;
                                } else if (var434 == 8220) {
                                    var432[var433] = -109;
                                } else if (var434 == 8221) {
                                    var432[var433] = -108;
                                } else if (var434 == 8226) {
                                    var432[var433] = -107;
                                } else if (var434 == 8211) {
                                    var432[var433] = -106;
                                } else if (var434 == 8212) {
                                    var432[var433] = -105;
                                } else if (var434 == 732) {
                                    var432[var433] = -104;
                                } else if (var434 == 8482) {
                                    var432[var433] = -103;
                                } else if (var434 == 353) {
                                    var432[var433] = -102;
                                } else if (var434 == 8250) {
                                    var432[var433] = -101;
                                } else if (var434 == 339) {
                                    var432[var433] = -100;
                                } else if (var434 == 382) {
                                    var432[var433] = -98;
                                } else if (var434 == 376) {
                                    var432[var433] = -97;
                                } else {
                                    var432[var433] = 63;
                                }
                            }
                            var429.method2566(var432.length);
                            var429.field1993 += Statics.field2056.method2384(var432, 0, var432.length, var429.field1994, var429.field1993);
                            client.field339.method2459(client.field339.field1993 - var428);
                            continue;
                        }
                        if (var480 == 5009) {
                            var6 -= 2;
                            String var437 = field806[var6];
                            String var438 = field806[var6 + 1];
                            client.field339.method2722(137);
                            client.field339.method2448(0);
                            int var439 = client.field339.field1993;
                            client.field339.method2543(var437);
                            class123 var440 = client.field339;
                            int var441 = var440.field1993;
                            int var442 = var438.length();
                            byte[] var443 = new byte[var442];
                            for (int var444 = 0; var444 < var442; var444++) {
                                char var445 = var438.charAt(var444);
                                if (var445 > 0 && var445 < 128 || var445 >= 160 && var445 <= 255) {
                                    var443[var444] = (byte) var445;
                                } else if (var445 == 8364) {
                                    var443[var444] = -128;
                                } else if (var445 == 8218) {
                                    var443[var444] = -126;
                                } else if (var445 == 402) {
                                    var443[var444] = -125;
                                } else if (var445 == 8222) {
                                    var443[var444] = -124;
                                } else if (var445 == 8230) {
                                    var443[var444] = -123;
                                } else if (var445 == 8224) {
                                    var443[var444] = -122;
                                } else if (var445 == 8225) {
                                    var443[var444] = -121;
                                } else if (var445 == 710) {
                                    var443[var444] = -120;
                                } else if (var445 == 8240) {
                                    var443[var444] = -119;
                                } else if (var445 == 352) {
                                    var443[var444] = -118;
                                } else if (var445 == 8249) {
                                    var443[var444] = -117;
                                } else if (var445 == 338) {
                                    var443[var444] = -116;
                                } else if (var445 == 381) {
                                    var443[var444] = -114;
                                } else if (var445 == 8216) {
                                    var443[var444] = -111;
                                } else if (var445 == 8217) {
                                    var443[var444] = -110;
                                } else if (var445 == 8220) {
                                    var443[var444] = -109;
                                } else if (var445 == 8221) {
                                    var443[var444] = -108;
                                } else if (var445 == 8226) {
                                    var443[var444] = -107;
                                } else if (var445 == 8211) {
                                    var443[var444] = -106;
                                } else if (var445 == 8212) {
                                    var443[var444] = -105;
                                } else if (var445 == 732) {
                                    var443[var444] = -104;
                                } else if (var445 == 8482) {
                                    var443[var444] = -103;
                                } else if (var445 == 353) {
                                    var443[var444] = -102;
                                } else if (var445 == 8250) {
                                    var443[var444] = -101;
                                } else if (var445 == 339) {
                                    var443[var444] = -100;
                                } else if (var445 == 382) {
                                    var443[var444] = -98;
                                } else if (var445 == 376) {
                                    var443[var444] = -97;
                                } else {
                                    var443[var444] = 63;
                                }
                            }
                            var440.method2566(var443.length);
                            var440.field1993 += Statics.field2056.method2384(var443, 0, var443.length, var440.field1994, var440.field1993);
                            client.field339.method2660(client.field339.field1993 - var439);
                            continue;
                        }
                        if (var480 == 5015) {
                            String var448;
                            if (Statics.field94 == null || Statics.field94.field59 == null) {
                                var448 = "";
                            } else {
                                var448 = Statics.field94.field59;
                            }
                            field806[var6++] = var448;
                            continue;
                        }
                        if (var480 == 5016) {
                            field814[var5++] = client.field446;
                            continue;
                        }
                        if (var480 == 5017) {
                            var5--;
                            int var449 = field814[var5];
                            field814[var5++] = class12.method834(var449);
                            continue;
                        }
                        if (var480 == 5018) {
                            var5--;
                            int var450 = field814[var5];
                            field814[var5++] = class12.method1661(var450);
                            continue;
                        }
                        if (var480 == 5019) {
                            var5--;
                            int var451 = field814[var5];
                            int[] var452 = field814;
                            int var453 = var5++;
                            class36 var454 = (class36) class12.field182.method3628((long) var451);
                            int var455;
                            if (var454 == null) {
                                var455 = -1;
                            } else if (class12.field183.field3110 == var454.field3114) {
                                var455 = -1;
                            } else {
                                var455 = ((class36) var454.field3114).field798;
                            }
                            var452[var453] = var455;
                            continue;
                        }
                        if (var480 == 5020) {
                            var6--;
                            String var456 = field806[var6];
                            client.method3221(var456);
                            continue;
                        }
                        if (var480 == 5021) {
                            var6--;
                            client.field331 = field806[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var480 == 5022) {
                            field806[var6++] = client.field331;
                            continue;
                        }
                    }
                }
                if (var480 < 5400) {
                    if (var480 == 5306) {
                        field814[var5++] = client.method669();
                        continue;
                    }
                    if (var480 == 5307) {
                        var5--;
                        int var457 = field814[var5];
                        if (var457 != 1 && var457 != 2) {
                            continue;
                        }
                        client.field507 = 0L;
                        if (var457 >= 2) {
                            client.field345 = true;
                        } else {
                            client.field345 = false;
                        }
                        client.method158();
                        if (client.field555 >= 25) {
                            client.method792();
                        }
                        class145.field2198 = true;
                        continue;
                    }
                    if (var480 == 5308) {
                        field814[var5++] = Statics.field2079.field146;
                        continue;
                    }
                    if (var480 == 5309) {
                        var5--;
                        int var458 = field814[var5];
                        if (var458 == 1 || var458 == 2) {
                            Statics.field2079.field146 = var458;
                            class9.method3770();
                        }
                        continue;
                    }
                }
                if (var480 < 5600) {
                    if (var480 == 5504) {
                        var5 -= 2;
                        int var459 = field814[var5];
                        int var460 = field814[var5 + 1];
                        if (!client.field543) {
                            client.field565 = var459;
                            client.field380 = var460;
                        }
                        continue;
                    }
                    if (var480 == 5505) {
                        field814[var5++] = client.field565;
                        continue;
                    }
                    if (var480 == 5506) {
                        field814[var5++] = client.field380;
                        continue;
                    }
                    if (var480 == 5530) {
                        var5--;
                        int var461 = field814[var5];
                        if (var461 < 0) {
                            var461 = 0;
                        }
                        client.field557 = var461;
                        continue;
                    }
                    if (var480 == 5531) {
                        field814[var5++] = client.field557;
                        continue;
                    }
                }
                if (var480 >= 5700 || var480 != 5630) {
                    if (var480 < 6300) {
                        if (var480 == 6200) {
                            var5 -= 2;
                            client.field549 = (short) field814[var5];
                            if (client.field549 <= 0) {
                                client.field549 = 256;
                            }
                            client.field536 = (short) field814[var5 + 1];
                            if (client.field536 <= 0) {
                                client.field536 = 205;
                            }
                            continue;
                        }
                        if (var480 == 6201) {
                            var5 -= 2;
                            client.field422 = (short) field814[var5];
                            if (client.field422 <= 0) {
                                client.field422 = 256;
                            }
                            client.field546 = (short) field814[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 320;
                            }
                            continue;
                        }
                        if (var480 == 6202) {
                            var5 -= 4;
                            client.field553 = (short) field814[var5];
                            if (client.field553 <= 0) {
                                client.field553 = 1;
                            }
                            client.field554 = (short) field814[var5 + 1];
                            if (client.field554 <= 0) {
                                client.field554 = 32767;
                            } else if (client.field554 < client.field553) {
                                client.field554 = client.field553;
                            }
                            client.field386 = (short) field814[var5 + 2];
                            if (client.field386 <= 0) {
                                client.field386 = 1;
                            }
                            client.field556 = (short) field814[var5 + 3];
                            if (client.field556 <= 0) {
                                client.field556 = 32767;
                            } else if (client.field556 < client.field386) {
                                client.field556 = client.field386;
                            }
                            continue;
                        }
                        if (var480 == 6203) {
                            if (client.field471 == null) {
                                field814[var5++] = -1;
                                field814[var5++] = -1;
                            } else {
                                client.method163(0, 0, client.field471.field2774, client.field471.field2775, false);
                                field814[var5++] = client.field559;
                                field814[var5++] = client.field457;
                            }
                            continue;
                        }
                        if (var480 == 6204) {
                            field814[var5++] = client.field422;
                            field814[var5++] = client.field546;
                            continue;
                        }
                        if (var480 == 6205) {
                            field814[var5++] = client.field549;
                            field814[var5++] = client.field536;
                            continue;
                        }
                    }
                    if (var480 < 6600) {
                        if (var480 == 6500) {
                            field814[var5++] = class26.method1589() ? 1 : 0;
                            continue;
                        }
                        if (var480 == 6501) {
                            class26.field643 = 0;
                            class26 var462;
                            if (class26.field643 < class26.field651) {
                                var462 = Statics.field2052[++class26.field643 - 1];
                            } else {
                                var462 = null;
                            }
                            if (var462 == null) {
                                field814[var5++] = -1;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                                field814[var5++] = 0;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                            } else {
                                field814[var5++] = var462.field647;
                                field814[var5++] = var462.field648;
                                field806[var6++] = var462.field650;
                                field814[var5++] = var462.field652;
                                field814[var5++] = var462.field649;
                                field806[var6++] = var462.field656;
                            }
                            continue;
                        }
                        if (var480 == 6502) {
                            class26 var465;
                            if (class26.field643 < class26.field651) {
                                var465 = Statics.field2052[++class26.field643 - 1];
                            } else {
                                var465 = null;
                            }
                            if (var465 == null) {
                                field814[var5++] = -1;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                                field814[var5++] = 0;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                            } else {
                                field814[var5++] = var465.field647;
                                field814[var5++] = var465.field648;
                                field806[var6++] = var465.field650;
                                field814[var5++] = var465.field652;
                                field814[var5++] = var465.field649;
                                field806[var6++] = var465.field656;
                            }
                            continue;
                        }
                        if (var480 == 6506) {
                            var5--;
                            int var467 = field814[var5];
                            class26 var468 = null;
                            for (int var469 = 0; var469 < class26.field651; var469++) {
                                if (Statics.field2052[var469].field647 == var467) {
                                    var468 = Statics.field2052[var469];
                                    break;
                                }
                            }
                            if (var468 == null) {
                                field814[var5++] = -1;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                                field814[var5++] = 0;
                                field814[var5++] = 0;
                                field806[var6++] = "";
                            } else {
                                field814[var5++] = var468.field647;
                                field814[var5++] = var468.field648;
                                field806[var6++] = var468.field650;
                                field814[var5++] = var468.field652;
                                field814[var5++] = var468.field649;
                                field806[var6++] = var468.field656;
                            }
                            continue;
                        }
                        if (var480 == 6507) {
                            var5 -= 4;
                            int var470 = field814[var5];
                            boolean var471 = field814[var5 + 1] == 1;
                            int var472 = field814[var5 + 2];
                            boolean var473 = field814[var5 + 3] == 1;
                            class26.method3046(var470, var471, var472, var473);
                            continue;
                        }
                        if (var480 == 6511) {
                            var5--;
                            int var474 = field814[var5];
                            if (var474 >= 0 && var474 < class26.field651) {
                                class26 var475 = Statics.field2052[var474];
                                field814[var5++] = var475.field647;
                                field814[var5++] = var475.field648;
                                field806[var6++] = var475.field650;
                                field814[var5++] = var475.field652;
                                field814[var5++] = var475.field649;
                                field806[var6++] = var475.field656;
                                continue;
                            }
                            field814[var5++] = -1;
                            field814[var5++] = 0;
                            field806[var6++] = "";
                            field814[var5++] = 0;
                            field814[var5++] = 0;
                            field806[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field402 = 250;
            }
        } catch (Exception var479) {
            StringBuilder var477 = new StringBuilder(30);
            var477.append("").append(var4.field3126).append(" ");
            for (int var478 = field809 - 1; var478 >= 0; var478--) {
                var477.append("").append(field810[var478].field217.field3126).append(" ");
            }
            var477.append("").append(var10);
            class149.method650(var477.toString(), var479);
        }
    }

    @ObfuscatedName("hg.w(IB)V")
    public static void method3810(int arg0) {
        if (arg0 == -1 || !class174.method159(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2887[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2840 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field5 = var3.field2840;
                method3232(var4, 2000000);
            }
        }
    }
}
