package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("as")
public class class37 {

    @ObfuscatedName("as.f")
    public static int[] field803 = new int[5];

    @ObfuscatedName("as.m")
    public static int[][] field809 = new int[5][5000];

    @ObfuscatedName("as.o")
    public static int[] field796 = new int[1000];

    @ObfuscatedName("as.h")
    public static String[] field801 = new String[1000];

    @ObfuscatedName("as.n")
    public static int field802 = 0;

    @ObfuscatedName("as.k")
    public static class15[] field795 = new class15[50];

    @ObfuscatedName("as.q")
    public static Calendar field804 = Calendar.getInstance();

    @ObfuscatedName("as.u")
    public static final String[] field805 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("as.g")
    public static int field806 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.j(Lj;II)V")
    public static void method2607(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method577(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field589;
        int[] var9 = var4.field590;
        byte var10 = -1;
        field802 = 0;
        try {
            Statics.field797 = new int[var4.field592];
            int var11 = 0;
            Statics.field3161 = new String[var4.field588];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2760;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field15;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2826;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2760;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2826;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field797[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field3161[var12++] = var15;
                }
            }
            int var16 = 0;
            field806 = arg0.field1;
            label2787: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var402 = var8[var7];
                if (var402 < 100) {
                    if (var402 == 0) {
                        field796[var5++] = var9[var7];
                        continue;
                    }
                    if (var402 == 1) {
                        int var17 = var9[var7];
                        field796[var5++] = class176.field2907[var17];
                        continue;
                    }
                    if (var402 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2907[var18] = field796[var5];
                        client.method2614(var18);
                        continue;
                    }
                    if (var402 == 3) {
                        field801[var6++] = var4.field595[var7];
                        continue;
                    }
                    if (var402 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var402 == 7) {
                        var5 -= 2;
                        if (field796[var5 + 1] != field796[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var402 == 8) {
                        var5 -= 2;
                        if (field796[var5 + 1] == field796[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var402 == 9) {
                        var5 -= 2;
                        if (field796[var5] < field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var402 == 10) {
                        var5 -= 2;
                        if (field796[var5] > field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var402 == 21) {
                        if (field802 == 0) {
                            return;
                        }
                        class15 var19 = field795[--field802];
                        var4 = var19.field213;
                        var8 = var4.field589;
                        var9 = var4.field590;
                        var7 = var19.field217;
                        Statics.field797 = var19.field221;
                        Statics.field3161 = var19.field215;
                        continue;
                    }
                    if (var402 == 25) {
                        int var20 = var9[var7];
                        field796[var5++] = class176.method2248(var20);
                        continue;
                    }
                    if (var402 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2115(var21, field796[var5]);
                        continue;
                    }
                    if (var402 == 31) {
                        var5 -= 2;
                        if (field796[var5] <= field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var402 == 32) {
                        var5 -= 2;
                        if (field796[var5] >= field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var402 == 33) {
                        field796[var5++] = Statics.field797[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var402 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field797[var10001] = field796[var5];
                        continue;
                    }
                    if (var402 == 35) {
                        field801[var6++] = Statics.field3161[var9[var7]];
                        continue;
                    }
                    if (var402 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field3161[var10001] = field801[var6];
                        continue;
                    }
                    if (var402 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class163.method2923(field801, var6, var22);
                        field801[var6++] = var23;
                        continue;
                    }
                    if (var402 == 38) {
                        var5--;
                        continue;
                    }
                    if (var402 == 39) {
                        var6--;
                        continue;
                    }
                    if (var402 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = class23.method577(var24);
                        int[] var26 = new int[var25.field592];
                        String[] var27 = new String[var25.field588];
                        for (int var28 = 0; var28 < var25.field593; var28++) {
                            var26[var28] = field796[var5 - var25.field593 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field602; var29++) {
                            var27[var29] = field801[var6 - var25.field602 + var29];
                        }
                        var5 -= var25.field593;
                        var6 -= var25.field602;
                        class15 var30 = new class15();
                        var30.field213 = var4;
                        var30.field217 = var7;
                        var30.field221 = Statics.field797;
                        var30.field215 = Statics.field3161;
                        field795[++field802 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field589;
                        var9 = var25.field590;
                        var7 = -1;
                        Statics.field797 = var26;
                        Statics.field3161 = var27;
                        continue;
                    }
                    if (var402 == 42) {
                        field796[var5++] = Statics.field64.method213(var9[var7]);
                        continue;
                    }
                    if (var402 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field64.method197(var10001, field796[var5]);
                        continue;
                    }
                    if (var402 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field796[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field803[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2787;
                                }
                                field809[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var402 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field796[var5];
                        if (var37 >= 0 && var37 < field803[var36]) {
                            field796[var5++] = field809[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var402 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field796[var5];
                        if (var39 >= 0 && var39 < field803[var38]) {
                            field809[var38][var39] = field796[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var402 == 47) {
                        String var40 = Statics.field64.method200(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field801[var6++] = var40;
                        continue;
                    }
                    if (var402 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field64.method199(var10001, field801[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var402 < 1000) {
                    if (var402 == 100) {
                        var5 -= 3;
                        int var42 = field796[var5];
                        int var43 = field796[var5 + 1];
                        int var44 = field796[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var45 = class173.method691(var42);
                        if (var45.field2882 == null) {
                            var45.field2882 = new class173[var44 + 1];
                        }
                        if (var45.field2882.length <= var44) {
                            class173[] var46 = new class173[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2882.length; var47++) {
                                var46[var47] = var45.field2882[var47];
                            }
                            var45.field2882 = var46;
                        }
                        if (var44 > 0 && var45.field2882[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class173 var48 = new class173();
                        var48.field2850 = var43;
                        var48.field2779 = var48.field2760 = var45.field2760;
                        var48.field2826 = var44;
                        var48.field2759 = true;
                        var45.field2882[var44] = var48;
                        if (var41) {
                            Statics.field1960 = var48;
                        } else {
                            Statics.field583 = var48;
                        }
                        client.method2263(var45);
                        continue;
                    }
                    if (var402 == 101) {
                        class173 var49 = var41 ? Statics.field1960 : Statics.field583;
                        class173 var50 = class173.method691(var49.field2760);
                        var50.field2882[var49.field2826] = null;
                        client.method2263(var50);
                        continue;
                    }
                    if (var402 == 102) {
                        var5--;
                        class173 var51 = class173.method691(field796[var5]);
                        var51.field2882 = null;
                        client.method2263(var51);
                        continue;
                    }
                    if (var402 == 200) {
                        var5 -= 2;
                        int var52 = field796[var5];
                        int var53 = field796[var5 + 1];
                        class173 var54 = class173.method2802(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field796[var5++] = 1;
                            if (var41) {
                                Statics.field1960 = var54;
                            } else {
                                Statics.field583 = var54;
                            }
                            continue;
                        }
                        field796[var5++] = 0;
                        continue;
                    }
                    if (var402 == 201) {
                        var5--;
                        class173 var55 = class173.method691(field796[var5]);
                        if (var55 == null) {
                            field796[var5++] = 0;
                        } else {
                            field796[var5++] = 1;
                            if (var41) {
                                Statics.field1960 = var55;
                            } else {
                                Statics.field583 = var55;
                            }
                        }
                        continue;
                    }
                } else if (var402 >= 1000 && var402 < 1100 || var402 >= 2000 && var402 < 2100) {
                    int var56 = -1;
                    class173 var57;
                    if (var402 >= 2000) {
                        var402 -= 1000;
                        var5--;
                        var56 = field796[var5];
                        var57 = class173.method691(var56);
                    } else {
                        var57 = var41 ? Statics.field1960 : Statics.field583;
                    }
                    if (var402 == 1000) {
                        var5 -= 4;
                        var57.field2769 = field796[var5];
                        var57.field2770 = field796[var5 + 1];
                        var57.field2765 = field796[var5 + 2];
                        var57.field2867 = field796[var5 + 3];
                        client.method2263(var57);
                        client.method1756(var57);
                        if (var56 != -1 && var57.field2850 == 0) {
                            client.method151(Statics.field2758[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var402 == 1001) {
                        var5 -= 4;
                        var57.field2782 = field796[var5];
                        var57.field2772 = field796[var5 + 1];
                        var57.field2767 = field796[var5 + 2];
                        var57.field2768 = field796[var5 + 3];
                        client.method2263(var57);
                        client.method1756(var57);
                        if (var56 != -1 && var57.field2850 == 0) {
                            client.method151(Statics.field2758[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var402 == 1003) {
                        var5--;
                        boolean var58 = field796[var5] == 1;
                        if (var57.field2795 != var58) {
                            var57.field2795 = var58;
                            client.method2263(var57);
                        }
                        continue;
                    }
                    if (var402 == 1005) {
                        var5--;
                        var57.field2885 = field796[var5] == 1;
                        continue;
                    }
                    if (var402 == 1006) {
                        var5--;
                        var57.field2881 = field796[var5] == 1;
                        continue;
                    }
                } else if (!(var402 < 1100 || var402 >= 1200) || !(var402 < 2100 || var402 >= 2200)) {
                    int var59 = -1;
                    class173 var60;
                    if (var402 >= 2000) {
                        var402 -= 1000;
                        var5--;
                        var59 = field796[var5];
                        var60 = class173.method691(var59);
                    } else {
                        var60 = var41 ? Statics.field1960 : Statics.field583;
                    }
                    if (var402 == 1100) {
                        var5 -= 2;
                        var60.field2830 = field796[var5];
                        if (var60.field2830 > var60.field2783 - var60.field2775) {
                            var60.field2830 = var60.field2783 - var60.field2775;
                        }
                        if (var60.field2830 < 0) {
                            var60.field2830 = 0;
                        }
                        var60.field2887 = field796[var5 + 1];
                        if (var60.field2887 > var60.field2784 - var60.field2891) {
                            var60.field2887 = var60.field2784 - var60.field2891;
                        }
                        if (var60.field2887 < 0) {
                            var60.field2887 = 0;
                        }
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1101) {
                        var5--;
                        var60.field2860 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1102) {
                        var5--;
                        var60.field2789 = field796[var5] == 1;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1103) {
                        var5--;
                        var60.field2754 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1104) {
                        var5--;
                        var60.field2791 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1105) {
                        var5--;
                        var60.field2766 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1106) {
                        var5--;
                        var60.field2762 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1107) {
                        var5--;
                        var60.field2796 = field796[var5] == 1;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1108) {
                        var60.field2801 = 1;
                        var5--;
                        var60.field2858 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1109) {
                        var5 -= 6;
                        var60.field2771 = field796[var5];
                        var60.field2840 = field796[var5 + 1];
                        var60.field2809 = field796[var5 + 2];
                        var60.field2810 = field796[var5 + 3];
                        var60.field2811 = field796[var5 + 4];
                        var60.field2819 = field796[var5 + 5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1110) {
                        var5--;
                        int var61 = field796[var5];
                        if (var60.field2837 != var61) {
                            var60.field2837 = var61;
                            var60.field2817 = 0;
                            var60.field2761 = 0;
                            client.method2263(var60);
                        }
                        continue;
                    }
                    if (var402 == 1111) {
                        var5--;
                        var60.field2802 = field796[var5] == 1;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1112) {
                        var6--;
                        String var62 = field801[var6];
                        if (!var62.equals(var60.field2818)) {
                            var60.field2818 = var62;
                            client.method2263(var60);
                        }
                        continue;
                    }
                    if (var402 == 1113) {
                        var5--;
                        var60.field2874 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1114) {
                        var5 -= 3;
                        var60.field2821 = field796[var5];
                        var60.field2822 = field796[var5 + 1];
                        var60.field2820 = field796[var5 + 2];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1115) {
                        var5--;
                        var60.field2823 = field796[var5] == 1;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1116) {
                        var5--;
                        var60.field2797 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1117) {
                        var5--;
                        var60.field2798 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1118) {
                        var5--;
                        var60.field2799 = field796[var5] == 1;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1119) {
                        var5--;
                        var60.field2800 = field796[var5] == 1;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1120) {
                        var5 -= 2;
                        var60.field2783 = field796[var5];
                        var60.field2784 = field796[var5 + 1];
                        client.method2263(var60);
                        if (var59 != -1 && var60.field2850 == 0) {
                            client.method151(Statics.field2758[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var402 == 1121) {
                        int var63 = var60.field2760;
                        int var64 = var60.field2826;
                        client.field330.method2549(13);
                        client.field330.method2303(var64);
                        client.field330.method2357(var63);
                        client.field453 = var60;
                        client.method2263(var60);
                        continue;
                    }
                    if (var402 == 1122) {
                        var5--;
                        var60.field2794 = field796[var5];
                        client.method2263(var60);
                        continue;
                    }
                } else if (!(var402 < 1200 || var402 >= 1300) || !(var402 < 2200 || var402 >= 2300)) {
                    class173 var65;
                    if (var402 >= 2000) {
                        var402 -= 1000;
                        var5--;
                        var65 = class173.method691(field796[var5]);
                    } else {
                        var65 = var41 ? Statics.field1960 : Statics.field583;
                    }
                    client.method2263(var65);
                    if (var402 == 1200 || var402 == 1205 || var402 == 1212) {
                        var5 -= 2;
                        int var66 = field796[var5];
                        int var67 = field796[var5 + 1];
                        var65.field2878 = var66;
                        var65.field2879 = var67;
                        class52 var68 = class52.method578(var66);
                        var65.field2809 = var68.field1128;
                        var65.field2810 = var68.field1129;
                        var65.field2811 = var68.field1143;
                        var65.field2771 = var68.field1131;
                        var65.field2840 = var68.field1164;
                        var65.field2819 = var68.field1127;
                        if (var402 == 1205) {
                            var65.field2816 = 0;
                        } else if (var402 == 1212 | var68.field1135 == 1) {
                            var65.field2816 = 1;
                        } else {
                            var65.field2816 = 2;
                        }
                        if (var65.field2813 > 0) {
                            var65.field2819 = var65.field2819 * 32 / var65.field2813;
                        } else if (var65.field2782 > 0) {
                            var65.field2819 = var65.field2819 * 32 / var65.field2782;
                        }
                        continue;
                    }
                    if (var402 == 1201) {
                        var65.field2801 = 2;
                        var5--;
                        var65.field2858 = field796[var5];
                        continue;
                    }
                    if (var402 == 1202) {
                        var65.field2801 = 3;
                        var65.field2858 = Statics.field2250.field35.method3228();
                        continue;
                    }
                } else if (var402 >= 1300 && var402 < 1400 || var402 >= 2300 && var402 < 2400) {
                    class173 var69;
                    if (var402 >= 2000) {
                        var402 -= 1000;
                        var5--;
                        var69 = class173.method691(field796[var5]);
                    } else {
                        var69 = var41 ? Statics.field1960 : Statics.field583;
                    }
                    if (var402 == 1300) {
                        var5--;
                        int var70 = field796[var5] - 1;
                        if (var70 >= 0 && var70 <= 9) {
                            var6--;
                            var69.method3161(var70, field801[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var402 == 1301) {
                        var5 -= 2;
                        int var71 = field796[var5];
                        int var72 = field796[var5 + 1];
                        var69.field2844 = class173.method2802(var71, var72);
                        continue;
                    }
                    if (var402 == 1302) {
                        var5--;
                        var69.field2776 = field796[var5] == 1;
                        continue;
                    }
                    if (var402 == 1303) {
                        var5--;
                        var69.field2834 = field796[var5];
                        continue;
                    }
                    if (var402 == 1304) {
                        var5--;
                        var69.field2835 = field796[var5];
                        continue;
                    }
                    if (var402 == 1305) {
                        var6--;
                        var69.field2831 = field801[var6];
                        continue;
                    }
                    if (var402 == 1306) {
                        var6--;
                        var69.field2807 = field801[var6];
                        continue;
                    }
                    if (var402 == 1307) {
                        var69.field2832 = null;
                        continue;
                    }
                } else {
                    if (var402 >= 1400 && var402 < 1500 || var402 >= 2400 && var402 < 2500) {
                        class173 var73;
                        if (var402 >= 2000) {
                            var402 -= 1000;
                            var5--;
                            var73 = class173.method691(field796[var5]);
                        } else {
                            var73 = var41 ? Statics.field1960 : Statics.field583;
                        }
                        var6--;
                        String var74 = field801[var6];
                        int[] var75 = null;
                        if (var74.length() > 0 && var74.charAt(var74.length() - 1) == 'Y') {
                            var5--;
                            int var76 = field796[var5];
                            if (var76 > 0) {
                                var75 = new int[var76];
                                while (var76-- > 0) {
                                    var5--;
                                    var75[var76] = field796[var5];
                                }
                            }
                            var74 = var74.substring(0, var74.length() - 1);
                        }
                        Object[] var77 = new Object[var74.length() + 1];
                        for (int var78 = var77.length - 1; var78 >= 1; var78--) {
                            if (var74.charAt(var78 - 1) == 's') {
                                var6--;
                                var77[var78] = field801[var6];
                            } else {
                                var5--;
                                var77[var78] = Integer.valueOf(field796[var5]);
                            }
                        }
                        var5--;
                        int var79 = field796[var5];
                        if (var79 == -1) {
                            var77 = null;
                        } else {
                            var77[0] = Integer.valueOf(var79);
                        }
                        if (var402 == 1400) {
                            var73.field2756 = var77;
                        }
                        if (var402 == 1401) {
                            var73.field2843 = var77;
                        }
                        if (var402 == 1402) {
                            var73.field2864 = var77;
                        }
                        if (var402 == 1403) {
                            var73.field2808 = var77;
                        }
                        if (var402 == 1404) {
                            var73.field2846 = var77;
                        }
                        if (var402 == 1405) {
                            var73.field2812 = var77;
                        }
                        if (var402 == 1406) {
                            var73.field2815 = var77;
                        }
                        if (var402 == 1407) {
                            var73.field2839 = var77;
                            var73.field2852 = var75;
                        }
                        if (var402 == 1408) {
                            var73.field2857 = var77;
                        }
                        if (var402 == 1409) {
                            var73.field2892 = var77;
                        }
                        if (var402 == 1410) {
                            var73.field2888 = var77;
                        }
                        if (var402 == 1411) {
                            var73.field2841 = var77;
                        }
                        if (var402 == 1412) {
                            var73.field2845 = var77;
                        }
                        if (var402 == 1414) {
                            var73.field2853 = var77;
                            var73.field2752 = var75;
                        }
                        if (var402 == 1415) {
                            var73.field2855 = var77;
                            var73.field2856 = var75;
                        }
                        if (var402 == 1416) {
                            var73.field2793 = var77;
                        }
                        if (var402 == 1417) {
                            var73.field2859 = var77;
                        }
                        if (var402 == 1418) {
                            var73.field2886 = var77;
                        }
                        if (var402 == 1419) {
                            var73.field2861 = var77;
                        }
                        if (var402 == 1420) {
                            var73.field2862 = var77;
                        }
                        if (var402 == 1421) {
                            var73.field2863 = var77;
                        }
                        if (var402 == 1422) {
                            var73.field2829 = var77;
                        }
                        if (var402 == 1423) {
                            var73.field2865 = var77;
                        }
                        if (var402 == 1424) {
                            var73.field2866 = var77;
                        }
                        if (var402 == 1425) {
                            var73.field2868 = var77;
                        }
                        if (var402 == 1426) {
                            var73.field2869 = var77;
                        }
                        if (var402 == 1427) {
                            var73.field2880 = var77;
                        }
                        var73.field2838 = true;
                        continue;
                    }
                    if (var402 < 1600) {
                        class173 var80 = var41 ? Statics.field1960 : Statics.field583;
                        if (var402 == 1500) {
                            field796[var5++] = var80.field2773;
                            continue;
                        }
                        if (var402 == 1501) {
                            field796[var5++] = var80.field2774;
                            continue;
                        }
                        if (var402 == 1502) {
                            field796[var5++] = var80.field2775;
                            continue;
                        }
                        if (var402 == 1503) {
                            field796[var5++] = var80.field2891;
                            continue;
                        }
                        if (var402 == 1504) {
                            field796[var5++] = var80.field2795 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 1505) {
                            field796[var5++] = var80.field2779;
                            continue;
                        }
                    } else if (var402 < 1700) {
                        class173 var81 = var41 ? Statics.field1960 : Statics.field583;
                        if (var402 == 1600) {
                            field796[var5++] = var81.field2830;
                            continue;
                        }
                        if (var402 == 1601) {
                            field796[var5++] = var81.field2887;
                            continue;
                        }
                        if (var402 == 1602) {
                            field801[var6++] = var81.field2818;
                            continue;
                        }
                        if (var402 == 1603) {
                            field796[var5++] = var81.field2783;
                            continue;
                        }
                        if (var402 == 1604) {
                            field796[var5++] = var81.field2784;
                            continue;
                        }
                        if (var402 == 1605) {
                            field796[var5++] = var81.field2819;
                            continue;
                        }
                        if (var402 == 1606) {
                            field796[var5++] = var81.field2809;
                            continue;
                        }
                        if (var402 == 1607) {
                            field796[var5++] = var81.field2811;
                            continue;
                        }
                        if (var402 == 1608) {
                            field796[var5++] = var81.field2810;
                            continue;
                        }
                        if (var402 == 1609) {
                            field796[var5++] = var81.field2754;
                            continue;
                        }
                    } else if (var402 < 1800) {
                        class173 var82 = var41 ? Statics.field1960 : Statics.field583;
                        if (var402 == 1700) {
                            field796[var5++] = var82.field2878;
                            continue;
                        }
                        if (var402 == 1701) {
                            if (var82.field2878 == -1) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var82.field2879;
                            }
                            continue;
                        }
                        if (var402 == 1702) {
                            field796[var5++] = var82.field2826;
                            continue;
                        }
                    } else if (var402 < 1900) {
                        class173 var83 = var41 ? Statics.field1960 : Statics.field583;
                        if (var402 == 1800) {
                            field796[var5++] = class178.method2914(client.method883(var83));
                            continue;
                        }
                        if (var402 == 1801) {
                            var5--;
                            int var84 = field796[var5];
                            int var403 = var84 - 1;
                            if (var83.field2832 != null && var403 < var83.field2832.length && var83.field2832[var403] != null) {
                                field801[var6++] = var83.field2832[var403];
                                continue;
                            }
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 1802) {
                            if (var83.field2831 == null) {
                                field801[var6++] = "";
                            } else {
                                field801[var6++] = var83.field2831;
                            }
                            continue;
                        }
                    } else if (!(var402 < 1900 || var402 >= 2000) || !(var402 < 2900 || var402 >= 3000)) {
                        class173 var85;
                        if (var402 >= 2000) {
                            var402 -= 1000;
                            var5--;
                            var85 = class173.method691(field796[var5]);
                        } else {
                            var85 = var41 ? Statics.field1960 : Statics.field583;
                        }
                        if (var402 == 1927) {
                            if (field806 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var85.field2880 == null) {
                                return;
                            }
                            class1 var86 = new class1();
                            var86.field3 = var85;
                            var86.field6 = var85.field2880;
                            var86.field1 = field806 + 1;
                            client.field466.method3523(arg0);
                            continue;
                        }
                    } else if (var402 < 2600) {
                        var5--;
                        class173 var87 = class173.method691(field796[var5]);
                        if (var402 == 2500) {
                            field796[var5++] = var87.field2773;
                            continue;
                        }
                        if (var402 == 2501) {
                            field796[var5++] = var87.field2774;
                            continue;
                        }
                        if (var402 == 2502) {
                            field796[var5++] = var87.field2775;
                            continue;
                        }
                        if (var402 == 2503) {
                            field796[var5++] = var87.field2891;
                            continue;
                        }
                        if (var402 == 2504) {
                            field796[var5++] = var87.field2795 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 2505) {
                            field796[var5++] = var87.field2779;
                            continue;
                        }
                    } else if (var402 < 2700) {
                        var5--;
                        class173 var88 = class173.method691(field796[var5]);
                        if (var402 == 2600) {
                            field796[var5++] = var88.field2830;
                            continue;
                        }
                        if (var402 == 2601) {
                            field796[var5++] = var88.field2887;
                            continue;
                        }
                        if (var402 == 2602) {
                            field801[var6++] = var88.field2818;
                            continue;
                        }
                        if (var402 == 2603) {
                            field796[var5++] = var88.field2783;
                            continue;
                        }
                        if (var402 == 2604) {
                            field796[var5++] = var88.field2784;
                            continue;
                        }
                        if (var402 == 2605) {
                            field796[var5++] = var88.field2819;
                            continue;
                        }
                        if (var402 == 2606) {
                            field796[var5++] = var88.field2809;
                            continue;
                        }
                        if (var402 == 2607) {
                            field796[var5++] = var88.field2811;
                            continue;
                        }
                        if (var402 == 2608) {
                            field796[var5++] = var88.field2810;
                            continue;
                        }
                        if (var402 == 2609) {
                            field796[var5++] = var88.field2754;
                            continue;
                        }
                    } else if (var402 < 2800) {
                        if (var402 == 2700) {
                            var5--;
                            class173 var89 = class173.method691(field796[var5]);
                            field796[var5++] = var89.field2878;
                            continue;
                        }
                        if (var402 == 2701) {
                            var5--;
                            class173 var90 = class173.method691(field796[var5]);
                            if (var90.field2878 == -1) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var90.field2879;
                            }
                            continue;
                        }
                        if (var402 == 2702) {
                            var5--;
                            int var91 = field796[var5];
                            class4 var92 = (class4) client.field450.method3499((long) var91);
                            if (var92 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = 1;
                            }
                            continue;
                        }
                        if (var402 == 2706) {
                            field796[var5++] = client.field449;
                            continue;
                        }
                    } else if (var402 < 2900) {
                        var5--;
                        class173 var93 = class173.method691(field796[var5]);
                        if (var402 == 2800) {
                            field796[var5++] = class178.method2914(client.method883(var93));
                            continue;
                        }
                        if (var402 == 2801) {
                            var5--;
                            int var94 = field796[var5];
                            int var404 = var94 - 1;
                            if (var93.field2832 != null && var404 < var93.field2832.length && var93.field2832[var404] != null) {
                                field801[var6++] = var93.field2832[var404];
                                continue;
                            }
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 2802) {
                            if (var93.field2831 == null) {
                                field801[var6++] = "";
                            } else {
                                field801[var6++] = var93.field2831;
                            }
                            continue;
                        }
                    } else if (var402 < 3200) {
                        if (var402 == 3100) {
                            var6--;
                            String var95 = field801[var6];
                            class12.method183(0, "", var95);
                            continue;
                        }
                        if (var402 == 3101) {
                            var5 -= 2;
                            client.method161(Statics.field2250, field796[var5], field796[var5 + 1]);
                            continue;
                        }
                        if (var402 == 3103) {
                            Statics.method1755();
                            continue;
                        }
                        if (var402 == 3104) {
                            var6--;
                            String var96 = field801[var6];
                            int var97 = 0;
                            boolean var98 = false;
                            boolean var99 = false;
                            int var100 = 0;
                            int var101 = var96.length();
                            int var102 = 0;
                            boolean var104;
                            while (true) {
                                if (var102 >= var101) {
                                    var104 = var99;
                                    break;
                                }
                                label3035: {
                                    char var103 = var96.charAt(var102);
                                    if (var102 == 0) {
                                        if (var103 == '-') {
                                            var98 = true;
                                            break label3035;
                                        }
                                        if (var103 == '+') {
                                            break label3035;
                                        }
                                    }
                                    int var405;
                                    if (var103 >= '0' && var103 <= '9') {
                                        var405 = var103 - '0';
                                    } else if (var103 >= 'A' && var103 <= 'Z') {
                                        var405 = var103 - '7';
                                    } else {
                                        if (var103 < 'a' || var103 > 'z') {
                                            var104 = false;
                                            break;
                                        }
                                        var405 = var103 - 'W';
                                    }
                                    if (var405 >= 10) {
                                        var104 = false;
                                        break;
                                    }
                                    if (var98) {
                                        var405 = -var405;
                                    }
                                    int var105 = var100 * 10 + var405;
                                    if (var105 / 10 != var100) {
                                        var104 = false;
                                        break;
                                    }
                                    var100 = var105;
                                    var99 = true;
                                }
                                var102++;
                            }
                            if (var104) {
                                var97 = class163.method2207(var96);
                            }
                            client.field330.method2549(34);
                            client.field330.method2304(var97);
                            continue;
                        }
                        if (var402 == 3105) {
                            var6--;
                            String var107 = field801[var6];
                            client.field330.method2549(221);
                            client.field330.method2301(var107.length() + 1);
                            client.field330.method2307(var107);
                            continue;
                        }
                        if (var402 == 3106) {
                            var6--;
                            String var108 = field801[var6];
                            client.field330.method2549(118);
                            client.field330.method2301(var108.length() + 1);
                            client.field330.method2307(var108);
                            continue;
                        }
                        if (var402 == 3107) {
                            var5--;
                            int var109 = field796[var5];
                            var6--;
                            String var110 = field801[var6];
                            int var111 = class33.field750;
                            int[] var112 = class33.field756;
                            boolean var113 = false;
                            for (int var114 = 0; var114 < var111; var114++) {
                                class3 var115 = client.field411[var112[var114]];
                                if (var115 != null && Statics.field2250 != var115 && var115.field49 != null && var115.field49.equalsIgnoreCase(var110)) {
                                    if (var109 == 1) {
                                        client.field330.method2549(28);
                                        client.field330.method2485(0);
                                        client.field330.method2347(var112[var114]);
                                    } else if (var109 == 4) {
                                        client.field330.method2549(144);
                                        client.field330.method2347(var112[var114]);
                                        client.field330.method2340(0);
                                    } else if (var109 == 6) {
                                        client.field330.method2549(158);
                                        client.field330.method2303(var112[var114]);
                                        client.field330.method2339(0);
                                    } else if (var109 == 7) {
                                        client.field330.method2549(9);
                                        client.field330.method2339(0);
                                        client.field330.method2427(var112[var114]);
                                    }
                                    var113 = true;
                                    break;
                                }
                            }
                            if (!var113) {
                                class12.method183(4, "", class157.field2464 + var110);
                            }
                            continue;
                        }
                        if (var402 == 3108) {
                            var5 -= 3;
                            int var116 = field796[var5];
                            int var117 = field796[var5 + 1];
                            int var118 = field796[var5 + 2];
                            class173 var119 = class173.method691(var118);
                            client.method992(var119, var116, var117);
                            continue;
                        }
                        if (var402 == 3109) {
                            var5 -= 2;
                            int var120 = field796[var5];
                            int var121 = field796[var5 + 1];
                            class173 var122 = var41 ? Statics.field1960 : Statics.field583;
                            client.method992(var122, var120, var121);
                            continue;
                        }
                        if (var402 == 3110) {
                            var5--;
                            Statics.field1618 = field796[var5] == 1;
                            continue;
                        }
                        if (var402 == 3111) {
                            field796[var5++] = Statics.field170.field143 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3112) {
                            var5--;
                            Statics.field170.field143 = field796[var5] == 1;
                            class9.method36();
                            continue;
                        }
                        if (var402 == 3113) {
                            var6--;
                            String var123 = field801[var6];
                            var5--;
                            boolean var124 = field796[var5] == 1;
                            class138.method2982(var123, var124, false);
                            continue;
                        }
                        if (var402 == 3115) {
                            var5--;
                            int var125 = field796[var5];
                            client.field330.method2549(134);
                            client.field330.method2404(var125);
                            continue;
                        }
                        if (var402 == 3116) {
                            var5--;
                            int var126 = field796[var5];
                            var6 -= 2;
                            String var127 = field801[var6];
                            String var128 = field801[var6 + 1];
                            if (var127.length() <= 500 && var128.length() <= 500) {
                                client.field330.method2549(44);
                                client.field330.method2404(1 + class119.method730(var127) + class119.method730(var128));
                                client.field330.method2339(var126);
                                client.field330.method2307(var127);
                                client.field330.method2307(var128);
                            }
                            continue;
                        }
                    } else if (var402 < 3300) {
                        if (var402 == 3200) {
                            var5 -= 3;
                            client.method746(field796[var5], field796[var5 + 1], field796[var5 + 2]);
                            continue;
                        }
                        if (var402 == 3201) {
                            var5--;
                            client.method187(field796[var5]);
                            continue;
                        }
                        if (var402 == 3202) {
                            var5 -= 2;
                            int var129 = field796[var5];
                            int var10000 = field796[var5 + 1];
                            if (client.field526 != 0 && var129 != -1) {
                                class183.method2247(Statics.field1670, var129, 0, client.field526, false);
                                client.field528 = true;
                            }
                            continue;
                        }
                    } else if (var402 < 3400) {
                        if (var402 == 3300) {
                            field796[var5++] = client.field395;
                            continue;
                        }
                        if (var402 == 3301) {
                            var5 -= 2;
                            int var131 = field796[var5];
                            int var132 = field796[var5 + 1];
                            field796[var5++] = class16.method93(var131, var132);
                            continue;
                        }
                        if (var402 == 3302) {
                            var5 -= 2;
                            int var133 = field796[var5];
                            int var134 = field796[var5 + 1];
                            field796[var5++] = class16.method78(var133, var134);
                            continue;
                        }
                        if (var402 == 3303) {
                            var5 -= 2;
                            int var135 = field796[var5];
                            int var136 = field796[var5 + 1];
                            field796[var5++] = class16.method150(var135, var136);
                            continue;
                        }
                        if (var402 == 3304) {
                            var5--;
                            int var137 = field796[var5];
                            int[] var138 = field796;
                            int var139 = var5++;
                            class51 var140 = (class51) class51.field1109.method3466((long) var137);
                            class51 var141;
                            if (var140 == null) {
                                byte[] var142 = Statics.field1108.method3005(5, var137);
                                class51 var143 = new class51();
                                if (var142 != null) {
                                    var143.method995(new class119(var142));
                                }
                                class51.field1109.method3468(var143, (long) var137);
                                var141 = var143;
                            } else {
                                var141 = var140;
                            }
                            var138[var139] = var141.field1101;
                            continue;
                        }
                        if (var402 == 3305) {
                            var5--;
                            int var144 = field796[var5];
                            field796[var5++] = client.field425[var144];
                            continue;
                        }
                        if (var402 == 3306) {
                            var5--;
                            int var145 = field796[var5];
                            field796[var5++] = client.field426[var145];
                            continue;
                        }
                        if (var402 == 3307) {
                            var5--;
                            int var146 = field796[var5];
                            field796[var5++] = client.field427[var146];
                            continue;
                        }
                        if (var402 == 3308) {
                            int var147 = Statics.field1387;
                            int var148 = (Statics.field2250.field840 >> 7) + Statics.field1684;
                            int var149 = (Statics.field2250.field849 >> 7) + Statics.field1599;
                            field796[var5++] = (var147 << 28) + (var148 << 14) + var149;
                            continue;
                        }
                        if (var402 == 3309) {
                            var5--;
                            int var150 = field796[var5];
                            field796[var5++] = var150 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var402 == 3310) {
                            var5--;
                            int var151 = field796[var5];
                            field796[var5++] = var151 >> 28;
                            continue;
                        }
                        if (var402 == 3311) {
                            var5--;
                            int var152 = field796[var5];
                            field796[var5++] = var152 & 0x3FFF;
                            continue;
                        }
                        if (var402 == 3312) {
                            field796[var5++] = client.field292 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3313) {
                            var5 -= 2;
                            int var153 = field796[var5] + 32768;
                            int var154 = field796[var5 + 1];
                            field796[var5++] = class16.method93(var153, var154);
                            continue;
                        }
                        if (var402 == 3314) {
                            var5 -= 2;
                            int var155 = field796[var5] + 32768;
                            int var156 = field796[var5 + 1];
                            field796[var5++] = class16.method78(var155, var156);
                            continue;
                        }
                        if (var402 == 3315) {
                            var5 -= 2;
                            int var157 = field796[var5] + 32768;
                            int var158 = field796[var5 + 1];
                            field796[var5++] = class16.method150(var157, var158);
                            continue;
                        }
                        if (var402 == 3316) {
                            if (client.field456 >= 2) {
                                field796[var5++] = client.field456;
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                        if (var402 == 3317) {
                            field796[var5++] = client.field291;
                            continue;
                        }
                        if (var402 == 3318) {
                            field796[var5++] = client.field287;
                            continue;
                        }
                        if (var402 == 3321) {
                            field796[var5++] = client.field336;
                            continue;
                        }
                        if (var402 == 3322) {
                            field796[var5++] = client.field455;
                            continue;
                        }
                        if (var402 == 3323) {
                            if (client.field521) {
                                field796[var5++] = 1;
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                        if (var402 == 3324) {
                            field796[var5++] = client.field288;
                            continue;
                        }
                    } else if (var402 < 3500) {
                        if (var402 == 3400) {
                            var5 -= 2;
                            int var159 = field796[var5];
                            int var160 = field796[var5 + 1];
                            class49 var161 = (class49) class49.field1078.method3466((long) var159);
                            class49 var162;
                            if (var161 == null) {
                                byte[] var163 = Statics.field1084.method3005(8, var159);
                                class49 var164 = new class49();
                                if (var163 != null) {
                                    var164.method970(new class119(var163));
                                }
                                class49.field1078.method3468(var164, (long) var159);
                                var162 = var164;
                            } else {
                                var162 = var161;
                            }
                            class49 var165 = var162;
                            if (var162.field1087 != 's') {
                            }
                            for (int var166 = 0; var166 < var165.field1083; var166++) {
                                if (var165.field1080[var166] == var160) {
                                    field801[var6++] = var165.field1086[var166];
                                    var165 = null;
                                    break;
                                }
                            }
                            if (var165 != null) {
                                field801[var6++] = var165.field1081;
                            }
                            continue;
                        }
                        if (var402 == 3408) {
                            var5 -= 4;
                            int var167 = field796[var5];
                            int var168 = field796[var5 + 1];
                            int var169 = field796[var5 + 2];
                            int var170 = field796[var5 + 3];
                            class49 var171 = (class49) class49.field1078.method3466((long) var169);
                            class49 var172;
                            if (var171 == null) {
                                byte[] var173 = Statics.field1084.method3005(8, var169);
                                class49 var174 = new class49();
                                if (var173 != null) {
                                    var174.method970(new class119(var173));
                                }
                                class49.field1078.method3468(var174, (long) var169);
                                var172 = var174;
                            } else {
                                var172 = var171;
                            }
                            class49 var175 = var172;
                            if (var172.field1079 == var167 && var172.field1087 == var168) {
                                for (int var176 = 0; var176 < var175.field1083; var176++) {
                                    if (var175.field1080[var176] == var170) {
                                        if (var168 == 115) {
                                            field801[var6++] = var175.field1086[var176];
                                        } else {
                                            field796[var5++] = var175.field1077[var176];
                                        }
                                        var175 = null;
                                        break;
                                    }
                                }
                                if (var175 != null) {
                                    if (var168 == 115) {
                                        field801[var6++] = var175.field1081;
                                    } else {
                                        field796[var5++] = var175.field1082;
                                    }
                                }
                                continue;
                            }
                            if (var168 == 115) {
                                field801[var6++] = "null";
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var402 < 3700) {
                        if (var402 == 3600) {
                            if (client.field387 == 0) {
                                field796[var5++] = -2;
                            } else if (client.field387 == 1) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = client.field422;
                            }
                            continue;
                        }
                        if (var402 == 3601) {
                            var5--;
                            int var177 = field796[var5];
                            if (client.field387 == 2 && var177 < client.field422) {
                                field801[var6++] = client.field558[var177].field254;
                                field801[var6++] = client.field558[var177].field248;
                                continue;
                            }
                            field801[var6++] = "";
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 3602) {
                            var5--;
                            int var178 = field796[var5];
                            if (client.field387 == 2 && var178 < client.field422) {
                                field796[var5++] = client.field558[var178].field249;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var402 == 3603) {
                            var5--;
                            int var179 = field796[var5];
                            if (client.field387 == 2 && var179 < client.field422) {
                                field796[var5++] = client.field558[var179].field250;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var402 == 3604) {
                            var6--;
                            String var180 = field801[var6];
                            var5--;
                            int var181 = field796[var5];
                            client.method2663(var180, var181);
                            continue;
                        }
                        if (var402 == 3605) {
                            var6--;
                            String var182 = field801[var6];
                            client.method2206(var182);
                            continue;
                        }
                        if (var402 == 3606) {
                            var6--;
                            String var183 = field801[var6];
                            client.method2771(var183);
                            continue;
                        }
                        if (var402 == 3607) {
                            var6--;
                            String var184 = field801[var6];
                            client.method786(var184, false);
                            continue;
                        }
                        if (var402 == 3608) {
                            var6--;
                            String var185 = field801[var6];
                            client.method1752(var185);
                            continue;
                        }
                        if (var402 == 3609) {
                            var6--;
                            String var186 = field801[var6];
                            class152[] var187 = class152.method3197();
                            for (int var188 = 0; var188 < var187.length; var188++) {
                                class152 var189 = var187[var188];
                                if (var189.field2277 != -1 && var186.startsWith(class2.method195(var189.field2277))) {
                                    var186 = var186.substring(6 + Integer.toString(var189.field2277).length());
                                    break;
                                }
                            }
                            field796[var5++] = client.method2647(var186, false) ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3611) {
                            if (client.field516 == null) {
                                field801[var6++] = "";
                            } else {
                                field801[var6++] = class162.method2803(client.field516);
                            }
                            continue;
                        }
                        if (var402 == 3612) {
                            if (client.field516 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = Statics.field164;
                            }
                            continue;
                        }
                        if (var402 == 3613) {
                            var5--;
                            int var190 = field796[var5];
                            if (client.field516 != null && var190 < Statics.field164) {
                                field801[var6++] = Statics.field2104[var190].field627;
                                continue;
                            }
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 3614) {
                            var5--;
                            int var191 = field796[var5];
                            if (client.field516 != null && var191 < Statics.field164) {
                                field796[var5++] = Statics.field2104[var191].field621;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var402 == 3615) {
                            var5--;
                            int var192 = field796[var5];
                            if (client.field516 != null && var192 < Statics.field164) {
                                field796[var5++] = Statics.field2104[var192].field623;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var402 == 3616) {
                            field796[var5++] = Statics.field572;
                            continue;
                        }
                        if (var402 == 3617) {
                            var6--;
                            String var193 = field801[var6];
                            if (Statics.field2104 != null) {
                                client.field330.method2549(110);
                                client.field330.method2301(class119.method730(var193));
                                client.field330.method2307(var193);
                            }
                            continue;
                        }
                        if (var402 == 3618) {
                            field796[var5++] = Statics.field2654;
                            continue;
                        }
                        if (var402 == 3619) {
                            var6--;
                            String var194 = field801[var6];
                            client.method3459(var194);
                            continue;
                        }
                        if (var402 == 3620) {
                            client.field330.method2549(20);
                            client.field330.method2301(0);
                            continue;
                        }
                        if (var402 == 3621) {
                            if (client.field387 == 0) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = client.field560;
                            }
                            continue;
                        }
                        if (var402 == 3622) {
                            var5--;
                            int var195 = field796[var5];
                            if (client.field387 != 0 && var195 < client.field560) {
                                field801[var6++] = client.field561[var195].field140;
                                field801[var6++] = client.field561[var195].field137;
                                continue;
                            }
                            field801[var6++] = "";
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 3623) {
                            String var196;
                            label2564: {
                                var6--;
                                var196 = field801[var6];
                                String var198 = "<img=0>";
                                if (!var196.startsWith(var198)) {
                                    String var200 = "<img=1>";
                                    if (!var196.startsWith(var200)) {
                                        break label2564;
                                    }
                                }
                                var196 = var196.substring(7);
                            }
                            field796[var5++] = client.method191(var196) ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3624) {
                            var5--;
                            int var201 = field796[var5];
                            if (Statics.field2104 != null && var201 < Statics.field164 && Statics.field2104[var201].field627.equalsIgnoreCase(Statics.field2250.field49)) {
                                field796[var5++] = 1;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var402 == 3625) {
                            if (client.field517 == null) {
                                field801[var6++] = "";
                            } else {
                                field801[var6++] = class162.method2803(client.field517);
                            }
                            continue;
                        }
                    } else if (var402 < 4000) {
                        if (var402 == 3903) {
                            var5--;
                            int var202 = field796[var5];
                            field796[var5++] = client.field565[var202].method3684();
                            continue;
                        }
                        if (var402 == 3904) {
                            var5--;
                            int var203 = field796[var5];
                            field796[var5++] = client.field565[var203].field3166;
                            continue;
                        }
                        if (var402 == 3905) {
                            var5--;
                            int var204 = field796[var5];
                            field796[var5++] = client.field565[var204].field3170;
                            continue;
                        }
                        if (var402 == 3906) {
                            var5--;
                            int var205 = field796[var5];
                            field796[var5++] = client.field565[var205].field3168;
                            continue;
                        }
                        if (var402 == 3907) {
                            var5--;
                            int var206 = field796[var5];
                            field796[var5++] = client.field565[var206].field3169;
                            continue;
                        }
                        if (var402 == 3908) {
                            var5--;
                            int var207 = field796[var5];
                            field796[var5++] = client.field565[var207].field3165;
                            continue;
                        }
                        if (var402 == 3910) {
                            var5--;
                            int var208 = field796[var5];
                            int var209 = client.field565[var208].method3690();
                            field796[var5++] = var209 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3911) {
                            var5--;
                            int var210 = field796[var5];
                            int var211 = client.field565[var210].method3690();
                            field796[var5++] = var211 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3912) {
                            var5--;
                            int var212 = field796[var5];
                            int var213 = client.field565[var212].method3690();
                            field796[var5++] = var213 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3913) {
                            var5--;
                            int var214 = field796[var5];
                            int var215 = client.field565[var214].method3690();
                            field796[var5++] = var215 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 3914) {
                            var5--;
                            boolean var216 = field796[var5] == 1;
                            if (Statics.field761 != null) {
                                Statics.field761.method3700(class221.field3174, var216);
                            }
                            continue;
                        }
                        if (var402 == 3915) {
                            var5--;
                            boolean var217 = field796[var5] == 1;
                            if (Statics.field761 != null) {
                                Statics.field761.method3700(class221.field3172, var217);
                            }
                            continue;
                        }
                        if (var402 == 3916) {
                            var5 -= 2;
                            boolean var218 = field796[var5] == 1;
                            boolean var219 = field796[var5 + 1] == 1;
                            if (Statics.field761 != null) {
                                Statics.field761.method3700(new class22(var219), var218);
                            }
                            continue;
                        }
                        if (var402 == 3917) {
                            var5--;
                            boolean var220 = field796[var5] == 1;
                            if (Statics.field761 != null) {
                                Statics.field761.method3700(class221.field3173, var220);
                            }
                            continue;
                        }
                        if (var402 == 3918) {
                            var5--;
                            boolean var221 = field796[var5] == 1;
                            if (Statics.field761 != null) {
                                Statics.field761.method3700(class221.field3175, var221);
                            }
                            continue;
                        }
                        if (var402 == 3919) {
                            field796[var5++] = Statics.field761 == null ? 0 : Statics.field761.field3171.size();
                            continue;
                        }
                        if (var402 == 3920) {
                            var5--;
                            int var222 = field796[var5];
                            class214 var223 = (class214) Statics.field761.field3171.get(var222);
                            field796[var5++] = var223.field3148;
                            continue;
                        }
                        if (var402 == 3921) {
                            var5--;
                            int var224 = field796[var5];
                            class214 var225 = (class214) Statics.field761.field3171.get(var224);
                            field801[var6++] = var225.method3637();
                            continue;
                        }
                        if (var402 == 3922) {
                            var5--;
                            int var226 = field796[var5];
                            class214 var227 = (class214) Statics.field761.field3171.get(var226);
                            field801[var6++] = var227.method3638();
                            continue;
                        }
                        if (var402 == 3923) {
                            var5--;
                            int var228 = field796[var5];
                            class214 var229 = (class214) Statics.field761.field3171.get(var228);
                            long var230 = class115.method2249() - Statics.field80 - var229.field3144;
                            int var232 = (int) (var230 / 3600000L);
                            int var233 = (int) ((var230 - (long) (var232 * 3600000)) / 60000L);
                            int var234 = (int) ((var230 - (long) (var232 * 3600000) - (long) (var233 * 60000)) / 1000L);
                            String var235 = var232 + ":" + var233 / 10 + var233 % 10 + ":" + var234 / 10 + var234 % 10;
                            field801[var6++] = var235;
                            continue;
                        }
                        if (var402 == 3924) {
                            var5--;
                            int var236 = field796[var5];
                            class214 var237 = (class214) Statics.field761.field3171.get(var236);
                            field796[var5++] = var237.field3143.field3168;
                            continue;
                        }
                        if (var402 == 3925) {
                            var5--;
                            int var238 = field796[var5];
                            class214 var239 = (class214) Statics.field761.field3171.get(var238);
                            field796[var5++] = var239.field3143.field3170;
                            continue;
                        }
                        if (var402 == 3926) {
                            var5--;
                            int var240 = field796[var5];
                            class214 var241 = (class214) Statics.field761.field3171.get(var240);
                            field796[var5++] = var241.field3143.field3166;
                            continue;
                        }
                    } else if (var402 < 4100) {
                        if (var402 == 4000) {
                            var5 -= 2;
                            int var242 = field796[var5];
                            int var243 = field796[var5 + 1];
                            field796[var5++] = var242 + var243;
                            continue;
                        }
                        if (var402 == 4001) {
                            var5 -= 2;
                            int var244 = field796[var5];
                            int var245 = field796[var5 + 1];
                            field796[var5++] = var244 - var245;
                            continue;
                        }
                        if (var402 == 4002) {
                            var5 -= 2;
                            int var246 = field796[var5];
                            int var247 = field796[var5 + 1];
                            field796[var5++] = var246 * var247;
                            continue;
                        }
                        if (var402 == 4003) {
                            var5 -= 2;
                            int var248 = field796[var5];
                            int var249 = field796[var5 + 1];
                            field796[var5++] = var248 / var249;
                            continue;
                        }
                        if (var402 == 4004) {
                            var5--;
                            int var250 = field796[var5];
                            field796[var5++] = (int) (Math.random() * (double) var250);
                            continue;
                        }
                        if (var402 == 4005) {
                            var5--;
                            int var251 = field796[var5];
                            field796[var5++] = (int) (Math.random() * (double) (var251 + 1));
                            continue;
                        }
                        if (var402 == 4006) {
                            var5 -= 5;
                            int var252 = field796[var5];
                            int var253 = field796[var5 + 1];
                            int var254 = field796[var5 + 2];
                            int var255 = field796[var5 + 3];
                            int var256 = field796[var5 + 4];
                            field796[var5++] = (var253 - var252) * (var256 - var254) / (var255 - var254) + var252;
                            continue;
                        }
                        if (var402 == 4007) {
                            var5 -= 2;
                            int var257 = field796[var5];
                            int var258 = field796[var5 + 1];
                            field796[var5++] = var257 * var258 / 100 + var257;
                            continue;
                        }
                        if (var402 == 4008) {
                            var5 -= 2;
                            int var259 = field796[var5];
                            int var260 = field796[var5 + 1];
                            field796[var5++] = var259 | 0x1 << var260;
                            continue;
                        }
                        if (var402 == 4009) {
                            var5 -= 2;
                            int var261 = field796[var5];
                            int var262 = field796[var5 + 1];
                            field796[var5++] = var261 & -1 - (0x1 << var262);
                            continue;
                        }
                        if (var402 == 4010) {
                            var5 -= 2;
                            int var263 = field796[var5];
                            int var264 = field796[var5 + 1];
                            field796[var5++] = (var263 & 0x1 << var264) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var402 == 4011) {
                            var5 -= 2;
                            int var265 = field796[var5];
                            int var266 = field796[var5 + 1];
                            field796[var5++] = var265 % var266;
                            continue;
                        }
                        if (var402 == 4012) {
                            var5 -= 2;
                            int var267 = field796[var5];
                            int var268 = field796[var5 + 1];
                            if (var267 == 0) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = (int) Math.pow((double) var267, (double) var268);
                            }
                            continue;
                        }
                        if (var402 == 4013) {
                            var5 -= 2;
                            int var269 = field796[var5];
                            int var270 = field796[var5 + 1];
                            if (var269 == 0) {
                                field796[var5++] = 0;
                            } else if (var270 == 0) {
                                field796[var5++] = Integer.MAX_VALUE;
                            } else {
                                field796[var5++] = (int) Math.pow((double) var269, 1.0D / (double) var270);
                            }
                            continue;
                        }
                        if (var402 == 4014) {
                            var5 -= 2;
                            int var271 = field796[var5];
                            int var272 = field796[var5 + 1];
                            field796[var5++] = var271 & var272;
                            continue;
                        }
                        if (var402 == 4015) {
                            var5 -= 2;
                            int var273 = field796[var5];
                            int var274 = field796[var5 + 1];
                            field796[var5++] = var273 | var274;
                            continue;
                        }
                    } else if (var402 < 4200) {
                        if (var402 == 4100) {
                            var6--;
                            String var275 = field801[var6];
                            var5--;
                            int var276 = field796[var5];
                            field801[var6++] = var275 + var276;
                            continue;
                        }
                        if (var402 == 4101) {
                            var6 -= 2;
                            String var277 = field801[var6];
                            String var278 = field801[var6 + 1];
                            field801[var6++] = var277 + var278;
                            continue;
                        }
                        if (var402 == 4102) {
                            var6--;
                            String var279 = field801[var6];
                            var5--;
                            int var280 = field796[var5];
                            String[] var281 = field801;
                            int var282 = var6++;
                            String var284;
                            if (var280 < 0) {
                                var284 = Integer.toString(var280);
                            } else {
                                int var285 = var280;
                                String var286;
                                if (var280 < 0) {
                                    var286 = Integer.toString(var280, 10);
                                } else {
                                    int var287 = 2;
                                    int var288 = var280 / 10;
                                    while (var288 != 0) {
                                        var288 /= 10;
                                        var287++;
                                    }
                                    char[] var289 = new char[var287];
                                    var289[0] = '+';
                                    for (int var290 = var287 - 1; var290 > 0; var290--) {
                                        int var291 = var285;
                                        var285 /= 10;
                                        int var292 = var291 - var285 * 10;
                                        if (var292 >= 10) {
                                            var289[var290] = (char) (var292 + 87);
                                        } else {
                                            var289[var290] = (char) (var292 + 48);
                                        }
                                    }
                                    var286 = new String(var289);
                                }
                                var284 = var286;
                            }
                            var281[var282] = var279 + var284;
                            continue;
                        }
                        if (var402 == 4103) {
                            var6--;
                            String var293 = field801[var6];
                            field801[var6++] = var293.toLowerCase();
                            continue;
                        }
                        if (var402 == 4104) {
                            var5--;
                            int var294 = field796[var5];
                            long var295 = ((long) var294 + 11745L) * 86400000L;
                            field804.setTime(new Date(var295));
                            int var297 = field804.get(5);
                            int var298 = field804.get(2);
                            int var299 = field804.get(1);
                            field801[var6++] = var297 + "-" + field805[var298] + "-" + var299;
                            continue;
                        }
                        if (var402 == 4105) {
                            var6 -= 2;
                            String var300 = field801[var6];
                            String var301 = field801[var6 + 1];
                            if (Statics.field2250.field35 != null && Statics.field2250.field35.field2923) {
                                field801[var6++] = var301;
                                continue;
                            }
                            field801[var6++] = var300;
                            continue;
                        }
                        if (var402 == 4106) {
                            var5--;
                            int var302 = field796[var5];
                            field801[var6++] = Integer.toString(var302);
                            continue;
                        }
                        if (var402 == 4107) {
                            var6 -= 2;
                            field796[var5++] = class163.method4(class166.method190(field801[var6], field801[var6 + 1], client.field473));
                            continue;
                        }
                        if (var402 == 4108) {
                            var6--;
                            String var303 = field801[var6];
                            var5 -= 2;
                            int var304 = field796[var5];
                            int var305 = field796[var5 + 1];
                            byte[] var306 = Statics.field2959.method3005(var305, 0);
                            class224 var307 = new class224(var306);
                            field796[var5++] = var307.method3720(var303, var304);
                            continue;
                        }
                        if (var402 == 4109) {
                            var6--;
                            String var308 = field801[var6];
                            var5 -= 2;
                            int var309 = field796[var5];
                            int var310 = field796[var5 + 1];
                            byte[] var311 = Statics.field2959.method3005(var310, 0);
                            class224 var312 = new class224(var311);
                            field796[var5++] = var312.method3719(var308, var309);
                            continue;
                        }
                        if (var402 == 4110) {
                            var6 -= 2;
                            String var313 = field801[var6];
                            String var314 = field801[var6 + 1];
                            var5--;
                            if (field796[var5] == 1) {
                                field801[var6++] = var313;
                            } else {
                                field801[var6++] = var314;
                            }
                            continue;
                        }
                        if (var402 == 4111) {
                            var6--;
                            String var315 = field801[var6];
                            field801[var6++] = class223.method3721(var315);
                            continue;
                        }
                        if (var402 == 4112) {
                            var6--;
                            String var316 = field801[var6];
                            var5--;
                            int var317 = field796[var5];
                            field801[var6++] = var316 + (char) var317;
                            continue;
                        }
                        if (var402 == 4113) {
                            var5--;
                            int var318 = field796[var5];
                            field796[var5++] = class163.method156((char) var318) ? 1 : 0;
                            continue;
                        }
                        if (var402 == 4114) {
                            var5--;
                            int var319 = field796[var5];
                            field796[var5++] = class163.method2117((char) var319) ? 1 : 0;
                            continue;
                        }
                        if (var402 == 4115) {
                            var5--;
                            int var320 = field796[var5];
                            field796[var5++] = class163.method2891((char) var320) ? 1 : 0;
                            continue;
                        }
                        if (var402 == 4116) {
                            var5--;
                            int var321 = field796[var5];
                            field796[var5++] = class163.method965((char) var321) ? 1 : 0;
                            continue;
                        }
                        if (var402 == 4117) {
                            var6--;
                            String var322 = field801[var6];
                            if (var322 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var322.length();
                            }
                            continue;
                        }
                        if (var402 == 4118) {
                            var6--;
                            String var323 = field801[var6];
                            var5 -= 2;
                            int var324 = field796[var5];
                            int var325 = field796[var5 + 1];
                            field801[var6++] = var323.substring(var324, var325);
                            continue;
                        }
                        if (var402 == 4119) {
                            var6--;
                            String var326 = field801[var6];
                            StringBuilder var327 = new StringBuilder(var326.length());
                            boolean var328 = false;
                            for (int var329 = 0; var329 < var326.length(); var329++) {
                                char var330 = var326.charAt(var329);
                                if (var330 == '<') {
                                    var328 = true;
                                } else if (var330 == '>') {
                                    var328 = false;
                                } else if (!var328) {
                                    var327.append(var330);
                                }
                            }
                            field801[var6++] = var327.toString();
                            continue;
                        }
                        if (var402 == 4120) {
                            var6--;
                            String var331 = field801[var6];
                            var5--;
                            int var332 = field796[var5];
                            field796[var5++] = var331.indexOf(var332);
                            continue;
                        }
                        if (var402 == 4121) {
                            var6 -= 2;
                            String var333 = field801[var6];
                            String var334 = field801[var6 + 1];
                            var5--;
                            int var335 = field796[var5];
                            field796[var5++] = var333.indexOf(var334, var335);
                            continue;
                        }
                    } else if (var402 < 4300) {
                        if (var402 == 4200) {
                            var5--;
                            int var336 = field796[var5];
                            field801[var6++] = class52.method578(var336).field1122;
                            continue;
                        }
                        if (var402 == 4201) {
                            var5 -= 2;
                            int var337 = field796[var5];
                            int var338 = field796[var5 + 1];
                            class52 var339 = class52.method578(var337);
                            if (var338 >= 1 && var338 <= 5 && var339.field1136[var338 - 1] != null) {
                                field801[var6++] = var339.field1136[var338 - 1];
                                continue;
                            }
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 4202) {
                            var5 -= 2;
                            int var340 = field796[var5];
                            int var341 = field796[var5 + 1];
                            class52 var342 = class52.method578(var340);
                            if (var341 >= 1 && var341 <= 5 && var342.field1137[var341 - 1] != null) {
                                field801[var6++] = var342.field1137[var341 - 1];
                                continue;
                            }
                            field801[var6++] = "";
                            continue;
                        }
                        if (var402 == 4203) {
                            var5--;
                            int var343 = field796[var5];
                            field796[var5++] = class52.method578(var343).field1134;
                            continue;
                        }
                        if (var402 == 4204) {
                            var5--;
                            int var344 = field796[var5];
                            field796[var5++] = class52.method578(var344).field1135 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 4205) {
                            var5--;
                            int var345 = field796[var5];
                            class52 var346 = class52.method578(var345);
                            if (var346.field1153 == -1 && var346.field1149 >= 0) {
                                field796[var5++] = var346.field1149;
                                continue;
                            }
                            field796[var5++] = var345;
                            continue;
                        }
                        if (var402 == 4206) {
                            var5--;
                            int var347 = field796[var5];
                            class52 var348 = class52.method578(var347);
                            if (var348.field1153 >= 0 && var348.field1149 >= 0) {
                                field796[var5++] = var348.field1149;
                                continue;
                            }
                            field796[var5++] = var347;
                            continue;
                        }
                        if (var402 == 4207) {
                            var5--;
                            int var349 = field796[var5];
                            field796[var5++] = class52.method578(var349).field1115 ? 1 : 0;
                            continue;
                        }
                        if (var402 == 4210) {
                            var6--;
                            String var350 = field801[var6];
                            var5--;
                            int var351 = field796[var5];
                            client.method2253(var350, var351 == 1);
                            field796[var5++] = Statics.field3146;
                            continue;
                        }
                        if (var402 == 4211) {
                            if (Statics.field225 != null && Statics.field799 < Statics.field3146) {
                                field796[var5++] = Statics.field225[++Statics.field799 - 1] & 0xFFFF;
                                continue;
                            }
                            field796[var5++] = -1;
                            continue;
                        }
                        if (var402 == 4212) {
                            Statics.field799 = 0;
                            continue;
                        }
                    } else if (var402 < 5100) {
                        if (var402 == 5000) {
                            field796[var5++] = client.field507;
                            continue;
                        }
                        if (var402 == 5001) {
                            var5 -= 3;
                            client.field507 = field796[var5];
                            Statics.field1144 = class130.method736(field796[var5 + 1]);
                            if (Statics.field1144 == null) {
                                Statics.field1144 = class130.field2062;
                            }
                            client.field508 = field796[var5 + 2];
                            client.field330.method2549(191);
                            client.field330.method2301(client.field507);
                            client.field330.method2301(Statics.field1144.field2064);
                            client.field330.method2301(client.field508);
                            continue;
                        }
                        if (var402 == 5002) {
                            var6--;
                            String var352 = field801[var6];
                            var5 -= 2;
                            int var353 = field796[var5];
                            int var354 = field796[var5 + 1];
                            client.field330.method2549(94);
                            client.field330.method2301(class119.method730(var352) + 2);
                            client.field330.method2307(var352);
                            client.field330.method2301(var353 - 1);
                            client.field330.method2301(var354);
                            continue;
                        }
                        if (var402 == 5003) {
                            var5 -= 2;
                            int var355 = field796[var5];
                            int var356 = field796[var5 + 1];
                            class28 var357 = (class28) class12.field175.get(var355);
                            class36 var358 = var357.method640(var356);
                            if (var358 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                                field801[var6++] = "";
                                field801[var6++] = "";
                            } else {
                                field796[var5++] = var358.field790;
                                field796[var5++] = var358.field781;
                                field801[var6++] = var358.field784 == null ? "" : var358.field784;
                                field801[var6++] = var358.field785 == null ? "" : var358.field785;
                                field801[var6++] = var358.field786 == null ? "" : var358.field786;
                            }
                            continue;
                        }
                        if (var402 == 5004) {
                            var5--;
                            int var360 = field796[var5];
                            class36 var361 = (class36) class12.field173.method3516((long) var360);
                            if (var361 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                                field801[var6++] = "";
                                field801[var6++] = "";
                            } else {
                                field796[var5++] = var361.field782;
                                field796[var5++] = var361.field781;
                                field801[var6++] = var361.field784 == null ? "" : var361.field784;
                                field801[var6++] = var361.field785 == null ? "" : var361.field785;
                                field801[var6++] = var361.field786 == null ? "" : var361.field786;
                            }
                            continue;
                        }
                        if (var402 == 5005) {
                            if (Statics.field1144 == null) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = Statics.field1144.field2064;
                            }
                            continue;
                        }
                        if (var402 == 5008) {
                            var6--;
                            String var363 = field801[var6];
                            var5--;
                            int var364 = field796[var5];
                            String var365 = var363.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class157.field2407)) {
                                var366 = 0;
                                var363 = var363.substring(class157.field2407.length());
                            } else if (var365.startsWith(class157.field2499)) {
                                var366 = 1;
                                var363 = var363.substring(class157.field2499.length());
                            } else if (var365.startsWith(class157.field2496)) {
                                var366 = 2;
                                var363 = var363.substring(class157.field2496.length());
                            } else if (var365.startsWith(class157.field2366)) {
                                var366 = 3;
                                var363 = var363.substring(class157.field2366.length());
                            } else if (var365.startsWith(class157.field2497)) {
                                var366 = 4;
                                var363 = var363.substring(class157.field2497.length());
                            } else if (var365.startsWith(class157.field2405)) {
                                var366 = 5;
                                var363 = var363.substring(class157.field2405.length());
                            } else if (var365.startsWith(class157.field2501)) {
                                var366 = 6;
                                var363 = var363.substring(class157.field2501.length());
                            } else if (var365.startsWith(class157.field2503)) {
                                var366 = 7;
                                var363 = var363.substring(class157.field2503.length());
                            } else if (var365.startsWith(class157.field2363)) {
                                var366 = 8;
                                var363 = var363.substring(class157.field2363.length());
                            } else if (var365.startsWith(class157.field2507)) {
                                var366 = 9;
                                var363 = var363.substring(class157.field2507.length());
                            } else if (var365.startsWith(class157.field2590)) {
                                var366 = 10;
                                var363 = var363.substring(class157.field2590.length());
                            } else if (var365.startsWith(class157.field2408)) {
                                var366 = 11;
                                var363 = var363.substring(class157.field2408.length());
                            } else if (client.field473 != 0) {
                                if (var365.startsWith(class157.field2594)) {
                                    var366 = 0;
                                    var363 = var363.substring(class157.field2594.length());
                                } else if (var365.startsWith(class157.field2492)) {
                                    var366 = 1;
                                    var363 = var363.substring(class157.field2492.length());
                                } else if (var365.startsWith(class157.field2431)) {
                                    var366 = 2;
                                    var363 = var363.substring(class157.field2431.length());
                                } else if (var365.startsWith(class157.field2315)) {
                                    var366 = 3;
                                    var363 = var363.substring(class157.field2315.length());
                                } else if (var365.startsWith(class157.field2498)) {
                                    var366 = 4;
                                    var363 = var363.substring(class157.field2498.length());
                                } else if (var365.startsWith(class157.field2500)) {
                                    var366 = 5;
                                    var363 = var363.substring(class157.field2500.length());
                                } else if (var365.startsWith(class157.field2502)) {
                                    var366 = 6;
                                    var363 = var363.substring(class157.field2502.length());
                                } else if (var365.startsWith(class157.field2504)) {
                                    var366 = 7;
                                    var363 = var363.substring(class157.field2504.length());
                                } else if (var365.startsWith(class157.field2331)) {
                                    var366 = 8;
                                    var363 = var363.substring(class157.field2331.length());
                                } else if (var365.startsWith(class157.field2414)) {
                                    var366 = 9;
                                    var363 = var363.substring(class157.field2414.length());
                                } else if (var365.startsWith(class157.field2510)) {
                                    var366 = 10;
                                    var363 = var363.substring(class157.field2510.length());
                                } else if (var365.startsWith(class157.field2512)) {
                                    var366 = 11;
                                    var363 = var363.substring(class157.field2512.length());
                                }
                            }
                            String var367 = var363.toLowerCase();
                            byte var368 = 0;
                            if (var367.startsWith(class157.field2513)) {
                                var368 = 1;
                                var363 = var363.substring(class157.field2513.length());
                            } else if (var367.startsWith(class157.field2515)) {
                                var368 = 2;
                                var363 = var363.substring(class157.field2515.length());
                            } else if (var367.startsWith(class157.field2517)) {
                                var368 = 3;
                                var363 = var363.substring(class157.field2517.length());
                            } else if (var367.startsWith(class157.field2519)) {
                                var368 = 4;
                                var363 = var363.substring(class157.field2519.length());
                            } else if (var367.startsWith(class157.field2521)) {
                                var368 = 5;
                                var363 = var363.substring(class157.field2521.length());
                            } else if (client.field473 != 0) {
                                if (var367.startsWith(class157.field2547)) {
                                    var368 = 1;
                                    var363 = var363.substring(class157.field2547.length());
                                } else if (var367.startsWith(class157.field2516)) {
                                    var368 = 2;
                                    var363 = var363.substring(class157.field2516.length());
                                } else if (var367.startsWith(class157.field2518)) {
                                    var368 = 3;
                                    var363 = var363.substring(class157.field2518.length());
                                } else if (var367.startsWith(class157.field2486)) {
                                    var368 = 4;
                                    var363 = var363.substring(class157.field2486.length());
                                } else if (var367.startsWith(class157.field2413)) {
                                    var368 = 5;
                                    var363 = var363.substring(class157.field2413.length());
                                }
                            }
                            client.field330.method2549(162);
                            client.field330.method2301(0);
                            int var369 = client.field330.field1999;
                            client.field330.method2301(var364);
                            client.field330.method2301(var366);
                            client.field330.method2301(var368);
                            class222.method3214(client.field330, var363);
                            client.field330.method2313(client.field330.field1999 - var369);
                            continue;
                        }
                        if (var402 == 5009) {
                            var6 -= 2;
                            String var370 = field801[var6];
                            String var371 = field801[var6 + 1];
                            client.field330.method2549(177);
                            client.field330.method2404(0);
                            int var372 = client.field330.field1999;
                            client.field330.method2307(var370);
                            class222.method3214(client.field330, var371);
                            client.field330.method2377(client.field330.field1999 - var372);
                            continue;
                        }
                        if (var402 == 5015) {
                            String var373;
                            if (Statics.field2250 == null || Statics.field2250.field49 == null) {
                                var373 = "";
                            } else {
                                var373 = Statics.field2250.field49;
                            }
                            field801[var6++] = var373;
                            continue;
                        }
                        if (var402 == 5016) {
                            field796[var5++] = client.field508;
                            continue;
                        }
                        if (var402 == 5017) {
                            var5--;
                            int var374 = field796[var5];
                            field796[var5++] = class12.method2749(var374);
                            continue;
                        }
                        if (var402 == 5018) {
                            var5--;
                            int var375 = field796[var5];
                            int[] var376 = field796;
                            int var377 = var5++;
                            class36 var378 = (class36) class12.field173.method3516((long) var375);
                            int var379;
                            if (var378 == null) {
                                var379 = -1;
                            } else if (class12.field174.field3097 == var378.field3101) {
                                var379 = -1;
                            } else {
                                var379 = ((class36) var378.field3101).field790;
                            }
                            var376[var377] = var379;
                            continue;
                        }
                        if (var402 == 5019) {
                            var5--;
                            int var380 = field796[var5];
                            field796[var5++] = class12.method179(var380);
                            continue;
                        }
                        if (var402 == 5020) {
                            var6--;
                            String var381 = field801[var6];
                            if (var381.equalsIgnoreCase("toggleroof")) {
                                Statics.field170.field143 = !Statics.field170.field143;
                                class9.method36();
                                if (Statics.field170.field143) {
                                    class12.method183(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method183(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var381.equalsIgnoreCase("displayfps")) {
                                client.field304 = !client.field304;
                            }
                            if (client.field456 >= 2) {
                                if (var381.equalsIgnoreCase("fpson")) {
                                    client.field304 = true;
                                }
                                if (var381.equalsIgnoreCase("fpsoff")) {
                                    client.field304 = false;
                                }
                                if (var381.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var381.equalsIgnoreCase("clientdrop")) {
                                    client.method567();
                                }
                                if (var381.equalsIgnoreCase("errortest") && client.field289 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field330.method2549(5);
                            client.field330.method2301(var381.length() + 1);
                            client.field330.method2307(var381);
                            continue;
                        }
                        if (var402 == 5021) {
                            var6--;
                            client.field509 = field801[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var402 == 5022) {
                            field801[var6++] = client.field509;
                            continue;
                        }
                    }
                }
                if (var402 < 5400) {
                    if (var402 == 5306) {
                        field796[var5++] = client.method2039();
                        continue;
                    }
                    if (var402 == 5307) {
                        var5--;
                        int var382 = field796[var5];
                        if (var382 != 1 && var382 != 2) {
                            continue;
                        }
                        client.field502 = 0L;
                        if (var382 >= 2) {
                            client.field383 = true;
                        } else {
                            client.field383 = false;
                        }
                        client.method845();
                        if (client.field296 >= 25) {
                            client.field330.method2549(179);
                            client.field330.method2301(client.method2039());
                            client.field330.method2404(Statics.field2191);
                            client.field330.method2404(Statics.field1567);
                        }
                        class144.field2211 = true;
                        continue;
                    }
                    if (var402 == 5308) {
                        field796[var5++] = Statics.field170.field145;
                        continue;
                    }
                    if (var402 == 5309) {
                        var5--;
                        int var383 = field796[var5];
                        if (var383 == 1 || var383 == 2) {
                            Statics.field170.field145 = var383;
                            class9.method36();
                        }
                        continue;
                    }
                }
                if (var402 < 5600) {
                    if (var402 == 5504) {
                        var5 -= 2;
                        int var384 = field796[var5];
                        int var385 = field796[var5 + 1];
                        if (!client.field529) {
                            client.field556 = var384;
                            client.field375 = var385;
                        }
                        continue;
                    }
                    if (var402 == 5505) {
                        field796[var5++] = client.field556;
                        continue;
                    }
                    if (var402 == 5506) {
                        field796[var5++] = client.field375;
                        continue;
                    }
                    if (var402 == 5530) {
                        var5--;
                        int var386 = field796[var5];
                        if (var386 < 0) {
                            var386 = 0;
                        }
                        client.field380 = var386;
                        continue;
                    }
                    if (var402 == 5531) {
                        field796[var5++] = client.field380;
                        continue;
                    }
                }
                if (var402 >= 5700 || var402 != 5630) {
                    if (var402 < 6300) {
                        if (var402 == 6200) {
                            var5 -= 2;
                            client.field371 = (short) field796[var5];
                            if (client.field371 <= 0) {
                                client.field371 = 256;
                            }
                            client.field405 = (short) field796[var5 + 1];
                            if (client.field405 <= 0) {
                                client.field405 = 205;
                            }
                            continue;
                        }
                        if (var402 == 6201) {
                            var5 -= 2;
                            client.field545 = (short) field796[var5];
                            if (client.field545 <= 0) {
                                client.field545 = 256;
                            }
                            client.field546 = (short) field796[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 320;
                            }
                            continue;
                        }
                        if (var402 == 6202) {
                            var5 -= 4;
                            client.field463 = (short) field796[var5];
                            if (client.field463 <= 0) {
                                client.field463 = 1;
                            }
                            client.field548 = (short) field796[var5 + 1];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field463) {
                                client.field548 = client.field463;
                            }
                            client.field549 = (short) field796[var5 + 2];
                            if (client.field549 <= 0) {
                                client.field549 = 1;
                            }
                            client.field550 = (short) field796[var5 + 3];
                            if (client.field550 <= 0) {
                                client.field550 = 32767;
                            } else if (client.field550 < client.field549) {
                                client.field550 = client.field549;
                            }
                            continue;
                        }
                        if (var402 == 6203) {
                            if (client.field461 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = -1;
                            } else {
                                client.method3190(0, 0, client.field461.field2775, client.field461.field2891, false);
                                field796[var5++] = client.field553;
                                field796[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var402 == 6204) {
                            field796[var5++] = client.field545;
                            field796[var5++] = client.field546;
                            continue;
                        }
                        if (var402 == 6205) {
                            field796[var5++] = client.field371;
                            field796[var5++] = client.field405;
                            continue;
                        }
                    }
                    if (var402 < 6600) {
                        if (var402 == 6500) {
                            field796[var5++] = class26.method1936() ? 1 : 0;
                            continue;
                        }
                        if (var402 == 6501) {
                            class26 var387 = class26.method121();
                            if (var387 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                            } else {
                                field796[var5++] = var387.field638;
                                field796[var5++] = var387.field639;
                                field801[var6++] = var387.field642;
                                field796[var5++] = var387.field636;
                                field796[var5++] = var387.field640;
                                field801[var6++] = var387.field641;
                            }
                            continue;
                        }
                        if (var402 == 6502) {
                            class26 var388 = class26.method1754();
                            if (var388 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                            } else {
                                field796[var5++] = var388.field638;
                                field796[var5++] = var388.field639;
                                field801[var6++] = var388.field642;
                                field796[var5++] = var388.field636;
                                field796[var5++] = var388.field640;
                                field801[var6++] = var388.field641;
                            }
                            continue;
                        }
                        if (var402 == 6506) {
                            var5--;
                            int var389 = field796[var5];
                            class26 var390 = null;
                            for (int var391 = 0; var391 < class26.field634; var391++) {
                                if (Statics.field633[var391].field638 == var389) {
                                    var390 = Statics.field633[var391];
                                    break;
                                }
                            }
                            if (var390 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field801[var6++] = "";
                            } else {
                                field796[var5++] = var390.field638;
                                field796[var5++] = var390.field639;
                                field801[var6++] = var390.field642;
                                field796[var5++] = var390.field636;
                                field796[var5++] = var390.field640;
                                field801[var6++] = var390.field641;
                            }
                            continue;
                        }
                        if (var402 == 6507) {
                            var5 -= 4;
                            int var392 = field796[var5];
                            boolean var393 = field796[var5 + 1] == 1;
                            int var394 = field796[var5 + 2];
                            boolean var395 = field796[var5 + 3] == 1;
                            class26.method1231(var392, var393, var394, var395);
                            continue;
                        }
                        if (var402 == 6511) {
                            var5--;
                            int var396 = field796[var5];
                            if (var396 >= 0 && var396 < class26.field634) {
                                class26 var397 = Statics.field633[var396];
                                field796[var5++] = var397.field638;
                                field796[var5++] = var397.field639;
                                field801[var6++] = var397.field642;
                                field796[var5++] = var397.field636;
                                field796[var5++] = var397.field640;
                                field801[var6++] = var397.field641;
                                continue;
                            }
                            field796[var5++] = -1;
                            field796[var5++] = 0;
                            field801[var6++] = "";
                            field796[var5++] = 0;
                            field796[var5++] = 0;
                            field801[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field340 = 250;
            }
        } catch (Exception var401) {
            StringBuilder var399 = new StringBuilder(30);
            var399.append("").append(var4.field3113).append(" ");
            for (int var400 = field802 - 1; var400 >= 0; var400--) {
                var399.append("").append(field795[var400].field213.field3113).append(" ");
            }
            var399.append("").append(var10);
            class148.method181(var399.toString(), var401);
        }
    }

    @ObfuscatedName("al.l(II)V")
    public static void method863(int arg0) {
        if (arg0 == -1 || !class173.method2908(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2758[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2836 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field6 = var3.field2836;
                method2607(var4, 2000000);
            }
        }
    }
}
