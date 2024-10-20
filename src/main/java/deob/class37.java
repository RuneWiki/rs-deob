package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ae")
public class class37 {

    @ObfuscatedName("ae.p")
    public static int[] field794 = new int[5];

    @ObfuscatedName("ae.s")
    public static int[][] field803 = new int[5][5000];

    @ObfuscatedName("ae.y")
    public static int[] field796 = new int[1000];

    @ObfuscatedName("ae.t")
    public static String[] field792 = new String[1000];

    @ObfuscatedName("ae.w")
    public static int field810 = 0;

    @ObfuscatedName("ae.h")
    public static class15[] field795 = new class15[50];

    @ObfuscatedName("ae.n")
    public static Calendar field800 = Calendar.getInstance();

    @ObfuscatedName("ae.q")
    public static final String[] field801 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ae.f")
    public static int field802 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.o(Lo;II)V")
    public static void method2736(class1 arg0, int arg1) {
        Object[] var2 = arg0.field1;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method68(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field581;
        int[] var9 = var4.field597;
        byte var10 = -1;
        field810 = 0;
        try {
            Statics.field2669 = new int[var4.field585];
            int var11 = 0;
            Statics.field2170 = new String[var4.field582];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2757;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2758;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2757;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2758;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field16;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field2669[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2170[var12++] = var15;
                }
            }
            int var16 = 0;
            field802 = arg0.field19;
            label2967: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var481 = var8[var7];
                if (var481 < 100) {
                    if (var481 == 0) {
                        field796[var5++] = var9[var7];
                        continue;
                    }
                    if (var481 == 1) {
                        int var17 = var9[var7];
                        field796[var5++] = class176.field2906[var17];
                        continue;
                    }
                    if (var481 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2906[var18] = field796[var5];
                        client.method2663(var18);
                        continue;
                    }
                    if (var481 == 3) {
                        field792[var6++] = var4.field583[var7];
                        continue;
                    }
                    if (var481 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var481 == 7) {
                        var5 -= 2;
                        if (field796[var5 + 1] != field796[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var481 == 8) {
                        var5 -= 2;
                        if (field796[var5 + 1] == field796[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var481 == 9) {
                        var5 -= 2;
                        if (field796[var5] < field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var481 == 10) {
                        var5 -= 2;
                        if (field796[var5] > field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var481 == 21) {
                        if (field810 == 0) {
                            return;
                        }
                        class15 var19 = field795[--field810];
                        var4 = var19.field200;
                        var8 = var4.field581;
                        var9 = var4.field597;
                        var7 = var19.field199;
                        Statics.field2669 = var19.field202;
                        Statics.field2170 = var19.field201;
                        continue;
                    }
                    if (var481 == 25) {
                        int var20 = var9[var7];
                        field796[var5++] = class176.method2678(var20);
                        continue;
                    }
                    if (var481 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field796[var5];
                        class48 var23 = (class48) class48.field1063.method3510((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1059.method3057(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method957(new class119(var25));
                            }
                            class48.field1063.method3512(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1060;
                        int var29 = var24.field1064;
                        int var30 = var24.field1062;
                        int var31 = class176.field2904[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class176.field2906[var28] = class176.field2906[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var481 == 31) {
                        var5 -= 2;
                        if (field796[var5] <= field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var481 == 32) {
                        var5 -= 2;
                        if (field796[var5] >= field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var481 == 33) {
                        field796[var5++] = Statics.field2669[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var481 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2669[var10001] = field796[var5];
                        continue;
                    }
                    if (var481 == 35) {
                        field792[var6++] = Statics.field2170[var9[var7]];
                        continue;
                    }
                    if (var481 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2170[var10001] = field792[var6];
                        continue;
                    }
                    if (var481 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field792;
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
                        field792[var6++] = var35;
                        continue;
                    }
                    if (var481 == 38) {
                        var5--;
                        continue;
                    }
                    if (var481 == 39) {
                        var6--;
                        continue;
                    }
                    if (var481 == 40) {
                        int var45 = var9[var7];
                        class23 var46 = class23.method68(var45);
                        int[] var47 = new int[var46.field585];
                        String[] var48 = new String[var46.field582];
                        for (int var49 = 0; var49 < var46.field586; var49++) {
                            var47[var49] = field796[var5 - var46.field586 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field593; var50++) {
                            var48[var50] = field792[var6 - var46.field593 + var50];
                        }
                        var5 -= var46.field586;
                        var6 -= var46.field593;
                        class15 var51 = new class15();
                        var51.field200 = var4;
                        var51.field199 = var7;
                        var51.field202 = Statics.field2669;
                        var51.field201 = Statics.field2170;
                        field795[++field810 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field581;
                        var9 = var46.field597;
                        var7 = -1;
                        Statics.field2669 = var47;
                        Statics.field2170 = var48;
                        continue;
                    }
                    if (var481 == 42) {
                        field796[var5++] = Statics.field777.method207(var9[var7]);
                        continue;
                    }
                    if (var481 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field777.method236(var10001, field796[var5]);
                        continue;
                    }
                    if (var481 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field796[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field794[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2967;
                                }
                                field803[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var481 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field796[var5];
                        if (var58 >= 0 && var58 < field794[var57]) {
                            field796[var5++] = field803[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var481 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field796[var5];
                        if (var60 >= 0 && var60 < field794[var59]) {
                            field803[var59][var60] = field796[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var481 == 47) {
                        String var61 = Statics.field777.method209(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field792[var6++] = var61;
                        continue;
                    }
                    if (var481 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field777.method208(var10001, field792[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var481 < 1000) {
                    if (var481 == 100) {
                        var5 -= 3;
                        int var63 = field796[var5];
                        int var64 = field796[var5 + 1];
                        int var65 = field796[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var66 = class173.method2550(var63);
                        if (var66.field2879 == null) {
                            var66.field2879 = new class173[var65 + 1];
                        }
                        if (var66.field2879.length <= var65) {
                            class173[] var67 = new class173[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2879.length; var68++) {
                                var67[var68] = var66.field2879[var68];
                            }
                            var66.field2879 = var67;
                        }
                        if (var65 > 0 && var66.field2879[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class173 var69 = new class173();
                        var69.field2759 = var64;
                        var69.field2857 = var69.field2757 = var66.field2757;
                        var69.field2758 = var65;
                        var69.field2756 = true;
                        var66.field2879[var65] = var69;
                        if (var62) {
                            Statics.field3169 = var69;
                        } else {
                            Statics.field1940 = var69;
                        }
                        client.method239(var66);
                        continue;
                    }
                    if (var481 == 101) {
                        class173 var70 = var62 ? Statics.field3169 : Statics.field1940;
                        class173 var71 = class173.method2550(var70.field2757);
                        var71.field2879[var70.field2758] = null;
                        client.method239(var71);
                        continue;
                    }
                    if (var481 == 102) {
                        var5--;
                        class173 var72 = class173.method2550(field796[var5]);
                        var72.field2879 = null;
                        client.method239(var72);
                        continue;
                    }
                    if (var481 == 200) {
                        var5 -= 2;
                        int var73 = field796[var5];
                        int var74 = field796[var5 + 1];
                        class173 var75 = class173.method908(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field796[var5++] = 1;
                            if (var62) {
                                Statics.field3169 = var75;
                            } else {
                                Statics.field1940 = var75;
                            }
                            continue;
                        }
                        field796[var5++] = 0;
                        continue;
                    }
                    if (var481 == 201) {
                        var5--;
                        class173 var76 = class173.method2550(field796[var5]);
                        if (var76 == null) {
                            field796[var5++] = 0;
                        } else {
                            field796[var5++] = 1;
                            if (var62) {
                                Statics.field3169 = var76;
                            } else {
                                Statics.field1940 = var76;
                            }
                        }
                        continue;
                    }
                } else if (!(var481 < 1000 || var481 >= 1100) || !(var481 < 2000 || var481 >= 2100)) {
                    int var77 = -1;
                    class173 var78;
                    if (var481 >= 2000) {
                        var481 -= 1000;
                        var5--;
                        var77 = field796[var5];
                        var78 = class173.method2550(var77);
                    } else {
                        var78 = var62 ? Statics.field3169 : Statics.field1940;
                    }
                    if (var481 == 1000) {
                        var5 -= 4;
                        var78.field2766 = field796[var5];
                        var78.field2837 = field796[var5 + 1];
                        var78.field2762 = field796[var5 + 2];
                        var78.field2763 = field796[var5 + 3];
                        client.method239(var78);
                        client.method745(var78);
                        if (var77 != -1 && var78.field2759 == 0) {
                            client.method662(Statics.field2754[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var481 == 1001) {
                        var5 -= 4;
                        var78.field2768 = field796[var5];
                        var78.field2769 = field796[var5 + 1];
                        var78.field2830 = field796[var5 + 2];
                        var78.field2765 = field796[var5 + 3];
                        client.method239(var78);
                        client.method745(var78);
                        if (var77 != -1 && var78.field2759 == 0) {
                            client.method662(Statics.field2754[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var481 == 1003) {
                        var5--;
                        boolean var79 = field796[var5] == 1;
                        if (var78.field2777 != var79) {
                            var78.field2777 = var79;
                            client.method239(var78);
                        }
                        continue;
                    }
                    if (var481 == 1005) {
                        var5--;
                        var78.field2820 = field796[var5] == 1;
                        continue;
                    }
                    if (var481 == 1006) {
                        var5--;
                        var78.field2889 = field796[var5] == 1;
                        continue;
                    }
                } else if (!(var481 < 1100 || var481 >= 1200) || !(var481 < 2100 || var481 >= 2200)) {
                    int var80 = -1;
                    class173 var81;
                    if (var481 >= 2000) {
                        var481 -= 1000;
                        var5--;
                        var80 = field796[var5];
                        var81 = class173.method2550(var80);
                    } else {
                        var81 = var62 ? Statics.field3169 : Statics.field1940;
                    }
                    if (var481 == 1100) {
                        var5 -= 2;
                        var81.field2778 = field796[var5];
                        if (var81.field2778 > var81.field2780 - var81.field2807) {
                            var81.field2778 = var81.field2780 - var81.field2807;
                        }
                        if (var81.field2778 < 0) {
                            var81.field2778 = 0;
                        }
                        var81.field2779 = field796[var5 + 1];
                        if (var81.field2779 > var81.field2781 - var81.field2796) {
                            var81.field2779 = var81.field2781 - var81.field2796;
                        }
                        if (var81.field2779 < 0) {
                            var81.field2779 = 0;
                        }
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1101) {
                        var5--;
                        var81.field2782 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1102) {
                        var5--;
                        var81.field2786 = field796[var5] == 1;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1103) {
                        var5--;
                        var81.field2787 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1104) {
                        var5--;
                        var81.field2788 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1105) {
                        var5--;
                        var81.field2883 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1106) {
                        var5--;
                        var81.field2753 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1107) {
                        var5--;
                        var81.field2761 = field796[var5] == 1;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1108) {
                        var81.field2798 = 1;
                        var5--;
                        var81.field2799 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1109) {
                        var5 -= 6;
                        var81.field2881 = field796[var5];
                        var81.field2805 = field796[var5 + 1];
                        var81.field2806 = field796[var5 + 2];
                        var81.field2874 = field796[var5 + 3];
                        var81.field2808 = field796[var5 + 4];
                        var81.field2809 = field796[var5 + 5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1110) {
                        var5--;
                        int var82 = field796[var5];
                        if (var81.field2862 != var82) {
                            var81.field2862 = var82;
                            var81.field2877 = 0;
                            var81.field2878 = 0;
                            client.method239(var81);
                        }
                        continue;
                    }
                    if (var481 == 1111) {
                        var5--;
                        var81.field2760 = field796[var5] == 1;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1112) {
                        var6--;
                        String var83 = field792[var6];
                        if (!var83.equals(var81.field2815)) {
                            var81.field2815 = var83;
                            client.method239(var81);
                        }
                        continue;
                    }
                    if (var481 == 1113) {
                        var5--;
                        var81.field2814 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1114) {
                        var5 -= 3;
                        var81.field2818 = field796[var5];
                        var81.field2789 = field796[var5 + 1];
                        var81.field2817 = field796[var5 + 2];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1115) {
                        var5--;
                        var81.field2764 = field796[var5] == 1;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1116) {
                        var5--;
                        var81.field2794 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1117) {
                        var5--;
                        var81.field2795 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1118) {
                        var5--;
                        var81.field2850 = field796[var5] == 1;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1119) {
                        var5--;
                        var81.field2864 = field796[var5] == 1;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1120) {
                        var5 -= 2;
                        var81.field2780 = field796[var5];
                        var81.field2781 = field796[var5 + 1];
                        client.method239(var81);
                        if (var80 != -1 && var81.field2759 == 0) {
                            client.method662(Statics.field2754[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var481 == 1121) {
                        int var84 = var81.field2757;
                        int var85 = var81.field2758;
                        client.field312.method2612(87);
                        client.field312.method2390(var85);
                        client.field312.method2454(var84);
                        client.field454 = var81;
                        client.method239(var81);
                        continue;
                    }
                    if (var481 == 1122) {
                        var5--;
                        var81.field2791 = field796[var5];
                        client.method239(var81);
                        continue;
                    }
                } else if (var481 >= 1200 && var481 < 1300 || var481 >= 2200 && var481 < 2300) {
                    class173 var86;
                    if (var481 >= 2000) {
                        var481 -= 1000;
                        var5--;
                        var86 = class173.method2550(field796[var5]);
                    } else {
                        var86 = var62 ? Statics.field3169 : Statics.field1940;
                    }
                    client.method239(var86);
                    if (var481 == 1200 || var481 == 1205 || var481 == 1212) {
                        var5 -= 2;
                        int var87 = field796[var5];
                        int var88 = field796[var5 + 1];
                        var86.field2875 = var87;
                        var86.field2876 = var88;
                        class52 var89 = class52.method1933(var87);
                        var86.field2806 = var89.field1109;
                        var86.field2874 = var89.field1132;
                        var86.field2808 = var89.field1113;
                        var86.field2881 = var89.field1114;
                        var86.field2805 = var89.field1098;
                        var86.field2809 = var89.field1110;
                        if (var481 == 1205) {
                            var86.field2813 = 0;
                        } else if (var481 == 1212 | var89.field1102 == 1) {
                            var86.field2813 = 1;
                        } else {
                            var86.field2813 = 2;
                        }
                        if (var86.field2800 > 0) {
                            var86.field2809 = var86.field2809 * 32 / var86.field2800;
                        } else if (var86.field2768 > 0) {
                            var86.field2809 = var86.field2809 * 32 / var86.field2768;
                        }
                        continue;
                    }
                    if (var481 == 1201) {
                        var86.field2798 = 2;
                        var5--;
                        var86.field2799 = field796[var5];
                        continue;
                    }
                    if (var481 == 1202) {
                        var86.field2798 = 3;
                        var86.field2799 = Statics.field159.field33.method3271();
                        continue;
                    }
                } else if (var481 >= 1300 && var481 < 1400 || var481 >= 2300 && var481 < 2400) {
                    class173 var90;
                    if (var481 >= 2000) {
                        var481 -= 1000;
                        var5--;
                        var90 = class173.method2550(field796[var5]);
                    } else {
                        var90 = var62 ? Statics.field3169 : Statics.field1940;
                    }
                    if (var481 == 1300) {
                        var5--;
                        int var91 = field796[var5] - 1;
                        if (var91 >= 0 && var91 <= 9) {
                            var6--;
                            var90.method3199(var91, field792[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var481 == 1301) {
                        var5 -= 2;
                        int var92 = field796[var5];
                        int var93 = field796[var5 + 1];
                        var90.field2888 = class173.method908(var92, var93);
                        continue;
                    }
                    if (var481 == 1302) {
                        var5--;
                        var90.field2833 = field796[var5] == 1;
                        continue;
                    }
                    if (var481 == 1303) {
                        var5--;
                        var90.field2831 = field796[var5];
                        continue;
                    }
                    if (var481 == 1304) {
                        var5--;
                        var90.field2832 = field796[var5];
                        continue;
                    }
                    if (var481 == 1305) {
                        var6--;
                        var90.field2828 = field792[var6];
                        continue;
                    }
                    if (var481 == 1306) {
                        var6--;
                        var90.field2834 = field792[var6];
                        continue;
                    }
                    if (var481 == 1307) {
                        var90.field2829 = null;
                        continue;
                    }
                } else {
                    if (var481 >= 1400 && var481 < 1500 || var481 >= 2400 && var481 < 2500) {
                        class173 var94;
                        if (var481 >= 2000) {
                            var481 -= 1000;
                            var5--;
                            var94 = class173.method2550(field796[var5]);
                        } else {
                            var94 = var62 ? Statics.field3169 : Statics.field1940;
                        }
                        var6--;
                        String var95 = field792[var6];
                        int[] var96 = null;
                        if (var95.length() > 0 && var95.charAt(var95.length() - 1) == 'Y') {
                            var5--;
                            int var97 = field796[var5];
                            if (var97 > 0) {
                                var96 = new int[var97];
                                while (var97-- > 0) {
                                    var5--;
                                    var96[var97] = field796[var5];
                                }
                            }
                            var95 = var95.substring(0, var95.length() - 1);
                        }
                        Object[] var98 = new Object[var95.length() + 1];
                        for (int var99 = var98.length - 1; var99 >= 1; var99--) {
                            if (var95.charAt(var99 - 1) == 's') {
                                var6--;
                                var98[var99] = field792[var6];
                            } else {
                                var5--;
                                var98[var99] = Integer.valueOf(field796[var5]);
                            }
                        }
                        var5--;
                        int var100 = field796[var5];
                        if (var100 == -1) {
                            var98 = null;
                        } else {
                            var98[0] = Integer.valueOf(var100);
                        }
                        if (var481 == 1400) {
                            var94.field2804 = var98;
                        }
                        if (var481 == 1401) {
                            var94.field2840 = var98;
                        }
                        if (var481 == 1402) {
                            var94.field2880 = var98;
                        }
                        if (var481 == 1403) {
                            var94.field2841 = var98;
                        }
                        if (var481 == 1404) {
                            var94.field2772 = var98;
                        }
                        if (var481 == 1405) {
                            var94.field2844 = var98;
                        }
                        if (var481 == 1406) {
                            var94.field2847 = var98;
                        }
                        if (var481 == 1407) {
                            var94.field2848 = var98;
                            var94.field2849 = var96;
                        }
                        if (var481 == 1408) {
                            var94.field2854 = var98;
                        }
                        if (var481 == 1409) {
                            var94.field2819 = var98;
                        }
                        if (var481 == 1410) {
                            var94.field2792 = var98;
                        }
                        if (var481 == 1411) {
                            var94.field2838 = var98;
                        }
                        if (var481 == 1412) {
                            var94.field2856 = var98;
                        }
                        if (var481 == 1414) {
                            var94.field2861 = var98;
                            var94.field2851 = var96;
                        }
                        if (var481 == 1415) {
                            var94.field2852 = var98;
                            var94.field2853 = var96;
                        }
                        if (var481 == 1416) {
                            var94.field2846 = var98;
                        }
                        if (var481 == 1417) {
                            var94.field2886 = var98;
                        }
                        if (var481 == 1418) {
                            var94.field2827 = var98;
                        }
                        if (var481 == 1419) {
                            var94.field2858 = var98;
                        }
                        if (var481 == 1420) {
                            var94.field2859 = var98;
                        }
                        if (var481 == 1421) {
                            var94.field2860 = var98;
                        }
                        if (var481 == 1422) {
                            var94.field2885 = var98;
                        }
                        if (var481 == 1423) {
                            var94.field2802 = var98;
                        }
                        if (var481 == 1424) {
                            var94.field2863 = var98;
                        }
                        if (var481 == 1425) {
                            var94.field2865 = var98;
                        }
                        if (var481 == 1426) {
                            var94.field2825 = var98;
                        }
                        if (var481 == 1427) {
                            var94.field2835 = var98;
                        }
                        var94.field2842 = true;
                        continue;
                    }
                    if (var481 < 1600) {
                        class173 var101 = var62 ? Statics.field3169 : Statics.field1940;
                        if (var481 == 1500) {
                            field796[var5++] = var101.field2770;
                            continue;
                        }
                        if (var481 == 1501) {
                            field796[var5++] = var101.field2826;
                            continue;
                        }
                        if (var481 == 1502) {
                            field796[var5++] = var101.field2807;
                            continue;
                        }
                        if (var481 == 1503) {
                            field796[var5++] = var101.field2796;
                            continue;
                        }
                        if (var481 == 1504) {
                            field796[var5++] = var101.field2777 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 1505) {
                            field796[var5++] = var101.field2857;
                            continue;
                        }
                    } else if (var481 < 1700) {
                        class173 var102 = var62 ? Statics.field3169 : Statics.field1940;
                        if (var481 == 1600) {
                            field796[var5++] = var102.field2778;
                            continue;
                        }
                        if (var481 == 1601) {
                            field796[var5++] = var102.field2779;
                            continue;
                        }
                        if (var481 == 1602) {
                            field792[var6++] = var102.field2815;
                            continue;
                        }
                        if (var481 == 1603) {
                            field796[var5++] = var102.field2780;
                            continue;
                        }
                        if (var481 == 1604) {
                            field796[var5++] = var102.field2781;
                            continue;
                        }
                        if (var481 == 1605) {
                            field796[var5++] = var102.field2809;
                            continue;
                        }
                        if (var481 == 1606) {
                            field796[var5++] = var102.field2806;
                            continue;
                        }
                        if (var481 == 1607) {
                            field796[var5++] = var102.field2808;
                            continue;
                        }
                        if (var481 == 1608) {
                            field796[var5++] = var102.field2874;
                            continue;
                        }
                        if (var481 == 1609) {
                            field796[var5++] = var102.field2787;
                            continue;
                        }
                    } else if (var481 < 1800) {
                        class173 var103 = var62 ? Statics.field3169 : Statics.field1940;
                        if (var481 == 1700) {
                            field796[var5++] = var103.field2875;
                            continue;
                        }
                        if (var481 == 1701) {
                            if (var103.field2875 == -1) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var103.field2876;
                            }
                            continue;
                        }
                        if (var481 == 1702) {
                            field796[var5++] = var103.field2758;
                            continue;
                        }
                    } else if (var481 < 1900) {
                        class173 var104 = var62 ? Statics.field3169 : Statics.field1940;
                        if (var481 == 1800) {
                            field796[var5++] = class178.method2591(client.method878(var104));
                            continue;
                        }
                        if (var481 == 1801) {
                            var5--;
                            int var105 = field796[var5];
                            int var482 = var105 - 1;
                            if (var104.field2829 != null && var482 < var104.field2829.length && var104.field2829[var482] != null) {
                                field792[var6++] = var104.field2829[var482];
                                continue;
                            }
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 1802) {
                            if (var104.field2828 == null) {
                                field792[var6++] = "";
                            } else {
                                field792[var6++] = var104.field2828;
                            }
                            continue;
                        }
                    } else if (var481 >= 1900 && var481 < 2000 || var481 >= 2900 && var481 < 3000) {
                        class173 var106;
                        if (var481 >= 2000) {
                            var481 -= 1000;
                            var5--;
                            var106 = class173.method2550(field796[var5]);
                        } else {
                            var106 = var62 ? Statics.field3169 : Statics.field1940;
                        }
                        if (var481 == 1927) {
                            if (field802 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var106.field2835 == null) {
                                return;
                            }
                            class1 var107 = new class1();
                            var107.field3 = var106;
                            var107.field1 = var106.field2835;
                            var107.field19 = field802 + 1;
                            client.field410.method3589(arg0);
                            continue;
                        }
                    } else if (var481 < 2600) {
                        var5--;
                        class173 var108 = class173.method2550(field796[var5]);
                        if (var481 == 2500) {
                            field796[var5++] = var108.field2770;
                            continue;
                        }
                        if (var481 == 2501) {
                            field796[var5++] = var108.field2826;
                            continue;
                        }
                        if (var481 == 2502) {
                            field796[var5++] = var108.field2807;
                            continue;
                        }
                        if (var481 == 2503) {
                            field796[var5++] = var108.field2796;
                            continue;
                        }
                        if (var481 == 2504) {
                            field796[var5++] = var108.field2777 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 2505) {
                            field796[var5++] = var108.field2857;
                            continue;
                        }
                    } else if (var481 < 2700) {
                        var5--;
                        class173 var109 = class173.method2550(field796[var5]);
                        if (var481 == 2600) {
                            field796[var5++] = var109.field2778;
                            continue;
                        }
                        if (var481 == 2601) {
                            field796[var5++] = var109.field2779;
                            continue;
                        }
                        if (var481 == 2602) {
                            field792[var6++] = var109.field2815;
                            continue;
                        }
                        if (var481 == 2603) {
                            field796[var5++] = var109.field2780;
                            continue;
                        }
                        if (var481 == 2604) {
                            field796[var5++] = var109.field2781;
                            continue;
                        }
                        if (var481 == 2605) {
                            field796[var5++] = var109.field2809;
                            continue;
                        }
                        if (var481 == 2606) {
                            field796[var5++] = var109.field2806;
                            continue;
                        }
                        if (var481 == 2607) {
                            field796[var5++] = var109.field2808;
                            continue;
                        }
                        if (var481 == 2608) {
                            field796[var5++] = var109.field2874;
                            continue;
                        }
                        if (var481 == 2609) {
                            field796[var5++] = var109.field2787;
                            continue;
                        }
                    } else if (var481 < 2800) {
                        if (var481 == 2700) {
                            var5--;
                            class173 var110 = class173.method2550(field796[var5]);
                            field796[var5++] = var110.field2875;
                            continue;
                        }
                        if (var481 == 2701) {
                            var5--;
                            class173 var111 = class173.method2550(field796[var5]);
                            if (var111.field2875 == -1) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var111.field2876;
                            }
                            continue;
                        }
                        if (var481 == 2702) {
                            var5--;
                            int var112 = field796[var5];
                            class4 var113 = (class4) client.field436.method3545((long) var112);
                            if (var113 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = 1;
                            }
                            continue;
                        }
                        if (var481 == 2706) {
                            field796[var5++] = client.field379;
                            continue;
                        }
                    } else if (var481 < 2900) {
                        var5--;
                        class173 var114 = class173.method2550(field796[var5]);
                        if (var481 == 2800) {
                            field796[var5++] = class178.method2591(client.method878(var114));
                            continue;
                        }
                        if (var481 == 2801) {
                            var5--;
                            int var115 = field796[var5];
                            int var483 = var115 - 1;
                            if (var114.field2829 != null && var483 < var114.field2829.length && var114.field2829[var483] != null) {
                                field792[var6++] = var114.field2829[var483];
                                continue;
                            }
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 2802) {
                            if (var114.field2828 == null) {
                                field792[var6++] = "";
                            } else {
                                field792[var6++] = var114.field2828;
                            }
                            continue;
                        }
                    } else if (var481 < 3200) {
                        if (var481 == 3100) {
                            var6--;
                            String var116 = field792[var6];
                            class12.method2960(0, "", var116);
                            continue;
                        }
                        if (var481 == 3101) {
                            var5 -= 2;
                            client.method40(Statics.field159, field796[var5], field796[var5 + 1]);
                            continue;
                        }
                        if (var481 == 3103) {
                            client.method2263();
                            continue;
                        }
                        if (var481 == 3104) {
                            var6--;
                            String var117 = field792[var6];
                            int var118 = 0;
                            if (class163.method741(var117)) {
                                var118 = class163.method664(var117);
                            }
                            client.field312.method2612(150);
                            client.field312.method2327(var118);
                            continue;
                        }
                        if (var481 == 3105) {
                            var6--;
                            String var119 = field792[var6];
                            client.field312.method2612(24);
                            client.field312.method2322(var119.length() + 1);
                            client.field312.method2328(var119);
                            continue;
                        }
                        if (var481 == 3106) {
                            var6--;
                            String var120 = field792[var6];
                            client.field312.method2612(99);
                            client.field312.method2322(var120.length() + 1);
                            client.field312.method2328(var120);
                            continue;
                        }
                        if (var481 == 3107) {
                            var5--;
                            int var121 = field796[var5];
                            var6--;
                            String var122 = field792[var6];
                            client.method194(var121, var122);
                            continue;
                        }
                        if (var481 == 3108) {
                            var5 -= 3;
                            int var123 = field796[var5];
                            int var124 = field796[var5 + 1];
                            int var125 = field796[var5 + 2];
                            class173 var126 = class173.method2550(var125);
                            client.method746(var126, var123, var124);
                            continue;
                        }
                        if (var481 == 3109) {
                            var5 -= 2;
                            int var127 = field796[var5];
                            int var128 = field796[var5 + 1];
                            class173 var129 = var62 ? Statics.field3169 : Statics.field1940;
                            client.method746(var129, var127, var128);
                            continue;
                        }
                        if (var481 == 3110) {
                            var5--;
                            Statics.field977 = field796[var5] == 1;
                            continue;
                        }
                        if (var481 == 3111) {
                            field796[var5++] = Statics.field2908.field133 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3112) {
                            var5--;
                            Statics.field2908.field133 = field796[var5] == 1;
                            class9.method96();
                            continue;
                        }
                        if (var481 == 3113) {
                            var6--;
                            String var130 = field792[var6];
                            var5--;
                            boolean var131 = field796[var5] == 1;
                            class138.method49(var130, var131, false);
                            continue;
                        }
                        if (var481 == 3115) {
                            var5--;
                            int var132 = field796[var5];
                            client.field312.method2612(6);
                            client.field312.method2481(var132);
                            continue;
                        }
                        if (var481 == 3116) {
                            var5--;
                            int var133 = field796[var5];
                            var6 -= 2;
                            String var134 = field792[var6];
                            String var135 = field792[var6 + 1];
                            if (var134.length() <= 500 && var135.length() <= 500) {
                                client.field312.method2612(111);
                                client.field312.method2481(1 + Statics.method2215(var134) + Statics.method2215(var135));
                                client.field312.method2328(var134);
                                client.field312.method2362(var133);
                                client.field312.method2328(var135);
                            }
                            continue;
                        }
                    } else if (var481 < 3300) {
                        if (var481 == 3200) {
                            var5 -= 3;
                            client.method752(field796[var5], field796[var5 + 1], field796[var5 + 2]);
                            continue;
                        }
                        if (var481 == 3201) {
                            var5--;
                            client.method99(field796[var5]);
                            continue;
                        }
                        if (var481 == 3202) {
                            var5 -= 2;
                            int var136 = field796[var5];
                            int var10000 = field796[var5 + 1];
                            if (client.field302 != 0 && var136 != -1) {
                                class183.method2959(Statics.field1206, var136, 0, client.field302, false);
                                client.field514 = true;
                            }
                            continue;
                        }
                    } else if (var481 < 3400) {
                        if (var481 == 3300) {
                            field796[var5++] = client.field288;
                            continue;
                        }
                        if (var481 == 3301) {
                            var5 -= 2;
                            int var138 = field796[var5];
                            int var139 = field796[var5 + 1];
                            int[] var140 = field796;
                            int var141 = var5++;
                            class16 var142 = (class16) class16.field210.method3545((long) var138);
                            int var143;
                            if (var142 == null) {
                                var143 = -1;
                            } else if (var139 >= 0 && var139 < var142.field209.length) {
                                var143 = var142.field209[var139];
                            } else {
                                var143 = -1;
                            }
                            var140[var141] = var143;
                            continue;
                        }
                        if (var481 == 3302) {
                            var5 -= 2;
                            int var144 = field796[var5];
                            int var145 = field796[var5 + 1];
                            field796[var5++] = class16.method2778(var144, var145);
                            continue;
                        }
                        if (var481 == 3303) {
                            var5 -= 2;
                            int var146 = field796[var5];
                            int var147 = field796[var5 + 1];
                            field796[var5++] = class16.method1742(var146, var147);
                            continue;
                        }
                        if (var481 == 3304) {
                            var5--;
                            int var148 = field796[var5];
                            int[] var149 = field796;
                            int var150 = var5++;
                            class51 var151 = (class51) class51.field1091.method3510((long) var148);
                            class51 var152;
                            if (var151 == null) {
                                byte[] var153 = Statics.field1092.method3057(5, var148);
                                class51 var154 = new class51();
                                if (var153 != null) {
                                    var154.method979(new class119(var153));
                                }
                                class51.field1091.method3512(var154, (long) var148);
                                var152 = var154;
                            } else {
                                var152 = var151;
                            }
                            var149[var150] = var152.field1090;
                            continue;
                        }
                        if (var481 == 3305) {
                            var5--;
                            int var155 = field796[var5];
                            field796[var5++] = client.field411[var155];
                            continue;
                        }
                        if (var481 == 3306) {
                            var5--;
                            int var156 = field796[var5];
                            field796[var5++] = client.field412[var156];
                            continue;
                        }
                        if (var481 == 3307) {
                            var5--;
                            int var157 = field796[var5];
                            field796[var5++] = client.field413[var157];
                            continue;
                        }
                        if (var481 == 3308) {
                            int var158 = Statics.field575;
                            int var159 = (Statics.field159.field845 >> 7) + Statics.field253;
                            int var160 = (Statics.field159.field812 >> 7) + Statics.field2902;
                            field796[var5++] = (var158 << 28) + (var159 << 14) + var160;
                            continue;
                        }
                        if (var481 == 3309) {
                            var5--;
                            int var161 = field796[var5];
                            field796[var5++] = var161 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var481 == 3310) {
                            var5--;
                            int var162 = field796[var5];
                            field796[var5++] = var162 >> 28;
                            continue;
                        }
                        if (var481 == 3311) {
                            var5--;
                            int var163 = field796[var5];
                            field796[var5++] = var163 & 0x3FFF;
                            continue;
                        }
                        if (var481 == 3312) {
                            field796[var5++] = client.field282 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3313) {
                            var5 -= 2;
                            int var164 = field796[var5] + 32768;
                            int var165 = field796[var5 + 1];
                            int[] var166 = field796;
                            int var167 = var5++;
                            class16 var168 = (class16) class16.field210.method3545((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = -1;
                            } else if (var165 >= 0 && var165 < var168.field209.length) {
                                var169 = var168.field209[var165];
                            } else {
                                var169 = -1;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var481 == 3314) {
                            var5 -= 2;
                            int var170 = field796[var5] + 32768;
                            int var171 = field796[var5 + 1];
                            field796[var5++] = class16.method2778(var170, var171);
                            continue;
                        }
                        if (var481 == 3315) {
                            var5 -= 2;
                            int var172 = field796[var5] + 32768;
                            int var173 = field796[var5 + 1];
                            field796[var5++] = class16.method1742(var172, var173);
                            continue;
                        }
                        if (var481 == 3316) {
                            if (client.field442 >= 2) {
                                field796[var5++] = client.field442;
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                        if (var481 == 3317) {
                            field796[var5++] = client.field295;
                            continue;
                        }
                        if (var481 == 3318) {
                            field796[var5++] = client.field543;
                            continue;
                        }
                        if (var481 == 3321) {
                            field796[var5++] = client.field369;
                            continue;
                        }
                        if (var481 == 3322) {
                            field796[var5++] = client.field455;
                            continue;
                        }
                        if (var481 == 3323) {
                            if (client.field444) {
                                field796[var5++] = 1;
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                        if (var481 == 3324) {
                            field796[var5++] = client.field435;
                            continue;
                        }
                    } else if (var481 < 3500) {
                        if (var481 == 3400) {
                            var5 -= 2;
                            int var174 = field796[var5];
                            int var175 = field796[var5 + 1];
                            class49 var176 = (class49) class49.field1067.method3510((long) var174);
                            class49 var177;
                            if (var176 == null) {
                                byte[] var178 = Statics.field1080.method3057(8, var174);
                                class49 var179 = new class49();
                                if (var178 != null) {
                                    var179.method961(new class119(var178));
                                }
                                class49.field1067.method3512(var179, (long) var174);
                                var177 = var179;
                            } else {
                                var177 = var176;
                            }
                            class49 var180 = var177;
                            if (var177.field1069 != 's') {
                            }
                            for (int var181 = 0; var181 < var180.field1072; var181++) {
                                if (var180.field1073[var181] == var175) {
                                    field792[var6++] = var180.field1075[var181];
                                    var180 = null;
                                    break;
                                }
                            }
                            if (var180 != null) {
                                field792[var6++] = var180.field1070;
                            }
                            continue;
                        }
                        if (var481 == 3408) {
                            var5 -= 4;
                            int var182 = field796[var5];
                            int var183 = field796[var5 + 1];
                            int var184 = field796[var5 + 2];
                            int var185 = field796[var5 + 3];
                            class49 var186 = class49.method1551(var184);
                            if (var186.field1068 == var182 && var186.field1069 == var183) {
                                for (int var187 = 0; var187 < var186.field1072; var187++) {
                                    if (var186.field1073[var187] == var185) {
                                        if (var183 == 115) {
                                            field792[var6++] = var186.field1075[var187];
                                        } else {
                                            field796[var5++] = var186.field1066[var187];
                                        }
                                        var186 = null;
                                        break;
                                    }
                                }
                                if (var186 != null) {
                                    if (var183 == 115) {
                                        field792[var6++] = var186.field1070;
                                    } else {
                                        field796[var5++] = var186.field1071;
                                    }
                                }
                                continue;
                            }
                            if (var183 == 115) {
                                field792[var6++] = "null";
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var481 < 3700) {
                        if (var481 == 3600) {
                            if (client.field544 == 0) {
                                field796[var5++] = -2;
                            } else if (client.field544 == 1) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = client.field293;
                            }
                            continue;
                        }
                        if (var481 == 3601) {
                            var5--;
                            int var188 = field796[var5];
                            if (client.field544 == 2 && var188 < client.field293) {
                                field792[var6++] = client.field545[var188].field239;
                                field792[var6++] = client.field545[var188].field234;
                                continue;
                            }
                            field792[var6++] = "";
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 3602) {
                            var5--;
                            int var189 = field796[var5];
                            if (client.field544 == 2 && var189 < client.field293) {
                                field796[var5++] = client.field545[var189].field236;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var481 == 3603) {
                            var5--;
                            int var190 = field796[var5];
                            if (client.field544 == 2 && var190 < client.field293) {
                                field796[var5++] = client.field545[var190].field237;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var481 == 3604) {
                            var6--;
                            String var191 = field792[var6];
                            var5--;
                            int var192 = field796[var5];
                            Statics.method161(var191, var192);
                            continue;
                        }
                        if (var481 == 3605) {
                            var6--;
                            String var193 = field792[var6];
                            client.method5(var193);
                            continue;
                        }
                        if (var481 == 3606) {
                            var6--;
                            String var194 = field792[var6];
                            if (var194 == null) {
                                continue;
                            }
                            String var195 = class164.method928(var194, Statics.field281);
                            if (var195 == null) {
                                continue;
                            }
                            int var196 = 0;
                            while (true) {
                                if (var196 >= client.field293) {
                                    continue label2967;
                                }
                                class18 var197 = client.field545[var196];
                                String var198 = var197.field239;
                                String var199 = class164.method928(var198, Statics.field281);
                                boolean var200;
                                if (var194 == null || var198 == null) {
                                    var200 = false;
                                } else if (var194.startsWith("#") || var198.startsWith("#")) {
                                    var200 = var194.equals(var198);
                                } else {
                                    var200 = var195.equals(var199);
                                }
                                if (var200) {
                                    client.field293--;
                                    for (int var201 = var196; var201 < client.field293; var201++) {
                                        client.field545[var201] = client.field545[var201 + 1];
                                    }
                                    client.field468 = client.field460;
                                    client.field312.method2612(7);
                                    client.field312.method2322(Statics.method2215(var194));
                                    client.field312.method2328(var194);
                                    continue label2967;
                                }
                                var196++;
                            }
                        }
                        if (var481 == 3607) {
                            var6--;
                            String var202 = field792[var6];
                            client.method2217(var202, false);
                            continue;
                        }
                        if (var481 == 3608) {
                            var6--;
                            String var203 = field792[var6];
                            client.method170(var203);
                            continue;
                        }
                        if (var481 == 3609) {
                            var6--;
                            String var204 = field792[var6];
                            class152[] var205 = new class152[] { class152.field2261, class152.field2268, class152.field2260, class152.field2263, class152.field2262 };
                            class152[] var206 = var205;
                            for (int var207 = 0; var207 < var206.length; var207++) {
                                class152 var208 = var206[var207];
                                if (var208.field2266 != -1) {
                                    int var210 = var208.field2266;
                                    String var211 = "<img=" + var210 + ">";
                                    if (var204.startsWith(var211)) {
                                        var204 = var204.substring(6 + Integer.toString(var208.field2266).length());
                                        break;
                                    }
                                }
                            }
                            field796[var5++] = client.method191(var204, false) ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3611) {
                            if (client.field422 == null) {
                                field792[var6++] = "";
                                continue;
                            }
                            String[] var212 = field792;
                            int var213 = var6++;
                            String var214 = client.field422;
                            long var215 = 0L;
                            int var217 = var214.length();
                            for (int var218 = 0; var218 < var217; var218++) {
                                var215 *= 37L;
                                char var219 = var214.charAt(var218);
                                if (var219 >= 'A' && var219 <= 'Z') {
                                    var215 += (long) (var219 + 1 - 65);
                                } else if (var219 >= 'a' && var219 <= 'z') {
                                    var215 += (long) (var219 + 1 - 97);
                                } else if (var219 >= '0' && var219 <= '9') {
                                    var215 += (long) (var219 + 27 - 48);
                                }
                                if (var215 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var215 % 37L == 0L && var215 != 0L) {
                                var215 /= 37L;
                            }
                            String var222 = class162.method569(var215);
                            if (var222 == null) {
                                var222 = "";
                            }
                            var212[var213] = var222;
                            continue;
                        }
                        if (var481 == 3612) {
                            if (client.field422 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = Statics.field148;
                            }
                            continue;
                        }
                        if (var481 == 3613) {
                            var5--;
                            int var224 = field796[var5];
                            if (client.field422 != null && var224 < Statics.field148) {
                                field792[var6++] = Statics.field1658[var224].field618;
                                continue;
                            }
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 3614) {
                            var5--;
                            int var225 = field796[var5];
                            if (client.field422 != null && var225 < Statics.field148) {
                                field796[var5++] = Statics.field1658[var225].field630;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var481 == 3615) {
                            var5--;
                            int var226 = field796[var5];
                            if (client.field422 != null && var226 < Statics.field148) {
                                field796[var5++] = Statics.field1658[var226].field616;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var481 == 3616) {
                            field796[var5++] = Statics.field706;
                            continue;
                        }
                        if (var481 == 3617) {
                            var6--;
                            String var227 = field792[var6];
                            client.method197(var227);
                            continue;
                        }
                        if (var481 == 3618) {
                            field796[var5++] = Statics.field2000;
                            continue;
                        }
                        if (var481 == 3619) {
                            var6--;
                            String var228 = field792[var6];
                            client.method190(var228);
                            continue;
                        }
                        if (var481 == 3620) {
                            client.method2806();
                            continue;
                        }
                        if (var481 == 3621) {
                            if (client.field544 == 0) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = client.field547;
                            }
                            continue;
                        }
                        if (var481 == 3622) {
                            var5--;
                            int var229 = field796[var5];
                            if (client.field544 != 0 && var229 < client.field547) {
                                field792[var6++] = client.field548[var229].field124;
                                field792[var6++] = client.field548[var229].field123;
                                continue;
                            }
                            field792[var6++] = "";
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 3623) {
                            String var230;
                            label2677: {
                                var6--;
                                var230 = field792[var6];
                                String var232 = "<img=0>";
                                if (!var230.startsWith(var232)) {
                                    String var234 = "<img=1>";
                                    if (!var230.startsWith(var234)) {
                                        break label2677;
                                    }
                                }
                                var230 = var230.substring(7);
                            }
                            field796[var5++] = client.method83(var230) ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3624) {
                            var5--;
                            int var235 = field796[var5];
                            if (Statics.field1658 != null && var235 < Statics.field148 && Statics.field1658[var235].field618.equalsIgnoreCase(Statics.field159.field58)) {
                                field796[var5++] = 1;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var481 == 3625) {
                            if (client.field316 == null) {
                                field792[var6++] = "";
                                continue;
                            }
                            String[] var236 = field792;
                            int var237 = var6++;
                            String var238 = client.field316;
                            long var239 = 0L;
                            int var241 = var238.length();
                            for (int var242 = 0; var242 < var241; var242++) {
                                var239 *= 37L;
                                char var243 = var238.charAt(var242);
                                if (var243 >= 'A' && var243 <= 'Z') {
                                    var239 += (long) (var243 + 1 - 65);
                                } else if (var243 >= 'a' && var243 <= 'z') {
                                    var239 += (long) (var243 + 1 - 97);
                                } else if (var243 >= '0' && var243 <= '9') {
                                    var239 += (long) (var243 + 27 - 48);
                                }
                                if (var239 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var239 % 37L == 0L && var239 != 0L) {
                                var239 /= 37L;
                            }
                            String var246 = class162.method569(var239);
                            if (var246 == null) {
                                var246 = "";
                            }
                            var236[var237] = var246;
                            continue;
                        }
                    } else if (var481 < 4000) {
                        if (var481 == 3903) {
                            var5--;
                            int var248 = field796[var5];
                            field796[var5++] = client.field540[var248].method3742();
                            continue;
                        }
                        if (var481 == 3904) {
                            var5--;
                            int var249 = field796[var5];
                            field796[var5++] = client.field540[var249].field3155;
                            continue;
                        }
                        if (var481 == 3905) {
                            var5--;
                            int var250 = field796[var5];
                            field796[var5++] = client.field540[var250].field3156;
                            continue;
                        }
                        if (var481 == 3906) {
                            var5--;
                            int var251 = field796[var5];
                            field796[var5++] = client.field540[var251].field3160;
                            continue;
                        }
                        if (var481 == 3907) {
                            var5--;
                            int var252 = field796[var5];
                            field796[var5++] = client.field540[var252].field3157;
                            continue;
                        }
                        if (var481 == 3908) {
                            var5--;
                            int var253 = field796[var5];
                            field796[var5++] = client.field540[var253].field3159;
                            continue;
                        }
                        if (var481 == 3910) {
                            var5--;
                            int var254 = field796[var5];
                            int var255 = client.field540[var254].method3734();
                            field796[var5++] = var255 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3911) {
                            var5--;
                            int var256 = field796[var5];
                            int var257 = client.field540[var256].method3734();
                            field796[var5++] = var257 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3912) {
                            var5--;
                            int var258 = field796[var5];
                            int var259 = client.field540[var258].method3734();
                            field796[var5++] = var259 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3913) {
                            var5--;
                            int var260 = field796[var5];
                            int var261 = client.field540[var260].method3734();
                            field796[var5++] = var261 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 3914) {
                            var5--;
                            boolean var262 = field796[var5] == 1;
                            if (Statics.field2635 != null) {
                                Statics.field2635.method3751(class221.field3165, var262);
                            }
                            continue;
                        }
                        if (var481 == 3915) {
                            var5--;
                            boolean var263 = field796[var5] == 1;
                            if (Statics.field2635 != null) {
                                Statics.field2635.method3751(class221.field3161, var263);
                            }
                            continue;
                        }
                        if (var481 == 3916) {
                            var5 -= 2;
                            boolean var264 = field796[var5] == 1;
                            boolean var265 = field796[var5 + 1] == 1;
                            if (Statics.field2635 != null) {
                                Statics.field2635.method3751(new class22(var265), var264);
                            }
                            continue;
                        }
                        if (var481 == 3917) {
                            var5--;
                            boolean var266 = field796[var5] == 1;
                            if (Statics.field2635 != null) {
                                Statics.field2635.method3751(class221.field3162, var266);
                            }
                            continue;
                        }
                        if (var481 == 3918) {
                            var5--;
                            boolean var267 = field796[var5] == 1;
                            if (Statics.field2635 != null) {
                                Statics.field2635.method3751(class221.field3163, var267);
                            }
                            continue;
                        }
                        if (var481 == 3919) {
                            field796[var5++] = Statics.field2635 == null ? 0 : Statics.field2635.field3164.size();
                            continue;
                        }
                        if (var481 == 3920) {
                            var5--;
                            int var268 = field796[var5];
                            class214 var269 = (class214) Statics.field2635.field3164.get(var268);
                            field796[var5++] = var269.field3138;
                            continue;
                        }
                        if (var481 == 3921) {
                            var5--;
                            int var270 = field796[var5];
                            class214 var271 = (class214) Statics.field2635.field3164.get(var270);
                            field792[var6++] = var271.method3698();
                            continue;
                        }
                        if (var481 == 3922) {
                            var5--;
                            int var272 = field796[var5];
                            class214 var273 = (class214) Statics.field2635.field3164.get(var272);
                            field792[var6++] = var273.method3699();
                            continue;
                        }
                        if (var481 == 3923) {
                            var5--;
                            int var274 = field796[var5];
                            class214 var275 = (class214) Statics.field2635.field3164.get(var274);
                            long var276 = class115.method102() - Statics.field1033 - var275.field3139;
                            int var278 = (int) (var276 / 3600000L);
                            int var279 = (int) ((var276 - (long) (var278 * 3600000)) / 60000L);
                            int var280 = (int) ((var276 - (long) (var278 * 3600000) - (long) (var279 * 60000)) / 1000L);
                            String var281 = var278 + ":" + var279 / 10 + var279 % 10 + ":" + var280 / 10 + var280 % 10;
                            field792[var6++] = var281;
                            continue;
                        }
                        if (var481 == 3924) {
                            var5--;
                            int var282 = field796[var5];
                            class214 var283 = (class214) Statics.field2635.field3164.get(var282);
                            field796[var5++] = var283.field3140.field3160;
                            continue;
                        }
                        if (var481 == 3925) {
                            var5--;
                            int var284 = field796[var5];
                            class214 var285 = (class214) Statics.field2635.field3164.get(var284);
                            field796[var5++] = var285.field3140.field3156;
                            continue;
                        }
                        if (var481 == 3926) {
                            var5--;
                            int var286 = field796[var5];
                            class214 var287 = (class214) Statics.field2635.field3164.get(var286);
                            field796[var5++] = var287.field3140.field3155;
                            continue;
                        }
                    } else if (var481 < 4100) {
                        if (var481 == 4000) {
                            var5 -= 2;
                            int var288 = field796[var5];
                            int var289 = field796[var5 + 1];
                            field796[var5++] = var288 + var289;
                            continue;
                        }
                        if (var481 == 4001) {
                            var5 -= 2;
                            int var290 = field796[var5];
                            int var291 = field796[var5 + 1];
                            field796[var5++] = var290 - var291;
                            continue;
                        }
                        if (var481 == 4002) {
                            var5 -= 2;
                            int var292 = field796[var5];
                            int var293 = field796[var5 + 1];
                            field796[var5++] = var292 * var293;
                            continue;
                        }
                        if (var481 == 4003) {
                            var5 -= 2;
                            int var294 = field796[var5];
                            int var295 = field796[var5 + 1];
                            field796[var5++] = var294 / var295;
                            continue;
                        }
                        if (var481 == 4004) {
                            var5--;
                            int var296 = field796[var5];
                            field796[var5++] = (int) (Math.random() * (double) var296);
                            continue;
                        }
                        if (var481 == 4005) {
                            var5--;
                            int var297 = field796[var5];
                            field796[var5++] = (int) (Math.random() * (double) (var297 + 1));
                            continue;
                        }
                        if (var481 == 4006) {
                            var5 -= 5;
                            int var298 = field796[var5];
                            int var299 = field796[var5 + 1];
                            int var300 = field796[var5 + 2];
                            int var301 = field796[var5 + 3];
                            int var302 = field796[var5 + 4];
                            field796[var5++] = (var299 - var298) * (var302 - var300) / (var301 - var300) + var298;
                            continue;
                        }
                        if (var481 == 4007) {
                            var5 -= 2;
                            int var303 = field796[var5];
                            int var304 = field796[var5 + 1];
                            field796[var5++] = var303 * var304 / 100 + var303;
                            continue;
                        }
                        if (var481 == 4008) {
                            var5 -= 2;
                            int var305 = field796[var5];
                            int var306 = field796[var5 + 1];
                            field796[var5++] = var305 | 0x1 << var306;
                            continue;
                        }
                        if (var481 == 4009) {
                            var5 -= 2;
                            int var307 = field796[var5];
                            int var308 = field796[var5 + 1];
                            field796[var5++] = var307 & -1 - (0x1 << var308);
                            continue;
                        }
                        if (var481 == 4010) {
                            var5 -= 2;
                            int var309 = field796[var5];
                            int var310 = field796[var5 + 1];
                            field796[var5++] = (var309 & 0x1 << var310) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var481 == 4011) {
                            var5 -= 2;
                            int var311 = field796[var5];
                            int var312 = field796[var5 + 1];
                            field796[var5++] = var311 % var312;
                            continue;
                        }
                        if (var481 == 4012) {
                            var5 -= 2;
                            int var313 = field796[var5];
                            int var314 = field796[var5 + 1];
                            if (var313 == 0) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = (int) Math.pow((double) var313, (double) var314);
                            }
                            continue;
                        }
                        if (var481 == 4013) {
                            var5 -= 2;
                            int var315 = field796[var5];
                            int var316 = field796[var5 + 1];
                            if (var315 == 0) {
                                field796[var5++] = 0;
                            } else if (var316 == 0) {
                                field796[var5++] = Integer.MAX_VALUE;
                            } else {
                                field796[var5++] = (int) Math.pow((double) var315, 1.0D / (double) var316);
                            }
                            continue;
                        }
                        if (var481 == 4014) {
                            var5 -= 2;
                            int var317 = field796[var5];
                            int var318 = field796[var5 + 1];
                            field796[var5++] = var317 & var318;
                            continue;
                        }
                        if (var481 == 4015) {
                            var5 -= 2;
                            int var319 = field796[var5];
                            int var320 = field796[var5 + 1];
                            field796[var5++] = var319 | var320;
                            continue;
                        }
                    } else if (var481 < 4200) {
                        if (var481 == 4100) {
                            var6--;
                            String var321 = field792[var6];
                            var5--;
                            int var322 = field796[var5];
                            field792[var6++] = var321 + var322;
                            continue;
                        }
                        if (var481 == 4101) {
                            var6 -= 2;
                            String var323 = field792[var6];
                            String var324 = field792[var6 + 1];
                            field792[var6++] = var323 + var324;
                            continue;
                        }
                        if (var481 == 4102) {
                            var6--;
                            String var325 = field792[var6];
                            var5--;
                            int var326 = field796[var5];
                            String[] var327 = field792;
                            int var328 = var6++;
                            String var330;
                            if (var326 < 0) {
                                var330 = Integer.toString(var326);
                            } else {
                                var330 = class163.method1452(var326, 10, true);
                            }
                            var327[var328] = var325 + var330;
                            continue;
                        }
                        if (var481 == 4103) {
                            var6--;
                            String var331 = field792[var6];
                            field792[var6++] = var331.toLowerCase();
                            continue;
                        }
                        if (var481 == 4104) {
                            var5--;
                            int var332 = field796[var5];
                            long var333 = ((long) var332 + 11745L) * 86400000L;
                            field800.setTime(new Date(var333));
                            int var335 = field800.get(5);
                            int var336 = field800.get(2);
                            int var337 = field800.get(1);
                            field792[var6++] = var335 + "-" + field801[var336] + "-" + var337;
                            continue;
                        }
                        if (var481 == 4105) {
                            var6 -= 2;
                            String var338 = field792[var6];
                            String var339 = field792[var6 + 1];
                            if (Statics.field159.field33 != null && Statics.field159.field33.field2912) {
                                field792[var6++] = var339;
                                continue;
                            }
                            field792[var6++] = var338;
                            continue;
                        }
                        if (var481 == 4106) {
                            var5--;
                            int var340 = field796[var5];
                            field792[var6++] = Integer.toString(var340);
                            continue;
                        }
                        if (var481 == 4107) {
                            var6 -= 2;
                            int[] var341 = field796;
                            int var342 = var5++;
                            String var343 = field792[var6];
                            String var344 = field792[var6 + 1];
                            int var345 = client.field284;
                            int var346 = var343.length();
                            int var347 = var344.length();
                            int var348 = 0;
                            int var349 = 0;
                            char var350 = 0;
                            char var351 = 0;
                            int var352;
                            label2769: while (true) {
                                if (var348 - var350 >= var346 && var349 - var351 >= var347) {
                                    int var361 = Math.min(var346, var347);
                                    for (int var362 = 0; var362 < var361; var362++) {
                                        char var365 = var343.charAt(var362);
                                        char var366 = var344.charAt(var362);
                                        if (var365 != var366 && Character.toUpperCase(var365) != Character.toUpperCase(var366)) {
                                            char var367 = Character.toLowerCase(var365);
                                            char var368 = Character.toLowerCase(var366);
                                            if (var367 != var368) {
                                                var352 = class166.method3(var367, var345) - class166.method3(var368, var345);
                                                break label2769;
                                            }
                                        }
                                    }
                                    int var369 = var346 - var347;
                                    if (var369 == 0) {
                                        for (int var370 = 0; var370 < var361; var370++) {
                                            char var371 = var343.charAt(var370);
                                            char var372 = var344.charAt(var370);
                                            if (var371 != var372) {
                                                var352 = class166.method3(var371, var345) - class166.method3(var372, var345);
                                                break label2769;
                                            }
                                        }
                                        var352 = 0;
                                    } else {
                                        var352 = var369;
                                    }
                                    break;
                                }
                                if (var348 - var350 >= var346) {
                                    var352 = -1;
                                    break;
                                }
                                if (var349 - var351 >= var347) {
                                    var352 = 1;
                                    break;
                                }
                                char var353;
                                if (var350 == 0) {
                                    var353 = var343.charAt(var348++);
                                } else {
                                    var353 = var350;
                                    boolean var354 = false;
                                }
                                char var355;
                                if (var351 == 0) {
                                    var355 = var344.charAt(var349++);
                                } else {
                                    var355 = var351;
                                    boolean var356 = false;
                                }
                                var350 = class166.method2942(var353);
                                var351 = class166.method2942(var355);
                                char var357 = Statics.method1547(var353, var345);
                                char var358 = Statics.method1547(var355, var345);
                                if (var357 != var358 && Character.toUpperCase(var357) != Character.toUpperCase(var358)) {
                                    char var359 = Character.toLowerCase(var357);
                                    char var360 = Character.toLowerCase(var358);
                                    if (var359 != var360) {
                                        var352 = class166.method3(var359, var345) - class166.method3(var360, var345);
                                        break;
                                    }
                                }
                            }
                            var341[var342] = class163.method2981(var352);
                            continue;
                        }
                        if (var481 == 4108) {
                            var6--;
                            String var373 = field792[var6];
                            var5 -= 2;
                            int var374 = field796[var5];
                            int var375 = field796[var5 + 1];
                            byte[] var376 = Statics.field2634.method3057(var375, 0);
                            class224 var377 = new class224(var376);
                            field796[var5++] = var377.method3769(var373, var374);
                            continue;
                        }
                        if (var481 == 4109) {
                            var6--;
                            String var378 = field792[var6];
                            var5 -= 2;
                            int var379 = field796[var5];
                            int var380 = field796[var5 + 1];
                            byte[] var381 = Statics.field2634.method3057(var380, 0);
                            class224 var382 = new class224(var381);
                            field796[var5++] = var382.method3823(var378, var379);
                            continue;
                        }
                        if (var481 == 4110) {
                            var6 -= 2;
                            String var383 = field792[var6];
                            String var384 = field792[var6 + 1];
                            var5--;
                            if (field796[var5] == 1) {
                                field792[var6++] = var383;
                            } else {
                                field792[var6++] = var384;
                            }
                            continue;
                        }
                        if (var481 == 4111) {
                            var6--;
                            String var385 = field792[var6];
                            field792[var6++] = class223.method3770(var385);
                            continue;
                        }
                        if (var481 == 4112) {
                            var6--;
                            String var386 = field792[var6];
                            var5--;
                            int var387 = field796[var5];
                            field792[var6++] = var386 + (char) var387;
                            continue;
                        }
                        if (var481 == 4113) {
                            var5--;
                            int var388 = field796[var5];
                            field796[var5++] = class163.method2957((char) var388) ? 1 : 0;
                            continue;
                        }
                        if (var481 == 4114) {
                            var5--;
                            int var389 = field796[var5];
                            int[] var390 = field796;
                            int var391 = var5++;
                            char var392 = (char) var389;
                            boolean var393 = var392 >= '0' && var392 <= '9' || var392 >= 'A' && var392 <= 'Z' || var392 >= 'a' && var392 <= 'z';
                            var390[var391] = var393 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 4115) {
                            var5--;
                            int var394 = field796[var5];
                            field796[var5++] = class163.method3131((char) var394) ? 1 : 0;
                            continue;
                        }
                        if (var481 == 4116) {
                            var5--;
                            int var395 = field796[var5];
                            int[] var396 = field796;
                            int var397 = var5++;
                            char var398 = (char) var395;
                            boolean var399 = var398 >= '0' && var398 <= '9';
                            var396[var397] = var399 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 4117) {
                            var6--;
                            String var400 = field792[var6];
                            if (var400 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var400.length();
                            }
                            continue;
                        }
                        if (var481 == 4118) {
                            var6--;
                            String var401 = field792[var6];
                            var5 -= 2;
                            int var402 = field796[var5];
                            int var403 = field796[var5 + 1];
                            field792[var6++] = var401.substring(var402, var403);
                            continue;
                        }
                        if (var481 == 4119) {
                            var6--;
                            String var404 = field792[var6];
                            StringBuilder var405 = new StringBuilder(var404.length());
                            boolean var406 = false;
                            for (int var407 = 0; var407 < var404.length(); var407++) {
                                char var408 = var404.charAt(var407);
                                if (var408 == '<') {
                                    var406 = true;
                                } else if (var408 == '>') {
                                    var406 = false;
                                } else if (!var406) {
                                    var405.append(var408);
                                }
                            }
                            field792[var6++] = var405.toString();
                            continue;
                        }
                        if (var481 == 4120) {
                            var6--;
                            String var409 = field792[var6];
                            var5--;
                            int var410 = field796[var5];
                            field796[var5++] = var409.indexOf(var410);
                            continue;
                        }
                        if (var481 == 4121) {
                            var6 -= 2;
                            String var411 = field792[var6];
                            String var412 = field792[var6 + 1];
                            var5--;
                            int var413 = field796[var5];
                            field796[var5++] = var411.indexOf(var412, var413);
                            continue;
                        }
                    } else if (var481 < 4300) {
                        if (var481 == 4200) {
                            var5--;
                            int var414 = field796[var5];
                            field792[var6++] = class52.method1933(var414).field1105;
                            continue;
                        }
                        if (var481 == 4201) {
                            var5 -= 2;
                            int var415 = field796[var5];
                            int var416 = field796[var5 + 1];
                            class52 var417 = class52.method1933(var415);
                            if (var416 >= 1 && var416 <= 5 && var417.field1106[var416 - 1] != null) {
                                field792[var6++] = var417.field1106[var416 - 1];
                                continue;
                            }
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 4202) {
                            var5 -= 2;
                            int var418 = field796[var5];
                            int var419 = field796[var5 + 1];
                            class52 var420 = class52.method1933(var418);
                            if (var419 >= 1 && var419 <= 5 && var420.field1117[var419 - 1] != null) {
                                field792[var6++] = var420.field1117[var419 - 1];
                                continue;
                            }
                            field792[var6++] = "";
                            continue;
                        }
                        if (var481 == 4203) {
                            var5--;
                            int var421 = field796[var5];
                            field796[var5++] = class52.method1933(var421).field1115;
                            continue;
                        }
                        if (var481 == 4204) {
                            var5--;
                            int var422 = field796[var5];
                            field796[var5++] = class52.method1933(var422).field1102 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 4205) {
                            var5--;
                            int var423 = field796[var5];
                            class52 var424 = class52.method1933(var423);
                            if (var424.field1136 == -1 && var424.field1135 >= 0) {
                                field796[var5++] = var424.field1135;
                                continue;
                            }
                            field796[var5++] = var423;
                            continue;
                        }
                        if (var481 == 4206) {
                            var5--;
                            int var425 = field796[var5];
                            class52 var426 = class52.method1933(var425);
                            if (var426.field1136 >= 0 && var426.field1135 >= 0) {
                                field796[var5++] = var426.field1135;
                                continue;
                            }
                            field796[var5++] = var425;
                            continue;
                        }
                        if (var481 == 4207) {
                            var5--;
                            int var427 = field796[var5];
                            field796[var5++] = class52.method1933(var427).field1118 ? 1 : 0;
                            continue;
                        }
                        if (var481 == 4210) {
                            var6--;
                            String var428 = field792[var6];
                            var5--;
                            int var429 = field796[var5];
                            client.method153(var428, var429 == 1);
                            field796[var5++] = Statics.field798;
                            continue;
                        }
                        if (var481 == 4211) {
                            if (Statics.field203 != null && Statics.field1870 < Statics.field798) {
                                field796[var5++] = Statics.field203[++Statics.field1870 - 1] & 0xFFFF;
                                continue;
                            }
                            field796[var5++] = -1;
                            continue;
                        }
                        if (var481 == 4212) {
                            Statics.field1870 = 0;
                            continue;
                        }
                    } else if (var481 < 5100) {
                        if (var481 == 5000) {
                            field796[var5++] = client.field493;
                            continue;
                        }
                        if (var481 == 5001) {
                            var5 -= 3;
                            client.field493 = field796[var5];
                            int var430 = field796[var5 + 1];
                            class130[] var431 = class130.method643();
                            int var432 = 0;
                            class130 var434;
                            while (true) {
                                if (var432 >= var431.length) {
                                    var434 = null;
                                    break;
                                }
                                class130 var433 = var431[var432];
                                if (var433.field2044 == var430) {
                                    var434 = var433;
                                    break;
                                }
                                var432++;
                            }
                            Statics.field193 = var434;
                            if (Statics.field193 == null) {
                                Statics.field193 = class130.field2042;
                            }
                            client.field494 = field796[var5 + 2];
                            client.field312.method2612(197);
                            client.field312.method2322(client.field493);
                            client.field312.method2322(Statics.field193.field2044);
                            client.field312.method2322(client.field494);
                            continue;
                        }
                        if (var481 == 5002) {
                            var6--;
                            String var435 = field792[var6];
                            var5 -= 2;
                            int var436 = field796[var5];
                            int var437 = field796[var5 + 1];
                            client.field312.method2612(23);
                            client.field312.method2322(Statics.method2215(var435) + 2);
                            client.field312.method2328(var435);
                            client.field312.method2322(var436 - 1);
                            client.field312.method2322(var437);
                            continue;
                        }
                        if (var481 == 5003) {
                            var5 -= 2;
                            int var438 = field796[var5];
                            int var439 = field796[var5 + 1];
                            class28 var440 = (class28) class12.field164.get(var438);
                            class36 var441 = var440.method651(var439);
                            if (var441 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                                field792[var6++] = "";
                                field792[var6++] = "";
                            } else {
                                field796[var5++] = var441.field780;
                                field796[var5++] = var441.field789;
                                field792[var6++] = var441.field782 == null ? "" : var441.field782;
                                field792[var6++] = var441.field783 == null ? "" : var441.field783;
                                field792[var6++] = var441.field784 == null ? "" : var441.field784;
                            }
                            continue;
                        }
                        if (var481 == 5004) {
                            var5--;
                            int var443 = field796[var5];
                            class36 var444 = class12.method751(var443);
                            if (var444 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                                field792[var6++] = "";
                                field792[var6++] = "";
                            } else {
                                field796[var5++] = var444.field781;
                                field796[var5++] = var444.field789;
                                field792[var6++] = var444.field782 == null ? "" : var444.field782;
                                field792[var6++] = var444.field783 == null ? "" : var444.field783;
                                field792[var6++] = var444.field784 == null ? "" : var444.field784;
                            }
                            continue;
                        }
                        if (var481 == 5005) {
                            if (Statics.field193 == null) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = Statics.field193.field2044;
                            }
                            continue;
                        }
                        if (var481 == 5008) {
                            var6--;
                            String var445 = field792[var6];
                            var5--;
                            int var446 = field796[var5];
                            String var447 = var445.toLowerCase();
                            byte var448 = 0;
                            if (var447.startsWith(class157.field2483)) {
                                var448 = 0;
                                var445 = var445.substring(class157.field2483.length());
                            } else if (var447.startsWith(class157.field2485)) {
                                var448 = 1;
                                var445 = var445.substring(class157.field2485.length());
                            } else if (var447.startsWith(class157.field2463)) {
                                var448 = 2;
                                var445 = var445.substring(class157.field2463.length());
                            } else if (var447.startsWith(class157.field2318)) {
                                var448 = 3;
                                var445 = var445.substring(class157.field2318.length());
                            } else if (var447.startsWith(class157.field2491)) {
                                var448 = 4;
                                var445 = var445.substring(class157.field2491.length());
                            } else if (var447.startsWith(class157.field2509)) {
                                var448 = 5;
                                var445 = var445.substring(class157.field2509.length());
                            } else if (var447.startsWith(class157.field2495)) {
                                var448 = 6;
                                var445 = var445.substring(class157.field2495.length());
                            } else if (var447.startsWith(class157.field2349)) {
                                var448 = 7;
                                var445 = var445.substring(class157.field2349.length());
                            } else if (var447.startsWith(class157.field2499)) {
                                var448 = 8;
                                var445 = var445.substring(class157.field2499.length());
                            } else if (var447.startsWith(class157.field2501)) {
                                var448 = 9;
                                var445 = var445.substring(class157.field2501.length());
                            } else if (var447.startsWith(class157.field2503)) {
                                var448 = 10;
                                var445 = var445.substring(class157.field2503.length());
                            } else if (var447.startsWith(class157.field2362)) {
                                var448 = 11;
                                var445 = var445.substring(class157.field2362.length());
                            } else if (client.field284 != 0) {
                                if (var447.startsWith(class157.field2455)) {
                                    var448 = 0;
                                    var445 = var445.substring(class157.field2455.length());
                                } else if (var447.startsWith(class157.field2486)) {
                                    var448 = 1;
                                    var445 = var445.substring(class157.field2486.length());
                                } else if (var447.startsWith(class157.field2319)) {
                                    var448 = 2;
                                    var445 = var445.substring(class157.field2319.length());
                                } else if (var447.startsWith(class157.field2490)) {
                                    var448 = 3;
                                    var445 = var445.substring(class157.field2490.length());
                                } else if (var447.startsWith(class157.field2492)) {
                                    var448 = 4;
                                    var445 = var445.substring(class157.field2492.length());
                                } else if (var447.startsWith(class157.field2494)) {
                                    var448 = 5;
                                    var445 = var445.substring(class157.field2494.length());
                                } else if (var447.startsWith(class157.field2496)) {
                                    var448 = 6;
                                    var445 = var445.substring(class157.field2496.length());
                                } else if (var447.startsWith(class157.field2498)) {
                                    var448 = 7;
                                    var445 = var445.substring(class157.field2498.length());
                                } else if (var447.startsWith(class157.field2500)) {
                                    var448 = 8;
                                    var445 = var445.substring(class157.field2500.length());
                                } else if (var447.startsWith(class157.field2502)) {
                                    var448 = 9;
                                    var445 = var445.substring(class157.field2502.length());
                                } else if (var447.startsWith(class157.field2347)) {
                                    var448 = 10;
                                    var445 = var445.substring(class157.field2347.length());
                                } else if (var447.startsWith(class157.field2425)) {
                                    var448 = 11;
                                    var445 = var445.substring(class157.field2425.length());
                                }
                            }
                            String var449 = var445.toLowerCase();
                            byte var450 = 0;
                            if (var449.startsWith(class157.field2580)) {
                                var450 = 1;
                                var445 = var445.substring(class157.field2580.length());
                            } else if (var449.startsWith(class157.field2504)) {
                                var450 = 2;
                                var445 = var445.substring(class157.field2504.length());
                            } else if (var449.startsWith(class157.field2511)) {
                                var450 = 3;
                                var445 = var445.substring(class157.field2511.length());
                            } else if (var449.startsWith(class157.field2513)) {
                                var450 = 4;
                                var445 = var445.substring(class157.field2513.length());
                            } else if (var449.startsWith(class157.field2321)) {
                                var450 = 5;
                                var445 = var445.substring(class157.field2321.length());
                            } else if (client.field284 != 0) {
                                if (var449.startsWith(class157.field2559)) {
                                    var450 = 1;
                                    var445 = var445.substring(class157.field2559.length());
                                } else if (var449.startsWith(class157.field2534)) {
                                    var450 = 2;
                                    var445 = var445.substring(class157.field2534.length());
                                } else if (var449.startsWith(class157.field2512)) {
                                    var450 = 3;
                                    var445 = var445.substring(class157.field2512.length());
                                } else if (var449.startsWith(class157.field2539)) {
                                    var450 = 4;
                                    var445 = var445.substring(class157.field2539.length());
                                } else if (var449.startsWith(class157.field2516)) {
                                    var450 = 5;
                                    var445 = var445.substring(class157.field2516.length());
                                }
                            }
                            client.field312.method2612(10);
                            client.field312.method2322(0);
                            int var451 = client.field312.field1974;
                            client.field312.method2322(var446);
                            client.field312.method2322(var448);
                            client.field312.method2322(var450);
                            class222.method2948(client.field312, var445);
                            client.field312.method2334(client.field312.field1974 - var451);
                            continue;
                        }
                        if (var481 == 5009) {
                            var6 -= 2;
                            String var452 = field792[var6];
                            String var453 = field792[var6 + 1];
                            client.field312.method2612(107);
                            client.field312.method2481(0);
                            int var454 = client.field312.field1974;
                            client.field312.method2328(var452);
                            class222.method2948(client.field312, var453);
                            client.field312.method2432(client.field312.field1974 - var454);
                            continue;
                        }
                        if (var481 == 5015) {
                            String var455;
                            if (Statics.field159 == null || Statics.field159.field58 == null) {
                                var455 = "";
                            } else {
                                var455 = Statics.field159.field58;
                            }
                            field792[var6++] = var455;
                            continue;
                        }
                        if (var481 == 5016) {
                            field796[var5++] = client.field494;
                            continue;
                        }
                        if (var481 == 5017) {
                            var5--;
                            int var456 = field796[var5];
                            field796[var5++] = class12.method89(var456);
                            continue;
                        }
                        if (var481 == 5018) {
                            var5--;
                            int var457 = field796[var5];
                            field796[var5++] = class12.method722(var457);
                            continue;
                        }
                        if (var481 == 5019) {
                            var5--;
                            int var458 = field796[var5];
                            field796[var5++] = class12.method2(var458);
                            continue;
                        }
                        if (var481 == 5020) {
                            var6--;
                            String var459 = field792[var6];
                            if (var459.equalsIgnoreCase("toggleroof")) {
                                Statics.field2908.field133 = !Statics.field2908.field133;
                                class9.method96();
                                if (Statics.field2908.field133) {
                                    class12.method2960(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2960(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var459.equalsIgnoreCase("displayfps")) {
                                client.field509 = !client.field509;
                            }
                            if (client.field442 >= 2) {
                                if (var459.equalsIgnoreCase("fpson")) {
                                    client.field509 = true;
                                }
                                if (var459.equalsIgnoreCase("fpsoff")) {
                                    client.field509 = false;
                                }
                                if (var459.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var459.equalsIgnoreCase("clientdrop")) {
                                    client.method104();
                                }
                                if (var459.equalsIgnoreCase("errortest") && client.field280 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field312.method2612(109);
                            client.field312.method2322(var459.length() + 1);
                            client.field312.method2328(var459);
                            continue;
                        }
                        if (var481 == 5021) {
                            var6--;
                            client.field495 = field792[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var481 == 5022) {
                            field792[var6++] = client.field495;
                            continue;
                        }
                    }
                }
                if (var481 < 5400) {
                    if (var481 == 5306) {
                        field796[var5++] = client.method1503();
                        continue;
                    }
                    if (var481 == 5307) {
                        var5--;
                        int var460 = field796[var5];
                        if (var460 == 1 || var460 == 2) {
                            client.method640(var460);
                        }
                        continue;
                    }
                    if (var481 == 5308) {
                        field796[var5++] = Statics.field2908.field135;
                        continue;
                    }
                    if (var481 == 5309) {
                        var5--;
                        int var461 = field796[var5];
                        if (var461 == 1 || var461 == 2) {
                            Statics.field2908.field135 = var461;
                            class9.method96();
                        }
                        continue;
                    }
                }
                if (var481 < 5600) {
                    if (var481 == 5504) {
                        var5 -= 2;
                        int var462 = field796[var5];
                        int var463 = field796[var5 + 1];
                        if (!client.field406) {
                            client.field360 = var462;
                            client.field361 = var463;
                        }
                        continue;
                    }
                    if (var481 == 5505) {
                        field796[var5++] = client.field360;
                        continue;
                    }
                    if (var481 == 5506) {
                        field796[var5++] = client.field361;
                        continue;
                    }
                    if (var481 == 5530) {
                        var5--;
                        int var464 = field796[var5];
                        if (var464 < 0) {
                            var464 = 0;
                        }
                        client.field320 = var464;
                        continue;
                    }
                    if (var481 == 5531) {
                        field796[var5++] = client.field320;
                        continue;
                    }
                }
                if (var481 >= 5700 || var481 != 5630) {
                    if (var481 < 6300) {
                        if (var481 == 6200) {
                            var5 -= 2;
                            client.field278 = (short) field796[var5];
                            if (client.field278 <= 0) {
                                client.field278 = 256;
                            }
                            client.field531 = (short) field796[var5 + 1];
                            if (client.field531 <= 0) {
                                client.field531 = 205;
                            }
                            continue;
                        }
                        if (var481 == 6201) {
                            var5 -= 2;
                            client.field532 = (short) field796[var5];
                            if (client.field532 <= 0) {
                                client.field532 = 256;
                            }
                            client.field346 = (short) field796[var5 + 1];
                            if (client.field346 <= 0) {
                                client.field346 = 320;
                            }
                            continue;
                        }
                        if (var481 == 6202) {
                            var5 -= 4;
                            client.field470 = (short) field796[var5];
                            if (client.field470 <= 0) {
                                client.field470 = 1;
                            }
                            client.field448 = (short) field796[var5 + 1];
                            if (client.field448 <= 0) {
                                client.field448 = 32767;
                            } else if (client.field448 < client.field470) {
                                client.field448 = client.field470;
                            }
                            client.field536 = (short) field796[var5 + 2];
                            if (client.field536 <= 0) {
                                client.field536 = 1;
                            }
                            client.field537 = (short) field796[var5 + 3];
                            if (client.field537 <= 0) {
                                client.field537 = 32767;
                            } else if (client.field537 < client.field536) {
                                client.field537 = client.field536;
                            }
                            continue;
                        }
                        if (var481 == 6203) {
                            if (client.field347 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = -1;
                            } else {
                                client.method50(0, 0, client.field347.field2807, client.field347.field2796, false);
                                field796[var5++] = client.field513;
                                field796[var5++] = client.field489;
                            }
                            continue;
                        }
                        if (var481 == 6204) {
                            field796[var5++] = client.field532;
                            field796[var5++] = client.field346;
                            continue;
                        }
                        if (var481 == 6205) {
                            field796[var5++] = client.field278;
                            field796[var5++] = client.field531;
                            continue;
                        }
                    }
                    if (var481 < 6600) {
                        if (var481 == 6500) {
                            field796[var5++] = class26.method91() ? 1 : 0;
                            continue;
                        }
                        if (var481 == 6501) {
                            class26.field651 = 0;
                            class26 var465 = class26.method2949();
                            if (var465 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                            } else {
                                field796[var5++] = var465.field653;
                                field796[var5++] = var465.field641;
                                field792[var6++] = var465.field644;
                                field796[var5++] = var465.field645;
                                field796[var5++] = var465.field642;
                                field792[var6++] = var465.field636;
                            }
                            continue;
                        }
                        if (var481 == 6502) {
                            class26 var467 = class26.method2949();
                            if (var467 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                            } else {
                                field796[var5++] = var467.field653;
                                field796[var5++] = var467.field641;
                                field792[var6++] = var467.field644;
                                field796[var5++] = var467.field645;
                                field796[var5++] = var467.field642;
                                field792[var6++] = var467.field636;
                            }
                            continue;
                        }
                        if (var481 == 6506) {
                            var5--;
                            int var468 = field796[var5];
                            class26 var469 = null;
                            for (int var470 = 0; var470 < class26.field648; var470++) {
                                if (Statics.field638[var470].field653 == var468) {
                                    var469 = Statics.field638[var470];
                                    break;
                                }
                            }
                            if (var469 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field792[var6++] = "";
                            } else {
                                field796[var5++] = var469.field653;
                                field796[var5++] = var469.field641;
                                field792[var6++] = var469.field644;
                                field796[var5++] = var469.field645;
                                field796[var5++] = var469.field642;
                                field792[var6++] = var469.field636;
                            }
                            continue;
                        }
                        if (var481 == 6507) {
                            var5 -= 4;
                            int var471 = field796[var5];
                            boolean var472 = field796[var5 + 1] == 1;
                            int var473 = field796[var5 + 2];
                            boolean var474 = field796[var5 + 3] == 1;
                            if (Statics.field638 != null) {
                                class26.method642(0, Statics.field638.length - 1, var471, var472, var473, var474);
                            }
                            continue;
                        }
                        if (var481 == 6511) {
                            var5--;
                            int var475 = field796[var5];
                            if (var475 >= 0 && var475 < class26.field648) {
                                class26 var476 = Statics.field638[var475];
                                field796[var5++] = var476.field653;
                                field796[var5++] = var476.field641;
                                field792[var6++] = var476.field644;
                                field796[var5++] = var476.field645;
                                field796[var5++] = var476.field642;
                                field792[var6++] = var476.field636;
                                continue;
                            }
                            field796[var5++] = -1;
                            field796[var5++] = 0;
                            field792[var6++] = "";
                            field796[var5++] = 0;
                            field796[var5++] = 0;
                            field792[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field330 = 250;
            }
        } catch (Exception var480) {
            StringBuilder var478 = new StringBuilder(30);
            var478.append("").append(var4.field3113).append(" ");
            for (int var479 = field810 - 1; var479 >= 0; var479--) {
                var478.append("").append(field795[var479].field200.field3113).append(" ");
            }
            var478.append("").append(var10);
            class148.method2262(var478.toString(), var480);
        }
    }

    @ObfuscatedName("cs.e(II)V")
    public static void method1743(int arg0) {
        if (arg0 == -1 || !Statics.method2271(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2754[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2836 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field1 = var3.field2836;
                method2736(var4, 2000000);
            }
        }
    }
}
